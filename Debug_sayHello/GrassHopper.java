/**
 * GrassHopper.java
 *
 * @version: 18/11/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

package Debug_sayHello;

public class GrassHopper {
    public static String sayHello(String name) {
        return "Hello, " + name;
    }
}

/********** OPCION 1 **********/

/*
 * public class GrassHopper {
 * 
 * public static String sayHello(String name) {
 * return String.format("Hello, %s", name);
 * }
 * }
 */

/********** OPCION 2 **********/

/*
 * public class GrassHopper {
 * public static String sayHello(String name) {
 * String x;
 * x = "Hello, " + name;
 * return x;
 * }
 * }
 */

/********** OPCION 3 **********/

/*
 * public class GrassHopper {
 * public static String sayHello (String name) { return "Hello, ".concat(name);
 * }
 * }
 */

/********** OPCION 4 **********/

/*
 * public class GrassHopper {
 * public static String sayHello(String name) {
 * if(name.contains("Spock")){
 * return "Hello, Mr. Spock";
 * }
 * if(name.contains("Kirk")){
 * return "Hello, Captain Kirk";
 * }
 * if(name.contains("Uhura")){
 * return "Hello, Liutenant Uhura";
 * }
 * if(name.contains("McCoy")){
 * return "Hello, Dr. McCoy";
 * }
 * return "Hello, "+name;
 * }
 * }
 */

/********** OPCION 5 **********/

/*
 * public class GrassHopper {
 * public static String sayHello(String name) {
 * return String.join(", ","Hello",name);
 * }
 * }
 */