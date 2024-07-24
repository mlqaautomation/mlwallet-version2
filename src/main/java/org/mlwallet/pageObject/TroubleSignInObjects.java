package org.mlwallet.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver.AppiumDriverManager;

public class TroubleSignInObjects extends AppiumDriverManager {
    public WebElement objTroubleSigningIn(){
        return driver.findElement(By.xpath("//*[@text='Trouble signing in?']"));
    }
    public WebElement objTroubleSingingInPAge(){
        return driver.findElement(By.xpath("//*[@text='Trouble Signing In']"));
    }
    public WebElement objTroubleSigningInBackArrowBtn(){
        return driver.findElement(By.xpath("//*[@text='Trouble Signing In']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    public WebElement objNatureOfRequests(){
        return driver.findElement(By.xpath("//*[@class='android.widget.RadioGroup']/child::android.view.View/child::android.widget.TextView"));
    }
    public WebElement objNatureOfRequest(){
        return driver.findElement(By.xpath("(//*[@text='Nature of your request Mga kinakailangang tanong'])[1]"));
    }
    public WebElement objFullNameField(){
        return driver.findElement(By.xpath("//*[@text='Full Name (first, middle, last) Mga kinakailangang tanong']/parent::android.view.View/following-sibling::android.view.View/child::android.view.View/child::android.view.View/child::android.view.View/child::android.widget.EditText"));
    }
    public WebElement objRegisteredEmail(){
        return driver.findElement(By.xpath("//*[@text='ML Wallet-registered Email Address Mga kinakailangang tanong']/parent::android.view.View/following-sibling::android.view.View/child::android.view.View/child::android.view.View/child::android.view.View/child::android.widget.EditText"));
    }
    public WebElement objMobileNumber(){
        return driver.findElement(By.xpath("//*[@text='Registered Mobile Number (eg. 09180000000) Mga kinakailangang tanong']/parent::android.view.View/following-sibling::android.view.View/child::android.view.View/child::android.view.View/child::android.view.View/child::android.widget.EditText"));
    }
    public WebElement objClearFormButton(){
        return driver.findElement(By.xpath("//*[@text='I-clear ang form']"));
    }
    public WebElement objClearFormPopup(){
        return driver.findElement(By.xpath("(//*[@text='I-clear ang form?'])[2]"));
    }
    public WebElement objClearFormPopupMsg(){
        return driver.findElement(By.xpath("//*[@text='Aalisin nito ang lahat ng iyong sagot mula sa lahat ng tanong, at hindi ito maa-undo.']"));
    }
    public WebElement objCancelBtn(){
        return driver.findElement(By.xpath("//*[@text='Kanselahin']"));
    }
    public WebElement objNextBtn(){
        return driver.findElement(By.xpath("//*[@text='Susunod']"));
    }
    public WebElement objRequiredQuestion(){
        return driver.findElement(By.xpath("//*[@text='Kailangan ang tanong na ito']"));
    }
    //-------- Text Btn Request
    public WebElement objReportLost(){
        return driver.findElement(By.xpath("(//*[@text='Report a Lost/Stolen Device'])[2]"));
    }
    public WebElement objReportLostbtn(){
        return driver.findElement(By.xpath("(//*[@text='Report a Lost/Stolen Device'])[1]"));
    }
    //----------------------
    public WebElement objAccountPersonal(){
        return driver.findElement(By.xpath("(//*[@text='Change Account Details / Personal Information'])[2]"));
    }
    public WebElement objAccountPersonalbtn(){
        return driver.findElement(By.xpath("(//*[@text='Change Account Details / Personal Information'])[1]"));
    }
    //----------------------
    public WebElement objResetWalletPin(){
        return driver.findElement(By.xpath("(//*[@text='Reset your ML Wallet PIN'])[2]"));
    }
    public WebElement objResetWalletPinBtn(){
        return driver.findElement(By.xpath("(//*[@text='Reset your ML Wallet PIN'])[1]"));
    }
    //----------------------
    public WebElement objChangeNum(){
        return driver.findElement(By.xpath("(//*[@text='Change your Mobile Number'])[2]"));
    }
    public WebElement objChangeNumbtn(){
        return driver.findElement(By.xpath("(//*[@text='Change your Mobile Number'])[1]"));
    }
    //----------------------
    public WebElement objUnableLogin(){
        return driver.findElement(By.xpath("(//*[@text='Unable to Proceed w/ Login'])[2]"));
    }
    public WebElement objUnableLoginbtn(){
        return driver.findElement(By.xpath("(//*[@text='Unable to Proceed w/ Login'])[1]"));
    }
    //----------------------
    public WebElement objUnableTransaction(){
        return driver.findElement(By.xpath("(//*[@text='Unable to Proceed w/ a Transaction'])[2]"));
    }
    public WebElement objUnableTransactionbtn(){
        return driver.findElement(By.xpath("(//*[@text='Unable to Proceed w/ a Transaction'])[1]"));
    }
    //---------------------
    public WebElement objDeductedBalance(){
        return driver.findElement(By.xpath("(//*[@text='Report an unsuccessful transaction w/ Deducted Balance'])[2]"));
    }
    public WebElement objDeductedBalancebtn(){
        return driver.findElement(By.xpath("(//*[@text='Report an unsuccessful transaction w/ Deducted Balance'])[1]"));
    }
    //--------------------
    public WebElement objIbaPa(){
        return driver.findElement(By.xpath("//*[@text='Iba pa:']"));
    }







    //------------ If Lost/Stolen
    public WebElement objLostMobileNoText(){
        return driver.findElement(By.xpath("//*[@text='Lost/Stolen Mobile Number Mga kinakailangang tanong']"));
    }
    public WebElement objLostMobileNoField(){
        return driver.findElement(By.xpath("//*[@text='Lost/Stolen Mobile Number Mga kinakailangang tanong']/parent::android.view.View/following-sibling::android.view.View/child::android.view.View/child::android.view.View/child::android.view.View/child::android.widget.EditText"));
    }
    public WebElement objNewMobileNoText(){
        return driver.findElement(By.xpath("//*[@text='New Mobile Number Mga kinakailangang tanong']"));
    }
    public WebElement objNewMobileNoField(){
        return driver.findElement(By.xpath("//*[@text='New Mobile Number Mga kinakailangang tanong']/parent::android.view.View/following-sibling::android.view.View/child::android.view.View/child::android.view.View/child::android.view.View/child::android.widget.EditText"));
    }
    public WebElement objFBMessengerNameText(){
        return driver.findElement(By.xpath("//*[@text='Facebook Messenger Name Mga kinakailangang tanong']"));
    }
    public WebElement objFBMessengerNameField(){
        return driver.findElement(By.xpath("//*[@text='Facebook Messenger Name Mga kinakailangang tanong']/parent::android.view.View/following-sibling::android.view.View/child::android.view.View/child::android.view.View/child::android.view.View/child::android.widget.EditText"));
    }
    public WebElement objBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Bumalik']"));
    }
    public WebElement objSubmitBtn(){
        return driver.findElement(By.xpath("//*[@text='Submit']"));
    }
    // ---------------If Lost/Stolen ErrorMessage
    public WebElement objLostMobileNoEmpty(){
        return driver.findElement(By.xpath("//*[@text='Kailangan ang tanong na ito']"));
    }
    public WebElement objLostMobileNoOnlyNum(){
        return driver.findElement(By.xpath("//*[@text='Please enter numbers only']"));
    }
    //--------If Change Personal Info
    public WebElement objOldInfoText(){
        return driver.findElement(By.xpath("//*[@text='Old Information Mga kinakailangang tanong']"));
    }
    public WebElement objNewInfoText(){
        return driver.findElement(By.xpath("//*[@text='New Information Mga kinakailangang tanong']"));
    }
    public WebElement objOldInfoField(){
        return driver.findElement(By.xpath("//*[@text='Old Information Mga kinakailangang tanong']/parent::android.view.View/following-sibling::android.view.View/child::android.view.View/child::android.view.View/child::android.view.View/child::android.widget.EditText"));
    }
    public WebElement objNewInfoField(){
        return driver.findElement(By.xpath("//*[@text='New Information Mga kinakailangang tanong']/parent::android.view.View/following-sibling::android.view.View/child::android.view.View/child::android.view.View/child::android.view.View/child::android.widget.EditText"));
    }
    //--------If Reset ML Pin / Change Mobile No
    public WebElement objInputBirthtext(){
        return driver.findElement(By.xpath("//*[@text='Please enter your birthday (MM-DD-YYYY) Mga kinakailangang tanong']"));
    }
    public WebElement objLastTransactiontext(){
        return driver.findElement(By.xpath("//*[@text='What was the last transaction you performed successfully? Mga kinakailangang tanong']"));
    }
    public WebElement objInputBirthField(){
        return driver.findElement(By.xpath("//*[@text='Please enter your birthday (MM-DD-YYYY) Mga kinakailangang tanong']/parent::android.view.View/following-sibling::android.view.View/child::android.view.View/child::android.view.View/child::android.view.View/child::android.widget.EditText"));
    }
    public WebElement objLastTransactionField(){
        return driver.findElement(By.xpath("//*[@text='What was the last transaction you performed successfully? Mga kinakailangang tanong']/parent::android.view.View/following-sibling::android.view.View/child::android.view.View/child::android.view.View/child::android.view.View/child::android.widget.EditText"));
    }
    //---------If Unable to login / Transaction / Deducted balance
    //--------Service Affected
    public WebElement objServiceAffectedText(){
        return driver.findElement(By.xpath("(//*[@text='Service Affected Mga kinakailangang tanong'])[1]"));
    }
    public WebElement objLoginText(){
        return driver.findElement(By.xpath("(//*[@text='Login'])[2]"));
    }
    public WebElement objWalletToWalletText(){
        return driver.findElement(By.xpath("(//*[@text='Wallet-to-Wallet'])[2]"));
    }
    public WebElement objCashInText(){
        return driver.findElement(By.xpath("(//*[@text='Cash-in Transactions'])[2]"));
    }
    public WebElement objCashOutText(){
        return driver.findElement(By.xpath("(//*[@text='Cash-out Transactions'])[2]"));
    }
    public WebElement objBillsOrEloadText(){
        return driver.findElement(By.xpath("(//*[@text='Pay Bills or eLoad'])[2]"));
    }
    public WebElement objMlShopText(){
        return driver.findElement(By.xpath("(//*[@text='ML Shop'])[2]"));
    }
    public WebElement objKwartaPadalaText(){
        return driver.findElement(By.xpath("(//*[@text='Kwarta Padala'])[2]"));
    }
    public WebElement objIbaPaText(){
        return driver.findElement(By.xpath("(//*[@text='Iba pa:'])"));
    }
    public WebElement objLoginRadioBtn(){
        return driver.findElement(By.xpath("(//*[@text='Login'])[1]"));
    }
    public WebElement objProblemEncounterText(){
        return driver.findElement(By.xpath("//*[@text='Brief description of the problem encountered Mga kinakailangang tanong']"));
    }
    public WebElement objProblemEncounterField(){
        return driver.findElement(By.xpath("//*[@text='Brief description of the problem encountered Mga kinakailangang tanong']/parent::android.view.View/following-sibling::android.view.View/child::android.view.View/child::android.view.View/child::android.view.View/child::android.widget.EditText"));
    }
    //-----------Successfully Request
    public WebElement objReviewPage(){
        return driver.findElement(By.xpath("//*[@text='ML Wallet Support']/following-sibling::android.widget.TextView"));
    }
}
