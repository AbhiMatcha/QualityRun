package objectRepository;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.utils;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;

public class student_repo extends utils{

    /* ################ Login page components ###############*/


    public static WebElement login_email(){
        element = driver.findElement(By.id("lernystLogin_new_user_user_email"));
        return element;
    }
    public static WebElement login_password(){
        element = driver.findElement(By.id("lernystLogin_new_user_user_password"));
        return element;
    }
    public static WebElement login_button(){
        element = driver.findElement(By.id("js-signin"));
        return element;
    }

    public static WebElement loginError(){
        element = driver.findElement(By.id("swal2-content"));
        return element;
    }
    /* ################### header components  #############*/

    public static WebElement profile_button(){
        element = driver.findElement(By.id("userProfileDiv"));
        return element;
    }
    public static WebElement settings_button(){
        element = driver.findElement(By.id("settings"));
        return element;
    }
    public static WebElement refresh_button(){
        element = driver.findElement(By.id("js-refresh"));
        return element;
    }
    public static WebElement logout_button(){
        element = driver.findElement(By.id("signOutID"));
        return element;
    }
    public static WebElement support_button(){
        element = driver.findElement(By.id("nav-support"));
        return element;
    }
    public static WebElement supportTicket_title(){
        element = driver.findElement(By.id("title"));
        return element;
    }
    public static WebElement supportTicket_description(){
        element = driver.findElement(By.id("description"));
        return element;
    }
    public static WebElement supportTicket_checkBox(){
        element = driver.findElement(By.id("viewedhelp"));
        return element;
    }
    public static WebElement supportTicket_submit(){
        element = driver.findElement(By.id("submit-ticket"));
        return element;
    }
    public static WebElement supportTicket_confirmSubmit(){
        element = driver.findElement(By.className("swal2-confirm"));
        return element;
    }

    /* ################# sign-up page components ################*/

    public static WebElement signup_button(){
        element = driver.findElement(By.xpath("//*[@id='js-signin-form']/div/div/div/p/a"));
        return element;
    }
    public static WebElement signup_mail(){
        element = driver.findElement(By.id("signup-email"));
        return element;
    }
    public static WebElement signup_password(){
        element = driver.findElement(By.id("signup-password"));
        return element;
    }
    public static WebElement signupForFree(){
        element = driver.findElement(By.id("js-signup"));
        return element;
    }
    public static WebElement EmailAlert(){
        element = driver.findElement(By.id("resendEmail"));
        return element;
    }
    public static WebElement confirmAlert(){
        element = driver.findElement(By.className("swal2-confirm"));
        return element;
    }
    public static WebElement successForSentEmail(){
        element = driver.findElement(By.className("swal2-confirm"));
        return element;
    }
    public static WebElement skipLogin(){
        element = driver.findElement(By.className("js-skipLogin"));
        return element;
    }

    /* yop mail components */

    public static WebElement enterYopmail(){
        element = driver.findElement(By.id("login"));
        return element;
    }
    public static WebElement checkYopmailInbox(){
        element = driver.findElement(By.className("sbut"));
        return element;
    }
    public static WebElement inboxMessage(){
        element = driver.findElement(By.xpath("//*[@id='m2']/div/a/span[1]"));
        return element;
    }

    public static WebElement ActivateInInbox(){
        element = driver.findElement(By.xpath("//*[@id='mailmillieu']/div[2]/table/tbody/tr[2]/td/table/tbody/tr[3]/td/a"));
        return element;
    }
//    @FindBy(xpath = "//*[contains(text(), 'ACTIVATE ACCOUNT')]")
//	public static WebElement ActivateInInbox;

    /* yop mail components */

    /* ############################## Courses components ##############################*/

    public static WebElement fillInTheBlank_Test(){
        element = driver.findElement(By.id("22755"));
        return element;
    }
    public static WebElement getCertificate_Test(){
    	/* created course which have
        option to download certificate
        on calling this getCertificate_Test() we are clicking the course
        but not getting the certificate*/
        element = driver.findElement(By.id("22663"));
        return element;
    }
    public static WebElement multipleChoice_Test(){
        element = driver.findElement(By.id("22068"));
        return element;
    }
    public static WebElement enrollFreeCourse(){
        element = driver.findElement(By.className("enrollCourse"));
        return element;
    }
    public static WebElement resumeButton(){
        element = driver.findElement(By.linkText("RESUME"));
        return element;
    }
    public static WebElement takeTest(){
        element = driver.findElement(By.className("js-takeTest"));
        return element;
    }

