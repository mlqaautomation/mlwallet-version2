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
        return getDriver().findElement(By.xpath("//div[@class=' css-1uccc91-singleValue']"));
    }
    public WebElement BPClickPartners() {
        return getDriver().findElement(By.xpath("//input[@name='partner']"));
    }
//    public WebElement BPChoosePartners(String option) {
//        return getDriver().findElement(By.xpath("//*[contains(text(),'"+option+"')]"));
//
//    }
    public WebElement BPChoosePartners(String option) {
        String xpath = "//*[contains(text(),'" + option + "')]";
        return getDriver().findElement(By.xpath(xpath));
    }
    public WebElement BPSelectPartners() {
        return getDriver().findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder']"));
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

    //payor infos
    public WebElement PayorLastName(){
        return getDriver().findElement(By.xpath("//input[@name='payorLastName']"));
    }
    public WebElement PayorFirstName(){
        return getDriver().findElement(By.xpath("//input[@name='payorFirstName']"));
    }
    public WebElement PayorMiddleName(){
        return getDriver().findElement(By.xpath("//input[@name='payorMiddleName']"));
    }
    public WebElement PayorAddress(){
        return getDriver().findElement(By.xpath("//input[@name='payorAddress']"));
    }
    public WebElement PayorContact(){
        return getDriver().findElement(By.xpath("//input[@name='payorContactNumber']"));
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
    public WebElement ReasonCancel(){
        return getDriver().findElement(By.xpath("//textarea[@placeholder='Reason for Cancellation']"));
    }
    public WebElement ReasonReprinting(){
        return getDriver().findElement(By.xpath("//textarea[@placeholder='Reason for Reprinting']"));
    }
    public WebElement CancelPayment(){
        return getDriver().findElement(By.xpath("//button[normalize-space()='Cancel Payment']"));
    }
    public WebElement YesCancelPayment(){
        return getDriver().findElement(By.xpath("//button[normalize-space()='Yes, Cancel Payment']"));
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
    public WebElement Page_h5(){
        return getDriver().findElement(By.xpath("//h5[contains(text(),'No Transaction Found')]"));
    }
    public WebElement OKButton(){return getDriver().findElement(By.xpath("//button[normalize-space()='OK']"));
    }



}
