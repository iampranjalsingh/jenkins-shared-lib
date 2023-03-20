#!/usr/bin/env groovy

def call(Map config = [:] as Map) {

    def request = libraryResource 'configJenkins.ini'
    println "$request"

    def properties = readProperties file:"configJenkins.ini"
    println "${conf}"
    /*def configContents = libraryResource "globalConfig.ini"
    writeFile file: "GLOBAL_CONFIG.ini", text: "${configContents}"
    readConfig("${env.WORKSPACE}/GLOBAL_CONFIG.ini")*/
}