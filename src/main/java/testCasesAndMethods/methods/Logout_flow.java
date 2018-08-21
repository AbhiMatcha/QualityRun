package testCasesAndMethods.methods;
import objectRepository.student_repo;
import org.testng.annotations.Test;

public class Logout_flow extends student_repo
{
    @Test
    public static void logoutFlow()
    {
        student_repo.profile_button().click();
        student_repo.logout_button().click();
    }
}
