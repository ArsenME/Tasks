public class Task163 {
    public static void main(String[] args){
        for (int i = 10000; i > 1000; i--){

            int n = i * 18;
            int j = (int)Math.sqrt(n);

            if(j * j == n){
                System.out.println(i);
                break;
            }

        }
    }
}
