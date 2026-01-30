import java.util.Scanner;

public class Task201 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        n = Math.abs(n);
    int i =0;
    do{
        n = n/10;
        i++;
    } while(n > 0);
        System.out.println(i);

    }
}
