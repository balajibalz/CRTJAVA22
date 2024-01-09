import java.util.*;
class Swap
{
public static void main(String args[ ])
{
Scanner s=new Scanner(System.in);
int a,b;
System.out.println("Enter the values:");
a=s.nextInt();
b=s.nextInt();
System.out.println("Values before swapping:"+a+" "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("Values after swapping:"+a+" "+b);
}
}