import  java.util.*;
class counting2
{
    void clac()
    {
Scanner sc=new Scanner(System.in);
String s=" ";
char ch=' ';
int i,l=0,uc=0,lc=0,sp=0,d=0;
System.out.println("enter the string:");
s=sc.nextLine();
l=s.length();
for(i=0;i<l;i++)
{
    ch=s.charAt(i);
    if(Character.isUpperCase(ch)==true)
    {
        uc++;
    }
    else if(Character.isLowerCase(ch)==true)
    {
        lc++;
    }
        else if(Character.isDigit(ch)==true)
        {
            d++;
        }
        else
        {
            sp++;
        }
    }
System.out.print("\n The number of lower case character present"+lc+"\n the number of Upercase character is present:"+uc+"\n The number of digit present"+d+"\n the number of special character is present:"+sp);
}
}
 