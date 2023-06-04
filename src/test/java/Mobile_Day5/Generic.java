package Mobile_Day5;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class Generic {

    public static void scroll(WebDriver driver, String text){
        String str =  "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\""+text+"\"));";
        ((AndroidDriver)driver).findElementByAndroidUIAutomator(str);
    }


    public static void scrollAndClick(WebDriver driver, String text){
        String str =  "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\""+text+"\"));";
        ((AndroidDriver<?>)driver).findElementByAndroidUIAutomator(str).click();
    }

    public static void longPress(WebDriver driver, WebElement ele){
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.longPress(LongPressOptions.longPressOptions().
                withElement(element(ele)).withDuration(Duration.ofSeconds(2))).release().perform();
    }

    public static void tap(WebDriver driver, WebElement ele){
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.tap(TapOptions.tapOptions().withElement(element(ele))).perform();
    }

    public static String getOTP(String msg){
        String otp = null;
        for(String str : msg.split(" ")){
            if(str.matches("\\d{5}")){
                otp = str;
            }else if(str.matches("\\d{4}")){
                otp = str;
            }
        }
        return otp;
    }
}
