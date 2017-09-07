import java.util.*;
class factorial
{
        int factorial(int x)
    {
            int i,c=1	;
            for(i=1;i<=x;i++)
            {
               c*=i;
            }
                return c;
            
 
        }
        void calc()
        {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0;
        System.out.println("the number:");
        a=sc.nextInt();
         b=factorial(a);
        System.out.println("the factorial of the number is:"+b);
        
    }
}