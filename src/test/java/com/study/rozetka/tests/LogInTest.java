package com.study.rozetka.tests;

import com.study.rozetka.pages.HomePage;
import com.study.rozetka.pages.ProfilePage;
import org.junit.Test;

public class LogInTest extends BaseTest {

    @Test
    public void checkLoginToSite() {
        HomePage homePage = new HomePage(driver);
        homePage.openPage();
        homePage.isPageTitleValid();

        homePage.executeLogin("gudalcova@ukr.net", "Password1");

        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.openPage();
        profilePage.isPageTitleValid();

    }
}
