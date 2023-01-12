package Randomizer;
import java.util.ArrayList;
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
        System.out.println("" + charString);
    }

}
