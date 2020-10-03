import org.testng.annotations.Test;

public class MediaPageTests8 extends BaseUI{

    @Test
    public void testMediaPage(){
        mainPage.openMediaPage();
    }

    @Test
    public void testPhotosDropDownList(){
        mediaPage.testDropDownListSortBy();
    }
    
    @Test
    public void testPhotosSvetlanka44Explicid(){
        mediaPage.testPageSvetlanka44Explicid();
    }
}