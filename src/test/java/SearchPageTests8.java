//public class SearchPageTests8 {
//}
import org.testng.annotations.Test;

public class SearchPageTests8 extends BaseUI{


    @Test
    public void testSearchSortBy(){
        searchPage.testSortBy();
    }
    @Test
    public void testSearchAge(){
        searchPage.testSortByAge();

    }
}
