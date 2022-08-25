def BRANCH_NAME = scm.branches[0].name.split("/")[1]
library "shared-library@${BRANCH_NAME}"
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
Footer
