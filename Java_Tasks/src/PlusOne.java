import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlusOne {
    public static void main(String[] args) {

        int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        int[] res = plusOne(digits);

    }
    public static int[] plusOne(int[] digits) {
        String input = Arrays.stream(digits).mapToObj(String::valueOf).collect(Collectors.joining(""));
        BigInteger i = new BigInteger(input).add(BigInteger.valueOf(1));
        System.out.println(i);
        String s = String.valueOf(i);

        int[] res = new int[s.length()];
        for (int j = 0; j < s.length(); j++) {

            res[j] = Integer.parseInt(s.substring(j, j + 1));
        }
        return  res;
    }
}
