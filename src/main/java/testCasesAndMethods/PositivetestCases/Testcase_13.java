package testCasesAndMethods.PositivetestCases;
import objectRepository.student_repo;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.junit.Assert;

public class Testcase_13 extends student_repo
{
	@Test
	public static void testcase_13() throws Exception
	{
		String enterYopmail=randomEmail();
		driver.get("http://learnnew.learnyst.com/learn/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		student_repo.signup_button().click();
		student_repo.signup_mail().sendKeys(enterYopmail+"@yopmail.com");
		student_repo.signup_password().sendKeys("abhi1234");
		student_repo.signupForFree().click();
		Thread.sleep(3000);
		student_repo.offeredCourse().click();
		Thread.sleep(3000);
		student_repo.fillInTheBlank_Test().click();
		Thread.sleep(2000);
		student_repo.enrollFreeCourse().click();
		Thread.sleep(2000);
		student_repo.resumeButton().click();
		Thread.sleep(2000);
		student_repo.takeTest().click();
		Thread.sleep(2000);
		student_repo.startTest().click();
		Thread.sleep(2000);
		student_repo.fillInTheBlankAnswerInput().sendKeys(randomAnswer());
		Thread.sleep(2000);
		student_repo.saveButton().click();
		Thread.sleep(2000);
		student_repo.nextButton().click();
		Thread.sleep(2000);
		student_repo.fillInTheBlankAnswerInput().sendKeys(randomAnswer());
		Thread.sleep(2000);
		student_repo.saveButton().click();
		Thread.sleep(2000);
		student_repo.nextButton().click();
		Thread.sleep(2000);
		student_repo.submitButton().click();
		Thread.sleep(4000);
		Assert.assertEquals(true, student_repo.solutions().isDisplayed());
	}


}
