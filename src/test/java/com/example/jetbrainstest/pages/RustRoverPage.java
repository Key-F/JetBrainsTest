package com.example.jetbrainstest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//https://www.jetbrains.com/rust/
public class RustRoverPage
{
    private final Logger LOG = LoggerFactory.getLogger(RustRoverPage.class);
    WebDriver driver;
    @FindBy(css = "a[href='/rust/download/']")
    private WebElement downloadRustPreview;
    @FindBy(css = "button[aria-label='Education: Open submenu']")
    private WebElement educationDropDown;

    public String clickRustDownloadAndCheckUrl(){
        LOG.info("Checking if URL changed after button has been clicked");
        driver.get("https://www.jetbrains.com/rust/");
        downloadRustPreview.click();
        return driver.getCurrentUrl();
    }
    public void getEducationPage() {
        educationDropDown.click();
        LOG.info("Clicking on education link");
    }
    public RustRoverPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
