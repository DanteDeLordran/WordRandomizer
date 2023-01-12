package Randomizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
        char[] newList = new char[listWord.size()];
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < listWord.size(); j++){
                
                Random random = new Random();
                int[] randomNumbersArray = new int[listWord.size()];

                for(int k = 0; k < listWord.size(); k++){
                    
                    int randomNumber = random.nextInt(listWord.size());
                    randomNumbersArray[k] = randomNumber;
                    
                    
                }
                System.out.println(""+ randomNumbersArray[j]);
            }
        }
    }

    public boolean isRepeated(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

}
