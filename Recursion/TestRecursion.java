import java.util.Scanner;
import java.util.Arrays;
public class TestRecursion
{
   public static void printDigits(int digits)
   {
      int lastD = digits % 10;
      if (digits == 0)
         return ;
      else 
         printDigits(digits/10);
      System.out.println(lastD);
   }
   
   public static int sumArray(int numArray[], int numbersToAdd)
   {
      if(numbersToAdd == 0)
         return 0;
      else 
         return numArray[numbersToAdd - 1] + sumArray(numArray, numbersToAdd - 1);
   }
   
   
   
   public static void main(String[] args)
   {
      //Test the printDigits method
      printDigits(23145);
      
      //Test the sumArray method
      int[] a ={1,3,2,5};
      System.out.println(sumArray(a,3));
      System.out.println(sumArray(a,4));

   }
}