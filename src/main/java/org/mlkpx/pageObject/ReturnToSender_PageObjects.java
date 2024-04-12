package org.mlkpx.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.Driver.DriverManager.getDriver;

public class ReturnToSender_PageObjects {
    public WebElement rtsNavlink() { return getDriver().findElement(By.xpath("//*[@href='/sendout/return-to-sender']")); }
    public WebElement returnToSenderText() { return getDriver().findElement(By.xpath("(//*[text()=\"Return to Sender\"])[2]")); }
    public WebElement rtsKPTNField() {
        return getDriver().findElement(By.cssSelector("[name=\"kptn\"]")); }
    public WebElement searchButton(){
        return getDriver().findElement(By.cssSelector("[class=\"btn-sm btn btn-primary\"]"));
    }
    public WebElement irNo(){
        return getDriver().findElement(By.cssSelector("[name=\"irNo\"]"));
    }
    public WebElement reason(){
        return getDriver().findElement(By.cssSelector("[name=\"reason\"]"));
    }
    public WebElement returnToSenderButton(){
        return getDriver().findElement(By.cssSelector("[class=\"btn-sm btn btn-primary\"]"));
    }
    public WebElement noKeepTransactionButton(){
        return getDriver().findElement(By.cssSelector("[class=\"swal2-cancel swal2-styled\"]"));
    }
    public WebElement yesReturnToSenderButton(){
        return getDriver().findElement(By.cssSelector("[class=\"swal2-confirm swal2-styled\"]"));
    }
    public WebElement returnToSenderSuccess(){ return getDriver().findElement(By.xpath("//*[text()=\"Return to Sender Success\"]")); }
    public WebElement rtsProceedToPrinting(){
        return getDriver().findElement(By.cssSelector("[class=\"swal2-confirm swal2-styled\"]"));
    }
    public WebElement rtsCancelButton(){
        return getDriver().findElement(By.cssSelector("[class=\"sc-hIUJlX exqbQW btn btn-secondary\"]"));
    }
}
