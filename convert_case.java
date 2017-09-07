import java.util.*;
class convert_case
{
    void calc()
    {
        Scanner sc=new Scanner(System.in);
        String s=" ",a=" ";
        int l=0,i;
        char ch=' ',c=' ';
        System.out.println("enter the string ");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(Character.isUpperCase(ch)==true)
            {
                c=Character.toUpperCase(ch);
                a=a+c;
            }
            else if(Character.isLowerCase(ch)==true)
            {
                c=Character.toLowerCase(ch);
                a=a+c;
            }
            else
            {
                a=a+c;
            }
            System.out.println(a);
        }
    }
}