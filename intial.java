import java.util.*;
class intial
{
    void clac()
    {
        Scanner sc=new Scanner(System.in);
        int i=0,l=0;
        char ch;
        String out=" ",s=" ";
        System.out.println("enter the name");
        s=sc.nextLine();
        String x[]=s.split(" ");
        l=x.length;
        for(i=0;i<l;i++)
        {
            ch=x[i].charAt(0);
            out=out+ch+".";
        }
        System.out.println("the name is"+out);
    }
}
