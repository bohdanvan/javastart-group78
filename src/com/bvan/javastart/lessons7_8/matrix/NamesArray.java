package com.bvan.javastart.lessons7_8.matrix;

/**
 * @author bvanchuhov
 */
public class NamesArray {

    public static void main(String[] args) {
        String[] names = {
                "Taras",
                "Ivan",
                "Masha"
        };

        String name = names[0];
        char c = name.charAt(4);
        System.out.println(c);
    }
}
