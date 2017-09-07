import java.util.*;
class counting3
{
    void clac()
    {
Scanner sc=new Scanner(System.in);
String st=" ",s=" ";
int i,l=0,c=0;
System.out.println("enter the  string:");
st=sc.nextLine();
System.out.println("enter the string to be search:");
s=sc.next();
String x[]=st.split(" ");
l=x.length;
for(i=0;i<l;i++)
{
    if(x[i].equalsIgnoreCase(s))
    {
        c++;
    }
}
System.out.println("Number of times the word is present:"+c);
}
}