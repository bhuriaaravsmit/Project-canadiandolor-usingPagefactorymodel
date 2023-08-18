package com.canadiandollor.testsuite;

import com.canadiandollor.customlisteners.CustomListeners;
import com.canadiandollor.pages.BonusCalculatorPage;
import com.canadiandollor.pages.GamesPage;
import com.canadiandollor.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class BonusPageTest extends BaseTest {

    BonusCalculatorPage bonusCalculatorPage;
    GamesPage gamesPage;

    @BeforeMethod(groups = {"sanity","smoke"})
    public void inIT(){
        bonusCalculatorPage=new BonusCalculatorPage();
        gamesPage=new GamesPage();
    }

    @Test(groups = "smoke")
    public void calculateBonus() {
        gamesPage.clickOnBonus();
        sleep(300);
        //Switching Frame is important
        driver.switchTo().frame(0);
        bonusCalculatorPage.selectDayOftheWeek("Friday");
        bonusCalculatorPage.selectLoyaltyLevel("7");
    }
}
