package com.example.jetbrainstest.pages.resharper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

// https://www.jetbrains.com/resharper/

public class ReSharperPage {

    private final Logger LOG = LoggerFactory.getLogger(ReSharperPage.class);

    @FindBy(css = "a[href='/resharper/download/']")
    private WebElement downloadLink;

    @FindBy(css = "input[name = \"email\"]")
    private WebElement emailField;

    @FindBy(css = "li:nth-child(5) > ul > li > a[href]")
    private List<WebElement> resourcesLinks;

    public Boolean downloadButtonDisplay() {
        LOG.info("Проверка наличия кнопки Download");
        return downloadLink.isDisplayed();
    }

    public String checkEmailFieldPlaceholder() {
        LOG.info("Проверка верного placeholder в поле Email");
        return emailField.getAttribute("placeholder");
    }

    public Boolean checkBlogLinkInResources(String linkOnBlog) {
        LOG.info("Проверка наличия ссылки на Blog в подвале страницы");
        for (int i = 0; i < resourcesLinks.size() - 1; i++) {
            if (resourcesLinks.get(i).getAttribute("href").equals(linkOnBlog)) {
                return true;
            }
        }
        return false;
    }

    public ReSharperPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
