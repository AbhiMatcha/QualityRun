package testCasesAndMethods.methods;

import objectRepository.quizRepo;
import objectRepository.student_repo;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SscCglTier1 extends quizRepo
{
    /* Quiz type - 2 | SSC-CGL Tier 1 quiz */

    @Test
    public static void SSCcglTier1() throws Exception
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
        quizRepo.SSCcglTier1quiz().click();
        Thread.sleep(2000);
        student_repo.enrollFreeCourse().click();
        Thread.sleep(2000);
        student_repo.takeTest().click();
        Thread.sleep(2000);
        student_repo.startTest().click();
        Thread.sleep(5000);
        quizRepo.SSCcglTier1quizQues1().click();
        Thread.sleep(5000);
        student_repo.saveButton().click();
        Thread.sleep(5000);
        quizRepo.SSCcglTier1quizQues2().click();
        Thread.sleep(5000);
        student_repo.saveButton().click();
        Thread.sleep(5000);
        quizRepo.SSCcglTier1quizQues3().click();
        Thread.sleep(5000);
        student_repo.saveButton().click();
        Thread.sleep(5000);
        quizRepo.FeedbackInput().sendKeys("get lost");
        Thread.sleep(5000);
        student_repo.saveButton().click();
        Thread.sleep(5000);
        student_repo.submitButton().click();
        Thread.sleep(5000);
        quizRepo.finalSubmit().click();
        Thread.sleep(5000);
        Assert.assertTrue(student_repo.solutions().isDisplayed());

    }
}
