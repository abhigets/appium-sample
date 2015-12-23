package screens;

import application.Contacts;
import org.openqa.selenium.By;

public class HomeScreen extends BaseScreen{
    String floatingAddNewContactIconId = Contacts.appPackageName + ":id/floating_action_button";
    String confirmationMessageId = Contacts.appPackageName + ":id/left_button";
    String contactList = Contacts.appPackageName + ":id/cliv_name_textview";

    public void selectFloatingAddNewContactIcon() {
        driver.findElementById(floatingAddNewContactIconId).click();
        try{
            driver.findElementById(confirmationMessageId).click();
        }catch (Exception ex){

        }
    }

    public boolean isContactPresentInList(String contactName) {
        try{
            driver.findElementById(contactList);
        }catch (Exception ex){
            return false;
        }
        return true;
    }
}
