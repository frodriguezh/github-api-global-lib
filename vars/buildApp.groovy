def call(Map config = [:]){
 
   sh '''
   
     dotnet restore
     dotnet publish -c release -o /"'''+config.appFolder+'''" --no-restore
     
     if ! [ -e "/'''+config.appFolder+'''" ]
     then 
          echo "\nErrores: No existe carpeta."
          exit 1
     fi

     if ! [ "$(ls -A "/'''+config.appFolder+'''")" ]
     then 
          echo "\nErrores: Carpeta vacia."
          exit 1
     fi
     
   '''
 
}
