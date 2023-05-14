package mobileBrowser;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.MobilePlatform.ANDROID;

public class LaunchChromeBrowser {

    AndroidDriver driver;

    String path = System.getProperty("user.dir")+File.separator+"driver"+ File.separator+"chromedriver";
    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,ANDROID);
        caps.setCapability("appium:chromeOptions", ImmutableMap.of("w3c",false));
        caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        caps.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Testdevice");
        caps.setCapability("chromedriverExecutable",path);

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"),caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test(){
        System.out.println("Open browser");
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Automation Jobs", Keys.ENTER);
    }

}
