package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.verifyRegisterPageText("Register");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homePage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        registerPage.verifyFirstNameRequiredErrorMessageText("First name is required.");
        registerPage.verifyLastNameRequiredErrorMessageText("Last name is required.");
        registerPage.verifyEmailRequiredErrorMessageText("Email is required.");
        registerPage.verifyPasswordRequiredErrorMessageText("Password is required.");
        registerPage.verifyConfirmPasswordErrorMessageText("Password is required.");
    }
    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.selectGender("Male");
        registerPage.enterFirstName("Munir");
        registerPage.enterLastName("Shah");
        registerPage.selectDateOfBirth("17","May","1985");
        registerPage.enterEmailId("munirshah79@gmail.com");
        registerPage.enterPassword("Asdfg909");
        registerPage.enterConfirmPassword("Asdfg909");
        registerPage.clickOnRegisterButton();
        registerPage.verifyRegistrationCompletedText("Your registration completed");
    }















}
