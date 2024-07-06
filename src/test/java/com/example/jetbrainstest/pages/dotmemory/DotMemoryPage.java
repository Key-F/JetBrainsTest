package com.example.jetbrainstest.pages.dotmemory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//https://www.jetbrains.com/dotmemory/

public class DotMemoryPage {

    private final Logger LOG = LoggerFactory.getLogger(DotMemoryPage.class);
    WebDriver driver;

    @FindBy(css = "a[data-test='button' ][href ='/dotmemory/download/']")
    private WebElement downloadButton;

    public Boolean checkDownloadButton() {
        LOG.info("Проверка активности кнопки загрузки");
        return downloadButton.isEnabled();
    }

    public DotMemoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
