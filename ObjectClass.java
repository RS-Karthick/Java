
public class ObjectClass 
{
	int length;
	int breath;
	int height;
	public static void main(String[] args) 
	{
		ObjectClass ob = new ObjectClass();
		ob.length = 10;
		ob.height= 5;
		ObjectClass ob1 = new ObjectClass();
		ob1.breath=20;
		System.out.println("Length : " +ob.length);
		System.out.println("Breath : " +ob1.breath);
	}
}
