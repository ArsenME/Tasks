import java.util.Scanner;
public class Task189 {
    public static void main(String[] args){
    int f1 =1;
    int f2 =1;

        Scanner sc =  new Scanner(System.in);
        int n  = sc.nextInt();
        while( f2 <= n){
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        System.out.println(f2);

    }
}
