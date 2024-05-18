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
public class KwartaPadalaObjects extends AppiumDriverManager {
     public WebElement objSendTransferBtn(){
        return driver.findElement(By.xpath("//*[@text='Send']"));
    }
    //(//*[@text='Cash In']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup)[1]/child::android.view.ViewGroup/child::android.widget.TextView
     public WebElement objSendMoney(){
        return driver.findElement(By.xpath("//*[@text='Send Money']"));
    }

     public WebElement objSendWalletOptions(){
        return driver.findElement(By.xpath("//*[@text='Send Wallet Options']"));
    }
     public WebElement objToAnyMLBranch(){
        return driver.findElement(By.xpath("//*[@text='To any ML Branch']"));
    }

     public WebElement objFirstname(){
        return driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[1]"));
    }

//     public WebElement objMiddleName(){
//        return driver.findElement(By.xpath("(//*[@class='android.widget.ImageView']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.widget.EditText)[1]"));
//    }

     public WebElement objMiddleName(){
        return driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[2]"));
    }

     public WebElement objLastName(){
        return driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[3]"));
    }

     public WebElement objMobileNumber(){
        return driver.findElement(By.xpath("//*[@text='+63']/following-sibling::android.widget.EditText"));
    }

     public WebElement objCheckBox(){
        return driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
    }

     public WebElement objNextBtn(){
        return driver.findElement(By.xpath("//*[@text='Next']"));
    }

     public WebElement objSavedRecipients(){
        return driver.findElement(By.xpath("//*[@text='Saved Recipients']"));
    }

     public WebElement objKwartaPadala(){
        return driver.findElement(By.xpath("//*[@text='Kwarta Padala']"));
    }

     public WebElement objSelectPaymentMethod(){
        return driver.findElement(By.xpath("//*[@text='Select Payment Method']"));
    }

     public WebElement objMLWalletBalance(){
        return driver.findElement(By.xpath("//*[@text='ML Wallet balance']"));
    }

     public WebElement objAvailableBalance(){
        return driver.findElement(By.xpath("//*[@text='ML Wallet balance']/following-sibling::android.widget.TextView"));
    }

     public WebElement objAmountTxtField(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    }

     public WebElement objConfirmDetails(){
        return driver.findElement(By.xpath("//*[@text='Confirm Details']"));
    }

     public WebElement objConfirmBtn(){
        return driver.findElement(By.xpath("//*[@text='Confirm']"));
    }

     public WebElement objLocationPermission(){
        return driver.findElement(By.xpath("//*[@text='WHILE USING THE APP']"));
    }

     public WebElement objSendMoneySuccessful(){
        return driver.findElement(By.xpath("//*[@text='Send Money Successful']"));
    }

     public WebElement objPHPAmount(){
        return driver.findElement(By.xpath("(//*[@text='Send Money - Kwarta Padala Successful']/following-sibling::android.widget.TextView)[1]"));
    }

     public WebElement objDate(){
        return driver.findElement(By.xpath("(//*[@text='Send Money - Kwarta Padala Successful']/following-sibling::android.widget.TextView)[2]"));
    }

     public WebElement objReferenceNumber(){
        return driver.findElement(By.xpath("//*[contains(@text,'Ref. No')]"));
    }

     public WebElement objReferenceNumberInTransactionDetails(){
        return driver.findElement(By.xpath("(//*[@resource-id='Reference Number'])[2]"));
    }
     public WebElement objBackToHomeBtn(){
        return driver.findElement(By.xpath("//*[@text='Back To Home']"));
    }

     public WebElement objSelectRecipient(){
        return driver.findElement(By.xpath("//*[@text='Select Recipient']"));
    }

     public WebElement objSearchRecipient(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    }

     public WebElement objAddRecipient(){
        return driver.findElement(By.xpath("//*[@text='Add Recipient']"));
    }

     public WebElement objSavedRecipientsList(){
        return driver.findElement(By.xpath("//*[contains(@text,'+63')]/preceding-sibling::android.widget.TextView"));
    }

