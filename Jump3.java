
public class Jump3 
{
	public static void main(String[] args)
	{
		OuterLoop:  //labels
			for (int i=1; i<=5; i++)
			{
				InnerLoop :   //lable name
					for (int j=1; j<=5; j++)
					{
						if(i==3 && j==3)
							break OuterLoop;
						System.out.print(j);
					}
				System.out.println("\n");
			}
	}
}
