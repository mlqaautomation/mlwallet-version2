package org.mlkpx.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.Driver.DriverManager.getDriver;

public class RequestForChange_PageObjects {
    public WebElement rfcLink() { return getDriver().findElement(By.xpath("//*[text()='Request for Change']")); }
    public WebElement rfcText() { return getDriver().findElement(By.xpath("//h2[@class=\"sc-hZDyAQ IiJkP mb-4\"]")); }
    public WebElement kptnField(){
        return getDriver().findElement(By.cssSelector("[name=\"kptn\"]"));
    }
    public WebElement domesticRFClink(){
        return getDriver().findElement(By.cssSelector("//a[@class=\"nav-link\" and @href=\"/sendout/request-for-change\"]"));
    }
    public WebElement searchButton(){
        return getDriver().findElement(By.cssSelector("[class=\"btn-sm btn btn-primary\"]"));
    }
}
