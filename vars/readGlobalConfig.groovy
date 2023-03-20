#!/usr/bin/env groovy

def call(Map config = [:] as Map) {
    def fileContents = libraryResource 'globalConfig.ini'
    def props = readProperties(text:fileContents)
    if (!config.isEmpty() && config.containsKey("configFile")) {
        configFile = "${config.configFile}"
        def fileExist = findFiles (glob: configFile)
        if (fileExist.length == 1) {
            def  map = readProperties(file: filePath)
            props.putAll(map)
        }
    }
    return props
}