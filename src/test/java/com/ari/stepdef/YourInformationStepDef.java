package com.ari.stepdef;

import com.ari.page.YourInformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class YourInformationStepDef {   YourInformationPage yourInformationPage = new YourInformationPage();
    @Then("user is on your information page")
    public void userIsOnYourInformationPage() {
        yourInformationPage.userIsOnYourInformationPage();

    }

    @When("user input first name {string}")
    public void userInputFirstName(String firstName) {
        yourInformationPage.inputFirstName(firstName);
    }

    @And("user input last name {string}")
    public void userInputLastName(String lastName) {
        yourInformationPage.inputLastName(lastName);
    }

    @And("user input zip or postal code {string}")
    public void userInputZipOrPostalCode(String zipOrPosCode) {
        yourInformationPage.inputZipOrPostalCode(zipOrPosCode);
    }

    @And("user click continue button")
    public void userClickContinueButton() {
        yourInformationPage.clickContinueButton();
    }



}
