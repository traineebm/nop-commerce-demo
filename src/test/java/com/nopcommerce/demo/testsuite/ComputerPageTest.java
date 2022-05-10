package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.utility.Utility;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class ComputerPageTest extends Utility {
    HomePage homePage;
    LoginPage loginPage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void  verifyUserShouldNavigateToComputerPageSuccessfully(){
        homePage.selectTopMenu("Computers");
        computerPage.verifyComputersText("Computers");
    }

    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.selectTopMenu("Computers");
        computerPage.clickOnDesktopLink();
        desktopsPage.verifyDesktopText("Desktops");
    }

    @Test(groups = {"regression"}, dataProvider = "configuration",dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software){
        homePage.selectTopMenu("Computers");
        computerPage.clickOnDesktopLink();
        desktopsPage.selectProductFromDesktopPage("Build your own computer");
        buildYourOwnComputerPage.selectPartsAndBuildYourOwnComputer(processor, ram, hdd, os, software);
        buildYourOwnComputerPage.clickOnAddToCartButton();
        buildYourOwnComputerPage.verifyProductAddedToCartText("The product has been added to your shopping cart");
    }
}
