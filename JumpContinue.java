
public class JumpContinue 
{
	public static void main(String[] args) 
	{
		for( int i=1; i<=7;i++)
		{
			if(i==4)
				continue;
			if(i==5)
				continue;
			System.out.println(i);
		}
	}
}
