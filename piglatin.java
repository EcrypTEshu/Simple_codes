import java.util.*;
class piglatin
{
    void clac()
    {
        Scanner sc=new Scanner(System.in);
        String s=" ",a=" ",p=" ";int i=0,l=0;char ch=' ';
        System.out.println("enter the string to be checked for piglatin:");
        s=sc.next();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='A'||ch=='O'||ch=='U'||ch=='I'||ch=='E'||ch=='e'||ch=='i'||ch=='a'||ch=='u'||ch=='o')

                break;
        }
        p=s.substring(0,i);
        a=s.substring(i,l);
        String x=a+p+"ay";
        System.out.println("the piglatin word is:="+x);
    }
}
