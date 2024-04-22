import java.util.HashSet;
import java.util.Scanner;

public class HangManGame {

    public static void main(String[] args) {

        char[] chars = {'R', 'O', 'A', 'R'};
        char[] charsRes = new char[chars.length];
        int x = 0;
        HashSet<Character> s = new HashSet<Character>();


        for (char aChar : chars) {
            s.add(aChar);
        }
        Scanner scanner = new Scanner(System.in);

        int counter = 1;

        while( counter <= 7 ) {

            System.out.println("Enter a character");
            char c = scanner.next().charAt(0);

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == c) {
                    charsRes[i] = c;
                }
            }
            System.out.println("After  " +counter+ "  guess  " +String .valueOf(charsRes));
            if(counter == s.size() && printEquals(chars, charsRes)){
                x = 1;
                System.out.println("You guessed it correctly : " + String .valueOf(charsRes));
                break;
            }

            counter++;


        }

        if(!printEquals(chars, charsRes)){
            System.out.println("Sorry!!!!!!!!!!!");
        }else{
            if(x != 1){
                System.out.println("You guessed it correctly : " + String .valueOf(charsRes));
            }
        }


    }

    private static boolean printEquals(char[] chars, char[] charsRes) {

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == charsRes[i]) {
                count += 1;
            }

        }
        return count == chars.length;
    }
}
