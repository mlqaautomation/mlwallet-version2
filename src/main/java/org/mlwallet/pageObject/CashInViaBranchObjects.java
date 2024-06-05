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
public class CashInViaBranchObjects extends AppiumDriverManager {
    public WebElement objPending(){
        return driver.findElement(By.xpath("//*[@text='Pending']"));
    }
    public WebElement objCancelled(){
        return driver.findElement(By.xpath("//*[@text='Cancelled']"));
    }
    public WebElement objCashInTransaction(){
        return driver.findElement(By.xpath("(//*[@text='Cash In'])[1]"));
    }
    public WebElement objCashInMenu(){
        return driver.findElement(By.xpath("//*[@text='Cash In']"));
    }
    public WebElement objCashInOptionPage(){
        return driver.findElement(By.xpath("//*[@text='Cash In options']"));
    }
    public WebElement objTapPage(){
        return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"));
    }
    public WebElement objBranchName(){
        return driver.findElement(By.xpath("//*[@text='ML Branch']"));
    }
    public WebElement objBranchCashIn(){
        return driver.findElement(By.xpath("//*[@text='Branch Cash In']"));
    }
    public WebElement objUserName(){
        return driver.findElement(By.xpath("(//*[@text='Branch Cash In']/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objUserNumber(){
        return driver.findElement(By.xpath("(//*[@text='Branch Cash In']/following-sibling::android.widget.TextView)[2]"));
    }
    public WebElement objAmountTextField(){
        return driver.findElement(By.xpath("//*[@text='PHP']/following-sibling::android.widget.EditText"));
    }
    public WebElement objNextButton(){
        return driver.findElement(By.xpath("//*[@text='Next']"));
    }
    public WebElement objWarningPopup(){
        return driver.findElement(By.xpath("//*[@text='Continue']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
    public WebElement objGotItBtn(){
        return driver.findElement(By.xpath("//*[@text='Got It']"));
    }
    public WebElement objContinueButton(){
        return driver.findElement(By.xpath("//*[@text='Continue']"));
    }
    public WebElement objkptnId(){
        return driver.findElement(By.xpath("//*[@resource-id='transaction-code']"));
    }
    public WebElement objCrossBtn(){
        return driver.findElement(By.xpath("//*[@text='Cash In']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    public WebElement objCancelBtn(){
        return driver.findElement(By.xpath("//*[@text='Cancel']"));
    }
    public WebElement objCancelTransactionBtn(){
        return driver.findElement(By.xpath("//*[@text='Cancel Transaction']"));
    }
    public WebElement objCancelTransactionPopup(){
        return driver.findElement(By.xpath("//*[@text='Would you like cancel Transaction?']"));
    }
    public WebElement objCancelBtn1(){
        return driver.findElement(By.xpath("//*[@text='Cancel Transaction']"));
    }
    public WebElement objTransactionCancelSuccessfulMsg(){
        return driver.findElement(By.xpath("//*[@resource-id='badge-text']"));
    }
    public WebElement objInvalidAmountMsg(){
        return driver.findElement(By.xpath("//*[@text='PHP']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView"));
    }
    public WebElement objBankMaxLimitTxt(){
        return driver.findElement(By.xpath("//*[@text='The maximum Branch Cash-in per transaction set for your verification level is P50,000.00. Please try again.']"));
    }
    //Device Location
    public WebElement objLocationPopup(){
        return driver.findElement(By.xpath("//*[@text='Allow ML Wallet to access this device’s location?']"));
    }
    public WebElement objAllowButton(){
        return driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']"));
    }
    public WebElement objCashInBranchBackBtn(){
        return driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup' and ./*[./*[@class='android.widget.ScrollView']]]]]]/*/*[@class='android.widget.TextView' and ./parent::*[@class='android.view.ViewGroup']])[1]"));
    }
    public WebElement objBackToHomeBtn(){
        return driver.findElement(By.xpath("//*[@text='Back To Home']"));
    }
    public WebElement objCashInToBranch(){
        return driver.findElement(By.xpath("//*[@resource-id='GLNT33']"));
    }
    public WebElement objQRCode(){
        return driver.findElement(By.xpath("//*[@resource-id='66HVSU']"));
    }
    public WebElement objPHP(){
        return driver.findElement(By.xpath("//*[@resource-id='08HQ6G']"));
    }
    public WebElement objCreatedDate(){
        return driver.findElement(By.xpath("//*[@resource-id='DR09AX']"));
    }
    public WebElement objTransactionNo(){
        return driver.findElement(By.xpath("//*[@resource-id='0QMRD2']"));
    }
    public WebElement objStatus(){
        return driver.findElement(By.xpath("//*[@resource-id='S2JHWK']/child::android.widget.TextView"));
    }
    public WebElement objGoBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Go Back']"));
    }
    public WebElement objMaxLimitTxt(){
        return driver.findElement(By.xpath("//*[@text='Upgrade Now']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
    public WebElement objUpgradeNowBtn(){
        return driver.findElement(By.xpath("//*[@text='Upgrade Now']"));
    }
    public WebElement objAppInfo(){
        return driver.findElement(By.xpath("//*[@text='App info']"));
    }
    public WebElement objCashInConfirmationPopup(){
        return driver.findElement(By.xpath("//*[@text='Continue']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
    public WebElement objBankMaxLimitToUpgrade(){
        return driver.findElement(By.xpath("//*[@text='Upgrade Now']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
    public WebElement objInvalidPINMsg(){
        return driver.findElement(By.xpath("//*[@text='Ok']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
}
