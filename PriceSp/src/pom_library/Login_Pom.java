package pom_library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pom 
	{
		@FindBy(xpath="//input[@type='text']")
		private WebElement email;

		@FindBy(id="password")
		private WebElement pass;
		
		@FindBy(xpath = "//button[@type='submit']")
		private WebElement btn;
		
			
		public Login_Pom(WebDriver d) 
		{
			PageFactory.initElements(d, this);
		}
		
		public void enterEmail(String s)
		{
			email.sendKeys(s);
		}
		
		public void enterPassword(String p)
		{
			pass.sendKeys(p);
		}
		
		public void clickLoginBtn()
		{
			btn.click();
		}
}
