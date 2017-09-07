import java.util.*;
class volume
{
    int vol(int s)
    {
       int c=s*s*s;
        return (c);
    }
    double vol(double r)
    {
       double a=(4/3)*3.14*r*r;
        return (a);
    }
    int vol(int l,int b,int h)
    {
        int d=l*b*h;
        return (d);
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int q=0,w=0,e=0,m=0,n=0,t=0;
        double f=0,g=0;
        System.out.println("enter the side of the cube");
        q=sc.nextInt();
        System.out.println("enter the lenght of the cuboid:");
        w=sc.nextInt();
        System.out.print("\n enter the breadth of the cuboid:");
        e=sc.nextInt();
        System.out.print("\n enter the height of the cuboid:");
        m=sc.nextInt();
        System.out.println("enter the radius of the sphere:");
        f=sc.nextDouble();
        volume ob=new volume();
        n=ob.vol(q);
        t=ob.vol(w,e,m);
        g=ob.vol(f);
        System.out.print("the volumn of cube:"+n);
        System.out.print("\n the volume of cuboid is:"+t);
        System.out.print("\n the volume of sphere is:"+g);
    }
}
        
        
