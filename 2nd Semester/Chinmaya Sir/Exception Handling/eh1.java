public class eh1
{
	public static void main(String args[])
	{
		int arr[]={1,2,3};
		try
		{
			System.out.println(arr[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Caught");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception Caught");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception Caught");
		}
		finally
		{
			System.out.println("Finally the program is over");
		}
	}
}
