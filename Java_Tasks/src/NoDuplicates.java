import java.util.*;

public class NoDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 7, 7, 7};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) set.add(arr[i]);
        System.out.println(set);
    }
}
