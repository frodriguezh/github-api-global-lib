def call(Map config = [:]){
 
  def exists = fileExists config.nameFolder

  assert (exists): "\nErrores: No existe archivo de configuracion ${envconfig}"
  
}
