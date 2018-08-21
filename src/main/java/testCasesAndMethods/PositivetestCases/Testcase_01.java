package testCasesAndMethods.PositivetestCases;
import objectRepository.student_repo;
import java.util.concurrent.TimeUnit;

import testCasesAndMethods.methods.Signup_flow;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Testcase_01 extends student_repo
{
	@Test
	public static void testcase_01() throws Exception
	{
			driver.get("http://learnnew.learnyst.com/learn/login");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Signup_flow.signupFlow();
			Assert.assertEquals(true, student_repo.EmailAlert().isDisplayed());
	}

}
