package testCasesAndMethods.methods;
import objectRepository.student_repo;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.junit.Assert;


public class ConfirmationMail extends student_repo
{	
	@Test
	public static void confirmMail() throws Exception
	{	
		String enterYopmail=randomEmail();
		driver.get("http://learnnew.learnyst.com/learn/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		student_repo.signup_button().click();
		student_repo.signup_mail().sendKeys(enterYopmail+"@yopmail.com");
		student_repo.signup_password().sendKeys("abhi1234");
		student_repo.signupForFree().click();
		student_repo.EmailAlert().click();
		student_repo.confirmAlert().click();
		student_repo.successForSentEmail().click();
		Thread.sleep(5000);
		driver.get("http://www.yopmail.com/en/");
		Thread.sleep(5000);
		student_repo.enterYopmail().clear();
		student_repo.enterYopmail().sendKeys(enterYopmail);
		Thread.sleep(5000);
		student_repo.checkYopmailInbox().click();
		Thread.sleep(5000);
//		student_repo.inboxMessage().click();
		Thread.sleep(5000);
		student_repo.ActivateInInbox().click();
		Thread.sleep(5000);
		driver.get("http://learnnew.learnyst.com/learn/Login_flow");
		student_repo.login_email().sendKeys(enterYopmail+"@yopmail.com");
		student_repo.login_password().sendKeys("abhi1234");
		student_repo.login_button().click();
		Assert.assertEquals(false, student_repo.EmailAlert().isDisplayed());
//		if(!student_repo.EmailAlert().isDisplayed())
//		{
//		System.out.println("---> test case 2 is passed ");
//		}
//		else{
//		System.out.println("---> test case 2 is failed ");
//		}
	}

}
