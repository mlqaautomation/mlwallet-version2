package org.mlwallet.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver.AppiumDriverManager;

public class SettingsObjects  extends AppiumDriverManager {
    public WebElement objProfileIcon(){
        return driver.findElement(By.xpath("//*[@class='android.widget.ImageView']/following-sibling::android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::com.horcrux.svg.SvgView"));
    }
    public WebElement objSettings(){
        return driver.findElement(By.xpath("//*[@text='Settings']"));
    }
    public WebElement objProfileSettings(){
        return driver.findElement(By.xpath("//*[@text='Profile Settings']"));
    }
    public WebElement objNotification(){
        return driver.findElement(By.xpath("//*[@text='Notification']"));
    }
    public WebElement objKeyword(){
        return driver.findElement(By.xpath("//*[@resource-id='803512']"));
    }
    public WebElement objMLPinEditField(){
        return driver.findElement(By.xpath("//*[@resource-id='847305']"));
    }
    public WebElement objDeleteAccount(){
        return driver.findElement(By.xpath("//*[@text='Delete Account']"));
    }
    public WebElement objProceedBtn(){
        return driver.findElement(By.xpath("//*[@text='Proceed']"));
    }
    public WebElement objAccountDetails(){
        return driver.findElement(By.xpath("//*[@text='Account Details']"));
    }
    public WebElement objBiometricsLogin(){
        return driver.findElement(By.xpath("//*[@text='Biometrics Login']"));
    }
    public WebElement objBiometricsSwitch(){
        return driver.findElement(By.xpath("//*[@class='android.widget.Switch']"));
    }
    public WebElement objNameOfAccountHolder(){
        return driver.findElement(By.xpath("(//*[@text='Name']/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objMailAddressOfAccountHolder(){
        return driver.findElement(By.xpath("(//*[@text='Email']/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objMobileNoOfAccountHolder(){
        return driver.findElement(By.xpath("(//*[@text='Mobile Number']/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objChangeMLPin(){
        return driver.findElement(By.xpath("//*[@text='Change ML PIN']"));
    }
    public WebElement objEnterCurrentMLPin(){
        return driver.findElement(By.xpath("//*[@text='Enter Current ML PIN']"));
    }
    public WebElement objEnterMpinVal (String mPin)
    {
        return driver.findElement(By.xpath("//*[@text='"+mPin+"']"));
    }
    public WebElement objInvalaidMpinPopUp(){
        return driver.findElement(By.xpath("//*[@text='You have entered an invalid PIN. Please try again.']"));
    }
    public WebElement objEnterNewMMLpinText(){
        return driver.findElement(By.xpath("//*[@text='Enter New ML PIN']"));
    }
    public WebElement objReEnterNewMMLpinText(){
        return driver.findElement(By.xpath("//*[@text='Re-Enter New ML PIN']"));
    }
    public WebElement objOKBtn(){
        return driver.findElement(By.xpath("//*[@text='Ok']"));
    }
    public WebElement objMLPinChangedPopup(){
        return driver.findElement(By.xpath("//*[@text='ML Pin Successfully Changed']"));
    }
    public WebElement objGotItBtn(){
        return driver.findElement(By.xpath("//*[@text='Got It']"));
    }
    public WebElement objSettingsBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Settings']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    public WebElement objChangeMLPinBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Change ML PIN']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    public WebElement objAccountDetailsBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Account Details']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    public WebElement objAccountRecovery(){
        return driver.findElement(By.xpath("//*[@text='Account Recovery']"));
    }
    public WebElement objTroubleSigningInBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Trouble Signing In']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    public WebElement objBiometricsLoginBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Biometrics Login']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    public WebElement objMlWalletSupportPage(){
        return driver.findElement(By.xpath("//*[@text='ML Wallet Support']"));
    }
    public WebElement objFullNameField(){
        return driver.findElement(By.xpath("//*[@resource-id='i1']/parent::android.view.View/following-sibling::android.view.View/descendant::android.widget.EditText"));
    }
    public WebElement objRegisteredEmail(){
        return driver.findElement(By.xpath("//*[@resource-id='i5']/parent::android.view.View/following-sibling::android.view.View/descendant::android.widget.EditText"));
    }
    public WebElement objMobileNumber(){
        return driver.findElement(By.xpath("//*[@resource-id='i9']/parent::android.view.View/following-sibling::android.view.View/descendant::android.widget.EditText"));
    }
    public WebElement objNatureOfReqRadioBtn(){
        return driver.findElement(By.xpath("//*[@resource-id='i17']"));
    }
    public WebElement objNextBtn(){
        return driver.findElement(By.xpath("//*[@text='Next']"));
    }
    public WebElement objYourAnswer(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='Lost/Stolen Mobile Number Required question']]]]]]]"));
    }
    public WebElement objNewMobNo(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='New Mobile Number Required question']]]]]]]"));
    }
    public WebElement objFacebookMessangerName(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='Facebook Messenger Name Required question']]]]]]]"));
    }
    public WebElement objSumbitBtn(){
        return driver.findElement(By.xpath("//*[@text='Submit']"));
    }
    public WebElement objStolenPage(){
        return driver.findElement(By.xpath("//*[@text='Reporting a Lost/Stolen Device']"));
    }
    public WebElement objReviewPage(){
        return driver.findElement(By.xpath("//*[@text='ML Wallet Support']/following-sibling::android.widget.TextView"));
    }
    public WebElement objActivateBiometricsLogin(){
        return driver.findElement(By.xpath("//*[@text='Activate Biometrics Login']"));
    }
    public WebElement objTroubleSigningIn(){
        return driver.findElement(By.xpath("//*[@text='Trouble Signing In']"));
    }
    public WebElement objMLWalletSupport(){
        return driver.findElement(By.xpath("//*[@text='ML Wallet Support' and @class='android.widget.TextView']"));
    }
    public WebElement objNatureOfRequests(){
        return driver.findElement(By.xpath("//*[@class='android.widget.RadioGroup']/child::android.view.View/child::android.widget.TextView"));
    }
    public WebElement objDeleteConfirmationPopUp(){
        return driver.findElement(By.xpath("//*[@text='Proceed']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
    public WebElement objCancelBtn(){
        return driver.findElement(By.xpath("//*[@text='Cancel']"));
    }
    public WebElement objBiometrics(){
        return driver.findElement(By.xpath("//*[@text='Biometrics']"));
    }
    public WebElement objNatureOfRequest(){
        return driver.findElement(By.xpath("(//*[@class='android.widget.RadioGroup']/child::android.view.View/child::android.widget.TextView)[1]"));
    }
    public WebElement objWarningHeader(){
        return driver.findElement(By.xpath("//*[@text='Before you go make sure you don’t leave anything behind!']"));
    }
    public WebElement objWarningMsg(int i){
        return driver.findElement(By.xpath("(//*[@text='Before you go make sure you don’t leave anything behind!']/following-sibling::android.view.ViewGroup/child::android.widget.TextView)["+i+"]"));
    }
    public WebElement objIWantToStay(){
        return driver.findElement(By.xpath("//*[@text='I Want To Stay']"));
    }
    public WebElement objDeleteAccountBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Delete Account']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    public WebElement objDeleteAccountBtn(){
        return driver.findElement(By.xpath("(//*[@text='Delete Account'])[2]"));
    }
    public WebElement objDeleteAccountMLPin(){
        return driver.findElement(By.xpath("//*[@text='Delete Account ML Pin']"));
    }
    public WebElement objEnterCurrentMLPinHeader(){
        return driver.findElement(By.xpath("//*[@text='Enter Current ML PIN']"));
    }
    public WebElement objMLInputField(){
        return driver.findElement(By.xpath("//*[@resource-id='847305']"));
    }
    public WebElement objDeleteAccMLPinBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Delete Account ML Pin']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    public WebElement objInvalidMLPinMsg(){
        return driver.findElement(By.xpath("//*[@text='Ok']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }

}
