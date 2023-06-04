/*write a program that asks the user for the total monetary of coins in their pocket.
eg. 125.
the program prints to the screen a message similar to:
you have 1 dollar(s) and 25 cents in your pocket.
eg. user enters 213
you have 2 dollar(s) and 13 cents in your pocket.
*/


import java.util.Scanner;

public class pocketMoney
{
     public static void main(String[] args)
     {
         int money;
         
         
         Scanner scan = new Scanner(System.in);
         
         System.out.print("How many total cents do you have in your pocket:");
         money = scan.nextInt();
         int dollar = money / 100;
         int cents = money % 100;
         
         
         System.out.println("you have " + dollar + " dollar(s) and " + cents + " in your pocket." );
     }
}