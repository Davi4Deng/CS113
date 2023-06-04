import java.util.Random;
import java.util.Arrays;

public class Driver
{

   public static void main(String[] args)
   {      
      int totalValue = 0;
      int totalTails = 0;
      
      MonetaryCoin[][] coins = new MonetaryCoin[5][5];
      Random rand = new Random();
      
      for (int row = 0; row < coins.length; row++)
      {
         for(int column = 0; column < coins[row].length; column++)
         { 
            MonetaryCoin coin = new MonetaryCoin(rand.nextInt(100) + 1);
            coin.flip();
            if (coin.isHeads() != true)
            {
               totalValue += coin.getValue();
               totalTails++;
            }
            
         }
      }
      System.out.print("The total value is: " + totalValue 
                        + ".\nThe number of Tail is: " + totalTails 
                        + ".\nThe average monetary value of all Tails is: " 
                        + (double)(totalValue)/totalTails);
      
   }

}