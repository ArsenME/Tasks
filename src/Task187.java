import java.util.Scanner;

public class Task187 {
    public static void main(String[] args) {
        boolean check = true;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n <= 1) {
            check = false;

        }
        else{
          for(int i = 2; i * i <= n; i++){
              if(n % i == 0){
                  check = false;
                  break;
              }

          }
        }
        System.out.println(check);
    }


}
