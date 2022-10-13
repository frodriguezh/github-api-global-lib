import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

def call(Map config = [:]){
 
def envconfig = "resources/com/planetpope/envconfig.yaml"

def exists = fileExists envconfig

if (exists) {
 
 def lines = readFile.readFileInList(envconfig)
 
 println lines.size()
 
 def data = readYaml file: envconfig
 
 if (data.size > 0) {
  
  env.URL_SERVER = data.environment."${config.branchTarget}".urlserver
  env.ID_SECRET = data.environment."${config.branchTarget}".idsecret
    
  println env.URL_SERVER
  println env.ID_SECRET
  
   //echo 'existe archivo'
  //sh 'exit 0;'
  

 }
 else{
  
  echo "El archivo de configuracion ${envconfig} esta en blanco"
  sh 'exit 1;'
  
 }
 
} else {

  echo "No existe archivo de configuracion ${envconfig}"
  sh 'exit 1;'
 
}


 //assert env.URL_SERVER != "wngplgmaappwd00.itauchile.cl" : "**********************El DNS es igual a wngplgmaappwd00.itauchile.cl**********************"
 
}
