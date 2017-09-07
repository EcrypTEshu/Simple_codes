
import java.util.*;
class parcel
{
    void calc()
    {
        Scanner sc=new Scanner(System.in);
        double wt=0.0,i,c=15.0;
        System.out.println("enter the weight");
        wt=sc.nextDouble();
        if(wt<=1)
        {
            System.out.println("the charge is"+c);
        }
        else if(wt>1)
        {
            for(i=wt;i>1;i=i-0.5)
            {
                c=c+8;
            }
            System.out.println("the charge is "+c);
        }
    }
}