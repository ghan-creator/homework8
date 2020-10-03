import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTests_switchToIframe_hw7 extends BaseUI{
    String currentUrlSearch;

    @Test
   public void testMainPageTabHomeCssNavURL() {
        driver.findElement(Locators.NAVIGATION).click();
        currentUrlSearch = driver.getCurrentUrl();
        Assert.assertEquals( currentUrlSearch, Data.possibleUrlSearch);
    }

        // driver.switchTo().frame("fm");
    @Test
    //store css and xpaths
    public void test2() throws InterruptedException{
        Thread.sleep(5000);
        WebElement ele = driver.findElement(Locators.IFRAME_TEST_SWITCH2);
        driver.switchTo().frame(ele);
        //might be switch to locater or switch to id
        driver.findElement(Locators.IN_SECOND_WINDOW_IFRAME_CSS).click();

        // driver.switchTo().frame("fm");
    }
}








//=========backup test2==========
//@Test
//public void test3() throws InterruptedException{
//        Thread.sleep(5000);
//        WebElement ele = driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']"));
//        driver.switchTo().frame(ele);
//        //might be switch to locater or switch to id
//        driver.findElement(By.cssSelector("button.ytp-large-play-button.ytp-button")).click();
//// driver.switchTo().frame("fm");
