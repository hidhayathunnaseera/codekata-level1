import java.util.*;
import java.lang.*;
import java.io.*;

class Palin
{  
 public static void main(String args[])
 {  
  int n,r,sum=0,temp;    
 System.out.println("");
 Scanner sc =new Scanner(System.in);
 n=sc.nextInt();
 temp=n;    
  while(n>0){    
   r=n%10; 
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("yes");    
  else    
   System.out.println("no");    
}  
}  
