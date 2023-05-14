package aknjr;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ComparePrice extends BaseClass {

    @Test
    public void test1() {
        System.out.println("app launch");
        driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Albania']").click();
        driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Akshay Krishna Nair");
        driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
        driver.findElementByXPath("//android.widget.TextView[@bounds='[720,1236][1342,1283]']").click();
        driver.findElementByXPath("//android.widget.TextView[@bounds='[720,2272][1342,2319]']").click();
        driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
       String val1 = driver.findElementByXPath("//android.widget.TextView[@bounds='[98,1217][378,1288]']").getText();
       float price1 = Float.parseFloat(val1.replaceAll("[^0-9,.]",""));
       String val2 = driver.findElementByXPath("//android.widget.TextView[@bounds='[783,1217][1063,1288]']").getText();
       float price2 = Float.parseFloat(val2.replaceAll("[^0-9,.]",""));
        System.out.println(price1);
        System.out.println(price2);
        float sum= price1+price2;
        System.out.println("sum using Calculator "+sum);
        String val3 = driver.findElementByXPath("//android.widget.TextView[@bounds='[704,2327][897,2393]']").getText();
        float total = Float.parseFloat(val3.replaceAll("[^0-9,.]",""));
        System.out.println("total amount generated in app "+total);
        if(sum==total){
            System.out.println("price is same and working fine");
        }else{
            System.out.println("there is an error in price calculation");
        }







    }
}
