package org.mlkpx.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.Driver.DriverManager.getDriver;

public class WS_ShopSafe_PageObjects {
//------------------ShopSafe Page
    //Positive
    public WebElement walletServicesLink() {return getDriver().findElement(By.xpath("//*[@href=\"/wallet-services/cash-in\"]"));}
    public WebElement shopsafeText(){return getDriver().findElement(By.xpath("(//*[text()=\"Shop Safe\"])[2]"));}
    public WebElement shopsafeTextheader(){return getDriver().findElement(By.xpath("(//*[text()=\"Shop Safe\"])[3]"));}
    public WebElement referenceNoText(){return getDriver().findElement(By.xpath("(//*[text()=\"Reference No.\"])"));}
    public WebElement referenceNoTxtbox(){return getDriver().findElement(By.xpath("[name=\"referenceNumber\"]"));}
    public WebElement searchBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"Search\"]"));}
    public WebElement scanQRCodeBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"Scan QR Code\"])[1]"));}
    //Negative
    public WebElement errorMessage(){return getDriver().findElement(By.xpath("(//*[text()=\"Reference Number is required.\"])"));}

//----------------ShopSafe Next Page


}
