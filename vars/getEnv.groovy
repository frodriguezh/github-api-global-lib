import groovy.yaml.YamlSlurper

def call (){
  
    def exampleYaml = '''\
    ---
    - subject: "maths"
    - subject: "chemistry"
    '''
    
  println exampleYaml
}
