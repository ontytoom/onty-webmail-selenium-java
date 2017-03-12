package onty.seleniumTest.webmail.pageObjects;

import onty.seleniumTest.webmail.exceptions.WrongPageException;
import org.openqa.selenium.WebDriver;


public class MailboxesNewMessagePage extends APage
{


	public MailboxesNewMessagePage(WebDriver driver ) throws WrongPageException
	{
		super(driver);
		
		// check url to make sure we are on the correct page
		if ( ! driver.getCurrentUrl().contains("mailboxes/newmessage") )
			throw new WrongPageException();

		init();
	}
	

}
