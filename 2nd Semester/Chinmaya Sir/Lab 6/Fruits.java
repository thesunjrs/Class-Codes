interface Apples
{
int na=10;
}
interface Mangoes
{
int nm=40;
}
class Fruits implements Apples,Mangoes
{
public void display()
{
int n=this.na+this.nm;
System.out.println("Number of apples = "+na);
System.out.println("Number of mangoes = "+nm);
System.out.println("Number of fruits in the basket = "+n);
}
}
class Main
{
public static void main(String args[])
{
Fruits obj=new Fruits();
obj.display();
}
}