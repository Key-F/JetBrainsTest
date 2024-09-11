package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.tests.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

public class DotCoverPage {

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(DotCoverPage.class));

    WebDriver driver;

    @FindBy(css = "a[data-test='button'][href='/dotcover/download/']")
    private WebElement downloadButton;

    public Boolean checkActivityOfDownload() {
        LOG.infoWithScreenshot("Проверка работоспособности кнопки загрузки");
        return downloadButton.isEnabled();
    }

    @FindBy(css = "a[data-test='button'][href='/dotcover/buy/']")
    private WebElement pricingButton;

    public Boolean checkActivityOfPricing() {
        LOG.infoWithScreenshot("Проверка работоспособности кнопки цен");
        return pricingButton.isEnabled();
    }

    @FindBy(xpath = "//h1[@class='wt-col-inline rs-hero rs-hero_theme_dark']")
    private WebElement dotCoverEl;

    public Boolean checkDotCoverEl() {
        LOG.infoWithScreenshot("Проверка наличия текста");
        return dotCoverEl.isDisplayed();
    }

    @FindBy(css = "a[data-test='button'][href='/dotcover/features']")
    private WebElement allFeaturesEl;

    public Boolean checkActivityOfAllFeatures() {
        LOG.infoWithScreenshot("Проверка работоспособности кнопки изучения всех особенностей");
        return allFeaturesEl.isEnabled();
    }

    @FindBy(css = "a[href='/dotcover/documentation/']")
    private WebElement docsDemosButton;

    public void docsDemosButtonClick() {
        LOG.infoWithScreenshot("Проверка нажатия кнопки документации и демо");
        docsDemosButton.click();
    }

    @FindBy(css = "a[href='/dotcover/social/']")
    private WebElement blogSocialButton;

    public void blogSocialButtonClick() {
        LOG.infoWithScreenshot("Проверка нажатия кнопки блога и социальных сетей");
        blogSocialButton.click();
    }

    @FindBy(css = "a[href='/dotcover/features/']")
    private WebElement featuresButton;

    public void featureButtonClick() {
        LOG.infoWithScreenshot("Проверка нажатия кнопки особенностей");
        featuresButton.click();
    }

    @FindBy(css = "a[href='/dotcover/whatsnew/']")
    private WebElement whatsNewButton;

    public void whatsNewButtonClick() {
        LOG.infoWithScreenshot("Проверка нажатия кнопки новостей");
        whatsNewButton.click();
    }

    @FindBy(css = "button[data-test='language-picker'][class$='1']")
    private WebElement languagePicker;

    public Boolean checkLanguagePicker() {
        LOG.infoWithScreenshot("Проверка работоспособности кнопки выбора языка");
        return languagePicker.isEnabled();
    }

    @FindBy(css = "a[data-test='site-header-cart-action']")
    private WebElement cartAction;

    public Boolean checkCartAction() {
        LOG.infoWithScreenshot("Проверка работоспособности кнопки корзины");
        return cartAction.isEnabled();
    }

    @FindBy(css = "a[data-test='site-header-profile-action']")
    private WebElement profileAction;

    public void profileActionClick() {
        LOG.infoWithScreenshot("Проверка нажатия кнопки личного кабинета");
        profileAction.click();
    }

    @FindBy(css = "button[data-test='site-header-search-action']")
    private WebElement searchAction;

    public Boolean checkSearchAction() {
        LOG.infoWithScreenshot("Проверка работоспособности кнопки поиска");
        return searchAction.isEnabled();
    }

    @FindBy(xpath = "//div[contains(@class, '_mainMenuItem_wamm84_3')]//*[contains(text(), 'Store')]")
    private WebElement storeButton;

    public Boolean storeButtonAction() {
        LOG.infoWithScreenshot("Проверка отображения кнопки магазина");
        return storeButton.isDisplayed();
    }

    @FindBy(xpath = "//div[contains(@class, '_mainMenuItem_wamm84_3')]//*[contains(text(), 'Support')]")
    private WebElement supportButton;

    public Boolean supportButtonAction() {
        LOG.infoWithScreenshot("Проверка отображения кнопки поддержки");
        return supportButton.isDisplayed();
    }

    @FindBy(xpath = "//div[contains(@class, '_mainMenuItem_wamm84_3')]//*[contains(text(), 'Solutions')]")
    private WebElement solutionsButton;

    public Boolean solutionsButtonAction() {
        LOG.infoWithScreenshot("Проверка отображения кнопки решений");
        return solutionsButton.isDisplayed();
    }

    @FindBy(xpath = "//div[contains(@class, '_mainMenuItem_wamm84_3')]//*[contains(text(), 'Education')]")
    private WebElement educationButton;

    public Boolean educationButtonAction() {
        LOG.infoWithScreenshot("Проверка отображения кнопки образования");
        return educationButton.isDisplayed();
    }

    @FindBy(xpath = "//div[contains(@class, '_mainMenuItem_wamm84_3')]//*[contains(text(), 'Team Tools')]")
    private WebElement teamToolsButton;

    public Boolean teamToolsButtonAction() {
        LOG.infoWithScreenshot("Проверка отображения кнопки инструментов");
        return teamToolsButton.isDisplayed();
    }

    @FindBy(xpath = "//div[contains(@class, '_mainMenuItem_wamm84_3')]//*[contains(text(), 'Developer Tools')]")
    private WebElement devToolsButton;

    public Boolean devToolsButtonAction() {
        LOG.infoWithScreenshot("Проверка отображения кнопки инструментов разработчика");
        return devToolsButton.isDisplayed();
    }

    @FindBy(xpath = "(//div[@class='social-footer__link-text-wrapper'])[1]")
    private WebElement comForumAction;

    public void comForumActionClick() {
        LOG.infoWithScreenshot("Проверка нажатия кнопки форума");
        comForumAction.click();
    }

    @FindBy(xpath = "(//div[@class='social-footer__link-text-wrapper'])[2]")
    private WebElement bugTrackerAction;

    public void bugTrackerActionClick() {
        LOG.infoWithScreenshot("Проверка нажатия кнопки отслеживания ошибок");
        bugTrackerAction.click();
    }

    public DotCoverPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}