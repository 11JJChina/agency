package com.zhang.dynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {

        Person zhangsan = new Student("张三");

        InvocationHandler stuHandle = new StuInvocationHandler<Person>(zhangsan);

        Person proxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class}, stuHandle);

        proxy.giveMoney();

    }

}
