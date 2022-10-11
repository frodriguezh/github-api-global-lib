import groovy.yaml.YamlSlurper
import groovy.io.FileType
import java.io.File
import groovy.yaml.YamlBuilder

def configYaml = '''\
---
application: "Sample App"
users:
- name: "mrhaki"
  likes:
  - Groovy
  - Clojure
  - Java
- name: "Hubert"
  likes:
  - Apples
  - Bananas
connections:
- "WS1"
- "WS2"
'''

// Parse the YAML.
def config = new YamlSlurper().parseText(configYaml)
