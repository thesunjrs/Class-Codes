package pack;
import java.util.Scanner;
public class addition
{
public static int add(int a, int b)
{
return (a+b);
}
}
class subtraction
{
public static int sub(int a, int b)
{
return (a-b);
}
}
class Main
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter 1st number : ");
int a=sc.nextInt();
System.out.print("Enter 2nd number : ");
int b=sc.nextInt();
addition A=new addition();
subtraction S=new subtraction();
int c = A.add(a,b);
System.out.println("a + b = "+c);
int d = S.sub(a,b);
System.out.println("a - b = "+d);
}
}
