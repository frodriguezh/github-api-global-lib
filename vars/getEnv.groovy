def call(Map config = [:]){
 
 def envconfig = "resources/com/planetpope/envconfig.yaml"
 
 def exists = fileExists envconfig
 if (exists) {
       echo 'existe archivo'
       sh 'exit 0;'
   } else {
       echo 'no existe archivo'
       sh 'exit 1;'
   }

 def data = readYaml file: envconfig

 env.URL_SERVER = data.environment."${config.branchTarget}".urlserver
 env.ID_SECRET = data.environment."${config.branchTarget}".idsecret
 
 println env.URL_SERVER
 println env.ID_SECRET
 //assert env.URL_SERVER != "wngplgmaappwd00.itauchile.cl" : "**********************El DNS es igual a wngplgmaappwd00.itauchile.cl**********************"
 
}
