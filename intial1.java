import java.util.*;
class intial1
{
    void clac()
    {
        Scanner sc=new Scanner(System.in);
        String s=" ",st=" ",g=" ",r=" ";
        char ch=' ',c=' ';
        int i,l=0,p=0;
        System.out.println("enter the string");
        s=sc.nextLine();
        s=" "+s;
        l=s.length();
        p=s.lastIndexOf(" ");
        g=s.substring(p);//taking out the surname
        for(i=0;i<p;i+=1)
        {
            c=s.charAt(i);
            if(c==' ')
            {
             st=st+s.charAt(i+1)+'.';
            }
        }
        r=r+st+g;
        System.out.println("the intials with the surname:"+r);
    }
}
            