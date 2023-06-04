package iOSApp;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.List;

public class TC001 extends  AppLaunch_ios{
    @Test
    public void test1() throws InterruptedException {
        driver.startRecordingScreen();
        System.out.println("App launch");
        driver.findElement(By.xpath("//XCUIElementTypeButton[@name='UIKitCatalog']")).click();
        Thread.sleep(2000);
        //  driver.findElement(MobileBy.iOSNsPredicateString("type == \"XCUIElementTypeStaticText\" AND label == \"Controls\" AND name == \"Controls\" AND value == \"Controls\""));
        driver.findElementByIosNsPredicate("type == \"XCUIElementTypeStaticText\" AND label == \"Controls\" AND name == \"Controls\" AND value == \"Controls\"").click();

        driver.findElementByIosClassChain("**/XCUIElementTypeStaticText[`value='Page Controls'`]").click();

        driver.findElementByIosClassChain("**/XCUIElementTypeStaticText[`value='Page Control'`]").click();


        for(int i = 1; i<10; i++) {
            driver.findElement(By.className("XCUIElementTypePageIndicator")).click();

        }
        driver.stopRecordingScreen();

//        driver.findElementByXPath("")
    }
}
