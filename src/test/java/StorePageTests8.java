import org.testng.annotations.Test;

public class StorePageTests8 extends BaseUI{

    @Test
    public void testStore(){
        driver.findElement(Locators.LINK_STORE).click();
    }

//    @Test
//    public void testPhotosPage(){
//        mainPage.openStorePage();
//    } //poshemy ne rabotaet?
}
//java.lang.AssertionError: expected [https://romanceabroad.com/store/category-sweets]
// but found [https://romanceabroad.com/users/search]
//        Expected :https://romanceabroad.com/store/category-sweets
//        Actual   :https://romanceabroad.com/users/search
//<Click to see difference>
/*
* */
