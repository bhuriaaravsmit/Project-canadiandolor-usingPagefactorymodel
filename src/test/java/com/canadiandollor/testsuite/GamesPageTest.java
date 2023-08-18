package com.canadiandollor.testsuite;

import com.canadiandollor.customlisteners.CustomListeners;
import com.canadiandollor.pages.GamesPage;
import com.canadiandollor.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class GamesPageTest extends BaseTest {

    GamesPage gamesPage;

    @BeforeMethod
    public void inIT() {

        gamesPage = new GamesPage();

    }

    @Test(groups = {"smoke", "sanity"})
    public void verifyBingoText() {
        gamesPage.clickOnBingo();
        String expectedMessage = "Bingo";
        String actualMessage = gamesPage.getBingotxt().getText();

        Assert.assertEquals(actualMessage, expectedMessage);

    }

}

