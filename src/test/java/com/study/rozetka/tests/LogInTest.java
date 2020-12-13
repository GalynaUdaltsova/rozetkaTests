package com.study.rozetka.tests;

import com.study.rozetka.pages.HomePage;
import com.study.rozetka.pages.ProfilePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class LogInTest extends BaseTest {

    private static final int DEFAULT_TIMEOUT = 10;

    @Test
    public void logIn() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        Assert.assertEquals(true, homePage.isPageValid());

        homePage.clickElementByAndWait(By.xpath("//button[@class='header-topline__user-link button--link']"),
                DEFAULT_TIMEOUT);
        homePage.findElementBy(By.xpath("//*[@id='auth_email']")).sendKeys("gudalcova@ukr.net");
        homePage.findElementBy(By.xpath("//*[@id='auth_pass']")).sendKeys("Password1");
        homePage.clickElementByAndWait(By.xpath("//button[@class='button button--large button--green " +
                "auth-modal__submit']"), DEFAULT_TIMEOUT);
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.open();
        profilePage.isPageValid();
    }
}
