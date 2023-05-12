package learning_TestNG;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.MobilePlatform.ANDROID;

public class BaseClass {

    AndroidDriver driver; //Global References

    @BeforeClass
    @Parameters({"deviceID","deviceName"})
    public void setup(String deviceID,String deviceName) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,ANDROID);
        caps.setCapability(MobileCapabilityType.UDID,deviceID);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.youtube");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.google.android.youtube.app.honeycomb.Shell$HomeActivity");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"),caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
