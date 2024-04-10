
import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {

            int num  = r.nextInt(1,11);
            while(existsInArray(num, arr)){
                 num  = r.nextInt(1,11);
            }
            arr[i] = num;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();



    }

    private static boolean existsInArray(int num, int[] arr) {
        for (int i:arr){
            if(i == num){
                return true;
            }
        }
        return false;
    }
}
