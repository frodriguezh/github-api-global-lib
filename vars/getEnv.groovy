def call(Map config = [:]){
 
def envconfig = "resources/com/planetpope/envconfig.yaml"

def exists = fileExists envconfig

if (exists) {
 
  //echo 'existe archivo'
  //sh 'exit 0;'
  def data = readYaml file: envconfig
  println data.size

  env.URL_SERVER = data.environment."${config.branchTarget}".urlserver
  env.ID_SECRET = data.environment."${config.branchTarget}".idsecret

  println env.URL_SERVER
  println env.ID_SECRET
 
} else {

  echo "No existe archivo de configuracion ${envconfig}"
  sh 'exit 1;'
 
}


 //assert env.URL_SERVER != "wngplgmaappwd00.itauchile.cl" : "**********************El DNS es igual a wngplgmaappwd00.itauchile.cl**********************"
 
}
