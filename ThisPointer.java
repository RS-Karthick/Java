
public class ThisPointer 
{
	int a=10;
	void pointer()
	{
		int a=30;
		System.out.println("withoout this keyword it will show inside the function value :" +a);
		System.out.println("with this keyword it will show outerside value : " +this.a);
	}
	public static void main(String[] args) {
		ThisPointer tp = new ThisPointer();
		tp.pointer();
	}
}
