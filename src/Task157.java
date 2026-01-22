public class Task157 {
    public static void main(String[] args){
            int sum = 0;
        for(int i = 101; i <= 999; ){
            sum =  sum + i;
            if(i % 5 == 4){
                i+=2;
            }
            else{
                i++;
            }

        }
        System.out.println(sum);

    }
}
