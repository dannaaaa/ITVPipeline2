package com.spartaglobal.ITVPipeline2.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {

    private WebDriver driver;
    WebDriverWait wait;
    private String homepageUrl = "https://www.itv.com/";
    private By cookieAccept = By.id("cookie-message-accept");
    private By username = By.xpath("/html/body/div[1]/header/div/nav/div/div[2]/div/button/span[1]");
    private By signInButton = By.id("nav-primary-login");

    public Homepage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 120);
    }

    public void goToHomepage(){
        driver.navigate().to(homepageUrl);
    }

    public void clickCookieButton(){
        driver.findElement(cookieAccept).click();
    }

    public SignIn clickSignInButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signInButton));
        driver.findElement(signInButton).click();
        return new SignIn(driver);
    }

    public String getUsername() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(username));
        return driver.findElement(username).getText();
    }
}
