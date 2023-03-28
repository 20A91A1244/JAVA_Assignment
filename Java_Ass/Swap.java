import java.util.*;
 
class Swap {
     static void swapValuesUsingThirdVariable(int num1, int num2)
    {
        
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Value of num1 is " + num1
                           + " and Value of num2 is " + num2);
    }
 
    public static void main(String[] args)
    {
        int num1 = 10, num2 =15;
 
        
        swapValuesUsingThirdVariable(num1, num2);
    }
}

 