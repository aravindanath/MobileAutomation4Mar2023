package Mobile_Day5;


import io.appium.java_client.android.AndroidDriver;
import mobile_day1.AppLaunch_GS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Orientation extends AppLaunch_GS {
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
       List<WebElement> productPrice =  driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));

        ArrayList<String> pp = new ArrayList<String>();

        for(WebElement element : productPrice){
            pp.add(element.getText().replace("$", "").trim());
        }

        String totalPrice = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl"))
                .getText().replace("$", "").trim();

        float p1 = Float.parseFloat(pp.get(0));
        float p2 = Float.parseFloat(pp.get(1));
        float p3 = Float.parseFloat(totalPrice);

        float p4 = p1 + p2 ;
        System.out.println("Price Comparison: "+p4);

        Assert.assertEquals(p3,p4, "Total price is not equal");

        System.out.println(((AndroidDriver)driver).getOrientation());



    }
}
