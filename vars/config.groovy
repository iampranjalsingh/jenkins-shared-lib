#!/usr/bin/env groovy
import com.localhost.swb.IniParser
import com.cloudbees.groovy.cps.NonCPS

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
//    def ini = new IniParser('globalConfig.ini')
//    ini.dumpConfig()
//    def secs = ini.getAllSections()
//    secs.each() { it ->
//        println it
//    }
    def config = readProperties file:"globalConfig.ini"
    println(config)
    println("**********************")
}