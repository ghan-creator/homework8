import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class RegistrationTests_hw7 extends BaseUI {
    //?
    int indexLinkSignIn = 0;
    //?

    @Test
    public void testRegistration() {
        //driver.findElement(Locators.BUTTON_REGISTRATION).click();
//        driver.findElement(Locators.BUTTON_JOIN).click();
//        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
//        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
//        driver.findElement(Locators.BUTTON_NEXT).click();
//        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(Data.nickname);
//        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
//    } //here everything as on video-lecture, just copy
//}

        driver.findElement(Locators.BUTTON_JOIN).isDisplayed();
        driver.findElement(Locators.BUTTON_JOIN).click();
        driver.findElement(Locators.EMAIL_JOIN).sendKeys(Data.emailJOIN);
        driver.findElement(Locators.PASSWORD_JOIN_INPUT).sendKeys(Data.passwordMyCredentials);
        driver.findElement(Locators.FORM_GROUP_ROW_BUTTON).click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.NICKNAME).sendKeys(Data.nickNameLog);
        driver.findElement(Locators.YEAR_JOIN_FORM).sendKeys(Data.yearToDisplay);
        driver.findElement(Locators.FORM_TEXT_YEAR).isDisplayed();
        driver.findElement(Locators.PHONE_INPUT_FORM).sendKeys(Data.inputPHONE);
    }
}
