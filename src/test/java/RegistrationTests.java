//(NB) look and follow ASAP when have time!!!!
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class RegistrationTests extends BaseUI{
   int indexLinkSignIn = 0;

    @Test
    public void testRegistration() {
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





//===========================================
//lesson5
//import org.testng.annotations.Test;
//        import java.util.concurrent.TimeUnit;
//
//public class RegistrationTests extends BaseUI{
//    int indexLinkSignIn = 0;
//
//    @Test
//    public void testRegistration() {
//        driver.findElement(Locators.BUTTON_JOIN).isDisplayed();
//        driver.findElement(Locators.BUTTON_JOIN).click();
//        driver.findElement(Locators.EMAIL_JOIN).sendKeys(Data.emailJOIN);
//        driver.findElement(Locators.PASSWORD_JOIN_INPUT).sendKeys(Data.passwordMyCredentials);
//        driver.findElement(Locators.FORM_GROUP_ROW_BUTTON).click();
//
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        driver.findElement(Locators.NICKNAME).sendKeys(Data.nickNameLog);
//        driver.findElement(Locators.YEAR_JOIN_FORM).sendKeys(Data.yearToDisplay);
//        driver.findElement(Locators.FORM_TEXT_YEAR).isDisplayed();
//        driver.findElement(Locators.PHONE_INPUT_FORM).sendKeys(Data.inputPHONE);
//    }
//}
//==================================above - 5 class ============================

//======completely wrong from here !!!: but keep for knowledge:============
//driver.findElement(Locators.FORM_GROUP_ROW_BUTTON).click();
//driver.findElement(By.xpath("//div[@class='form-group row']//button[@data-action='next-page']")).click();
//work on &
//lookup it
// public static final By REGISTRATION2 = (By.xpath("//div[@id='second-registration-page']/div/div[2]/div[2]/div[3]/div/button"));
// public static final By REGISTRATION_POPUP = By.cssSelector("#show-registration-block");
//
//=========
//    @Test
//    public void testRegistration() {
//        driver.findElement(Locators.LINK_SIGN_IN).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        driver.findElement(Locators.REGISTRATION_POPUP).click();
//        driver.findElement(Locators.BUTTON_JOIN).isDisplayed();
//
//        driver.findElement(Locators.EMAIL_JOIN).sendKeys(Data.emailJOIN);
//        driver.findElement(Locators.PASSWORD_JOIN_INPUT).sendKeys(Data.passwordMyCredentials);
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        driver.findElement(Locators.REGISTRATION2).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        driver.findElement(Locators.NICKNAME).sendKeys(Data.nickNameLog);
//        driver.findElement(Locators.PART_OF_JOIN_FORM).sendKeys(" ");
//        driver.findElement(Locators.YEAR_JOIN_FORM).sendKeys(Data.yearToDisplay);
//
//        driver.findElement(Locators.FORM_TEXT_YEAR).isDisplayed();
//        driver.findElement(Locators.PHONE_INPUT_FORM).sendKeys(Data.inputPHONE);
//        driver.findElement(Locators.REGISTRATION).isDisplayed();
//        driver.findElement(Locators.PART_OF_JOIN_FORM).isDisplayed();
//
//        driver.navigate().to(Data.MAIN_URL);
//        System.out.print((Data.MAIN_URL.toString()));
//        String mUrl = Data.MAIN_URL.toString();
//        Assert.assertEquals( Data.MAIN_URL, mUrl);
//    }
//}