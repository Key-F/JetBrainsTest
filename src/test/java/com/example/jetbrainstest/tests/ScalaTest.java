package com.example.jetbrainstest.tests;


import com.example.jetbrainstest.AllureAttachmentsManager;
import com.example.jetbrainstest.MyExtension;

import com.example.jetbrainstest.pages.scalapages.ScalaJetBrainsMarketplacePage;
import com.example.jetbrainstest.pages.scalapages.ScalaOverviewPage;
import com.example.jetbrainstest.pages.scalapages.ScalaPage;
import com.example.jetbrainstest.pages.scalapages.ScalaReportIssuePages;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MyExtension.class)
public class ScalaTest extends BaseTest {
    private ScalaPage scalaPage;
    private ScalaReportIssuePages scalaReportIssuePages;
    private ScalaJetBrainsMarketplacePage scalaJetBrainsMarketplacePage;
    private ScalaOverviewPage scalaOverviewPage;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://plugins.jetbrains.com/plugin/1347-scala");
        scalaPage = new ScalaPage(getDriver());
        scalaReportIssuePages = new ScalaReportIssuePages(getDriver());
        scalaJetBrainsMarketplacePage = new ScalaJetBrainsMarketplacePage(getDriver());
        scalaOverviewPage = new ScalaOverviewPage(getDriver());
    }

    @Test
    @DisplayName("Проверка, что кнопка скачивания активна")
    public void buttonCheck() {
        AllureAttachmentsManager.screenshot();
        assertTrue(scalaPage.checkIfGetButtonIsClickable(), "Кнопка скачивания не активна");
    }

    @Test
    @DisplayName("Проверка наличия кнопки Show More")
    public void scalaPagefindButtonShowMore() {
        assertTrue(scalaPage.findButtonShowMore(), "кнопка" + "Show More" + "не найдена");
    }

    @Test
    @DisplayName("Проверка,что кнопка Report Issue активна")
    public void reportIssueCheck() {
        assertTrue(scalaReportIssuePages.checkIfReportIssueIsClickable(), "Кнопка скачивания не активна");
    }

    @Test
    @DisplayName("Проверка открытие страницы You Track после нажатия кнопки Report Issue")
    public void checkYouTrack() {
        scalaReportIssuePages.checkYouTrackclickable();
        assertTrue(scalaReportIssuePages.getTabUrl(driver).contains("https://youtrack.jetbrains.com/issues/SCL?_gl=1*"), "Не верная ссылка");
    }

    @Test
    @DisplayName("Проверка наличие ссылки Learn More ")
    public void checkLearnMore() {
        assertTrue(scalaReportIssuePages.learnMoreclick(), "Кнопка Learn More не найдена");
    }

    @Test
    @DisplayName("Проверка перехода на страницу JetBrains Marketplace при нажатие кнопки Learn More")
    public void openingJetBrainsMarketplace() {
        scalaJetBrainsMarketplacePage.checkMarketplace();
        assertTrue(scalaReportIssuePages.getTabUrl(driver).contains("https://plugins.jetbrains.com/docs/marketplace/reviews-policy.html"), "Не верная ссылка");
    }

    @Test
    @DisplayName("Проверка активности кнопки Start Selling Plugins")
    public void checkStartSellingPlugins() {
        assertTrue(scalaJetBrainsMarketplacePage.clickStartSellingPlugins(), "Кнопка Start Selling Plugins не активна");
    }

    @Test
    @DisplayName("Наличие кнопки nightly")
    public void scalaPageFindBattonNightly() {
        assertTrue(scalaPage.findButtonNightly(), "кнопка" + "nightly" + "не найдена");

    }
    @Test
    @DisplayName("Наличие кнопки EAP")
    public void scalaPageFindBattonEap() {
        assertTrue(scalaPage.findButtonEap(), "кнопка" + "EAP" + "не найдена");
    }
    @Test
    @DisplayName("Проверка наличия кнопки Stable")
    public void checkStable() {
        assertTrue(scalaPage.checkStable(), "Кнопка Stable не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Overview")
    public void checkOverview() {
        assertTrue(scalaOverviewPage.clickOverview(), "Кнопка Start Selling Plugins не активна");
    }
    @Test
    @DisplayName("Проверка активности кнопки Scala Bundle")
    public void checkScalaBundle() {
        assertTrue(scalaOverviewPage.clickScalaBundle(), "Кнопка Scala Bundle не активна");
    }
    @Test
    @DisplayName("Проверка открытие страницы Scala Bundle после нажатия кнопки Scala Bundle")
    public void openScalaBundle() {
        Assertions.assertEquals(scalaOverviewPage.checkScalaBundleclickable(),"https://plugins.jetbrains.com/bundles/2-scala-bundle", "Не верная ссылка");
    }
    @Test
    @DisplayName("Проверка активности кнопки Report Plugin")
    public void checkReportPlugin() {
        assertTrue(scalaOverviewPage.clickReportPlugin(), "Кнопка Scala Bundle не активна");
    }
    @Test
    @DisplayName("Проверка открытие страницы Log in to Marketplace после нажатия кнопки Report Plugin")
    public void checkReportPlugineclickable() {
        scalaOverviewPage.checkReportPlugineclickable();
        assertTrue(scalaReportIssuePages.getCurrentUrl().contains("https://hub.jetbrains.com/auth/login?response"), "Не верная ссылка");
    }
    @Test
    @DisplayName("Проверка наличия кнопки Show All Reviews")
    public void checkShowAllReviews() {
        assertTrue(scalaOverviewPage.findButtonShowAllReviews(), "Кнопка Show All Reviews не активна");
    }
    @Test
    @DisplayName("Переход на страницу Reviews, после нажатия кнопки Show All Reviews")
    public void openReviewsShowAllReviewsClickable() {
        Assertions.assertEquals(scalaOverviewPage.clickShowAllReviews(),"https://plugins.jetbrains.com/plugin/1347-scala/reviews", "Не верная ссылка");
    }
    @Test
    @DisplayName("Наличие ссылки Blog")
    public void CheckFindUrlBlog(){
        assertTrue(scalaOverviewPage.findUrlBlog(), "Ссылка Blog отсутствует");
    }
    @Test
    @DisplayName("Переход на страницу Blog")
    public void openBlogClickable() {
        scalaOverviewPage.checkBlog();
        assertTrue(scalaReportIssuePages.getTabUrl(driver).contains("https://blog.jetbrains.com/scala/"), "Не верная ссылка");
    }

    @Test
    @DisplayName("Наличие ссылки Twitter")
    public void CheckFindUrlTwitter(){
        assertTrue(scalaOverviewPage.findUrlTwitter(), "Ссылка Twitter отсутствует");
    }

}


