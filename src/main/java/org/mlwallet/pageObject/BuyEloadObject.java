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
public class BuyEloadObject extends AppiumDriverManager {

     public WebElement objEloadTab(){
        return driver.findElement(By.xpath("//*[@text='eLoad']"));
    }
     public WebElement objEloadtransactionPage(){
        return driver.findElement(By.xpath("//*[@text='eLoad Transaction']"));
    }
     public WebElement objSelectTelco(){
        return driver.findElement(By.xpath("//*[@text='Select Telco']"));
    }
     public WebElement objPhoneToLoad(){
        return driver.findElement(By.xpath("//*[@text='Phone to load']"));
    }
     public WebElement objSelectFromContacts(){
        return driver.findElement(By.xpath("//*[@text='Select from Contacts']"));
    }
     public WebElement objSelectSmartTelco(){
        return driver.findElement(By.xpath("//*[@resource-id='BPNJRD-2']"));
    }

     public WebElement objPromoLoads(){
        return driver.findElement(By.xpath("//*[@text='PHP']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/(descendant::android.widget.TextView)[1]"));
    }


    //	 public WebElement objTelecommunicationTab(){
//        return driver.findElement(By.xpath("//*[android.view.ViewGroup]/following-sibling::android.view.ViewGroup/(descendant::android.widget.ImageView)[4]"));
//    }
     public WebElement objMobileNoField(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    }
     public WebElement objNextBtn(){
        return driver.findElement(By.xpath("//*[@text='Next']"));
    }
     public WebElement objLoadSelectionPage(){
        return driver.findElement(By.xpath("//*[@text='Load Selection']"));
    }
     public WebElement objPromoLoadTab(){
        return driver.findElement(By.xpath("//*[@text='Promo Load']"));
    }
     public WebElement objRegularLoadTab(){
        return driver.findElement(By.xpath("//*[@text='Regular Load']"));
    }
    //	 public WebElement objTransaction(){
//        return driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*/*[@class='android.view.ViewGroup' and ./*[./*[@text]]])[1]"));
//    }
     public WebElement objTransaction(){
        return driver.findElement(By.xpath("(//*[@text='LD'])[2]"));
    }
     public WebElement objContinuePromoPopUp(){
        return driver.findElement(By.xpath("//*[@text='Would you like to continue with this promo?']"));
    }
     public WebElement objPromoName(){
        return driver.findElement(By.xpath("(//*[android.view.ViewGroup]/child::android.view.ViewGroup/child::android.widget.TextView)[5]"));
    }
     public WebElement objPromoConfirmationPopup(){
        return driver.findElement(By.xpath("//*[@text='Confirm']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
     public WebElement objConfirmBtn(){
        return driver.findElement(By.xpath("//*[@text='Confirm']"));
    }
     public WebElement objCancelBtn(){
        return driver.findElement(By.xpath("//*[@text='Cancel']"));
    }
     public WebElement objTransactionDetailsPage(){
        return driver.findElement(By.xpath("//*[@text='Transaction Details']"));
    }
     public WebElement objTypeOfPromoUsed(){
        return driver.findElement(By.xpath("(//*[@resource-id='Type'])[2]"));
    }
     public WebElement objMobileNumber(){
        return driver.findElement(By.xpath("(//*[@resource-id='Mobile Number'])[2]"));
    }
     public WebElement objAmountToSend(){
        return driver.findElement(By.xpath("(//*[@resource-id='Amount to Send'])[2]"));
    }
     public WebElement objServiceFee(){
        return driver.findElement(By.xpath("(//*[@resource-id='Service Fee'])[2]"));
    }
     public WebElement objTotalAmount(){
        return driver.findElement(By.xpath("(//*[@resource-id='Total'])[2]"));
    }
     public WebElement objErrorMsg(){
        return driver.findElement(By.xpath("//*[android.widget.EditText]/following-sibling::android.widget.TextView"));
    }
     public WebElement objInsufficientBalPopup(){
        return driver.findElement(By.xpath("//*[@text='Ok']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
     public WebElement objOkBtn(){
        return driver.findElement(By.xpath("//*[@text='Ok']"));
    }
     public WebElement objMobileNumberInTransactionDetails(){
        return driver.findElement(By.xpath("(//*[@text='Successfully bought load for']/following-sibling::android.widget.TextView)[1]"));
    }
     public WebElement objELoadAmount(){
        return driver.findElement(By.xpath("(//*[@text='Successfully bought load for']/following-sibling::android.widget.TextView)[2]"));
    }
     public WebElement objBuyELoadTime(){
        return driver.findElement(By.xpath("(//*[@text='Successfully bought load for']/following-sibling::android.widget.TextView)[3]"));
    }
     public WebElement objBuyELoadStatus(){
        return driver.findElement(By.xpath("(//*[@text='Successfully bought load for']/following-sibling::android.widget.TextView)[4]"));
    }

     public WebElement objMaxLimitPopupMsg(){
        return driver.findElement(By.xpath("//*[@text='Ok']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
     public WebElement obj3000RegularLoad(){
        return driver.findElement(By.xpath("(//*[@text='Globe Regular Load 3000'])[1]"));
    }
     public WebElement obj2000RegularLoad(){
        return driver.findElement(By.xpath("(//*[@text='Globe Regular Load 2000'])[1]"));
    }

     public WebElement obj2000PromoLoad(){
        return driver.findElement(By.xpath("(//*[@text='LD2000'])[1]"));
    }
     public WebElement obj3000PromoLoad(){
        return driver.findElement(By.xpath("(//*[@text='LD3000'])[1]"));
    }
     public WebElement objBuyLoad(){
        return driver.findElement(By.xpath("//*[@text='Buy Load']"));
    }
     public WebElement objLoadSelectionBackArrowBtn(){
        return driver.findElement(By.xpath("//*[@text='Load Selection']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
     public WebElement objMobileNumberInLoadSelection(){
        return driver.findElement(By.xpath("//*[@text='+63']/following-sibling::android.widget.TextView"));
    }
     public WebElement objChange (){
        return driver.findElement(By.xpath("//*[@text='Change']"));
    }
     public WebElement objWalletBalanceInLoadSeletion(){
        return driver.findElement(By.xpath("//*[@text='Change']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.widget.TextView"));
    }
     public WebElement objLoadWithAmount(){
        return driver.findElement(By.xpath("(//*[@text='Transaction Details']//parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup)[1]/child::android.widget.TextView"));
    }
     public WebElement objContacts (){
        return driver.findElement(By.xpath("//*[@text='Contacts']"));
    }
     public WebElement objAllowBtn(){
        return driver.findElement(By.xpath("//*[@text='Allow' or @text='ALLOW']"));
    }
     public WebElement objSearch(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    }
     public WebElement objContactsBtn(){
        return driver.findElement(By.xpath("(//*[@text='Contacts'])[2]"));
    }
     public WebElement objFavorites(){
        return driver.findElement(By.xpath("//*[@text='Favorites']"));
    }
     public WebElement objContactsPageBackBtn(){
        return driver.findElement(By.xpath("(//*[@text='Contacts'])[1]/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
     public WebElement objSearchedContactName(){
        return driver.findElement(By.xpath("(((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and ./parent::*[./parent::*[./parent::*[@class='android.widget.FrameLayout']]]]]/*[@class='android.view.ViewGroup'])[1]/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']])[1]/*[@class='android.widget.TextView'])[1]"));
    }
     public WebElement objSearchedContactNumber(){
        return driver.findElement(By.xpath("(((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and ./parent::*[./parent::*[./parent::*[@class='android.widget.FrameLayout']]]]]/*[@class='android.view.ViewGroup'])[1]/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']])[1]/*[@class='android.widget.TextView'])[2]"));
    }
     public WebElement objAddToFavoriteIcon(){
        return driver.findElement(By.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and ./parent::*[./parent::*[./parent::*[@class='android.widget.FrameLayout']]]]]/*[@class='android.view.ViewGroup'])[1]/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']])[2]/child::android.widget.TextView"));
    }
     public WebElement objNoFavoritesFoundMsg(){
        return driver.findElement(By.xpath("//*[@text='No favorites found']"));
    }
     public WebElement objNoContactsFoundMsg(){
        return driver.findElement(By.xpath("//*[@text='No contacts found']"));
    }
     public WebElement objBackToHomeBtn(){
        return driver.findElement(By.xpath("//*[@text='Back To Home']"));
    }
     public WebElement objAppInfo(){
        return driver.findElement(By.xpath("//*[@text='App info']"));
    }
     public WebElement objContactPopupMsg(){
        return driver.findElement(By.xpath("//*[@resource-id='android:id/message']"));
    }
     public WebElement objAskMeLater(){
        return driver.findElement(By.xpath("//*[@resource-id='android:id/button3']"));
    }
     public WebElement objAllowAccess(){
        return driver.findElement(By.xpath("//*[@resource-id='android:id/button1']"));
    }
     public WebElement objNewTransaction(){
        return driver.findElement(By.xpath("//*[@text='New Transaction']"));
    }
     public WebElement objInvalidPINMsg(){
        return driver.findElement(By.xpath("//*[@text='Ok']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
     public WebElement objMaxLimitErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Upgrade Now' or @text='Ok']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
     public WebElement objBuyLoadBackArrowBtn(){
        return driver.findElement(By.xpath("//*[@text='Buy Load']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
     public WebElement objSecondTimeConfirmationPopup(){
        return driver.findElement(By.xpath("//*[@resource-id='modal-confirm-button']/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
     public WebElement objMLPinEditField(){
        return driver.findElement(By.xpath("//*[@resource-id='847305']"));
    }

     public WebElement obj5SmartRegularLoad(){
         return driver.findElement(By.xpath("//*[@content-desc='PHP, 5, P5 Smart Regular, P5 Smart Regular']"));
     }
     public WebElement obj10SmartRegular(){
        return driver.findElement(By.xpath("//*[@text='P10 Smart Regular']"));
    }

    public WebElement telcoOptions(int indexTab)
    {
        return driver.findElement(By.xpath("(//*[android.view.ViewGroup]/following-sibling::android.view.ViewGroup/(descendant::android.widget.ImageView)[1])["+indexTab+"]"));
    }
    public WebElement objContactsAndNumber(int i,int j){
        return driver.findElement(By.xpath("(((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and ./parent::*[./parent::*[./parent::*[@class='android.widget.FrameLayout']]]]]/*[@class='android.view.ViewGroup'])["+i+"]/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']])[1]/*[@class='android.widget.TextView'])["+j+"]"));
    }
}
