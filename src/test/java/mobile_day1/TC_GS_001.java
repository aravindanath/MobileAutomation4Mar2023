package mobile_day1;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.MobilePlatform.ANDROID;

public class TC_GS_001 extends AppLaunch_GS {
//appium -p 4723 --use-plugins=images --allow-cors


    @Test
    public void test1() throws InterruptedException {
        System.out.println("App launch");
       driver.findElement(By.id("android:id/text1")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//android.widget.TextView[@text='Algeria']")).click();
       Thread.sleep(2000);
       driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Arvind");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[contains(@text,'Shop')]")).click();
    }
}
