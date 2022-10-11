def call(Map config = [:]){
 
 def data = readYaml file: "resources/com/planetpope/envconfig.yaml"

 //println data.environment."${config.branchTarget}".urlserver
 //println data.environment."${config.branchTarget}".idsecret
 
 env.URL_SERVER = data.environment."${config.branchTarget}".urlserver
 env.ID_SECRET = data.environment."${config.branchTarget}".idsecret

}

