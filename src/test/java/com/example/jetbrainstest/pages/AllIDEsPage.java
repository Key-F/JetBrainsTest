package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllIDEsPage {

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(AllIDEsPage.class));

    WebDriver driver;

    @FindBy(css = ".ch2-btn.ch2-allow-all-btn.ch2-btn-primary")
    private WebElement cookiesButton;

    @FindBy(xpath = "//button[@type='button' and @data-rs-internal='switcher__option']/span[text()='Business']")
    private WebElement businessButton;

    @FindBy(css = "._rs-link_tfgi0h_1._rs-link_mode_standalone_tfgi0h_1._rs-typography_theme_dark_tfgi0h_1")
    private WebElement exploreOffersLink;

    @FindBy(css = "a._rs-link_tfgi0h_1[href='/startups/#startup-program']")
    private WebElement learnMoreLink;

    @FindBy(xpath =
            "//div[@class='_rs-text-2_tfgi0h_1 _rs-typography_theme_dark_tfgi0h_1 _rs-text_hardness_hard_tfgi0h_1' " +
                    "and text()='JavaScript']")
    private WebElement javascriptButton;

    @FindBy(xpath =
            "//div[@class='_rs-text-2_tfgi0h_1 _rs-typography_theme_dark_tfgi0h_1 _rs-text_hardness_hard_tfgi0h_1' " +
                    "and text()='C#']")
    private WebElement sharpButton;

    @FindBy(xpath =
            "//div[@class='_rs-text-2_tfgi0h_1 _rs-typography_theme_dark_tfgi0h_1 _rs-text_hardness_hard_tfgi0h_1' " +
                    "and text()='Rust']")
    private WebElement rustButton;

    @FindBy(xpath =
            "//div[@class='_rs-text-2_tfgi0h_1 _rs-typography_theme_dark_tfgi0h_1 _rs-text_hardness_hard_tfgi0h_1' " +
                    "and text()='HTML / CSS']")
    private WebElement htmlButton;

    @FindBy(xpath =
            "//div[@class='_rs-text-2_tfgi0h_1 _rs-typography_theme_dark_tfgi0h_1 _rs-text_hardness_hard_tfgi0h_1' " +
                    "and text()='C++']")
    private WebElement cplusButton;

    @FindBy(xpath =
            "//div[@class='_rs-text-2_tfgi0h_1 _rs-typography_theme_dark_tfgi0h_1 _rs-text_hardness_hard_tfgi0h_1' " +
                    "and text()='Ruby']")
    private WebElement rubyButton;

    @FindBy(xpath =
            "//div[@class='_rs-text-2_tfgi0h_1 _rs-typography_theme_dark_tfgi0h_1 _rs-text_hardness_hard_tfgi0h_1' " +
                    "and text()='Python']")
    private WebElement pythonButton;

    @FindBy(xpath =
            "//div[@class='_rs-text-2_tfgi0h_1 _rs-typography_theme_dark_tfgi0h_1 _rs-text_hardness_hard_tfgi0h_1' " +
                    "and text()='C']")
    private WebElement cLangButton;

    @FindBy(xpath =
            "//div[@class='_rs-text-2_tfgi0h_1 _rs-typography_theme_dark_tfgi0h_1 _rs-text_hardness_hard_tfgi0h_1' " +
                    "and text()='R']")
    private WebElement rButton;

    @FindBy(xpath =
            "//div[@class='_rs-text-2_tfgi0h_1 _rs-typography_theme_dark_tfgi0h_1 _rs-text_hardness_hard_tfgi0h_1' " +
                    "and text()='SQL / databases']")
    private WebElement sqlButton;

    @FindBy(xpath =
            "//div[@class='_rs-text-2_tfgi0h_1 _rs-typography_theme_dark_tfgi0h_1 _rs-text_hardness_hard_tfgi0h_1' " +
                    "and text()='PHP']")
    private WebElement phpButton;

    @FindBy(xpath =
            "//div[@class='_rs-text-2_tfgi0h_1 _rs-typography_theme_dark_tfgi0h_1 _rs-text_hardness_hard_tfgi0h_1' " +
                    "and text()='Scala']")
    private WebElement scalaButton;

    @FindBy(xpath =
            "//div[@class='_rs-text-2_tfgi0h_1 _rs-typography_theme_dark_tfgi0h_1 _rs-text_hardness_hard_tfgi0h_1' " +
                    "and text()='Java']")
    private WebElement javaButton;

    @FindBy(xpath =
            "//div[@class='_rs-text-2_tfgi0h_1 _rs-typography_theme_dark_tfgi0h_1 _rs-text_hardness_hard_tfgi0h_1' " +
                    "and text()='Go']")
    private WebElement goButton;

    @FindBy(xpath =
            "//div[@class='_rs-text-2_tfgi0h_1 _rs-typography_theme_dark_tfgi0h_1 _rs-text_hardness_hard_tfgi0h_1' " +
                    "and text()='VB.NET']")
    private WebElement vbButton;

    @FindBy(xpath =
            "//div[@class='_rs-text-2_tfgi0h_1 _rs-typography_theme_dark_tfgi0h_1 _rs-text_hardness_hard_tfgi0h_1' " +
                    "and text()='TypeScript']")
    private WebElement typescriptButton;

    @FindBy(xpath =
            "//div[@class='_rs-text-2_tfgi0h_1 _rs-typography_theme_dark_tfgi0h_1 _rs-text_hardness_hard_tfgi0h_1' " +
                    "and text()='Kotlin']")
    private WebElement kotlinButton;

    @FindBy(xpath =
            "//div[@class='_rs-text-2_tfgi0h_1 _rs-typography_theme_dark_tfgi0h_1 _rs-text_hardness_hard_tfgi0h_1' " +
                    "and text()='F#']")
    private WebElement fButton;

    public AllIDEsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void acceptCookies() {
        driver.get("https://www.jetbrains.com/ides/");
        cookiesButton.click();
        LOG.info("Принимаем куки");
    }

    public void clickBusinessButton() {
        driver.get("https://www.jetbrains.com/ides/");
        businessButton.click();
        LOG.info("Перешли на вкладку бизнес-тарифов");
    }

    public void compareUrl() {
        String compareUrl = "https://www.jetbrains.com/business/";
        LOG.info("В поисковой строке url: " + compareUrl);
        assertEquals(compareUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void checkLearnMoreLink() {
        exploreOffersLink.click();
        String compareUrlExploreOffersLink = "https://www.jetbrains.com/store/?section=discounts";
        LOG.info("Кликнули по ссылке ExploreOffers. В поисковой строке url: " + compareUrlExploreOffersLink);
        assertEquals(compareUrlExploreOffersLink, driver.getCurrentUrl(), "url не совпадает");
    }

    public void clickLearnMoreLink() {
        learnMoreLink.click();
        String compareUrlLearnMoreLink = "https://www.jetbrains.com/startups/#startup-program";
        LOG.info("В поисковой строке url: " + compareUrlLearnMoreLink);
        assertEquals(compareUrlLearnMoreLink, driver.getCurrentUrl(), "url не совпадает");
    }

    public void javascriptButtonCheck() {
        javascriptButton.click();
        String javascriptUrl = "https://www.jetbrains.com/ides/?language=js";
        LOG.info("Кликнули по javascript");
        assertEquals(javascriptUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void sharpButtonCheck() {
        sharpButton.click();
        String sharpUrl = "https://www.jetbrains.com/ides/?language=csharp";
        LOG.info("Кликнули по C#");
        assertEquals(sharpUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void rustButtonCheck() {
        rustButton.click();
        String rustUrl = "https://www.jetbrains.com/ides/?language=rust";
        LOG.info("Кликнули по Rust");
        assertEquals(rustUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void htmlButtonCheck() {
        htmlButton.click();
        String htmlUrl = "https://www.jetbrains.com/ides/?language=html";
        LOG.info("Кликнули по HTML / CSS");
        assertEquals(htmlUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void cplusButtonCheck() {
        cplusButton.click();
        String cpluslUrl = "https://www.jetbrains.com/ides/?language=c%2B%2B";
        LOG.info("Кликнули по C++");
        assertEquals(cpluslUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void rubyButtonCheck() {
        rubyButton.click();
        String rubyUrl = "https://www.jetbrains.com/ides/?language=ruby";
        LOG.info("Кликнули по Ruby");
        assertEquals(rubyUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void pythonButtonCheck() {
        pythonButton.click();
        String pythonUrl = "https://www.jetbrains.com/ides/?language=python";
        LOG.info("Кликнули по Python");
        assertEquals(pythonUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void cLangButtonCheck() {
        cLangButton.click();
        String cLangUrl = "https://www.jetbrains.com/ides/?language=c";
        LOG.info("Кликнули по C");
        assertEquals(cLangUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void rButtonCheck() {
        rButton.click();
        String rUrl = "https://www.jetbrains.com/ides/?language=r";
        LOG.info("Кликнули по R");
        assertEquals(rUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void sqlButtonCheck() {
        sqlButton.click();
        String sqlUrl = "https://www.jetbrains.com/ides/?language=sql";
        LOG.info("Кликнули по SQL / databases");
        assertEquals(sqlUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void phpButtonCheck() {
        phpButton.click();
        String phpUrl = "https://www.jetbrains.com/ides/?language=php";
        LOG.info("Кликнули по PHP");
        assertEquals(phpUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void scalaButtonCheck() {
        scalaButton.click();
        String scalaUrl = "https://www.jetbrains.com/ides/?language=scala";
        LOG.info("Кликнули по Scala");
        assertEquals(scalaUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void javaButtonCheck() {
        javaButton.click();
        String javaUrl = "https://www.jetbrains.com/ides/?language=java";
        LOG.info("Кликнули по Java");
        assertEquals(javaUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void goButtonCheck() {
        goButton.click();
        String goUrl = "https://www.jetbrains.com/ides/?language=go";
        LOG.info("Кликнули по Go");
        assertEquals(goUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void vbButtonCheck() {
        vbButton.click();
        String vbUrl = "https://www.jetbrains.com/ides/?language=vbnet";
        LOG.info("Кликнули по VB.NET");
        assertEquals(vbUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void typescriptButtonCheck() {
        typescriptButton.click();
        String typescriptUrl = "https://www.jetbrains.com/ides/?language=typescript";
        LOG.info("Кликнули по TypeScript");
        assertEquals(typescriptUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void kotlinButtonCheck() {
        kotlinButton.click();
        String kotlinUrl = "https://www.jetbrains.com/ides/?language=kotlin";
        LOG.info("Кликнули по Kotlin");
        assertEquals(kotlinUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void fButtonCheck() {
        fButton.click();
        String fUrl = "https://www.jetbrains.com/ides/?language=fsharp";
        LOG.info("Кликнули по F#");
        assertEquals(fUrl, driver.getCurrentUrl(), "url не совпадает");
    }
}