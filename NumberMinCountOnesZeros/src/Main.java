// Java program to represent a given
// number as sum of minimum possible
// pseudobinary numbers

import java.util.*;
import java.lang.*;

class Main
{
    public static int pseudoBinary(int n)
    {
        int count=0;
        // Repeat below steps until n > 0
        while (n != 0)
        {
            // calculate m (A number that has same
            // number of digits as n, but has 1 in
            // place of non-zero digits 0 in place
            // of 0 digits)
            int temp = n, m = 0, p = 1;
            while(temp != 0)
            {
                int rem = temp % 10;
                temp = temp / 10;

                if (rem != 0)
                    m += p;

                p *= 10;
            }

            System.out.print(m + " ");
count++;
            // subtract m from n
            n = n - m;
        }
        System.out.println(" ");
        return count;
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 33;
        int count=pseudoBinary(n);
        System.out.println(count);
    }
}