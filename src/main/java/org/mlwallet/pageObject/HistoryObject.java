package org.mlwallet.pageObject;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver.AppiumDriverManager;

import java.time.Duration;
public class HistoryObject extends AppiumDriverManager {
    public WebElement objHistoryText(){
        return driver.findElement(By.xpath("//*[@text='History']"));
    }
    public WebElement objRecentTransaction(){
        return driver.findElement(By.xpath("//*[@text='Recent Transactions']"));
    }
    public WebElement objNoHistoryTransaction(){
        return driver.findElement(By.xpath("//*[@text='No Recent Transaction']"));
    }
    public WebElement objSeeMoreBtn(){
        return driver.findElement(By.xpath("//*[@text='See More']"));
    }
    public WebElement objTransactionHistory(){
        return driver.findElement(By.xpath("//*[@text='Transaction History']"));
    }
    public WebElement objBillsPayTab(){
        return driver.findElement(By.xpath("//*[@text='Billspay']"));
    }
    public WebElement objeLoadTab(){
        return driver.findElement(By.xpath("//*[@text='eLoad']"));
    }
    public WebElement objSendMoneyTab(){
        return driver.findElement(By.xpath("//*[@text='Send Money']"));
    }
    public WebElement objWalletToWallet(){
        return driver.findElement(By.xpath("//*[@text='Wallet to Wallet']"));
    }
    public WebElement objKwartaPadala(){
        return driver.findElement(By.xpath("(//*[@text='Kwarta Padala'])[1]"));
    }
    public WebElement objSenderName(){
        return driver.findElement(By.xpath("(//*[@resource-id='Sender Name'])[2]"));
    }
    public WebElement objCashInTab(){
        return driver.findElement(By.xpath("//*[@text='Cash In']"));
    }
    public WebElement objCashOutTab(){
        return driver.findElement(By.xpath("//*[@text='Cash Out']"));
    }
    public WebElement objReceiveMoneyTab(){
        return driver.findElement(By.xpath("//*[@text='Receive Money']"));
    }
    public WebElement objBalanceAdjustmentTab(){
        return driver.findElement(By.xpath("//*[@text='Balance Adjustment']"));
    }

