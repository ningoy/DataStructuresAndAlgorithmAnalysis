package cha2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author ningoy
 * @version V1.0
 * @Package cha2
 * @Description: 最大子序列和问题的求解
 * @date 2020/6/4 19:14
 */
public class MaxSubSumProblem {

    public static int maxSubSum1(int[] a) {
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int thisSum = 0;
                for (int k = i; k <= j; k++) {
                    thisSum += a[k];
                }
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }

    public static int maxSubSum2(int[] a) {
        int maxSum = 0;

        for (int i = 0; i < a.length; i++) {
            int thisSum = 0;
            for (int j = i; j < a.length; j++) {
                thisSum += a[j];
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }

    public static int maxSumRec(int[] a, int left, int right) {
        // Base case
        if (left == right) {
            if (a[left] > 0) {
                return a[left];
            } else {
                return 0;
            }
        }
        int center = (left + right) / 2;
        int maxLeftSum = maxSumRec(a, left, center);
        int maxRightSum = maxSumRec(a, center + 1, right);

        int maxLeftBorderSum = 0;
        int leftBorderSum = 0;
        for (int i = center; i >= left; i--) {
            leftBorderSum += a[i];
            if (leftBorderSum > maxLeftBorderSum) {
                maxLeftBorderSum = leftBorderSum;
            }
        }
        int maxRightBorderSum = 0;
        int rightBorderSum = 0;
        for (int i = center + 1; i <= right; i++) {
            rightBorderSum += a[i];
            if (rightBorderSum > maxRightBorderSum) {
                maxRightBorderSum = rightBorderSum;
            }
        }
        int[] ints = new int[3];
        ints[0] = maxRightSum;
        ints[1] = maxLeftSum;
        ints[2] = maxLeftBorderSum + maxRightBorderSum;
        Arrays.sort(ints);
        return ints[2];
    }

    public static int maxSubSum3(int[] a) {
        return maxSumRec(a, 0, a.length - 1);
    }

    public static int maxSubSum4(int[] a) {
        int maxSum = 0;
        int thisSum = 0;

        for (int j = 0; j < a.length; j++) {
            thisSum += a[j];

            if (thisSum > maxSum) {
                maxSum = thisSum;
            } else if (thisSum < 0) {
                thisSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(random.nextInt(100)) + 1;
        }
        long startTime1 = System.currentTimeMillis();
        int answer1 = maxSubSum1(array);
        long stopTime1 = System.currentTimeMillis();
        System.out.println(answer1);
        System.out.println("maxSubSum1 Used Time = " + (stopTime1 - startTime1) + " answer = " + answer1);

        long startTime2 = System.currentTimeMillis();
        int answer2 = maxSubSum2(array);
        long stopTime2 = System.currentTimeMillis();
        System.out.println(answer2);
        System.out.println("maxSubSum2 Used Time = " + (stopTime2 - startTime2) + " answer = " + answer2);

        long startTime3 = System.currentTimeMillis();
        int answer3 = maxSubSum3(array);
        long stopTime3 = System.currentTimeMillis();
        System.out.println(answer3);
        System.out.println("maxSubSum3 Used Time = " + (stopTime3 - startTime3) + " answer = " + answer3);

        long startTime4 = System.currentTimeMillis();
        int answer4 = maxSubSum4(array);
        long stopTime4 = System.currentTimeMillis();
        System.out.println(answer4);
        System.out.println("maxSubSum4 Used Time = " + (stopTime4 - startTime4) + " answer = " + answer4);
    }

}
