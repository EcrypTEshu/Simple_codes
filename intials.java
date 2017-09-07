import java.util.*;
class intials
{
    void calc()
    {
        Scanner sc=new Scanner(System.in);
        String s=" ";
        String c=" ";
        int i,l=0;
        System.out.println("enter the name");
        s=sc.nextLine();
        String a[]=s.split(" ");
        l=a.length;
       for(i=0;i<l-1;i++)
       {
        c+=a[i].charAt(0)+".";
    }
    String d=c+a[l-1];
        System.out.println("the name is"+d);
    }
}