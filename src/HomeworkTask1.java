import java.util.Scanner;

public class HomeworkTask1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int reversed = 0;

        while (n != 0)
        {
            int num = n % 10;
            reversed = reversed * 10 + num;

            n /= 10;
        }
        System.out.println(reversed);
    }
}
