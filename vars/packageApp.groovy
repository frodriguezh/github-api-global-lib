import java.util.zip.*;
def call(Map config = [:]){
 
  sh '''

    zip -r GEMA_NUBE_${BUILD_NUMBER}.zip /"'''+config.nameFolder+'''"

  '''

  def exists = fileExists "GEMA_NUBE_${BUILD_NUMBER}.zip"

  assert (exists): "\nErrores: No existe el archivo zip GEMA_NUBE_${BUILD_NUMBER}.zip"
 
  String zipFileName = "GEMA_NUBE_${BUILD_NUMBER}.zip"
  def zip = new ZipFile(new File(zipFileName))
 
  //assert (file.size()): "\nErrores: El archivo zip GEMA_NUBE_${BUILD_NUMBER}.zip tiene un peso igual a cero"
 
}
