package com.example.jetbrainstest.pages.decompilerpage;

import com.example.jetbrainstest.AllureLoggerCustom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;


// page_url = https://www.jetbrains.com/decompiler/
public class DecompilerTeamsPage {

    private final AllureLoggerCustom LOG = new AllureLoggerCustom(LoggerFactory.getLogger(DecompilerPage.class));
    WebDriver driver;


    @FindBy(xpath = "//a[aria-label='Close cookies banner']")
    private WebElement closeCookiesBannerTeam;

    @FindBy(xpath = "//a[@type='button'][normalize-space()='Buy dotUltimate']")
    private WebElement buyDotUltimateTeam;

    @FindBy(xpath = " //a[normalize-space()='Our Commitment' and contains(@class, 'menu-item')]")
    private WebElement ourCommitmentTeam;

    public String OurCommitmentTeamTeansition() {
        LOG.info("Перход в раздел OurCommitment");
        ourCommitmentTeam.click();
        return getUrl();
    }


    public String BuyDotUltimateTeamTransition() {
        LOG.info("Перход в раздел BuyDotUltimate");
        buyDotUltimateTeam.click();
        return getUrl();
    }

    public String CloseCookiesBannerTeam() {
        LOG.info("Closing cookies banner");
        closeCookiesBannerTeam.click();
        return getUrl();
    }

    public DecompilerTeamsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getUrl() {
        String url = driver.getCurrentUrl();
        LOG.info("Текущий адрес URL: " + url);
        return url;
    }

}
