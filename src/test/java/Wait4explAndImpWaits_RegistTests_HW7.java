import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Wait4explAndImpWaits_RegistTests_HW7 extends BaseUI {
    int indexLinkSignIn = 0;

    @Test
    public void testRegistrationemllisit() {
        driver.findElement(Locators.BUTTON_JOIN).isDisplayed();
        driver.findElement(Locators.BUTTON_JOIN).click();

        //here must be max 20 sec
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.EMAIL_JOIN)));
        //here one after another if you need more time
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.EMAIL_JOIN).sendKeys(Data.emailJOIN);

        driver.findElement(Locators.PASSWORD_JOIN_INPUT).sendKeys(Data.passwordMyCredentials);
        //here one after another if you need more time
        wait.until(ExpectedConditions.elementToBeClickable(Locators.FORM_GROUP_ROW_BUTTON));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.FORM_GROUP_ROW_BUTTON).click();

        driver.findElement(Locators.NICKNAME).sendKeys(Data.nickNameLog);
        driver.findElement(Locators.YEAR_JOIN_FORM).sendKeys(Data.yearToDisplay);
        driver.findElement(Locators.FORM_TEXT_YEAR).isDisplayed();

        driver.findElement(Locators.PHONE_INPUT_FORM).sendKeys(Data.inputPHONE);
        System.out.println("passed2");
    }
}
