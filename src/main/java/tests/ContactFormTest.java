package tests;

import org.testng.annotations.Test;

import page.objects.ContactPage;
import page.objects.MenuPage;
import selenium.utils.BaseTest;

public class ContactFormTest extends BaseTest{
	
	@Test(priority=1)
	public void sendValidMessage() {
		MenuPage menuPage = new MenuPage(driver);
		menuPage.click(menuPage.contactPageLink);
		
		ContactPage contactPage = new ContactPage(driver);
		contactPage.sendMessage
				("Harry potter", 
				"harry.potter@howgharts.com", 
				"Addmison", 
				"Can I join?");
		
	}

}
