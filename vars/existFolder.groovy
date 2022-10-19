import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

def call(Map config = [:]){
 
   sh '''
   
     dotnet restore
     dotnet publish -c release -o /"'''+config.nameFolder+'''" --no-restore
     
   '''
 
   //def exists = fileExists "/GEMA_NUBE"

   //assert (exists): "\nErrores: No existe archivo de configuracion"
   def path = "GEMA_NUBE"
 
   if (Files.exists(path)) {
        if (Files.isDirectory(path)) {
            println "SIIIIIIIIexiste carpeta"
        } else{ 
            println "NOOOOO existe carpeta"
        }

    }
  
}
