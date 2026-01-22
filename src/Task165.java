import java.util.Scanner;

public class Task165 {
    public static void main(String[] args){
        boolean t = false;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


            while (n % 3 == 0 ){
                n = n / 3;
            }

            if(n == 1) {
            t = true;

             }
        System.out.println(t);
    }
}
