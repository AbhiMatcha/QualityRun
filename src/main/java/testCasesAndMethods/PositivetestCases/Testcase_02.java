package testCasesAndMethods.PositivetestCases;
import objectRepository.student_repo;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Testcase_02 extends student_repo
{
	@Test
	public static void testcase_02() throws Exception
	{
	driver.get("http://learnnew.learnyst.com/learn/login");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(4000);
	student_repo.signup_button().click();
	student_repo.signup_mail().sendKeys(randomEmail()+"@yopmail.com");
	student_repo.signup_password().sendKeys("abhi1234");
	student_repo.signupForFree().click();
	Thread.sleep(3000);
	student_repo.offeredCourse().click();
	Thread.sleep(3000);
	student_repo.fillInTheBlank_Test().click();
	Thread.sleep(2000);
	student_repo.enrollFreeCourse().click();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	student_repo.discussionTab().click();
	Thread.sleep(3000);
	student_repo.discussionAsk().click();
	Thread.sleep(3000);
	student_repo.enterInput().sendKeys("This is discussion for testing");
	Thread.sleep(3000);
	student_repo.postInput().click();
	Thread.sleep(3000);
	student_repo.discussionEditInput().click();
	Thread.sleep(3000);
	student_repo.enterInput().clear();
	Thread.sleep(3000);
	student_repo.enterInput().sendKeys("This is edited discussion input for testing");
	Thread.sleep(3000);
	student_repo.postInput().click();
	Thread.sleep(3000);
	student_repo.discussionReplyAsk().click();
	Thread.sleep(3000);
	student_repo.enterInput().sendKeys("This is reply in discussion for testing");
	Thread.sleep(3000);
	student_repo.postInput().click();
	Thread.sleep(3000);
	Thread.sleep(3000);
	student_repo.discussionDeleteAsk().click();
	Thread.sleep(3000);
	Assert.assertEquals(true, student_repo.deleteConfirm().isDisplayed());
	}
}