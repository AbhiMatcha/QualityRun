package utilities;

import java.util.Random;
import e2e_Suites.baseClass;
import org.openqa.selenium.WebElement;

public abstract class utils extends baseClass {
    protected static WebElement element = null;

    public static String randomEmail() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder character = new StringBuilder();
        Random rnd = new Random();
        while (character.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * chars.length());
            character.append(chars.charAt(index));
        }
        String email = character.toString();
        return email;
    }

    public static String randomSpecialCharacter() {
        String chars = "~!@#$%^&*()_+=-{}|[]\":;'?><,./`";
        StringBuilder character = new StringBuilder();
        Random rnd = new Random();
        while (character.length() <10 ) { // length of the random string.
            int index = (int) (rnd.nextFloat() * chars.length());
            character.append(chars.charAt(index));
        }
        String speacialChar = character.toString();
        return speacialChar;
    }

    protected static String randomCoupon()
    {
        String selectCoupon[] = { "fifty","sixty"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectCoupon.length);
        return selectCoupon[randomIndex];
    }

    protected static String randomAnswer()
    {
        String selectAnswer[] = { "one","two"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(selectAnswer.length);
        return selectAnswer[randomIndex];
    }

}
