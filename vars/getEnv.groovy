def call(Map config = [:]){
 
def envconfig = "resources/com/planetpope/envconfig.yaml"

def exists = fileExists envconfig

if (exists) {
 
 def data = readYaml file: envconfig
 
 if (data?.environment) {
  
  env.URL_SERVER = data.environment."${config.branchTarget}".urlserver
  env.ID_SECRET = data.environment."${config.branchTarget}".idsecret
  
  println env.URL_SERVER
  println env.ID_SECRET
  
  if (env.URL_SERVER || env.ID_SECRET){
   
     echo "El archivo de configuracion ${envconfig} no tiene datos para el ambiente data.environment.${config.branchTarget}"
     sh 'exit 1;'
   
  }
   
   println env.URL_SERVER
   println env.ID_SECRET

 }
 else{
  
  echo "El archivo de configuracion ${envconfig} esta tiene ambientes declarados"
  sh 'exit 1;'
  
 }
 
} else {

  echo "No existe archivo de configuracion ${envconfig}"
  sh 'exit 1;'
 
}


 //assert env.URL_SERVER != "wngplgmaappwd00.itauchile.cl" : "**********************El DNS es igual a wngplgmaappwd00.itauchile.cl**********************"
 
}
