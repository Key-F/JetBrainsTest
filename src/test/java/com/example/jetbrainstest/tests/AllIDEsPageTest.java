package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.NewExtension;
import com.example.jetbrainstest.pages.AllIDEsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(NewExtension.class)
public class AllIDEsPageTest extends BaseTest {

    private AllIDEsPage allIDEsPage;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        allIDEsPage = new AllIDEsPage(getDriver());
    }

    @Test
    @DisplayName("Проверка переключения на вкладку с бизнес-тарифами")
    public void businessButtonTest() {
        allIDEsPage.acceptCookies();
        allIDEsPage.clickBusinessButton();
        allIDEsPage.compareUrl();
    }

    @Test
    @DisplayName("Проверка кнопки Learn more")
    public void exploreOffersLinkTest() {
        allIDEsPage.acceptCookies();
        allIDEsPage.checkLearnMoreLink();
        allIDEsPage.clickLearnMoreLink();
    }

    @Test
    @DisplayName("Проверка кнопки javascript")
    public void javascriptButtonCheck() {
        allIDEsPage.acceptCookies();
        allIDEsPage.javascriptButtonCheck();
    }

    @Test
    @DisplayName("Проверка кнопки C#")
    public void sharpButtonCheck() {
        allIDEsPage.acceptCookies();
        allIDEsPage.sharpButtonCheck();
    }

    @Test
    @DisplayName("Проверка кнопки Rust")
    public void rustButtonCheck() {
        allIDEsPage.acceptCookies();
        allIDEsPage.rustButtonCheck();
    }

    @Test
    @DisplayName("Проверка кнопки HTML / CSS")
    public void htmlButtonCheck() {
        allIDEsPage.acceptCookies();
        allIDEsPage.htmlButtonCheck();
    }

    @Test
    @DisplayName("Проверка кнопки C++")
    public void cplusButtonCheck() {
        allIDEsPage.acceptCookies();
        allIDEsPage.cplusButtonCheck();
    }

    @Test
    @DisplayName("Проверка кнопки Ruby")
    public void rubyButtonCheck() {
        allIDEsPage.acceptCookies();
        allIDEsPage.rubyButtonCheck();
    }

    @Test
    @DisplayName("Проверка кнопки Python")
    public void pythonButtonCheck() {
        allIDEsPage.acceptCookies();
        allIDEsPage.pythonButtonCheck();
    }

    @Test
    @DisplayName("Проверка кнопки C")
    public void cLangButtonCheck() {
        allIDEsPage.acceptCookies();
        allIDEsPage.cLangButtonCheck();
    }

    @Test
    @DisplayName("Проверка кнопки R")
    public void rButtonCheck() {
        allIDEsPage.acceptCookies();
        allIDEsPage.rButtonCheck();
    }

    @Test
    @DisplayName("Проверка кнопки SQL / databases")
    public void sqlButtonCheck() {
        allIDEsPage.acceptCookies();
        allIDEsPage.sqlButtonCheck();
    }

    @Test
    @DisplayName("Проверка кнопки PHP")
    public void phpButtonCheck() {
        allIDEsPage.acceptCookies();
        allIDEsPage.phpButtonCheck();
    }

    @Test
    @DisplayName("Проверка кнопки Scala")
    public void scalaButtonCheck() {
        allIDEsPage.acceptCookies();
        allIDEsPage.scalaButtonCheck();
    }

    @Test
    @DisplayName("Проверка кнопки Java")
    public void javaButtonCheck() {
        allIDEsPage.acceptCookies();
        allIDEsPage.javaButtonCheck();
    }

    @Test
    @DisplayName("Проверка кнопки Go")
    public void goButtonCheck() {
        allIDEsPage.acceptCookies();
        allIDEsPage.goButtonCheck();
    }

    @Test
    @DisplayName("Проверка кнопки VB.NET")
    public void vbButtonCheck() {
        allIDEsPage.acceptCookies();
        allIDEsPage.vbButtonCheck();
    }

    @Test
    @DisplayName("Проверка кнопки TypeScript")
    public void typescriptButtonCheck() {
        allIDEsPage.acceptCookies();
        allIDEsPage.typescriptButtonCheck();
    }

    @Test
    @DisplayName("Проверка кнопки Kotlin")
    public void kotlinButtonCheck() {
        allIDEsPage.acceptCookies();
        allIDEsPage.kotlinButtonCheck();
    }

    @Test
    @DisplayName("Проверка кнопки F#")
    public void fButtonCheck() {
        allIDEsPage.acceptCookies();
        allIDEsPage.fButtonCheck();
    }
}