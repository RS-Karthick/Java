
public class StaticMethod1 
{
	static int addition(int a,int b, int c)
	{
		//int sum; - 1st form
		//sum =a+b+c;   - 1st form
		//int sum = a+b+c;   - 2nd form
		return a+b+c;   // 3rd form
	}
	public static void main(String[] args) 
	{
		System.out.println("Static Method :");
		//int add = addition(5,5,5);
		//System.out.println(add);
		System.out.println(addition(5,3,2));
	}
}
