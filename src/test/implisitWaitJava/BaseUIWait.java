//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//
//public class BaseUI{
//    //webDriver here
//    WebDriver driver;
//    WebDriverWait wait;
//
//    @BeforeMethod
////  no implisit wait
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();   //make a window big!
//        driver.get(Data.MAIN_URL);
//    }
//
////    with implisit wait
//    @BeforeMethod
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        driver = new ChromeDriver();
//        //implicit wait lesson6-7:
//        wait = new WebDriverWait(driver);
//        driver.manage().window().maximize();   //make a window big!
//        driver.get(Data.MAIN_URL);
//
//    }
//
//    @AfterMethod
//    public void afterActions() {
//        driver.quit();
//    }
//}