import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value;
        int ch;
        char decision;

        do {
            System.out.println("\nMenu based app - Unit conversion for Distance\n");
            System.out.println("1. CM to M");
            System.out.println("2. M to KM");
            System.out.println("3. KM to M");
            System.out.println("4. M to CM");

            System.out.print("\nEnter your menu: ");
            choice = scanner.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("\nPlease enter the CM Value: ");
                    value = scanner.nextDouble() / 100;
                    System.out.println(value + " CM = " + value + " M");
                    break;
                case 2:
                    System.out.print("\nPlease enter the M Value: ");
                    value = scanner.nextDouble() / 1000;
                    System.out.println(value + " M = " + value + " KM");
                    break;
                case 3:
                    System.out.print("\nPlease enter the KM Value: ");
                    value = scanner.nextDouble() * 1000;
                    System.out.println(value + " KM = " + value + " M");
                    break;
                case 4:
                    System.out.print("\nPlease enter the M Value: ");
                    value = scanner.nextDouble() * 100;
                    System.out.println(value + " M = " + value + " CM");
                    break;
                default:
                    System.out.println("\nInvalid input, please choose a valid option from the menu.");
            }

            System.out.print("\nDo you want to Continue (y/n)?: ");
            decision = scanner.next().charAt(0);

        } while (decision == 'y' || decision == 'Y');

        scanner.close();
    }
}