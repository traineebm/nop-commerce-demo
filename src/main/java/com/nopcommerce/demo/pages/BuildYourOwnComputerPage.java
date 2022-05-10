package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerText;

    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;

    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;

    @FindBy(xpath = "//input[@name='product_attribute_3']")
    WebElement selectHdd;

    @FindBy(xpath = "//input[@name= 'product_attribute_4']")
    WebElement selectOperatingSystem;

    @FindBy(xpath = "//input[@name= 'product_attribute_5']")
    WebElement selectSoftware;

    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;

    @FindBy(xpath = "//p[contains(.,'The product has been added to your shopping cart')]")
    WebElement productAddedToCartText;


    public void verifyBuildYourOwnComputerText() {
        verifyThatTextIsDisplayed(buildYourOwnComputerText, "Build your own computer");
    }

    public void selectProcessorFromDropDown(String processor) {
        selectByVisibleTextFromDropDown(selectProcessor, processor);
    }

    public void selectRAMFromDropDown(String ram) {
        selectByVisibleTextFromDropDown(selectRam, ram);
    }

    public void selectHDDRadioButton(String hdd) {
        clickOnElement(selectHdd);
    }

    public void selectOSRadioButton(String os) {
        clickOnElement(selectOperatingSystem);
    }

    public void selectSoftwareCheckBox(String software) {
        clickOnElement(selectSoftware);
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }

    public void verifyProductAddedToCartText(String text) {
        verifyThatTextIsDisplayed(productAddedToCartText, "The product has been added to your shopping cart");
    }

    public void selectPartsAndBuildYourOwnComputer(String processor, String ram, String hdd, String os, String software) {
        selectProcessorFromDropDown(processor);
        selectRAMFromDropDown(ram);
        selectHDDRadioButton(hdd);
        selectOSRadioButton(os);
        selectSoftwareCheckBox(software);
    }

}
