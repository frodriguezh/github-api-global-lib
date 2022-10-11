def call(String branchTarget){
 
 def data = readYaml file: "resources/com/planetpope/envconfig.yaml"

 println "data.environment.${branchTarget}.urlserver"
 println "data.environment.${branchTarget}.idsecret"
 
}

