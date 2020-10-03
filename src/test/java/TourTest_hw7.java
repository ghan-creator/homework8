import org.testng.annotations.Test;

public class TourTest_hw7 extends BaseUI {
    @Test
    public void testTour(){
        driver.findElement(Locators.LINK_TOUR).click();
    }
}
