package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	WebDriver driver;

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

//	@FindBy(xpath = " //input[@id='input-username']")
//	WebElement txtUsername;

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstname;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLasttname;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtTelephone;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtConfirmPassword;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkdPolicy;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

//	@FindBy(xpath = "//select[@id='input-country']")
//	WebElement drpCountry;

//	public void setUserName(String uname) {
//
//		txtFirstname.sendKeys(uname);
//	}

	public void setFirstName(String fname) {

		txtFirstname.sendKeys(fname);
	}

	public void setLastName(String lname) {

		txtLasttname.sendKeys(lname);
	}

	public void setEmail(String email) {

		txtEmail.sendKeys(email);
	}

	public void setTelephone(String tele) {

		txtTelephone.sendKeys(tele);
	}

	public void setPassword(String pwd) {

		txtPassword.sendKeys(pwd);
	}

	public void setConfirmPassword(String pwd) {

		txtConfirmPassword.sendKeys(pwd);
	}

	public void setPrivacyPolicy() {

		chkdPolicy.click();
//		chkdPolicy.submit();
//		chkdPolicy.sendKeys(Keys.RETURN);
	}

	public void setClickContinue() {
		// sol1
		btnContinue.click();

		// sol2
		// btnContinue.submit();

		// sol3
//		btnContinue.sendKeys(Keys.RETURN);
	}

	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		}

		catch (Exception e) {
			return (e.getMessage());

			// TODO: handle exception
		}
	}

//	public void setCountry(String country) {
//		drpCountry.sendKeys(country);
//	}

}
