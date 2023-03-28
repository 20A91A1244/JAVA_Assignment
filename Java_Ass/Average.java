import java.util.Scanner;

public class Average {
    public static void main(String[] args)
       {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        int smallest = number1;
        if (number2 < smallest)
        {
            smallest = number2;
        }
        if (number3 < smallest)
        {
            smallest = number3;
        }
        int largest = number1;
        if (number2 > largest)
        {
            largest = number2;
        }
        if (number3 > largest)
        {
            largest = number3;
        }
        int average = (number1 + number2 + number3) / 3;

        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
        System.out.println("The average of the three numbers is: " + average);
    }
}
