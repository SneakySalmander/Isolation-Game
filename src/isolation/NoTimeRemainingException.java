package isolation;

public class NoTimeRemainingException extends Exception
{
	private static final long serialVersionUID = 1L;

	public NoTimeRemainingException(String errorMessage)
	{
		super(errorMessage);
	}
}

