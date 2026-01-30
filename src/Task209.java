import java.util.Scanner;

public class Task209 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = Math.abs(n);
        boolean check = false;

        do {
            int d = a % 10;

            if (d % 2 != 0) {
                check = true;
                break;
            }

            a /= 10;
        } while (a > 0);

        System.out.println(check);
    }
}
