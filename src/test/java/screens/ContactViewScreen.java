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

    //Option button at top right corner
    private void selectOptionButton() {
        By optionButton = By.xpath("//android.view.View//android.widget.ImageButton");
        wait.until(ExpectedConditions.elementToBeClickable(optionButton));
        driver.findElement(optionButton).click();
    }

    public void deleteContact() {
        selectOptionButton();

        By deleteOption = By.xpath("//*[contains(@text,'Delete')]");
        wait.until(ExpectedConditions.elementToBeClickable(deleteOption));
        driver.findElement(deleteOption).click();

        By confirmationOkButton = By.id("android:id/button1");
        driver.findElement(confirmationOkButton).click();
    }

}
