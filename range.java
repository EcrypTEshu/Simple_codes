import java.util.*;
class range
{
    boolean prime(int n)
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean pallin(int x)
    {
        int r=0,s=0,num=0;
        num=x;
        while(num!=0)
        {
            r=num%10;
            s=s*10+r;
            num=num/10;
        }
        if(num==s)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void cal()
    {
        Scanner sc=new Scanner(System.in);
        int m=0,n=0;
        System.out.print("\n enter the value of the m");
        m=sc.nextInt();
        System.out.println("enter the value of the n");
        n=sc.nextInt();
        range ob=new range();
        System.out.println("the range is:");
        for(int i=m;i<=n;i++)
        {
            if( ob.prime(i)==true&&ob.pallin(i)==true)
            {
                System.out.println(i);
            }
        }
    }
}

                
            