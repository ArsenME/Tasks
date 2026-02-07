import java.util.Scanner;

public class Task241 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Please enter the k number");
        int k = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
            if(n % k == 0 ){
                sum += arr[i];

            }

        }

    }
}
