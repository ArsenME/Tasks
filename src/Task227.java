import java.util.Scanner;
public class Task227 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the k number");
        int k = s.nextInt();
        System.out.println("Enter the size of array");
        int n = s.nextInt();
        int[] arr =  new int[n];
        int sum= 0, count= 0;
        for(int i = 0 ; i < n ; i++){
            arr[i] = s.nextInt();
            if(i % k == 0){
                count++;
                sum += arr[i];


            }
        }
            if (count > 0 ) {
                System.out.println((double) sum/count);

            }
            else {
                System.out.println("No elements divisible by k");
            }

    }
}
