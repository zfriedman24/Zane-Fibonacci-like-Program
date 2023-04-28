public class FibonacciLike extends Fibonacci {
    int amountofNumbersInSequence = 0;
    int number1 = 0;
    int number2 = 0;

    public FibonacciLike(int amountofNumbersInSequence, int number1, int number2) {
        this.amountofNumbersInSequence = amountofNumbersInSequence;
        this.number1 = number1;
        this.number2 = number2;
    }

    public void run() {
        // 2 4 6 10 16
        System.out.println(number1);
        System.out.println(number2);
        int newNumber = number1 + number2;
        System.out.println(newNumber);
        for (int i = 3  ;i < amountofNumbersInSequence; i = i + 1 ) {

            newNumber = number2 + newNumber;
            number1 = newNumber ;
            number2 = newNumber ;
            System.out.println(newNumber);
        }
    }

}