import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] chArray = sc.next().toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            System.out.print(chArray[i]);
        }

    }
}