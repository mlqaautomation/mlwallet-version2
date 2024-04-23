package org.mlkpx.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.Driver.DriverManager.getDriver;

public class BillsPay_PageObjects {
    public WebElement billsPay_link(){
        return getDriver().findElement(By.cssSelector("[href='/bills/payments']"));
    }
    public WebElement billsPay_h2(){
        return getDriver().findElement(By.xpath("//h2"));
    }
    public WebElement BPSendout(){
        return getDriver().findElement(By.xpath("(//a[@href='/bills/payments'])[2]"));
    }
    public WebElement BPCancellation(){
        return getDriver().findElement(By.xpath("(//a[@href='/bills/cancellation'])[1]"));
    }
    public WebElement BPChangeDetails(){
        return getDriver().findElement(By.xpath("(//a[@href='/bills/change-details'])[1]"));
    }
    public WebElement BPReprinting(){
        return getDriver().findElement(By.xpath("(//a[@href='/bills/reprint'])[1]"));
    }
    public WebElement NoRemoteTransaction(){
        return getDriver().findElement(By.xpath("//input[@value='0']"));
    }
    public WebElement RemoteTransaction(){
        return getDriver().findElement(By.xpath("//input[@value='1']"));
    }
    public WebElement BPPartners(){
        return getDriver().findElement(By.xpath("//div[@class=' css-tlfecz-indicatorContainer']"));
    }
//    public WebElement BPChoosePartners(String option) {
//        String xpath = "//div[contains(text(),'" + option + "')]";
//        return getDriver().findElement(By.xpath(xpath));
//    }
//    public WebElement BPChoosePartners(){
//        return getDriver().findElement(By.xpath("//div[@class=' css-1uccc91-singleValue' or @name='MERALCO RTP (ELECTRICITY)']"));
//    }

    public WebElement RefRequired(){
        return getDriver().findElement(By.xpath("//small[contains(text(),'Reference number is required')]"));
    }
    public WebElement ReasonRequired(){
        return getDriver().findElement(By.xpath("//small[contains(text(),'Reason is required')]"));
    }
    public WebElement OnlyLettersP(){
        return getDriver().findElement(By.xpath("//small[contains(text(),'Only letters are allowed.')]"));
    }


    public WebElement BPAccNum(){
        return getDriver().findElement(By.xpath("//input[@name='accountNumber']"));
    }
    public WebElement BPLastName(){
        return getDriver().findElement(By.xpath("//input[@name='accountLastName']"));
    }
    public WebElement BPFirstName(){
        return getDriver().findElement(By.xpath("//input[@name='accountFirstName']"));
    }
    public WebElement BPMiddleName(){
        return getDriver().findElement(By.xpath("//input[@name='accountMiddleName']"));
    }
    public WebElement AccountNum(){
        return getDriver().findElement(By.xpath("//input[@name='accountInformation.billAccountNumber']"));
    }
    //payor infos
    public WebElement PayorLastName(){
        return getDriver().findElement(By.xpath("//input[@name='payorInformation.payorLastName']"));
    }
    public WebElement PayorFirstName(){
        return getDriver().findElement(By.xpath("//input[@name='payorInformation.payorFirstName']"));
    }
    public WebElement PayorMiddleName(){
        return getDriver().findElement(By.xpath("//input[@name='payorInformation.payorMiddleName']"));
    }
    public WebElement PayInformation(){
        return getDriver().findElement(By.xpath("(//h5[@class='mt-5'][2])"));
    }
    public WebElement PayorAddress(){
        return getDriver().findElement(By.xpath("//input[@name='payorInformation.payorAddress']"));
    }
    public WebElement PayorContact(){
        return getDriver().findElement(By.xpath("//input[@name='payorInformation.payorContactNumber']"));
    }
    public WebElement BPPage_h2(){
        return getDriver().findElement(By.xpath("//h5[contains(text(),'Account Information')]"));
    }

    //payment infos

    public WebElement PaymentAmount(){
        return getDriver().findElement(By.xpath("//input[@id='moneyInput']"));
    }
    public WebElement PaymentDetails(){
        return getDriver().findElement(By.xpath("//textarea[@name='otherDetails']"));
    }
    public WebElement SubmitBillsPay(){
        return getDriver().findElement(By.xpath("//button[normalize-space()='Submit Bills Pay']"));
    }
    public WebElement BillsPayText(){
        return getDriver().findElement(By.xpath("//h2[contains(text(),'Bills Pay Cancellation')]"));
    }
    public WebElement BillsPayChange(){
        return getDriver().findElement(By.xpath("//h2[contains(text(),'Bills Pay Change Details')]"));
    }
    public WebElement BillsPayPrint(){
        return getDriver().findElement(By.xpath("//h2[contains(text(),'Bills Pay Reprint')]"));
    }
    public WebElement RepKTPN(){
        return getDriver().findElement(By.xpath("//input[@name='refNo']"));
    }
    public WebElement RefNum(){
        return getDriver().findElement(By.xpath("//input[@name='refNo']"));
    }

