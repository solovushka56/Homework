import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTask9
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String numStr = String.valueOf(n);
        ArrayList<String> places = new ArrayList<>();
        char[] chars = numStr.toCharArray();

        placeGenerateRec(chars, 0, places);

        for (String i : places)
        {
            if ((i.startsWith("0") && i.length() > 1) == false)
            {
                System.out.println(i);
            }
        }
    }

    public static void placeGenerateRec(char[] array, int index, ArrayList<String> result)
    {
        String str = new String(array);
        if (index == array.length - 1 && !result.contains(str))
        {
            result.add(str);
        }
        else
        {
            for (int i = index; i < array.length; i++)
            {
                swap(array, index, i);
                placeGenerateRec(array, index + 1, result);
                swap(array, index, i);
            }
        }
    }

    private static void swap(char[] array, int i, int j)
    {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}