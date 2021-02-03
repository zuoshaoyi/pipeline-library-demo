#!/usr/bin/groovy
import com.cleverbuilder.JavaClass
import com.cleverbuilder.SampleClass
import groovy.json.*

def call(String name = 'human') {

    timeout(activity: false, time: 1, unit: 'HOURS') {

        echo "Hello, ${name}."

        def cc = new SampleClass()
//
        echo cc.myPrint(this)

        def ja = new JavaClass()
        ja.javaPrint()

        echo "end ..."
    }
}

