package com.example.jetbrainstest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class JetBrainsAIPage {

    private WebDriver driver;

    @FindBy(css = "[aria-label='Close cookies banner']")
    private WebElement closeCookiesBanner;

    public void setCloseCookiesBanner(){
        closeCookiesBanner.click();
    }

    public String getButtonCssSelector(String buttonName){
        String cssSelector = "[class *= 'wt-row'] > [href = '/" + buttonName + "/']";
        return cssSelector;
    }

    public void clickButton(String buttonName){
        WebElement button = driver.findElement(By.cssSelector(getButtonCssSelector(buttonName)));
        button.click();
    }

    public JetBrainsAIPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
