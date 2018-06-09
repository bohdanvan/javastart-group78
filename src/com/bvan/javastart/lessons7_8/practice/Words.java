package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class Words {

    public static void main(String[] args) {
        String[] words = {"Hello", "", "world"}; // 11
        int totalLength = totalLength(words);
        boolean containsEmptyWord = containsEmptyWord(words);

        System.out.println(totalLength);
        System.out.println(containsEmptyWord);
    }

    public static int totalLength(String[] words) {
        int totalLength = 0;
//        for (int i = 0; i < words.length; i++) {
//            totalLength += words[i].length();
//        }
        for (String word : words) {
            totalLength += word.length();
        }
        return totalLength;
    }

    public static boolean containsEmptyWord(String[] words) {
        for (String word : words) { // iter
            if (word.isEmpty()) {
                return true;
            }
        }
        return false;
    }

}
