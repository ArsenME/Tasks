import java.util.Scanner;

public class Task225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the t number:");
        int t = sc.nextInt();
        System.out.println("Enter the length of the array:");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        int equal = 1;
        for (int i  = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(Math.abs(arr[i]) > t){

                equal *= arr[i];
            }
        }
        System.out.print("[");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("]");
        System.out.println("equal: "+equal);




    }
}
