public class Fibonacci {

    public boolean isFibonacci(int n) {
        int a = 0, b = 1;

        while (a < n) {
            int next = a + b;
            a = b;
            b = next;
        }

        return a == n;
    }
}
