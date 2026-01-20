import java.util.Scanner;
public class Task57 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number =  scanner.nextInt();

        float  a = number%10;

        float b = (number /10) % 10;

        float c = number / 100;

try{
    if(a == 0){
        System.err.println("Error: A specific condition was not met. Exiting program.");

        System.exit(1);


    }
}
            catch(Exception e){
                System.err.println("An unexpected exception occurred: " + e.getMessage());
                System.exit(1);

        }


        if (number >300){
            a=b/a;

        }
        a = c/a;

        System.out.println(a);

        }


    }

