package screens;

import application.Contacts;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactViewScreen extends BaseScreen{
    By contactNameLocator = By.id(Contacts.appPackageName + ":id/large_title");


    public String getNameOnContactCard() {
        wait.until(ExpectedConditions.presenceOfElementLocated(contactNameLocator));
        return driver.findElement(contactNameLocator).getText();
    }
}
