import java.util.*;
class display
{
    void calc()
    {
        Scanner sc=new Scanner(System.in);
        char a=0;String s=" ";
        System.out.print("\n Menu Driven\n enter F  if you want to see the first character of the word or enter L if you want to see  the character of the word\n enter the choice");
        a=sc.next().charAt(0);
        System.out.println("enter the string:");
        s=sc.nextLine();
        String x[]=s.split(" ");
        int l=x.length;
        int i;char ch=' ';

        switch(a)
        {
            case 1:
            {
                for(i=0;i<l;i++)
                {
                    System.out.println(x[i].charAt(0));
                }

            }
            break;
            case 2:
            {
                for(i=0;i<l;i++)
                {
                    int c=x[i].length();
                    System.out.println(x[i].charAt(c-1));
                }

            }
            break;
            default :
            {
                System.out.println("wrong choice:");

            }
            break;
        }
    }
}
