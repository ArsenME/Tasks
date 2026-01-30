import java.util.Random;

public class Task185 {
    public static void main(String[] args) {

    Random rand= new Random();
    double pay =  30000;

    int mounts =1;
    do{

        int procent = rand.nextInt(1,25);
        pay += pay * procent / 100;
        mounts++;

        } while(pay < 100000);
        System.out.println("the count is mount:" + mounts);
        System.out.println("the pay is:" + pay);

    }



    }