    public static WebElement startTest(){
        element = driver.findElement(By.className("js-startTest"));
        return element;
    }

    /* ############################## Courses components ##############################*/
    /* ------------------------------------------------------------------------------------------ */
    /*############################## tabs in course Notes & Discussion components ###############################*/

    public static WebElement cancelButton(){
        element = driver.findElement(By.className("swal2-cancel"));
        return element;
    }

    public static WebElement syllabusTab(){
        element = driver.findElement(By.xpath("//*[@id='js-myTabs']/li[2]/a"));
        return element;
    }
    public static WebElement syllabusCourseTitle(){
        element = driver.findElement(By.className("syllabus-section-title"));
        return element;
    }
    public static WebElement syllabusLessonTitle(){
        element = driver.findElement(By.className("syllabus-lesson-title"));
        return element;
    }
    public static WebElement syllabusBuyCousrePopup(){
        element = driver.findElement(By.className("swal2-confirm"));
        return element;
    }
    public static WebElement certificateTab(){
        element = driver.findElement(By.xpath("//*[@id='js-myTabs']/li[3]/a"));
        return element;
    }
    public static WebElement TakeTestThroughCertificateTab(){
        element = driver.findElement(By.xpath("//*[@id='certificateTestLists']/li/div/a/div[1]"));
        return element;
    }
    public static WebElement certificateBuyCoursePopUp(){
        element = driver.findElement(By.className("swal2-confirm"));
        return element;
    }

    public static WebElement discussionTab(){
        element = driver.findElement(By.xpath("//*[@id='js-myTabs']/li[4]/a"));
        return element;
    }
    public static WebElement discussionBuyCoursePopUp(){
        element = driver.findElement(By.className("swal2-confirm"));
        return element;
    }
    public static WebElement discussionAsk(){
        element = driver.findElement(By.id("askQ"));
        return element;
    }
    public static WebElement enterInput(){
        element = driver.findElement(By.id("postQuestionInput"));
        return element;
    }
    public static WebElement postInput(){
        element = driver.findElement(By.id("addPostQuestion"));
        return element;
    }
    public static WebElement discussionEditInput(){
        element = driver.findElement(By.className("editNote"));
        return element;
    }
    public static WebElement noteEditInput(){
        element = driver.findElement(By.className("js-editNote"));
        return element;
    }
    public static WebElement discussionDeleteAsk(){
        element = driver.findElement(By.className("js-removeDs"));
        return element;
    }
    public static WebElement noteDeleteAsk(){
        element = driver.findElement(By.className("js-removeNote"));
        return element;
    }

    public static WebElement deleteConfirm(){
        element = driver.findElement(By.className("swal2-confirm"));
        return element;
    }
    public static WebElement discussionReplyAsk(){
        element = driver.findElement(By.className("replyClass"));
        return element;
    }
    public static WebElement noteTab(){
        element = driver.findElement(By.xpath("//*[@id='js-myTabs']/li[5]/a"));
        return element;
    }
    public static WebElement noteBuyCoursePopUp(){
        element = driver.findElement(By.className("swal2-confirm"));
        return element;
    }
    public static WebElement noteCreateTab(){
        element = driver.findElement(By.id("createNote"));
        return element;
    }

    public static WebElement overviewTab(){
        element = driver.findElement(By.xpath("//*[@id='js-myTabs']/li[1]/a"));
        return element;
    }
    public static WebElement coursePrice(){
        element = driver.findElement(By.className("course-price-val"));
        return element;
    }
    public static WebElement courseExpiry(){
        element = driver.findElement(By.className("js-expiry"));
        return element;
    }
    public static WebElement courseDiscountPrice(){
        element = driver.findElement(By.className("course-orig-amnt"));
        return element;
    }


    /*############################## tabs in course Notes & Discussion components ###############################*/
    /* ---------------------------------------------------------------------------------------------------------- */
    /* ################################## Answers for the tests #################################### */

