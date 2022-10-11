def call(Map config = [:]){
 
 def data = readYaml file: "resources/com/planetpope/envconfig.yaml"

 println data.environment."${config.branchTarget}".urlserver
 println data.environment."${config.branchTarget}".idsecret
 
}

