def call(Map config = [:]){
 
 
 def data = readYaml file: "resources/com/planetpope/envconfig2.yaml"

 env.URL_SERVER = data.environment."${config.branchTarget}".urlserver
 env.ID_SECRET = data.environment."${config.branchTarget}".idsecret
 
 assert env.URL_SERVER != null : "errorrrrrrr"
 
}
