import java.util.Scanner;

public class Task247 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int k =0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > i){

                sum += arr[i] * arr[i];
                k++;

            }
        }
        sum = sum / k;
        System.out.println(sum);
    }
}
