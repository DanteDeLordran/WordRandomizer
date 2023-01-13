package Randomizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Randomizer {
    
    public void init(){
        getWord();
    }

    public void getWord(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Word to randomize : ");
        String word = sc.next();
        sc.close();
        wordToList(word.toLowerCase());
    }

    public void wordToList( String word ) {
        List<Character> charString = new ArrayList<Character>();
        for(Character c : word.toCharArray()){
            charString.add(c);
        }
        listWordRandomizer(charString);
    }

    public void listWordRandomizer( List<Character> listWord){
        //char[] newList = new char[listWord.size()];
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < listWord.size(); j++){

                List<Integer> shuffledNumbersList = new ArrayList<>();

                for(int k = 0; k < listWord.size(); k++){
                    shuffledNumbersList.add(k);
                }
                Collections.shuffle(shuffledNumbersList);

                
                //Integer[] array = list.toArray(new Integer[list.size()]);
            }
        }
    }
}

