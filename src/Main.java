public class Main {
    public static void main(String[] args) {

        System.out.println("Let's run Fibonacci");
        FibonacciLike Fibonacci = new FibonacciLike(5, 2, 4);
        // 2 4 6 10 16
        Fibonacci.run();

        FibonacciLike Fibonacci2 = new FibonacciLike(7, -1, 2);
        // -1 2 1 3 4 7 11
        Fibonacci2.run();


    }
}