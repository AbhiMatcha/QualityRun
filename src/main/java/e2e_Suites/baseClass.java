package e2e_Suites;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.IRetryAnalyzer;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class baseClass implements IRetryAnalyzer
{
    //protected static FirefoxDriver driver;
    public static int counter = 0;
    protected static WebDriver driver;
    @Rule
    public TestName name = new TestName();

    public static void openBrowser()
    {
        /* Points to remember
         *
         * This is for fireFox headless.
         * If you want to test using firefox head less
         * uncomment the below lines.
         *
         * Note: Make sure that the needed imports should be uncommented as well.
         *
         */

//	    System.out.println("running in firefox");
//	    FirefoxBinary firefoxBinary = new FirefoxBinary();
//	    firefoxBinary.addCommandLineOptions("--headless");
//	    /Users/learnyst/Java_Automation/Learny/UI_automation/e2e/Automation_e2e_student
//	    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Driver/Mac/geckodriver");
//	    FirefoxOptions firefoxOptions = new FirefoxOptions();
//	    firefoxOptions.setBinary(firefoxBinary);
//      driver = new FirefoxDriver(firefoxOptions);

        /* Points to remember
         *
         * This is for chrome
         * Enable when need to test automated test in local machine.
         *
         * Note : Need to select chromedriver path as "/Driver/Mac/chromedriver"
         * when running in local and select "/Driver/Ubuntu/chromedriver" for server
         * machine.
         */
//
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("-start-fullscreen");
//        driver = new ChromeDriver(chromeOptions);
//        driver.manage().deleteAllCookies();

        /* Points to remember
         *
         * This is for chrome Headless.
         * If you want to test the automated test using chrome head less
         * uncomment the belows lines
         *
         * Note : Before pushing code to "GIT" dont remove the uncommented line
         * as we are running the code using chrome headless browser
         * Note : Need to select chromedriver path as "/Driver/Ubuntu/chromedriver"
         * when running in server and select "/Driver/Mac/chromedriver" for local
         * machine.
         */

//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/Mac/chromedriver");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/Ubuntu/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.manage().window().maximize();

    }

    /*
     * Whenever test fails it will take screenshot
     */

    public void getscreenshot()
    {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
            Date date = new Date();
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("Reports/screenshot" + "_" + this.getClass().getName()  + dateFormat.format(date) + ".png"));
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
