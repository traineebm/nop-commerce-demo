package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerPageText;

    @FindBy(xpath = "//div[@id='gender']")
    WebElement genderRadioButton;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameBox;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameBox;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailBox;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordBox;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordBox;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompletedText;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;

    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameRequiredErrorText;

    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameRequiredErrorText;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirthDay;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthOfBirthMonth;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearOfBirthYear;

    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailRequiredErrorText;

    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordRequiredErrorText;

    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordRequiredErrorText;

    public void verifyRegisterPageText(String text) {
        verifyThatTextIsDisplayed(registerPageText, text);
    }

    public void selectGender(String text) {
        clickOnElement(genderRadioButton);
    }

    public void enterFirstName(String name) {
        sendTextToElement(firstNameBox, name);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastNameBox, lastname);
    }

    public void selectDateOfBirth(String day, String month, String year) {
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);
        selectByVisibleTextFromDropDown(monthOfBirthMonth, month);
        selectByVisibleTextFromDropDown(yearOfBirthYear, year);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailBox, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordBox, password);
    }

    public void enterConfirmPassword(String confirmpassword) {
        sendTextToElement(confirmPasswordBox, confirmpassword);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public void verifyRegistrationCompletedText(String text) {
        verifyThatTextIsDisplayed(registrationCompletedText, text);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void verifyFirstNameRequiredErrorMessageText(String text) {
        verifyThatTextIsDisplayed(firstNameRequiredErrorText, text);
    }

    public void verifyLastNameRequiredErrorMessageText(String text) {
        verifyThatTextIsDisplayed(lastNameRequiredErrorText, text);
    }

    public void verifyEmailRequiredErrorMessageText(String text) {
        verifyThatTextIsDisplayed(emailRequiredErrorText, text);
    }

    public void verifyPasswordRequiredErrorMessageText(String text) {
        verifyThatTextIsDisplayed(passwordRequiredErrorText, text);
    }

    public void verifyConfirmPasswordErrorMessageText(String text) {
        verifyThatTextIsDisplayed(confirmPasswordRequiredErrorText, text);
    }
}
