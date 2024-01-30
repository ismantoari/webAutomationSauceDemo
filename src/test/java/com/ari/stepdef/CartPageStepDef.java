package com.ari.stepdef;

import com.ari.page.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartPageStepDef {

    CartPage cartPage = new CartPage();
    @Then("user is on shopping cart page")
    public void userIsOnShoppingCartPage() {
        cartPage.validationUserIsOnShoppingCartPage();
    }

    @When("user click check out button")
    public void userClickCheckOutButton() {
        cartPage.clickCheckOutButton();
    }
}
