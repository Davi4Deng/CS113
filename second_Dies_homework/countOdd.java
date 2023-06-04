public class countOdd
{
   public int totalOdds(int[] numArray)
   {
      int count = 0;
      for (int index = 0; index < numArray.length; index++)
      {
         if(numArray[index] % 2 == 1)
            count++;
      }
      return count;
   }
}