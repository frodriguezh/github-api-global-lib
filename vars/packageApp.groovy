import java.util.zip.*;
def call(Map config = [:]){
 
  sh '''

    zip -r GEMA_NUBE_${BUILD_NUMBER}.zip /"'''+config.nameFolder+'''"

  '''

  def exists = fileExists "GEMA_NUBE_${BUILD_NUMBER}.zip"

  assert (exists): "\nErrores: No existe el archivo zip GEMA_NUBE_${BUILD_NUMBER}.zip"
 
  ZipFile zipFile = new ZipFile("${WORKSPACE}/GEMA_NUBE_${BUILD_NUMBER}.zip")
 
  assert (zipFile.size() > 1): "\nErrores: El archivo zip GEMA_NUBE_${BUILD_NUMBER}.zip tiene un peso <= a 1MB"
 

}
