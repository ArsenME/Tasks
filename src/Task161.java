public class Task161 {
    public static void main(String[] args) {

        for (int i = 1014; i < 10000; i++) {
            int n = i * 26;
            int j = (int)Math.sqrt(n);

            if (j * j == n) {
                System.out.println(i);
                break;
            }
        }
    }
}
