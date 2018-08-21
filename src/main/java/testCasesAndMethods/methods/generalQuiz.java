package testCasesAndMethods.methods;

import objectRepository.quizRepo;
import objectRepository.student_repo;
import org.junit.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class generalQuiz extends quizRepo {
    /* Quiz type - 5 | General Quiz*/

    @Test
    public static void GeneralQuiz() throws Exception
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
        quizRepo.generalQuiz().click();
        Thread.sleep(2000);
        student_repo.enrollFreeCourse().click();
        Thread.sleep(2000);
        student_repo.takeTest().click();
        Thread.sleep(2000);
        student_repo.startTest().click();
        Thread.sleep(5000);
        quizRepo.generalQuizQues1().click();
        Thread.sleep(5000);
        student_repo.saveButton().click();
        Thread.sleep(5000);
        quizRepo.fillInTheBlankAnswerInput().sendKeys(quizRepo.generalQuizQues2Answer());
        Thread.sleep(4000);
        student_repo.saveButton().click();
        Thread.sleep(2000);
        quizRepo.fillInTheBlankAnswerInput().sendKeys(quizRepo.generalQuizQues3Answer());
        Thread.sleep(4000);
        student_repo.saveButton().click();
        Thread.sleep(2000);
        quizRepo.FeedbackInput().sendKeys("This is  my feed back");
        Thread.sleep(4000);
        student_repo.saveButton().click();
        Thread.sleep(4000);
        student_repo.confirmAlert().click();
        Thread.sleep(5000);
        quizRepo.finalSubmit().click();
        Thread.sleep(5000);
        Assert.assertEquals(true, student_repo.solutions().isDisplayed());
    }
}
