import java.util.*;
class pattern
{
    void clac()
    {
        Scanner sc=new Scanner(System.in);
        String s=" ";
        int i=0;char ch=0;
        System.out.println("enter the string:");
        s=sc.next();
        int l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            System.out.println(ch);
        }
    }
}