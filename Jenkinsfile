@Library("libreriacompartida") _

//def repoUrl = 'http://gitlab.itauchile.cl/gobierno-compartido/planificacion-financiera/gema-cloud-net-core.git'
def repoBranchTarget = 'development'

pipeline {
     agent {
        docker { image 'netcorev6:latest' }
    }
    stages {
        stage('Get Env') {
            steps {
                echo "Get Env"
                //getEnv(branchTarget: repoBranchTarget)
            }
        }
        stage('Get Secrets') {
            steps {
                container('netcore') {
                    echo "Get Secrets"
                    //getSecretAws()
                }
            }
        }
        stage('Download Code') {
            steps {
                echo "Clonar Codigo"
                //getSourceCode(repoUrl,repoBranchTarget)
                //getSourceCode(repoUrl,"develop")
            }
        }
        stage('Build') {
            steps {
                container('netcore') {
                    echo "Construir APP"
                    //sh "dotnet restore"
                    //sh "dotnet publish -c ${env.APP_SETTINGS} -o /GEMA_NUBE --no-restore"
                }
            }
        }
        stage('Package'){
            steps {
                container('netcore') {
                    echo "Generar Package" 
                    //sh "zip -r GEMA_NUBE_${BUILD_NUMBER}.zip /GEMA_NUBE"
                }
            }
            
        }
        stage('Move Package'){
             steps {
                container('netcore') { 
                    echo "Mover Zip"     
                    //moveZipSSH(file: "GEMA_NUBE_${BUILD_NUMBER}.zip")
                    
                    
                }
             }
        }
        stage('Backup APP'){
             steps {
                container('netcore') { 
                    echo "Backup APP"      
                }
             }
        }
    }
}
