package iOSApp;


import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AppLaunch_ios {
//appium -p 4723 --use-plugins=images --allow-cors
    IOSDriver driver; //Global References

    @BeforeClass
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

//        driver.findElementByXPath("")

}
