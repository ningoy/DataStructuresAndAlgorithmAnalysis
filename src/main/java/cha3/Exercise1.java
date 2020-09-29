package cha3;

import java.util.ArrayList;

public class Exercise1 {

    public static void printLots(ArrayList<Integer> L, ArrayList<Integer> P) {
        for (int i = 0; i < L.size(); i++) {
            System.out.println(P.get(L.get(i) - 1));
            ;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> L = new ArrayList<Integer>() {{
            add(1);
            add(3);
            add(4);
            add(6);
        }};

        ArrayList<Integer> P = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
            add(10);
        }};

        Exercise1.printLots(L, P);


    }
}
