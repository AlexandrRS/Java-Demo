package com.github.alexandrrs.javademo.enums;

import com.github.alexandrrs.javademo.enums.classes.Tree;

/**
 * @author aryabokon
 * @since 15.06.16 11:01
 */
public class Enums {
    public static void main(String[] args) {

        Tree oakTree = Tree.OAK;
        Tree poplarTree = Tree.POPLAR;
        Tree pineTree = Tree.PINE;

        // Getting order from Enum
        int oakOrder = oakTree.ordinal();
        int poplarOrder = poplarTree.ordinal();
        System.out.println("Oak order is bigger than Poplar: " + (oakOrder > poplarOrder));

        // Invoking custom methods
        int oakHeight = oakTree.getHeight();
        int pineHeight = pineTree.getHeight();
        System.out.println("Pine height is bigger than Oak: " + (oakHeight < pineHeight)
                + "\nPine height: " + pineHeight + ", Oak height: " + oakHeight);

        // New Enum from String
        Tree newTree = Tree.valueOf("POPLAR");
        System.out.println(String.format("New tree is: %s, height: %d", newTree, newTree.getHeight()));

        // List all values in Enum
        Tree[] trees = Tree.values();
        System.out.println("Tree list:");
        for (Tree tree : trees) {
            System.out.println(" " + tree);
        }

        // Using "switch"
        printEnum(Tree.OAK);
        printEnum(Tree.POPLAR);
        printEnum(Tree.PINE);
    }

    private static void printEnum(Tree tree) {
        switch (tree) {
            case OAK: {
                System.out.println("Tree is Oak");
                break;
            }
            case POPLAR: {
                System.out.println("Tree is Poplar");
                break;
            }
            default: {
                System.out.println("Tree is not detected");
                break;
            }
        }
    }
}