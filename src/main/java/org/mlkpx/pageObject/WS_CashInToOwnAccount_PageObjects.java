package org.mlkpx.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.Driver.DriverManager.getDriver;

public class WS_CashInToOwnAccount_PageObjects {

    public WebElement walletServicesLink(){return getDriver().findElement(By.xpath("//*[@href=\"/wallet-services/cash-in\"]"));}
    public WebElement walletServicesText(){return getDriver().findElement(By.xpath("(//*[text()=\"Wallet Services\"])[2]"));}
    public WebElement kptnButtonInReprint(){
        return getDriver().findElement(By.cssSelector("[name=\"kptn\"]"));}

}
