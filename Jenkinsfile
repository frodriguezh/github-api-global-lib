@Library("libreriacompartida") _

pipeline {
  agent any
  environment{
    URL_SERVER = 'development'
  }
  stages {
    stage('Even Stage') {
      steps {
        //helloWorldExternal(name:"Fernando", dayOfWeek:"Jueves")
        getEnv(branchTarget: "production")
      }
    }
  }
}
