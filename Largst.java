import java.util.*;
import java.lang.*;
import java.io.*;

class Largst
{

    public static void main(String[] args) {

        int n1,n2,n3;
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1);

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2);

        else
            System.out.println(n3);
    }
}
