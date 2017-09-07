import java.util.*;
class prime
{
    int check(int n)
    {
      int i,c=0,p=0,f=0;
      for(i=1;i<=n;i++)
      {
          if(n%i==0)
          {

              p++;
            }
        }
        if(p==2)
        f=1;
        return (f);
    
    
}
    void main()
    {
       Scanner sc=new Scanner(System.in);
       int w=0,i,x=0;
       System.out.println("enter the numbers");
       w=sc.nextInt();
       System.out.println("the prime number is");
       for(i=1;i<=w;i++)
       {
       prime ob=new prime();
       x=ob.check(i);
       if(x==1)
       System.out.print(x+",");
    }
}
}
           
        
