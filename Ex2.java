
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printANumber());

	}
	
	@SuppressWarnings("finally")
	private static int printANumber()
	{
		try {
			return 3;
		}
		catch (Exception e)
		{
			return 4;
		}
		finally
		{
			return 5;
		}
	}

}
