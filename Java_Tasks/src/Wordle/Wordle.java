package Wordle;

import java.util.Scanner;

public class Wordle {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        String originalWord = Words.getRandomWord();
        System.out.println(originalWord);
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while(count < 6){


        System.out.println("Please enter a five letter word");
        String word = scanner.nextLine();

        if(word.length() != 5){
            System.out.println("Please enter a five letter word");
            word = scanner.nextLine();
        }

        if(Words.isValidWord(word)){
            printWord(count, word);
            count++;
        }
        }

    }

    public static void printWord(int lineNumber, String word){
        for (int i = 0; i < 6; i++) {
            if(i == lineNumber){
                System.out.println(word);
            }
            if(i > lineNumber){
                for (int j = 0; j < 5; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
    }
}
