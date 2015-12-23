package steps;

import application.Contacts;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import domain.ContactInfo;

import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class JourneysSteps extends Contacts{

    @When("^User creates a new contact with following data$")
    public void user_creates_a_new_contact_with_following_data(List<ContactInfo> contactInfoList) throws Throwable {
        for (ContactInfo contactInfo : contactInfoList){
            homeScreen.selectFloatingAddNewContactIcon();
            addOrEditScreen.setName(contactInfo.getName());
            addOrEditScreen.setPhoneNumber(contactInfo.getPhoneNumber());
            addOrEditScreen.setEmailID(contactInfo.getEmailID());
            addOrEditScreen.save();
        }
    }

    @And("^User Views the contact card with following data$")
    public void User_Views_the_contact_card_with_following_data(List<ContactInfo> contactInfoList) throws Throwable {
        String expectedName = contactInfoList.get(0).getName();
        String actualName = contactViewScreen.getNameOnContactCard();
        assertThat(actualName).isEqualTo(expectedName);
    }

    @Then("^User should see \"([^\"]*)\" contact listed on home page$")
    public void User_should_see_contact_listed_on_home_page(String contactName) throws Throwable {
        homeScreen.isContactPresentInList(contactName);
    }
}
