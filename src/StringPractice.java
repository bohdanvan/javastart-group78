/**
 * @author bvanchuhov
 */
public class StringPractice {

    public static void main(String[] args) {
        String s = "Hello, world!";

        // 1
        String upperCase = s.toUpperCase();
        System.out.println("upperCase = " + upperCase);

        // 2
        boolean startsWithHello = s.startsWith("Hello");
        System.out.println("startsWithHello = " + startsWithHello);

        // 3
        System.out.println(s.indexOf("Java"));
    }
}
