class mens
{
    double area(double p,double r)
    {
        double a=p*r;
        return (a);
    }

    int area(int s)
    {
        int q=s*s;
        return (q);
    }

    double area(double v)
    {
        double d=(3.14)*v*v;
        return (d);
    }

    public void clac()
    {
        int x=0;double j=0.0,o=0.0;
        mens ob=new mens();
        x=ob.area(5);
        j=ob.area(7.0);
        o=ob.area(3.0,6.0);
        System.out.print("\n the area of the circle is:"+j+"\n the are of the rectangle is:"+o+"\n the area of the square"+x);
    }
}

