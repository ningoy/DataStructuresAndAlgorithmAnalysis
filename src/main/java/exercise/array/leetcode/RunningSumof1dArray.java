package exercise.array.leetcode;

import java.util.Arrays;

public class RunningSumof1dArray {
    public int[] runningSum(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        // 从数组中循环获取每一个值
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i + 1] = nums[i] + nums[i + 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 1, 1, 1, 1};
        int[] nums3 = {3, 1, 2, 10, 1};
        RunningSumof1dArray runningSumof1dArray = new RunningSumof1dArray();
        Arrays.stream(runningSumof1dArray.runningSum(nums1)).forEach(System.out::println);
        System.out.println();
        Arrays.stream(runningSumof1dArray.runningSum(nums2)).forEach(System.out::println);
        System.out.println();
        Arrays.stream(runningSumof1dArray.runningSum(nums3)).forEach(System.out::println);
    }
}
