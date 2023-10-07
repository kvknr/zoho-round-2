// Java program to print an array in alternate
// sorted manner
import java.io.*;
import java.util.Arrays;

public class Main
{
    // Function to print alternate sorted values
    static void alternateSort(int arr[], int n)
    {
        Arrays.sort(arr);

        // Printing the last element of array
        // first and then first element and then
        // second last element and then second
        // element and so on.
        int i = 0, j = n-1;
        while (i < j) {
            System.out.print(arr[i++] + " "); //swap below
            System.out.print(arr[j--] + " "); //swap above
        }

        // If the total element in array is odd
        // then print the last middle element.
        if (n % 2 != 0)
            System.out.print(arr[i]);
    }

    /* Driver program to test above functions */
    public static void main (String[] args)
    {
        int arr[] = {5, 8, 1, 4, 2, 9, 3, 7, 6};
        int n = arr.length;
        alternateSort(arr, n);
    }
}

