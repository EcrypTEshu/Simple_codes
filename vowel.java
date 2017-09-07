import java.util.*;
class vowel
{
    void calc()
    {
        Scanner sc=new Scanner(System.in);
        String s=" ";
        int l=0,i,c=0;
        char ch=' ';
        System.out.println("enter the string:");
        s=sc.nextLine();
        l=s.length();
        s=s.toLowerCase();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='a'||ch=='i'||ch=='u'||ch=='o'||ch=='e')
            {
                c++;
            }
        }
        System.out.println("the number of the vowel present"+c);
    }
}