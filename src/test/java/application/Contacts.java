package application;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import screens.AddOrEditScreen;
import screens.BaseScreen;
import screens.ContactViewScreen;
import screens.HomeScreen;

import java.net.MalformedURLException;

public class Contacts extends BaseScreen{
    public static String appPackageName = "com.android.contacts";

    //All the available screens in contact application
    protected HomeScreen homeScreen;
    protected AddOrEditScreen addOrEditScreen;
    protected ContactViewScreen contactViewScreen;

    public Contacts (){
        homeScreen = new HomeScreen();
        addOrEditScreen = new AddOrEditScreen();
        contactViewScreen = new ContactViewScreen();
    }

    private void setEmulatorCapabilities(){
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("avd","TestDevice");
        capabilities.setCapability("androidPackage", appPackageName);
        capabilities.setCapability("appActivity","com.android.contacts.activities.PeopleActivity");
    }

    protected void launchApplicationInEmulator() throws MalformedURLException {
        setEmulatorCapabilities();
        initDriver();
    }

    protected void closeApplication(){
        driver.closeApp();
        tearDownDriver();
    }

    protected boolean isApplicationLaunched() {
        try{
            driver.findElement(By.id(appPackageName + ":id/list_container"));
        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }

}
