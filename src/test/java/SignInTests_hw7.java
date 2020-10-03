import org.testng.annotations.Test;

public class SignInTests_hw7 extends BaseUI{
    //as Olexii in lecture 6

    @Test
    public void testSignIn() {
        driver.findElement((Locators.LINK_SIGNIN)).click();
    }
}