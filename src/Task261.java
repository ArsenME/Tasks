import java.util.Scanner;

public class Task261 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int n1 = sc.nextInt();
        System.out.println("Enter the size of second array");
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int sum1 = 0;
        int sum2 = 0;
            for(int i = 0 ; i < n1 ; i++){
                arr1[i] = sc.nextInt();
                    sum1 += arr1[i];


            }
            sum1 = sum1/n1;
        for(int i = 0 ; i < n2 ; i++){
            arr2[i] = sc.nextInt();
            sum2 += arr2[i];


        }

        sum2 = sum2/n2;
        int sum = sum1 + sum2;
        System.out.println(sum);


    }
}
