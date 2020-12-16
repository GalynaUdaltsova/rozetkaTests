package com.study.rozetka.tests;

import com.study.rozetka.pages.HomePage;
import com.study.rozetka.pages.Locators;
import org.junit.Assert;
import org.junit.Test;

public class SearchAndFilterTest extends BaseTest {

    private static final int DEFAULT_TIMEOUT = 10;

    @Test
    public void searchAndFilter() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        Assert.assertEquals(true, homePage.isPageValid());

        homePage.findElementBy(Locators.Homepage.inputSearch).sendKeys("IPhone 11");
        homePage.clickElement(Locators.Homepage.buttonSubmitSearch, DEFAULT_TIMEOUT);
        homePage.clickElement(Locators.Homepage.inputItemInSearch, DEFAULT_TIMEOUT);
        homePage.clickElement(Locators.Homepage.filterReadyToShip, DEFAULT_TIMEOUT);
        homePage.clickElement(Locators.Homepage.sortingFromExpensiveToCheap, DEFAULT_TIMEOUT);
    }
}


