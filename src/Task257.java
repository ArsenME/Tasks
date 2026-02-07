import java.util.Scanner;
public class Task257 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int max =0;
        int d =0;
        int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();


            }
            for(int i = 0; i < n - 1; i++){
                if(arr[i + 1] == max){
                    break;
                }
                if(arr[i] < arr[i+1]){
                   max = arr[i + 1];
                    d = i;
                }




            }
        System.out.println(d + 1);


    }
}
