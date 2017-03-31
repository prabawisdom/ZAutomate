package zautomate.zadoqa.exceptions;

public class ZadoReporterException
extends Exception
{
	private String message;

	public ZadoReporterException() {}

	public ZadoReporterException(String message)  {
		this.message = message;
	}

	public String toString()  {
		return "[Custom Reporter Exception] " + this.message;
	}
}
