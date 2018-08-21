package testCasesAndMethods.PositivetestCases;
import objectRepository.student_repo;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class Testcase_07 extends student_repo
{
	@Test
	public static void testcase_07() throws Exception
	{	
		JavascriptExecutor js = (JavascriptExecutor) driver;
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
		student_repo.getCertificate_Test().click();
		Thread.sleep(3000);
		student_repo.syllabusTab().click();
		Thread.sleep(3000);
		Assert.assertEquals(true, student_repo.syllabusCourseTitle().isDisplayed()); 
		student_repo.syllabusCourseTitle().click();
		Thread.sleep(3000);
		Assert.assertEquals(true, student_repo.syllabusLessonTitle().isDisplayed()); 
		student_repo.syllabusLessonTitle().click();
		Thread.sleep(3000);
		Assert.assertEquals(true, student_repo.syllabusBuyCousrePopup().isDisplayed()); 
		student_repo.cancelButton().click();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		student_repo.certificateTab().click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1000)");
		Assert.assertEquals(true, student_repo.TakeTestThroughCertificateTab().isDisplayed()); 
		Thread.sleep(4000);
		student_repo.TakeTestThroughCertificateTab().click();
		Thread.sleep(4000);
		Assert.assertEquals(true, student_repo.certificateBuyCoursePopUp().isDisplayed());
		student_repo.cancelButton().click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		student_repo.discussionTab().click();
		Thread.sleep(3000);
		student_repo.discussionAsk().click();
		Thread.sleep(2000);
		Assert.assertEquals(true, student_repo.discussionBuyCoursePopUp().isDisplayed());
		student_repo.cancelButton().click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		student_repo.noteTab().click();
		Thread.sleep(3000);
		student_repo.noteCreateTab().click();
		Thread.sleep(2000);
		Assert.assertEquals(true, student_repo.noteBuyCoursePopUp().isDisplayed());
		student_repo.cancelButton().click();
		Thread.sleep(3000);
	}

}
	