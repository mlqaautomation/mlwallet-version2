package org.mlwallet.pageObject;

import org.openqa.selenium.By;
import utilities.Driver.AppiumDriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver.AppiumDriverManager;

public class GCashObjects extends AppiumDriverManager {
    //-------------GCash Services Page
    public WebElement objGcashText(){
        return driver.findElement(By.xpath("//*[@text='GCash']"));
    }
    public WebElement objGcashServicesText(){
        return driver.findElement(By.xpath("//*[@text='GCash Services']"));
    }
    public WebElement objGcashOptionsText(){
        return driver.findElement(By.xpath("//*[@text='GCash Options']"));
    }
    //-------------Send Money GCash Page
    public WebElement objGcashSendMoneyText(){
        return driver.findElement(By.xpath("//*[@text='Send Money']"));
    }
    public WebElement objSendMoneyPageHeader(){
        return driver.findElement(By.xpath("//*[@text='Send Money to GCash']"));
    }
    public WebElement objSendMoneyReceiverText(){
        return driver.findElement(By.xpath("//*[@text='Receiver']"));
    }
    public WebElement objGcashMobileNumber(){
        return driver.findElement(By.xpath("//*[@text='+63']/following-sibling::android.widget.EditText"));
    }

    //-----------------------Contact Page
    public WebElement objContactPageHeader(){
        return driver.findElement(By.xpath("(//*[@text='Contacts'])[1]"));
    }
    public WebElement objContactButton(){
        return driver.findElement(By.xpath("(//*[@text='Contacts'])[2]"));
    }
    public WebElement objSelectContactText(){
        return driver.findElement(By.xpath("//*[@text='Select from Contacts']"));
    }
    public WebElement objSearchBox(){
        return driver.findElement(By.xpath("//*[@text='Search']"));
    }
    public WebElement objFavoritesBtn(){
        return driver.findElement(By.xpath("//*[@text='Favorites']"));
    }
    public WebElement objOkAllowContacts(){
        return driver.findElement(By.xpath("//*[@text='Allow']"));
    }
    public WebElement objGetErrMsg(String msg){
        return driver.findElement(By.xpath("//*[@text='"+msg+"']"));
    }
    //-------------------------------Send Money GCash Amount Page
    public WebElement objAmountTextBox(){
        return driver.findElement(By.xpath("//*[@text='PHP']/following-sibling::android.widget.EditText"));
    }
    public WebElement objNextBtn(){
        return driver.findElement(By.xpath("//*[@text='Next']"));
    }
    public WebElement objGcashMobileNumText(){
        return driver.findElement(By.xpath("//*[@resource-id='JBOTZ0']"));
    }
    public WebElement objReceiverNumber(){
        return driver.findElement(By.xpath("//*[@resource-id='X8L073']"));
    }

