//make 
import java.io.*;
import java.util.Arrays;
public class ArrayPractice
{
   private static int findHighestScore(int[] arr)
   {
      int maxScore = arr[0];
      for (int i = 0; i < arr.length; i++)
      {
         if (arr[i] > maxScore)
         {
         maxScore = arr[i];
         }
      }
      return maxScore;
   }
   
   
public static void main(String[] args)
{  
      int[] scores = new int[10];
      //populate the array with random integers [0-100]
      for (int i = 0; i < scores.length; i++)
      {  
         scores[i] = (int)(Math.random() * 101);
         System.out.print(scores[i] + " ");
      }
      //System.out.println(Arrays.toString(scores));
      System.out.println();
      
      //calculate the average
      int totalScore = 0;
      for (int i = 0; i < scores.length; i++)
         totalScore += scores[i];
      System.out.println("Average score: " + (double)totalScore/scores.length);
      
      //test your findHighestScore and print on the screen
      System.out.println("Highest Score: " + findHighestScore(scores));

   }
} 