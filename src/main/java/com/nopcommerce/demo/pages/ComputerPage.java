package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {

    public ComputerPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersText;

    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    WebElement desktopPageLink;

    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Notebooks']")
    WebElement notebooksPageLink;

    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Software']")
    WebElement softwarePageLink;


    public void verifyComputersText(String text) {
        verifyThatTextIsDisplayed(computersText,text);
    }
    public void clickOnDesktopLink(){
        clickOnElement(desktopPageLink);
    }

    public void clickOnNotebookLink(){
        clickOnElement(notebooksPageLink);
    }
    public void clickOnSoftwareLink(){
        clickOnElement(softwarePageLink);
    }
}
