import java.util.*;
class series
{
int sum(int a)
{
    int i,add=0;
    for(i=0;i<=a;i++)
    
        add=add+(i*(i+1));
        return (add);
    
}
void calc()
{
    Scanner sc=new Scanner(System.in);
    int Sum=0,n=0;
    System.out.println("enter the number of terms should be used");
    n=sc.nextInt();
    series ob=new series();
    Sum=ob.sum(n);
    System.out.println("the sum of the series is"+Sum);
}
}

