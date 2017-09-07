import java.util.*;
class replace
{
    void calc()
    {
        Scanner sc=new Scanner(System.in);
        String s=" ";
        System.out.println("enter the string");
        s=sc.nextLine();
        s=s.toLowerCase();
        String a=s.replace('e','*');
        System.out.println(a);
    }
}