package Java;
import java.util.Scanner;
public class Calculator {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        double first = input.nextDouble();
        double second = input.nextDouble();
        System.out.println("Enter any operator (+,-,*,/,%):");
        char ch = input.next().charAt(0);
        double result;
        switch (ch) {
            case '+':
            result = first+second;
            break;
            case '-':
            result = first-second;
            break;
            case '*':
            result = first * second;
            break;
            case '/':
            result = first/second;
            break;
            case '%':
            result = first % second; 
            break;
            default:
                System.out.println("Invalid Operator");
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f",first,ch,second,result);
    }
    
}

//input 
// Enter two numbers 
// 24 45
// Enter the operator (+,-,*,/,%)

//output
//24.0+ 45.0 = 69.0