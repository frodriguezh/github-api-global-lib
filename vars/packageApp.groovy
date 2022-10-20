def call(Map config = [:]){
 
   sh '''
   
     zip -r GEMA_NUBE_${BUILD_NUMBER}.zip /"'''+config.nameFolder+'''"
    
   '''
 
}
