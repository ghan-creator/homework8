import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDownList2URLMedia_hw7 extends BaseUI {
    int indexLinkSignIn = 0;
    //just as in lecture
    String currentURLMedia;

    @Test
    public void testMedia() {
        //was here on top
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


//mode down from the top
//driver.findElement(Locators.LINK_MEDIA).click();
//currentURLMedia = driver.getCurrentUrl();
//System.out.println(currentURLMedia);
//Assert.assertEquals(currentURLMedia, Data.expectedUrlMedia);
//driver.findElement(Locators.LINK_PHOTO).click();
//driver.findElement(Locators.LINK_VIDEO).click();
//driver.findElement(Locators.LINK_ALBUMS).click();
//driver.findElement(Locators.LINK_ALL).click();
//  } //here everything as on video-lecture, just copy
//}