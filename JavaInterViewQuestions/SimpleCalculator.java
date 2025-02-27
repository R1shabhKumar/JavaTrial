// 21. write a java program to implement a simple calculator(addition,subtraction,multiplication,division)
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Choose Operation( + , - , * , / ): ");
        char operation = scanner.next().charAt(0);

        double result;

        switch(operation){
            case '+':
                result = num1 + num2;
                break;

            case'-':
                result = num1 - num2;
                break;

            case '*':
                result = num1*num2;
                break;

            case '/':
                result = (double) num1/num2;
                break;

            default:
                System.out.println("Invalid choice..");
                return;
        }
        System.out.println("Result: "+result);
        scanner.close();
    }
}
