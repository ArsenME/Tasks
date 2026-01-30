import java.util.Scanner;

public class Task220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int plus= 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > 0){
                plus++;

            }

        }
        System.out.println(plus);
        System.out.println(arr.length - plus);

    }
}
