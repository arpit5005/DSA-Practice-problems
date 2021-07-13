import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn =new Scanner(System.in);
    int r1= scn.nextInt();
    int c1= scn.nextInt();
    int [][]arr1=new int[r1][c1];
    for(int i=0;i<r1;i++)
    {
        for(int j=0;j<c1;j++)
        {
            arr1[i][j]= scn.nextInt();
        }
    }
    int r2= scn.nextInt();
    int c2= scn.nextInt();
    int [][]arr2=new int[r2][c2];
    for(int i=0;i<r2;i++)
    {
        for(int j=0;j<c2;j++)
        {
            arr2[i][j]= scn.nextInt();
        }
    }
    if(c1!=r2)
    {
        System.out.println("Invalid input");
    }
    else{
      int [][]res= new int[r1][c2]; 
    for(int i=0;i<r1;i++)
    {
        for(int j=0;j<c2;j++)
        {
            int val=0;
           for(int k=0;k<c1;k++)
            {
                
                val += arr1[i][k]*arr2[k][j];
            }
            res[i][j]=val;
        }
    }
    for(int i=0;i<res.length;i++)
    {
        for(int j=0;j<res[0].length;j++)
        {
           System.out.print(res[i][j] + " ");
        }
        System.out.println();
    }
    }
    
    
 }

}