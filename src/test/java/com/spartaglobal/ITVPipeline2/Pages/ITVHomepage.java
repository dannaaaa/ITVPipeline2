package com.spartaglobal.ITVPipeline2.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ITVHomepage {

    private WebDriver driver;
    private String homepageUrl = "https://www.itv.com/";
    private By cookieAccept = By.id("cookie-message-accept");

    public ITVHomepage(WebDriver driver){
        this.driver = driver;
    }

    public ITVHomepage goToHomepage(){
        driver.navigate().to(homepageUrl);
        return this;
    }

    public ITVHomepage clickCookieButton(){
        driver.findElement(cookieAccept).click();
        return this;
    }

}
