import java.util.Scanner;

public class Task205 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  a = Math.abs(n);
        int i   = 0;
        do{
            n = a %10;
            a = a / 10;

            i++;


            System.out.print(n);
        }while(a > 0);




        }


    }

