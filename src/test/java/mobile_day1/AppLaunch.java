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

public class AppLaunch {
//appium -p 4723 --use-plugins=images --allow-cors
    AndroidDriver driver; //Global References

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,ANDROID);
        caps.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Testdevice");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.youtube");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.google.android.youtube.app.honeycomb.Shell$HomeActivity");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"),caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test1() throws InterruptedException {
        System.out.println("App launch");

        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Search\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.google.android.youtube:id/search_edit_text")).sendKeys("Aadvik raj sharma");

    }
}
