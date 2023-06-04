import java.util.Scanner;

/* Determine if sum of input number is even.
 * First input line is a single positive integer giving the
 * number of integers on the second line.
*/

public class SumOfPrevious {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int[] arr = new int[count];
		for(int i=0;i<count;++i) {
		  arr[i] = scan.nextInt();
         }
        
        System.out.print(SumOfPrevious(arr, count-1));

         
	}
    public static boolean SumOfPrevious(int[] arr, int i)
    {
        if (i == 0)
        {
            return false;
        }
        else
        {
            for (int j = 0; j < i; j++)
            {
                for (int k = 0; k < i; k++)
                {
                    if (arr[i] == arr[j] + arr[k])
                        return true;
                }
            } 
            return SumOfPrevious(arr, i-1);
        }
            
    }

}
