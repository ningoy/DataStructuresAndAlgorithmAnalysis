package exercise.array.leetcode;

import java.nio.BufferUnderflowException;
import java.util.HashMap;
import java.util.Map;

public class NumberofGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        int[] count = new int[101];
        for (int a : nums) {
            res += count[a]++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        int[] nums2 = {1, 1, 1, 1};
        int[] nums3 = {1, 2, 3};
        NumberofGoodPairs numberofGoodPairs = new NumberofGoodPairs();
        System.out.println(numberofGoodPairs.numIdenticalPairs(nums1));
        System.out.println(numberofGoodPairs.numIdenticalPairs(nums2));
        System.out.println(numberofGoodPairs.numIdenticalPairs(nums3));

    }
}


