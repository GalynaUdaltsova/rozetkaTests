package com.study.rozetka.tests;

import com.study.rozetka.pages.HomePage;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

import static java.nio.charset.StandardCharsets.UTF_8;

public class FilterAndSortingTest extends BaseTest {
    private static final String HOME_PAGE_TITLE = "Інтернет-магазин ROZETKA™: офіційний сайт найпопулярнішого " +
            "онлайн-гіпермаркету в Україні";
    @Test
    public void checkFilter() {
        HomePage homePage = new HomePage(driver);
        homePage.openPageAndCheckValidTitle();

        homePage.checkFilterMobilePhone("IPhone 11");
        homePage.checkFilterReadyToShip();
    }

    @Test
    public void checkSorting() {
        HomePage homePage = new HomePage(driver);
        homePage.openPageAndCheckValidTitle();

        homePage.checkSortingFromExpensiveToCheap("IPhone 11");
    }
}


