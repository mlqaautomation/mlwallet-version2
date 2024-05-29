package org.mlwallet.pageObject;

import org.openqa.selenium.By;
import utilities.Driver.AppiumDriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver.AppiumDriverManager;
import java.time.Duration;

public class PayBillsObject extends AppiumDriverManager {
    public WebElement objPayBills(){
        return driver.findElement(By.xpath("//*[@text='Bills']"));
    }
    public WebElement objSelectBiller(){
        return driver.findElement(By.xpath("//*[@text='Select Biller']"));
    }
    public WebElement objBillers(){
        return driver.findElement(By.xpath("//*[@text='Billers']"));
    }
    public WebElement objBiller(){
        return driver.findElement(By.xpath("//*[@text='Biller']"));
    }
    public WebElement objBillerInformation(){
        return driver.findElement(By.xpath("//*[@text='Biller Information']"));
    }
    public WebElement objRecentTransactions(){
        return driver.findElement(By.xpath("//*[@text='Recent Transactions']"));
    }
    public WebElement objSavedBiller(){
        return driver.findElement(By.xpath("//*[@text='Saved Biller']"));
    }
    public WebElement objSavedBillers(){
        return driver.findElement(By.xpath("//*[@text='Saved Billers']"));
    }
    public WebElement objCategories(){
        return driver.findElement(By.xpath("//*[@text='Categories']"));
    }
    public WebElement objAlphabetical(){
        return driver.findElement(By.xpath("//*[@text='Alphabetical']"));
    }
    public WebElement objBankingAndFinance(){
        return driver.findElement(By.xpath("//*[@text=' Banking/Finance']"));
    }
    public WebElement objCharityAndReligious(){
        return driver.findElement(By.xpath("//*[@text='Charity/Religious']"));
    }
    public WebElement objDistributionAndRetail(){
        return driver.findElement(By.xpath("//*[@text='Distribution/Retail']"));
    }
    public WebElement objEducation(){
        return driver.findElement(By.xpath("//*[@text='Education']"));
    }
    public WebElement objGovernment(){
        return driver.findElement(By.xpath("//*[@text='Government']"));
    }
    public WebElement objMedical(){
        return driver.findElement(By.xpath("//*[@text='Medical']"));
    }
    public WebElement objMotors(){
        return driver.findElement(By.xpath("//*[@text='Motors']"));
    }
    public WebElement objTelecoms(){
        return driver.findElement(By.xpath("//*[@text='Telecoms']"));
    }
    public WebElement objTravelAndAmusement(){
        return driver.findElement(By.xpath("//*[@text='Travel/Amusement']"));
    }
    public WebElement objCharityAndReligiousBillers(){
        return driver.findElement(By.xpath("//*[@text='Charity/Religious']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objUtilities(){
        return driver.findElement(By.xpath("//*[@text='Utilities']"));
    }
    public WebElement objUtilitiesBillers(){
        return driver.findElement(By.xpath("//*[@text='Utilities']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objOthers(){
        return driver.findElement(By.xpath("//*[@text='Others']"));
    }
    public WebElement objOthersBillers(){
        return driver.findElement(By.xpath("//*[@text='Others']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objAirAsia(){
        return driver.findElement(By.xpath("//*[@text='AIR ASIA BILLSPAYMENT']"));
    }
    public WebElement objBillsPayInformation(){
        return driver.findElement(By.xpath("//*[@text='Bills Pay Information']"));
    }
    public WebElement objBillerNameInBillsPayInformation(){
        return driver.findElement(By.xpath("//*[@text='Biller']/following-sibling::android.widget.EditText"));
    }
    public WebElement objSearchBiller(){
        return driver.findElement(By.xpath("//*[@text='Search biller ...']"));
    }
    public WebElement objSearchBillerInSavedBillers(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    }
    public WebElement objMisBillsPayBiller(){
        return driver.findElement(By.xpath("//*[@text='MIS BILLSPAY123456']"));
    }
    public WebElement objEditBtn(){
        return driver.findElement(By.xpath("//*[@text='Edit']"));
    }
    public WebElement objAccountNumberField(){
        return driver.findElement(By.xpath("(//*[@text='Billing Information']/following-sibling::android.widget.EditText)[1]"));
    }
    public WebElement objFirstNameField(){
        return driver.findElement(By.xpath("(//*[@text='Billing Information']/following-sibling::android.widget.EditText)[2]"));
    }
    public WebElement objMiddleNameField(){
        return driver.findElement(By.xpath("(//*[@text='Billing Information']/following-sibling::android.widget.EditText)[3]"));
    }
    public WebElement objLastnameField(){
        return driver.findElement(By.xpath("(//*[@text='Billing Information']/following-sibling::android.widget.EditText)[4]"));
    }
    public WebElement objNickNameField(){
        return driver.findElement(By.xpath("(//*[@text='Billing Information']/following-sibling::android.widget.EditText)[5]"));
    }
    public WebElement objAmountField(){
        return driver.findElement(By.xpath("//*[@text='PHP']/following-sibling::android.widget.EditText"));
    }
    public WebElement objConfirmBtn(){
        return driver.findElement(By.xpath("//*[@text='Confirm']"));
    }
    public WebElement objConfirmDetails(){
        return driver.findElement(By.xpath("//*[@text='Confirm Details']"));
    }
    public WebElement objInvalidFirstNameMsg(){
        return driver.findElement(By.xpath("((//*[@text='Billing Information']/following-sibling::android.widget.EditText)[2]/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objInvalidSecondNameMsg(){
        return driver.findElement(By.xpath("((//*[@text='Billing Information']/following-sibling::android.widget.EditText)[2]/following-sibling::android.widget.TextView)[2]"));
    }
    public WebElement objInvalidLastName(){
        return driver.findElement(By.xpath("((//*[@text='Billing Information']/following-sibling::android.widget.EditText)[2]/following-sibling::android.widget.TextView)[3]"));
    }
    public WebElement objInvalidAmount(){
        return driver.findElement(By.xpath("//*[@text='PHP']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView"));
    }
    public WebElement objAccountNumberRequiredMsg(){
        return driver.findElement(By.xpath("((//*[@text='Billing Information']/following-sibling::android.widget.EditText)[1]/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objFirstNameRequiredMsg(){
        return driver.findElement(By.xpath("((//*[@text='Billing Information']/following-sibling::android.widget.EditText)[1]/following-sibling::android.widget.TextView)[2]"));
    }
    public WebElement objLastNameRequiredMsg(){
        return driver.findElement(By.xpath("((//*[@text='Billing Information']/following-sibling::android.widget.EditText)[1]/following-sibling::android.widget.TextView)[3]"));
    }
    public WebElement objBillerName(){
        return driver.findElement(By.xpath("(//*[@resource-id='Biller'])[2]"));
    }
    public WebElement objAccountName(){
        return driver.findElement(By.xpath("(//*[@resource-id='Account Name'])[2]"));
    }
    public WebElement objAccountNumber(){
        return driver.findElement(By.xpath("(//*[@resource-id='Account Number'])[2]"));
    }
    public WebElement objPaymentMethod(){
        return driver.findElement(By.xpath("(//*[@resource-id='Payment Method'])[2]"));
    }
    public WebElement objPayBtn(){
        return driver.findElement(By.xpath("//*[contains(@text,'Pay P')]"));
    }
    public WebElement objMaxLimitErrorMessageUpgrade(){
        return driver.findElement(By.xpath("//*[@text='Upgrade Now' or @text='Ok']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
    public WebElement objMaxLimitErrorMessage(){
        return driver.findElement(By.xpath("//*[@text='Ok']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
    public WebElement objAddBiller(){
        return driver.findElement(By.xpath("//*[@text='Add Biller']"));
    }
    public WebElement objAddBillers(){
        return driver.findElement(By.xpath("//*[@text='Add Billers']"));
    }
    public WebElement objAddSeectedBiller(){
        return driver.findElement(By.xpath("//*[@text='Biller']/preceding-sibling::android.view.ViewGroup"));
    }
    public WebElement objBillerListSearchBiller(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    }
    public WebElement objAddAccountNumber(){
        return driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[1]"));
    }
    public WebElement objAddFirstName(){
        return driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[2]"));
    }
    public WebElement objAddMiddleName(){
        return driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[3]"));
    }
    public WebElement objAddLastName(){
        return driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[4]"));
    }
    public WebElement objAddNickName(){
        return driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[5]"));
    }
    public WebElement objAddAccountNumberRequiredMsg(){
        return driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[1]/following-sibling::android.widget.TextView"));
    }
    public WebElement objAddFirstNameRequiredMsg(){
        return driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[2]/following-sibling::android.widget.TextView"));
    }
    public WebElement ObjAddLastNameRequiredMsg(){
        return driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[3]/following-sibling::android.widget.TextView"));
    }
    public WebElement objProceedBtn(){
        return driver.findElement(By.xpath("//*[@text='Proceed']"));
    }
    public WebElement objSuccessPillPaymentMsg(){
        return driver.findElement(By.xpath("//*[@text='Bills Payment Successful']"));
    }
    public WebElement objInsufficientAmountMsg(){
        return driver.findElement(By.xpath("//*[@text='Upgrade Now' or @text='Ok']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
    public WebElement objAmountPaid(){
        return driver.findElement(By.xpath("(//*[@text='Bills Payment Successful']/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objPaidDate(){
        return driver.findElement(By.xpath("(//*[@text='Bills Payment Successful']/following-sibling::android.widget.TextView)[2]"));
    }
    public WebElement objTransactionDetails(){
        return driver.findElement(By.xpath("//*[@text='Transaction Details']"));
    }
    public WebElement objReferenceNumberInCashOut(){
        return driver.findElement(By.xpath("(//*[@resource-id='Reference Number'])[2]"));
    }
    public WebElement objServiceFee(){
        return driver.findElement(By.xpath("(//*[@resource-id='Service Fee'])[2]"));
    }
    public WebElement objTotalAmount(){
        return driver.findElement(By.xpath("(//*[@resource-id='Total'])[2]"));
    }
    public WebElement objAmountToPay(){
        return driver.findElement(By.xpath("(//*[@resource-id='Amount To Pay'])[2]"));
    }
    public WebElement objAmountToSend(){
        return driver.findElement(By.xpath("(//*[@resource-id='Amount to Send'])[2]"));
    }
    public WebElement objBackToHomeBtn(){
        return driver.findElement(By.xpath("//*[@text='Back To Home']"));
    }
    public WebElement objTransactionNumber(){
        return driver.findElement(By.xpath("(//*[@resource-id='Transaction No.'])[2]"));
    }
    public WebElement objReferenceNumber(){
        return driver.findElement(By.xpath("(//*[@resource-id='Reference Number'])[2]"));
    }
    public WebElement objReceiverName(){
        return driver.findElement(By.xpath("(//*[@resource-id='Receiver Name'])[2]"));
    }
    public WebElement objReceiverMobNo(){
        return driver.findElement(By.xpath("(//*[@resource-id='Receiver Mobile No.'])[2]"));
    }
    public WebElement objSearchSavedBiller(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    }
    public WebElement objOKBtn(){
        return driver.findElement(By.xpath("//*[@text='Ok']"));
    }
    public WebElement objSelectLastName(String sLastName,String sFirstName){
        return driver.findElement(By.xpath("//*[contains(@text,'"+sLastName+", "+sFirstName+"')]"));
    }
    public WebElement objEditRecipientLastName(){
        return driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[4]"));
    }
    public WebElement ObjSaveBtn(){
        return driver.findElement(By.xpath("//*[@text='Save']"));
    }
    public WebElement objSelectBillerInnSavedBiller (String text){
        return driver.findElement(By.xpath("//*[@text='"+text+"']"));
    }
    public WebElement objRemoveBtn(){
        return driver.findElement(By.xpath("//*[@text='Remove']"));
    }
    public WebElement objConfirmPopup(){
        return driver.findElement(By.xpath("//*[@text='Are you sure to remove this record?']"));
    }
    public WebElement objNewTransactionBtn(){
        return driver.findElement(By.xpath("//*[@text='New Transaction']"));
    }
    public WebElement objRecentTransactionOne(){
        return driver.findElement(By.xpath("//*[@class='android.view.ViewGroup' and ./*[@text] and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.HorizontalScrollView']]]]]"));
    }
    public WebElement objAccountInfo(){
        return driver.findElement(By.xpath("//*[@text='Account Info']"));
    }
    public WebElement objUpgradeNowBtn(){
        return driver.findElement(By.xpath("//*[@text='Upgrade Now']"));
    }
    public WebElement objInvalidPINMsg(){
        return driver.findElement(By.xpath("//*[@text='Ok']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }

}
