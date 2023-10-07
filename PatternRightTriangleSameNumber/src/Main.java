// Java code to demonstrate printing 
// pattern of numbers
class Main
{

    // function to print a row
    static void print_row(int no, int val)
    {
        // base case
        if (no == 0)
            return;
        System.out.print(val + " ");

        // recursively calling print_row()
        print_row(no - 1, val);
    }

    // function to print the pattern
    static void pattern(int n, int num)
    {
        // base case
        if (n == 0)
            return;
        print_row(num - n + 1, num - n + 1);
        System.out.println();

        // recursively calling pattern()
        pattern(n - 1, num);
    }

    // Driver Code
    public static void main(String[] args)
    {
        int n = 5;
        pattern(n, n);
    }
}

