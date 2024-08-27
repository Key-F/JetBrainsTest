package com.example.jetbrainstest.pages;


import com.example.jetbrainstest.AllureLogger;
import static com.example.jetbrainstest.MyWait.myWait;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;


public class RiderFlowPage {

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(RiderFlowPage.class));

    WebDriver driver;

    @FindBy(css = "div > nav > div:nth-child(1) > button")
    private WebElement riderFlowPage;

    @FindBy(xpath = "//span[contains(text(),'RiderFlow')][last()]")
    private WebElement developerToolsElement;

    @FindBy(xpath = "//button[@data-jetbrains-cookies-banner-action='ACCEPT_ALL']")
    private WebElement cookieAcceptButton;

    @FindBy(css = "a[href='/riderflow/download']:first-child")
    private WebElement downloadButton;

    @FindBy(xpath = "//h1[contains(text(),'RiderFlow for Unity')]")
    private WebElement contentRiderFlow;


    public String contentRiderFlow() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);

        myWait(5).visible(contentRiderFlow);
        return contentRiderFlow.getText();

    }

    public void clickElementDeveloperTools() {
        myWait(5).clickable(riderFlowPage);
        riderFlowPage.click();
        LOG.info("Нажатие на элемент DeveloperTools");
    }


    public void clickCookieAcceptButton() {
        cookieAcceptButton.click();
        LOG.info("Нажатие на кнопку Accept");
    }


    public void clickElementRiderFlow() {
        developerToolsElement.click();
        LOG.info("Нажатие на элемент RiderFlow");
    }


    public void clickDownloadButton() {
        downloadButton.click();
        LOG.info("Нажатие на кнопку Download");
    }

    public Boolean checkDownloadButton() {
        LOG.infoWithScreenshot("Проверка кнопки Download");
        return downloadButton.isEnabled();
    }

    public RiderFlowPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}