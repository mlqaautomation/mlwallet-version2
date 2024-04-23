package org.mlkpx.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Logger.LoggingUtils;

import java.util.List;

import static utilities.Driver.DriverManager.getDriver;

public class WalletServices_PageObjects {
    public WebElement Wallet_link(){return getDriver().findElement(By.cssSelector("[href='/wallet-services/cash-in']"));
    }
    public WebElement WalletPage_h2(){return getDriver().findElement(By.xpath("//h2"));
    }
    public WebElement CashInAnotherAccount(){return getDriver().findElement(By.xpath("(//a[@href='/wallet-services/send-money'])[1]"));
    }
    public WebElement WalletPage(){return getDriver().findElement(By.xpath("//h2[contains(text(),'Cash In to Another Account')]"));
    }
    public WebElement KYCPage(){return getDriver().findElement(By.xpath("//h2[contains(text(),'View KYC')]"));
    }
    public WebElement WalletCardNum(){return getDriver().findElement(By.xpath("//input[@name='cardNumber']"));
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
    public WebElement ViewKYCCustomer(){return getDriver().findElement(By.xpath("(//button[normalize-space()='View'])[2]"));
    }
    public WebElement SelectKYC(){return getDriver().findElement(By.xpath("(//button[normalize-space()='Select KYC'])[1]"));
    }
    public WebElement CashInInfos(){return getDriver().findElement(By.xpath("//h2[contains(text(),'Cash In to Another Account')]"));
    }
    public WebElement ReceiversMobileNum(){return getDriver().findElement(By.xpath("//input[@name='mobileNumber']"));
    }
    public WebElement PrincipalAmount(){return getDriver().findElement(By.xpath("//input[@name='principalAmount']"));
    }
    public WebElement SubmitSendMoney(){return getDriver().findElement(By.xpath("//button[normalize-space()='Submit Send Money']"));
    }
    public WebElement ClickPrincipal(){return getDriver().findElement(By.xpath("//button[normalize-space()='Submit Send Money']"));
    }
    public WebElement CancelSendMoney(){return getDriver().findElement(By.xpath("//label[contains(text(), 'Principal Amount')]"));
    }
    public WebElement SendMoneyInfo(){return getDriver().findElement(By.xpath("//h2[contains(text(),'Send Money')]"));
    }
    public WebElement TenderAmount(){return getDriver().findElement(By.xpath("//input[@name='tenderAmount']"));
    }
    public WebElement ProceedSendMoney(){return getDriver().findElement(By.xpath("//button[normalize-space()='Proceed']"));
    }
    public WebElement CancelProceed(){return getDriver().findElement(By.xpath("//button[normalize-space()='Cancel']"));
    }
    public WebElement ConfirmSendMoney(){return getDriver().findElement(By.xpath("//button[normalize-space()='Confirm Send Money']"));
    }
    public WebElement SendMoneyConfirmation(){return getDriver().findElement(By.xpath("//h4[contains(text(),'Send Money Confirmation')]"));
    }
    public WebElement SuccessfulSendMoney(){return getDriver().findElement(By.xpath("//h5[contains(text(),'Send Money Successful')]"));
    }
    public WebElement ProceedToPrint(){return getDriver().findElement(By.xpath("//button[normalize-space()='Proceed to Printing']"));
    }
    public WebElement CancelToPrint(){return getDriver().findElement(By.xpath("//button[normalize-space()='Cancel']"));
    }
    public WebElement RemoteTransaction(){return getDriver().findElement(By.xpath("//input[@value='1']"));
    }
    public WebElement BranchCode(){return getDriver().findElement(By.xpath("//input[@name='branchCode']"));
    }
    public WebElement OperatorID(){return getDriver().findElement(By.xpath("//input[@placeholder='Operator ID']"));
    }
    public WebElement ReasonRemote(){return getDriver().findElement(By.xpath("//input[@name='remoteBranch.remoteReason']"));
    }
    public WebElement MobileRequired(){return getDriver().findElement(By.xpath("//small[contains(text(),'Mobile number is required.')]"));
    }
    public WebElement InvalidMobileRequired(){return getDriver().findElement(By.xpath("//small[contains(text(),'Invalid Mobile No.')]"));
    }
    public WebElement AmountNumber(){return getDriver().findElement(By.xpath("//small[contains(text(),'Amount should be a number')]"));
    }
    public WebElement Minnumber(){return getDriver().findElement(By.xpath("//small[contains(text(),'Minimum amount is 1')]"));
    }
    public WebElement LessTenderAmount(){return getDriver().findElement(By.xpath("//small[contains(text(),'Tender amount cannot be less than total amount')]"));
    }
    public WebElement CustomerCannotFound(){return getDriver().findElement(By.xpath("//h5[contains(text(),'Customer not found')]"));
    }
    public WebElement TransactionNotAllowed(){return getDriver().findElement(By.xpath("//h5[contains(text(),'Transaction not allowed')]"));
    }
    public WebElement ReceiptReprinting(){return getDriver().findElement(By.xpath("(//a[@href='#'])[1]"));
    }
    public WebElement CashInOwnReprinting(){return getDriver().findElement(By.xpath("(//a[@href='/wallet-services/reprint/cash-in'])[1]"));
    }
    public WebElement CashInOwnPage(){return getDriver().findElement(By.xpath("//h2[contains(text(),'Cash In to Own Account Receipt')]"));
    }
    public WebElement RefKTPN(){return getDriver().findElement(By.xpath("//input[@name='kptn']"));
    }
    public WebElement Reprint(){return getDriver().findElement(By.xpath("//button[normalize-space()='Search']"));
    }
    public WebElement ReprintCashInOwnReceipt(){return getDriver().findElement(By.xpath("//h3[contains(text(),'Reprint Cash In to Own Account Receipt')]"));
    }
    public WebElement PrintReceipt(){return getDriver().findElement(By.xpath("//button[normalize-space()='Print Receipt']"));
    }
    public WebElement InvalidRefReprinting(){return getDriver().findElement(By.xpath("//h5[contains(text(),'Warning')]"));
    }
    public WebElement EmptyRefReprinting(){return getDriver().findElement(By.xpath("//small[contains(text(),'KPTN is required')]"));
    }
    public WebElement BranchCashInReprinting(){return getDriver().findElement(By.xpath("(//a[@href='/wallet-services/reprint/branch-cash-in'])[1]"));
    }
    public WebElement BranchCashInPage(){return getDriver().findElement(By.xpath("//h2[contains(text(),'Cash In to Another Account Receipt')]"));
    }
    public WebElement CashOutReprinting(){return getDriver().findElement(By.xpath("(//a[@href='/wallet-services/reprint/cash-out'])[1]"));
    }
    public WebElement CashOutPage(){return getDriver().findElement(By.xpath("//h2[contains(text(),'Cash Out Receipt')]"));
    }
    public WebElement KPPayoutReprinting(){return getDriver().findElement(By.xpath("(//a[@href='/wallet-services/reprint/send-money-akp'])[1]"));
    }
    public WebElement KPPayoutPage(){return getDriver().findElement(By.xpath("//h2[contains(text(),'Kwarta Padala Payout Receipt')]"));
    }
    public WebElement CompleteInvalidRefReprinting(){return getDriver().findElement(By.xpath("//h5[contains(text(),'Wrong transaction type')]"));
    }
    public WebElement ReprintKPPayoutReceipt(){return getDriver().findElement(By.xpath("//h3[contains(text(),'Reprint Kwarta Padala Payout Receipt')]"));
    }
    public WebElement ReprintBranchCashInReceipt(){return getDriver().findElement(By.xpath("//h3[contains(text(),'Reprint Cash In to Another Account Receipt')]"));
    }
    public WebElement ReprintCashOutReceipt(){return getDriver().findElement(By.xpath("//h3[contains(text(),'Reprint Cash Out Receipt')]"));
    }
}
