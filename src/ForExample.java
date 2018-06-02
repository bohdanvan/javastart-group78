/**
 * @author bvanchuhov
 */
public class ForExample {

    public static void main(String[] args) {
        // 10, 11, 12 ... 20
        for (int n = 10; n <= 20; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 40, 39, 38 ... 30
        for (int n = 40; n >= 30; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 100, 200, 300, ... 2000
        for (int n = 100; n <= 2000; n += 100) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
