package cha1;

import java.util.Arrays;
import java.util.Random;

/**
 * @author ningoy
 * @version V1.0
 * @Package cha1
 * @Description: TODO
 * @date 2020/5/26 10:15
 */
public class SelectionProblem {

    /**
     * 冒泡排序
     * 1 3 5 2 4
     * 1 3 2 4 5
     * 1 2 3 4 5
     *
     * @param array 数组
     * @return
     */
    public int bubbleSort(int[] array, int k) {
        return bubbleSort(array)[k - 1];
    }

    public int[] bubbleSort(int[] array) {
        int length = array.length;
        for (int l = 0; l < length - 1; l++) {
            for (int i = 0; i < length - l - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
        return array;
    }

    /**
     * 先把前k个元素读入数组并对其排序，接着，将剩下的元素再逐个读入。
     * 当新元素被读到时，如果它小于数组中的第k个元素则忽略之，否则就将其放到数组正确的位置上，同时将数组的一个元素挤出数组。
     *
     * @param array
     * @param k
     * @return
     */
    public int selectionSort(int[] array, int k) {
        int[] result = bubbleSort(Arrays.copyOfRange(array, 0, k));
        for (int i = k; i < array.length; i++) {
            if (array[i] > result[k - 1]) {
                result[k - 1] = array[i];
                result = bubbleSort(result);
            }
        }
        return result[k - 1];

    }

    public static void main(String[] args) {
        Random random = new Random();
        for (int j = 1; j <= 20; j++) {
            int n = 1000  * j;
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = Math.abs(random.nextInt()) + 1;
            }
            SelectionProblem selectionProblem = new SelectionProblem();

            long startTime1 = System.currentTimeMillis();
            int answer1 = selectionProblem.bubbleSort(array, n / 2);
            long stopTime1 = System.currentTimeMillis();

            long startTime2 = System.currentTimeMillis();
            int answer2 = selectionProblem.selectionSort(array, n / 2);
            long stopTime2 = System.currentTimeMillis();

            System.out.println("n => " + n);
            System.out.println("bubbleSort Used Time = " + (stopTime1 - startTime1) + " answer = " + answer1);
            System.out.println("selectionSort Used Time = " + (stopTime2 - startTime2) + " answer = " + answer2);
        }

        /**
         * bubbleSort Used Time = 48 answer = 1609269316
         * selectionSort Used Time = 2 answer = 1609269316
         * 可以看出在这个第K大的数问题里面，选择排序的效率是要优于冒泡排序的，这是因为选择排序利用了K这个数字
         * 把需要排序的数组的大小由array.length缩小到了K，同时还减少了一部分不必要的计算。
         *
         * 在许多问题当中，一个重要的观念是：写出一个工作程序并不够。如果这个程序在巨大的数据集上运行，那么运行时间就成了重要的问题。
         *
         */
    }
}
