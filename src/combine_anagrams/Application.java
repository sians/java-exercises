package combine_anagrams;

import java.util.ArrayList;
import java.util.HashMap;

public class Application {
    public static void main(String [] str) {
        System.out.println(combineAnagrams(new String[] {"cars", "for", "POTATOES", "racs", "four", "scar", "creams", "SCREAM"}));
        // [["cars", "racs", "scar"], ["four"], ["for"], ["POTATOES"], ["creams", "SCREAM"]]
    }

    public static ArrayList<ArrayList<String>> combineAnagrams(String [] words) {
        HashMap<String, ArrayList<String>> sortedWords = new HashMap<>();
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        for (String word : words) {
            String sorted = word.toLowerCase()
                    .chars()
                    .sorted()
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            if(sortedWords.containsKey(sorted)) {
                ArrayList<String> value;
                value = sortedWords.get(sorted);
                value.add(word);
            } else {
                ArrayList<String> value = new ArrayList<>();
                value.add(word);
                sortedWords.put(sorted, value);
            }
        }
		for(String word: sortedWords.keySet()) {
			result.add(sortedWords.get(word));
		}
        return result;
    }
}
