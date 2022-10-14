def call(Map config = [:]){
 
def envconfig = "resources/com/planetpope/envconfig.yaml"

def exists = fileExists envconfig

  if (exists) {

   def data = readYaml file: envconfig

   assert (data?.environment."${config.branchTarget}".urlserver): "\nErrores: El archivo de configuracion ${envconfig} no tiene valor en el tag data.environment.${config.branchTarget}.urlserver"
   assert (data?.environment."${config.branchTarget}".idsecret): "\nErrores: El archivo de configuracion ${envconfig} no tiene valor en el tag data.environment.${config.branchTarget}.idsecret"

   env.URL_SERVER = data.environment."${config.branchTarget}".urlserver
   env.ID_SECRET = data.environment."${config.branchTarget}".idsecret

  } else {

    echo "\nErrores: No existe archivo de configuracion ${envconfig}"
    sh 'exit 1;'

  }

 
}
