package mobileBrowser;

import mobile_day1.AppLaunch_GS;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class WebViewExample extends AppLaunch_GS {
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

        List<WebElement> elements = driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']"));

        for(WebElement element : elements){
            element.click();
        }

        driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.androidsample.generalstore:id/appbar_btn_cart']")).click();

        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.androidsample.generalstore:id/btnProceed']")).click();
        Thread.sleep(2000);
        Set<String> views =  driver.getContextHandles();

        for(String view : views){
            System.out.println(view);
        }
        Thread.sleep(2000);
        driver.context("WEBVIEW_com.androidsample.generalstore");
//        driver.context(views.toArray()[1].toString());
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("Automation Jobs", Keys.ENTER);

    }

}
