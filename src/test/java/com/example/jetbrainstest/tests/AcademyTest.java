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
        String pageText = academyPage.getText();
        assertTrue(pageText.contains("Python"), "Текст 'Python' не найден на странице");
    }
    @Test
    @DisplayName("Клик по кнопке SQL")
    public void clickSqlButton(){
        academyPage.clickSqlButton();
        assertEquals("https://hyperskill.org/tracks?category=9&_gl=1", academyPage.getCurrUrl(),"Не перешли на https://hyperskill.org/tracks?category=9&_gl=1");
        String pageText = academyPage.getText();
        assertTrue(pageText.contains("SQL and Databases"), "Текст 'SQL and Databases' не найден на странице");
    }
    @Test
    @DisplayName("Клик по кнопке Java")
    public void clickJavaButton() {
        academyPage.clickJavaButton();
        assertEquals("https://academy.jetbrains.com/?tag=Java&_gl=1", academyPage.getCurrUrl(), "Не перешли на https://academy.jetbrains.com/?tag=Java&_gl");
        String pageText = academyPage.getText();
        assertTrue(pageText.contains("JAVA"), "Текст 'JAVA' не найден на странице");
    }
    @Test
    @DisplayName("Клик по кнопке Learn by doing")
    public void clickLeranBdButton(){
        academyPage.clickLearnBd();
        assertEquals("https://hyperskill.org/tracks?", academyPage.getCurrUrl(),"Не перешли на https://hyperskill.org/tracks?_gl=");
        String pageText = academyPage.getText();
        assertTrue(pageText.contains(" All tracks "),"Текст 'All tracks' не найден на странице");
    }
    @Test
    @DisplayName("Клик по кнопке The JetBrains Academy blog")
    public void clickAcademyblogButton(){
        academyPage.clickAcademyBlog();
        assertEquals("https://blog.jetbrains.com/education/",academyPage.getCurrUrl(),"Не перешли на https://blog.jetbrains.com/education");
        String pageText = academyPage.getText();
        assertTrue(pageText.contains("The JetBrains Academy Blog"),"Текст 'The JetBrains Academy Blog' не найден на странице");
    }
    @Test
    @DisplayName("Клик по кнопке @JetBrains_Edu on X")
    public void twitterPageBlogButton(){
        academyPage.clickTwitter();
        assertEquals("https://twitter.com/JetBrains_Edu", academyPage.getCurrUrl(),"Не перешли в twitter");
    }
    @Test
    @DisplayName("Клик по кнопке Our bug and issue tracker")
    public void bugTrackerButton(){
        academyPage.clickBugTracker();
        assertEquals("https://youtrack.jetbrains.com/issues?q=project:%20%7BEDU%7D&_gl=1/",academyPage.getCurrUrl(),"Не перешли в https://youtrack.jetbrains.com/");
    }
    @Test
    @DisplayName("Клик по кнопке Machine learning")
    public void machineLearningButton(){
        academyPage.clickMachineLearning();
        assertEquals("https://hyperskill.org/tracks/42?category=13&_gl=1",academyPage.getCurrUrl(),"Не перешли в Machine learning");
        String pageTest = academyPage.getText();
        assertTrue(pageTest.contains("Machine Learning Algorithms from Scratch"),"Текст Machine Learning Algorithms from Scratch не найден на странице");
    }
    @Test
    @DisplayName("Клик по кнопке Web development")
    public void webDevelopmentButton(){
        academyPage.clickWebDevelopmentButton();
        assertEquals("erskill.org/tracks/29?category=1",academyPage.getCurrUrl(),"Не перешли в Web development");
        String pageTest = academyPage.getText();
        assertTrue(pageTest.contains("Python Backend Developer with Flask"),"Текст Python Backend Developer with Flask не найден на странице");
    }
    @Test
    @DisplayName("Клик по кнопке Frontend development")
    public void clickFrontenddevelopmentButton(){
        academyPage.clickFrontenddevelopmentButton();
        assertEquals("https://hyperskill.org/tracks?category=11",academyPage.getCurrUrl(),"Не перешли в Frontend development");
        String pageTest = academyPage.getText();
        assertTrue(pageTest.contains(" Frontend "),"Текст  Frontend  не найден на странице");
    }
    @Test
    @DisplayName("Клик по кнопке Flask")
    public void clickFlaskButton(){
        academyPage.clickFlaskButton();
        assertEquals("https://hyperskill.org/tracks/29?category=8",academyPage.getCurrUrl(),"Не перешли в Flask");
        String pageTest = academyPage.getText();
        assertTrue(pageTest.contains("Python Backend Developer with Flask"),"Текст Flask не найден на странице");
    }
    @Test
    @DisplayName("Клик по кнопке JetBrains Privacy Policy")
    public void clickPrivacyPolicy(){
        academyPage.clickPrivacyPolicy();
        assertEquals("https://www.jetbrains.com/legal/docs/privacy/privacy/",academyPage.getCurrUrl(),"Не перешли в Privacy Policy");
        String pageTest = academyPage.getText();
        assertTrue(pageTest.contains("JetBrains Privacy Policy"),"JetBrains Privacy Policy");
    }
    @Test
    @DisplayName("Клик по кнопке third-party services")
    public void clickThirdParty(){
        academyPage.clickThirdParty();
        assertEquals("https://www.jetbrains.com/legal/docs/privacy/third-parties/",academyPage.getCurrUrl(),"Не перешли в third-party services ");
    }
    @Test
    @DisplayName("Клик по кнопке Study in an IDE")
    public void clickStudyIDE(){
        academyPage.clickStudyIDE();
        assertEquals("https://plugins.jetbrains.com/education",academyPage.getCurrUrl(),"Не перешли в Study in an IDE");
    }
    @Test
    @DisplayName("Клик по кнопке Educate others")
    public void clickEducate(){
        academyPage.clickEducate();
        assertEquals("https://www.jetbrains.com/pages/academy/teaching/",academyPage.getCurrUrl(),"Не перешли в Educate");
    }
    @Test
    @DisplayName("Клик по кнопке Study Offline")
    public void clickStudyOffline(){
        academyPage.clickStudyOffline();
        assertEquals("https://www.jetbrains.com/education/university-relations/",academyPage.getCurrUrl(),"Не перешли на страницу Study Offline");
    }
    @Test
    @DisplayName("Клик по кнопке Read the full interview")
    public void clickInterview(){
        academyPage.clickInterviewButton();
        assertEquals("https://blog.jetbrains.com/education/2021/06/08/joviane-bellegarde-compliments-her-university-studies-with-jetbrains-academy/",academyPage.getCurrUrl(),"Не перешли на страницу с интервью");
    }


}

