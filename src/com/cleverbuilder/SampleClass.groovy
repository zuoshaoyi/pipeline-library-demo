#!/usr/bin/groovy
package com.cleverbuilder

import groovy.json.*

class SampleClass {
    String name
    Integer age

    def increaseAge(Integer years) {
        this.age += years
    }

    def myPrint(mt) {
        def res = "echo jenkins myPrint !!!".execute()
        println res.text

        println "groovy print !!! "

        mt.print "jenkins envs print 。。。"

        def envs = mt.env

//        def json = JsonOutput.toJson(envs)

        mt.print envs.getClass()

//        def jdata = JsonOutput.toJson(mt)
//        return jdata
    }
}
