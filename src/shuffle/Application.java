package shuffle;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void main(String[] strs) {
        System.out.println(shuffle(new ArrayList<>(Arrays.asList(1,2,3))));
        System.out.println(shuffle(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8))));
        System.out.println(shuffle(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13))));
    }

    public static ArrayList<Integer> shuffle(ArrayList<Integer> arr){
        ArrayList<Integer> result = new ArrayList<>();
        while(arr.size() > 0){
            int index = (int)(Math.random() * ((arr.size() - 1) + 1)) + 1;
            result.add(arr.get(index - 1));
            arr.remove(index -1);
        }
        return result;
    }
}
