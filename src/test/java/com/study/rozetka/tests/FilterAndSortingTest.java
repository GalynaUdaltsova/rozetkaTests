package com.study.rozetka.tests;

import com.study.rozetka.pages.HomePage;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

import static java.nio.charset.StandardCharsets.*;

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

//    @Test
//    public void someTest() {
//        java.lang.String title = "Р†РЅС‚РµСЂРЅРµС‚-РјР°РіР°Р·РёРЅ ROZETKAв„ў: РѕС„С–С†С–Р№РЅРёР№ СЃР°Р№С‚ РЅР°Р№РїРѕРїСѓР»СЏСЂРЅС–С€РѕРіРѕ РѕРЅР»Р°Р№РЅ-РіС–РїРµСЂРјР°СЂРєРµС‚Сѓ РІ РЈРєСЂР°С—РЅС–";
//        byte[] bytes = HOME_PAGE_TITLE.getBytes(UTF_8);
//        String s = new String(bytes);
//        System.out.println(s);
//    }

    @Test
    public void checkSorting() {
        HomePage homePage = new HomePage(driver);
        homePage.openPageAndCheckValidTitle();

        homePage.checkSortingFromExpensiveToCheap("IPhone 11");
    }
}


