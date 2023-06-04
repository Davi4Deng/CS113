public class Die
{
   private int faceValue;
   private String color;
   
   public Die()
   {
      faceValue = (int)(Math.random()*6)+1;
      roll();
   }
   public Die(int num, String s)
   {
      faceValue = num;
      color = s;
   }
   public void roll()
   {
      faceValue = (int)(Math.random() * 6) + 1;
   }
   public int getFaceValue()
   {
      return faceValue;
   }
   public void setFaceValue(int num)
   {
      faceValue = num;
    }
   public String getColor()
   {
      return color;
   }
   public void setColor(String s)
   {
      color = s;
   }
   public String toString()
   {
      return "Die value" + faceValue + "\tDie color: " + color;
   }
   
}