    public static WebElement fillInTheBlankAnswerInput(){
        element = driver.findElement(By.id("answer"));
        return element;
    }
    public static WebElement getCertificateTest_Answer1(){
        element = driver.findElement(By.xpath(getCertificateTest_randomAnswer1()));
        return element;
    }
    public static WebElement getCertificateTest_Answer2(){
        element = driver.findElement(By.xpath(getCertificateTest_randomAnswer2()));
        return element;
    }
    public static String getCertificateTest_randomAnswer1()
    {	//correct answer option 2
//    	String option1="//*[@id='optionsTpl']/div/div/div/div/ul/li[1]/label/div[1]/label";
        String option2="//*[@id='optionsTpl']/div/div/div/div/ul/li[2]/label/div[1]/label";
//    	String option3="//*[@id='optionsTpl']/div/div/div/div/ul/li[3]/label/div[1]/label";
//    	String option4="//*[@id='optionsTpl']/div/div/div/div/ul/li[4]/label/div[1]/label";
//    	String selectAnswer[] = {option1,option2,option3,option4};
        String selectAnswer[] = {option2};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    public static String getCertificateTest_randomAnswer2()
    {	//correct answer option 4
//    	String option1="//*[@id='optionsTpl']/div/div/div/div/ul/li[1]/label/div[1]/label";
//    	String option2="//*[@id='optionsTpl']/div/div/div/div/ul/li[2]/label/div[1]/label";
//    	String option3="//*[@id='optionsTpl']/div/div/div/div/ul/li[3]/label/div[1]/label";
        String option4="//*[@id='optionsTpl']/div/div/div/div/ul/li[4]/label/div[1]/label";
//    	String selectAnswer[] = {option1,option2,option3,option4};
        String selectAnswer[] = {option4};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }

    /* ############################## Answers for the tests ############################### */
    /* ------------------------------------------------------------------------------------ */
    /*########################### Test components and payment###############################*/

    public static WebElement saveButton(){
        element = driver.findElement(By.className("js_nextQuestn"));
        return element;
    }
    public static WebElement nextButton(){
        element = driver.findElement(By.className("js-practice-next"));
        return element;
    }
    public static WebElement submitButton(){
        element = driver.findElement(By.className("swal2-confirm"));
        return element;
    }
    public static WebElement solutions(){
        element = driver.findElement(By.id("js-viewAns"));
        return element;
    }
    public static WebElement retakeTest(){
        element = driver.findElement(By.id("js-revise"));
        return element;
    }
    public static WebElement buynowButton(){
        element = driver.findElement(By.className("buyCourse"));
        return element;
    }
    public static WebElement enterCoupon(){
        element = driver.findElement(By.id("coupon-input"));
        return element;
    }
    public static WebElement applyCoupon(){
        element = driver.findElement(By.id("js-apply-coupon"));
        return element;
    }
    public static WebElement paySecurely(){
        element = driver.findElement(By.id("js-paynow"));
        return element;
    }
    public static WebElement enterContact(){
        element = driver.findElement(By.id("contact"));
        return element;
    }
    public static WebElement selectPaymentType(){
        element = driver.findElement(By.xpath("//*[@id='payment-options']/div[2]"));
        return element;
    }
    public static WebElement selectDifferentBank(){
        element = driver.findElement(By.id("bank-select"));
        Select dropdown= new Select(element);
        dropdown.selectByVisibleText(randombank());
        return element;
    }
    public static String randombank()
    {
        String selectAnswer[] = {"Andhra Bank","Axis Bank","Canara Bank","HDFC Bank"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }
    public static WebElement payNow(){
        element = driver.findElement(By.xpath("//*[@id='footer']/span[2]"));
        return element;
    }
    public static WebElement successButton(){
        element = driver.findElement(By.className("success"));
        return element;
    }
    public static WebElement startCourse(){
        element = driver.findElement(By.className("gotoPaidCourse"));
        return element;
    }
    public static WebElement downloadCertificate_button(){
        element = driver.findElement(By.id("certificateBtn"));
        return element;
    }
    public static WebElement certificate_page(){
        element = driver.findElement(By.xpath("//*[@id='plugin']"));
        return element;
    }
    public static WebElement errorMessage_forDownload(){
        element = driver.findElement(By.className("redMsg"));
        return element;
    }
    public static WebElement successMessage_forDownload(){
        element = driver.findElement(By.className("greenMsg"));
        return element;
    }
    /*########################### Test components and payment###############################*/
    public static WebElement offeredCourse(){
        element = driver.findElement(By.xpath("//*[@id='dashTabs']/li[2]/a"));
        return element;
    }

    public static WebElement myCourse(){
        element = driver.findElement(By.xpath("//*[@id='dashTabs']/li[1]/a"));
        return element;
    }
    public static WebElement discountAmount(){
        element = driver.findElement(By.xpath("//*[@id='js-scoreReportList']/tr[1]/td[2]/span"));
        return element;
    }
    public static WebElement restoreAnswers(){
        element = driver.findElement(By.className("btn-success"));
        return element;
    }


    @Override
    public boolean retry(ITestResult result) {
        return false;
    }
}
