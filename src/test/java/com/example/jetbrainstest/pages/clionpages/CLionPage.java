package com.example.jetbrainstest.pages.clionpages;

import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

import static com.example.jetbrainstest.MyWait.myWait;

import java.util.List;

//page url = https://www.jetbrains.com/clion/
public class CLionPage {

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(CLionPage.class));
    private final WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Download CLion')]")
    private WebElement downloadButton;

    @FindBy(css = "#js-menu-second-desktop a[href='/clion/whatsnew/']")
    private WebElement whatIsNewButton;

    @FindBy(css = "button[data-test='youtube-player-button']")
    private WebElement imgVideoButton;

    @FindBy(css = "iframe[title='CLion Quick Tour']")
    private WebElement videoIframe;

    @FindBy(css = "#player a[href^='https://www.youtube.com/watch']")
    private WebElement videoTitle;

    @FindBy(css = "[data-test='social-footer-menu-item'] a")
    private List<WebElement> followButtons;

    @FindBy(css = "[name='Email']")
    private WebElement emailInput;

    @FindBy(xpath = "//button[contains(text(), 'Submit')]")
    private WebElement emailSubmit;

    @FindBy(css = ".social-footer p:last-child")
    private WebElement messageAfterEnteringValidEmail;

    @FindBy(css = "[data-test='error-message']")
    private WebElement messageAfterEnteringInvalidEmail;

    @FindBy(css = "header [data-test='language-picker']")
    private WebElement languageButtonInTheHeader;

    @FindBy(css = "footer [data-test='language-picker']")
    private WebElement languageButtonInTheFooter;

    @FindBy(css = "div > span[data-test='list-item'] > span")
    private List<WebElement> listOfLanguages;

    @FindBy(css = "h2 + div img[alt='Code Analysis screenshot']")
    private List<WebElement> ScreenshotsInCodeAnalysisSection;

    @FindBy(css = "[data-jetbrains-cookies-banner-action='ACCEPT_ALL']")
    private WebElement acceptAllFromCookiesForm;

    public CLionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Integer getCountOfScreenshotsInCodeAnalysisSection() {
        return ScreenshotsInCodeAnalysisSection.size();
    }

    public void clickAcceptAllFromCookiesForm() {
        if (acceptAllFromCookiesForm.isDisplayed()) {
            LOG.info("Кликнуть 'Принять куки'");
            acceptAllFromCookiesForm.click();
        } else {
            LOG.info("Окно с куками не отобразилось");
        }
    }

    public Boolean checkIfDownloadButtonIsClickable() {
        LOG.info("Проверка активности кнопки загрузки");
        return downloadButton.isEnabled();
    }

    public void clickDownloadButton() {
        LOG.info("Переход на страницу загрузки");
        downloadButton.click();
    }

    public Boolean checkIfWhatIsNewButtonClickable() {
        LOG.info("Проверка активности кнопки 'what's new'");
        return whatIsNewButton.isEnabled();
    }

    public void switchOnIframe() {
        LOG.info("Переключение на frame с видео");
        imgVideoButton.click();
        driver.switchTo().frame(videoIframe);
    }

    public String getNameOfVideo() {
        switchOnIframe();
        LOG.infoWithScreenshot("Получение названия видео");
        return videoTitle.getText();
    }

    public Boolean checkIfFollowButtonsAreClickable(int num) {
        LOG.info("Получение активности кнопки из блока Follow Us");
        return followButtons.get(num).isEnabled();
    }

    public void enterEmail(String email) {
        LOG.info("Ввода email");
        emailInput.sendKeys(email);
        emailSubmit.click();
    }

    public String getAnswerAfterEnteringValidEmail(String email) {
        LOG.info("Получение сообщения при вводе валидного email");
        enterEmail(email);
        return messageAfterEnteringValidEmail.getText();
    }

    public String getWarningAfterEnteringInvalidEmail(String email) {
        LOG.info("Получение сообщения при вводе невалидного email");
        enterEmail(email);
        return messageAfterEnteringInvalidEmail.getText();
    }

    public void changeLanguage(String language) {
        LOG.infoWithScreenshot("Смена языка страницы на указанный");
        myWait(5).visible(languageButtonInTheHeader);
        languageButtonInTheHeader.click();
        for (WebElement i : listOfLanguages) {
            if (i.getText().equals(language)) {
                i.click();
                break;
            }
        }
    }
}
