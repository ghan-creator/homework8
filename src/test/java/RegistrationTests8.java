//added in 8 class RegistrationTests8
import org.testng.annotations.Test;

public class RegistrationTests8 extends BaseUI{

    @Test
    public void testRegistration() {
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        mainPage.clickJoinButton();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        mainPage.insertFirstPartOfRegistrationInformation();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        ///mainPage.insertSecondPartOfRegistrationInformation();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

}