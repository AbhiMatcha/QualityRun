package e2e_Suites;

import org.testng.ITestResult;
import java.lang.reflect.Method;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class PositiveRun extends e2e_Suites.baseClass
{

    @BeforeClass
    public void beforeClass() {
        System.out.println(" ");
        System.out.println("Class name: " + this.getClass().getName());
        System.out.println(" ");
    }
    @BeforeMethod
    public String beforeTestMethod(Method testMethod){
        System.out.println(testMethod.getName());
        System.out.println(" ");
        return testMethod.getName();
    }
    @AfterMethod
    public void afterMethod(ITestResult result) {
        System.out.println(" ");
        if(result.getStatus()==ITestResult.FAILURE)
        {
            if(counter==2)
            {
                getscreenshot();
            }
            driver.manage().deleteAllCookies();
            driver.close();
        }
        else
        {
            driver.manage().deleteAllCookies();
            driver.close();
        }
    }
    @AfterClass
    public void afterClass() {
        System.out.println("Class name: " + this.getClass().getName() +
                "      ENDS");
        System.out.println(" ");

    }



    /* Points to remember
     *
     * This method decides how many times a test needs to be rerun.
     * TestNg will call this method every time a test fails.
     * assign value to retryLimit variable accordingly.
     *
     * Note: Counter variable declared in baseClass
     *
     */
    @Override
    public boolean retry(ITestResult result)
    {
        int retryLimit = 2;
        if(counter < retryLimit)
        {
            counter++;
            return true;
        }
        return false;
    }

    /*
     *
     * Need to find solution for this
     * issue with yopmail
     * taking more time to load even after giving
     * sufficient time
     *
     */

//    @Test
//    public void ConfirmationMail()
//    {
//        try{
//            openBrowser();
//            ConfirmationMail.confirmMail();
//        }catch(Exception e)
//        {
//            e.printStackTrace();
//            getscreenshot();
//            driver.close();
//        }
//
//    }

    @Test(retryAnalyzer = PositiveRun.class)
    public void Testcase01() throws Exception
    {
        openBrowser();
        testCasesAndMethods.PositivetestCases.Testcase_01.testcase_01();
    }

    @Test(retryAnalyzer = PositiveRun.class)
    public void Testcase02() throws Exception
    {
        openBrowser();
        testCasesAndMethods.PositivetestCases.Testcase_02.testcase_02();
    }

    @Test(retryAnalyzer = PositiveRun.class)
    public void Testcase03() throws Exception
    {
        openBrowser();
        testCasesAndMethods.PositivetestCases.Testcase_03.testcase_03();
    }
    @Test(retryAnalyzer = PositiveRun.class)
    public void Testcase04() throws Exception
    {
        openBrowser();
        testCasesAndMethods.PositivetestCases.Testcase_04.testcase_04();
    }
    @Test(retryAnalyzer = PositiveRun.class)
    public void Testcase05() throws Exception
    {
        openBrowser();
        testCasesAndMethods.PositivetestCases.Testcase_05.testcase_05();
    }
    @Test(retryAnalyzer = PositiveRun.class)
    public void Testcase06() throws Exception
    {
        openBrowser();
        testCasesAndMethods.PositivetestCases.Testcase_06.testcase_06();
    }

    @Test(retryAnalyzer = PositiveRun.class)
    public void Testcase07() throws Exception
    {
        openBrowser();
        testCasesAndMethods.PositivetestCases.Testcase_07.testcase_07();
    }
    @Test(retryAnalyzer = PositiveRun.class)
    public void Testcase08() throws Exception
    {
        openBrowser();
        testCasesAndMethods.PositivetestCases.Testcase_08.testcase_08();
    }
    @Test(retryAnalyzer = PositiveRun.class)
    public void Testcase09() throws Exception
    {
        openBrowser();
        testCasesAndMethods.PositivetestCases.Testcase_09.testcase_09();
    }
    @Test(retryAnalyzer = PositiveRun.class)
    public void Testcase10() throws Exception
    {
        openBrowser();
        testCasesAndMethods.PositivetestCases.Testcase_10.testcase_10();
    }

    @Test(retryAnalyzer = PositiveRun.class)
    public void Testcase11() throws Exception
    {
        openBrowser();
        testCasesAndMethods.PositivetestCases.Testcase_11.testcase_11();
    }

    @Test(retryAnalyzer = PositiveRun.class)
    public void Testcase12() throws Exception

    {
        openBrowser();
        testCasesAndMethods.PositivetestCases.Testcase_12.testcase_12();
    }

    @Test(retryAnalyzer = PositiveRun.class)
    public void Testcase13() throws Exception

    {
        openBrowser();
        testCasesAndMethods.PositivetestCases.Testcase_13.testcase_13();
    }

    @Test(retryAnalyzer = PositiveRun.class)
    public void Testcase14() throws Exception
    {
        openBrowser();
        testCasesAndMethods.PositivetestCases.Testcase_14.testcase_14();
    }
    @Test(retryAnalyzer = PositiveRun.class)
    public void Testcase15() throws Exception
    {
        openBrowser();
        testCasesAndMethods.PositivetestCases.Testcase_15.testcase_15();
    }

    @Test(retryAnalyzer = PositiveRun.class)
    public void build_Verification_Test() throws Exception
    {
        openBrowser();
        testCasesAndMethods.methods.Login_flow.loginFlow();
        testCasesAndMethods.methods.Logout_flow.logoutFlow();
        Thread.sleep(3000);
        testCasesAndMethods.methods.Signup_flow.signupFlow();
        testCasesAndMethods.methods.Logout_flow.logoutFlow();
    }

    @Test(retryAnalyzer = PositiveRun.class)
    public void sanity_Test() throws Exception
    {
        for(int j=0;j<2;j++)
        {
            switch (j) {

                case 0 :
                    openBrowser();
                    driver.get("http://learnnew.learnyst.com/learn/login");
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    testCasesAndMethods.methods.Signup_flow.signupFlow();
                    testCasesAndMethods.methods.Mock_test1.fillInTheBlank_Function();
                    driver.manage().deleteAllCookies();
                    driver.close();
                    break;

                case 1 :

                    openBrowser();
                    driver.get("http://learnnew.learnyst.com/learn/login");
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    testCasesAndMethods.methods.Signup_flow.signupFlow();
                    testCasesAndMethods.methods.Mock_test2.downloadCertificate();
                    break;
            }
        }
    }
}