def call(Map config = [:]){
 
   sh '''
   
     dotnet restore
     dotnet publish -c release -o /"'''+config.nameFolder+'''" --no-restore
     
   '''
 
   //def exists = fileExists "/GEMA_NUBE"

   //assert (exists): "\nErrores: No existe archivo de configuracion"
   def folder = new File( '/GEMA_NUBE33' )

   if( !folder.exists() ) {
     println "No existe"
   }else{
    println "Siiiiiiiiiiiiii existe"
   }
  
}
