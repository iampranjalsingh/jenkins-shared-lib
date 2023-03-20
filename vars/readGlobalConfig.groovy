#!/usr/bin/env groovy

def call(String filePath="configJenkins.ini") {
    def fileContents = libraryResource 'globalConfig.ini'
    def props = readProperties(text:fileContents)
    if (!filePath.isEmpty()) {
        def fileExist = findFiles (glob: filePath)
        println "${fileExist}"
        /*if (fileExist == 1) {
            def  map = readProperties file: filePath
            props.putAll(map)
        }*/
    }
    return props
}