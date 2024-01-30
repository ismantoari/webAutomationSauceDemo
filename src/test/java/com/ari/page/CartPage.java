package com.ari.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.ari.BestUtil.driver;
import static org.junit.Assert.assertEquals;

public class CartPage {
    By checkoutButton = By.id("checkout");

    public void validationUserIsOnShoppingCartPage(){
        String urlCart = driver.getCurrentUrl();
        assertEquals("https://www.saucedemo.com/cart.html", urlCart);
    }

    public void clickCheckOutButton(){
        driver.findElement(checkoutButton).click();

    }
}
