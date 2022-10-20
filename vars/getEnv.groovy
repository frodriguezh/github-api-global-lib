def call(Map config = [:]){
 
  def envconfig = "resources/com/planetpope/envconfig.yaml"
  //String[] configvalues = ["serverurl","secretid","appsettings","appfolder","tmpfolder"]; 

  //def exists = fileExists envconfig

  //assert (exists): "\nErrores: No existe archivo de configuracion ${envconfig}"

  //def data = readYaml file: envconfig

  //for(int i in configvalues) { 
   //assert (data?.environment."${config.branchTarget}"."${i}"): "\nErrores: El archivo de configuracion ${envconfig} no tiene valor en el tag data.environment.${config.branchTarget}.${i}" 
  //} 

  env.SERVER_URL = data.environment."${config.branchTarget}".serverurl
  env.SECRET_ID = data.environment."${config.branchTarget}".secretid
  env.APP_SETTINGS = data.environment."${config.branchTarget}".appsettings
  env.APP_FOLDER = data.environment."${config.branchTarget}".appfolder
  env.TMP_FOLDER = data.environment."${config.branchTarget}".tmpfolder
 
}
