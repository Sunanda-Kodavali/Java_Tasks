package MergeArrays;

import java.util.Arrays;

public class MergeArrays {

    private int[] nums1;
    private int[] nums2;
    private int m, n;

    public MergeArrays(int[] nums1, int[] nums2, int m, int n) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.m = m;
        this.n = n;
    }

    public void merge() {

        for (int i = 0; i < nums2.length; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
        printArray(nums1);
    }
    public void printArray(int[] nums1){
        System.out.println(Arrays.toString(nums1));
    }
}
