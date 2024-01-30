package com.ari.stepdef;

import com.ari.page.ThankYouPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.ari.BestUtil.driver;


public class ThankYouStepdef {

    By thankYouNote = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");

    ThankYouPage thankYouPage = new ThankYouPage();

    @Then("user is on thank you page")
    public void userIsOnThankYouPage() {
        thankYouPage.assertThankYouPage();

        driver.findElement(thankYouNote).getText();

        System.out.println("text di Thank You Page : " + thankYouNote);



    }
}
