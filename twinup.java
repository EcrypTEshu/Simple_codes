import java.util.*;
class twinup
{
    int twin(int n)
    {
int f=0,c=0,i;
for(i=1;i<=n;i++)
{
    if(n%i==0)
    {
        c++;
    }
}
if(c==2)
f=1;
return(f) ;
}
void main()
{
    Scanner sc=new Scanner(System.in);
    int a=0,b=0,m=0,n=0;
    twinup ob=new twinup();
    System.out.println("enter the numbers that neede to be check");
    a=sc.nextInt();
    b=sc.nextInt();
    m=ob.twin(a);
    n=ob.twin(b);
    if((m==1&&n==1)&&(a-b==2||b-a==2))
    {
        System.out.println("the number is twin prime");
    }
        else 
        {
        System.out.println("the number is not twin prime");
    }
}
}



