package com.study.rozetka.tests;

import com.study.rozetka.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchAndFilterTest extends BaseTest {

    private static final int DEFAULT_TIMEOUT = 10;

    @Test
    public void searchAndFilter() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        Assert.assertEquals(true, homePage.isPageValid());

        WebElement search = homePage.findElementBy(By.xpath("//input[@class='search-form__input " +
                "ng-untouched ng-pristine ng-valid']"));
        search.sendKeys("IPhone 11");
        search.click();

        homePage.clickElementByAndWait(By.xpath("//button[@class='button button_color_green button_size_medium " +
                "search-form__submit']"), DEFAULT_TIMEOUT);
        homePage.clickElementByAndWait(By.xpath("//span[text()='Мобильные телефоны']"), DEFAULT_TIMEOUT);
        homePage.clickElementByAndWait(By.xpath("//label[contains(text(),'Готов к отправке')]"), DEFAULT_TIMEOUT);
        homePage.clickElementByAndWait(By.xpath("//option[text()=' От дорогих к дешевым ']"), DEFAULT_TIMEOUT);
    }
}


