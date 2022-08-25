@Library("shared-library@dev") _
pipeline {
  agent any
  stages {
    stage('Even Stage') {
      steps {
        helloWorldExternal(name:"Fernando", dayOfWeek:"Jueves")
      }
    }
    stage('Final stage'){
      steps {
        echo "${env.BRANCH_NAME}"
        checkout scm
      }
    }
  }
}
