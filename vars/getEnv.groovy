def call(Map config = [:]){
 
 def data = readYaml file: "resources/com/planetpope/envconfig.yaml"

 println config.branchTarget
 println data.environment."${config.branchTarget}".urlserver
 println data.environment.development.idsecret
 
}

