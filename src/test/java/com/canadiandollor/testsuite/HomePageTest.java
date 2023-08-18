package com.canadiandollor.testsuite;

import com.canadiandollor.customlisteners.CustomListeners;
import com.canadiandollor.pages.GamesPage;
import com.canadiandollor.pages.HomePage;
import com.canadiandollor.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class HomePageTest extends BaseTest {


    HomePage homePage;
    GamesPage gamesPage;

    @BeforeMethod(groups = {"sanity","smoke" })
    public void inIT(){
        homePage=new HomePage();
        gamesPage=new GamesPage();
    }

    @Test(groups = {"sanity", "smoke"})
    public void menuNavigation() {
        gamesPage.clickOnBingo();
      }

    @Test(groups = {"sanity", "smoke"})
    public void clickOnHomeTab() {
        homePage.clickOnHomeTab();
    }

    @Test
    public void clickOnBonusCalculation() {
        gamesPage.clickOnBonus();
    }

    @Test
    public void checkLoginError() {
        homePage.clickOnLogin();
        String expectedMessage="You did not fill out one of the fields";
        String actualMessage=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertEquals(actualMessage,expectedMessage);

    }



}
