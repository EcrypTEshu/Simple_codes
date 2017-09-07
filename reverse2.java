import java.util.*;
class reverse2
{
    String rev(String s)
    {
        int i,l=0;
        char ch=' ';
        String st=" ";
        l=s.length();
        for(i=l-1;i>=0;i--)
        {
            ch=s.charAt(i);
            st=st+ch;
        }
        return (st);
    }
    void main()
    {
Scanner sc=new Scanner(System.in);
String a=" ",d=" ";
int i,l=0;
System.out.println("enter the string");
a=sc.nextLine();
String x[]=a.split(" ");
l=x.length;
reverse2 ob=new reverse2();
for(i=0;i<l;i++)
{
    d=d+ob.rev(x[i])+" ";
}
System.out.println("the new string:+\t"+d);
}
}