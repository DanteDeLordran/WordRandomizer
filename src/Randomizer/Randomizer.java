package Randomizer;

import java.util.Random;
import java.util.Scanner;

public class Randomizer {

    public void init() {
        arrayWordRandomizer();
    }

    public void arrayWordRandomizer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Word to randomize : ");
        String word = sc.next();
        sc.close();
        char[] charWordArray = word.toCharArray();
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

    public void shuffle(int[] array) {
        int count = array.length;
        for (int i = count; i > 1; i--) {
            swap(array, i - 1, new Random().nextInt(i));
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}