package Mobile_Day5;


import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import mobile_day1.AppLaunch_GS;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Notification_Reading_OTP extends AppLaunch_GS {
//appium -p 4723 --use-plugins=images --allow-cors


    @Test
    public void test1() throws InterruptedException {
        System.out.println("App launch");

       Thread.sleep(2000);

        ((AndroidDriver)driver).openNotifications();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'(650) 555-1212')]")).click();
        Thread.sleep(2000);
       String msg  =  driver.findElement(By.xpath("(//*[contains(@text,'Hi Arvind, OTP')])[last()]")).getText();
        System.out.println(msg);
       String otp = Generic.getOTP(msg);
        Thread.sleep(2000);
       ((AndroidDriver<?>) driver).startActivity(new Activity("com.androidsample.generalstore","com.androidsample.generalstore.SplashActivity"));
        Thread.sleep(2000);
       driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys(otp);






    }
}
