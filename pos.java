import java.util.*;
import java.lang.*;
import java.io.*;

class Java
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
        
        Scanner sc=new Scanner(System.in);
         
        System.out.print("");
        n=sc.nextInt();
         
        
        if(n>0)
            System.out.println("Positive");
        else if(n<0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
         
	}
}
