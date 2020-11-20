package exercise.array.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CreateTargetArrayintheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            a.add(index[i], nums[i]);
        }
        int target[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = a.get(i);
        }
        return target;
    }
}
