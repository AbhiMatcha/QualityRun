package testCasesAndMethods.methods;

import objectRepository.student_repo;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class Mock_test2 extends student_repo
{
    @Test
    public static void downloadCertificate() throws Exception {
        try{
            student_repo.getCertificate_Test().click();
            student_repo.enterCoupon().sendKeys(randomCoupon());
            student_repo.applyCoupon().click();
            student_repo.buynowButton().click();
            student_repo.paySecurely().click();
            driver.switchTo().frame(0);
            student_repo.enterContact().sendKeys("9494900017");
            Thread.sleep(3000);
            student_repo.selectPaymentType().click();
            Thread.sleep(5000);
            student_repo.selectDifferentBank();
            Thread.sleep(5000);
            student_repo.payNow().click();
            Thread.sleep(3000);
            Set <String> st= driver.getWindowHandles();
            Iterator<String> it = st.iterator();
            String parent =  it.next();
            String child =it.next();
            driver.switchTo().window(child);
            student_repo.successButton().click();
            Thread.sleep(3000);
            driver.switchTo().window(parent);
            assertTrue(student_repo.startCourse().isDisplayed());
            Thread.sleep(3000);
            student_repo.startCourse().click();
            Thread.sleep(3000);
            student_repo.resumeButton().click();
            Thread.sleep(3000);
            student_repo.takeTest().click();
            Thread.sleep(3000);
            student_repo.startTest().click();
            Thread.sleep(3000);
            student_repo.getCertificateTest_Answer1().click();
            Thread.sleep(2000);
            student_repo.saveButton().click();
            Thread.sleep(2000);
            student_repo.nextButton().click();
            Thread.sleep(2000);
            student_repo.getCertificateTest_Answer2().click();
            Thread.sleep(2000);
            student_repo.saveButton().click();
            Thread.sleep(2000);
            student_repo.nextButton().click();
            Thread.sleep(2000);
            student_repo.submitButton().click();
            Thread.sleep(8000);
            assertTrue(student_repo.solutions().isDisplayed());
            student_repo.retakeTest().click();
            Thread.sleep(3000);
            student_repo.getCertificateTest_Answer1().click();
            Thread.sleep(2000);
            student_repo.saveButton().click();
            Thread.sleep(2000);
            student_repo.nextButton().click();
            Thread.sleep(2000);
            student_repo.getCertificateTest_Answer2().click();
            Thread.sleep(2000);
            student_repo.saveButton().click();
            Thread.sleep(2000);
            student_repo.nextButton().click();
            Thread.sleep(2000);
            student_repo.submitButton().click();
            Thread.sleep(8000);
            assertTrue(student_repo.solutions().isDisplayed());
            driver.navigate().back();
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);
            student_repo.certificateTab().click();
            Thread.sleep(10000);
            while(student_repo.successMessage_forDownload().isDisplayed())
            {
                student_repo.downloadCertificate_button().click();
                Thread.sleep(8000);
//				driver.navigate().back();
                break;
            }
            Thread.sleep(5000);
            driver.navigate().refresh();
            Thread.sleep(5000);
            student_repo.discussionTab().click();
            Thread.sleep(3000);
            student_repo.discussionAsk().click();
            Thread.sleep(3000);
            student_repo.enterInput().sendKeys("This is discussion for testing");
            Thread.sleep(3000);
            student_repo.postInput().click();
            Thread.sleep(3000);
            student_repo.discussionEditInput().click();
            Thread.sleep(3000);
            student_repo.enterInput().clear();
            Thread.sleep(3000);
            student_repo.enterInput().sendKeys("This is edited discussion input for testing");
            Thread.sleep(3000);
            student_repo.postInput().click();
            Thread.sleep(3000);
            student_repo.discussionReplyAsk().click();
            Thread.sleep(3000);
            student_repo.enterInput().sendKeys("This is reply in discussion for testing");
            Thread.sleep(3000);
            student_repo.postInput().click();
            Thread.sleep(3000);
            Thread.sleep(3000);
            student_repo.discussionDeleteAsk().click();
            Thread.sleep(3000);
            student_repo.deleteConfirm().click();
            Thread.sleep(3000);
            driver.navigate().refresh();
            Thread.sleep(3000);
            student_repo.noteTab().click();
            Thread.sleep(3000);
            student_repo.noteCreateTab().click();
            Thread.sleep(3000);
            student_repo.enterInput().sendKeys("This is notes for testing");
            Thread.sleep(3000);
            student_repo.postInput().click();
            Thread.sleep(3000);
            student_repo.noteEditInput().click();
            Thread.sleep(3000);
            student_repo.enterInput().clear();
            Thread.sleep(3000);
            student_repo.enterInput().sendKeys("This is edited note input for testing");
            Thread.sleep(3000);
            student_repo.postInput().click();
            Thread.sleep(3000);
            student_repo.noteDeleteAsk().click();
            Thread.sleep(3000);
            student_repo.deleteConfirm().click();
            Thread.sleep(3000);
            student_repo.noteCreateTab().click();
            Thread.sleep(3000);
            student_repo.enterInput().sendKeys("This is final note for testing");
            Thread.sleep(3000);
            student_repo.postInput().click();
            Thread.sleep(3000);
            Thread.sleep(5000);
            student_repo.refresh_button();
            Thread.sleep(5000);
            student_repo.support_button().click();
            Thread.sleep(5000);
            student_repo.supportTicket_title().sendKeys("This is my title for ticket");
            Thread.sleep(5000);
            student_repo.supportTicket_description().sendKeys("This is the description for testing in the ticket");
            Thread.sleep(5000);
            student_repo.supportTicket_checkBox().click();
            Thread.sleep(5000);
            student_repo.supportTicket_submit().click();
            Thread.sleep(5000);
            student_repo.supportTicket_confirmSubmit().click();
            Thread.sleep(4000);
            Logout_flow.logoutFlow();

        }finally{

        }

    }

}