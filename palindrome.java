import java.util.*;
class palindrome
{
void calc()
{
Scanner sc=new Scanner(System.in);
int n=0,num=0,r=0,s=0;
System.out.println("enter the number to be check");
n=sc.nextInt();
num=n;
while(num!=0)
{
r=n%10;
s=s*10+r;
num=num/10;
}
if(s==n)
{
    System.out.println("the number is palindrome");
}
    else
    {
    System.out.println("the number is not palindrome");
}
}
}


