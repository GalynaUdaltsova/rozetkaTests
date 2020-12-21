package com.study.rozetka.tests;

import com.study.rozetka.pages.HomePage;
import org.junit.Test;

public class FilterAndSortingTest extends BaseTest {

    @Test
    public void checkFilter() {
        HomePage homePage = new HomePage(driver);
        homePage.openPage();

        homePage.isPageTitleValid();
        homePage.checkFilterMobilePhone("IPhone 11");
        homePage.checkFilterReadyToShip();
    }

    @Test
    public void checkSorting() {
        HomePage homePage = new HomePage(driver);
        homePage.openPage();

        homePage.isPageTitleValid();
        homePage.checkSortingFromExpensiveToCheap("IPhone 11");
    }
}


