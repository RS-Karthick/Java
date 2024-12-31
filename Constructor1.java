
public class Constructor1 
{
	Constructor1(int rollNo, String name)
	{
		System.out.println("Student Details");
		System.out.println("Roll Number : "+rollNo + "\n" + "Name : "+name);
	}
	public static void main(String[] args) {
		Constructor1 ob = new Constructor1(46589, "Karthick");
		//System.out.println("Roll Number : "+rollNo + "Name : "+name);
	}
}
