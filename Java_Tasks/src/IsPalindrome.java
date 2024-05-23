

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("amanaplanacanalpanama"));
    }
    public static boolean isPalindrome(String s) {

        String sl = s.toLowerCase().replaceAll("[^a-zA-Z0-9_-]", "");

        for (int i = 0; i < sl.length() / 2; i++) {
                if(sl.charAt(i) != sl.charAt(sl.length()-i-1)){
                    return false;

            }
        }
        return true;

    }
}
