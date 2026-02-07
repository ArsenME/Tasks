import java.util.Scanner;
public class Task221 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the first number for search");
        int a = sc.nextInt();
        System.out.println("Enter the second number for search");
        int b = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                System.out.println("Enter the element ["+ i +"]");
                arr[i] = sc.nextInt();
            }
            for(int i = a; i<=b; i++){
                sum+=arr[i];

            }

    }
}
