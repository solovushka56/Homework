import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;

public class HomeworkTask5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        var str = in.nextLine();
        String[] arr = str.split(" ");
        int day = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int year = Integer.parseInt(arr[2]);

        String[] daysOfWeek = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

        if (month < 3)
        {
            month += 12;
            year -= 1;
        }

        int m = year % 100;
        int n = year / 100;
        int k = day + (13 * (month + 1)) / 5 + m + m / 4 + n / 4 + 5 * n;

        int dayOfWeek = k % 7;

        System.out.println(daysOfWeek[k % 7]);
    }
}