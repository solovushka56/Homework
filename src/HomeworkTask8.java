import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class HomeworkTask8
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        moveTower(n, 'A', 'C', 'B');

    }
    public static void moveTower(int n, char base_st, char target_st, char help_st)
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from " + base_st + " to " + target_st);
            return;
        }
        moveTower(n-1, base_st, help_st, target_st);

        System.out.println("Move disk " + n + " from " + base_st + " to " + target_st);

        moveTower(n-1, help_st, target_st, base_st);
    }

}

