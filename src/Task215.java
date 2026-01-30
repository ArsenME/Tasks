import java.util.Scanner;
public class Task215 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = Math.abs(a);
        int sum = 0;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            if(i % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.print(sum);


    }

}
