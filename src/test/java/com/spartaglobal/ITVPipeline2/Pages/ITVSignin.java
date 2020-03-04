package com.spartaglobal.ITVPipeline2.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ITVSignin {

    private WebDriver driver;

    private By signinButton = By.id("nav-primary-login");
    private By userNameField = By.id("login-email");
    private By passwordField = By.id("login-password");
    private By submitButton = By.id("login-submit");
    private By usernameAndPasswordErrorId = By.id ("form-login-error");


    public ITVSignin(WebDriver driver){
        this.driver = driver;
    }

    public ITVSignin clickOnSignin(){
        driver.findElement(signinButton).click();
        return this;
    }

    public ITVSignin inputUsername (String username){
        driver.findElement(userNameField).sendKeys(username);
        return this;
    }

    public ITVSignin inputPassword (String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public ITVSignin clickSubmitButton(){
        driver.findElement(submitButton).click();
        return this;
    }

    //The same error message shows for all errors
    public String getUsernameAndPasswordErrorText(){
        return driver.findElement(usernameAndPasswordErrorId).getText();
    }


}
