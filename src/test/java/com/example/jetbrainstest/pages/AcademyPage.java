package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.pages.spacepages.SpacePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


// page_url = https://www.jetbrains.com/academy/
public class AcademyPage {
    private final Logger LOG = LoggerFactory.getLogger(AcademyPage.class);

    WebDriver driver;
    @FindBy(css = "[data-test='button'][href*='email-sales']")
    private WebElement contactButton;

    @FindBy(xpath = "//h3[contains(text(),'Data science')]")
    private WebElement dataScienceButton;

    public void clickScienceButton(){
        dataScienceButton.click();
        LOG.info("Кликнули по кнопке Science");
    }
    public void clickContactButton(){
        contactButton.click();
        LOG.info("Кликнули по кнопке контактов");
    }

    public String getCurrUrl() {return driver.getCurrentUrl();
    }
    public AcademyPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);}
}
