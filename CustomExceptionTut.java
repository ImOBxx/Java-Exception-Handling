
public class CustomExceptionTut {

	public static void main(String[] args) throws AgeLessThanZeroException{
		// TODO Auto-generated method stub
		validateAge(-1);

	}
	
	private static void validateAge(int age) throws AgeLessThanZeroException {
	if (age < 0)
	{
		throw new AgeLessThanZeroException("Age Cannot Be Negative");
	}
}
}
