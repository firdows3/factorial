
        package factorial;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int i,fact=1;
        Scanner num1 = new Scanner(System.in);
        System.out.println("enter the number");
        int num = num1.nextInt();
        for (i=1;i<=num;i++) {
            fact = fact * i;
        }
            System.out.println(fact);
        int number = 1429;
        int reversed = 0;
        System.out.println("the original number is : "+ number);
        while (number != 0)
        {int digit = number%10;
            reversed = reversed * 10 + digit;

        }
        System.out.println("the reversed number is : " +reversed);
    }

}
