package com.spartaglobal.ITVPipeline2;

import com.spartaglobal.ITVPipeline2.Pages.ITVHomepage;
import com.spartaglobal.ITVPipeline2.Pages.ITVSignin;
import org.openqa.selenium.WebDriver;

public class ITVSite {

    private WebDriver driver;
    private ITVHomepage itvHomepage;
    private ITVSignin itvSignin;


    public ITVSite(WebDriver driver) {
        this.driver = driver;

        this.itvHomepage = new ITVHomepage(driver);
        this.itvSignin = new ITVSignin(driver);
    }

    public  ITVHomepage itvHomepage(){

        return itvHomepage.goToHomepage().clickCookieButton();
    }

    public ITVSignin itvSignin(){

        return itvSignin.clickOnSignin();
    }
}