    public WebElement objMlShopTab(){
        return driver.findElement(By.xpath("//*[@text='ML Shop']"));
    }
    public WebElement objTopUpGamesTab(){
        return driver.findElement(By.xpath("//*[@text='Top Up Games']"));
    }
    public WebElement objPaymentsTab(){
        return driver.findElement(By.xpath("//*[@text='Payments']"));
    }
    public WebElement objShopSafeTab(){
        return driver.findElement(By.xpath("//*[@text='Shop Safe']"));
    }
    public WebElement objRewardsTab(){
        return driver.findElement(By.xpath("//*[@text='Rewards']"));
    }
    public WebElement objSalaryLoansTab(){
        return driver.findElement(By.xpath("//*[@text='Salary Loans']"));
    }
    public WebElement objPayBillsTransctionList1(String moduleName)
    {
        return driver.findElement(By.xpath("//*[@text='"+moduleName+"']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/(child::android.widget.TextView)[1]"));
    }
    public WebElement objBillHistory(String billModule,String transaction)
    {
        return driver.findElement(By.xpath("//*[@text='"+billModule+"' or @text='"+transaction+"']"));
    }
    public WebElement objAllTab(){
        return driver.findElement(By.xpath("//*[@text='All']"));
    }
    public WebElement objFirstTransaction(){
        return driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*/*/*/*[@class='android.view.ViewGroup' and ./*[./*[./*[@text]] and ./*[@text]]])[1]"));
    }
    public WebElement objTransactionDetails(){
        return driver.findElement(By.xpath("//*[@text='Transaction Details']"));
    }
    public WebElement objReceiverMobileNo(){
        return driver.findElement(By.xpath("(//*[@resource-id='Receiver Mobile No.'])[2]"));
    }
    public WebElement objReceiverName(){
        return driver.findElement(By.xpath("(//*[@resource-id='Receiver Name'])[2]"));
    }
    public WebElement objPaymentMethod(){
        return driver.findElement(By.xpath("(//*[@resource-id='Payment Method'])[2]"));
    }
    public WebElement objLoadType(){
        return driver.findElement(By.xpath("(//*[@resource-id='Load Type'])[2]"));
    }
    public WebElement objBiller(){
        return driver.findElement(By.xpath("(//*[@resource-id='Biller'])[2]"));
    }
    public WebElement objTransactionType(){
        return driver.findElement(By.xpath("(//*[@resource-id='Transaction Type'])[2]"));
    }
    public WebElement objAmount(){
        return driver.findElement(By.xpath("(//*[@resource-id='Amount to Send'])[2]"));
    }
    public WebElement objServiceFee(){
        return driver.findElement(By.xpath("(//*[@resource-id='Service Fee'])[2]"));
    }
    public WebElement objTotalAmount(){
        return driver.findElement(By.xpath("(//*[@resource-id='Total'])[2]"));
    }
    public WebElement objTotalCashIn(){
        return driver.findElement(By.xpath("(//*[@resource-id='Total Cash In'])[2]"));
    }
    public WebElement objTotalCashOut(){
        return driver.findElement(By.xpath("(//*[@resource-id='Total Cash Out'])[2]"));
    }
    public WebElement objReferenceNumberInTransactionDetails(){
        return driver.findElement(By.xpath("(//*[@resource-id='Reference Number'])[2]"));
    }
    public WebElement objDate(){
        return driver.findElement(By.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]]]/*[@class='android.view.ViewGroup'])[1]/*[@text])[4]"));
    }
    public WebElement objBank(){
        return driver.findElement(By.xpath("(//*[@resource-id='Bank'])[2]"));
    }
    public WebElement objAmountReceived(){
        return driver.findElement(By.xpath("(//*[@resource-id='Amount Received'])[2]"));
    }
    public WebElement objRedeemCode(){
        return driver.findElement(By.xpath("(//*[@resource-id='Redeem Code'])[2]"));
    }

    public WebElement objRequestTransactBtn(){
        return driver.findElement(By.xpath("//*[@text='Transaction History']/parent::android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup"));
    }
    public WebElement objBack(){
        return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"\uE5CB\"]/android.widget.TextView"));
    }
    public WebElement objHeaderRequestTransact(){
        return driver.findElement(By.xpath("//*[@text='Request Transaction']"));
    }
    public WebElement objTitleRequestTransact(){
        return driver.findElement(By.xpath("//*[@text='Transaction History Request']"));
    }
    public WebElement objBodyRequestTransact(){
        return driver.findElement(By.xpath("//*[@text='Transaction History Request']/parent::android.view.ViewGroup/child::android.widget.TextView[2]"));
    }
    public WebElement objMonth(){
        return driver.findElement(By.xpath("//*[@text='Month']"));
    }
    public WebElement objYear(){
        return driver.findElement(By.xpath("//*[@text='Year']"));
    }
    public WebElement objStartDate(){
        return driver.findElement(By.xpath("//*[@text='Start Date']"));
    }
    public WebElement objEndDate(){
        return driver.findElement(By.xpath("//*[@text='End Date']"));
    }
    public WebElement objSubmitRequestBtn(){
        return driver.findElement(By.xpath("//*[@text='Submit Request']"));
    }
    public WebElement objMonths(){
        return driver.findElement(By.xpath("//*[@text='Months']"));
    }
    public WebElement objSearch(){
        return driver.findElement(By.xpath("//*[@text='Search']"));
    }
    public WebElement objJune(){
        return driver.findElement(By.xpath("//*[@text='JUNE']"));
    }
    public WebElement objYears(){
        return driver.findElement(By.xpath("//*[@text='Years']"));
    }
    public WebElement obj2024(){
        return driver.findElement(By.xpath("//*[@text='2024']"));
    }
    public WebElement obj1(){
        return driver.findElement(By.xpath("//*[@text='1']"));
    }
    public WebElement obj30(){
        return driver.findElement(By.xpath("//*[@text='30']"));
    }
    public WebElement objOkBtn(){
        return driver.findElement(By.xpath("//*[@text='OK']"));
    }
    public WebElement objCancelsBtn(){
        return driver.findElement(By.xpath("//*[@text='CANCEL']"));
    }
    public WebElement objRequestAcceptTitle(){
        return driver.findElement(By.xpath("//*[@text='Request Accepted']"));
    }
    public WebElement objRequestAcceptBody(){
        return driver.findElement(By.xpath("//*[@text='Your transaction history shall be sent to your email address.']"));
    }
    public WebElement objGotItBtn(){
        return driver.findElement(By.xpath("//*[@text='Got It!']"));
    }
    public WebElement objMonthBtn(){
        return driver.findElement(By.xpath("//*[@text='Month']/parent::android.view.ViewGroup"));
    }
    public WebElement objYearBtn(){
        return driver.findElement(By.xpath("//*[@text='Year']/parent::android.view.ViewGroup"));
    }
    public WebElement objStartDateBtn(){
        return driver.findElement(By.xpath("//*[@text='Start Date']/parent::android.view.ViewGroup"));
    }
    public WebElement objEndDateBtn(){
        return driver.findElement(By.xpath("//*[@text='End Date']/parent::android.view.ViewGroup"));
    }
    public WebElement objStartDateGreaterThanEndDate(){
        return driver.findElement(By.xpath("//*[@text='Start date should not be greater than the end date']"));
    }
    public WebElement objOkButton(){
        return driver.findElement(By.xpath("//*[@text='Ok']"));
    }
}

