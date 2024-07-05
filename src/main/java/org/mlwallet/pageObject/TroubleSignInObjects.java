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

    public WebElement objResetWalletPinBtn(){
        return driver.findElement(By.xpath("(//*[@text='Reset your ML Wallet PIN'])[1]"));
    }
    public WebElement objReportLost(){
        return driver.findElement(By.xpath("(//*[@text='Report a Lost/Stolen Device'])[2]"));
    }
    public WebElement objAccountPersonal(){
        return driver.findElement(By.xpath("(//*[@text='Change Account Details / Personal Information'])[2]"));
    }
    public WebElement objResetWalletPin(){
        return driver.findElement(By.xpath("(//*[@text='Reset your ML Wallet PIN'])[2]"));
    }
    public WebElement objChangeNum(){
        return driver.findElement(By.xpath("(//*[@text='Change your Mobile Number'])[2]"));
    }
    public WebElement objUnableLogin(){
        return driver.findElement(By.xpath("(//*[@text='Unable to Proceed w/ Login'])[2]"));
    }
    public WebElement objUnableTransaction(){
        return driver.findElement(By.xpath("(//*[@text='Unable to Proceed w/ a Transaction'])[2]"));
    }
    public WebElement objDeductedBalance(){
        return driver.findElement(By.xpath("(//*[@text='Report an unsuccessful transaction w/ Deducted Balance'])[2]"));
    }
    public WebElement objIbaPa(){
        return driver.findElement(By.xpath("//*[@text='Iba pa:']"));
    }

}
