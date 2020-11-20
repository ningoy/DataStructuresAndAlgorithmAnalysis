package exercise.array.leetcode;

import java.util.Arrays;

public class ShuffletheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        // 循环读出nums中的每一个元素
        for (int i = 0; i < nums.length; i++) {
            if (i < n) {
                result[2 * i] = nums[i];
            } else {
                result[2 * (i - n) + 1] = nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 5, 1, 3, 4, 7};
        int n1 = 3;
        int[] nums2 = {1,2,3,4,4,3,2,1};
        int n2 = 4;
        ShuffletheArray shuffletheArray = new ShuffletheArray();
        Arrays.stream(shuffletheArray.shuffle(nums1, n1)).forEach(System.out::println);
        Arrays.stream(shuffletheArray.shuffle(nums2, n2)).forEach(System.out::println);

    }
}
