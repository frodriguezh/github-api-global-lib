def call(Map config = [:]){
 
   sh '''
   
     dotnet restore
     dotnet publish -c release -o /"'''+config.nameFolder+'''" --no-restore
     
   '''
 
   String path= "/GEMA_NUBE33";    
   File file = new File(path);
 
   if (!file.exists()) {
        System.out.print("No Folder");
        file.mkdir();
        System.out.print("Folder created");
    }
   //def exists = fileExists "GEMA_NUBE"

   //assert (exists): "\nErrores: No existe archivo de configuracion"
  
}
