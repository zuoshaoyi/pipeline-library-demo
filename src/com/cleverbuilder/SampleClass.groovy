#!/usr/bin/groovy
package com.cleverbuilder

import com.google.gson.Gson
import groovy.json.*
import org.jenkinsci.plugins.workflow.cps.EnvActionImpl

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

        mt.print mt.env

        def envImpl = (EnvActionImpl) mt.env

        mt.print mt.env.Zuo.getClass()

        mt.print envImpl.getProperty("Zuo")

        mt.env.getEnvironment().each { name, value -> println "Name: $name -> Value $value" }

//        def jdata = JsonOutput.toJson(mt)
//        return jdata
    }
}