    public WebElement objProceedBtn(){
        return driver.findElement(By.xpath(" //*[@text='Yes, Proceed Transaction']"));
    }
    //--------------------------Confirm Details Page
    public WebElement objConfirmDetailsPage(){
        return driver.findElement(By.xpath("//*[@text='Confirm Details']"));
    }
    public WebElement objConfirmBtn(){
        return driver.findElement(By.xpath("//*[@text='Confirm']"));
    }
    public WebElement objSendtoGCash_Confirm(){
        return driver.findElement(By.xpath("//*[@text='Send Money to GCash']"));
    }
    public WebElement objReceiverNumber_Confirm(){
        return driver.findElement(By.xpath("//*[@resource-id='ZM8UHR']/child::*[2]"));
    }
    public WebElement objSenderName_Confirm(){
        return driver.findElement(By.xpath("//*[@resource-id='I4U5Q4']/child::*[2]"));
    }
    public WebElement objSenderNumber_Confirm(){
        return driver.findElement(By.xpath("//*[@resource-id='X3HARL']/child::*[2]"));
    }
    public WebElement objAmount_Confirm(){
        return driver.findElement(By.xpath("//*[@resource-id='YTS3NI']/child::*[2]"));
    }
    public WebElement objServiceFee_Confirm(){
        return driver.findElement(By.xpath("//*[@resource-id='DTMI0G']/child::*[2]"));
    }
    public WebElement objTotal_Confirm(){
        return driver.findElement(By.xpath("//*[@resource-id='ID316A']/child::*[2]"));
    }
    //------------------allow location
    public WebElement objAllowOnceBtn(){
        return driver.findElement(By.xpath("//*[@text='Only this time']"));
    }
    public WebElement objUpgrade50kNowLabel(){
        return driver.findElement(By.xpath("//*[@text='The maximum Send to GCash per transaction set for your verification level is P50,000.00. Please try again.']"));
    }
    public WebElement objUpgradeNowLabel(){
        return driver.findElement(By.xpath("//*[@text='Send to GCash is not allowed for customers at this verification level. Please upgrade your account to use this service.']"));
    }
    public WebElement objUpgradeBtn(){
        return driver.findElement(By.xpath("//*[@text='Upgrade Now']"));
    }
    public WebElement objSendMoney_WalletUserBtn(){
        return driver.findElement(By.xpath("//*[@text='Send Money to ML Wallet User']"));
    }
    //--------------- Transaction Detail Page
    public WebElement objSendtoGCash_Transaction(){
        return driver.findElement(By.xpath("//*[@text='Send Money to GCash']"));
    }
    public WebElement objAmountSendTransactText(){
        return driver.findElement(By.xpath("//*[@text='Send Money to GCash']/following-sibling::*[1]"));
    }
    public WebElement objTransactionDetailsText(){
        return driver.findElement(By.xpath("//*[@resource-id='2VIMA3']"));
    }
    public WebElement objReceiverNumber_Transaction(){
        return driver.findElement(By.xpath("//*[@resource-id='ZM8UHR']/child::*[2]"));
    }
    public WebElement objSenderName_Transaction(){
        return driver.findElement(By.xpath("//*[@resource-id='I4U5Q4']/child::*[2]"));
    }
    public WebElement objSenderNumber_Transaction(){
        return driver.findElement(By.xpath("//*[@resource-id='X3HARL']/child::*[2]"));
    }
    public WebElement objGcashAmount(){
        return driver.findElement(By.xpath("//*[@resource-id='YTS3NI']/child::*[2]"));
    }
    public WebElement objGcashServiceFee(){
        return driver.findElement(By.xpath("//*[@resource-id='DTMI0G']/child::*[2]"));
    }
    public WebElement objGcashTotal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Total'])[2]"));
    }
    public WebElement objGcashReminder(){
        return driver.findElement(By.xpath("//*[@resource-id='ARX1Q6']"));
    }
    public WebElement objBack_to_Home_Page(){
        return driver.findElement(By.xpath("//*[@resource-id='TN8ENX']"));
    }
    public WebElement objNew_Transaction(){
        return driver.findElement(By.xpath("//*[@resource-id='22M10L']"));
    }
    public WebElement objPendingText(){
        return driver.findElement(By.xpath("//*[@text='Pending']"));
    }
    //--------------------No Gcash Kwarta Padala
    public WebElement objNoGCashOtherOptionLabel(){
        return driver.findElement(By.xpath("//*[@text='This number does not have a GCash-registered account. Please check the number and try again.']"));
    }
    public WebElement objSendViaMLKwartaWallelabel(){
        return driver.findElement(By.xpath("//*[@text='You may also use ML Kwarta Padala to send cash to anyone in the Philippines.']"));
    }
    public WebElement objSendViaMLKwartaPadalaBtn(){
        return driver.findElement(By.xpath("//*[@text='Send Money via ML Kwarta Padala']"));
    }

    public WebElement objCloseBtn(){
        return driver.findElement(By.xpath("//*[@text='Close']"));
    }
    public WebElement objSendViaMLWalletlabel(){
        return driver.findElement(By.xpath("//*[@text='You may also Send Money to any ML Wallet User.']"));
    }
    public WebElement objSendViaMLWalletBtn(){
        return driver.findElement(By.xpath(" //*[@text='Send Money to ML Wallet User']"));
    }
    //---------------------------------
    public WebElement objRecentPendingText(){
        return driver.findElement(By.xpath("(//*[contains(@content-desc, \"Pending\")])[1]"));
    }
    public WebElement objRecentSucessText(){
        return driver.findElement(By.xpath("(//*[contains(@content-desc, \"Completed\")])[1]"));
    }
    public WebElement objRecentFailedText(){
        return driver.findElement(By.xpath("(//*[contains(@content-desc, \"Failed\")])[1]"));
    }
    public WebElement objGcashPage_BackBtn(){
        return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"\uE5CB\"]/android.widget.TextView"));
    }
    public WebElement objIsRequired(String val){
        return driver.findElement(By.xpath("//*[@text='"+val+"']"));
    }
}
