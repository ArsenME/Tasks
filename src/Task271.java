import java.util.Scanner;

public class Task271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int s = 0;
        int n = sc.nextInt();
        char[] str =  new char[n];
        for(int i = 0;i < n;i++){
            str[i] = sc.next().charAt(0);
            if(str[i] == 'a' ){
                    s++;

            }

        }
        System.out.println(s);
    }
}
