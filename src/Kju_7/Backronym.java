package Kju_7;
//Complete the function to create backronyms. Transform the given string (without spaces) to a backronym,
//using the preloaded dictionary and return a string of words, separated with a single space
//(but no trailing spaces).
//The keys of the preloaded dictionary are uppercase letters A-Z and the values are predetermined words,
//for example: dictionary.get("P") == "perfect"
//"dgm" ==> "disturbing gregarious mustache"
//Examles:
//"lkj" ==> "literal klingon joke"


import java.util.HashMap;
import java.util.Map;

public class Backronym {
    private static final Map<String, String> dictionary = Preload.dictionary;

    public static String makeBackronym(String acronym) {
        if (acronym.equals("")) {return "";}
        StringBuilder result = new StringBuilder();
        String[] letters = acronym.split("");
        for (String letter : letters) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()){
                if (letter.toUpperCase().equals(entry.getKey())) {
                    result.append(entry.getValue()).append(",");
                }
            }
        }
        result.toString()
                .chars()
                .forEach(System.out::println);
        return result.substring(0, result.length()-1);
    }

    static class Preload {
        public static Map<String, String> dictionary = new HashMap<>();
        static {
            dictionary.put("D", "disturbing");
            dictionary.put("G", "gregarious");
            dictionary.put("M", "mustache");
        }
    }

    public static void main(String[] args) {
        System.out.println(makeBackronym("dgm"));
    }

    //Best solution:
    // return acronym.toUpperCase().
    //    chars().
    //    mapToObj(i -> dictionary.get("" + (char)i)).collect(Collectors.joining(" "));

}