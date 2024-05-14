

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        int y = x;
        int reverse = 0;
        if (x < 0) {
            return false;
        }
        while (x != 0) {
            int remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x / 10;
        }
        return y == reverse;
    }
}
