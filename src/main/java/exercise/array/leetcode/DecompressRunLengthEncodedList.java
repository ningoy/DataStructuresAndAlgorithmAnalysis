package exercise.array.leetcode;

import java.util.Arrays;

public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                size += nums[i];
            }
        }
        int[] result = new int[size];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < nums[i]; j++) {
                    result[index] = nums[i + 1];
                    index++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        DecompressRunLengthEncodedList decompressRunLengthEncodedList = new DecompressRunLengthEncodedList();
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 1, 2, 3};
        Arrays.stream(decompressRunLengthEncodedList.decompressRLElist(nums1)).forEach(System.out::println);
        Arrays.stream(decompressRunLengthEncodedList.decompressRLElist(nums2)).forEach(System.out::println);
    }
}
