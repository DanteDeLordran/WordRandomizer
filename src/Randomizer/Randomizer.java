package Randomizer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
        wordToList(word.toLowerCase());
    }

    public void wordToList(String word) {
        ArrayList<Character> charString = new ArrayList<Character>();
        for (Character c : word.toCharArray()) {
            charString.add(c);
        }
        //listWordRandomizer(charString);
        wordToArray(word);
    }

    public void wordToArray(String word){

        char[] wordToCharArray = new char[word.length()];

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
                charList.set(k, listWord.get( shuffledNumbersList.get(k) ));
            }
            System.out.println(""+ charList);
        }

    }
}
