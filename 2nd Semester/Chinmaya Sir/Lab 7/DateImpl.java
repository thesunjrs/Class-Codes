package mypack;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
interface MyDate 
{
void datetime();
}
public class DateImpl implements MyDate
{
public void datetime()
{
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
LocalDateTime now = LocalDateTime.now();
System.out.println("Date and Time : "+dtf.format(now));
}
public static void main(String args[])
{
DateImpl obj=new DateImpl();
obj.datetime();
}
}