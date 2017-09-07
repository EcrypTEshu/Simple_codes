import java.util.*;
class sum2
{
    void calc()
    {
        Scanner sc=new Scanner(System.in);
        int num=0,n=0,r=0,s=0,sum=0;
        System.out.println("enter the number:");
        num=sc.nextInt();
        n=num;
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        sum=num+s;
        System.out.println("the sum is:"+sum);
    }
}
        
        