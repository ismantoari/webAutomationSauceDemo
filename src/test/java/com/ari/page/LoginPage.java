package com.ari.page;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.ari.BestUtil.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class LoginPage{

    By usernameInputText = By.cssSelector("#user-name");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.id("login-button");

    By errorLogin = By.cssSelector(".error-message-container > h3:nth-child(1)");


    public void loginPageFirst(){
        driver.get("https://www.saucedemo.com/");
    }
    public void inputUsername(String username){
        driver.findElement(usernameInputText).sendKeys(username);
    }
    public void inputPassword(String password){
        driver.findElement(passwordInputText).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public void userSeeErrorCode(String errorExpectation){
        String errorMsg = driver.findElement(errorLogin).getText();
        assertEquals(errorExpectation,errorMsg);
    }

    public void assertLogin (String testCategory){

        if (testCategory.equals("positive")){
            HomePage homePage = new HomePage();
            homePage.validateUserIsOnHomePage();
            System.out.println("login sukses");
        }
        else if (testCategory.equals("negative invalid")){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement errorLoginBlock = driver.findElement(errorLogin);

            wait.until(ExpectedConditions.presenceOfElementLocated(errorLogin));

            String errorMsg = driver.findElement(errorLogin).getText();
            assertTrue(errorLoginBlock.isDisplayed());
            assertEquals("Epic sadface: Username and password do not match any user in this service",errorMsg);
            System.out.println(errorMsg);
        }
        else if (testCategory.equals("negative blank")){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement errorLoginBlock = driver.findElement(errorLogin);

            wait.until(ExpectedConditions.presenceOfElementLocated(errorLogin));

            String errorBlank = driver.findElement(errorLogin).getText();
            assertTrue(errorLoginBlock.isDisplayed());
            assertEquals("Epic sadface: Username is required",errorBlank);
            System.out.println(errorBlank);

        }
        else{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement errorLoginBlock = driver.findElement(errorLogin);
            wait.until(ExpectedConditions.presenceOfElementLocated(errorLogin));

            String errorNoPwd = driver.findElement(errorLogin).getText();
            assertTrue(errorLoginBlock.isDisplayed());
            assertEquals("Epic sadface: Password is required",errorNoPwd);
            System.out.println(errorNoPwd);
        }


    }




}
