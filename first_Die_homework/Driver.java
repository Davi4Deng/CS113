import java.util.Random;

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
            coin.filp();
            if (coin.isHeads() == false)
            {
               totalValue += coin.getValue();
               totalTails++;
            }
            coins[row][column] = coin;
         }
      }
      System.out.print("The total value is: " + totalValue 
                        + ". The average monetary value of all heads is: " 
                        + (double)(totalValue)/totalTails);
      
   }

}