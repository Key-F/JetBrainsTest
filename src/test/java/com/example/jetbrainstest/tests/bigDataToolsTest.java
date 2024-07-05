package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.bigDataToolsPage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

    public class bigDataToolsTest extends BaseTest{
        private bigDataToolsPage bigDataToolsPage;

        @BeforeEach
        @Override
        public void setUp() {
            super.setUp();
            getDriver().get("https://plugins.jetbrains.com/plugin/12494-big-data-tools");
            bigDataToolsPage = new bigDataToolsPage(getDriver());
        }

        @Test
        @DisplayName("Проверка, что кнопка скачивания активна")
        public void buttonCheck() {
            assertTrue(bigDataToolsPage.checkIfGetButtonIsClickable(), "Кнопка скачивания не активна");
        }
    }
