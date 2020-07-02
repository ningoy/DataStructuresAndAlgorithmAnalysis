package cha3;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * 3.3.4 例子：remove方法对LinkedList类的使用
 */
public class RemoveEvens {

    public static void removeEvensVer1(List<Integer> lst) {
        int i = 0;
        while (i < lst.size()) {
            if (lst.get(i) % 2 == 0) {
                lst.remove(i);
            } else {
                i++;
            }
        }
    }

    public static void removeEvensVer2(List<Integer> lst) {
        for (Integer x : lst) {
            if (x % 2 == 0) {
                lst.remove(x);
            }
        }
    }

    public static void removeEvensVer3(List<Integer> lst) {

        lst.removeIf(integer -> integer % 2 == 0);
    }

    public static void main(String[] args) {
        Random random = new Random();
    }
}
