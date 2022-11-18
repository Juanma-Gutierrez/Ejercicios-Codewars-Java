/**
 * Kata.java
 *
 * @version: 18/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

package Invert_values;

public class Kata {
    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] *= (-1);
        return array;
    }
}

/********** OPCION 1 **********/

/*
 * public class Kata {
 * public static int[] invert(int[] array) {
 * return java.util.Arrays.stream(array).map(i -> -i).toArray();
 * }
 * }
 */

/********** OPCION 2 **********/

/*
 * public class Kata {
 * public static int[] invert(int[] array) {
 * return java.util.Arrays.stream(array).map(e->-e).toArray();
 * }
 * }
 */

/********** OPCION 3 **********/

/*
 * public class Kata {
 * public static int[] invert(int[] array) {
 * int [] res = new int[array.length];
 * for(int i = 0; i < array.length; i++)
 * res[i] = -array[i];
 * return res;
 * }
 * }
 */

/********** OPCION 4 **********/

/*
 * import java.util.Arrays;
 * 
 * public class Kata {
 * public static int[] invert(int[] array) {
 * return Arrays.stream(array).map(i -> -i).toArray();
 * }
 * }
 */

/********** OPCION 5 **********/

/*
 * public class Kata
 * {
 * public static int[] invert(int[] array)
 * {
 * for (int i = 0;i < array.length; i++)
 * array[i] = -(array[i]);
 * return array;
 * }
 * }
 */