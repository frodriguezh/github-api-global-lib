def $BRANCH_NAME = scm.branches[0].name.split("/")[1]
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
        echo $BRANCH_NAME
      }
    }
  }
}
