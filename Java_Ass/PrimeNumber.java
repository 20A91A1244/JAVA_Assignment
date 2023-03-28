import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        boolean isPrime = true;

        
        for (int i = 2; i < n; i++)
           {
            if (n % i == 0) 
              {
                isPrime = false;
                break;
            }
        }

        if (isPrime) 
          {
            System.out.println("The given number " + n + " is a prime number");
        } else 
          {
            System.out.println("The given number " + n + " is NOT a prime number");
        }
    }
}



