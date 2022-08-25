@Library("shared-library$BRANCH_NAME") _
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
