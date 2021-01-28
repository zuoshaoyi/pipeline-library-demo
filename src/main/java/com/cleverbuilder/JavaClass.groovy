package com.cleverbuilder;

public class JavaClass {

    public void javaPrint() {
        System.out.println("Java 输出");

        int res = 0;
        for (int i = 0; i < 10; i++) {
            res += i;
        }
        System.out.println(res);
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
