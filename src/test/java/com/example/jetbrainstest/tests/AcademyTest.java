package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.AcademyPage;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
@ExtendWith(AcademyExtension.class)
public class AcademyTest extends BaseTest {
    private AcademyPage academyPage;

    @BeforeEach
    @Override
    @Step("Тест ссылок на странице Академии: ")
    public void setUp() {
        super.setUp();
        driver.get("https://www.jetbrains.com/academy/");
        academyPage = new AcademyPage(driver);
    }

    @Test
    @DisplayName("Проверка перехода на страницу контактов после клика https://www.jetbrains.com/support/sales/#email-sales")
    public void buttonCheck() {
        academyPage.clickContactButton();
        assertEquals("https://www.jetbrains.com/support/sales/#email-sales", academyPage.getCurrUrl(), "Не перешли на https://www.jetbrains.com/support/sales/#email-sales");
    }

    @Test
    @DisplayName("Клик по кнопке Science")
    public void clickScienceButton() {
        academyPage.clickScienceButton();
        assertEquals("https://hyperskill.org/tracks?category=13", academyPage.getCurrUrl(), "Не перешли на https://hyperskill.org/tracks?category=13");
    }

    @Test
    @DisplayName("Ввод email,feedback и клик по кнопке Submit")
    public void enterEmailAndClickSubmit() {
        String testEmail = "testemail@maill.com";
        String testFeedBack = "Just checking, no need to reply to this post";
        academyPage.enterEmail(testEmail);
        academyPage.feedBack(testFeedBack);
        academyPage.clickSubmitButton();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean isMessageDisplayed = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//p[contains(text(),'Thanks for your request!')]"), "Thanks for your request!"));
        assertTrue(isMessageDisplayed, "Сообщение 'Thanks for your request!' не появилось.");
    }

    @Test
    @DisplayName("Клик по кнопке Python")
    public void clickPythonButton(){
        academyPage.clickPythonButton();
        assertEquals("https://academy.jetbrains.com/?tag=Python&_gl=1", academyPage.getCurrUrl(),"Не перешли на https://academy.jetbrains.com/?tag=Python&_gl");
        String pageText = academyPage.getPythontext();
        assertTrue(pageText.contains("Python"), "Текст 'Python' не найден на странице");
    }
    @Test
    @DisplayName("Клик по кнопке SQL")
    public void clickSqlButton(){
        academyPage.clickSqlButton();
        assertEquals("https://hyperskill.org/tracks?category=9&_gl=1", academyPage.getCurrUrl(),"Не перешли на https://hyperskill.org/tracks?category=9&_gl=1");
        String pageText = academyPage.getSqlText();
        assertTrue(pageText.contains("SQL and Databases"), "Текст 'SQL and Databases' не найден на странице");
    }
    @Test
    @DisplayName("Клик по кнопке Java")
    public void clickJavaButton() {
        academyPage.clickJavaButton();
        assertEquals("https://academy.jetbrains.com/?tag=Java&_gl=1", academyPage.getCurrUrl(), "Не перешли на https://academy.jetbrains.com/?tag=Java&_gl");
        String pageText = academyPage.getJavaText();
        assertTrue(pageText.contains("JAVA"), "Текст 'JAVA' не найден на странице");
    }
    @Test
    @DisplayName("Клик по кнопке Learn by doing")
    public void clickLeranBd(){
        academyPage.clickLearnBd();
        assertEquals("https://hyperskill.org/tracks?", academyPage.getCurrUrl(),"Не перешли на https://hyperskill.org/tracks?_gl=");
        String pageText = academyPage.getLearText();
        assertTrue(pageText.contains(" All tracks "),"Текст 'All tracks' не найден на странице");
    }
    @Test
    @DisplayName("Клик по кнопке The JetBrains Academy blog")
    public void clickAcademyblog(){
        academyPage.clickAcademyBlog();
        assertEquals("https://blog.jetbrains.com/education/",academyPage.getCurrUrl(),"Не перешли на https://blog.jetbrains.com/education");
        String pageText = academyPage.getBlogText();
        assertTrue(pageText.contains("The JetBrains Academy Blog"),"Текст 'The JetBrains Academy Blog' не найден на странице");
    }
    @Test
    @DisplayName("Клик по кнопке @JetBrains_Edu on X")
    public void twitterPageBlog(){
        academyPage.clickTwitter();
        assertEquals("https://twitter.com/JetBrains_Edu", academyPage.getCurrUrl(),"Не перешли в twitter");
    }
    @Test
    @DisplayName("Клик по кнопке Our bug and issue tracker")
    public void bugTracker(){
        academyPage.clickBugTracker();
        assertEquals("https://youtrack.jetbrains.com/issues?q=project:%20%7BEDU%7D&_gl=1/",academyPage.getCurrUrl(),"Не перешли в https://youtrack.jetbrains.com/");
    }




}

