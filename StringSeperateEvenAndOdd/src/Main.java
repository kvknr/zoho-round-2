
import java.util.*;


public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int next = in.nextInt();

        in.nextLine();

        for (int i = 0; i < next; i++)
        {
            String string = in.nextLine();
            char[] charArray = string.toCharArray();

            for (int j = 0; j < charArray.length; j++)
            {
                if (j % 2 == 0)
                {
                    System.out.print(charArray[j]);
                }
            }

            System.out.print(" ");

            for (int j = 0; j < charArray.length; j++)
            {
                if (j % 2 != 0)
                {
                    System.out.print(charArray[j]);
                }
            }

            System.out.println();
        }

        in.close();
    }
}