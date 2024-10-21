import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class HomeworkTask10
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        String underStr = in.nextLine();




        int[] prefixTablet = new int[underStr.length()];
        int maxPrefLength = 0;
        for (int i = 1; i < underStr.length(); i++)
        {
            while (maxPrefLength > 0 && underStr.charAt(i) != underStr.charAt(maxPrefLength))
            {
                maxPrefLength = prefixTablet[maxPrefLength - 1];
            }
            if (underStr.charAt(i) == underStr.charAt(maxPrefLength))
            {
                maxPrefLength++;
            }
            prefixTablet[i] = maxPrefLength;
        }



        int understrIndex = 0;

        for (int i = 0; i < str.length(); i++)
        {
            while (understrIndex > 0 && str.charAt(i) != underStr.charAt(understrIndex))
            {
                understrIndex = prefixTablet[understrIndex - 1];
            }

            if (str.charAt(i) == underStr.charAt(understrIndex))
            {
                understrIndex++;
            }

            if (understrIndex == underStr.length())
            {
                System.out.print((i - underStr.length() + 1) + " ");
                understrIndex = prefixTablet[understrIndex - 1];
            }
        }



    }
    public  static  void find(String underStr, String text)
    {

    }

}