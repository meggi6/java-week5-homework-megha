package calculate;

import java.util.Scanner;

/**
 * 5. With the result it’s also print one more
 *  message “Would you like to do more calculation Please enter “Y” or “N” :”
 *  (Hint use while loop if user enter Y program asking the user to enter First Number,
 *  and if user enter N programme should terminate)
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        char ask;

        // enter details and ask if user want more calculations after having one time.
        do{
            System.out.println("Enter first number");
            int a = scanner.nextInt();
            System.out.println("Enter second number");
            int b = scanner.nextInt();
            System.out.println("Enter symbol");
            char symbol = scanner.next().charAt(0);
            calculator.calculateResult(a,b,symbol);
            System.out.println("Would you like to do more calculation? Please enter “Y” or “N");
            ask = scanner.next().toUpperCase().charAt(0);
        } while (ask == 'Y');

        scanner.close();
    }
}
