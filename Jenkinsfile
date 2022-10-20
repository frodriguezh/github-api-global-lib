@Library("libreriacompartida") _

env.repoBranchTarget = 'development'
//env.repoBranchTarget = 'quality'
//env.repoBranchTarget = 'production'

//env.gitlabAction = 'crearmr'
env.gitlabAction = 'merge'

pipeline {
     agent {
        docker { image 'netcorev6:latest'}
    }
    stages {
        stage('Get Env') {
            when { expression { env.gitlabAction == 'merge' } }
            steps {
                echo "Get Env"
                getEnv(branchTarget: env.repoBranchTarget)
            }
        }
        stage('Download Code') {
            steps {
                //echo "Clonar Codigo"
                //getSourceCode(repoUrl,repoBranchTarget)
                //getSourceCode(repoUrl,"develop")
                git branch: 'main', url: 'https://github.com/frodriguezh/Prueba-Docker.git'
            }
        }
        stage('Test Code SonarQube') {
            when { expression { env.repoBranchTarget == 'development' && env.gitlabAction == 'crearmr' } }
            steps {
               echo "Test Code SonarQube"
               //sonarQubeTest()
            }
        }
        stage('Build') {
            when { expression { env.gitlabAction == 'merge' } }
            steps {
               echo "Build"
               buildApp(appFolder: env.APP_FOLDER)
            }
        }
        stage('Package'){
            when { 
                 expression { env.gitlabAction == 'merge' }
            }
            steps {
               echo "Generar Package" 
               //sh "zip -r GEMA_NUBE_${BUILD_NUMBER}.zip /${env.APP_FOLDER}"
               packageApp(appFolder: env.APP_FOLDER)
                
            }
            
        }
        stage('Get Secrets') {
            when { expression { env.gitlabAction == 'merge' } }
            steps {
                echo "Get Secrets"
               //getSecretAws()
          
            }
        }
        stage('Move Package'){
              when { 
                   expression { env.gitlabAction == 'merge' }
                   //expression { return fileExists ('Jenkinsfile') }
             }
             steps {
               echo "Mover Zip"     
               //moveZipSSH(file: "GEMA_NUBE_${BUILD_NUMBER}.zip")
   
             }
        }
        stage('Backup APP'){
             when { expression { env.gitlabAction == 'merge' } }
             steps {
                    echo "Backup APP"      
             }
        }
    }
     post { 
        always { 
            //cleanWs()
            echo 'limpio'
        }
    }
}
