package com.ari.stepdef;

import com.ari.page.CheckoutOverviewPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutOverviewStepDev {

    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();
    @Then("user is on Checkout Overview page")
    public void userIsOnCheckoutOverviewPage() {
        checkoutOverviewPage.assertUserIsOnCheckoutOverviewPage();

    }

    @When("user click finish button")
    public void userClickFinishButton() {
        checkoutOverviewPage.clickFinishButton();
    }
}
