package com.study.rozetka.tests;

import com.study.rozetka.pages.HomePage;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class FilterAndSortingTest extends BaseTest {

    @Test
    public void checkFilter() throws UnsupportedEncodingException {
        HomePage homePage = new HomePage(driver);
        homePage.openPageAndCheckValidTitle();

        homePage.checkFilterMobilePhone("IPhone 11");
        homePage.checkFilterReadyToShip();
    }

    @Test
    public void checkSorting() throws UnsupportedEncodingException {
        HomePage homePage = new HomePage(driver);
        homePage.openPageAndCheckValidTitle();

        homePage.checkSortingFromExpensiveToCheap("IPhone 11");
    }
}


