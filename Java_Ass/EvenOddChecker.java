import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        char ch;

        do {
            System.out.println("\nMenu based app - Even/Odd Checker\n");
            System.out.print("Please enter the number: ");
            n = scanner.nextInt();

            if (n % 2 == 0)
               {
                System.out.println("\nThe given number - " + number + " is an EVEN Number");
            } 
              else
               {
                System.out.println("\nThe given number - " + number + " is a ODD Number");
            }

            System.out.print("\nDo you want to Continue (y/n)?: ");
            choice = scanner.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');

        scanner.close();
    }
}

