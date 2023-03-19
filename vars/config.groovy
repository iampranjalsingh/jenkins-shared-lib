#!/usr/bin/env groovy

def call(String filePath, Closure closure) {
    def request = libraryResource 'globalConfig.ini'
    // def config = readProperties file:"globalConfig.ini"
    println "$request"
    def map = readProperties text: request
    println "$map"

    if (!filePath.isEmpty()) {
        def file_exist = findFiles (glob: filePath)
        if (filePath.length == 1) {
            def  map1 = readYaml file: filePath
            println map1
            map.putAll(map1)
        }
    }
}

def call(Closure closure) {
    call('', closure)
}