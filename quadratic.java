import java.util.*;
class quadratic
{
    void clac()
    {
        Scanner sc=new Scanner(System.in);
        {
            double a=0.0,b=0.0,c=0.0,X1=0.0,X2=0.0;
            System.out.println("?a=");
            a=sc.nextDouble();
            System.out.println("?b=");
            b=sc.nextDouble();
            System.out.println("?c=");
            c=sc.nextDouble();
            X1=(-b-(Math.sqrt(b*b-4*a*c)))/2*a;
            X2=(-b+(Math.sqrt(b*b-4*a*c)))/2*a;
            System.out.println("the first root is="+X1);
            System.out.println("the second root is="+X2);
        }
    }
}