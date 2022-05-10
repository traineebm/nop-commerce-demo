package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

    @Listeners(CustomListeners.class)
    public class LoginPageTest extends TestBase {

        HomePage homePage;
        LoginPage loginPage;

        @BeforeMethod(alwaysRun = true)
        public void inIt() {
            homePage = new HomePage();
            loginPage = new LoginPage();
        }

        @Test(groups = {"sanity", "smoke", "regression"})
        public void userShouldNavigateToLoginPageSuccessFully() {
            homePage.clickOnLoginLink();
            loginPage.verifyWelcomeText("Welcome, Please Sign In!");
        }

        @Test(groups = {"smoke", "regression"})
        public void verifyTheErrorMessageWithInValidCredentials() {
            homePage.clickOnLoginLink();
            loginPage.enterEmailId("xyz@gmail.com");
            loginPage.enterPassword("Asdfg909");
            loginPage.clickOnLoginButton();
            loginPage.verifyErrorMessage("Login was unsuccessful. " +
                    "Please correct the errors and try again.");
        }

        @Test(groups = {"regression"})
        public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
            homePage.clickOnLoginLink();
            loginPage.enterEmailId("munirshah090@gmail.com");
            loginPage.enterPassword("Asdfg909");
            loginPage.clickOnLoginButton();
            homePage.logOutLinkIsDisplayed();
        }

        @Test(groups = {"regression"})
        public void VerifyThatUserShouldLogOutSuccessFully() {
            homePage.clickOnLoginLink();
            loginPage.enterEmailId("munirshah809@gmail.com");
            loginPage.enterPassword("Asdfg890");
            loginPage.clickOnLoginButton();
            homePage.clickOnLogoutLink();
            homePage.loginLinkDisplayed();
        }
    }
