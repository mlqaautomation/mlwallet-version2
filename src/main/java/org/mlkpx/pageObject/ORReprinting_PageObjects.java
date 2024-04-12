package org.mlkpx.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.Driver.DriverManager.getDriver;

public class ORReprinting_PageObjects {
    public WebElement orReprintingLink(){return getDriver().findElement(By.xpath("//*[@href='/sendout/or-reprinting'] [text()='OR Reprinting']"));}
    public WebElement orReprintText(){return getDriver().findElement(By.xpath("//*[text()=\"Sendout OR Reprint\"]"));}
    public WebElement kptnButtonInReprint(){
        return getDriver().findElement(By.cssSelector("[name=\"kptn\"]"));}
    public WebElement reasonORReprint(){
        return getDriver().findElement(By.cssSelector("[name=\"reason\"]"));}
    public WebElement reprintButton(){
        return getDriver().findElement(By.cssSelector("[class=\"btn-sm btn btn-primary\"]"));}
    public WebElement printSendoutORReceiptText(){return getDriver().findElement(By.xpath("//*[text()=\"Print Sendout OR Receipt\"]"));}
    public WebElement noTransactionFoundText(){return getDriver().findElement(By.xpath("//*[text()=\"No Transaction Found\"]"));}


}
