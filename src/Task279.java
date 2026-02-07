import java.util.Scanner;

public class Task279 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int size = 0;
        char[] str = new char[n];
        for (int i = 0; i < n; i++) {
            char ch  = sc.next().charAt(0);
            if(ch > 'k'){
                str[size] = ch;
                size++;
            }
        }
        for(int i = 0; i < size; i++){
            System.out.println(str[i]+ ",");

        }
    }

}
