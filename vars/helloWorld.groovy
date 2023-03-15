#!/usr/bin/env groovy

def call(Map config = [:]) {
    bat "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}
return this
