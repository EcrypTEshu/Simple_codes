
class happy
{
    void clac(int n)
    {

        int r=0,s=0;

        do
        {
            s=0;
            while(n>0)
            {
                r=n%10;
                s=s+r*r;
                n=n/10;
            }
            n=s;
        }
        while(n>=9);
        if(s==1)
        {
            System.out.println("the number is happy mnumber:");
        }
        else 
        {
            System.out.println("the number is not happy number:");
        }
    }
}