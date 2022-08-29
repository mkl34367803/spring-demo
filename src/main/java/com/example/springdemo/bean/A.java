package com.example.springdemo.bean;

import org.springframework.beans.factory.FactoryBean;

public class A implements FactoryBean<A> {

    @Override
    public A getObject() throws Exception {
        return new A();
    }

    @Override
    public Class<?> getObjectType() {
        return A.class;
    }
}
