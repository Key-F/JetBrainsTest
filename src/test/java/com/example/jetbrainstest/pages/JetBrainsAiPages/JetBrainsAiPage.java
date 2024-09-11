package com.example.jetbrainstest.pages.JetBrainsAiPages;

import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

import java.time.Duration;


public class JetBrainsAiPage {

    //private final Logger LOG = LoggerFactory.getLogger(JetBrainsAiPage.class);
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(JetBrainsAiPage.class));
    private WebDriver driver;

    public JetBrainsAiPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[data-jetbrains-cookies-banner-action=\'ACCEPT_ALL\']")
    private WebElement acceptAllCookiesBanner;

    @FindBy(css = "[name = 'email']")
    private WebElement emailField;

    @FindBy(css = "[href = '/lp/devecosystem-2023/']")
    private WebElement developerEcosystemButton;

    public void acceptCookiesBanner(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        LOG.info("Закрытие баннера с принятием cookies");
        acceptAllCookiesBanner.click();
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

    public void developerEcosystemButtonClick(){
        developerEcosystemButton.click();
    }

    wtf

}
