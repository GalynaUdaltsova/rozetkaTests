package com.study.rozetka.pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class ContactsPage extends BasePage {

    public static final String CONTACTS_PAGE_URL = "https://rozetka.com.ua/contacts/";
    public static final String CONTACTS_PAGE_TITLE = "Контактна інформація | ROZETKA";


    public ContactsPage(ChromeDriver driver) {
        super(driver, CONTACTS_PAGE_URL, CONTACTS_PAGE_TITLE);
    }

    public void checkContactsDeliveryType() {
        

    }
}

