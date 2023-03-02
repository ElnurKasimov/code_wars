package Kju_7;

//Complete the solution so that the function will break up camel casing, using a space between words.
//
//Example
//"camelCasing"  =>  "camel Casing"
//"identifier"   =>  "identifier"
//""             =>  ""

public class BreakCamelCase {

    public static String camelCase(String input) {
        if("".equals(input)) return "";
        if (input == null) return null;
        StringBuilder result =  new StringBuilder();
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            if (Character.isUpperCase(aChar)) {
                result.append(" ");
            }
            result.append(aChar);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelCase("kjhYhjgwerhg Bkjlkj B sdjklfh"));
    }

}
//THE BEST SOLUTION
//    public static String camelCase(String input) {
//        return input.replaceAll("([A-Z])", " $1");
//    }
