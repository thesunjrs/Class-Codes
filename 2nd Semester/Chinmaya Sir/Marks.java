import java.util.Scanner;
class Marks
{
public int roll,total,avg;
public String name=" ";
}
class Physics extends Marks
{
public int pmarks;
}
class Chemistry extends Marks
{
public int cmarks;
}
class Mathematics extends Marks
{
public int mmarks;
}
class Student
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of students : ");
int n=sc.nextInt();
Physics m1[]=new Physics[n];
Chemistry m2[]=new Chemistry[n];
Mathematics m3[]=new Mathematics[n];
for(int i=1;i<=n;i++)
{
m1[i-1]=new Physics();
m2[i-1]=new Chemistry();
m3[i-1]=new Mathematics();
m1[i-1].roll=i;
System.out.println("\nRoll Number of the student : "+m1[i-1].roll);
System.out.print("Enter name : ");
m1[i-1].name=sc.next();
System.out.print("\nEnter marks in Physics : ");
m1[i-1].pmarks=sc.nextInt();
System.out.print("Enter marks in Chemistry : ");
m2[i-1].cmarks=sc.nextInt();
System.out.print("Enter marks in Mathematics : ");
m3[i-1].mmarks=sc.nextInt();
m1[i-1].total=m1[i-1].pmarks+m2[i-1].cmarks+m3[i-1].mmarks;
System.out.println("\nTotal marks = "+m1[i-1].total);
m1[0].avg+=m1[i-1].total;
}
m1[0].avg=m1[0].avg/n;
System.out.println("\nAverage marks = "+m1[0].avg);
}
}