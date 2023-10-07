import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[][] mat=getMatrix();
        changeAdjacent(mat);
        printMatrix(mat);
    }
    public static int[][] getMatrix()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int rows= sc.nextInt();
        System.out.println("Enter Number of Columns: ");
        int cols= sc.nextInt();
        System.out.println("Enter Element One by One: ");
        int[][] mat=new int[rows][cols];
        for (int i=0;i<mat.length;i++)
        {
            for (int j=0;j<mat[i].length;j++)
            {
                mat[i][j]= sc.nextInt();
            }
        }
        return  mat;
    }

    public static void printMatrix(int[][] mat)
    {
        for (int[] arr:mat)
        {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void changeAdjacent(int[][] mat)
    {
        for (int i=0;i< mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1) {
                    //Top-Left
                    if(isValidPosition(i-1,j-1, mat.length, mat[i].length))
                    {
                        mat[i-1][j-1]=0;
                    }
                    //Top
                    if(isValidPosition(i-1,j, mat.length, mat[i].length))
                    {
                        mat[i-1][j]=0;
                    }
                    //Top-Right
                    if(isValidPosition(i-1,j+1, mat.length, mat[i].length))
                    {
                        mat[i-1][j+1]=0;
                    }
                    //Right
                    if(isValidPosition(i,j+1, mat.length, mat[i].length))
                    {
                        mat[i][j+1]=0;
                    }
                    //Left
                    if(isValidPosition(i,j-1, mat.length, mat[i].length))
                    {
                        mat[i][j-1]=0;
                    }
                    //BottomLeft
                    if(isValidPosition(i+1,j-1, mat.length, mat[i].length))
                    {
                        mat[i+1][j-1]=0;
                    }
                    //Bottom
                    if(isValidPosition(i+1,j, mat.length, mat[i].length))
                    {
                        mat[i+1][j]=0;
                    }
                    //BottomRight
                    if(isValidPosition(i+1,j+1, mat.length, mat[i].length))
                    {
                        mat[i+1][j+1]=0;
                    }
                }
            }
        }
    }

    public static boolean isValidPosition(int i,int j,int rows, int cols)
    {
        return (i>=0&&i<rows&&j>=0&&j<cols);
    }
}