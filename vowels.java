import java.util.*;
class vowels
{
   void display(String st)
    {
      int i,l=0;
      char ch=' ';
      st=st.toUpperCase();
      l=st.length();
      System.out.print("\n the vowels present in the word");
      for(i=0;i<l;i++)
      {
      ch=st.charAt(i);
      if(ch=='A'||ch=='I'||ch=='E'||ch=='O'||ch=='U')
      {
          System.out.print(ch);
        }
    }
}
void main()
{
    Scanner in=new Scanner(System.in);
    String s=" ";
    System.out.print("\n enter the string ");
    s=in.next();
    vowels ob=new vowels();
    ob.display(s);
}
}
          