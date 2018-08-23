package e2e_Suites;

import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class NegativeRun extends e2e_Suites.baseClass
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
            if(counter==2) {
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
    public void afterClass()
    {
        System.out.println("Class name: " + this.getClass().getName() +
                "     ENDS");
        System.out.println(" ");
    }


    /* Points to remember
     *
     * This method decides how many times a test needs to be rerun.
     * TestNg will call this method every time a test fails.
     * assign value to retryLimit variable accordingly.
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


    @Test(retryAnalyzer = NegativeRun.class)
    public void Testcase01() throws Exception
    {
        openBrowser();
        testCasesAndMethods.NegativetestCases.Testcase_01.testcase_01();
    }

}
