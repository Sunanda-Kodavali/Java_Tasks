import java.security.SecureRandom;

public class PasswordGeneration {


        private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        private static final String LOWER = UPPER.toLowerCase();
        private static final String DIGITS = "0123456789";
        private static final String SPECIAL_CHARS = "!@#$%^&*()_+{}[]";

        private static final String ALL_CHARS = UPPER + LOWER + DIGITS + SPECIAL_CHARS;

        private static SecureRandom random = new SecureRandom();



        public static void main(String[] args) {

            String randomPassword = generateRandomPassword(8);
            System.out.println("Random Password: " + randomPassword);
        }
    public static String generateRandomPassword(int length) {

        StringBuilder password = new StringBuilder(length);

        password.append(UPPER.charAt(random.nextInt(UPPER.length())));
        password.append(LOWER.charAt(random.nextInt(LOWER.length())));
        password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        password.append(SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length())));


        for (int i = 4; i < length; i++) {
            password.append(ALL_CHARS.charAt(random.nextInt(ALL_CHARS.length())));
        }

        return password.toString();
    }
}
