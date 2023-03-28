import java.util.Scanner;

public class Substring {
    public static void main(String[] args)
       {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("Enter the starting index: ");
        int startIndex = input.nextInt();

        System.out.print("Enter the ending index: ");
        int endIndex = input.nextInt();

        String subStr = str.substring(startIndex, endIndex + 1);

        System.out.println("Substring of " + str + " from " + startIndex + " to " + endIndex + " is: " + subStr);
    }
}