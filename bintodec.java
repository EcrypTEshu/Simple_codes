import java.util.*;
class bintodec
{
    double bintode(double bin)
    {
        double r=0.0,dec=0.0,c=0.0;
        while(bin!=0)
        {
            r=bin%10;
            dec=dec+(r*(Math.pow(2,c)));
            c=c+1;
            bin=bin/10;
        }
        
        return (dec);
    }
    void convert()
    {
        Scanner sc=new Scanner(System.in);
        double n=0.0,m=0.0;
        System.out.println("enter the number which needed to be converted:");
        n=sc.nextInt();
        bintodec ob=new bintodec();
        m=ob.bintode(n);
        System.out.println("the equivalent decimal number is:"+m);
    }
    public static void main(String args[])
    {
        bintodec ob=new bintodec();
        ob.convert();
    }
}

   
        