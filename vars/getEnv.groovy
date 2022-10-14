def call(Map config = [:]){
 
def envconfig = "resources/com/planetpope/envconfig.yaml"

def exists = fileExists envconfig

  if (exists) {

   def data = readYaml file: envconfig

   assert (data?.environment."${config.branchTarget}".serverurl): "\nErrores: El archivo de configuracion ${envconfig} no tiene valor en el tag data.environment.${config.branchTarget}.serverurl"
   assert (data?.environment."${config.branchTarget}".secretid): "\nErrores: El archivo de configuracion ${envconfig} no tiene valor en el tag data.environment.${config.branchTarget}.secretid"
   assert (data?.environment."${config.branchTarget}".appsettings): "\nErrores: El archivo de configuracion ${envconfig} no tiene valor en el tag data.environment.${config.branchTarget}.appsettings"
   assert (data?.environment."${config.branchTarget}".tmpfolder): "\nErrores: El archivo de configuracion ${envconfig} no tiene valor en el tag data.environment.${config.branchTarget}.idsecret"
   
   env.SERVER_URL = data.environment."${config.branchTarget}".serverurl
   env.SECRET_ID = data.environment."${config.branchTarget}".secretid
   env.APP_SETTINGS = data.environment."${config.branchTarget}".appsettings
   env.TMP_FOLDER = data.environment."${config.branchTarget}".tmpfolder
 
   println env.SERVER_URL

  } else {

    echo "\nErrores: No existe archivo de configuracion ${envconfig}"
    sh 'exit 1;'

  }

 
}
