import java.util.Scanner;

public class Task153 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        for(int i =3 ; i < n; i++){
            if(n % i == 2){
                sum +=i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
