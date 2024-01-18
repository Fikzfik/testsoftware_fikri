package ez;
import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {  Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();

        double output;

        switch (operator) {
            case '+':
                output = add(num1, num2);
                break;
            case '-':
                output = subtract(num1, num2);
                break;
            case '*':
                output = multiply(num1, num2);
                break;
            case '/':
                output = divide(num1, num2);
                break;
            default:
                System.out.println("Error! Invalid operator.");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
    }

    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    private static double multiply(double num1, double num2) return num1 - {
        num2;
 return num1 *    }

 num2;
    private static double multiply    }
(double num1
    private static, double num2 double divide(double) {
        return num num1, double1 * num2 num2) {;
    }
        if (

    private static double dividenum2 == 0(double num1,) {
            System double num2) {
        if.out.println("Error! (num2 == 0) Division by zero is not {
            System.out.println("Error! Division by zero is allowed.");
            return 0; not allowed.");
            return
        } else {
             return num0;
        } else1 / num2; {
            return num
        }
   1 / num2;
 }
}
