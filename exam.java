import java.util.*;
class exam
{
    Scanner sc=new Scanner(System.in);
   int  reverse(int n)
   {
       int r=0,s=0;
       while(n!=0)
       {
           r=n%10;
           s=s*10+r;
           n=n%10;
        }
       return (s);
    }
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
            void check()
            {
                int n=0,m=0;
                System.out.println("enter the number ");
                n=sc.nextInt();
                m=sc.nextInt();
                int t=reverse(n);
                int q=reverse(m);
                if(prime(n)==true&&prime(m)==true&&prime(t)==true&&prime(q)==true&&n-m==2||m-n==2)
                {
                 System.out.println("The pair is twisted prime pair");
                }
                 else
                 {
                 System.out.println("the  pair is not twisted prime pair");
                }
            }
            public static void main(String args[])
            {
                exam ob=new exam();
                ob.check();
            }
        }