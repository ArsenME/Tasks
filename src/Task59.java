import java.util.Scanner;

public class Task59 {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
 Scanner scanner = new Scanner(System.in);

 int number = scanner.nextInt();
        int a = number % 10;
        int b = (number / 10 ) % 10;
        int c = number / 100;
        int temp;
        int[] arr = {a,b,c};
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++ ){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            System.out.print("[");
            for(int k = 0; k < arr.length; k++){
                System.out.print(arr[k] + " ");

            }
            System.out.println("]");
        }
    }
}
