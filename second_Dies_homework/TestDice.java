import java.util.Arrays;
import java.util.*;
public class TestDice
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      Die arr[] = new Die[50];

      int count = 0;
      for(int index = 0; index < arr.length; index++)
      {
         arr[index] = new Die();
         System.out.println("No." + (index + 1) + " Dice. Face value is: " + arr[index].getFaceValue());
         if(arr[index].getFaceValue() % 2 == 1)
            count++;

      }
      System.out.println(Arrays.toString(arr));
      System.out.print("The total number of odd face value is: " + count);
   }
}