package com.ontytoom.webmail.seleniumTest.exceptions;

public class WrongPageException extends TestException
{

	public static final long serialVersionUID = 0L;
	
	public WrongPageException()
	{
		super();
	}

	public WrongPageException(String message)
	{
		super(message);
	}

	public WrongPageException(Throwable cause)
	{
		super(cause);
	}

	public WrongPageException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public WrongPageException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
