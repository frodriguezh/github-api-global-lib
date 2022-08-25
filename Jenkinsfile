properties([parameters([string(name: 'LIB_VERSION', defaultValue: 'dev')])])
library "shared-library@${params.LIB_VERSION}"

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
