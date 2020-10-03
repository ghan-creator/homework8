import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseUI {
    //webDriver here
    WebDriver driver;
    WebDriverWait wait;

    //now added in HW lesson 8
    MainPage mainPage;
    SearchPage searchPage;
    MediaPage mediaPage;   //here all added
    StorePage storePage;

    @BeforeMethod
    //no implisit wait here specify, only in imports
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();   //make a window big!
        driver.get(Data.MAIN_URL);

        //emplisit wait must be max 20 sec
        wait = new WebDriverWait(driver, 10);

        //now added in HW lesson 8 from here
        mainPage = new MainPage(driver, wait);
        searchPage = new SearchPage(driver, wait);
        mediaPage = new MediaPage(driver, wait);
        storePage = new StorePage(driver, wait);
    }

    public void getDropDownListByIndex(WebElement element, int index) {
        Select ageDropDown = new Select(element);
        ageDropDown.selectByIndex(index);
    }

    public void javaWaitSec() {
        //here must be max 20 sec
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.EMAIL_JOIN)));
        //here one after another if you need more time
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }


    @AfterMethod
    public void afterActions() {
        driver.quit();
    }
}







// //   with implisit wait
//    @BeforeMethod
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        driver = new ChromeDriver();
// //       implicit wait lesson6-7:
//        wait = new WebDriverWait(driver);
//        driver.manage().window().maximize();   //make a window big!
//        driver.get(Data.MAIN_URL);
//
//   }


