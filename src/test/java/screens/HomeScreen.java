package screens;

import application.Contacts;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeScreen extends BaseScreen{
    String floatingAddNewContactIconId = Contacts.appPackageName + ":id/floating_action_button";
    String confirmationMessageId = Contacts.appPackageName + ":id/left_button";

    public void selectFloatingAddNewContactIcon() {
        driver.findElementById(floatingAddNewContactIconId).click();
        try{
            driver.findElementById(confirmationMessageId).click();
        }catch (Exception ex){

        }
    }

    public boolean isContactPresentInList(String contactName) {
        try{
            By contactLocator = By.xpath("//android.widget.TextView[contains(@text,'"+ contactName +"')]");
            wait.until(ExpectedConditions.presenceOfElementLocated(contactLocator));
        }catch (Exception ex){
            return false;
        }
        return true;
    }

    public void selectContact(String contactName) {
        By contactLocator = By.xpath("//android.widget.TextView[contains(@text,'"+ contactName +"')]");
        driver.findElement(contactLocator).click();
    }
}
