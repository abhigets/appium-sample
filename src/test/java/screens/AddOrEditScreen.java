package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddOrEditScreen extends BaseScreen{
    By nameLocator = By.className("android.widget.EditText");
    By phoneNumberLocator = By.className("android.widget.EditText");
    By emailIDLocator = By.className("android.widget.EditText");
    By saveContactLocator = By.className("android.widget.ImageButton");


    public void setName(String name) {
        ((WebElement)driver.findElements(nameLocator).get(0)).sendKeys(name);
    }

    public void setPhoneNumber(String phoneNumber) {
        ((WebElement)driver.findElements(phoneNumberLocator).get(3)).sendKeys(phoneNumber);
    }

    public void save() {
        ((WebElement)driver.findElements(saveContactLocator).get(0)).click();
    }

    public void setEmailID(String emailID) {
        //driver.scrollTo("Email");
        //((WebElement)driver.findElements(emailIDLocator).get(0)).sendKeys(emailID);
    }
}
