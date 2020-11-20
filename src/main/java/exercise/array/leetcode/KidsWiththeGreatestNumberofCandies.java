package exercise.array.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int greatest = 1;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > greatest) {
                greatest = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= greatest) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] candies1 = {2, 3, 5, 1, 3};
        int extraCandies1 = 3;
        KidsWiththeGreatestNumberofCandies kidsWiththeGreatestNumberofCandies = new KidsWiththeGreatestNumberofCandies();
        kidsWiththeGreatestNumberofCandies.kidsWithCandies(candies1, extraCandies1).forEach(System.out::println);
    }
}
