package TestCases;

import BasicPackage.DriverSetUp;
import PageObject.BookShop_PageObject_01;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BookShop_TestCase_01 extends DriverSetUp {

    public static String baseUrl = "https://bookshopbd.com/";

    @Test
    public static void cartABook() throws InterruptedException {

        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Thread.sleep(10000);

        BookShop_PageObject_01 aBookShop_PageObject_01 = new BookShop_PageObject_01(driver);

        aBookShop_PageObject_01.writer.click();
        Thread.sleep(5000);

        aBookShop_PageObject_01.humayanAhmed.click();
        Thread.sleep(3000);

        //Selecting Items in a Multiple SELECT elements

        Select selectHumayan = new Select(aBookShop_PageObject_01.selectHumayan);
        selectHumayan.selectByVisibleText("হুমায়ূন আহমেদ");
//        fruits.selectByIndex(2);
        Thread.sleep(5000);

        aBookShop_PageObject_01.book1.click();
        Thread.sleep(5000);

        aBookShop_PageObject_01.addToCartButton.click();
        Thread.sleep(4000);

        aBookShop_PageObject_01.confirmOrderButton.click();
        Thread.sleep(4000);

        aBookShop_PageObject_01.firstName.sendKeys("Filips");
        Thread.sleep(4000);

        aBookShop_PageObject_01.lastName.sendKeys("Dan");
        Thread.sleep(4000);

        //Selecting Items in a Multiple SELECT elements
        Select country = new Select(aBookShop_PageObject_01.country);
        country.selectByVisibleText("Bangladesh");
//        fruits.selectByIndex(1);
        Thread.sleep(4000);

        aBookShop_PageObject_01.street.sendKeys("Nilam");
        Thread.sleep(4000);

        aBookShop_PageObject_01.townCity.sendKeys("Dhaka");
        Thread.sleep(4000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)", "");

        //Selecting Items in a Multiple SELECT elements
        Select district = new Select(aBookShop_PageObject_01.district);
        district.selectByVisibleText("Dhaka");
//        district.selectByIndex(1);
        Thread.sleep(4000);

        aBookShop_PageObject_01.postalCode.sendKeys("1009");
        Thread.sleep(4000);

        aBookShop_PageObject_01.mobile.sendKeys("01720000000");
        Thread.sleep(4000);


        aBookShop_PageObject_01.email.sendKeys("mnop@gmail.com");
        Thread.sleep(4000);

        aBookShop_PageObject_01.notes.sendKeys("hlw");
        Thread.sleep(4000);

//        aBookShop_PageObject_01.placeOrderButton.click();
//        Thread.sleep(15000);




    }
}
