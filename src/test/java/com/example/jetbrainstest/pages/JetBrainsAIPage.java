package com.example.jetbrainstest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JetBrainsAIPage {

    private WebDriver driver;

    @FindBy(css = "[class*=\"wt-row\"] > [href=\"/idea/\"]")
    private WebElement ideaButton;

    @FindBy(css = "[class*=\"wt-row\"] > [href=\"/pycharm/\"]")
    private WebElement pyCharmButton;

    @FindBy(css = "[class*=\"wt-row\"] > [href=\"/phpstorm/\"]")
    private WebElement phpStormButton;

    @FindBy(css = "[class*=\"wt-row\"] > [href=\"/resharper/\"]")
    private WebElement reSharperButton;

    @FindBy(css = "[class*=\"wt-row\"] > [href=\"/fleet/\"]")
    private WebElement fleetButton;

    @FindBy(css = "[class*=\"wt-row\"] > [href=\"/ides/\"]")
    private WebElement allIdesButton;

    public void clickButton(String button){

    }


    public JetBrainsAIPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
