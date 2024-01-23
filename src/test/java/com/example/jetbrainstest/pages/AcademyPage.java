package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.AllureLogger;
import com.example.jetbrainstest.pages.spacepages.SpacePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


// page_url = https://www.jetbrains.com/academy/
public class AcademyPage {
    //private final Logger LOG = LoggerFactory.getLogger(AcademyPage.class);
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(AcademyPage.class));
    private final WebDriver driver;

    @FindBy(css = "[data-test='button'][href*='email-sales']")
    private WebElement contactButton;

    @FindBy(xpath = "//h3[contains(text(),'Data science')]")
    private WebElement dataScienceButton;

    @FindBy(xpath = "//h4[contains(text(),'Java')]")
    private WebElement javaButton;

    @FindBy(xpath = "//input[@placeholder='Email address']")
    private WebElement emailAddress;
    @FindBy(xpath = "//textarea[@placeholder='Your feedback']")
    private WebElement feedBack;
    @FindBy(css = "button[data-test='button'][type='submit']")
    private WebElement submitButton;

    public AcademyPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickScienceButton(){
        dataScienceButton.click();
        LOG.infoWithScreenshot("Кликнули по кнопке Science");
    }

    public void clickContactButton(){
        contactButton.click();
        LOG.infoWithScreenshot("Кликнули по кнопке контактов");
    }
    public void clickJavaButton(){
        javaButton.click();
        LOG.infoWithScreenshot("Кликнули по кнопке Java");
    }
    public String getJavaText() {
        return driver.findElement(By.tagName("body")).getText();
    }
    public void enterEmail(String email){
        emailAddress.sendKeys(email);
        LOG.infoWithScreenshot("Email введен: " + email);
    }
    public void feedBack(String feedback){
        feedBack.sendKeys(feedback);
        LOG.infoWithScreenshot("Feedback введен: " +feedback);
    }
    public void clickSubmitButton(){
        submitButton.click();
        LOG.infoWithScreenshot("Нажата кнопка Submit");
    }



    public String getCurrUrl() {
        return driver.getCurrentUrl();
    }
}
