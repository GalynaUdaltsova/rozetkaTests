package com.study.rozetka.tests;

import com.study.rozetka.pages.HomePage;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

import static java.nio.charset.StandardCharsets.UTF_8;

public class FilterAndSortingTest extends BaseTest {
    private static final String HOME_PAGE_TITLE = "Інтернет-магазин ROZETKA™: офіційний сайт найпопулярнішого " +
            "онлайн-гіпермаркету в Україні";
    @Test
    public void checkFilter() throws UnsupportedEncodingException {
        HomePage homePage = new HomePage(driver);
        homePage.openPageAndCheckValidTitle();

        homePage.checkFilterMobilePhone("IPhone 11");
        homePage.checkFilterReadyToShip();
    }

    @Test
    public void testMethod() throws UnsupportedEncodingException {
        byte[] ptext = HOME_PAGE_TITLE.getBytes();
        String value = new String(ptext, UTF_8);
        System.out.println(value);
    }

    @Test
    public void checkSorting() throws UnsupportedEncodingException {
        HomePage homePage = new HomePage(driver);
        homePage.openPageAndCheckValidTitle();

        homePage.checkSortingFromExpensiveToCheap("IPhone 11");
    }
}


