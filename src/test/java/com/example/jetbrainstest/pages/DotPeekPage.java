package com.example.jetbrainstest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// https://www.jetbrains.com/decompiler/

public class DotPeekPage {

    WebDriver driver;

    @FindBy(css = "a[href='/decompiler/download/']")

    private WebElement downloadButton;

    public DotPeekPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean checkDownloadButtonIsClickable(){

        return downloadButton.isEnabled();
    }

}
