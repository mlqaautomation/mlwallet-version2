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

public class HomePageObject extends AppiumDriverManager {

    public WebElement objRecentTransactions(){
        return driver.findElement(By.xpath("(//*[@text='Recent Transactions'])"));
    }
    public WebElement objMLShopPage(){
        return driver.findElement(By.xpath("//*[@text='ML Shop']"));
    }
    public WebElement objCashOutButton(){
        return driver.findElement(By.xpath("(//*[@text='Cash Out'])[1]"));
    }
    public WebElement objPendingStatusForCashOut(){
        return driver.findElement(By.xpath("((//*[@text='Cash Out'])[1]/preceding-sibling::android.view.ViewGroup/child::android.widget.TextView)[2]"));
    }
    public WebElement objKwartaPadala(){
        return driver.findElement(By.xpath("(//*[@text='Kwarta Padala'])[1]"));
    }
    public WebElement objWalletToWallet(){
        return driver.findElement(By.xpath("(//*[@text='Wallet to Wallet'])[1]"));
    }
    public WebElement objPayBills(){
        return driver.findElement(By.xpath("(//*[@text='Posted']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView)[1]"));
    }


//=================================== Icons ==================================================================//

    public WebElement objCashInIcon(){
        return driver.findElement(By.xpath("//*[@text='Cash In']"));
    }
    public WebElement objCashOutIcon(){
        return driver.findElement(By.xpath("//*[@text='Withdraw']"));
    }
    public WebElement objBuyELoadIcon(){
        return driver.findElement(By.xpath("//*[@text='eLoad']"));
    }
    public WebElement objBuyELoadTransaction(){
        return driver.findElement(By.xpath("(//*[@text='Buy Eload'])[1]"));
    }
    public WebElement objPosted(){
        return driver.findElement(By.xpath("//*[@text='Posted']"));
    }
    public WebElement objPayBillsIcon(){
        return driver.findElement(By.xpath("//*[@text='Bills']"));
    }
    public WebElement objShopItemsIcon(){
        return driver.findElement(By.xpath("//*[@text='Shop']"));
    }
    public WebElement objSendTransferIcon(){
        return driver.findElement(By.xpath("//*[@text='Send']"));
    }
    public WebElement objMLLoans(){
        return driver.findElement(By.xpath("//*[@text='Loans']"));
    }
    public WebElement objUseQR(){
        return driver.findElement(By.xpath("//*[@text='Use QR']"));
    }
    public WebElement objHamburgerMenu(){
        return driver.findElement(By.xpath("//*[@text and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ImageView']]]]"));
    }
    public WebElement objProfileIcon1(){
        return driver.findElement(By.xpath("(//*[android.widget.ImageView]/ancestor::android.view.ViewGroup/descendant::android.view.ViewGroup/child::android.view.ViewGroup/following-sibling::android.view.ViewGroup)[2]"));
    }
    public WebElement objProfileIcon(){
        return driver.findElement(By.xpath("(//*[android.widget.ImageView]/ancestor::android.view.ViewGroup/descendant::android.view.ViewGroup/child::android.view.ViewGroup/following-sibling::android.view.ViewGroup)[1]"));
    }
    public WebElement objAvailableBalanceHeader(){
        return driver.findElement(By.xpath("//*[@resource-id='UTJ9TN']"));
    }
    public WebElement objEyeIcon(){
        return driver.findElement(By.xpath("//*[@resource-id='JKRBGQ']"));
    }
    public WebElement objAvailableBalance(){
        return driver.findElement(By.xpath("//*[@resource-id='0619JV']"));
    }
    public WebElement objHiddenAvailableBalance(){
        return driver.findElement(By.xpath("//*[@resource-id='3P4KX3']"));
    }
    public WebElement objTransactions(){
        return driver.findElement(By.xpath("//*[@resource-id='OSJVNX']/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objSeeMore(){
        return driver.findElement(By.xpath("//*[@text='See More']"));
    }
    public WebElement objIIcon(){
        return driver.findElement(By.xpath("//*[@text='Learn more about your account level by clicking here.']/preceding-sibling::android.widget.TextView"));
    }
    public WebElement objLearnMoreTxt(){
        return driver.findElement(By.xpath("//*[@text='Learn more about your account level by clicking here.']"));
    }

    public WebElement objVerificationTierPerks(){
        return driver.findElement(By.xpath("//*[@text='Verification Tier Perks']"));
    }
    public WebElement objMaxBalanceText(){
        return driver.findElement(By.xpath("//*[@text='Max. Balance:']"));
    }
    public WebElement objMaxBalanceAmount(){
        return driver.findElement(By.xpath("//*[@text='Max. Balance:']/following-sibling::android.widget.TextView"));
    }
    public WebElement objSendingLimitsCashOut(){
        return driver.findElement(By.xpath("//*[@text='Sending Limits (cash-out)']"));
    }
    public WebElement objSendingLimitTransactionTypeAndAmount(){
        return driver.findElement(By.xpath("//*[@text='Sending Limits (cash-out)']/following-sibling::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objReceivingLimitsCashIn(){
        return driver.findElement(By.xpath("//*[@text='Receiving Limits (cash-in)']"));
    }
    public WebElement objReceivingLimitsTransactionTypeAndAmount(){
        return driver.findElement(By.xpath("//*[@text='Receiving Limits (cash-in)']/following-sibling::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objPurchaseLimits(){
        return driver.findElement(By.xpath("//*[@text='Purchase Limits']"));
    }
    public WebElement objPurchaseLimitsTransactionTypeAndAmount(){
        return driver.findElement(By.xpath("//*[@text='Purchase Limits']/following-sibling::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objTransaction(){
        return driver.findElement(By.xpath("//*[@text='Transaction']"));
    }
    public WebElement objWithdrawCash(){
        return driver.findElement(By.xpath("//*[@text='Withdraw Cash']"));
    }
    public WebElement objTopUpMLWallet(){
        return driver.findElement(By.xpath("//*[@text='Top Up ML Wallet']"));
    }
    public WebElement objShop(){
        return driver.findElement(By.xpath("//*[@text='Shop']"));
    }
    public WebElement objKwartaPadalaRatesBtn(){
        return driver.findElement(By.xpath("//*[@text='Kwarta Padala Rates']"));
    }
    public WebElement objKwartaPadalaRates(){
        return driver.findElement(By.xpath("//*[@class='android.widget.ScrollView']/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objViewTier(){
        return driver.findElement(By.xpath("//*[@text='View Tier']"));
    }
    public WebElement objSupport(){
        return driver.findElement(By.xpath("//*[@text='Support']"));
    }
    public WebElement objAbout(){
        return driver.findElement(By.xpath("//*[@text='About']"));
    }
    public WebElement objTier(){
        return driver.findElement(By.xpath("//*[contains(@text,'Verified Tier Perks')]"));
    }
    public WebElement objSemiVerified(){
        return driver.findElement(By.xpath("//*[@text='Semi Verified']"));
    }
    public WebElement objBranchVerified(){
        return driver.findElement(By.xpath("//*[@text='Branch Verified']"));
    }
    public WebElement objFullyVerified(){
        return driver.findElement(By.xpath("//*[@text='Fully Verified']"));
    }
    public WebElement objUpgradeTierLevelBtn(){
        return driver.findElement(By.xpath("//*[@text='Upgrade Tier Level']"));
    }
    public WebElement objPopUpMsg(){
        return driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_message']"));
    }
    public WebElement obPopupAllowBtn(){
        return driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']"));
    }
    public WebElement objContactPopUpAllowBtn(){
        return driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_allow_button']"));
    }
    public WebElement objLocationPopUpAllowOnceBtn(){
        return driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_allow_one_time_button']"));
    }
    public WebElement objPopUpDenyBtn(){
        return driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_deny_button']"));
    }
    public WebElement objContactPopupDenyBtn(){
        return driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_deny_and_dont_ask_again_button']"));
    }
    public WebElement objPermissionDeniedPopUp(){
        return driver.findElement(By.xpath("//*[@text='Permission Denied']"));
    }
    public WebElement objOpenSettingBtn(){
        return driver.findElement(By.xpath("//*[@text='Open Settings']"));
    }
    public WebElement objCloseBtn(){
        return driver.findElement(By.xpath("//*[@text='Close']"));
    }
    public WebElement objInternetConnectionPopUp(){
        return driver.findElement(By.xpath("//*[@text='Connection Error']"));
    }
    public WebElement objInternetConnectionMsg(){
        return driver.findElement(By.xpath("//*[@text='Connection Error']/following-sibling::android.widget.TextView"));
    }
    public WebElement objOkBtn(){
        return driver.findElement(By.xpath("//*[@text='Ok']"));
    }
    public WebElement objDoYouHaveAnotherAccBtn(){
        return driver.findElement(By.xpath("//*[@resource-id='SYOFR5']"));
    }
    public WebElement objAddAccFacility(){
        return driver.findElement(By.xpath("//*[@text='ML Wallet Add Account Facility']"));
    }
    public WebElement objSuccess(){
        return driver.findElement(By.xpath("(//*[@text='Success'])[1]"));
    }
    //
    
}
