import java.util.*;
class automorphic
{
    int digit(int n)
    {
        int k=0,s=0,r=0;
        double p=0.0;
        k=n*n;
        while(n!=0)
        {
            n=n/10;
            s++;
        }
 p=k%(Math.pow(10,s));
r=(int)p;
return r;
}
void main()
{
    Scanner sc=new Scanner (System.in);
    int num=0,b=0;
    automorphic ob=new automorphic();
    System.out.println("enter the number to be check");
    num=sc.nextInt();
    b=ob.digit(num);
    if(num==b)
    {
        System.out.println("the number is automorphic");
    }
        else
        {
            System.out.println("the number is not automorphic");
        }
    }
    
}
    