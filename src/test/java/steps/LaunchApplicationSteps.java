package steps;

//import cucumber.api.java.En;

import application.Contacts;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import java.net.MalformedURLException;
import static org.fest.assertions.Assertions.*;

public class LaunchApplicationSteps extends Contacts {

  /*  public launchApplicationStep() {
        Given("^Contacts application is launched$", () -> {

        });
    }*/
    @After
    public void closeApplication(){
        super.closeApplication();
    }

    @Given("^Contacts application is launched$")
    public void contacts_application_is_launched() throws MalformedURLException {
        launchApplicationInEmulator();
    }

    @Given("^Contact application is launched$")
    public void Contact_application_is_launched() throws Throwable {
        assertThat(isApplicationLaunched()).isTrue();
    }


    @And("^User click back button on device$")
    public void User_click_back_button_on_device() throws Throwable {
        driver.sendKeyEvent(4);
    }
}
