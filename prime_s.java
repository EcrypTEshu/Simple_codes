import java.util.*;
class prime_s
{
    int ret(int x)
    {
    int c=0,f=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
        {
            c++;
        }
    }
    if(c==2)
      f=1;
     return (f);
    }
    void calc()
    {
        Scanner sc=new Scanner(System.in);
        int i, n=0,m=0;
        System.out.println("enter the number from which and until which need to check:");
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n+1;i<=m;i++)
        {
           if( ret(i)==1)
           System.out.println(i);
        }
    }
}

        