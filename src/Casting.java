/**
 * @author bvanchuhov
 */
public class Casting {

    public static void main(String[] args) {
        int x = 10;
        long y = 3_000_000_000L;

        int z = (int) y; // BAD PRACTICE

        System.out.println("z = " + z);

    }
}
