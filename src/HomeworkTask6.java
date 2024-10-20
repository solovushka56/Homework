import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;

public class HomeworkTask6
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        while (b != 0)
        {
            int trans = a & b;
            int sumWithNoTransition = a ^ b;
            a = sumWithNoTransition;
            b = trans << 1;

        }
        System.out.println(a);
    }
}