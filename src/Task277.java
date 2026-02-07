import java.util.Scanner;

public class Task277 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] arr = new char[n];

        int size = 0;

        for (int i = 0; i < n; i++) {
            char ch = sc.next().charAt(0);

            if (ch != 'd') {
                arr[size] = ch;
                size++;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
