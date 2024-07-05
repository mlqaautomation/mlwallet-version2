package mlwallet.testSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

public class TroubleSignIn extends Base_Steps{
    public TroubleSignIn() throws InterruptedException {
        super();
    }
    Login login = new Login();

    public void mlWalletLogout() throws Exception {
        if ( mobileGeneralMethod.isVisible(logoutObject.objHamburgerMenu(), "Hamburger Menu")) {
             mobileGeneralMethod.tap(logoutObject.objHamburgerMenu(), "Hamburger Menu");
             mobileGeneralMethod.tap(logoutObject.objLogoutBtn(),"Button");
             Thread.sleep(1000);
             mobileGeneralMethod.tap(logoutObject.objLogoutBtn(), "Button");
        }
        if ( mobileGeneralMethod.isVisible(logoutObject.objChangeNumber(),"Link")) {
            LoggingUtils.info("Application Logged Out Successfully");
        } else {
            LoggingUtils.info("Application not get Logged Out Successfully");
        }
    }
    public void ValidateNatireOfRequest() throws Exception {
        mobileGeneralMethod.isVisible(troubleSignInObjects.objReportLost(),"Report Lost");
        mobileGeneralMethod.isVisible(troubleSignInObjects.objAccountPersonal(),"Account Personal");
        mobileGeneralMethod.isVisible(troubleSignInObjects.objResetWalletPin(),"Reset Wallet Pin");
        mobileGeneralMethod.isVisible(troubleSignInObjects.objChangeNum(),"Change Number");
        mobileGeneralMethod.isVisible(troubleSignInObjects.objUnableLogin(),"Unable Login");
        mobileGeneralMethod.isVisible(troubleSignInObjects.objUnableTransaction(),"Unable Transaction");
        mobileGeneralMethod.isVisible(troubleSignInObjects.objDeductedBalance(),"Deducted Balance");
        mobileGeneralMethod.isVisible(troubleSignInObjects.objIbaPa(),"Iba Pa");
    }

