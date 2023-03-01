package Kju_6;

//Complete the solution so that the function will break up camel casing, using a space between words.
//
//Example
//"camelCasing"  =>  "camel Casing"
//"identifier"   =>  "identifier"
//""             =>  ""

public class BreakCamelCase {

    public static String camelCase(String input) {
        if("".equals(input)) return "";
        if ("".equals(null)) return null;
        String result = "";
        char[] chars = input.toCharArray();
        for( int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(i)) input.charAt(i) =
        }
        return result;
    }

    public static void main(String[] args) {

    }

}
