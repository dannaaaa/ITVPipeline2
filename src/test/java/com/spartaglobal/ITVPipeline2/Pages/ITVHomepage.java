package com.spartaglobal.ITVPipeline2.Pages;

import org.openqa.selenium.WebDriver;

public class ITVHomepage {

    private WebDriver driver;
    private String homepageUrl = "https://www.itv.com/";

    public ITVHomepage(WebDriver driver){
        this.driver = driver;
    }

    public ITVHomepage goToHomepage(){
        driver.navigate().to(homepageUrl);
        return this;
    }

}
