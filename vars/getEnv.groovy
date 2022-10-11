def call(){
 
 def datas = readYaml file: "resources/com/planetpope/envconfig.yaml"

 println datas.environment

}

