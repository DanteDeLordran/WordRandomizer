package Randomizer;

import java.util.Random;
import java.util.Scanner;

public class Randomizer {

    public void init() {
        getWord();
    }

    public void getWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Word to randomize : ");
        String word = sc.next();
        sc.close();
        // wordToList(word.toLowerCase());
        wordToArray(word);
    }

    public void wordToArray(String word) {

        char[] wordToCharArray = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            wordToCharArray[i] = word.charAt(i);
        }
        arrayWordRandomizer(wordToCharArray);
    }

    public void arrayWordRandomizer(char[] charWordArray) {
        int[] auxIntArray = new int[charWordArray.length];

        for (int i = 0; i < charWordArray.length; i++) {
            auxIntArray[i] = i;
        }
        System.out.println("List of " + charWordArray.length + " possible results :");
        for (int i = 0; i < auxIntArray.length; i++) {
            shuffle(auxIntArray);

            char[] newWordCharArray = new char[charWordArray.length];

            for (int j = 0; j < auxIntArray.length; j++) {
                newWordCharArray[j] = charWordArray[auxIntArray[j]];
                System.out.print(newWordCharArray[j]);
            }
            System.out.println();
        }
    }

    Random random;

    public void shuffle(int[] array) {

        if (random == null)
            random = new Random();
        int count = array.length;
        for (int i = count; i > 1; i--) {
            swap(array, i - 1, random.nextInt(i));
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
