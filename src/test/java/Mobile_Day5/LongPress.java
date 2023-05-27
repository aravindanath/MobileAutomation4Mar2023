package Mobile_Day5;


import mobile_day1.AppLaunch_GS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LongPress extends AppLaunch_GS {
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
       List<WebElement> addToCart = driver.findElements(By.xpath("//*[@text='ADD TO CART']"));
       for(WebElement element : addToCart){
           element.click();
       }

        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
     WebElement tc =  driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));

       Generic.longPress(driver, tc);
        Thread.sleep(2000);
       WebElement close = driver.findElement(By.id("android:id/button1"));
       Generic.tap(driver, close);


    }
}
