package testCasesAndMethods.NegativetestCases;

import objectRepository.student_repo;
import testCasesAndMethods.methods.Signup_flow;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Testcase_01 extends student_repo
{
	private static String randomEmailpasswords[]={randomSpecialCharacter(),"  ","abhiq","ABHI1234"};
	private static String randomEmailInputs[] = {"ABHISHEK.MATCHA@LEARNYST.COM","abhsiek@kjbf.com"," ",};
	private static String errorMessage1 ="Please enter your email";
	private static String errorMessage2="Please enter your password";
	private static String errorMessage3 ="Wrong email and password combination";

	@Test
	public static void testcase_01() throws Exception {
		driver.get("http://learnnew.learnyst.com/learn/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 1; j++) {
				student_repo.login_email().clear();
				Thread.sleep(4000);
				student_repo.login_email().sendKeys(randomEmailInputs[i]);
				Thread.sleep(4000);
				student_repo.login_password().clear();
				Thread.sleep(4000);
				student_repo.login_password().sendKeys(randomEmailpasswords[j]);
				Thread.sleep(4000);
				student_repo.login_button().click();
				Thread.sleep(4000);
				String errorMessage = student_repo.loginError().getText();
				if (errorMessage.equals(errorMessage1) || errorMessage.equals(errorMessage2) || errorMessage.equals(errorMessage3)) {
					Assert.assertEquals(true, true);
					Thread.sleep(4000);
				}
				Thread.sleep(4000);
				student_repo.confirmAlert().click();
				Thread.sleep(4000);
			}
		}
	}
}
