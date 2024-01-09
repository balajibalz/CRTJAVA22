import java.util.*;
class Participants
{
public static void main(String args[ ])
{
Scanner s=new Scanner(System.in);
int a,b,c,d,f;
System.out.println("Enter the total no. of Participants:");
a=s.nextInt();
b=a/4;
c=a/4;
d=a/4;
f=(a/4)+a%4;
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(f);
}
}

