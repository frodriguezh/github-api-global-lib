def call(Map config = [:]){
 
 sh "exit 1"
 
 def data = readYaml file: "resources/com/planetpope/envconfig.yaml"

 env.URL_SERVER = data.environment."${config.branchTarget}".urlserver
 env.ID_SECRET = data.environment."${config.branchTarget}".idsecret
 
}

