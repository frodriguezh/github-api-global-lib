def call(Map config = [:]){
 
 
 def data = readYaml file: "resources/com/planetpope/envconfig.yaml"

 env.URL_SERVER = data.environment."${config.branchTarget}".urlserver
 env.ID_SECRET = data.environment."${config.branchTarget}".idsecret
 
 assert 4 * ( 2 + 3 ) - 5 == 14 : "test failed"
 
}
