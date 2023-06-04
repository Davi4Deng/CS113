public class PairOfDice
{
   private Die die1, die2;
   
   public PairOfDice(Die die1, Die die2)
   {

      this.die1 = die1;
      this.die2 = die2;
      
   }
   public Die getDie1()
   {
      return die1;
   }
   public void setDie1(Die die1)
   { 
      this.die1 = die1;
   }
   public Die getDie2()
   {
      return die2;
   }
   public void setDie2(Die die2)
   { 
      this.die2 = die2;
   }
   public void roll()
   {
      die1.roll();
      die2.roll();
   }
   public String toString()
   {
      return "\"Colors of both dice: " + die1.getColor() + ", " + die2.getColor() + "\"";
   }
   public int pairSum()
   {
      return die1.getFaceValue() + die2.getFaceValue();
   }
   public boolean equals(PairOfDice other)
   {
      PairOfDice pairOfDice = other;
      if(this.getDie1().getColor().equals(pairOfDice.getDie1().getColor()) && this.getDie1().getFaceValue()==pairOfDice.getDie1().getFaceValue())
      {   if(this.getDie2().getColor().equals(pairOfDice.getDie2().getColor()) && this.getDie2().getFaceValue()==pairOfDice.getDie2().getFaceValue())
            return true;
      }   
      else if(this.getDie1().getColor().equals(pairOfDice.getDie2().getColor()) && this.getDie1().getFaceValue()==pairOfDice.getDie2().getFaceValue())
      {
         if(this.getDie2().getColor().equals(pairOfDice.getDie1().getColor()) && this.getDie2().getFaceValue()==pairOfDice.getDie1().getFaceValue())
            return true;
      }  
      return false;
   }
}