package com.example.jetbrainstest.pages.JetBrainsAiPages;

import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class DeveloperEcosystemPage {

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(JetBrainsAiPage.class));
    private WebDriver driver;

    public DeveloperEcosystemPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class=\"wt-row wt-row_size_xs wt-row_align-items_center main-menu__dropdown\"]")
    private WebElement dropdownButton;

    //@FindBy(css = "Highlights:first-of-type")
    //private WebElement dropdownButton;

    @FindBy(css = "[class=\'_content_3f0o8_40\'] > [href=\'/lp/devecosystem-2023/ai/\']")
    private WebElement aiDropdownButton;

    public void dropdownButtonClick(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(dropdownButton));
        LOG.info("Нажатие на раскрытие списка");
        dropdownButton.click();
    }

    public Boolean aiDropdownButtonEnable(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(aiDropdownButton));
        LOG.info("Проверка доступности кнопки 'AI'");
        return aiDropdownButton.isEnabled();
    }

}
