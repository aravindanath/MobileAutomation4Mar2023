package iOSApp;


import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.MobilePlatform.ANDROID;

public class AppLaunch {
//appium -p 4723 --use-plugins=images --allow-cors
    IOSDriver driver; //Global References

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        caps.setCapability(MobileCapabilityType.UDID, "BB88D964-9344-49CF-8329-0F0FBB9FC409");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 14 Pro");
        caps.setCapability(IOSMobileCapabilityType.BUNDLE_ID,"com.4june.2023");
        driver = new IOSDriver(new URL("http://0.0.0.0:4723/"),caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test1() throws InterruptedException {
        System.out.println("App launch");
        driver.findElement(By.xpath("//XCUIElementTypeButton[@name='UIKitCatalog']")).click();
        Thread.sleep(2000);
      //  driver.findElement(MobileBy.iOSNsPredicateString("type == \"XCUIElementTypeStaticText\" AND label == \"Controls\" AND name == \"Controls\" AND value == \"Controls\""));
        driver.findElementByIosNsPredicate("type == \"XCUIElementTypeStaticText\" AND label == \"Controls\" AND name == \"Controls\" AND value == \"Controls\"").click();

        driver.findElementByIosClassChain("**/XCUIElementTypeStaticText[`value='Buttons'`][1]").click();

        driver.findElementByIosClassChain("**/XCUIElementTypeStaticText[`label == \"Menu Buttons\"`]").click();
        Thread.sleep(2000);

        List<MobileElement> li =  driver.findElementsByClassName("XCUIElementTypeStaticText");

        for(MobileElement l : li){
            System.out.println(l.getText());
            if(l.getText().equals("Drop Down Submenu")){
                l.click();
            }
        }
//        driver.findElementByXPath("")
    }
}
