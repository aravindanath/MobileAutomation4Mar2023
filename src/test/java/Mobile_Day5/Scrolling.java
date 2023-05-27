
package Mobile_Day5;


import mobile_day1.AppLaunch_GS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Scrolling extends AppLaunch_GS {
//appium -p 4723 --use-plugins=images --allow-cors


    @Test
    public void test1() throws InterruptedException {
        System.out.println("App launch");
       driver.findElement(By.id("android:id/text1")).click();
       Thread.sleep(2000);
       Generic.scrollAndClick(driver,"China");
    }
}
