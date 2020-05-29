package cha1;

import java.util.Comparator;

/**
 * @author ningoy
 * @version V1.0
 * @Package cha1
 * @Description: TODO
 * @date 2020/5/27 21:12
 */


class CaseInsensitiveCompare implements Comparator<String> {
    @Override
    public int compare(String lhs, String rhs) {
//        return lhs.compareToIgnoreCase(rhs);
        return lhs.compareTo(rhs);
    }
}

class TestProgram {

    public static <AnyType> AnyType findMax(AnyType[] arr, Comparator<? super AnyType> cmp) {
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (cmp.compare(arr[i], arr[maxIndex]) > 0) {
                maxIndex = i;
            }
        }


        return arr[maxIndex];
    }

    public static void main(String[] args) {
        String[] arr = {"ZEBRA", "alligator", "crocodile"};
        System.out.println(findMax(arr, new CaseInsensitiveCompare()));
    }
}