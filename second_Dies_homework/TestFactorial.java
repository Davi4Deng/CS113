public class TestFactorial
{
   public static int factorialNonRec(int N)
   {
      int product = 1;
      for (int num = 1; num <= N; num++)
      {
         product *= num;
      }
      return product;
   }
   
   public static int factorial(int N)
   {
      int result;
      if (N == 1)
         result = 1;
      else
         result = N * factorial(N-1);
      return result;
   }
   
   public static void main(String[] args)
   {
      System.out.println(factorialNonRec(5));
      System.out.println(factorial(4));
   }
}