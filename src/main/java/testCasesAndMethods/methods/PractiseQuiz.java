package testCasesAndMethods.methods;

import objectRepository.quizRepo;
import objectRepository.student_repo;
import org.junit.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class PractiseQuiz extends quizRepo {
    /* Quiz type - 1 | Practise Quiz*/

    @Test
    public static void practiseQuiz() throws Exception
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
        quizRepo.PractiseQuiz().click();
        Thread.sleep(2000);
        student_repo.enrollFreeCourse().click();
        Thread.sleep(2000);
        student_repo.takeTest().click();
        Thread.sleep(2000);
        student_repo.startTest().click();
        Thread.sleep(5000);
        quizRepo.fillInTheBlankAnswerInput().sendKeys(quizRepo.practiseQuizQues1Answer());;
        Thread.sleep(5000);
        student_repo.saveButton().click();
        Thread.sleep(5000);
        student_repo.nextButton().click();
        Thread.sleep(3000);
        quizRepo.practiseQuizQues2().click();
        Thread.sleep(4000);
        student_repo.saveButton().click();
        Thread.sleep(2000);
        student_repo.nextButton().click();
        Thread.sleep(3000);
        quizRepo.fillInTheBlankAnswerInput().sendKeys(quizRepo.practiseQuizQues3Answer());
        Thread.sleep(4000);
        student_repo.saveButton().click();
        Thread.sleep(2000);
        student_repo.nextButton().click();
        Thread.sleep(3000);
        student_repo.confirmAlert().click();
        Thread.sleep(5000);
        Assert.assertEquals(true, student_repo.solutions().isDisplayed());
    }



}
