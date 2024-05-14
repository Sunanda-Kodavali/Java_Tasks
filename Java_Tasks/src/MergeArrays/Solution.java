package MergeArrays;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1,1,3,0,0,0};
        int m = 3;
        int[]  nums2 = {2,5,6};
        int n = 3;

        MergeArrays mA = new MergeArrays(nums1, nums2, m, n);
        mA.merge();
    }


}
