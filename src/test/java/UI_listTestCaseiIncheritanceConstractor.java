//hw
//public static String generateNewNumber(String name, int length){
//return name + RandomStringUtils.random(length, "172984757");
//}

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UI_listTestCaseiIncheritanceConstractor extends BaseUI{
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








//------------------------------------------------------
// 1. Create test cases with ul lists.
//        2. Create main classes and Page Object Model using inheritance and constructor.
//        Additional:
//        For creating any random number for any unique nickname, email or any String:
//1) Add dependency (library) in pom.xml
//<dependency>
//<groupId>org.apache.commons</groupId>
//<artifactId>commons-lang3</artifactId>
//<version>RELEASE</version>
//</dependency>
//2)  Add and use the Java method.
//public static String generateNewNumber(String name, int length){
//return name + RandomStringUtils.random(length, "172984757");
//}

