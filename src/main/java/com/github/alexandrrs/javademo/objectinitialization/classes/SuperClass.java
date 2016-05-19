package com.github.alexandrrs.javademo.objectinitialization.classes;

/**
 * Created by alexandr
 * since 19.05.16 22:50
 */
public class SuperClass {
    Field field = new Field("SuperClass Field constructor");
    static Field staticField = new Field("SuperClass static Field constructor");

    public SuperClass() {
        System.out.println("SuperClass constructor");
        method("from SuperClass constructor");
    }

    public void method(String str) {
        System.out.println("SuperClass method" + str);
    }
}