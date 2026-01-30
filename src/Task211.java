import java.util.Scanner;
public class Task211 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int n = Math.abs(a);
      int count = 0;
      int[] arr = new int[n];
      int sum = 0;
      for(int i = 0 ; i < n; i++){
          arr[i] = sc.nextInt();
          if(arr[i] > 0){
              sum += arr[i]*arr[i];
              count++;
      }




      }

        System.out.print("[");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]);
            System.out.print(",");
        }
        System.out.println("]");
        System.out.print(sum/count);
    }

}
