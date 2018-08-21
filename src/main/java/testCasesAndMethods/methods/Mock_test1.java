package testCasesAndMethods.methods;
import objectRepository.student_repo;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Mock_test1 extends student_repo {
    @Test
    public static void fillInTheBlank_Function() throws Exception {
        try{
            student_repo.fillInTheBlank_Test().click();
            Thread.sleep(2000);
            student_repo.enrollFreeCourse().click();
            Thread.sleep(2000);
            student_repo.resumeButton().click();
            Thread.sleep(2000);
            student_repo.takeTest().click();
            Thread.sleep(2000);
            student_repo.startTest().click();
            Thread.sleep(2000);
            student_repo.fillInTheBlankAnswerInput().sendKeys(randomAnswer());
            Thread.sleep(2000);
            student_repo.saveButton().click();
            Thread.sleep(2000);
            student_repo.nextButton().click();
            Thread.sleep(2000);
            student_repo.fillInTheBlankAnswerInput().sendKeys(randomAnswer());
            Thread.sleep(2000);
            student_repo.saveButton().click();
            Thread.sleep(2000);
            student_repo.nextButton().click();
            Thread.sleep(2000);
            student_repo.submitButton().click();
            Thread.sleep(5000);
            Assert.assertEquals(true, student_repo.solutions().isDisplayed());
        }finally{

        }
    }

}