    // Happy Path
    public void troubleSigningInSuccessRequestValidation_02() throws Exception {
        ExtentReporter.logInfo("TS_TC_02","Trouble Signing In Success Request Validation");
        mobileGeneralMethod.tap(troubleSignInObjects.objTroubleSigningIn(),"Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.type(troubleSignInObjects.objFullNameField(), "First Name Field", propertyReader.getproperty("First_Name"));
        mobileGeneralMethod.type(troubleSignInObjects.objRegisteredEmail(), "Registered Email Field", propertyReader.getproperty("Email"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(troubleSignInObjects.objMobileNumber(), "Mobile Number Field", propertyReader.getproperty("Branch_Verified"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(troubleSignInObjects.objNatureOfRequest(),"Nature of Request");
        ValidateNatireOfRequest();
        mobileGeneralMethod.tap(troubleSignInObjects.objResetWalletPinBtn(), "Reset Pin");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objNextBtn(),"Popup")){
            mobileGeneralMethod.tap(troubleSignInObjects.objNextBtn(),"Button");
            LoggingUtils.info("TS_TC_02, Trouble Signing In Success Request Validation");
            ExtentReporter.logPass("TS_TC_02", "Trouble Signing In Success Request Validation");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_02", "Failed to Validate Trouble Signing In Success Request.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Positive
    public void troubleSigningInPageNavigationFromMpinScreen_TS_TC_01() throws Exception {
         ExtentReporter.logInfo("TS_TC_01","Trouble Signing In Page Navigation From Mpin Screen");
         login.loginWalletBranchTier();
         mlWalletLogout();
         mobileGeneralMethod.tap(troubleSignInObjects.objTroubleSigningIn(),"Button");
        if ( mobileGeneralMethod.isVisible(troubleSignInObjects.objTroubleSingingInPAge(),"Page")) {
            LoggingUtils.info("TS_TC_01, Trouble Signing In Page Navigation From Mpin Screen Validated");
            ExtentReporter.logPass("TS_TC_01", "Trouble Signing In Page Navigation From Mpin Screen Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_01", "Failed to Validate Trouble Signing In Page Navigation From Mpin Screen.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Positive
    public void troubleSigningInPageNavigationFromLoginScreen_TS_TC_10() throws Exception {
        ExtentReporter.logInfo("TS_TC_10","Trouble Signing In Page Navigation From Login Screen");
        mobileGeneralMethod.tap(troubleSignInObjects.objTroubleSigningIn(),"Button");
        if ( mobileGeneralMethod.isVisible(troubleSignInObjects.objTroubleSingingInPAge(),"Page")) {
            LoggingUtils.info("TS_TC_10, Trouble Signing In Page Navigation From Login Screen Validated");
            ExtentReporter.logPass("TS_TC_10", "Trouble Signing In Page Navigation From Login Screen Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_10", "Failed to Validate Trouble Signing In Page Navigation From Login Screen.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Negative
    public void troubleSigningInPageBackArrowBtnFunctionality_TS_TC_11() throws Exception {
        ExtentReporter.logInfo("TS_TC_11","Trouble Signing In Page Back Arrow Button Functionality");
         mobileGeneralMethod.tap(troubleSignInObjects.objTroubleSigningIn(),"Button");
         mobileGeneralMethod.tap(troubleSignInObjects.objTroubleSigningInBackArrowBtn(), "Back Arrow Button");
        if ( mobileGeneralMethod.isVisible(loginObject.objLoginBtn(),"Button")) {
            LoggingUtils.info("TS_TC_11, Trouble Signing In Page Back Arrow Button Functionality Validated");
            ExtentReporter.logPass("TS_TC_11", "Trouble Signing In Page Back Arrow Button Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_11", "Failed to Validate Trouble Signing In Page Back Arrow Button Functionality.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Negative
    public void troubleSigningInClearFormFunctionality_TS_TC_12() throws Exception {
        ExtentReporter.logInfo("TS_TC_12","Trouble Signing In Clear form functionality");
        mobileGeneralMethod.tap(troubleSignInObjects.objTroubleSigningIn(),"Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.type(troubleSignInObjects.objFullNameField(), "First Name Field", propertyReader.getproperty("First_Name"));
        mobileGeneralMethod.type(troubleSignInObjects.objRegisteredEmail(), "Registered Email Field", propertyReader.getproperty("Email"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(troubleSignInObjects.objMobileNumber(), "Mobile Number Field", propertyReader.getproperty("Branch_Verified"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(troubleSignInObjects.objNatureOfRequest(),"Nature of Request");
        mobileGeneralMethod.tap(troubleSignInObjects.objClearFormButton(),"Button");
        if ( mobileGeneralMethod.isVisible(troubleSignInObjects.objClearFormPopup(),"Popup")) {
             mobileGeneralMethod.isVisible(troubleSignInObjects.objClearFormPopupMsg(),"Popup Msg");
             mobileGeneralMethod.isVisible(troubleSignInObjects.objClearFormButton(),"Button");
             mobileGeneralMethod.isVisible(troubleSignInObjects.objCancelBtn(),"Button");
            LoggingUtils.info("TS_TC_12, Trouble Signing In Clear form functionality Validated");
            ExtentReporter.logPass("TS_TC_12", "Trouble Signing In Clear form functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_12", "Failed to Validate Trouble Signing In Clear form functionality.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Negative
    public void troubleSigningInClearFormButtonOnClearFormPopupFunctionality_TS_TC_13() throws Exception {
        ExtentReporter.logInfo("TS_TC_13","Trouble Signing In Clear form Btn on Clear form popup functionality");
        mobileGeneralMethod.tap(troubleSignInObjects.objTroubleSigningIn(),"Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.type(troubleSignInObjects.objFullNameField(), "First Name Field", propertyReader.getproperty("First_Name"));
        String sFullName = mobileGeneralMethod.getText(troubleSignInObjects.objFullNameField());
        mobileGeneralMethod.type(troubleSignInObjects.objRegisteredEmail(), "Registered Email Field", propertyReader.getproperty("Email"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(troubleSignInObjects.objMobileNumber(), "Mobile Number Field", propertyReader.getproperty("Branch_Verified"));
        String sMobileNumber = mobileGeneralMethod.getText(troubleSignInObjects.objMobileNumber());
        mobileGeneralMethod.isVisible(troubleSignInObjects.objNatureOfRequest(),"Nature of Request");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(troubleSignInObjects.objClearFormButton(),"Button");
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objClearFormPopup(),"Popup")){
            mobileGeneralMethod.tap(troubleSignInObjects.objClearFormButton(),"Button");
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipeDown();
            String sActualFullName = mobileGeneralMethod.getText(troubleSignInObjects.objFullNameField());
            String sActualRegisteredEmail = mobileGeneralMethod.getText(troubleSignInObjects.objRegisteredEmail());
            mobileGeneralMethod.verticalSwipe();
            String sActualMobileNumber = mobileGeneralMethod.getText(troubleSignInObjects.objMobileNumber());
            mobileGeneralMethod.assertionNotSameValidation(sActualFullName, sFullName);
            mobileGeneralMethod.assertionNotSameValidation(sActualRegisteredEmail, propertyReader.getproperty("Email"));
            mobileGeneralMethod.assertionNotSameValidation(sActualMobileNumber, sMobileNumber);
            LoggingUtils.info("TS_TC_13, Trouble Signing In Clear form Btn on Clear form popup functionality Validated");
            ExtentReporter.logPass("TS_TC_13", "Trouble Signing In Clear form Btn on Clear form popup functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_13", "Failed to Validate Trouble Signing In Clear form Btn on Clear form popup functionality.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Negative
    public void troubleSigningInCancelButtonOnClearFormPopupFunctionality_TS_TC_14() throws Exception {
        ExtentReporter.logInfo("TS_TC_14","Trouble Signing In Cancel form Btn on Clear form popup functionality");
        mobileGeneralMethod.tap(troubleSignInObjects.objTroubleSigningIn(),"Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.type(troubleSignInObjects.objFullNameField(), "First Name Field", propertyReader.getproperty("First_Name"));
        String sFullName = mobileGeneralMethod.getText(troubleSignInObjects.objFullNameField());
        mobileGeneralMethod.type(troubleSignInObjects.objRegisteredEmail(), "Registered Email Field", propertyReader.getproperty("Email"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(troubleSignInObjects.objMobileNumber(), "Mobile Number Field", propertyReader.getproperty("Branch_Verified"));
        String sMobileNumber = mobileGeneralMethod.getText(troubleSignInObjects.objMobileNumber());
        if(mobileGeneralMethod.isVisible(troubleSignInObjects.objNatureOfRequest(),"Nature of Request")) {
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objClearFormButton(), "Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objClearFormPopup(), "Popup");
            mobileGeneralMethod.tap(troubleSignInObjects.objCancelBtn(), "Button");
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipeDown();
            String sActualFullName = mobileGeneralMethod.getText(troubleSignInObjects.objFullNameField());
            String sActualRegisteredEmail = mobileGeneralMethod.getText(troubleSignInObjects.objRegisteredEmail());
            mobileGeneralMethod.verticalSwipe();
            String sActualMobileNumber = mobileGeneralMethod.getText(troubleSignInObjects.objMobileNumber());
            mobileGeneralMethod.assertionValidation(sActualFullName, sFullName);
            mobileGeneralMethod.assertionValidation(sActualRegisteredEmail, propertyReader.getproperty("Email"));
            mobileGeneralMethod.assertionValidation(sActualMobileNumber, sMobileNumber);
            LoggingUtils.info("TS_TC_14, Trouble Signing In Cancel Btn on Clear form popup functionality Validated");
            ExtentReporter.logPass("TS_TC_14", "Trouble Signing In Cancel Btn on Clear form popup functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_14", "Failed to Validate Trouble Signing In Cancel Btn on Clear form popup functionality.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Negative
    public void troubleSigningInEmptyFullNameFunctionality_TS_TC_15() throws Exception {
        ExtentReporter.logInfo("TS_TC_15","Trouble Signing In Empty Full Name Functionality");
        mobileGeneralMethod.tap(troubleSignInObjects.objTroubleSigningIn(),"Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(troubleSignInObjects.objNextBtn(),"Button");
        if ( mobileGeneralMethod.isVisible(troubleSignInObjects.objRequiredQuestion(),"Error msg")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objRequiredQuestion());
            String sExceptedErrorMsg = "Kailangan ang tanong na ito";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("TS_TC_15, Trouble Signing In Empty Full Name Functionality Validated");
            ExtentReporter.logPass("TS_TC_15", "Trouble Signing In Empty Full Name Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_15", "Failed to Validate Trouble Signing In Empty Full Name Functionality.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Negative
    public void troubleSigningInEmptyRegisteredEmailFunctionality_TS_TC_16() throws Exception {
        ExtentReporter.logInfo("TS_TC_16","Trouble Signing In Empty Registered Email Functionality");
        mobileGeneralMethod.tap(troubleSignInObjects.objTroubleSigningIn(),"Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.type(troubleSignInObjects.objFullNameField(), "First Name Field", propertyReader.getproperty("First_Name"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
         mobileGeneralMethod.tap(troubleSignInObjects.objNextBtn(),"Button");
        if ( mobileGeneralMethod.isVisible(troubleSignInObjects.objRequiredQuestion(),"Error msg")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objRequiredQuestion());
            String sExceptedErrorMsg = "Kailangan ang tanong na ito";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("TS_TC_16, Trouble Signing In Empty Registered Email Functionality Validated");
            ExtentReporter.logPass("TS_TC_16", "Trouble Signing In Empty Registered Email Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_16", "Failed to Validate Trouble Signing In Empty Registered Email Functionality.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Negative
    public void troubleSigningInEmptyRegisteredMobileNumberFunctionality_TS_TC_17() throws Exception {
        ExtentReporter.logInfo("TS_TC_17","Trouble Signing In Empty Registered Mobile Number Functionality");
        mobileGeneralMethod.tap(troubleSignInObjects.objTroubleSigningIn(),"Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.type(troubleSignInObjects.objFullNameField(), "First Name Field", propertyReader.getproperty("First_Name"));
        mobileGeneralMethod.type(troubleSignInObjects.objRegisteredEmail(), "Registered Email Field", propertyReader.getproperty("Email"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(troubleSignInObjects.objNextBtn(),"Button");
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objRequiredQuestion(),"Error msg")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objRequiredQuestion());
            String sExceptedErrorMsg = "Kailangan ang tanong na ito";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("TS_TC_17, Trouble Signing In Empty Mobile Number Functionality Validated");
            ExtentReporter.logPass("TS_TC_17", "Trouble Signing In Empty Mobile Number Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_17", "Failed to Validate Trouble Signing In Empty Mobile Number Functionality.");
            System.out.println("-----------------------------------------------------------");
        }
    }
}
