def call(Map config = [:]){
 
 def data = readYaml file: "resources/com/planetpope/envconfig.yaml"

 println config.branchTarget
 println data.environment.development.urlserver
 println "data.environment.development.idsecret
 
}

