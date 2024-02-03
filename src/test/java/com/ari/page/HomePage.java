package com.ari.page;

import com.ari.BestUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePage extends BestUtil {

    By productNameBackpackCss = By.cssSelector("#item_4_title_link > div:nth-child(1)");
    By productNameSauceLabsBoltTShirt = By.xpath("//*[@id=\"item_1_title_link\"]/div");
    By shoppingCartIcon = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    By sortDropDown = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");

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

    //=======================================================================
    // Sort Product
    //=======================================================================

    public void selectSortProductBy(String sortCriteria){

        Select selectSortDropDown = new Select(driver.findElement(sortDropDown));

        if (sortCriteria.contentEquals("name_ascending")){
            selectSortDropDown.selectByVisibleText("Name (A to Z)");
        }
        else if (sortCriteria.contentEquals("name_descending")){
            selectSortDropDown.selectByVisibleText("Name (Z to A)");
        }
        else if (sortCriteria.contentEquals("price_ascending")){
            selectSortDropDown.selectByVisibleText("Price (low to high)");
        }

        else if (sortCriteria.contentEquals("price_descending")){
            selectSortDropDown.selectByVisibleText("Price (high to low)");
        }
        else {
            System.out.println("any problem");
        }
    }


    public void assertProductSortBy(String sortResult) {
        List<WebElement> webElementProductName = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
        List<WebElement> webElementProductPrice = driver.findElements(By.xpath("//div[@class=\"inventory_item_price\"]"));

        int jumlahProductByName, jumlahProductByPrice;
        jumlahProductByName = webElementProductName.size();
        jumlahProductByPrice = webElementProductPrice.size();


        ArrayList<String> productContainerToSort = new ArrayList<String>();
        for (int i = 0; i < jumlahProductByName; i++) {
            productContainerToSort.add(webElementProductName.get(i).getText());
        }

        ArrayList<String> productDisplay = new ArrayList<String>();
        for (int i = 0; i < jumlahProductByName; i++) {
            productDisplay.add(webElementProductName.get(i).getText());
        }

        ArrayList<Integer> productPriceDisplay = new ArrayList<Integer>();
        for (int i = 0 ; i< jumlahProductByPrice;i++){
            String hargaDisplay = webElementProductPrice.get(i).getText();
            String hanyaAngkaHargaDisplay = hargaDisplay.replaceAll("[^\\d]","");
            Integer angkaHargaDisplay = Integer.parseInt(hanyaAngkaHargaDisplay);
            productPriceDisplay.add(angkaHargaDisplay);
        }
        System.out.println("Harga Display : " + productPriceDisplay);

        ArrayList<Integer> productPriceContainerToSort = new ArrayList<Integer>();
        for (int i = 0 ; i< jumlahProductByPrice;i++){
            //productPriceContainerToSort.add(webElementProductPrice.get(i).getText());
            String hargaBarang = webElementProductPrice.get(i).getText();
            String hanyaAngkaHarga = hargaBarang.replaceAll("[^\\d]","");
            Integer intHanyaAngkaHarga = Integer.parseInt(hanyaAngkaHarga);
            productPriceContainerToSort.add(intHanyaAngkaHarga);
        }
        System.out.println(" ISI ANGKA HARGA : " + productPriceContainerToSort);


        if (sortResult.contentEquals("name A to Z")) {
            Collections.sort(productContainerToSort);
           // System.out.println("product display : " + productDisplay);
          //  System.out.println("product sort : " + productContainerToSort);

            Assert.assertEquals(productContainerToSort, productDisplay);
        }
        else if (sortResult.contentEquals("name Z to A")) {

            productContainerToSort.sort(Collections.reverseOrder());
           // System.out.println("product display : " + productDisplay);
           // System.out.println("product sort : " + productContainerToSort);

            Assert.assertEquals(productContainerToSort, productDisplay);
        }
        else if (sortResult.contentEquals("price low to high")){
            Collections.sort(productPriceContainerToSort);
            System.out.println("sort price ascending : " + productPriceContainerToSort);
            Assert.assertEquals(productPriceContainerToSort,productPriceDisplay);
        }

        else if (sortResult.contentEquals("price high to low")){
            Collections.sort(productPriceContainerToSort);
            productPriceContainerToSort.sort(Collections.reverseOrder());
            System.out.println( "sort price descending : " + productPriceContainerToSort);
            Assert.assertEquals(productPriceContainerToSort,productPriceDisplay);
        }
        else
        {
            System.out.println("terjadi kesalahan");

        }
    }


}
