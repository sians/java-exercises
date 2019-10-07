package fizz_buzz;

import java.util.ArrayList;

public class Application {
    public static void main(String [] strs) {
        System.out.println(fizzBuzz(7));
        System.out.println(fizzBuzz(16));
        System.out.println(fizzBuzz(5));
    }

    public static ArrayList<String> fizzBuzz(int num) {
        ArrayList<String> result = new ArrayList<>();
        for(int i = 1; i <= num; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                result.add("FizzBuzz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
