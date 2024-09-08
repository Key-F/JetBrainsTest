package com.example.jetbrainstest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class JetBrainsAIPage {

    private final Logger LOG = LoggerFactory.getLogger(JetBrainsAIPage.class);
    private WebDriver driver;

    public JetBrainsAIPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[aria-label='Close cookies banner']")
    private WebElement closeCookiesBanner;

    @FindBy(css = "[name = 'email']")
    private WebElement emailField;

    public void setCloseCookiesBanner(){
        LOG.info("Закрытие баннера с принятием cookies");
        closeCookiesBanner.click();
    }

    public String getButtonCssSelector(String buttonName){
        LOG.info("Получение CSS селектора элемента " + buttonName );
        String cssSelector = "[class *= 'wt-row'] > [href = '/" + buttonName + "/']";
        return cssSelector;
    }

    public void clickButton(String buttonName){
        LOG.info("Нажатие на элемент " + buttonName);
        WebElement button = driver.findElement(By.cssSelector(getButtonCssSelector(buttonName)));
        button.click();
    }

    public void enterEmail(String email) {
        LOG.info("В поле ввода адреса электронной почты введён следующий email: " + email);
        emailField.sendKeys(email);
    }

    public String getEmailFieldValue(){
        LOG.info("Получен атрибут 'value' поля ввода адреса электронной почты");
        String value = emailField.getAttribute("value");
        return value;
    }

}
