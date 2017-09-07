import java.util.*;
class pattern2
{
void clac()
{
    Scanner sc=new Scanner(System.in);
    int i,j;
    char c=' ';
    String s=" ";
    System.out.println("enter the sring ");
    s=sc.next();
    int l=s.length();
    for(i=0;i<l;i++)
    {
        for(j=0;j<=i;j++)
        {
            c=s.charAt(j);
            System.out.print(c);
        }
        System.out.println();
    }
}
}