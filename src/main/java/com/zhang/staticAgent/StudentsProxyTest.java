package com.zhang.staticAgent;

public class StudentsProxyTest {
    public static void main(String[] args) {

        Person zhangsan = new Student("张三");

        Person monitor = new StudentsProxy(zhangsan);

        monitor.giveMoney();

    }
}
