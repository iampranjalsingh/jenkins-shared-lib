#!/usr/bin/env groovy
import com.localhost.swb.IniParser
import com.cloudbees.groovy.cps.NonCPS

def call(Map config = [:]) {
    if (!config.isEmpty() && config.containsKey("configFile")) {
        configFile = "${config.configFile}"
    }
     def configContents = libraryResource "globalConfig.ini"
     // println "${configContents}"
     writeFile file: "GLOBAL_CONFIG.ini", text: "${configContents}"
    readConfig("${env.WORKSPACE}/GLOBAL_CONFIG.ini")
}

@NonCPS
def readConfig(String fileToRead) {
    def ini = new IniParser("${fileToRead}")
    ini.dumpConfig()
    def secs = ini.getAllSections()
    secs.each() { it ->
        println it
    }
}