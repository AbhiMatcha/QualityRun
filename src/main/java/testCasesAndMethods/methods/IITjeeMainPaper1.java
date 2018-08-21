package testCasesAndMethods.methods;

import objectRepository.quizRepo;
import objectRepository.student_repo;
import org.junit.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class IITjeeMainPaper1 extends quizRepo {
    /* Quiz type - 7 | IIT-JEE Main Paper 1 */

    @Test
    public static void IitJeeMainPaper1() throws Exception
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
        quizRepo.IITjeeMainPaper1Quiz().click();
        Thread.sleep(2000);
        student_repo.enrollFreeCourse().click();
        Thread.sleep(2000);
        student_repo.takeTest().click();
        Thread.sleep(2000);
        student_repo.startTest().click();
        Thread.sleep(5000);
        quizRepo.IITjeeMainPaper1quizQues1().click();
        Thread.sleep(5000);
        student_repo.saveButton().click();
        Thread.sleep(5000);
        quizRepo.chemistryTab().click();
        Thread.sleep(4000);
        quizRepo.IITjeeMainPaper1quizQues5().click();
        Thread.sleep(4000);
        student_repo.saveButton().click();
        Thread.sleep(5000);
        quizRepo.fillInTheBlankAnswerInput().sendKeys(IITjeeMainPaper1quizQues6Answer());
        Thread.sleep(4000);
        quizRepo.mathematicsTab().click();
        Thread.sleep(3000);
        quizRepo.IITjeeMainPaper1quizQues7().click();
        Thread.sleep(4000);
        quizRepo.physicsTab().click();
        Thread.sleep(3000);
        student_repo.saveButton().click();
        Thread.sleep(5000);
        quizRepo.fillInTheBlankAnswerInput().sendKeys(IITjeeMainPaper1quizQues2Answer());
        Thread.sleep(3000);
        student_repo.saveButton().click();
        Thread.sleep(3000);
        quizRepo.fillInTheBlankAnswerInput().sendKeys(IITjeeMainPaper1quizQues3Answer());
        Thread.sleep(3000);
        student_repo.saveButton().click();
        Thread.sleep(3000);
        quizRepo.FeedbackInput().sendKeys("This is  my feed back");
        Thread.sleep(3000);
        student_repo.saveButton().click();
        Thread.sleep(5000);
        student_repo.saveButton().click();
        Thread.sleep(5000);
        quizRepo.fillInTheBlankAnswerInput().sendKeys(IITjeeMainPaper1quizQues6Answer());
        Thread.sleep(4000);
        student_repo.saveButton().click();
        Thread.sleep(5000);
        quizRepo.IITjeeMainPaper1quizQues7().click();
        Thread.sleep(4000);
        student_repo.saveButton().click();
        Thread.sleep(3000);
        Assert.assertTrue(student_repo.submitButton().isDisplayed());
        student_repo.submitButton().click();
        Thread.sleep(5000);
        quizRepo.finalSubmit().click();
        Thread.sleep(5000);
        Assert.assertTrue(student_repo.solutions().isDisplayed());
    }
}