    public WebElement SearchButton(){
        return getDriver().findElement(By.xpath("//button[normalize-space()='Search']"));
    }
    public WebElement IRNum(){
        return getDriver().findElement(By.xpath("//input[@placeholder='IR No.']"));
    }
    public WebElement InitiatedBy(){
        return getDriver().findElement(By.xpath("//option[@value='CUSTOMER']"));
    }
    public WebElement NoInitiatedBy(){
        return getDriver().findElement(By.xpath("//option[@value='']"));
    }
    public WebElement ReasonCancel(){
        return getDriver().findElement(By.xpath("//textarea[@placeholder='Reason for Cancellation']"));
    }
    public WebElement ReasonChange(){
        return getDriver().findElement(By.xpath("//textarea[@placeholder='Reason for Change']"));
    }
    public WebElement ReasonReprinting(){
        return getDriver().findElement(By.xpath("//textarea[@placeholder='Reason for Reprinting']"));
    }
    public WebElement Reprint(){return getDriver().findElement(By.xpath("//button[normalize-space()='Reprint']"));
    }
    public WebElement ReprintBillsReceipt(){
        return getDriver().findElement(By.xpath("//h3[contains(text(),'Reprint Bills Pay Receipt')]"));
    }
    public WebElement PrintReceipt(){
        return getDriver().findElement(By.xpath("//button[normalize-space()='Print Receipt']"));
    }
    public WebElement NoTransactionFound(){
        return getDriver().findElement(By.xpath("//p[contains(text(),'Bills Payment transaction could not be found. Please check the reference no. and try again.')]"));
    }
    public WebElement CancelPayment(){
        return getDriver().findElement(By.xpath("//button[normalize-space()='Cancel Payment']"));
    }
    public WebElement SaveChanges(){
        return getDriver().findElement(By.xpath("//button[normalize-space()='Save Changes']"));
    }
    public WebElement CancelChanges(){
        return getDriver().findElement(By.xpath("//button[normalize-space()='Cancel']"));
    }
    public WebElement YesCancelPayment(){
        return getDriver().findElement(By.xpath("//button[normalize-space()='Yes, Cancel Payment']"));
    }
    public WebElement YesSaveChanges(){
        return getDriver().findElement(By.xpath("//button[normalize-space()='Yes, Save Changes']"));
    }
    public WebElement GoBack(){
        return getDriver().findElement(By.xpath("//button[normalize-space()='Go Back']"));
    }
    public WebElement NoCancelPayment(){
        return getDriver().findElement(By.xpath("//button[normalize-space()='No, Keep Transaction']"));
    }
    public WebElement NoCancelChanges(){
        return getDriver().findElement(By.xpath("//button[normalize-space()='No, Keep Transaction']"));
    }
    public WebElement KeepTransaction(){
        return getDriver().findElement(By.xpath("//button[normalize-space()='Keep Transaction']"));
    }
    public WebElement YesKeepTransaction(){
        return getDriver().findElement(By.xpath("//button[normalize-space()='Yes, Keep Transaction']"));
    }

    public WebElement BranchCode(){return getDriver().findElement(By.xpath("//input[@name='branchCode']"));
    }
    public WebElement OperatorID(){return getDriver().findElement(By.xpath("//input[@placeholder='Operator ID']"));
    }
    public WebElement ReasonRemote(){return getDriver().findElement(By.xpath("//input[@name='remoteBranch.remoteReason']"));
    }
    public WebElement EmptyRef(){return getDriver().findElement(By.xpath("//small[contains(text(),'Reference Number is required')]"));
    }
    public WebElement InvalidKTPN(){return getDriver().findElement(By.xpath("//h5[contains(text(),'No Transaction Found')]"));
    }
    public WebElement CancelledRefNum(){return getDriver().findElement(By.xpath("//h5[contains(text(),'Bills Payment Cancelled')]"));
    }
    public WebElement InvalidIRNum(){return getDriver().findElement(By.xpath("//small[contains(text(),'Please enter a valid IR No.')]"));
    }
    public WebElement SuccessChanges(){return getDriver().findElement(By.xpath("//p[contains(text(),'Details have been successfully updated.')]"));
    }
    public WebElement NoEditChanges(){return getDriver().findElement(By.xpath("//h5[text()='No Changes Have Been Made']"));
    }
    public WebElement NoIRNum(){return getDriver().findElement(By.xpath("//small[contains(text(),'IR Number is required')]"));
    }
    public WebElement OnlyLetters(){return getDriver().findElement(By.xpath("//small[contains(text(),'Only letters A-Z, Ñ, - and . are allowed.')]"));
    }
    public WebElement NoReason(){return getDriver().findElement(By.xpath("//small[contains(text(),'Reason for Cancellation is required')]"));
    }
    public WebElement NoReasonChange(){return getDriver().findElement(By.xpath("//small[contains(text(),'Reason for Change is required.')]"));
    }
    public WebElement Page_h5(){
        return getDriver().findElement(By.xpath("//h5[contains(text(),'No Transaction Found')]"));
    }
    public WebElement OKButton(){return getDriver().findElement(By.xpath("//button[normalize-space()='OK']"));
    }



}
