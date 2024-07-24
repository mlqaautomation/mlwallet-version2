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
    public void FieldTransaction() throws Exception {
        mobileGeneralMethod.tap(troubleSignInObjects.objTroubleSigningIn(),"Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.type(troubleSignInObjects.objFullNameField(), "First Name Field", propertyReader.getproperty("First_Name"));
        mobileGeneralMethod.type(troubleSignInObjects.objRegisteredEmail(), "Registered Email Field", propertyReader.getproperty("Email"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(troubleSignInObjects.objMobileNumber(), "Mobile Number Field", propertyReader.getproperty("Branch_Verified"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(troubleSignInObjects.objNatureOfRequest(),"Nature of Request");
        ValidateNatireOfRequest();
    }
    public void FieldTransactionContinue() throws Exception {
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(troubleSignInObjects.objNextBtn(),"Popup");
        mobileGeneralMethod.tap(troubleSignInObjects.objNextBtn(),"Button");
    }
    // Happy Path
    public void troubleSigningSelectLostOrStolenDevicesSuccessfullyRequest_TS_TC_22() throws Exception {
        ExtentReporter.logInfo("TS_TC_21", "Trouble Signing Select Lost Or Stolen Devices Successfully Request.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objReportLostbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoText(), "Lost Mobile No.")) {
            mobileGeneralMethod.type(troubleSignInObjects.objLostMobileNoField(), "Lost Mobile No.", "099999999912");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.type(troubleSignInObjects.objNewMobileNoField(), "New Mobile No.", "099999999911");
            mobileGeneralMethod.type(troubleSignInObjects.objFBMessengerNameField(), "FB Name", "TEST");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objReviewPage(), "Review Page");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objReviewPage());
            String sExceptedErrorMsg = "Please allow us some time to review the details of your request. A customer service representative will contact you for updates and/or to get additional information.";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_21", "Trouble Signing Select Lost Or Stolen Devices Successfully Request Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("TS_TC_21", "Failed to Validate Trouble Signing Select Lost Or Stolen Devices Successfully Request.");
            System.out.println("-----------------------------------------------------------");
        }
    }


    //Positive
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
//-----------------If stolen number
    //------Negative
    public void troubleSigningSelectLostOrStolenDevicesVisible_TS_TC_18() throws Exception {
        ExtentReporter.logInfo("TS_TC_18", "Trouble Signing Select Lost Or Stolen Devices Visible.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objReportLostbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoText(),"Lost Mobile No.")) {
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoField(), "Lost Mobile No.");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(troubleSignInObjects.objNewMobileNoText(), "New Mobile No.");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objNewMobileNoField(), "New Mobile No.");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objFBMessengerNameText(), "FB Messenger Name");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objFBMessengerNameField(), "FB Messenger Name");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(troubleSignInObjects.objBackBtn(), "Back Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objClearFormButton(), "Clear Form Button");
            ExtentReporter.logPass("TS_TC_18", "Trouble Signing Select Lost Or Stolen Devices Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_18", "Failed to Validate Trouble Signing Select Lost Or Stolen Devices.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Negative
    public void troubleSigningSelectLostOrStolenDevicesEmpty_TS_TC_19() throws Exception {
        ExtentReporter.logInfo("TS_TC_19", "Trouble Signing Select Lost Or Stolen Devices Empty.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objReportLostbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoText(),"Lost Mobile No.")) {
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoEmpty(),"Lost Mobile Empty");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objLostMobileNoEmpty());
            String sExceptedErrorMsg = "Kailangan ang tanong na ito";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_19", "Trouble Signing Select Lost Or Stolen Devices Empty Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_19", "Failed to Validate Trouble Signing Select Lost Or Stolen Devices Empty.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Negative
    public void troubleSigningSelectLostOrStolenDevicesOnlyNumber_TS_TC_20() throws Exception {
        ExtentReporter.logInfo("TS_TC_20", "Trouble Signing Select Lost Or Stolen Devices Only Number.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objReportLostbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoText(),"Lost Mobile No.")) {
            mobileGeneralMethod.type(troubleSignInObjects.objLostMobileNoField(),"Lost Mobile No.","TEST");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoOnlyNum(),"Lost Mobile Only No.");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objLostMobileNoOnlyNum());
            String sExceptedErrorMsg = "Please enter numbers only";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_20", "Trouble Signing Select Lost Or Stolen Devices Only Number Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_20", "Failed to Validate Trouble Signing Select Lost Or Stolen Devices Only Number.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Negative
    public void troubleSigningSelectLostOrStolenDevicesOnlyNumber_TS_TC_21() throws Exception {
        ExtentReporter.logInfo("TS_TC_21", "Trouble Signing Select Lost Or Stolen Devices Only Number.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objReportLostbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoText(),"Lost Mobile No.")) {
            mobileGeneralMethod.type(troubleSignInObjects.objLostMobileNoField(),"Lost Mobile No.","099999999912");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.type(troubleSignInObjects.objNewMobileNoField(),"New Mobile No.","TEST");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoOnlyNum(),"Lost Mobile Only No.");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objLostMobileNoOnlyNum());
            String sExceptedErrorMsg = "Please enter numbers only";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_21", "Trouble Signing Select Lost Or Stolen Devices Only Number Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_21", "Failed to Validate Trouble Signing Select Lost Or Stolen Devices Only Number.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Change Personal Information
    //------Negative
    public void troubleSigningSelectChangePersonalInfoEmpty_TS_TC_23() throws Exception {
        ExtentReporter.logInfo("TS_TC_23", "Trouble Signing Select Change Personal Info Empty.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objAccountPersonalbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objOldInfoText(),"Old Info")) {
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoEmpty(),"Lost Mobile Empty");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objLostMobileNoEmpty());
            String sExceptedErrorMsg = "Kailangan ang tanong na ito";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_23", "Trouble Signing Select Change Personal Info Empty Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_23", "Failed to Validate Trouble Signing Select Change Personal Info Empty.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Negative
    public void troubleSigningSelectChangePersonalInfoOnlyNumber_TS_TC_24() throws Exception {
        ExtentReporter.logInfo("TS_TC_24", "Trouble Signing Select Change Personal Info Only Number.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objAccountPersonalbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objOldInfoText(),"Old Info")) {
            mobileGeneralMethod.type(troubleSignInObjects.objOldInfoField(),"Old Info","TEST");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoEmpty(),"Lost Mobile Empty");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objLostMobileNoEmpty());
            String sExceptedErrorMsg = "Kailangan ang tanong na ito";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_24", "Trouble Signing Select Change Personal Info Only Number Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_24", "Failed to Validate Trouble Signing Select Change Personal Info Only Number.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Positive
    public void troubleSigningSelectChangePersonalInfoVisible_TS_TC_25() throws Exception {
        ExtentReporter.logInfo("TS_TC_25", "Trouble Signing Select Change Personal Info Visible.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objAccountPersonalbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objOldInfoText(),"Old Info")) {
            mobileGeneralMethod.isVisible(troubleSignInObjects.objOldInfoField(),"Old Info");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(troubleSignInObjects.objNewInfoText(),"New Info");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objNewInfoField(),"New Info");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objFBMessengerNameText(), "FB Messenger Name");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objFBMessengerNameField(), "FB Messenger Name");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(troubleSignInObjects.objBackBtn(), "Back Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objClearFormButton(), "Clear Form Button");
            ExtentReporter.logPass("TS_TC_25", "Trouble Signing Select Change Personal Info Visible Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_25", "Failed to Validate Trouble Signing Select Change Personal Info Visible.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Positive
    public void troubleSigningSelectChangePersonalInfoSuccessfullyRequest_TS_TC_26() throws Exception {
        ExtentReporter.logInfo("TS_TC_26", "Trouble Signing Select Change Personal Successfully Request.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objAccountPersonalbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objOldInfoText(), "Lost Mobile No.")) {
            mobileGeneralMethod.type(troubleSignInObjects.objOldInfoField(), "Lost Mobile No.", "TEST");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.type(troubleSignInObjects.objNewInfoField(), "New Mobile No.", "TEST");
            mobileGeneralMethod.type(troubleSignInObjects.objFBMessengerNameField(), "FB Name", "TEST");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objReviewPage(), "Review Page.");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objReviewPage());
            String sExceptedErrorMsg = "Please allow us some time to review the details of your request. A customer service representative will contact you for updates and/or to get additional information.";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_26", "Trouble Signing Select Change Personal Successfully Request Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("TS_TC_26", "Failed to Validate Trouble Signing Select Change Personal Successfully Request.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Reset ML Pin
    //------Negative
    public void troubleSigningSelectResetMLPinEmpty_TS_TC_27() throws Exception {
        ExtentReporter.logInfo("TS_TC_27", "Trouble Signing Select Reset MLPin Empty.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objResetWalletPinBtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objInputBirthtext(),"Birth Date")) {
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoEmpty(),"Lost Mobile Empty");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objLostMobileNoEmpty());
            String sExceptedErrorMsg = "Kailangan ang tanong na ito";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_27", "Trouble Signing Select Reset MLPin Empty Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_27", "Failed to Validate Trouble Signing Select Reset MLPin Empty.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Negative
    public void troubleSigningSelectResetMLPinEmpty_TS_TC_28() throws Exception {
        ExtentReporter.logInfo("TS_TC_28", "Trouble Signing Select Reset MLPin Empty.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objResetWalletPinBtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objInputBirthtext(),"Birth Date")) {
            mobileGeneralMethod.type(troubleSignInObjects.objInputBirthField(), "Birth Date", "TEST");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoEmpty(),"Lost Mobile Empty");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objLostMobileNoEmpty());
            String sExceptedErrorMsg = "Kailangan ang tanong na ito";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_28", "Trouble Signing Select Reset MLPin Empty Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_28", "Failed to Validate Trouble Signing Select Reset MLPin Empty.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Positive
    public void troubleSigningSelectResetMLPinVisible_TS_TC_29() throws Exception {
        ExtentReporter.logInfo("TS_TC_29", "Trouble Signing Select Reset MLPin Visible.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objResetWalletPinBtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objInputBirthtext(),"Birth Date")) {
            mobileGeneralMethod.isVisible(troubleSignInObjects.objInputBirthField(), "Birth Date");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLastTransactiontext(), "Last Transaction");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLastTransactionField(), "Last Transaction");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objFBMessengerNameText(), "FB Messenger Name");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objFBMessengerNameField(), "FB Messenger Name");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(troubleSignInObjects.objBackBtn(), "Back Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objClearFormButton(), "Clear Form Button");
            ExtentReporter.logPass("TS_TC_29", "Trouble Signing Select Reset MLPin Visible Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_29", "Failed to Validate Trouble Signing Select Reset MLPin Visible.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Positive
    public void troubleSigningSelectResetMLPinSuccessfullyRequest_TS_TC_30() throws Exception {
        ExtentReporter.logInfo("TS_TC_30", "Trouble Signing Select Reset MLPin Successfully Request.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objResetWalletPinBtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objInputBirthtext(), "Input Birth")) {
            mobileGeneralMethod.type(troubleSignInObjects.objInputBirthField(), "Input Birth", "TEST");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.type(troubleSignInObjects.objLastTransactionField(), "Last Transaction", "TEST");
            mobileGeneralMethod.type(troubleSignInObjects.objFBMessengerNameField(), "FB Name", "TEST");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objReviewPage(), "Review Page.");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objReviewPage());
            String sExceptedErrorMsg = "Please allow us some time to review the details of your request. A customer service representative will contact you for updates and/or to get additional information.";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_30", "Trouble Signing Select Reset MLPin Successfully Request Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("TS_TC_30", "Failed to Validate Trouble Signing Select Reset MLPin Successfully Request.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Change Mobile No
    //------Negative
    public void troubleSigningSelectChangeNoEmpty_TS_TC_31() throws Exception {
        ExtentReporter.logInfo("TS_TC_31", "Trouble Signing Select Change Number Empty.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objChangeNumbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objInputBirthtext(),"Birth Date")) {
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoEmpty(),"Lost Mobile Empty");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objLostMobileNoEmpty());
            String sExceptedErrorMsg = "Kailangan ang tanong na ito";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_31", "Trouble Signing Select Change Number Empty Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_31", "Failed to Validate Trouble Signing Select Change Number Empty.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Negative
    public void troubleSigningSelectChangeNoEmpty_TS_TC_32() throws Exception {
        ExtentReporter.logInfo("TS_TC_32", "Trouble Signing Select Change Number Empty.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objChangeNumbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objInputBirthtext(),"Birth Date")) {
            mobileGeneralMethod.type(troubleSignInObjects.objInputBirthField(), "Birth Date", "TEST");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoEmpty(),"Lost Mobile Empty");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objLostMobileNoEmpty());
            String sExceptedErrorMsg = "Kailangan ang tanong na ito";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_32", "Trouble Signing Select Change Number Empty Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_32", "Failed to Validate Trouble Signing Select Change Number Empty.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Positive
    public void troubleSigningSelectChangeVisible_TS_TC_33() throws Exception {
        ExtentReporter.logInfo("TS_TC_33", "Trouble Signing Select Change Number Visible.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objChangeNumbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objInputBirthtext(),"Birth Date")) {
            mobileGeneralMethod.isVisible(troubleSignInObjects.objInputBirthField(), "Birth Date");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLastTransactiontext(), "Last Transaction");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLastTransactionField(), "Last Transaction");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objFBMessengerNameText(), "FB Messenger Name");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objFBMessengerNameField(), "FB Messenger Name");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(troubleSignInObjects.objBackBtn(), "Back Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objClearFormButton(), "Clear Form Button");
            ExtentReporter.logPass("TS_TC_33", "Trouble Signing Select Change Number Visible Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_33", "Failed to Validate Trouble Signing Select Change Number Visible.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Positive
    public void troubleSigningSelectChangeSuccessfullyRequest_TS_TC_34() throws Exception {
        ExtentReporter.logInfo("TS_TC_34", "Trouble Signing Select Change Number Successfully Request.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objChangeNumbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objInputBirthtext(), "Input Birth")) {
            mobileGeneralMethod.type(troubleSignInObjects.objInputBirthField(), "Input Birth", "TEST");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.type(troubleSignInObjects.objLastTransactionField(), "Last Transaction", "TEST");
            mobileGeneralMethod.type(troubleSignInObjects.objFBMessengerNameField(), "FB Name", "TEST");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objReviewPage(), "Review Page.");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objReviewPage());
            String sExceptedErrorMsg = "Please allow us some time to review the details of your request. A customer service representative will contact you for updates and/or to get additional information.";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_34", "Trouble Signing Select Change Number Successfully Request Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("TS_TC_34", "Failed to Validate Trouble Signing Select Change Number Successfully Request.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Unable to Login
    //------Negative
    public void troubleSigningSelectUnabletoLoginEmpty_TS_TC_35() throws Exception {
        ExtentReporter.logInfo("TS_TC_35", "Trouble Signing Select Unable to Login Empty.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objUnableLoginbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objServiceAffectedText(),"Service Affected")) {
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoEmpty(),"Lost Mobile Empty");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objLostMobileNoEmpty());
            String sExceptedErrorMsg = "Kailangan ang tanong na ito";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_35", "Trouble Signing Select Unable to Login Empty Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_35", "Failed to Validate Trouble Signing Select Unable to Login Empty.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Negative
    public void troubleSigningSelectUnabletoLoginEmpty_TS_TC_36() throws Exception {
        ExtentReporter.logInfo("TS_TC_36", "Trouble Signing Select Unable to Login Empty.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objUnableLoginbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objServiceAffectedText(),"Service Affected")) {
            mobileGeneralMethod.tap(troubleSignInObjects.objLoginRadioBtn(), "Click Login Radio Button");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoEmpty(),"Lost Mobile Empty");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objLostMobileNoEmpty());
            String sExceptedErrorMsg = "Kailangan ang tanong na ito";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_36", "Trouble Signing Select Unable to Login Empty Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_36", "Failed to Validate Trouble Signing Select Unable to Login Empty.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Positive
    public void troubleSigningSelectUnabletoLoginVisible_TS_TC_37() throws Exception {
        ExtentReporter.logInfo("TS_TC_37", "Trouble Signing Select Unable to Login Visible.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objUnableLoginbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objServiceAffectedText(),"Service Affected")) {
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLoginText(), "Login");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objWalletToWalletText(), "Wallet To Wallet");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objCashInText(), "Cash In");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objCashOutText(), "Cash Out");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objBillsOrEloadText(), "Bills Or Eload");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objMlShopText(), "Ml Shop");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objKwartaPadalaText(), "Kwarta Padala");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objIbaPaText(), "Iba Pa");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(troubleSignInObjects.objProblemEncounterText(), "Problem Encounter");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objProblemEncounterField(), "Problem Encounter");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objFBMessengerNameText(), "FB Messenger Name");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objFBMessengerNameField(), "FB Messenger Name");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(troubleSignInObjects.objBackBtn(), "Back Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objClearFormButton(), "Clear Form Button");
            ExtentReporter.logPass("TS_TC_37", "Trouble Signing Select Unable to Login Visible Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_37", "Failed to Validate Trouble Signing Select Unable to Login Visible.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Positive
    public void troubleSigningSelectUnabletoSuccessfullyRequest_TS_TC_38() throws Exception {
        ExtentReporter.logInfo("TS_TC_38", "Trouble Signing Select Unable to Login Successfully Request.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objUnableLoginbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objServiceAffectedText(), "Service Affected")) {
            mobileGeneralMethod.tap(troubleSignInObjects.objLoginRadioBtn(), "Click Login Radio Button");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.type(troubleSignInObjects.objProblemEncounterField(), "Problem Encounter", "TEST");
            mobileGeneralMethod.type(troubleSignInObjects.objFBMessengerNameField(), "FB Name", "TEST");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objReviewPage(), "Review Page.");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objReviewPage());
            String sExceptedErrorMsg = "Please allow us some time to review the details of your request. A customer service representative will contact you for updates and/or to get additional information.";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_38", "Trouble Signing Select Unable to Login Successfully Request Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("TS_TC_38", "Failed to Validate Trouble Signing Select Unable to Login Successfully Request.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Unable to Transaction
    //------Negative
    public void troubleSigningSelectUnabletoTransactionEmpty_TS_TC_39() throws Exception {
        ExtentReporter.logInfo("TS_TC_39", "Trouble Signing Select Unable to Transaction Empty.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objUnableTransactionbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objServiceAffectedText(),"Service Affected")) {
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoEmpty(),"Lost Mobile Empty");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objLostMobileNoEmpty());
            String sExceptedErrorMsg = "Kailangan ang tanong na ito";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_39", "Trouble Signing Select Unable to Transaction Empty Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_39", "Failed to Validate Trouble Signing Select Unable to Transaction Empty.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Negative
    public void troubleSigningSelectUnabletoTransactionEmpty_TS_TC_40() throws Exception {
        ExtentReporter.logInfo("TS_TC_40", "Trouble Signing Select Unable to Transaction Empty.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objUnableTransactionbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objServiceAffectedText(),"Service Affected")) {
            mobileGeneralMethod.tap(troubleSignInObjects.objLoginRadioBtn(), "Click Login Radio Button");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoEmpty(),"Lost Mobile Empty");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objLostMobileNoEmpty());
            String sExceptedErrorMsg = "Kailangan ang tanong na ito";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_40", "Trouble Signing Select Unable to Transaction Empty Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_40", "Failed to Validate Trouble Signing Select Unable to Transaction Empty.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Positive
    public void troubleSigningSelectUnabletoTransactionVisible_TS_TC_41() throws Exception {
        ExtentReporter.logInfo("TS_TC_41", "Trouble Signing Select Unable to Transaction Visible.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objUnableTransactionbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objServiceAffectedText(),"Service Affected")) {
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLoginText(), "Login");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objWalletToWalletText(), "Wallet To Wallet");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objCashInText(), "Cash In");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objCashOutText(), "Cash Out");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objBillsOrEloadText(), "Bills Or Eload");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objMlShopText(), "Ml Shop");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objKwartaPadalaText(), "Kwarta Padala");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objIbaPaText(), "Iba Pa");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(troubleSignInObjects.objProblemEncounterText(), "Problem Encounter");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objProblemEncounterField(), "Problem Encounter");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objFBMessengerNameText(), "FB Messenger Name");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objFBMessengerNameField(), "FB Messenger Name");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(troubleSignInObjects.objBackBtn(), "Back Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objClearFormButton(), "Clear Form Button");
            ExtentReporter.logPass("TS_TC_41", "Trouble Signing Select Unable to Transaction Visible Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_41", "Failed to Validate Trouble Signing Select Unable to Transaction Visible.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Positive
    public void troubleSigningSelectUnabletoTransactionVisible_TS_TC_42() throws Exception {
        ExtentReporter.logInfo("TS_TC_42", "Trouble Signing Select Unable to Transaction Successfully Request.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objUnableTransactionbtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objServiceAffectedText(), "Service Affected")) {
            mobileGeneralMethod.tap(troubleSignInObjects.objLoginRadioBtn(), "Click Login Radio Button");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.type(troubleSignInObjects.objProblemEncounterField(), "Problem Encounter", "TEST");
            mobileGeneralMethod.type(troubleSignInObjects.objFBMessengerNameField(), "FB Name", "TEST");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objReviewPage(), "Review Page.");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objReviewPage());
            String sExceptedErrorMsg = "Please allow us some time to review the details of your request. A customer service representative will contact you for updates and/or to get additional information.";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_42", "Trouble Signing Select Unable to Transaction Successfully Request Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("TS_TC_42", "Failed to Validate Trouble Signing Select Unable to Transaction Successfully Request.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Unable to Deducted Balance
    //------Negative
    public void troubleSigningSelectUnabletoDeductedBalanceEmpty_TS_TC_43() throws Exception {
        ExtentReporter.logInfo("TS_TC_43", "Trouble Signing Select Unable to Deducted Balance Empty.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objDeductedBalancebtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objServiceAffectedText(),"Service Affected")) {
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoEmpty(),"Lost Mobile Empty");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objLostMobileNoEmpty());
            String sExceptedErrorMsg = "Kailangan ang tanong na ito";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_43", "Trouble Signing Select Unable to Deducted Balance Empty Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_43", "Failed to Validate Trouble Signing Select Unable to Deducted Balance Empty.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Negative
    public void troubleSigningSelectUnabletoDeductedBalanceEmpty_TS_TC_44() throws Exception {
        ExtentReporter.logInfo("TS_TC_44", "Trouble Signing Select Unable to Deducted Balance Empty.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objDeductedBalancebtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objServiceAffectedText(),"Service Affected")) {
            mobileGeneralMethod.tap(troubleSignInObjects.objLoginRadioBtn(), "Click Login Radio Button");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLostMobileNoEmpty(),"Lost Mobile Empty");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objLostMobileNoEmpty());
            String sExceptedErrorMsg = "Kailangan ang tanong na ito";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_44", "Trouble Signing Select Unable to Deducted Balance Empty Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_44", "Failed to Validate Trouble Signing Select Unable to Deducted Balance Empty.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Positive
    public void troubleSigningSelectUnabletoDeductedBalanceVisible_TS_TC_45() throws Exception {
        ExtentReporter.logInfo("TS_TC_45", "Trouble Signing Select Unable to Deducted Balance Visible.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objDeductedBalancebtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objServiceAffectedText(),"Service Affected")) {
            mobileGeneralMethod.isVisible(troubleSignInObjects.objLoginText(), "Login");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objWalletToWalletText(), "Wallet To Wallet");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objCashInText(), "Cash In");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objCashOutText(), "Cash Out");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objBillsOrEloadText(), "Bills Or Eload");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objMlShopText(), "Ml Shop");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objKwartaPadalaText(), "Kwarta Padala");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objIbaPaText(), "Iba Pa");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(troubleSignInObjects.objProblemEncounterText(), "Problem Encounter");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objProblemEncounterField(), "Problem Encounter");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objFBMessengerNameText(), "FB Messenger Name");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objFBMessengerNameField(), "FB Messenger Name");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(troubleSignInObjects.objBackBtn(), "Back Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objClearFormButton(), "Clear Form Button");
            ExtentReporter.logPass("TS_TC_45", "Trouble Signing Select Unable to Deducted Balance Visible Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TS_TC_45", "Failed to Validate Trouble Signing Select Unable to Deducted Balance Visible.");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------Positive
    public void troubleSigningSelectUnabletoDeductedBalanceVisible_TS_TC_46() throws Exception {
        ExtentReporter.logInfo("TS_TC_46", "Trouble Signing Select Unable to Deducted Balance Successfully Request.");
        FieldTransaction();
        mobileGeneralMethod.tap(troubleSignInObjects.objDeductedBalancebtn(), "Reset Pin");
        FieldTransactionContinue();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        if (mobileGeneralMethod.isVisible(troubleSignInObjects.objServiceAffectedText(), "Service Affected")) {
            mobileGeneralMethod.tap(troubleSignInObjects.objLoginRadioBtn(), "Click Login Radio Button");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.type(troubleSignInObjects.objProblemEncounterField(), "Problem Encounter", "TEST");
            mobileGeneralMethod.type(troubleSignInObjects.objFBMessengerNameField(), "FB Name", "TEST");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(troubleSignInObjects.objSubmitBtn(), "Submit Button");
            mobileGeneralMethod.isVisible(troubleSignInObjects.objReviewPage(), "Review Page.");
            String sActualErrorMsg = mobileGeneralMethod.getText(troubleSignInObjects.objReviewPage());
            String sExceptedErrorMsg = "Please allow us some time to review the details of your request. A customer service representative will contact you for updates and/or to get additional information.";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            ExtentReporter.logPass("TS_TC_46", "Trouble Signing Select Unable to Deducted Balance Successfully Request Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("TS_TC_46", "Failed to Validate Trouble Signing Select Unable to Deducted Balance Successfully Request.");
            System.out.println("-----------------------------------------------------------");
        }
    }
}
