package mlwallet.testSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

public class Login extends Base_Steps {
    //-----Positive
    public void loginWallet(){
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.type(mlWalletPageObjects.mobileNum_editText(), "Mobile Field", "9999999994");
        mobileGeneralMethod.tap(mlWalletPageObjects.login_btn(),"Login Button");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.inputOTP();
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
    //-----Happy Path
    public void loginWalletBranchTier(){
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.type(mlWalletPageObjects.mobileNum_editText(), "Mobile Field", "9999999912");
        mobileGeneralMethod.tap(mlWalletPageObjects.login_btn(),"Login Button");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.inputOTP();
        mobileGeneralMethod.waitSleep(3000);
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
    //-----Positive
    public void loginWalletFullyTier(){
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.type(mlWalletPageObjects.mobileNum_editText(), "Mobile Field", "9999999934");
        mobileGeneralMethod.tap(mlWalletPageObjects.login_btn(),"Login Button");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.inputOTP();
        mobileGeneralMethod.waitSleep(3000);
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
    //-----Positive
    public void loginWalletBuyerTier(){
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.type(mlWalletPageObjects.mobileNum_editText(), "Mobile Field", "9999999941");
        mobileGeneralMethod.tap(mlWalletPageObjects.login_btn(),"Login Button");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.inputOTP();
        mobileGeneralMethod.waitSleep(3000);
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
    //-----Positive
    public void loginWalletSemiTier(){
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.type(mlWalletPageObjects.mobileNum_editText(), "Mobile Field", "9999999946");
        mobileGeneralMethod.tap(mlWalletPageObjects.login_btn(),"Login Button");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.inputOTP();
        mobileGeneralMethod.waitSleep(3000);
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
    public void mlWalletLogout() throws Exception {
        if (mobileGeneralMethod.isVisible(logoutObject.objHamburgerMenu(), "Hamburger Menu")) {
            mobileGeneralMethod.tap(logoutObject.objHamburgerMenu(), "Hamburger Menu");
            mobileGeneralMethod.tap(logoutObject.objLogoutBtn(),"Button");
            Thread.sleep(1000);
            mobileGeneralMethod.tap(logoutObject.objLogoutBtn(),"Button");
        }
        if (mobileGeneralMethod.isVisible(logoutObject.objChangeNumber(),"Link")) {
            LoggingUtils.info("Application Logged Out Successfully");
        } else {
            LoggingUtils.info("Application not get Logged Out Successfully");
        }
    }
    
    
    
    


    //-----------------------------------------------------------------------------------------------------------
    public void clickAnnouncement_Exit()throws Exception{
        mobileGeneralMethod.waitSleep(1000);
        try {
            if (mobileGeneralMethod.isDisplayed(loginObject.objAnnouncement_Exit_Button())) {
                mobileGeneralMethod.tap(loginObject.objAnnouncement_Exit_Button(), "Exit Button");
                LoggingUtils.info("Exited Announcement Page");
            }
        }catch (NoSuchElementException e){
            LoggingUtils.info("No Announcement Page");
        }
    }
    //-----Positive
    public void logInScenarioWithValidMobNumber_Lgn_TC_01() throws Exception {
        ExtentReporter.logInfo("Lgn_TC_01","Login Scenarios With Valid Mobile Number");
        loginWalletBranchTier();
        if (mobileGeneralMethod.isVisible(loginObject.objAvailableBalance(),"Text")) {
            LoggingUtils.info("Lgn_TC_01 Logged In Successfully and redirected to Dashboard");
            ExtentReporter.logPass("Lgn_TC_01", "Logged In Successfully and redirected to Dashboard");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("Lgn_TC_01", "Failed to Logged In and redirected to Dashboard");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Negative
    public void logInScenarioWithInvalidMobNumber_Lgn_TC_02() throws Exception {
        ExtentReporter.logInfo("Lgn_TC_02","Login Scenarios With Invalid Mobile Number");
        mobileGeneralMethod.type(loginObject.objMobileNumberTextField(), "Mobile Number Text Field", propertyReader.getproperty("Invalid_MobileNumber"));
        mobileGeneralMethod.tap(loginObject.objLoginBtn(), "Login Button");
        if (mobileGeneralMethod.isVisible(loginObject.objInvalidMobNumberTxt(),"Error Message")) {
            LoggingUtils.info("Lgn_TC_02, Mobile number is Invalid Error Message is Displayed");
            ExtentReporter.logPass("Lgn_TC_02", "Mobile number is Invalid Error Message is Displayed");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("Lgn_TC_02", "Failed to display Mobile number is Invalid Error Message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void logInScenarioWithValidOTP_Lgn_TC_03() throws Exception {
        ExtentReporter.logInfo("Lgn_TC_03","Login Scenarios With Valid OTP");
        loginWalletBranchTier();
        if (mobileGeneralMethod.isVisible(loginObject.objAvailableBalance(),"Text")) {
            LoggingUtils.info("Lgn_TC_03, Logged In Successfully and redirected to Dashboard");
            ExtentReporter.logPass("Lgn_TC_03", "Logged In Successfully and redirected to Dashboard");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("Lgn_TC_03", "Failed to Logged In and redirected to Dashboard");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Negative
    public void LogInScenarioWithInValidOTP_Lgn_TC_04() throws Exception {
        ExtentReporter.logInfo("Lgn_TC_04","Login Scenarios With InValid OTP");
        mobileGeneralMethod.type(mlWalletPageObjects.mobileNum_editText(), "Mobile Field", "9999999912");
        mobileGeneralMethod.tap(mlWalletPageObjects.login_btn(),"Login Button");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.inputInvalidOTP();
    }
//========================================== Phase 2==========================================//
    //-----Positive
    public void appLaunch_Lgn_TC_05() throws Exception {
        ExtentReporter.logInfo("Lgn_TC_05","App Launch");
        if (mobileGeneralMethod.isVisible(loginObject.objLoginBtn(), "Login Button")) {
            LoggingUtils.info("Lgn_TC_05, Application Launched Successfully");
            ExtentReporter.logPass("Lgn_TC_05", "Application Launched Successfully");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("Lgn_TC_03", "Failed Application to Launch");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void loginPageUIValidation_Lgn_TC_06() throws Exception {
        ExtentReporter.logInfo("Lgn_TC_06","Login Page UI Validation");
        if (mobileGeneralMethod.isVisible(loginObject.objLoginBtn(), "Login Button")) {
            mobileGeneralMethod.isVisible(loginObject.objMobileNumberTextField(), "Mobile Number Text Field");
            mobileGeneralMethod.isVisible(loginObject.objTroubleSigningIn(),"Button");
            mobileGeneralMethod.isVisible(loginObject.objHaveAnAccountMsg(),"Message");
            mobileGeneralMethod.isVisible(loginObject.objCreateOneBtn(),"Button");
            mobileGeneralMethod.isVisible(loginObject.objBranchLocator(),"Button");
            mobileGeneralMethod.isVisible(loginObject.objAppVersion(),"App Version");
            LoggingUtils.info("Lgn_TC_06, Login Page UI Validated");
            ExtentReporter.logPass("Lgn_TC_06", "Login Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("Lgn_TC_06", "Failed to validate Login Page UI");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void loginTroubleSigningIn_Lgn_TC_07() throws Exception {
        ExtentReporter.logInfo("Lgn_TC_07","LogIn Trouble Signing In Validation");
        if (mobileGeneralMethod.isVisible(loginObject.objTroubleSigningIn(), "Button")) {
            mobileGeneralMethod.tap(loginObject.objTroubleSigningIn(), "Button");
            mobileGeneralMethod.waitSleep(1000);
            mobileGeneralMethod.isVisible(loginObject.objTroubleSigningPage(),"Page");
            mobileGeneralMethod.isVisible(loginObject.objMLWalletSupport(),"Header");
            LoggingUtils.info("Lgn_TC_07, Navigated to Trouble Signing In Page");
            ExtentReporter.logPass("Lgn_TC_07", "Navigated to Trouble Signing In Page");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("Lgn_TC_06", "Failed to Navigate Trouble Signing In Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void loginCreateOne_Lgn_TC_08() throws Exception {
        ExtentReporter.logInfo("Lgn_TC_08","LogIn Create One");
        if (mobileGeneralMethod.isVisible(loginObject.objCreateOneBtn(),"Button")) {
            mobileGeneralMethod.tap(loginObject.objCreateOneBtn(),"Button");
            mobileGeneralMethod.isVisible(loginObject.objRegistrationNumber(),"Page");
            LoggingUtils.info("Lgn_TC_08, Navigated to Create One Page");
            ExtentReporter.logPass("Lgn_TC_08", "Navigated to Create One Page");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("Lgn_TC_08", "Failed to Navigate Create One Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void loginBranchLocator_Lgn_TC_09() throws Exception {
        ExtentReporter.logInfo("Lgn_TC_09","LogIn Branch Locator");
        if (mobileGeneralMethod.isVisible(loginObject.objBranchLocator(),"Button")) {
            mobileGeneralMethod.tap(loginObject.objBranchLocator(),"Button");
            mobileGeneralMethod.waitSleep(1000);
            mobileGeneralMethod.isVisible(loginObject.objBranchLocator(),"Page");
            LoggingUtils.info("Lgn_TC_09, Navigated to Branch Locator Page");
            ExtentReporter.logPass("Lgn_TC_09", "Navigated to Branch Locator Page");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("Lgn_TC_09", "Failed to Navigate Branch Locator Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void loginOTPPageUIValidation_Lgn_TC_10() throws Exception {
        ExtentReporter.logInfo("Lgn_TC_10","LogIn OTP Page UI Validation");
        mobileGeneralMethod.type(mlWalletPageObjects.mobileNum_editText(), "Mobile Field", "9999999912");
        mobileGeneralMethod.tap(mlWalletPageObjects.login_btn(),"Login Button");
        mobileGeneralMethod.waitSleep(10000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page")) {
            LoggingUtils.info("Lgn_TC_10, LogIn OTP Page UI Validated");
            ExtentReporter.logPass("Lgn_TC_10", "LogIn OTP Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("Lgn_TC_10", "Failed to Validate LogIn OTP Page UI");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void loginWithExistingMobileNumber_Lgn_TC_17() throws Exception {
        ExtentReporter.logInfo("Lgn_TC_17","Login With Existing Mobile Number");
        loginWalletBranchTier();
        mlWalletLogout();
        mobileGeneralMethod.isVisible(logoutObject.objChangeNumber(), "Mpin Page");
        enterPin();
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(loginObject.objAvailableBalance(),"Text")) {
            LoggingUtils.info("Lgn_TC_17, Application Logged In Successfully");
            ExtentReporter.logPass("Lgn_TC_17", "Application Logged In Successfully");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("Lgn_TC_17", "Failed to Application Logged In");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void loginMPinPageUIValidation_Lgn_TC_18() throws Exception {
        ExtentReporter.logInfo("Lgn_TC_18","Login Mpin Page UI Validation");
        loginWalletBranchTier();
        mlWalletLogout();
        if (mobileGeneralMethod.isVisible(logoutObject.objChangeNumber(), "Mpin Page")) {
            mobileGeneralMethod.isVisible(logoutObject.objChangeNumber(),"button");
            mobileGeneralMethod.isVisible(loginObject.objTroubleSigningIn(),"Button");
            mobileGeneralMethod.isVisible(loginObject.objBranchLocator(),"Button");
            mobileGeneralMethod.isVisible(loginObject.objAppVersionChangeNumber(),"App Version");
            LoggingUtils.info("Lgn_TC_18, Application Logged In Successfully");
            ExtentReporter.logPass("Lgn_TC_18", "Application Logged In Successfully");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("Lgn_TC_18", "Failed to Application Logged In");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void loginInAppOTPNavigation_Lgn_TC_22() throws Exception {
        ExtentReporter.logInfo("Lgn_TC_22","LogIn In App OTP Navigation");
        mobileGeneralMethod.type(mlWalletPageObjects.mobileNum_editText(), "Mobile Field", "9999999912");
        mobileGeneralMethod.tap(mlWalletPageObjects.login_btn(),"Login Button");
        mobileGeneralMethod.waitSleep(10000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page")) {
            mobileGeneralMethod.isVisible(loginObject.objOTP(),"One Time Pin");
            LoggingUtils.info("Lgn_TC_22, LogIn In App OTP Navigation validated");
            ExtentReporter.logPass("Lgn_TC_22", "LogIn In App OTP Navigation validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("Lgn_TC_22", "Failed to Validate Navigation LogIn In App OTP");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive Change In App OTP
    public void loginInAppOTPPageUIValidation_Lgn_TC_23() throws Exception {
        ExtentReporter.logInfo("Lgn_TC_23","Login InApp OTP Page UI Validation");
        mobileGeneralMethod.type(mlWalletPageObjects.mobileNum_editText(), "Mobile Field", "9999999912");
        mobileGeneralMethod.tap(mlWalletPageObjects.login_btn(),"Login Button");
        mobileGeneralMethod.waitSleep(10000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page")) {
            mobileGeneralMethod.isVisible(loginObject.objOTP(),"One Time Pin");
            mobileGeneralMethod.isVisible(loginObject.objContinueBtn(),"Button");
            mobileGeneralMethod.isVisible(loginObject.objCancelBtn(),"Button");
            LoggingUtils.info("Lgn_TC_23, LogIn In App OTP Navigation validated");
            ExtentReporter.logPass("Lgn_TC_23", "LogIn In App OTP Navigation validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("Lgn_TC_23", "Failed to Validate Navigation LogIn In App OTP");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive Change In App OTP
    public void loginNewOTPAfterSixtySecondsValidation_Lgn_TC_24() throws Exception {
        ExtentReporter.logInfo("Lgn_TC_24","LogIn New OTP After Sixty Seconds Validation");
        mobileGeneralMethod.type(mlWalletPageObjects.mobileNum_editText(), "Mobile Field", "9999999912");
        mobileGeneralMethod.tap(mlWalletPageObjects.login_btn(),"Login Button");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        if (mobileGeneralMethod.isVisible(loginObject.objOTP(),"One Time Pin")) {
            String sGeneratedOTP = mobileGeneralMethod.getText(loginObject.objOTP());
            mobileGeneralMethod.waitSleep(10000);
            String sNewlyGeneratedOTPAfterSixtySeconds = mobileGeneralMethod.getText(loginObject.objOTP());
            mobileGeneralMethod.assertionNotSameValidation(sGeneratedOTP, sNewlyGeneratedOTPAfterSixtySeconds);
            LoggingUtils.info("Lgn_TC_24, LogIn, After Sixty Seconds New OTP got generated is validated");
            ExtentReporter.logPass("Lgn_TC_24", "LogIn, After Sixty Seconds New OTP got generated is validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("Lgn_TC_24", "Failed to Validate After Sixty Seconds New OTP got generate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Negative Change In App OTP
    public void loginOTPCancelBtnFunctionality_Lgn_TC_25() throws Exception {
        ExtentReporter.logInfo("Lgn_TC_25","LogIn OTP Cancel Button Functionality");
        mobileGeneralMethod.type(mlWalletPageObjects.mobileNum_editText(), "Mobile Field", "9999999912");
        mobileGeneralMethod.tap(mlWalletPageObjects.login_btn(),"Login Button");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        mobileGeneralMethod.tap(loginObject.objCancelBtn(),"Button");
        if (mobileGeneralMethod.isVisible(loginObject.objLoginBtn(),"Button")) {
            LoggingUtils.info("Lgn_TC_25, LogIn, After clicking on Cancel in One time pin popup App navigates to login Page validated");
            ExtentReporter.logPass("Lgn_TC_25", "LogIn, After clicking on Cancel in One time pin popup App navigates to login Page validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("Lgn_TC_25", "Failed to Validate After clicking on Cancel in One time pin popup App navigates to login Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive Change In App OTP
    public void loginOTPContinueBtnFunctionality_Lgn_TC_26() throws Exception {
        ExtentReporter.logInfo("Lgn_TC_26","LogIn OTP Continue Button Functionality");
        mobileGeneralMethod.type(mlWalletPageObjects.mobileNum_editText(), "Mobile Field", "9999999912");
        mobileGeneralMethod.tap(mlWalletPageObjects.login_btn(),"Login Button");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        mobileGeneralMethod.tap(loginObject.objContinueBtn(),"Button");
        if (mobileGeneralMethod.isVisible(loginObject.objAvailableBalance(),"Button")) {
            LoggingUtils.info("Lgn_TC_26, LogIn, After clicking on Continue in One time pin popup App navigates to Home Page validated");
            ExtentReporter.logPass("Lgn_TC_26", "LogIn, After clicking on Continue in One time pin popup App navigates to Home Page validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("Lgn_TC_26", "Failed to Validate After clicking on Continue in One time pin popup App navigates to Home Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Negative
    public void logInScenarioWithInvalidMobNumber_Lgn_TC_15() throws Exception {
        ExtentReporter.logInfo("Lgn_TC_15", "Login Scenarios With Invalid Mobile Number");
        mobileGeneralMethod.type(loginObject.objMobileNumberTextField(), "Mobile Number Text Field", propertyReader.getproperty("Invalid_AlphaNumericMobileNumber"));
        mobileGeneralMethod.tap(loginObject.objLoginBtn(), "Login Button");
        if (mobileGeneralMethod.isVisible(loginObject.objInvalidMobNumberTxt(), "Invalid Number")) {
            LoggingUtils.info("Lgn_TC_15, Mobile number is Invalid Error Message is Displayed");
            ExtentReporter.logPass("Lgn_TC_15", "Mobile number Invalid Error Message is Displayed");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("Lgn_TC_15", "Failed to Validate Display Mobile number Invalid Error Message");
            System.out.println("-----------------------------------------------------------");
        }
    }
}
