import java.util.Scanner;
public class Task275 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        char[] str = new char[n];
        for(int i =0;i < n; i++){
            str[i] = sc.next().charAt(0);
            if(str[i] < 'k'){
                counter++;

            }

        }
        System.out.println(counter);
    }
}
