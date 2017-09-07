import java.util.*;
class magic
{
void calc()
{
    Scanner sc=new Scanner(System.in);
    int n=0,r=0,s=0,i;
    System.out.println("enter the number which needed to be check:");
    n=sc.nextInt();
    do
    {
        s=0;
        while(n!=0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }
        n=s;
    }
    while(n>=9);
    if(s==1)
    {
        System.out.println("the number is magic number");
    }
    else
    {
    System.out.println("the number is not a magic number:");
}
}
}

        