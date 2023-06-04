import java.util.Scanner;
public class ReverseArray
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the size of the array: ");
      int  size = scan.nextInt();
      
      //create and populate array
      int[] numArray = new int[size];
      for (int i = 0; i < numArray.length; i++)
      {
         System.out.print("Enter a number: ");
         numArray[i] = scan.nextInt();
         
      }
      //reverse the array
      int start = 0;
      int end = numArray.length - 1;
      while(start < end)
      {
         int temp = numArray[start];
         numArray[start] = numArray[end];
         numArray[end] = temp;
         start++; end--;
      }
      
      System.out.println("Reversed array: ");
      for (int number: numArray)
         System.out.print(number + " ");
      
      
   }
}