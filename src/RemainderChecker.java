public class RemainderChecker {
    public static void main(String[] args) {

        // Step 1: Create a double variable with a value of 20.00

        double firstNumber = 20.00;



        // Step 2: Create a second variable of type double with a value 80.00

        double secondNumber = 80.00;



        // Step 3: Add both numbers together, then multiply by 100.00

        double result = (firstNumber + secondNumber) * 100.00;



        // Step 4: Use the remainder operator to find the remainder when divided by 40.00

        double remainder = result % 40.00;



        // Step 5: Create a boolean variable that is true if the remainder is 0.00, otherwise false

        boolean isNoRemainder = (remainder == 0.00);



        // Step 6: Output the boolean variable

        System.out.println("Is there no remainder? " + isNoRemainder);



        // Step 7: Write an if-then statement that displays a message if there is a remainder

        if (!isNoRemainder) {

            System.out.println("Got some remainder");

        }

    }

}