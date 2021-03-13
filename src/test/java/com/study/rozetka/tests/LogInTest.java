package com.study.rozetka.tests;

import com.study.rozetka.pages.HomePage;
import com.study.rozetka.pages.ProfilePage;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class LogInTest extends BaseTest {

    @Test
    public void checkLoginToSite() throws UnsupportedEncodingException {
        HomePage homePage = new HomePage(driver);
        homePage.openPageAndCheckValidTitle();

        homePage.executeLogin("gudalcova@ukr.net", "Password1");

        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.openPageAndCheckValidTitle();

    }
}
