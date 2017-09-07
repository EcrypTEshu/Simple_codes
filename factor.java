import java.util.*;
class factor
{
    Scanner sc=new Scanner(System.in);
    int fact(int x)
    {
        int i,c=0,f=0;
        for(i=1;i<x;i++)
        {
            if(x%i==0)
            {
                c++;
            }
        }
            if(c==2)
            {
         
            f=1;
        }
        return (f);
    }
    void display()
    {
        int num=0;
        System.out.println("enter the number :");
        num=sc.nextInt();
        if(fact(num)>num*2)
        {
            System.out.println("the number is the deficant:");
        }
        else if(fact(num)==2*num)
        {
            System.out.println("the number is prefect number:");
        }
        else
        {
            System.out.println("the number is ambundant number:");
        }
    }
}
            