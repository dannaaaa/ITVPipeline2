package com.spartaglobal.ITVPipeline2.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ITVSignin {

    private WebDriver driver;

    private By signinButton = By.id("nav-primary-login");

    public ITVSignin(WebDriver driver){
        this.driver = driver;
    }

    public ITVSignin clickOnSignin(){
        driver.findElement(signinButton).click();
        return this;
    }

}
