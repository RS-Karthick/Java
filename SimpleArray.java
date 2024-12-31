
public class SimpleArray 
{
	public static void main(String[] args) 
	{
		int a[] = {10,20,30,4,5,6};
		int sum=0;
		//for(int i=0; i<a.length;i++)
		for(int x : a)   //for each
		{
			//System.out.println(a[i]);
			//System.out.println(x);
			sum +=x;
		}
		System.out.println(sum);
	}
}
