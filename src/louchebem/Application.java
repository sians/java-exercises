package louchebem;

import java.util.ArrayList;
import java.util.Random;

public class Application {
    public static void main(String [] str) {
        System.out.println(louchebem("PATRON"));
        // LATRONPEM
        System.out.println(louchebem("noozeooze! ooze, oddles krill! oose! kool"));
    }

    public static String louchebem(String str) {
        str = str.toLowerCase();
        String [] words = str.split(" ");

        String [] suffixes = new String [] {"em", "é", "ji", "oc", "ic", "uche", "ès"};

        // array to store words
        ArrayList<String> result = new ArrayList<>();

        for(String word : words) {
            int randomSuffixIndex = new Random().nextInt(suffixes.length);
            boolean punctuation = ",.:!;?".indexOf(word.charAt(word.length()-1)) < 0;
            String resultWord = "";

            if (word.length() == 1) {
                result.add(word);
            } else if ("aeiou".indexOf(word.charAt(0)) < 0){
                // words beginning with consonants
                String initialCons = word.replaceAll("([^aeiouAEIOU]*).*", "$1");
                String remaining = word.replace(initialCons, "");
                if (punctuation) {
                    resultWord = "l" + remaining + initialCons + suffixes[randomSuffixIndex];
                } else {
                    String punc = word.substring(word.length()-1);
                    resultWord = "l" + remaining.substring(0,remaining.length()-1) + initialCons + suffixes[randomSuffixIndex] + punc;
                }
                result.add(resultWord);
            } else {
                // words beginning with vowels
                if (punctuation) {
                    resultWord = "l" + word + suffixes[randomSuffixIndex];
                } else {
                    String punc = word.substring(word.length()-1);
                    resultWord = "l" + word.substring(0,word.length()-1) + suffixes[randomSuffixIndex] + punc;
                }
                result.add(resultWord);
            }

        }
        return String.join(" ", result);
    }
}
