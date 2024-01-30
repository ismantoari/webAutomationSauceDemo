package com.ari.page;

import org.junit.Assert;
import org.openqa.selenium.By;

import static com.ari.BestUtil.driver;

public class CheckoutOverviewPage {

    By finishButton = By.id("finish");


    public void assertUserIsOnCheckoutOverviewPage(){
        String urlCheckoutOverviewPage = driver.getCurrentUrl();
        Assert.assertEquals("https://www.saucedemo.com/checkout-step-two.html",urlCheckoutOverviewPage);

    }

    public void clickFinishButton(){
        driver.findElement(finishButton).click();

    }

}