#!/usr/bin/groovy
package com.cleverbuilder

import groovy.json.*

class SampleClass {
    String name
    Integer age

    def increaseAge(Integer years) {
        this.age += years
    }

    def myPrint() {
        sh "echo jenkins myPrint !!!"

        println "groovy print !!! "

//        def jdata = JsonOutput.toJson(mt)
//        return jdata
    }
}
