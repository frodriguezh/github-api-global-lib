def call(Map config = [:]) {
    //loadLinuxScript(name: 'hello-world.sh')
    //sh "./hello-world.sh ${config.name} ${config.dayOfWeek}"
    //sh "./hello-world.sh ${config.name}"
   //def dir = readFile("${WORKSPACE}/Jenkinsfile");
   //println fileExists dir
   def exists = fileExists "${WORKSPACE}/Jenkinsfile333"

    if (exists) {
        echo 'Yes'
    } else {
        echo 'No'
    }
}
