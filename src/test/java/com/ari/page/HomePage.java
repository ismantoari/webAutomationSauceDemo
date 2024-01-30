package com.ari.page;

import com.ari.BestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.Instant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePage extends BestUtil {

    By productNameBackpackCss = By.cssSelector("#item_4_title_link > div:nth-child(1)");
    By productNameSauceLabsBoltTShirt = By.xpath("//*[@id=\"item_1_title_link\"]/div");

    By shoppingCartIcon = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    public void validateUserIsOnHomePage(){
        WebElement productElementBackpack = driver.findElement(productNameBackpackCss);
        assertTrue(productElementBackpack.isDisplayed());
        assertEquals("Sauce Labs Backpack",productElementBackpack.getText());
    }

    public void ClickAddToCart(String productSearchName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        if ((productSearchName.equals("Sauce Labs Bolt T-Shirt"))) {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")));
            driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
//==========================Cek Sudah di click =================================
//            WebElement atcSauceLabBoltTShirtClick = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[2]/div"));
//            assertTrue(atcSauceLabBoltTShirtClick.isDisplayed());
//            System.out.println("T-Shirt Sudah di Click");
// ==============================================================================
        }
        else {
            System.out.println("no product add to cart");
        }
    }

    public void validateCartBadgeIs(String total){

        WebElement cartBadge = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));

// get text untuk membandingkan angka notifikasi
        assertTrue(cartBadge.isDisplayed());
        String cartBadgeNotif = cartBadge.getText();
        assertTrue(cartBadgeNotif.contentEquals(total));
        System.out.println("jumlah angka di badge ; " + cartBadgeNotif );
    }

    public void clickShoppingCartIconOnHomePage(){
        driver.findElement(shoppingCartIcon).click();

    }

}
