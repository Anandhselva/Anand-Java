

import java.util.HashMap;

import java.util.Map;


public class findAndPrintDuplicateCharacters {

    public static void main(String[] args) {

        String inputString = "programming";

        String[] stringArray = {"apple", "banana", "cherry", "apple", "grape"};


        findAndPrintDuplicateCharacters(inputString);

        findAndPrintDuplicateStrings(stringArray);

    }


    public static void findAndPrintDuplicateCharacters(String str) {

        Map<Character, Integer> charCount = new HashMap<>();


        for (char ch : str.toCharArray()) {

            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);

        }


        System.out.println("Duplicate characters in the string:");

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {

            if (entry.getValue() > 1) {

                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");

            }

        }

    }


    public static void findAndPrintDuplicateStrings(String[] arr) {

        Map<String, Integer> stringCount = new HashMap<>();


        for (String s : arr) {

            stringCount.put(s, stringCount.getOrDefault(s, 0) + 1);

        }


        System.out.println("\nDuplicate strings in the array:");

        for (Map.Entry<String, Integer> entry : stringCount.entrySet()) {

            if (entry.getValue() > 1) {

                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");

            }

        }

    }

}