import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class AmethodOlexiiAskTodo_hw7 extends BaseUI {
    public void switchBrowswerAction() {
        int i = 1;
        javaWaitSec();
        ArrayList tabs = new ArrayList<>(Integer.parseInt(driver.getWindowHandle()));
        driver.switchTo().window((String) tabs.get(i));
        driver.manage().window().maximize();
        javaWaitSec();
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // Titles.add(driver.getTitle());
        driver.switchTo().window(Data.parentWindw);
        Set allWindwHandles = driver.getWindowHandles();
        int winCount = allWindwHandles.size();
        System.out.println(winCount);

        ArrayList tabs = new ArrayList(allWindwHandles);


        for (int j = 1; j < winCount; j++) {
            driver.switchTo().window(tabs.get(j).toString());
            System.out.println(driver.getTitle());
         //   System.out.println(Titles.get(j - 1));

            System.exit(0);
        }
    }
}
//what to add? To what I'm switchig to?
//Error: Could not find or load main class AmethodOlexiiGooglePractice_hw7
//Caused by: java.lang.ClassNotFoundException: AmethodOlexiiGooglePractice_hw7
//
//        Process finished with exit code 1

