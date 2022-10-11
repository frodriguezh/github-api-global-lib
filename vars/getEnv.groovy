def call(){
 
 def data = readYaml file: "resources/com/planetpope/envconfig.yaml"

 println data.environment.development.urlserver
 println data.environment.development.idsecret
 
}

