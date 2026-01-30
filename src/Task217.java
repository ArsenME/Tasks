import java.util.Scanner;
public class Task217 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = Math.abs(a);
        int[] arr = new int[n];
        int equal = 1;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(i % 2 == 0){
                continue;
            }
            equal *= arr[i];

        }
        System.out.println(equal);
        System.out.print("[");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + ",");

        }
        System.out.println("]");
    }
}
