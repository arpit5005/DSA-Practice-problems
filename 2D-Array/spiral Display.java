import java.io.*;
import java.util.*;

public class Main 
{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int m= scn.nextInt();
        int [][]mat= new int[n][m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j]= scn.nextInt();
                
            }
        }
        spiralDisplay(mat);
    }
    public static void spiralDisplay(int [][]mat)
    {
        int n=mat.length;
        int m=mat[0].length;
       
        int numtoprint=n*m;
        int numprinted=0;
       
        int rstart=0;
        int rend=mat.length-1;
        int cstart=0;
        int cend=mat[0].length-1;
        while(numprinted<numtoprint)
        {
        //leftmost wall
                for(int r=rstart;r<=rend && numprinted<numtoprint;r++)
                {
                    System.out.println(mat[r][cstart]);
                    numprinted++;
                }
                cstart++;
        //bottom wall
                for(int c=cstart;c<=cend && numprinted<numtoprint;c++)
                {
                    System.out.println(mat[rend][c]);
                    numprinted++;
                }
                rend--;
        //right wall
                for(int r=rend;r>=rstart && numprinted<numtoprint;r--)
                {
                    System.out.println(mat[r][cend]);
                    numprinted++;
                }
                cend--;
        //top wall
                 for(int c=cend;c>=cstart && numprinted<numtoprint;c--)
                {
                    System.out.println(mat[rstart][c]);
                    numprinted++;
                }
                rstart++;
                }
        }
    }

