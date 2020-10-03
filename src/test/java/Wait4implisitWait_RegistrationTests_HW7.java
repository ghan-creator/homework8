import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Wait4implisitWait_RegistrationTests_HW7 extends BaseUI{
    int indexLinkSignIn = 0;

    @Test
    public void testRegistrationImplisit() {
        driver.findElement(Locators.BUTTON_JOIN).isDisplayed();
        driver.findElement(Locators.BUTTON_JOIN).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.EMAIL_JOIN).sendKeys(Data.emailJOIN);
        driver.findElement(Locators.PASSWORD_JOIN_INPUT).sendKeys(Data.passwordMyCredentials);
        driver.findElement(Locators.FORM_GROUP_ROW_BUTTON).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.NICKNAME).sendKeys(Data.nickNameLog);
        driver.findElement(Locators.YEAR_JOIN_FORM).sendKeys(Data.yearToDisplay);
        driver.findElement(Locators.FORM_TEXT_YEAR).isDisplayed();
        driver.findElement(Locators.PHONE_INPUT_FORM).sendKeys(Data.inputPHONE);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        System.out.println("passed1");
    }


    //new clickByMouse
    public void clickByMouse(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }
}