package com.cleverbuilder;

public class JavaClass {

    public void javaPrint() {
        System.out.println("Java 输出");

        int res =0;
        for(int i =0;i<Integer.MAX_VALUE;i++){
            res+=i;
        }
        System.out.println(res);
        Thread.sleep(30000);
    }
}