     public WebElement objNoRecentTransactionTxt(){
        return driver.findElement(By.xpath("//*[@text='No Recent Transaction']"));
    }
     public WebElement objNickName(){
        return driver.findElement(By.xpath("//*[@text='Nickname']"));
    }

    public WebElement ObjSaveRecipient(){
        return driver.findElement(By.xpath("//*[@text='Save Recipient']"));
    }


     public WebElement objBackArrow(){
        return driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']]] and (./preceding-sibling::* | ./following-sibling::*)[@text]]]"));
    }

     public WebElement objDeleteRecipient(){
        return driver.findElement(By.xpath("//*[@text='Delete']"));
    }

     public WebElement objEditRecipient(){
        return driver.findElement(By.xpath("//*[@text='Edit']"));
    }

     public WebElement objPopupMsg(){
        return driver.findElement(By.xpath("//*[@text='Remove']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }

     public WebElement objRemoveBtn(){
        return driver.findElement(By.xpath("//*[@text='Remove']"));
    }

     public WebElement objContactAlreadyExistMsg(){
        return driver.findElement(By.xpath("//*[@text='Contact already exists.']"));
    }

     public WebElement objOkBtn(){
        return driver.findElement(By.xpath("//*[@text='Ok']"));
    }
     public WebElement objEditRecipientLastName(){
        return driver.findElement(By.xpath("(//*[@text='Middle Name']/following-sibling::android.widget.EditText)[1]"));
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
     public WebElement objMobileNumberRequiredMsg(){
        return driver.findElement(By.xpath("//*[@text='Mobile number is required']"));
    }
     public WebElement objFirstNameErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='First name must only contain letters and spaces']"));
    }
     public WebElement objMiddleNameErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Middle name must only contain letters and spaces']"));
    }
     public WebElement objLastNameErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Last name must only contain letters and spaces']"));
    }
     public WebElement objMobileNumberErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Mobile number is invalid']"));
    }
     public WebElement objReferenceNumberInTransaction(){
        return driver.findElement(By.xpath("//*[contains(@text,'KPTN')]"));
    }

     public WebElement objInvalidAmountMsg(){
        return driver.findElement(By.xpath("//*[@text='PHP']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView"));
    }

     public WebElement objInsufficientAmountMsg(){
        return driver.findElement(By.xpath("//*[@text='Upgrade Now' or @text='Ok']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }

     public WebElement objMaxLimitErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Ok']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
     public WebElement objErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Upgrade Now']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }

     public WebElement objUpgradeNowBtn(){
        return driver.findElement(By.xpath("//*[@text='Upgrade Now']"));
    }

//======================================== Send to Wallet User ===================================//

     public WebElement objToAMLWalletUser(){
        return driver.findElement(By.xpath("//*[@text='To a ML Wallet user']"));
    }

     public WebElement objMobileNumberField(){
        return driver.findElement(By.xpath("//*[@text='Mobile Number']/following-sibling::android.widget.EditText"));
    }

     public WebElement objSendPHPBtn(){
        return driver.findElement(By.xpath("//*[contains(@text,'Send Php')]"));
    }

     public WebElement objSendMoneyMLWallet(){
        return driver.findElement(By.xpath("//*[@text='Send Money - ML Wallet Successful']"));
    }

     public WebElement objSendMoneyMLWalletDate(){
        return driver.findElement(By.xpath("(//*[@text='Send Money - ML Wallet Successful']/following-sibling::android.widget.TextView)[2]"));
    }

     public WebElement objSendMoneyMLWalletPHP(){
        return driver.findElement(By.xpath("(//*[@text='Send Money - ML Wallet Successful']/following-sibling::android.widget.TextView)[1]"));
    }

     public WebElement objMLWalletReferenceNumber(){
        return driver.findElement(By.xpath("(//*[@resource-id='Transaction No.'])[2]"));
    }

     public WebElement objViewAllBtn(){
        return driver.findElement(By.xpath("//*[@text='View All']"));
    }

     public WebElement objRecentFavorites(){
        return driver.findElement(By.xpath("//*[@text='Recent Favorites']"));
    }

     public WebElement objReceiver(){
        return driver.findElement(By.xpath("//*[@text='Receiver']"));
    }

     public WebElement objFavorites(){
        return driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.HorizontalScrollView']]/*/*[@class='android.view.ViewGroup' and ./*[@text]])[1]"));
    }

     public WebElement objEllipsisBtn(){
        return driver.findElement(By.xpath("//*[@text='Singh, Sharath Nm']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup"));
    }

     public WebElement objDeleteBtn(){
        return driver.findElement(By.xpath("//*[@text='Delete']"));
    }

     public WebElement objSaveToMyFavorite(){
        return driver.findElement(By.xpath("//*[@text='Save to my favorite']"));
    }

     public WebElement objAddedToFavoritesMsg(){
        return driver.findElement(By.xpath("//*[@text='Successfully Added to Favorites']"));
    }

     public WebElement objSelectFavorite(){
        return driver.findElement(By.xpath("(//*[@class='android.widget.HorizontalScrollView']/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView)[1]"));
    }

     public WebElement objUnRegisteredMobNumber(){
        return driver.findElement(By.xpath("//*[@text='Receiver not Found!']"));
    }

     public WebElement objFavRemovedMsg(){
        return driver.findElement(By.xpath("//*[@text='Successfully Removed']"));
    }


     public WebElement objToMLWalletUser(){
        return driver.findElement(By.xpath("//*[@text='To ML Wallet User']"));
    }

     public WebElement objTransactionDetails(){
        return driver.findElement(By.xpath("//*[@text='Transaction Details']"));
    }
     public WebElement objReceiverName(){
        return driver.findElement(By.xpath("(//*[@resource-id='Receiver Name'])[2]"));
    }
     public WebElement objReceiverMobileNo(){
        return driver.findElement(By.xpath("(//*[@resource-id='Receiver Mobile No.'])[2]"));
    }
     public WebElement objPaymentMethod(){
        return driver.findElement(By.xpath("(//*[@resource-id='Payment Method'])[2]"));
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

     public WebElement objNewTransaction(){
        return driver.findElement(By.xpath("//*[@text='New Transaction']"));
    }

     public WebElement objAmountToSend(){
        return driver.findElement(By.xpath("//*[@text='Amount to Send']"));
    }

     public WebElement objKwartaPadalaDate(){
        return driver.findElement(By.xpath("//*[@text='Kwarta Padala']/following-sibling::android.widget.TextView"));
    }

     public WebElement objFavoriteReceiver(){
        return driver.findElement(By.xpath("//*[@text='09999999996']"));
    }

     public WebElement ObjFavorites(){
        return driver.findElement(By.xpath("//*[@text='Favorites']"));
    }

     public WebElement objSearchFavoriteField(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    }

     public WebElement objCancelTransaction(){
        return driver.findElement(By.xpath("//*[@text='Cancel Transaction']"));
    }

     public WebElement objAddedFavorite(){
        return driver.findElement(By.xpath("//*[@text='Singh, Sharath Nm']"));
    }
     public WebElement objKwartaPadalaRatesBtn(){
        return driver.findElement(By.xpath("//*[@text='Kwarta Padala Rates']"));
    }
     public WebElement objKwartaPadalaRates(){
        return driver.findElement(By.xpath("//*[@class='android.widget.ScrollView']/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView"));
    }
     public WebElement objWalletToWalletStatus(){
        return driver.findElement(By.xpath("((//*[@text='Wallet to Wallet'])[1]/preceding-sibling::android.view.ViewGroup/child::android.widget.TextView)[2]"));
    }

     public WebElement objAppInfo(){
        return driver.findElement(By.xpath("//*[@text='App info']"));
    }
     public WebElement objInvalidPINMsg(){
        return driver.findElement(By.xpath("//*[@text='Ok']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }

}
