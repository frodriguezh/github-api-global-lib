def call(Map config = [:]){
 
   sh '''
   
     dotnet restore
     dotnet publish -c release -o /"'''+config.nameFolder+'''" --no-restore
     
   '''
 
   def exists = fileExists config.nameFolder

   assert (exists): "\nErrores: No existe archivo de configuracion"
  
}
