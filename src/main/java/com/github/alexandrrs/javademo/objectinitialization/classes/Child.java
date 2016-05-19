package com.github.alexandrrs.javademo.objectinitialization.classes;

/**
 * Created by alexandr
 * since 19.05.16 22:51
 */
public class Child extends SuperClass {
    Field field = new Field("Child Field constructor");
    static Field staticField = new Field("Child static Field constructor");

    public Child() {
        System.out.println("Child constructor");
        method("from Child constructor");

    }

    @Override
    public void method(String str) {
        System.out.println("Child method " + str);
    }
}