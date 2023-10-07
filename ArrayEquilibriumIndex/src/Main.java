//Imports
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {

        int[] arr=getArray();
        int equilibriumIndex=findEquilibriumIndex(arr);
        System.out.println(equilibriumIndex);

    }

    public static int[] getArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements need to have in the Array: ");
        int size=sc.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }

    public static int findEquilibriumIndex(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            int leftSum=0;
            for(int j=0;j<i;j++)
            {
                leftSum=leftSum+arr[j];
            }
            int rightSum=0;
            for(int j=i+1;j< arr.length;j++)
            {
                rightSum=rightSum+arr[j];
            }
            if(leftSum==rightSum)
            {
                return i;
            }
        }
        return -1;
    }

}

//Java


