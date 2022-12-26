import pack.addition;
import java.util.Scanner;
class packtest
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter 1st number : ");
int a=sc.nextInt();
System.out.print("Enter 2nd number : ");
int b=sc.nextInt();
addition A=new addition();
int c = A.add(a,b);
System.out.println("a + b = "+c);
}
}