def call(Map config = [:]){
 
def envconfig = "resources/com/planetpope/envconfig.yaml"

def exists = fileExists envconfig

if (exists) {
 
 def data = readYaml file: envconfig
 
 if (data?.environment) {
  
  assert (data?.environment."${config.branchTarget}".urlserver): "\nError: El archivo de configuracion ${envconfig} no contiene el tag data.environment.${config.branchTarget}.urlserver"
  assert (data?.environment."${config.branchTarget}".idsecret): "\nError: El archivo de configuracion ${envconfig} no contiene el tag data.environment.${config.branchTarget}.idsecret"
  
  env.URL_SERVER = data.environment."${config.branchTarget}".urlserver
  env.ID_SECRET = data.environment."${config.branchTarget}".idsecret
  
  println env.URL_SERVER
  println env.ID_SECRET

 }
 else{
  
  echo "\nError: El archivo de configuracion ${envconfig} no tiene ambientes declarados"
  sh 'exit 1;'
  
 }
 
} else {

  echo "\nError: No existe archivo de configuracion ${envconfig}"
  sh 'exit 1;'
 
}

 
}
