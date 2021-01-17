package com.study.rozetka.tests;

import com.study.rozetka.pages.ContactsPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactsTest extends BaseTest {

    @Test
    public void checkSelectionDeliveryType() {
        ContactsPage contactsPage = new ContactsPage(driver);
        contactsPage.openPageAndCheckValidTitle();
        contactsPage.checkContactsDeliveryType();
    }
}
