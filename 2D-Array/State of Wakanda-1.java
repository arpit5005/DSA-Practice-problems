import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n= scn.nextInt();
    int m= scn.nextInt();
    int [][]arr= new int[n][m];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            arr[i][j]=scn.nextInt();
        }
    }
    traverse(arr);
 }
 public static void traverse(int[][]mat)
 {
    int n= mat.length;
    int m=mat[0].length;
       
        for(int col=0;col<m;col++)
        {
            if(col%2==0)
            {
              //even columns printing
                for(int row=0;row<n;row++)
                {
                    System.out.println(mat[row][col]);
                }
            }
            else{
              //odd columns printing
                for(int row=n-1;row>=0;row--)
                {
                    System.out.println(mat[row][col]);
                }
            }
        }
    
 }
}
