package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	@Test(groups = { "Regression","Master"})
	public void verify_account_registration() throws InterruptedException {

		logger.info("**** Starting TC001_AccountRegistrationTest  ****");

		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("* Clicked on MyAccount link *");
			hp.clickRegister();
			logger.info("* Clicked on Register link *");

			AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
			// regpage.setUserName(randomString().toUpperCase());
			logger.info("* Providing Customer details *");
			regpage.setFirstName(randomString());
			regpage.setLastName(randomString());
			regpage.setEmail(randomAlphaNumeric() + "gmail.com");
			regpage.setTelephone(randomNumeric());

			String password = randomAlphaNumeric();
			regpage.setPassword(password);
			regpage.setConfirmPassword(password);
			regpage.setPrivacyPolicy();
			Thread.sleep(2000);
			regpage.setClickContinue();

			logger.info("* Validating expected message *");
			String confirmMsg = regpage.getConfirmationMsg();
			if(confirmMsg.equals(confirmMsg))
			Assert.assertEquals(confirmMsg, "Your Account Has Been Created!");
			Thread.sleep(2000);

			System.out.println("Your Account Has Been Created!");
			// regpage.setCountry("India");
			// regpage.setClickRegister();
		} catch (Exception e) {
			logger.error("* Test failed... *");
			logger.debug("* Debug logs... *");
			Assert.fail();
		}
		logger.info("**** Finished TC001_AccountRegistrationTest  ****");

	}

}
