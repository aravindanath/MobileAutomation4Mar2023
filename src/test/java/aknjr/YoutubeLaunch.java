package aknjr;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.AutomationName.ANDROID_UIAUTOMATOR2;
import static io.appium.java_client.remote.MobilePlatform.ANDROID;

public class YoutubeLaunch {


    AndroidDriver driver;
    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, ANDROID_UIAUTOMATOR2);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,ANDROID);
        caps.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"TD");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.youtube");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.google.android.youtube.app.honeycomb.Shell$HomeActivity");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"),caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test1() throws InterruptedException {
        System.out.println("Youtube Launch");

        driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Search\"]").click();
        Thread.sleep(1000);
        driver.findElementById("com.google.android.youtube:id/search_edit_text").sendKeys("rrr");
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));

    }

    }
