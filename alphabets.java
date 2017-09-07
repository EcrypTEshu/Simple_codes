import java.util.*;
class alphabets
{

    void clac()
    {
        Scanner sc=new Scanner(System.in);
        char ch=' ',c=' ';
        int a=0;
        System.out.println("enter the alphabet:");
        ch=sc.next().charAt(0);
        if(Character.isLowerCase(ch))
        {
            c=Character.toUpperCase(ch);
        }
        else
        {
            c=Character.toLowerCase(ch);
        }
        System.out.println("the simple output"+c);
        a=(int)c;
        System.out.println("\t"+"the ascii value of the alphabet is:"+a);
    }
}