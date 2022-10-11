import groovy.yaml.YamlSlurper

List example = new YamlSlurper().parse("envconfig.yaml" as File)
    
example.each{println it.environment}
