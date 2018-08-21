package testCasesAndMethods.methods;
import objectRepository.student_repo;
import org.testng.annotations.Test;

public class Signup_flow extends  student_repo{
    @Test
    public static void signupFlow() {
        try {
            Thread.sleep(4000);
            driver.navigate().refresh();
            Thread.sleep(5000);
            student_repo.signup_button().click();
            student_repo.signup_mail().sendKeys(randomEmail()+"@yopmail.com");
            student_repo.signup_password().sendKeys("abhi1234");
            student_repo.signupForFree().click();
            System.out.println(" ");
            Thread.sleep(3000);
            student_repo.offeredCourse().click();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
