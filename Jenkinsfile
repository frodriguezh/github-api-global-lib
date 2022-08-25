@Library("shared-library") _
pipeline {
  agent any
  stages {
    stage('Even Stage') {
      steps {
        helloWorldExternal(name:"Fernando", dayOfWeek:"Jueves")
      }
    }
  }
}
