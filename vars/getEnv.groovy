
def call(){
 
 import groovy.yaml.YamlSlurper
 
 def datas = readYaml text: """
something: 'my datas'
size: 3
isEmpty: false
"""
 println datas.something
 println datas.size
 println datas.isEmpty
 
}

