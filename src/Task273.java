import java.util.Scanner;

public class Task273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[] str = new char[n];
        int iterationSum = 0;
        for (int i = 0; i < n; i++) {
            str[i] = sc.next().charAt(0);
            if(str[i] == 's'){
                iterationSum += i;

            }
        }

        System.out.println(iterationSum);
    }
}
