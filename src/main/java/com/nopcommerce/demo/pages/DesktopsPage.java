package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {

    public DesktopsPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopText;

    @FindBy(xpath ="//select[@id='products-orderby']")
    WebElement sortBy;

    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement displayBy;

    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement selectProductList;

    @FindBy(xpath = "//div[@class='picture']")
    WebElement selectProductFromDesktopPage;

    public void verifyDesktopText(String text){
        verifyThatTextIsDisplayed(desktopText, text);
    }
    public void clickOnSortBy(){
        clickOnElement(sortBy);
    }
    public void clickOnDisplayByProduct(){
        clickOnElement(displayBy);
    }
    public void clickOnProductFromList(){
        clickOnElement(selectProductList);
    }
    public void selectProductFromDesktopPage(String product) {
        clickOnElement(selectProductFromDesktopPage);
    }




}
