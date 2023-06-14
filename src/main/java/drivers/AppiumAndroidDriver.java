package drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumAndroidDriver {
    public static AppiumDriver  driver;


    public static AppiumAndroidDriver appium() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            //****************************DISPOSITIVO EXTERNO DE ALEX*************************************************//
//            capabilities.setCapability("deviceName", "motorola one");
//            capabilities.setCapability("platformName", "Android");
//            capabilities.setCapability("platformVersion", "10");
//            capabilities.setCapability("appPackage", "com.coordinadora.timgoo.qa");
//            capabilities.setCapability("appActivity", "com.coordinadora.timgoo.Session.View.activities.LoginUsernameActivity");
//            capabilities.setCapability("noReset", "true");
//            capabilities.setCapability("udid", "ZY323QK4QS");
            //****************************DISPOSITIVO EXTERNO DE MAURICIO*************************************************//
//            capabilities.setCapability("deviceName", "M2102J20SG");
//            capabilities.setCapability("platformName", "Android");
//            capabilities.setCapability("platformVersion", "12");
//            capabilities.setCapability("appPackage", "com.coordinadora.timgoo.qa");
//            capabilities.setCapability("appActivity", "com.coordinadora.timgoo.Session.View.activities.LoginUsernameActivity");
//            capabilities.setCapability("noReset", "true");
//            capabilities.setCapability("udid", "a9adacc6");
            //  *****************************DISPOSITIVO INTERNO TC20**************************************************//
            capabilities.setCapability("deviceName", "TC20");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "7.1.2");
            capabilities.setCapability("appPackage", "com.coordinadora.timgoo.qa");
            capabilities.setCapability("appActivity", "com.coordinadora.timgoo.Session.View.activities.LoginUsernameActivity");
            capabilities.setCapability("noReset", "true");
            capabilities.setCapability("udid", "19045521401000");
            driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return new AppiumAndroidDriver() ;
    }


    public static AppiumDriver on() {
        return driver;
    }

    //    public void disconnectAppium() throws Exception {
//        driver.quit();
//    }


}
