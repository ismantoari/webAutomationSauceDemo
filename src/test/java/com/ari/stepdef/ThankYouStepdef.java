package com.ari.stepdef;

import com.ari.page.ThankYouPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.ari.BestUtil.driver;


public class ThankYouStepdef {

       ThankYouPage thankYouPage = new ThankYouPage();

    @Then("user is on thank you page")
    public void userIsOnThankYouPage() {
        thankYouPage.assertThankYouPage();



    }
}
