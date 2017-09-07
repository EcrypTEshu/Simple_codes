import java.util.*;
class good 
{
    Scanner sc=new Scanner(System.in);
    void clac()
    {
        int num=0,n=0,r=0,c=0;
        System.out.println("enter the number :");
        num=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            c=c*10+r;
            n=n/10;
        }
        if(c%10==num%10)
       
          System.out.println("the number is good number:");
        else
         System.out.println("the number is not good number:");
}
}