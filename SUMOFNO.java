public class SUMOFNO {
    public static void main(String[] args) {
        int n = 1234;
        int sum = 0;
        int m = 0;
        while (n != 0) {
            m = n % 10;
            sum = sum + m;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
