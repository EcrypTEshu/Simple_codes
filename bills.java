import java.util.*;
class bills
{
    double cal(int u)
    {
    double c=0.0;
    
        if(u<=100)
        {
            c=1.25*u;
        }
        else if(u>100&&u<=200)
        {
            c=(100*1.25)+(1.50*(u-100));
        }
        else if(u>200)
        {
        c=(100*1.25)+(100*1.50)+(1.85*(u-200));
        }
        return (c);
    }
    void main()
        {
            Scanner sc=new Scanner(System.in);
            int cno=0,units=0,pres=0,prev=0;
            String nam=" ";
            bills ob=new bills();
            System.out.println("enter then name");
            nam=sc.nextLine();
            System.out.println("enter the consumer number:");
            cno=sc.nextInt();
            System.out.println("enter the present reading ");
            pres=sc.nextInt();
            System.out.println("enter the previous reading");
            prev=sc.nextInt();
            units=pres-prev;
            double amt=ob.cal(units);
            System.out.println("Consumer No.\t\tName\t\tunits consumed\t\tamoumnt");
            System.out.println(cno+"\t\t"+nam+"\t\t"+units+"\t\t"+amt);
        }
    }
    
           