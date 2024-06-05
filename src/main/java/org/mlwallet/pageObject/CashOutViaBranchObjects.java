package org.mlwallet.pageObject;

import utilities.Driver.AppiumDriverManager;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver.AppiumDriverManager;

import java.time.Duration;
public class CashOutViaBranchObjects extends AppiumDriverManager {
    public WebElement objCashOut(){
        return driver.findElement(By.xpath("//*[@text='Withdraw']"));
    }
    //=========================================== ML Branch ========================================================//
    public WebElement objToAnyMLBranch(){
        return driver.findElement(By.xpath("//*[@text='To any ML Branch']"));
    }
    public WebElement objCashOutToBranch(){
        return driver.findElement(By.xpath("//*[@text='Cash Out To Branch']"));
    }
    public WebElement objAmountField(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    }
    public WebElement objNextBtn(){
        return driver.findElement(By.xpath("//*[@text='Next']"));
    }
    public WebElement objContinueBtn(){
        return driver.findElement(By.xpath("//*[@text='Continue']"));
    }
    public WebElement objLocationPermission(){
        return driver.findElement(By.xpath("//*[@text='WHILE USING THE APP' or @text='While using the app']"));
    }
    public WebElement objCameraPermission(){
        return driver.findElement(By.xpath("//*[@text='WHILE USING THE APP' or @text='While using the app']"));
    }
    public WebElement objBackToHomeBtn(){
        return driver.findElement(By.xpath("//*[@text='Back To Home']"));
    }
    public WebElement objCreatedDate(){
        return driver.findElement(By.xpath("//*[contains(@text,'Created')]"));
    }
    public WebElement objReferenceNumber(){
        return driver.findElement(By.xpath("//*[contains(@text,'KPTN')]"));
    }
    public WebElement objReferenceNumberInCashOut(){
        return driver.findElement(By.xpath("(//*[@resource-id='Reference Number'])[2]"));
    }
    public WebElement objTransactionDetails(){
        return driver.findElement(By.xpath("(//*[@text='Transaction Details'])"));
    }
    public WebElement objBackArrowBtn(){
        return driver.findElement(By.xpath("//*[@text='Transaction Details']/preceding-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objMaxLimitTxt(){
        return driver.findElement(By.xpath("//*[@text='The maximum Branch Cash-out per transaction set for your verification level is P5,000.00. Please try again.']"));
    }
    public WebElement objMaxLimitUpgrade(){
        return driver.findElement(By.xpath("//*[@text='Upgrade Now']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
    public WebElement objInsufficientBalance(){
        return driver.findElement(By.xpath("//*[@text='There is insufficient balance on your account to proceed with this transaction. Please try again.']"));
    }
    public WebElement objGotItBtn(){
        return driver.findElement(By.xpath("//*[@text='Got It']"));
    }
    public WebElement objOkBtn(){
        return driver.findElement(By.xpath("//*[@text='Ok']"));
    }
    public WebElement objCashOutPageBackArrowBtn(){
        return driver.findElement(By.xpath("//*[@text='Cash Out']/preceding-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objCashOutOptionsBackArrowBtn(){
        return driver.findElement(By.xpath("//*[@text='Cash out / Withdraw']/preceding-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
//============================================ ML Bank ===================================================================//
    public WebElement objToAnyBank(){
        return driver.findElement(By.xpath("//*[@text='To Any Bank']"));
    }
    public WebElement BogusBank(){
        return driver.findElement(By.xpath("//*[@text='BogusBank']"));
    }
    public WebElement objBankInformation(){
        return driver.findElement(By.xpath("//*[@text='Bank Information']"));
    }
    public WebElement objAccountNumberField(){
        return driver.findElement(By.xpath("(//*[@text='BogusBank']/following-sibling::android.widget.EditText)[1]"));
    }
    public WebElement objFirstname(){
        return driver.findElement(By.xpath("(//*[@text='BogusBank']/following-sibling::android.widget.EditText)[2]"));
    }
    public WebElement objMiddleName(){
        return driver.findElement(By.xpath("(//*[@text='BogusBank']/following-sibling::android.widget.EditText)[3]"));
    }
    public WebElement objLastName(){
        return driver.findElement(By.xpath("(//*[@text='BogusBank']/following-sibling::android.widget.EditText)[4]"));
    }
    public WebElement objEmailAddress(){
        return driver.findElement(By.xpath("(//*[@text='BogusBank']/following-sibling::android.widget.EditText)[5]"));
    }
    public WebElement objCheckBox(){
        return driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
    }
    public WebElement objViewAllBtn(){
        return driver.findElement(By.xpath("//*[@text='View All']"));
    }
    public WebElement objViewAllBackBtn(){
        return driver.findElement(By.xpath("(//*[@text and ./parent::*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']]])[2]"));
    }
    public WebElement objConfirmBtn(){
        return driver.findElement(By.xpath("//*[@text='Confirm']"));
    }
    public WebElement objDragonPage(){
        return driver.findElement(By.xpath("//*[@text='Dragon Pay']"));
    }
    public WebElement objBankCashOut(){
        return driver.findElement(By.xpath("//*[@text='Bank Cash Out']"));
    }
    public WebElement objBank(){
        return driver.findElement(By.xpath("(//*[@text='Bank Information']/following-sibling::android.widget.TextView)[2]"));
    }
    public WebElement objTransactionNo(){
        return driver.findElement(By.xpath("//*[@text='Transaction No.']/following-sibling::android.widget.TextView"));
    }
    public WebElement objTransactionReferenceNo(){
        return driver.findElement(By.xpath(""));
    }
    public WebElement objTransactionSuccessMessage(){
        return driver.findElement(By.xpath("//*[@text='Transaction Successful']"));
    }
    public WebElement objTransactionReceipt(){
        return driver.findElement(By.xpath("//*[@text='Transaction Receipt']"));
    }
    public WebElement objAccInvalidErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Ok']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
    public WebElement objBackArrow(){
        return driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[./*[./*[@class='android.widget.ScrollView']]]]]]]"));
    }
    public WebElement objBankListBackArrow(){
        return driver.findElement(By.xpath("//*[@text='Bank List']/preceding-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objDragonPayPopUpMsg(){
        return driver.findElement(By.xpath("//*[@text='Continue']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
    public WebElement objBankMaxLimitTxt(){
        return driver.findElement(By.xpath("//*[@text='The maximum Branch Cash-out per transaction set for your verification level is P40,000.00. Please try again.']"));
    }
    public WebElement objMinimumTransactionErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Ok']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
    public WebElement objReceiversName(){
        return driver.findElement(By.xpath("//*[@text='Review Transaction']"));
    }
//============================================= Phase 2 ==============================================//
    public WebElement objSearchBank(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    }
    public WebElement objNoRecentTransactionTxt(){
        return driver.findElement(By.xpath("//*[@text='No Recent Transaction']"));
    }
    public WebElement objAmountRequiredErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='PHP']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView"));
    }
    public WebElement objNickName(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    }
    public WebElement objSaveRecipientBtn(){
        return driver.findElement(By.xpath("//*[@text='Save Recipient']"));
    }
    public WebElement objSavedBankAccount(){
        return driver.findElement(By.xpath("//*[@text='Saved Bank Accounts']"));
    }
    public WebElement objNickNameInSavedBankAcc(String sNickName){
        return driver.findElement(By.xpath("//*[@text='"+sNickName+"']"));
    }
    public WebElement objRecipientExistMsg(){
        return driver.findElement(By.xpath("//*[@text='Recipient already exists.']"));
    }
    public WebElement objCashOutWithdraw(){
        return driver.findElement(By.xpath("//*[@text='Cash out / Withdraw']"));
    }
    public WebElement objCashOutOptions(){
        return driver.findElement(By.xpath("//*[@text='Cash out options']"));
    }
    public WebElement objCashOutOngoingTransaction(){
        return driver.findElement(By.xpath("//*[@text='Ongoing Transactions']"));
    }
    public WebElement objReferenceNumberCashOutBranch(){
        return driver.findElement(By.xpath("(//*[@text='Reference Number']/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objCashOutPage(){
        return driver.findElement(By.xpath("//*[@text='Cash Out']"));
    }
    public WebElement ObjCashOutToBranch(){
        return driver.findElement(By.xpath("//*[@text='Cash Out To Branch']"));
    }
    public WebElement objUserName(){
        return driver.findElement(By.xpath("(//*[@text='Cash Out To Branch']/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objUserMobileNumber(){
        return driver.findElement(By.xpath("(//*[@text='Cash Out To Branch']/following-sibling::android.widget.TextView)[2]"));
    }
    public WebElement objMLWalletBalance(){
        return driver.findElement(By.xpath("//*[contains(@text,'ML Wallet Balance')]"));
    }
    public WebElement objCashOutInstructions(){
        return driver.findElement(By.xpath("//*[@text='Cash Out']//following-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement cashOutBackArrowBtn(){
        return driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup' and ./*[@class='android.widget.ScrollView']]]]]/*/*[@text and ./parent::*[@class='android.view.ViewGroup']])[1]"));
    }
    public WebElement objCashOutToBranchBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Cash Out']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    public WebElement objResendCode(){
        return driver.findElement(By.xpath("//*[contains(@text,'Resend Code')]"));
    }
    public WebElement objOneTimePinBackBtn(){
        return driver.findElement(By.xpath("//*[@text='One Time Pin']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    public WebElement objReviewTransaction(){
        return driver.findElement(By.xpath("//*[@text='Review Transaction']"));
    }
    public WebElement objReceiverName(){
        return driver.findElement(By.xpath("//*[@resource-id='CQIWYB']"));
    }
    public WebElement objBankName(){
        return driver.findElement(By.xpath("//*[@resource-id='UMQBR2']"));
    }
    public WebElement objAccountNumber(){
        return driver.findElement(By.xpath("//*[@resource-id='WQMCNC']"));
    }
    public WebElement objAmount(){
        return driver.findElement(By.xpath("//*[@resource-id='C9ZSVZ']"));
    }
    public WebElement objServiceFee(){
        return driver.findElement(By.xpath("//*[@resource-id='M3JX35']"));
    }
    public WebElement objTotalAmountDeduct(){
        return driver.findElement(By.xpath("//*[@resource-id='PR4KMJ']"));
    }
    public WebElement objEmailAddressUpdated(){
        return driver.findElement(By.xpath("//*[@resource-id='5NTB7H']"));
    }
    public WebElement objNewTransaction(){
        return driver.findElement(By.xpath("//*[@text='New Transaction']"));
    }
    public WebElement objPHP(){
        return driver.findElement(By.xpath("//*[contains(@text,'PHP')]"));
    }
    public WebElement objCancelIcon(){
        return driver.findElement(By.xpath("//*[@text='Cash Out']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    public WebElement objUpgradeNowBtn(){
        return driver.findElement(By.xpath("//*[@text='Upgrade Now']"));
    }
    public WebElement objAccountNumberRequiredMsg(){
        return driver.findElement(By.xpath("//*[@text='Account Number is required']"));
    }
    public WebElement objFirstNameRequiredMsg(){
        return driver.findElement(By.xpath("//*[@text='First name is required']"));
    }
    public WebElement objMiddleNameRequiredMsg(){
        return driver.findElement(By.xpath("//*[@text='Middle name is required']"));
    }
    public WebElement objLastNameRequiredMsg(){
        return driver.findElement(By.xpath("//*[@text='Last name is required']"));
    }
    public WebElement objEmailAddressRequiredMsg(){
        return driver.findElement(By.xpath("//*[@text='Email address is required']"));
    }
    public WebElement objReceiverNameInTransactionReceipt(){
        return driver.findElement(By.xpath("(//*[@text=concat('Receiver', \"'\", 's Name')]/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objBankNamInTransactionReceipt(){
        return driver.findElement(By.xpath("(//*[@text='Bank Name']/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objAccountNumberInTransactionReceipt(){
        return driver.findElement(By.xpath("(//*[@text='Account Number']/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objPrincipalAmount(){
        return driver.findElement(By.xpath("(//*[@text='Principal Amount']/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objServiceFeeInTransactionReceipt(){
        return driver.findElement(By.xpath("(//*[@text='Service Fee']/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objNetAmount(){
        return driver.findElement(By.xpath("(//*[@text='Net Amount']/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objEmailInTransactionReceipt(){
        return driver.findElement(By.xpath("(//*[@text='Email']/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objDate(){
        return driver.findElement(By.xpath("(//*[@text='Date']/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objType(){
        return driver.findElement(By.xpath("(//*[@text='Type']/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objAddToSavedRecipients(){
        return driver.findElement(By.xpath("//*[@text='Add to Saved Recipients']"));
    }
    public WebElement objInvalidAmountMsg(){
        return driver.findElement(By.xpath("//*[@text='PHP']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView"));
    }
    public WebElement objAccountNumberInSavedBankAccount(){
        return driver.findElement(By.xpath("(((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']]]/*/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']]])[1]/*/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']]])[1]/*[@text])[3]"));
    }
    public WebElement objThreeDotMenuButton(){
        return driver.findElement(By.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']]]/*/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']]])[1]/*/*/*/*[@text and ./parent::*[@class='android.view.ViewGroup']])[4]"));
    }
    public WebElement objEditBtn(){
        return driver.findElement(By.xpath("//*[@text='Edit']"));
    }
    public WebElement objDeleteBtn(){
        return driver.findElement(By.xpath("//*[@text='Delete']"));
    }
    public WebElement objAccountNumber(String sAccountNumber){
        return driver.findElement(By.xpath("//*[@text='"+sAccountNumber+"']"));
    }
    public WebElement objAccountNumberInEditRecipient(){
        return driver.findElement(By.xpath("//*[@text='Account Number']/following-sibling::android.widget.EditText"));
    }
    public WebElement objEditRecipientBackBtn(){
        return driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup' and ./*[@class='android.view.ViewGroup']]]]]/*/*[@class='android.widget.TextView' and ./parent::*[@class='android.view.ViewGroup']])[1]"));
    }
    public WebElement objAppInfo(){
        return driver.findElement(By.xpath("//*[@text='App info']"));
    }
    public WebElement objInvalidPINMsg(){
        return driver.findElement(By.xpath("//*[@text='Ok']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
}
