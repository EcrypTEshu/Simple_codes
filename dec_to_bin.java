import java.util.*;
class dec_to_bin
{

    public long func(long dec)
    {
        long r=0L,bin=0L,c=1L;
        while(dec!=0)
        {
            r=dec%2;
            bin=bin+(r*c);
            c=c*10;
            dec=dec/2;
        }
        return (bin);
    }
    void convert()
    {
        
    Scanner sc=new Scanner(System.in);
      long n=0l;
      System.out.println("enter the number ");
      n=sc.nextLong();
      long d=func(n);
      System.out.println("the decimal number is:"+n);
    }
    public static void main(String args[])
    {
        dec_to_bin ob=new dec_to_bin();
        ob.convert();
    }
}

    