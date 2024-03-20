import java.util.Random;

public class PasswordGeneration {
    public static void main(String[] args) {

        int length = 8;
        String numbers = "0123456789";
        String symbol = "!,$,&,@,?";
        String cap_letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small_letter = "abcdefghijklmnopqrstuvwxyz";

        String finalString = cap_letter + small_letter + numbers + symbol;
        Random random = new Random();
        char[] password = new char[length];
        for (int i = 0; i < length; i++) password[i] = finalString.charAt(random.nextInt(finalString.length()));
        System.out.println(password);
    }
}
