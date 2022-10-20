def call(Map config = [:]){
 
   sh '''
   
     dotnet restore
     dotnet publish -c release -o /"'''+config.nameFolder+'''" --no-restore
     
     if ! [ -e "/'''+config.nameFolder+'''" ]
     then 
          echo "\nErrores: No existe carpeta."
          exit 1
     fi

     if ! [ "$(ls -A "/'''+config.nameFolder+'''")" ]
     then 
          echo "\nErrores: Carpeta vacia."
          exit 1
     fi
     
   '''
 
}
