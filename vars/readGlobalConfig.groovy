#!/usr/bin/env groovy

def call(Map config = [:]) {
    def conf = readProperties file: "configJenkins.ini"
    println "${conf}"
    /*def configContents = libraryResource "globalConfig.ini"
    writeFile file: "GLOBAL_CONFIG.ini", text: "${configContents}"
    readConfig("${env.WORKSPACE}/GLOBAL_CONFIG.ini")*/
}