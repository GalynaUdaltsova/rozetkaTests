package com.study.rozetka.tests;

import com.study.rozetka.pages.HomePage;
import com.study.rozetka.pages.Locators;
import com.study.rozetka.pages.ProfilePage;
import org.junit.Assert;
import org.junit.Test;

public class LogInTest extends BaseTest {

    private static final int DEFAULT_TIMEOUT = 10;

    @Test
    public void logIn() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        Assert.assertEquals(true, homePage.isPageValid());

        homePage.clickElement(Locators.Login.buttonLogInXPath, DEFAULT_TIMEOUT);
        homePage.findElementBy(Locators.Login.inputLogIn).sendKeys("gudalcova@ukr.net");
        homePage.findElementBy(Locators.Login.inputPassword).sendKeys("Password1");
        homePage.clickElement(Locators.Login.buttonSubmitLogIn, DEFAULT_TIMEOUT);

        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.open();
        profilePage.isPageValid();
    }
}
