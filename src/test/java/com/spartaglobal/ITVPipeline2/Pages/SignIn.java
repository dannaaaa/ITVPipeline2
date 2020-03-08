package com.spartaglobal.ITVPipeline2.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn {

    private WebDriver driver;
    WebDriverWait wait;

    private By userNameField = By.id("login-email");
    private By passwordField = By.id("login-password");
    private By submitButton = By.id("login-submit");
    private By usernameAndPasswordErrorId = By.id("form-login-error");


    public SignIn(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 120);
    }

    public void inputUsername (String username){
        wait.until(ExpectedConditions.visibilityOfElementLocated(userNameField));
        driver.findElement(userNameField).sendKeys(username);
    }

    public void inputPassword (String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSubmitButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(submitButton));
        driver.findElement(submitButton).click();
    }

    //The same error message shows for all errors
    public String getUsernameAndPasswordErrorText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameAndPasswordErrorId));
        return driver.findElement(usernameAndPasswordErrorId).getText();
    }
}
