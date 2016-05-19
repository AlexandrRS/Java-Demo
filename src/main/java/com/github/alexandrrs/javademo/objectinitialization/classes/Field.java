package com.github.alexandrrs.javademo.objectinitialization.classes;

/**
 * Created by alexandr
 * since 19.05.16 22:53
 */
public class Field {
    FieldInField field = new FieldInField("FieldInField constructor");
    static FieldInField staticField = new FieldInField("FieldInField static constructor");

    public Field(String str) {
        System.out.println(str);
    }
}