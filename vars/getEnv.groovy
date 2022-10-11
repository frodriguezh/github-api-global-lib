def call(){
 
 def datas = readYaml file: "com/planetpope/envconfig.yaml"

 println datas.environment

}

