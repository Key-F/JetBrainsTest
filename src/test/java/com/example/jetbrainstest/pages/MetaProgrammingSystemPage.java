package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

// page_url = https://www.jetbrains.com/mps/
public class MetaProgrammingSystemPage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(MetaProgrammingSystemPage.class));
    WebDriver driver;

    @FindBy(css = "a[data-test='button' ][href ='/mps/downloadd/']")
    private WebElement downloadButton;

    @FindBy(css = "a[href ='/mps/nextversion/']")
    private WebElement eapProgramButton;

    @FindBy(css = "a[href ='/mps/whatsnew/']")
    private WebElement whatsNewButton;

    @FindBy(css = "a[href ='/mps/concepts/']")
    private WebElement howItsWorksButton;

    @FindBy(css = "a[href ='/mps/learn/']")
    private WebElement learnMpsButton;

    @FindBy(css = "a[href ='/mps/support/']")
    private WebElement servicesButton;

    @FindBy(css = "a[href='/help/mps/mps-faq.html']")
    private WebElement faqButton;

    @FindBy(css = "a[href='https://www.jetbrains.com/help/mps/migration-guide.html']")
    private WebElement migrationGuideButton;

    @FindBy(css = "h1[class='wt-h2']")
    private WebElement textOnDownloadPage;

    @FindBy(css = "a[href='https://www.jetbrains.com/help/mps/fast-track-to-mps.html']")
    private WebElement getStartedButton;

    @FindBy(css = "button[data-test='site-header-search-action']")
    private WebElement searchButton;

    @FindBy(css = "input[data-test-id='search-input']")
    private WebElement searchField;

    @FindBy(css = "h1[class='_rs-hero_18dgpd9_1 _rs-typography_theme_dark_18dgpd9_1 _rs-text_hardness_auto_18dgpd9_1 wt-offset-top-24']")
    private WebElement mainPageText;

    @FindBy(css = "span[data-test='menu-second-title-box-title']")
    private WebElement mpsMainPageText;

    @FindBy(css = "a[data-test='site-header-cart-action']")
    private WebElement storeButton;

    @FindBy(css = "a[href='https://account.jetbrains.com/']")
    private WebElement profileButton;

    @FindBy(css = "button[aria-label='Open language selection']")
    private WebElement languageButton;

    public String checkSendTextIntoSearchField(String input) {
        LOG.infoWithScreenshot("Проверка URL после search");
        clickSearchButton();
        searchField.sendKeys(input);
        searchField.submit();
        return getCurentUrlSearchPage();
    }

    public Boolean checkIfSearchButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки search");
        return searchButton.isEnabled();
    }

    public Boolean checkIfLanguageButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки смены языка");
        return languageButton.isEnabled();
    }

    public Boolean checkIfProfileButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки profile");
        return profileButton.isEnabled();
    }

    public Boolean checkIfStoreButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки store");
        return storeButton.isEnabled();
    }

    public Boolean checkIfDownloadButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки Download");
        return downloadButton.isEnabled();
    }

    public Boolean checkIfEapProgramButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки EAP Program");
        return eapProgramButton.isEnabled();
    }

    public Boolean checkIfWhatsNewButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки Whats New");
        return whatsNewButton.isEnabled();
    }

    public Boolean checkIfHowItsWorksButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки How Its Works");
        return howItsWorksButton.isEnabled();
    }

    public Boolean checkIfLearnMpsButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки Learn Mps");
        return learnMpsButton.isEnabled();
    }

    public Boolean checkIfServicesButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки Services");
        return servicesButton.isEnabled();
    }

    public Boolean checkIfFaqButtonIsClickable() {
        clickDownloadElement();
        LOG.infoWithScreenshot("Проверка кликабельности кнопки FAQ");
        return faqButton.isEnabled();
    }

    public Boolean checkIfMigrationGuideButtonIsClickable() {
        clickDownloadElement();
        LOG.infoWithScreenshot("Проверка кликабельности кнопки Migration Guide");
        return migrationGuideButton.isEnabled();
    }

    public Boolean checkIfGetStartedButtonIsClickable() {
        clickLearnMpsElement();
        LOG.infoWithScreenshot("Проверка кликабельности кнопки Get Started");
        return getStartedButton.isEnabled();
    }

    public String checkTextOnDownloadPage() {
        clickDownloadElement();
        LOG.infoWithScreenshot("Проверка текста Download MPS");
        return textOnDownloadPage.getText();
    }

    public String checkMpsTextOnMainPage() {
        LOG.infoWithScreenshot("Проверка текста Download MPS");
        return mpsMainPageText.getText();
    }

    public String checkTextOnMainPage() {
        LOG.infoWithScreenshot("Проверка текста Download MPS");
        return mainPageText.getText();
    }

    public String getCurentUrlDownloadPage() {
        LOG.infoWithScreenshot("Переход на страницу загрузки");
        clickDownloadElement();
        return driver.getCurrentUrl();
    }

    public String getCurentUrlLearnMpsPage() {
        LOG.infoWithScreenshot("Переход на страницу Learn MPS");
        clickLearnMpsElement();
        return driver.getCurrentUrl();
    }

    public String getCurentUrlSearchPage() {
        LOG.infoWithScreenshot("Переход на страницу Learn MPS");
        return driver.getCurrentUrl();
    }

    public String getCurentUrlGetStartedPage() {
        LOG.infoWithScreenshot("Переход на страницу Get Started");
        clickGetStartedElement();
        return driver.getCurrentUrl();
    }

    public MetaProgrammingSystemPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickDownloadElement() {
        downloadButton.click();
    }

    public void clickLearnMpsElement() {
        learnMpsButton.click();
    }

    public void clickGetStartedElement() {
        getStartedButton.click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }
}
