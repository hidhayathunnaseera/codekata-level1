#include<stdio.h> 

void main(){

           int f1,f2,rem,i;

           scanf("%d",&f1);
           scanf("%d",&f2);

        

           for(i=f1+1; i<f2; i++){

               rem = i % 2;

               if(rem == 0)

               printf("\t %d",i);

           }



    } 
