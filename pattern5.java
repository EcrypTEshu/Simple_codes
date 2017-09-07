import java.util.*;
class pattern5
{
    void calc()
    {
        Scanner sc=new Scanner(System.in);
        String s=" ";
        char ch=' ';
        int i,j,l=0;
        System.out.println("enter the string:");
        s=sc.next();
        l=s.length();
        for(i=0;i<l;i++)
        {
            {
                System.out.print(s.substring(i));

                System.out.print(s.substring(0,i));

                System.out.println();
            }
        }
    }
}
