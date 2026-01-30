import java.util.Scanner;
public class Task207 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a =  Math.abs(n);
        boolean check = false;

        do{
            if(a % 10 == 2){
                check = true;
                break;
            }
            a = a / 10;
        }while(a<0);

        System.out.println(check);
    }
}
