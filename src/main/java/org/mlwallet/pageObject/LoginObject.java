package org.mlwallet.pageObject;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver.AppiumDriverManager;

import java.time.Duration;
public class LoginObject extends AppiumDriverManager {
    public WebElement objMobileNumberTextField(){
        return driver.findElement(By.xpath("//*[android.view.ViewGroup]/descendant::android.widget.EditText"));
    }
    public WebElement objLoginBtn(){
        return driver.findElement(By.xpath("//*[@text='Login']"));
    }

    public WebElement objOtpTextField(int i){
        return driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])["+i+"]"));
    }

    public WebElement objCameraPopup(){
        return driver.findElement(By.xpath("//*[@text='Allow ML Wallet to take pictures and record video?']"));
    }
    public WebElement objContinueBtn(){
        return driver.findElement(By.xpath("//*[@text='CONTINUE']"));
    }
    public WebElement objCancelBtn(){
        return driver.findElement(By.xpath("//*[@text='CANCEL']"));
    }
    public WebElement objAvailableBalance(){
        return driver.findElement(By.xpath("//*[@resource-id='UTJ9TN']"));
    }
    public WebElement objInvalidMobNumberTxt(){
        return driver.findElement(By.xpath("//*[@text='Mobile number is invalid']"));
    }
    public WebElement objOneTimePin(){
        return driver.findElement(By.xpath("(//*[@text='One Time Pin'])[1]"));
    }
    public WebElement objMLPin(){
        return driver.findElement(By.xpath("//*[@text='ML Pin']"));
    }
    public WebElement objMLPinEditField(int i) {
        return  driver.findElement(By.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]])[1]/*[@class='android.view.ViewGroup'])["+i+"]"));
    }
    public WebElement objOneBtn(){
        return driver.findElement(By.xpath("//*[@text='1']"));
    }
    public WebElement objLocationPopup(){
        return driver.findElement(By.xpath("//*[@text='Allow ML Wallet to access this device’s location?']"));
    }
    public WebElement objTroubleSigningIn(){
        return driver.findElement(By.xpath("//*[@text='Trouble signing in?']"));
    }
    public WebElement objTroubleSigningPage(){
        return driver.findElement(By.xpath("//*[@text='Trouble Signing In']"));
    }

    public WebElement objMLWalletSupport(){
        return driver.findElement(By.xpath("(//*[@text='ML Wallet Support'])[2]"));
    }

    public WebElement objBranchLocator(){
        return driver.findElement(By.xpath("//*[@text='Branch Locator']"));
    }

    public WebElement objAppVersion(){
        return driver.findElement(By.xpath("//*[@resource-id='346187']"));
    }
    public WebElement objAppVersionChangeNumber(){
        return driver.findElement(By.xpath("//*[@resource-id='216094']"));
    }

    public WebElement objHaveAnAccountMsg(){
        return driver.findElement(By.xpath("//*[@text='Don’t have an account?']"));
    }

    public WebElement objCreateOneBtn(){
        return driver.findElement(By.xpath("//*[@text=' Create one']"));
    }

    public WebElement objRegistrationNumber(){
        return driver.findElement(By.xpath("//*[@text='Registration Number']"));
    }

    public WebElement objResendCode(){
        return driver.findElement(By.xpath("//*[contains(@text,'Resend Code')]"));
    }
    public WebElement objErrorPopup(){
        return driver.findElement(By.xpath("//*[@text='Ok']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView"));
    }
    public WebElement objOkBtn(){
        return driver.findElement(By.xpath("//*[@text='Ok']"));
    }

    public WebElement objNoInternetConnectionMsg(){
        return driver.findElement(By.xpath("(//*[@text='Connection Error']/following-sibling::android.widget.TextView)[1]"));
    }
    public WebElement objConnectionError(){
        return driver.findElement(By.xpath("//*[@text='Connection Error']"));
    }
    public WebElement objNoConnectionAppVersion(){
        return driver.findElement(By.xpath("(//*[@text='Connection Error']/following-sibling::android.widget.TextView)[2]"));
    }
    public WebElement objOTP(){
        return driver.findElement(By.xpath("((//*[@text='One Time Pin']/following-sibling::android.view.ViewGroup)[1]/child::android.widget.TextView)[1]"));
    }
    public WebElement objSeconds(){
        return driver.findElement(By.xpath("(//*[@class='com.horcrux.svg.SvgView'])[2]/following-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objNotif(){
        return driver.findElement(By.xpath("//*[contains(@text, 'notifications')]"));
    }
    public WebElement objAllowNotif(){
        return driver.findElement(By.xpath("//*[@text='Allow']"));
    }
    public WebElement objdontAllowNotif(){
        return driver.findElement(By.xpath("//*[@text='Don’t allow']"));
    }
    public WebElement objAnnouncement_Exit_Button(){
        return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"×\"]"));
    }
    
}
