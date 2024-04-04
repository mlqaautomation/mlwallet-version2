package org.mlkpx.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.Driver.DriverManager.getDriver;
public class Payout_PageObjects {
    public WebElement payout_link(){
        return getDriver().findElement(By.cssSelector("[href='/payout']"));
    }
    public WebElement payoutPage_h2(){
        return getDriver().findElement(By.xpath("//h2"));
    }
    public WebElement payoutPage_h5(){
        return getDriver().findElement(By.xpath("//h5[contains(text(),'No Transaction Found')]"));
    }
    public WebElement PayoutTransaction(){
        return getDriver().findElement(By.xpath("(//a[@href='/payout'])[2]"));
    }
    public WebElement UnremoteTransaction(){
        return getDriver().findElement(By.xpath("//input[@value='0']"));
    }
    public WebElement RemoteTransaction(){
        return getDriver().findElement(By.xpath("//input[@value='1']"));
    }
    public WebElement DomesticTransaction(){
        return getDriver().findElement(By.xpath("//input[@value='ML']"));
    }
    public WebElement PayKTPN(){
        return getDriver().findElement(By.xpath("//input[@name='kptn']"));
    }
    public WebElement PayAmount(){return getDriver().findElement(By.xpath("//input[@step='0.01' and @name='amount']"));}
    public WebElement SearchButton(){return getDriver().findElement(By.xpath("//button[normalize-space()='Search']"));
    }
    public WebElement BranchCode(){return getDriver().findElement(By.xpath("//input[@name='branchCode']"));
    }
    public WebElement OperatorID(){return getDriver().findElement(By.xpath("//input[@placeholder='Operator ID']"));
    }
    public WebElement ReasonRemote(){return getDriver().findElement(By.xpath("//input[@name='remoteBranch.remoteReason']"));
    }

    public WebElement SearchKYC(){return getDriver().findElement(By.xpath("//button[normalize-space()='Search KYC']"));
    }
    public WebElement SearchLName(){return getDriver().findElement(By.xpath("//input[@name='lastName']"));
    }
    public WebElement SearchFName(){return getDriver().findElement(By.xpath("//input[@name='firstName']"));
    }
    public WebElement SearchMName(){return getDriver().findElement(By.xpath("//input[@name='middleName']"));
    }
    public WebElement SearchKYCAc(){return getDriver().findElement(By.xpath("//button[normalize-space()='Search']"));
    }
    public WebElement ViewKYCCustomer(){return getDriver().findElement(By.xpath("(//button[normalize-space()='View'])[1]"));
    }
    public WebElement NavViewKYC(){return getDriver().findElement(By.xpath("//h2[contains(text(),'View KYC')]"));
    }
    public WebElement ActiveStat(){return getDriver().findElement(By.xpath("//h5[contains(text(),'Active Status')]"));
    }
    public WebElement SelectKYC(){return getDriver().findElement(By.xpath("(//button[normalize-space()='Select KYC'])[1]"));
    }
    public WebElement PayoutInfos(){return getDriver().findElement(By.xpath("//h2[contains(text(),'Payout')]"));
    }
    public WebElement ClaimAmount(){return getDriver().findElement(By.xpath("//button[normalize-space()='Claim Amount']"));
    }
    public WebElement PayoutConfirm(){return getDriver().findElement(By.xpath("//button[normalize-space()='Confirm Payout']"));
    }
    public WebElement ConfirmPayout(){return getDriver().findElement(By.xpath("//button[normalize-space()='Confirm Payout']"));
    }
    public WebElement SuccessfulPay(){return getDriver().findElement(By.xpath("//h5[contains(text(),'Payout Successful')]"));
    }
    public WebElement InvalidKTPN(){return getDriver().findElement(By.xpath("//h5[contains(text(),'No Transaction Found')]"));
    }
    public WebElement OKInvalidKTPN(){return getDriver().findElement(By.xpath("//button[normalize-space()='OK']"));
    }
    public WebElement InvalidAmount(){return getDriver().findElement(By.cssSelector("[class='w-100 alert alert-secondary show']"));
    }
    public WebElement AmountClaimed(){return getDriver().findElement(By.cssSelector("[class='sc-gEvEer lkAUft']"));
    }


}
