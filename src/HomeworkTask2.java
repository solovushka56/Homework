import java.util.Scanner;

public class HomeworkTask2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String string = in.nextLine();

        StringBuilder builder = new StringBuilder();

        int repeatsCurrent = 1;
        for (int i = 1; i <= string.length(); i++)
        {

            if(i < string.length() && string.charAt(i) == string.charAt(i-1))
            {
                repeatsCurrent += 1;

            }
            else
            {
                builder.append(string.charAt(i-1));
                builder.append(Integer.toString(repeatsCurrent));

                repeatsCurrent = 1;
            }
        }
        System.out.println(builder.toString());
    }
}
