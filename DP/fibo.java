public class fibo{

        int fib(int n){
            if(n<=1){
                return n;
            }
            return fib(n-1) + fib(n-2);
        }

    public static void main(String[] args) {
        int n = 4; 
        fibo fibonacci = new fibo();

        System.out.println("Fibonacci of " + n + " is: " + fibonacci.fib(n));
    }
}