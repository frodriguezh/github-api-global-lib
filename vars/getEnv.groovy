import groovy.yaml.YamlSlurper

def call (){
  
    def exampleYaml = '''\
    ---
    - subject: "maths"
    - subject: "chemistry"
    '''
    
    List example = new YamlSlurper().parseText(exampleYaml)
//If your source is a File
//    List example = new YamlSlurper().parse("example.yaml" as File)
    
    example.each{println it.subject}
}
