@Library("libreriacompartida") _

pipeline {
  agent any
  environment{
    URL_SERVER = 'development'
  }
  stages {
    stage('Even Stage') {
      steps {
        println "${URL_SERVER}"
        //helloWorldExternal(name:"Fernando", dayOfWeek:"Jueves")
        getEnv(branchTarget: "production")
        println "${URL_SERVER}"
      }
    }
  }
}
