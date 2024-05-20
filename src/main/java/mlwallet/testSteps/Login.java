package mlwallet.testSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

public class Login extends Base_Steps {
    public void loginWallet(){
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.type(mlWalletPageObjects.mobileNum_editText(), "Mobile Field", "9999999994");
        mobileGeneralMethod.tap(mlWalletPageObjects.login_btn(),"Login Button");
        mobileGeneralMethod.waitSleep(10000);
        enterOTP();
        enterPin();
        if((mlWalletPageObjects.usableBalance_Text().isDisplayed())){
            ExtentReporter.logPass("loginWallet", "Successfully Logged in");
            LoggingUtils.info("You are now Logged in");
        }else{
            ExtentReporter.logFail("loginWallet", "Failed to logged in");
            LoggingUtils.error("Failed to logged in");
            throw new AssertionError("Failed to logged in");
        }
    }
    public void loginWalletBranchTier(){
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.type(mlWalletPageObjects.mobileNum_editText(), "Mobile Field", "9999999912");
        mobileGeneralMethod.tap(mlWalletPageObjects.login_btn(),"Login Button");
        mobileGeneralMethod.waitSleep(10000);
        enterOTP();
        mobileGeneralMethod.waitSleep(2000);
        enterPin();
        if((mlWalletPageObjects.usableBalance_Text().isDisplayed())){
            ExtentReporter.logPass("loginWallet", "Successfully Logged in");
            LoggingUtils.info("You are now Logged in");
        }else{
            ExtentReporter.logFail("loginWallet", "Failed to logged in");
            LoggingUtils.error("Failed to logged in");
            throw new AssertionError("Failed to logged in");
        }
    }

    public void loginWalletFullyTier(){
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.type(mlWalletPageObjects.mobileNum_editText(), "Mobile Field", "9999999934");
        mobileGeneralMethod.tap(mlWalletPageObjects.login_btn(),"Login Button");
        mobileGeneralMethod.waitSleep(10000);
        enterOTP();
        mobileGeneralMethod.waitSleep(2000);
        enterPin();
        if((mlWalletPageObjects.usableBalance_Text().isDisplayed())){
            ExtentReporter.logPass("loginWallet", "Successfully Logged in");
            LoggingUtils.info("You are now Logged in");
        }else{
            ExtentReporter.logFail("loginWallet", "Failed to logged in");
            LoggingUtils.error("Failed to logged in");
            throw new AssertionError("Failed to logged in");
        }
    }
    public void enterOTP(){
        LoggingUtils.info("Entering OTP........");
        for (int i=0; i < 6; i++){
            mobileGeneralMethod.waitSleep(2000);
            mobileGeneralMethod.type(mlWalletPageObjects.otp_editText(i),"OTP field" , "1");
        }
        mobileGeneralMethod.waitSleep(10000);
    }
    public void enterPin(){
        LoggingUtils.info("Entering Wallet Pin........");
        for (int i=1; i < 5; i++){
            mobileGeneralMethod.waitSleep(1000);
            mobileGeneralMethod.tap(mlWalletPageObjects.walletPin_btn(1),"Pin field");
        }
        mobileGeneralMethod.waitSleep(10000);
    }


}
