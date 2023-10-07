//Given an array of integers, replace every element with the next greatest element (the greatest element on the right side) in the array. Since there is no element next to the last element, replace it with -1. For example, if the array is {16, 17, 4, 3, 5, 2}, then it should be modified to {17, 5, 5, 5, 2, -1}.

//Imports
import java.util.*;

//Main Class
public class Main
{
    public static void main(String[] args)
    {
        int[] arr =getArray();
        System.out.println("User Array");
        printArray(arr);
        System.out.println();
        System.out.println("Modified Array");
        nextGreatest(arr);
        printArray(arr);


    }

    public static int[] getArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Array elements need to have: ");
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Element One by One: ");
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr)
    {
        for (int element:arr)
        {
            System.out.print(element+" ");
        }
    }

    public static void nextGreatest(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int max_value=-1;
            for(int j=i+1;j<arr.length;j++)
            {
              max_value=Math.max(max_value,arr[j]);
            }
            arr[i]=max_value;
        }

    }
    


}


