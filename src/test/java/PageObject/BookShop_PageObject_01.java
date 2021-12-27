package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookShop_PageObject_01 extends PageObject{

    @FindBy(xpath = "//a[contains(text(),'লেখক')]")
    public WebElement writer;

    @FindBy(xpath = "//body/div[@id='wrapper']/main[@id='main']/div[1]/div[2]/div[1]/div[2]/div[1]")
    public WebElement humayanAhmed;

    @FindBy(xpath = "//body/div[@id='wrapper']/main[@id='main']/div[1]/div[1]/div[1]/aside[2]/form[1]/select[1]")
    public WebElement selectHumayan;

    @FindBy(xpath = "//body/div[@id='wrapper']/main[@id='main']/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
    public WebElement book1;

    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    public WebElement addToCartButton;

    @FindBy(xpath = "(//span[contains(text(),'Confirm Order')])[1]")
    public WebElement confirmOrderButton;


    @FindBy(xpath = "//input[@id='billing_first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='billing_last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//select[@id='billing_country']")
    public WebElement country;

    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement street;

    @FindBy(xpath = "//input[@id='billing_city']")
    public WebElement townCity;

    @FindBy(xpath = "//select[@id='billing_state']")
    public WebElement district;

    @FindBy(xpath = "//input[@id='billing_postcode']")
    public WebElement postalCode;

    @FindBy(xpath = "//input[@id='billing_phone']")
    public WebElement mobile;

    @FindBy(xpath = "//input[@id='billing_email']")
    public WebElement email;

    @FindBy(xpath = "//textarea[@id='order_comments']")
    public WebElement notes;

    @FindBy(xpath = "//button[@id='place_order']")
    public WebElement placeOrderButton;







    public BookShop_PageObject_01(WebDriver driver) {
        super(driver);
    }
}
