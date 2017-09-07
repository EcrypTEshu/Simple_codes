import java.io.*;
class Sum
{
    public int add(int n,int m)
    {
        int s=0;
        s=m+n;
        return s;
    }
    public static void main(String args[])throws IOException
    {
        int a,b,p;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        System.out.println("Enter two numbers");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        Sum ob= new Sum();
        p =ob.add(a,b);
        System.out.println("the sum of the number is ="+p);
    }
}