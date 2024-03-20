import java.util.Random;

public class PasswordGeneration {
    public static void main(String[] args) {

        String str = "0123456789" + "!,$,&,@,?" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        char[] password = new char[8];
        for (int i = 0; i < 8; i++) password[i] = str.charAt(random.nextInt(str.length()));
        System.out.println(password);
    }
}
