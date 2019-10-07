package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application {
    public static void main(String [] strs) {
        System.out.println(recursion(2, 8));
        System.out.println(recursion(4, 16));
        System.out.println(recursion(1, 5));
    }

    public static int recursion(int min, int max) {
        if (min > max) return -1;

        if(min == max) {
            return max;
        } else {
            return min + recursion(min + 1, max);
        }
    }
}
