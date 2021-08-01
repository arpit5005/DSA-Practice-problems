import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
		String s= str.substring(0,1);
		for(int i=1; i<str.length() ;i++)
		{
		    char cur= str.charAt(i);
		    char prev=str.charAt(i-1);
		    if(cur!=prev)
		    {
		        s+=cur;
		    }
		}

		return s;
	}

	public static String compression2(String str){
		// write your code hereString s= str.charAt(0);
		String s= str.substring(0,1);
		int count=1;
		    for(int i=1; i<str.length(); i++)
		        {
		    
		                char cur= str.charAt(i);
		                char prev=str.charAt(i-1);
		                    if(cur==prev)
                        		    {
                        		        count++;
                        		    }
                		    else
                		    {
                		        if(count>1)
                		        {
                		            s+=count;
                		            count=1;
                		        }
                		        s+=cur;
                        	}
        		   
		        }
		         if(count>1)
        		        {
        		            s+=count;
        		            count=1;
        		        }
        return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
