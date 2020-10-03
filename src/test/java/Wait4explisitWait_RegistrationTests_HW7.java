import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Wait4explisitWait_RegistrationTests_HW7 extends BaseUI {
    int indexLinkSignIn = 0;

    @Test
    public void testRegistrationemllisit() {
        driver.findElement(Locators.BUTTON_JOIN).isDisplayed();
        driver.findElement(Locators.BUTTON_JOIN).click();

        //here must be max 20 sec
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.EMAIL_JOIN)));
        driver.findElement(Locators.EMAIL_JOIN).sendKeys(Data.emailJOIN);

        driver.findElement(Locators.PASSWORD_JOIN_INPUT).sendKeys(Data.passwordMyCredentials);
        //here
        wait.until(ExpectedConditions.elementToBeClickable(Locators.FORM_GROUP_ROW_BUTTON));
        driver.findElement(Locators.FORM_GROUP_ROW_BUTTON).click();

        driver.findElement(Locators.NICKNAME).sendKeys(Data.nickNameLog);
        driver.findElement(Locators.YEAR_JOIN_FORM).sendKeys(Data.yearToDisplay);
        driver.findElement(Locators.FORM_TEXT_YEAR).isDisplayed();

        driver.findElement(Locators.PHONE_INPUT_FORM).sendKeys(Data.inputPHONE);
        System.out.println("passed2");
    }
}