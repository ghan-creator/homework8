import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeTest_hw7 extends BaseUI {
    int indexLinkSignIn = 0;

    @Test
    public void testRegistrationemllisit() {
        driver.findElement(Locators.BUTTON_JOIN).isDisplayed();
        driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
        driver.findElement(Locators.BUTTON_JOIN).click();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.EMAIL_JOIN)));
        driver.findElement(Locators.EMAIL_JOIN).sendKeys(Data.emailJOIN);

//        //here must be max 20 sec
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.EMAIL_JOIN)));
//        driver.findElement(Locators.EMAIL_JOIN).sendKeys(Data.emailJOIN);
//
//        driver.findElement(Locators.PASSWORD_JOIN_INPUT).sendKeys(Data.passwordMyCredentials);
//        //here
//        wait.until(ExpectedConditions.elementToBeClickable(Locators.FORM_GROUP_ROW_BUTTON));
//        driver.findElement(Locators.FORM_GROUP_ROW_BUTTON).click();
//
//        driver.findElement(Locators.NICKNAME).sendKeys(Data.nickNameLog);
//        driver.findElement(Locators.YEAR_JOIN_FORM).sendKeys(Data.yearToDisplay);
//        driver.findElement(Locators.FORM_TEXT_YEAR).isDisplayed();
//
//        driver.findElement(Locators.PHONE_INPUT_FORM).sendKeys(Data.inputPHONE);
//        System.out.println("passed2");
    }
}




//    public class clickByMouse<HOW_WE_WORK>(){
//        driver.findElement(HOW_WE_WORK).click();
/////findPeople.click();
//
////if (driver.findElement(
//
//
//  // public class clickByMouse(WebElement element){
//       Actions action = new Actions(driver);
//      // action.moveToElement(element).perform()
//       //;
//   }

//}