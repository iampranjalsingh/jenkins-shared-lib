#!/usr/bin/env groovy
import com.localhost.swb.IniParser

def call(Map config = [:]) {
    def configContents = libraryResource "globalConfig.ini"
    if (!config.isEmpty() && config.containsKey("configFile")) {
        configFile = "${config.configFile}"
    }
    // println "${configContents}"
    writeFile file: "GLOBAL_CONFIG.ini", text: configContents

    def ini = new IniParser("./GLOBAL_CONFIG.ini")
    ini.dumpConfig()
    def secs = ini.getAllSections()
    secs.each() { it ->
        println it
    }
}
