package Randomizer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

    public void wordToList(String word) {
        ArrayList<Character> charString = new ArrayList<Character>();
        for (Character c : word.toCharArray()) {
            charString.add(c);
        }
        // listWordRandomizer(charString);
        wordToArray(word);
    }

    public void wordToArray(String word) {

        char[] wordToCharArray = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            wordToCharArray[i] = word.charAt(i);
        }
        arrayWordRandomizer(wordToCharArray);
    }

    public void listWordRandomizer(List<Character> listWord) {

        for (int j = 0; j < listWord.size(); j++) {

            ArrayList<Integer> shuffledNumbersList = new ArrayList<>();

            for (int k = 0; k < listWord.size(); k++) {
                shuffledNumbersList.add(k);
            }
            Collections.shuffle(shuffledNumbersList);

            ArrayList<Character> charList = new ArrayList<Character>();

            for (int k = 0; k < listWord.size(); k++) {
                charList.set(k, listWord.get(shuffledNumbersList.get(k)));
            }
            System.out.println("" + charList);
        }
    }

    public void arrayWordRandomizer(char[] charWordArray) {
        int[] auxIntArray = new int[charWordArray.length];

        for (int i = 0; i < charWordArray.length; i++) {
            auxIntArray[i] = i;
        }

        shuffle(auxIntArray);

        

    }

    Random random;
    public void shuffle(int[] array) {
        
        if (random == null) random = new Random();
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
