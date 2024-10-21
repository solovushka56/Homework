import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class HomeworkTask7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] triangle = new int[n][];

        for (int i = 0; i < n; i++)
        {
            triangle[i] = new int[i+1];
            for (int j = 0; j < i+1; j++)
            {
                triangle[i][j] = in.nextInt();
            }
        }



        int[][] maxSums = new int[n][];
        for (int i = 0; i < n; i++)
        {
            maxSums[i] = new int[i + 1];
        }

        for (int j = 0; j < triangle[n - 1].length; j++)
        {
            maxSums[n - 1][j] = triangle[n - 1][j];
        }

        for (int i = n - 2; i >= 0; i--)
        {
            for (int j = 0; j <= i; j++)
            {
                maxSums[i][j] = triangle[i][j] + Math.max(maxSums[i + 1][j], maxSums[i + 1][j + 1]);
            }
        }

        System.out.println(maxSums[0][0]);
    }
}