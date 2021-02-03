#!/usr/bin/groovy
import com.cleverbuilder.SampleClass
import com.zuo.test.JavaTest
import groovy.json.*

def call(String name = 'human') {

    timeout(activity: false, time: 1, unit: 'HOURS') {

        echo "Hello, ${name}."

        def cc = new SampleClass()
//
        cc.myPrint(this)

//        def ja = new com.cleverbuilder.JavaClass()
//        ja.javaPrint()

        def test = new JavaTest()
        test.javaPrint()


        echo "end ..."
    }
}

