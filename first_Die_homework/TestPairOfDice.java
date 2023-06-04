public class TestPairOfDice
{
   public static void main(String[] args)
   {
      
      Die die1 = new Die(4, "Blue");
      
      Die die2 = new Die(1, "Red");
      
      PairOfDice pair1 = new PairOfDice(die1, die2);
      pair1.roll();//delete this line and line 17 to check the logic
      
      System.out.println("The sum of first pair dices is:" + pair1.pairSum());
      Die die3 = new Die(1, "Red");
      Die die4 = new Die(4, "Blue");
      PairOfDice pair2 = new PairOfDice(die3, die4);
      pair2.roll();//delete this line and line 11 to check the logic
     
      System.out.println("First pair: " + pair1.toString() + "   \" " + pair1.getDie1().getFaceValue() + "  " + pair1.getDie2().getFaceValue()+"\"");
      System.out.println("Second pair: " + pair2.toString() + "  \" " + pair2.getDie1().getFaceValue() + "  " + pair2.getDie2().getFaceValue()+"\"");
      
      if(pair1.equals(pair2))
         System.out.println("The two pairs are equal");
      else 
         System.out.println("The two pairs are not equal");
   }
   
}
