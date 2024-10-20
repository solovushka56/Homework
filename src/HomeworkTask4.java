import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTask4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        var str1 = in.nextLine();
        var str2  = in.nextLine();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String ans = (Arrays.equals(arr1, arr2)) ? "Yes" : "No";
        System.out.println(ans);
    }
}
