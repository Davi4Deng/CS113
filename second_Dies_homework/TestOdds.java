public class TestOdds
{  
   public static int totalOdds(int[] numArray)
   {
      int count = 0;
      for (int index = 0; index < numArray.length; index++)
      {
         if(numArray[index] % 2 == 1)
            count++;
      }
      return count;
   }
   
   public static void main(String[] args)
   {
      int[] arr = {1, 7, 8, 3, 4, 9};

      
      System.out.print("The total number of odd intergers is: " + totalOdds(arr));
   }
   

}