def call(Map config = [:]){
 
  sh '''

    zip -r GEMA_NUBE_${BUILD_NUMBER}.zip /"'''+config.nameFolder+'''"

  '''

  def exists = fileExists "GEMA_NUBE_${BUILD_NUMBER}.zip"

  assert (exists): "\nErrores: No existe el archivo de zip GEMA_NUBE_${BUILD_NUMBER}.zip"
 
  println file.length()
 
}
