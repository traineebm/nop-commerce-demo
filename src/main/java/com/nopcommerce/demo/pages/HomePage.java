package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this); }

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(linkText = "Register")
    WebElement registerLink;

    @FindBy(linkText = "Computers ")
    WebElement computersTab;

    @FindBy(linkText = "Electronics ")
   WebElement electronicsTab;

    @FindBy(linkText = "Apparel ")
    WebElement apparelTab;

    @FindBy(linkText = "Digital downloads ")
    WebElement digitalDownloadsTab;

    @FindBy(linkText = "Books ")
    WebElement booksTab;

    @FindBy(linkText = "Jewelry ")
    WebElement jewelryTab;

    @FindBy(linkText = "Gift Cards ")
    WebElement giftCardsTab;

    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopCommerceLogo;

    @FindBy(linkText = "My account")
    WebElement myAccountLink;

    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutLink;

   // @FindBy(xpath = "//div[@class='header-menu']//li")
   // WebElement allTopMenuList;

    public void selectTopMenu(String menu) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//body/div[6]/div[2]/ul[1]"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void loginLinkDisplayed(){
        verifyThatElementIsDisplayed(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }

    public void clickOnLogoutLink() {
        clickOnElement(logOutLink);
    }

    public void logOutLinkIsDisplayed() {
        verifyThatElementIsDisplayed(logOutLink);
    }

    public void verifyThatNopCommerceLogoIsVisible() {
        verifyThatElementIsDisplayed(nopCommerceLogo);
    }
}
