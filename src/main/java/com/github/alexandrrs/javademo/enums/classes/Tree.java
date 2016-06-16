package com.github.alexandrrs.javademo.enums.classes;

/**
 * @author aryabokon
 * @since 15.06.16 11:00
 */
public enum Tree {

    POPLAR (20),
    PINE(100),
    OAK (50);

    private int height;

    Tree(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}