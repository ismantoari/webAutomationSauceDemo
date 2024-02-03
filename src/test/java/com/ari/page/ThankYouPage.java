package com.ari.page;

import org.junit.Assert;
import org.openqa.selenium.By;

import static com.ari.BestUtil.driver;

public class ThankYouPage {

    By thankYouNote = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");
    By ponyExpress = By.xpath("//*[@id=\"checkout_complete_container\"]/img");

    public void assertThankYouPage() {
        String thankYouURL = driver.getCurrentUrl();
        Assert.assertEquals("https://www.saucedemo.com/checkout-complete.html", thankYouURL);

        System.out.println("URL saat ini : " + thankYouURL);


        String assertPonyExpress =  driver.findElement(ponyExpress).getAttribute("alt");
        Assert.assertEquals("Pony Express", assertPonyExpress);
        //System.out.println("src nya adalah : " + assertPonyExpress);


        String textThanks = driver.findElement(thankYouNote).getText();
        Assert.assertEquals("Thank you for your order!", textThanks);

    }

}
