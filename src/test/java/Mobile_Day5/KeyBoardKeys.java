package Mobile_Day5;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import mobile_day1.AppLaunch_GS;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class KeyBoardKeys extends AppLaunch_GS {
//appium -p 4723 --use-plugins=images --allow-cors


    @Test
    public void test1() throws InterruptedException {
        System.out.println("App launch");

       driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).click();

        Thread.sleep(2000);
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.A));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.R));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.V));
    }
}
