def call(Map config = [:]){
 
   sh '''
   
     dotnet restore
     dotnet publish -c release -o "'''+config.nameFolder+'''" --no-restore
     
     if ! [ -e "'''+config.nameFolder+'''" ]
     then 
          echo "No existe carpeta"
          exit 1
     fi

     if ! [ "$(ls -A "'''+config.nameFolder+'''")" ]
     then 
          echo "Carpeta vacia"
          exit 1
     fi
     
   '''
 
   //def exists = fileExists "/GEMA_NUBE"

   //assert (exists): "\nErrores: No existe archivo de configuracion"
  
}
