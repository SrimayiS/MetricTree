package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Login_Page extends Base_Page {

	@FindBy(id = "email")
	private WebElement loginEmailTextfield;
	
	@FindBy(id = "password")
	private WebElement LoginpasswordTextfield;
	
	@FindBy(xpath ="//div[.='Login ']")
	private WebElement loginButton;
	
	
	public Login_Page(WebDriver driver) {
		super(driver);
	}
	
	public void clickEmail() {
		loginEmailTextfield.click();
	}
	
	public void setEmail(String loginEmail) {
		loginEmailTextfield.sendKeys(loginEmail);
	}
	
	public void clickPassword() {
		LoginpasswordTextfield.click();
	}
	public void setPassword(String loginPassword) {
		LoginpasswordTextfield.sendKeys(loginPassword);
	}
	
	public void clickLogin() {
		loginButton.click();
		
	}
	
}
