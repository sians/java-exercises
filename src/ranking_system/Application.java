package ranking_system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Application {
    public static void main(String [] str) {
        System.out.println(rankings(new Integer [] {13, 7, 6, 45, 21, 9, 101, 102})); // 5 7 8 3 4 6 2 1
        System.out.println(rankings(new Integer [] {10, 3, 15})); // [2,3,1]
    }

    public static ArrayList<Integer> rankings(Integer[] nums) {
        ArrayList<Integer> ranking = new ArrayList<>();
        for (int num : nums) {
            ranking.add(num);
        }
        Collections.sort(ranking, Collections.reverseOrder());
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            int rankingIndex = 0;
            result.add(ranking.indexOf(nums[i]) + 1);
        }
        return result;
    }
}
