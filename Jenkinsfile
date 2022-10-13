@Library("libreriacompartida") _

//def repoUrl = 'http://gitlab.itauchile.cl/gobierno-compartido/planificacion-financiera/gema-cloud-net-core.git'
env.repoBranchTarget = 'production'
env.gitlabAction = 'crearmr'

pipeline {
     agent {
        docker { image 'netcorev6:latest'}
    }
    stages {
        stage('Download Code') {
            steps {
                echo "Clonar Codigo"
                //getSourceCode(repoUrl,repoBranchTarget)
                //getSourceCode(repoUrl,"develop")
            }
        }
        stage('Test Code SonarQube') {
            when { expression { env.repoBranchTarget == 'development' && env.gitlabAction == 'crearmr' } }
            steps {
               //echo "Test Code SonarQube"
               sonarQubeTest()
            }
        }
        stage('Get Env') {
            steps {
                echo "Get Env"
                //getEnv(branchTarget: repoBranchTarget)
            }
        }
        stage('Get Secrets') {
            steps {
                echo "Get Secrets"
               //getSecretAws()
          
            }
        }
        stage('Build') {
            steps {
               echo "Construir APP"
               //sh "dotnet restore"
               //sh "dotnet publish -c ${env.APP_SETTINGS} -o /GEMA_NUBE --no-restore"
            }
        }
        stage('Package'){
            steps {
               echo "Generar Package" 
               //sh "zip -r GEMA_NUBE_${BUILD_NUMBER}.zip /GEMA_NUBE"
                
            }
            
        }
        stage('Move Package'){
             steps {
               echo "Mover Zip"     
               //moveZipSSH(file: "GEMA_NUBE_${BUILD_NUMBER}.zip")
   
             }
        }
        stage('Backup APP'){
             steps {
                    echo "Backup APP"      
             }
        }
    }
}
