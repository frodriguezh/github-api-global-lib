@Library("libreriacompartida") _

pipeline {
  agent any
  stages {
    stage('Even Stage') {
      steps {
        //helloWorldExternal(name:"Fernando", dayOfWeek:"Jueves")
        getEnv(branchTarget: "development")
        println "${env.URL_SERVER}"
      }
    }
    stage('Even Stage DOS') {
      steps {
        println "${env.ID_SECRET}"
      }
    }
  }
}
