package com.canadiandollor.pages;

import com.aventstack.extentreports.Status;
import com.canadiandollor.customlisteners.CustomListeners;
import com.canadiandollor.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GamesPage extends Utility {

     private static final Logger log = LogManager.getLogger(GamesPage.class);

    @CacheLookup
    @FindBy(id = "games")
    WebElement games;

    @CacheLookup
    @FindBy(linkText = "Bingo")
    WebElement bingo;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Bingo')]")
    WebElement bingotxt;


    @CacheLookup
    @FindBy(id = "bonuses")
    WebElement bonuses;


    @CacheLookup
    @FindBy(linkText = "Calculate your Bonus!")
    WebElement bonusesLink;

    public WebElement getBingotxt() {
        return bingotxt;
    }

    public void clickOnBingo() {
        mouseHoverToElement(games);
        mouseHoverToElementAndClick(bingo);
        log.info("Clicking on Bingo.." );
        CustomListeners.test.log(Status.PASS,"click on Bingo");
    }



    public void clickOnBonus() {
        mouseHoverToElement(bonuses);
        mouseHoverToElementAndClick(bonusesLink);
        log.info("Getting text from : " + bonusesLink.toString());
        CustomListeners.test.log(Status.PASS,"Click On Bonus");
    }

    public void verifyBingo(){

      clickOnElement(bingotxt);
        log.info("Getting text from : " + bingotxt.toString());
        CustomListeners.test.log(Status.PASS,"Click On Bingo");
    }
}
