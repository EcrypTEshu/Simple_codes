import java.util.*;
class amikable
{
    Scanner sc=new Scanner(System.in);
    int fact(int x)
    {
        int s=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                s=s+i;
            }
        }
        return (s);
    }
    void calc()
    {
        int m=0,n=0;
        System.out.println("enter the numbers:");
        m=sc.nextInt();
        n=sc.nextInt();
        if(fact(m)==fact(n)&&fact(n)==fact(m))
        {
            System.out.println("the number is amikable:");
        }
        else
        {
            System.out.println("the number is not amikable:");
        }
    }
}
