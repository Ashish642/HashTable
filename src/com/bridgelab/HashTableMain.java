package com.bridgelab;

import java.util.Locale;

public class HashTableMain {
    public static void main(String[] args) {
        MyHashTable<String, Integer> hashTable = new MyHashTable();
        String sentence = "Paranoids are not paranoid because they are paranoid but they keep putting themselves deliberately avoid situations";

        // storing given sentence in an array.
        // converting the sentence to lower case and removing spaces.
        String[] sentenceArray = sentence.toLowerCase().split(" ");
        // Iterating over the array.
        for (String word : sentenceArray) {
            Integer count = hashTable.get(word);

            if (count == null) {

                count = 1;


            } else {
                count = count + 1;
                hashTable.add(word, count);

            }
        }
        System.out.println(hashTable);
    }
}
