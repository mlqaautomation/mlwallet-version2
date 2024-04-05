package org.mlkpx.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.Driver.DriverManager.getDriver;

public class SendOutCancellation_PageObjects {
    public WebElement sendOutCancellationLink(){return getDriver().findElement(By.xpath("//*[text()='Sendout Cancellation']"));}
    public WebElement cancelDropdown(){return getDriver().findElement(By.xpath("//*[@href=\"/sendout/cancellation\"]"));}
    public WebElement cancelSendOutText(){
        return getDriver().findElement(By.cssSelector("[class=\"sc-fTFjTM bFCFsb mb-2\"]"));}
    public WebElement kptnField(){
        return getDriver().findElement(By.cssSelector("[name=\"kptn\"]"));}

}
