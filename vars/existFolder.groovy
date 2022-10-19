def call(Map config = [:]){
 
   sh '''
   
     dotnet restore
     dotnet publish -c release -o /GEMA_NUBE --no-restore
     
   '''
 
   //def exists = fileExists config.nameFolder

   //assert (exists): "\nErrores: No existe archivo de configuracion"
  
}
