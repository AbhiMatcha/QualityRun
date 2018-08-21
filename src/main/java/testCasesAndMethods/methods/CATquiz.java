package testCasesAndMethods.methods;

import objectRepository.quizRepo;
import objectRepository.student_repo;
import org.junit.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class CATquiz extends quizRepo
{
    /* Quiz type - 2 | CAT quiz*/

    @Test
    public static void CatQuiz() throws Exception
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
        quizRepo.CATquiz().click();
        Thread.sleep(2000);
        student_repo.enrollFreeCourse().click();
        Thread.sleep(2000);
        student_repo.takeTest().click();
        Thread.sleep(2000);
        student_repo.startTest().click();
        Thread.sleep(5000);
        quizRepo.CATQuizQues1().click();
        Thread.sleep(5000);
        student_repo.saveButton().click();
        Thread.sleep(5000);
        quizRepo.CATQuizQues2().click();
        Thread.sleep(4000);
        student_repo.saveButton().click();
        Thread.sleep(3000);
        student_repo.confirmAlert().click();
        Thread.sleep(5000);
        quizRepo.finalSubmit().click();
        Thread.sleep(5000);
        student_repo.confirmAlert().click();
        Thread.sleep(4000);
        quizRepo.calculator().click();
        Thread.sleep(4000);
        quizRepo.value1().click();
        Thread.sleep(4000);
        quizRepo.multiplication().click();
        Thread.sleep(4000);
        quizRepo.value1().click();
        Thread.sleep(4000);
        quizRepo.equals().click();
        Thread.sleep(3000);
        quizRepo.closeCalculator().click();
        Thread.sleep(4000);
        quizRepo.CATQuizQues3().click();
        student_repo.saveButton().click();
        Thread.sleep(5000);
        student_repo.confirmAlert().click();
        Thread.sleep(4000);
        quizRepo.finalSubmit().click();
        student_repo.confirmAlert().click();
        Thread.sleep(4000);
        quizRepo.CATQuizQues4().click();
        Thread.sleep(4000);
        student_repo.saveButton().click();
        Thread.sleep(5000);
        student_repo.confirmAlert().click();
        Thread.sleep(5000);
        quizRepo.finalSubmit().click();
        Thread.sleep(5000);
        Assert.assertTrue(student_repo.solutions().isDisplayed());
    }

}
