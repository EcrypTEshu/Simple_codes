import java.util.*;
class pattern3
{
    void calc()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k=1;
        String s=" ";
        char ch=' ';
        System.out.println("enter the string:");
        s=sc.next();
        int l=s.length();
        for(i=l;i>=0;i--)
        {
            
                for(j=1;j<=k;j++)
                {
                    System.out.print(" ");
                }
                
                System.out.println(s.substring(0,i));
            k++;
        }
        
    }
}