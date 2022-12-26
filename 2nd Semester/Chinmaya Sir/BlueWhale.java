interface Mammals
{
default void print1()
{
System.out.println("I am mammal");
}
}
interface MarineAnimals
{
default void print2()
{
System.out.println("I am marine animal");
}
}
class BlueWhale implements Mammals,MarineAnimals
{
public void print3()
{
System.out.println("I belong to both the categories : Mammals as well as Marine Animals");
}
}
class Main
{
public static void main(String args[])
{
BlueWhale obj=new BlueWhale();
obj.print3();
obj.print1();
obj.print2();
}
}
