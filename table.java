import java.util.*;
class table
{
    void calc(int x)
    {
      for(int i=1;i<=10;i++)
      {
          int s=i*x;
          System.out.println(x+" "+"*"+" "+i+" "+"="+" "+s);
        }
    }
    void show()
    {
        Scanner sc=new Scanner(System.in);
        int m=0,n=0;
        System.out.println("enter the range :");
        m=sc.nextInt();
        n=sc.nextInt();
        table ob=new table();
        for(int i=m;i<=n;i++)
        {
            ob.calc(i);
        }
    }
    
}