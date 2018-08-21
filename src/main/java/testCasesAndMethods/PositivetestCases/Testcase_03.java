package testCasesAndMethods.PositivetestCases;
import objectRepository.student_repo;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Testcase_03 extends student_repo
{
	@Test
	public static void testcase_03() throws Exception
	{
		String enterYopmail=randomEmail();
		driver.get("http://learnnew.learnyst.com/learn/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		student_repo.signup_button().click();
		student_repo.signup_mail().sendKeys(enterYopmail+"@yopmail.com");
		student_repo.signup_password().sendKeys("abhi1234");
		student_repo.signupForFree().click();
		Thread.sleep(5000);
		student_repo.offeredCourse().click();
		Thread.sleep(5000);
		student_repo.getCertificate_Test().click();
		student_repo.overviewTab().click();
		Thread.sleep(3000);
		Assert.assertEquals(true, student_repo.courseDiscountPrice().isDisplayed()); 
		Thread.sleep(3000);
		Assert.assertEquals(true, student_repo.coursePrice().isDisplayed()); 
		Thread.sleep(3000);
		Assert.assertEquals(true, student_repo.buynowButton().isDisplayed()); 
		Thread.sleep(3000);
		Assert.assertEquals(true, student_repo.courseExpiry().isDisplayed());
		Thread.sleep(4000);
		
	}
}
	