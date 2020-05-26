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
        int[] array = new int[random.nextInt(1024) + 16];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(random.nextInt()) + 1;
        }
        System.out.println(Arrays.toString(array));

        SelectionProblem selectionProblem = new SelectionProblem();

        System.out.println(selectionProblem.bubbleSort(array, 16));
        System.out.println(selectionProblem.selectionSort(array, 16));
    }
}
