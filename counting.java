import java.util.*;
class counting
{
    void calc()
{
    Scanner sc=new Scanner(System.in);
    String s=" ";
    char ch=' ';
    int i,l=0,sp=0,d=0,wd=0;
    System.out.println("enter the string ");
    s=sc.nextLine();
    l=s.length();
    for(i=0;i<l;i++)
{
    ch=s.charAt(i);
    if(Character.isLetter(ch)==true)
    {
        wd++;
    }
    else if(ch==' ')
    {
        sp++;
    }
    else
    {
        d++;
    }
}
    System.out.print("\n 1. Number of Blank spaces:"+sp+"\n 2. Number of words:"+wd+"\n 3. Number of character present:"+d);

}
}
    