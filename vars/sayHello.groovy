#!/usr/bin/groovy
import com.cleverbuilder.*

def call(String name = 'human') {

    timeout(activity: false, time: 1, unit: 'HOURS') {

        echo "Hello, ${name}."

        def cc = new SampleClass()
//
        cc.myPrint(this)

        def loader = this.class.getClassLoader()

        while (loader != null) {
            println(loader.toString())
            loader = loader.getParent()
        }

//        def ja = new JavaClass()
//        ja.javaPrint()


//        def instance = Class.forName("com.zuo.JavaClass").newInstance()
//        instance.javaPrint()
//        def test = new JavaTest()
//        test.javaPrint()


        echo "end ..."
    }
}

