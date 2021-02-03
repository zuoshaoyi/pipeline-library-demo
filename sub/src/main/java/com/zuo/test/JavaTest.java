package com.zuo.test;

public class JavaTest {

    private String name;

    public JavaTest(String name) {
        this.name = name;
    }

    public void javaPrint() {
        System.out.println("Java 输出" + name);

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
