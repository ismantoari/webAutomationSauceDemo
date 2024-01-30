package com.ari.page;

import org.junit.Assert;

import static com.ari.BestUtil.driver;

public class ThankYouPage {

    public void assertThankYouPage() {
        String thankYouURL = driver.getCurrentUrl();
        Assert.assertEquals("https://www.saucedemo.com/checkout-complete.html", thankYouURL);

        System.out.printf("URL saat ini : " + thankYouURL);
    }

}
