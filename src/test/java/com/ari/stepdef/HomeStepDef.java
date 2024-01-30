package com.ari.stepdef;

import com.ari.page.HomePage;
import com.ari.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeStepDef {

    HomePage homePage = new HomePage();

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage.validateUserIsOnHomePage();
    }

    @When("user click add to cart {string}")
    public void userClickAddToCart(String productName) {
        homePage.ClickAddToCart(productName);
    }


//    @Then("validation cart badge notification")
//    public void validationCartBadgeNotification() {
//        homePage.validationCartBadge();
//    }

    @Then("validate cart badge notification is {string}")
    public void validateCartBadgeNotificationIs(String cartValue) {
        homePage.validateCartBadgeIs(cartValue);
    }

    @Given("user already atc")
    public void userAlreadyAtc() {
    }

    @When("user click shopping cart icon on homepage")
    public void userClickShoppingCartIconOnHomepage() {
        homePage.clickShoppingCartIconOnHomePage();
    }
}
