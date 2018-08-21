package testCasesAndMethods.methods;
import objectRepository.student_repo;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

public class Login_flow extends student_repo
{
    @Test
    public static void loginFlow()
    {
        // Open school
        driver.get("http://learnnew.learnyst.com/learn/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        student_repo.login_email().sendKeys("abhishek.matcha@learnyst.com");
        student_repo.login_password().sendKeys("abhi1234");
        student_repo.login_button().click();
    }
}



