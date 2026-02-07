import java.util.Scanner;

public class Task249 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int d = 0;
        System.out.println("enter k number: ");
            int k = sc.nextInt();
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(Math.abs(arr[i] - i) > k ){
                    d++;

                }
            }
            System.out.println(d);

        }



}
