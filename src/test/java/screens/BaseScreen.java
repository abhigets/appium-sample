package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseScreen {
    public static final int TIME_OUT_IN_SECONDS = 20;
    static protected AndroidDriver driver;
    static protected DesiredCapabilities capabilities = new DesiredCapabilities();
    static protected WebDriverWait wait ;

    protected void initDriver() throws MalformedURLException {
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        wait = new WebDriverWait(driver, TIME_OUT_IN_SECONDS);
    }

    protected void tearDownDriver(){
        driver.quit();
    }
}
