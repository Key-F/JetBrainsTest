package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.WriterSidePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WriterSideTest extends BaseTest {

    private WriterSidePage writerSidePage;

    private static final String WRITERSIDE_URL = "https://www.jetbrains.com/writerside/";

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get(WRITERSIDE_URL);
        writerSidePage = new WriterSidePage(getDriver());
        writerSidePage.acceptCookies();
    }

    @Test
    @DisplayName("Check if Download button is active")
    public void testDownloadButtonIsActive() {
        assertTrue(writerSidePage.isDownloadButtonEnabled(), "Download button is not enabled");
    }

    @Test
    @DisplayName("Check if Pricing button is enabled")
    public void testPricingButtonIsEnabled() {
        assertTrue(writerSidePage.isPricingButtonEnabled(), "Pricing button is not enabled");
    }
}
