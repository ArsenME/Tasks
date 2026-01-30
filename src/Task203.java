import java.util.Scanner;

public class Task203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);
        int a =  n;
       int i =1;
        do{
            i *= a % 10;
            a = a / 10;

        }while(a > 0);

        System.out.println(i);

    }
}
