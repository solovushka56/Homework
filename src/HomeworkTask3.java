import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTask3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        ArrayList<Integer> uniques = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
        {
            if (i == 0 || arr[i] != arr[i-1])
            {
                uniques.add(arr[i]);
            }

        }

        for(int i : uniques)
        {
            System.out.print(" " + i);

        }

    }

}
