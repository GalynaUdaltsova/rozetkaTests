package waiters;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Waiter {
    public static void wait(WebDriver driver, long timeOutInSeconds) {
        driver.manage().timeouts().implicitlyWait(timeOutInSeconds, TimeUnit.SECONDS);
    }
}
