package testCasesAndMethods.PositivetestCases;
import objectRepository.student_repo;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Testcase_04 extends student_repo
{
	@Test
	public static void testcase_04() throws Exception
	{	
		String enterYopmail=randomEmail();
		driver.get("http://learnnew.learnyst.com/learn/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		student_repo.signup_button().click();
		student_repo.signup_mail().sendKeys(enterYopmail+"@yopmail.com");
		student_repo.signup_password().sendKeys("abhi1234");
		student_repo.signupForFree().click();
		Thread.sleep(4000);
		student_repo.offeredCourse().click();
		Thread.sleep(3000);
		student_repo.fillInTheBlank_Test().click();
		Thread.sleep(2000);
		Assert.assertEquals(true, student_repo.enrollFreeCourse().isDisplayed()); 
		Thread.sleep(2000);

	}
}
