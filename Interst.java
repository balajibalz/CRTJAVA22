import java.util.*;
class Interst
{
public static void main(String args[ ])
{
double p,t,r,i;
Scanner s=new Scanner(System.in);
System.out.println("Enter amount:");
p=s.nextDouble();
System.out.println("Enter time: ");
t=s.nextDouble();
System.out.println("Enter rate:");
r=s.nextDouble();
i=(p*t*r)/100;
System.out.println("Interst="+i);
}
}

