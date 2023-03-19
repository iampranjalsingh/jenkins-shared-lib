#!/usr/bin/env groovy
import com.localhost.swb.IniParser

def call(String filePath, Closure closure) {
    readConfig()
    /*if (!filePath.isEmpty()) {
        def file_exist = findFiles (glob: filePath)
        if (filePath.length == 1) {
            def  map1 = readYaml file: filePath
            println map1
            map.putAll(map1)
        }
    }*/
}

def call(Closure closure) {
    call('', closure)
}


def readConfig() {
    def config = libraryResource 'globalConfig.ini'
    println "$config"
    /*def ini = new IniParser('resources/globalConfig.ini')
    ini.dumpConfig()
    def secs = ini.getAllSections()
    secs.each() { it ->
        println it
    }*/
}