package com.ari.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.ari.BestUtil.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class YourInformationPage {

    By firstNameTextBox = By.xpath("//*[@id=\"first-name\"]");
    By lastNameTextBox = By.xpath("//*[@id=\"last-name\"]");
    By zipOrPostalCodeTextBox = By.xpath("//*[@id=\"postal-code\"]");
    By continueButton = By.id("continue");
    WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));



    public void userIsOnYourInformationPage(){
        String urlYourInformationPage = driver.getCurrentUrl();
        assertEquals("https://www.saucedemo.com/checkout-step-one.html", urlYourInformationPage);
    }

    public void inputFirstName(String firstName){
        WebElement firstNameText = driver.findElement(firstNameTextBox);
        wait.until(ExpectedConditions.presenceOfElementLocated(firstNameTextBox));
        driver.findElement(firstNameTextBox).sendKeys(firstName);
    }

    public void inputLastName(String lastName){
        driver.findElement(lastNameTextBox).sendKeys(lastName);
    }

    public void inputZipOrPostalCode(String zipOrPosCode){
        driver.findElement(zipOrPostalCodeTextBox).sendKeys(zipOrPosCode);
    }

    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }



}
