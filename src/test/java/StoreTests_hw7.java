import org.testng.annotations.Test;

public class StoreTests_hw7 extends BaseUI{

    @Test
    public void testStore(){
        driver.findElement(Locators.LINK_STORE).click();
    }

}
