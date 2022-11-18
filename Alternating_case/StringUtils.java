/**
 * StringUtils.java
 *
 * @version: 18/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

package Alternating_case;

public class StringUtils {

  public static String toAlternativeString(String string) {
    String res = "";
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) >= 65 && string.charAt(i) <= 90)
        res += Character.toString(string.charAt(i) + 32);
      else if (string.charAt(i) >= 97 && string.charAt(i) <= 122)
        res += Character.toString(string.charAt(i) - 32);
      else
        res += string.charAt(i);
    }
    return res;
  }
}

/********** OPCION 1 **********/

/*
 * public class StringUtils {
 * public static String toAlternativeString(String string) {
 * String result = "";
 * for (char c : string.toCharArray()) {
 * if(Character.isUpperCase(c)) {
 * result += Character.toLowerCase(c);
 * } else {
 * result += Character.toUpperCase(c);
 * }
 * }
 * return result;
 * }
 * }
 */

/********** OPCION 2 **********/

/*
 * import static java.lang.Character.*;
 * 
 * public class StringUtils {
 * public static String toAlternativeString(String string) {
 * return string.chars()
 * .map(c -> isUpperCase(c) ? toLowerCase(c) : isLowerCase(c) ? toUpperCase(c) :
 * c)
 * .collect(StringBuilder::new, StringBuilder::appendCodePoint,
 * StringBuilder::append)
 * .toString();
 * }
 * }
 */

/********** OPCION 3 **********/

/*
 * import java.util.*;
 * import java.util.stream.*;
 * 
 * public class StringUtils {
 * 
 * public static String toAlternativeString(String string) {
 * return Arrays.stream(string.split(""))
 * .map(s -> s.matches("[A-Z]") ? s.toLowerCase() : s.toUpperCase())
 * .collect(Collectors.joining(""));
 * }
 * }
 */

/********** OPCION 4 **********/

/*
 * import java.util.*;
 * 
 * public class StringUtils {
 * 
 * public static String toAlternativeString(String str){
 * StringBuilder s = new StringBuilder();
 * str.chars()
 * .forEach( i -> {
 * char c = (char) i;
 * s.append( Character.isUpperCase(c) ? Character.toLowerCase(c)
 * : Character.toUpperCase(c));
 * });
 * return s.toString();
 * }
 * }
 */

/********** OPCION 5 **********/

/*
 * public class StringUtils {
 * 
 * public static String toAlternativeString(String string){
 * char[] charArr = string.toCharArray();
 * for(int i = 0; i < charArr.length; i++){
 * if(Character.isLowerCase(charArr[i])){
 * charArr[i] = Character.toUpperCase(charArr[i]);
 * }
 * else{
 * charArr[i] = Character.toLowerCase(charArr[i]);
 * }
 * }
 * return new String(charArr);
 * }
 * }
 */