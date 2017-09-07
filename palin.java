import java.util.*;
class palin
{
    int reverse(int n)
    {
        int s=0,r=0;
        do
        {
            r=n/10;
            s=s*10+r;
            n=n/10;
        }
        while(n!=0);
        return (s);
    }

    void main()
    {
        Scanner sc=new Scanner(System.in);
        int x=0,p=0,c=0;
        palin ob=new palin();
        System.out.println("enter the number which need to be check");
        x=sc.nextInt();
        c=x;
        p=ob.reverse(x);
        if(p==c)

            System.out.println("the number is palindrome");
        else 
            System.out.println("the number is not palindrome");

    }
}
