package com.github.alexandrrs.javademo.fundamental;

/**
 * Created by alexandr
 * since 29.05.16 22:18
 */

/**
 * This class prints minimal and maximum
 * values basic numeric types
 * */
public class SimpleNumericTypes {

    public static void main(String[] args) {
        System.out.println("Simple numeric types");
        System.out.println("byte: " + Byte.MIN_VALUE + " - " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " - " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " - " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MIN_VALUE + " - " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " - " + Double.MAX_VALUE);
    }
}