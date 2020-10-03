import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Wait4ieHowWeWorkTests extends  BaseUI{
   String curentUrlHowWeWork;

   @Test
   public void howWeWork(){
      driver.findElement(Locators.HOW_WE_WORK).click();
      curentUrlHowWeWork=driver.getCurrentUrl();
      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      if (driver.findElement(Locators.HOW_WE_WORK).isDisplayed()){
          System.out.print("Displays");
       }
      System.out.print((Locators.HOW_WE_WORK.toString()));
      System.out.print("\n Printing curentUrlHowWeWork "+curentUrlHowWeWork);

      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

      driver.navigate().to(curentUrlHowWeWork);
      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

      System.out.print("\n Printing 2.curentUrlHowWeWork "+curentUrlHowWeWork);
      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

      driver.findElement(Locators.ADVERT).click();
      driver.navigate().back();
      }

}


