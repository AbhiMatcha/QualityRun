package testCasesAndMethods.methods;

import objectRepository.quizRepo;
import objectRepository.student_repo;
import org.junit.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class IitJEEadvQuiz extends quizRepo
{
    /* Quiz type - 2 | IIT-JEE ADV Quiz quiz*/

    @Test
    public static void IitJeeAdvQuiz() throws Exception
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
        quizRepo.IITjeeADVPaperQuiz().click();
        Thread.sleep(2000);
        student_repo.enrollFreeCourse().click();
        Thread.sleep(2000);
        student_repo.takeTest().click();
        Thread.sleep(2000);
        student_repo.startTest().click();
        Thread.sleep(5000);
        quizRepo.IITjeeADVPaperquizQues1().click();
        Thread.sleep(5000);
        student_repo.saveButton().click();
        Thread.sleep(5000);
        quizRepo.fillInTheBlankAnswerInput().sendKeys(IITjeeADVPaperquizQues2Answer());
        Thread.sleep(4000);
        student_repo.saveButton().click();
        Thread.sleep(4000);
        quizRepo.fillInTheBlankAnswerInput().sendKeys(IITjeeADVPaperquizQues3Answer());
        Thread.sleep(4000);
        student_repo.saveButton().click();
        Thread.sleep(4000);
        quizRepo.IITjeeADVPaperquizQues4().click();
        Thread.sleep(5000);
        student_repo.saveButton().click();
        Thread.sleep(5000);
        quizRepo.fillInTheBlankAnswerInput().sendKeys(IITjeeADVPaperquizQues5Answer());
        Thread.sleep(4000);
        student_repo.saveButton().click();
        Thread.sleep(4000);
        quizRepo.fillInTheBlankAnswerInput().sendKeys(IITjeeADVPaperquizQues6Answer());
        Thread.sleep(4000);
        student_repo.saveButton().click();
        Thread.sleep(4000);
        quizRepo.IITjeeADVPaperquizQues7().click();
        Thread.sleep(5000);
        student_repo.saveButton().click();
        Thread.sleep(5000);
        quizRepo.fillInTheBlankAnswerInput().sendKeys(IITjeeADVPaperquizQues8Answer());
        Thread.sleep(4000);
        student_repo.saveButton().click();
        Thread.sleep(4000);
        quizRepo.fillInTheBlankAnswerInput().sendKeys(IITjeeADVPaperquizQues9Answer());
        Thread.sleep(4000);
        student_repo.saveButton().click();
        Thread.sleep(4000);
        student_repo.submitButton().click();
        Thread.sleep(5000);
        quizRepo.finalSubmit().click();
        Thread.sleep(5000);
        Assert.assertTrue(student_repo.solutions().isDisplayed());
    }
}
