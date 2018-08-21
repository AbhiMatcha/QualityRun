package testCasesAndMethods.PositivetestCases;
import objectRepository.quizRepo;
import testCasesAndMethods.methods.*;
import org.testng.annotations.Test;

public class Testcase_15 extends quizRepo
{
    @Test
    public static void testcase_15() throws Exception
    {
        try
        {
            generalQuiz.GeneralQuiz();
            Thread.sleep(4000);
            quizRepo.backButton().click();
            Thread.sleep(4000);
            exitFromTest().click();
            Thread.sleep(4000);
            Logout_flow.logoutFlow();
            Thread.sleep(4000);
            UPSCpaper1.Upscpaper1();
            Thread.sleep(4000);
            quizRepo.backButton().click();
            Thread.sleep(4000);
            exitFromTest().click();
            Thread.sleep(4000);
            Logout_flow.logoutFlow();
            Thread.sleep(4000);
            CATquiz.CatQuiz();
            Thread.sleep(4000);
            quizRepo.backButton().click();
            Thread.sleep(4000);
            exitFromTest().click();
            Thread.sleep(4000);
            Logout_flow.logoutFlow();
            Thread.sleep(4000);
            UPSCpaper2.Upscpaper2();
            Thread.sleep(4000);
            quizRepo.backButton().click();
            Thread.sleep(4000);
            exitFromTest().click();
            Thread.sleep(4000);
            Logout_flow.logoutFlow();
            Thread.sleep(4000);
            PractiseQuiz.practiseQuiz();
            Thread.sleep(4000);
            quizRepo.backButton().click();
            Thread.sleep(4000);
            Logout_flow.logoutFlow();
            Thread.sleep(4000);
            CSATquiz.CsatQuiz();
            Thread.sleep(4000);
            quizRepo.backButton().click();
            Thread.sleep(4000);
            exitFromTest().click();
            Thread.sleep(4000);
            Logout_flow.logoutFlow();
            Thread.sleep(4000);
            IITjeeMainPaper1.IitJeeMainPaper1();
            Thread.sleep(4000);
            quizRepo.backButton().click();
            Thread.sleep(4000);
            exitFromTest().click();
            Thread.sleep(4000);
            Logout_flow.logoutFlow();
            Thread.sleep(4000);
            IitJEEadvQuiz.IitJeeAdvQuiz();
            Thread.sleep(4000);
            quizRepo.backButton().click();
            Thread.sleep(4000);
            exitFromTest().click();
            Thread.sleep(4000);
            Logout_flow.logoutFlow();
            Thread.sleep(4000);
            SscCglTier1.SSCcglTier1();
            Thread.sleep(4000);
            quizRepo.backButton().click();
            Thread.sleep(4000);
            exitFromTest().click();
            Thread.sleep(4000);
            Logout_flow.logoutFlow();
            Thread.sleep(4000);
            SscCglTier2.SSCcglTier2();
            Thread.sleep(4000);
            quizRepo.backButton().click();
            Thread.sleep(4000);
            exitFromTest().click();
            Thread.sleep(4000);
            Logout_flow.logoutFlow();
            Thread.sleep(4000);
        }
        finally
        {

        }
    }

}
