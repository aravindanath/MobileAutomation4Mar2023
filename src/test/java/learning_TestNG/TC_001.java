package learning_TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_001  extends BaseClass{


    @Test
    public void test1() throws InterruptedException {
        System.out.println("App launch");
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Search\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.google.android.youtube:id/search_edit_text")).sendKeys("Aadvik raj sharma swimming");

    }
}
