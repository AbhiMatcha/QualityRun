package testCasesAndMethods.PositivetestCases;
import objectRepository.student_repo;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Testcase_12 extends student_repo
{
	@Test
	public static void testcase_12() throws Exception
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
		student_repo.getCertificate_Test().click();
		student_repo.overviewTab().click();
		Thread.sleep(3000);
		Assert.assertEquals(true, student_repo.courseDiscountPrice().isDisplayed()); 
		String discountPriceInOverView =student_repo.courseDiscountPrice().getText();
		Thread.sleep(3000);
		student_repo.buynowButton().click();
		Thread.sleep(4000);
		Assert.assertEquals(true, student_repo.discountAmount().isDisplayed());
		String discountPriceinPayment = student_repo.discountAmount().getText();
		Assert.assertEquals(true, discountPriceInOverView.equals(discountPriceinPayment));
	}

}
	