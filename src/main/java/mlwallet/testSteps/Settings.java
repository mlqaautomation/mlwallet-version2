package mlwallet.testSteps;

import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

import java.util.List;

public class Settings extends Base_Steps{
    public Settings(){
        super();
    }
    Login login = new Login();

    public void handleMpin(String mPin) throws Exception {
        for (int i = 0; i < mPin.length(); i++) {
            char ch = mPin.charAt(i);
            String ch1 = String.valueOf(ch);
            mobileGeneralMethod.tap(mlWalletPageObjects.objEnterMpinVal(ch1), "MPIN");
        }
        LoggingUtils.info("Entered MLPin " + mPin + " Successfully");
        ExtentReporter.logPass("Enter MLPin", "Entered MLPin " + mPin + " Successfully");
    }
    public void navigateToProfile() throws Exception {
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(settingsObjects.objProfileIcon(), "Profile Icon");
        if (mobileGeneralMethod.isVisible(settingsObjects.objAccountDetails(), "Account Details Page")) {
            LoggingUtils.info("Navigated to settings");
        }
    }
    public void settingsAccountDetailsValidation_SS_TC_01() throws Exception {
        ExtentReporter.logInfo("","Settings Account Details validation");
        login.loginWalletBranchTier();
        navigateToProfile();
        mobileGeneralMethod.tap(settingsObjects.objAccountDetails(), "Account Details");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(settingsObjects.objAccountDetails(),"Name");
        mobileGeneralMethod.isVisible(settingsObjects.objNameOfAccountHolder(),"Name");
        mobileGeneralMethod.isVisible(settingsObjects.objMailAddressOfAccountHolder(),"Mail Address");
        mobileGeneralMethod.isVisible(settingsObjects.objMobileNoOfAccountHolder(),"Mobile Number");
        LoggingUtils.info("SS_TC_01, Account Details validated");
        ExtentReporter.logPass("SS_TC_01", "SS_TC_01, Account Details validated");
        System.out.println("-----------------------------------------------------------");
    }
    public void settingsInvalidMLPinValidation_SS_TC_03() throws Exception {
        ExtentReporter.logInfo("","Settings Invalid ML Pin Validation");
        login.loginWalletBranchTier();
        navigateToProfile();
        mobileGeneralMethod.tap(settingsObjects.objChangeMLPin(), "Change ML Pin");
        mobileGeneralMethod.isVisible(settingsObjects.objChangeMLPin(), "Change ML Pin");
        handleMpin("1234");
        if (mobileGeneralMethod.isVisible(settingsObjects.objInvalaidMpinPopUp(),"Error Popup Message")) {
            String sInvalidMPinPopUp = mobileGeneralMethod.getText(settingsObjects.objInvalaidMpinPopUp());
            String sExceptedErrorPOpUp = "You have entered an invalid PIN. Please try again.";
            mobileGeneralMethod.assertionValidation(sInvalidMPinPopUp, sExceptedErrorPOpUp);
            LoggingUtils.info("SS_TC_03, Invalid ML PIN validated");
            ExtentReporter.logPass("SS_TC_03", "SS_TC_03, Invalid ML PIN validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsValidMLPinValidation_SS_TC_02() throws Exception {
        ExtentReporter.logInfo("","Settings Valid ML Pin Validation");
        login.loginWalletBranchTier();
        navigateToProfile();
        mobileGeneralMethod.tap(settingsObjects.objChangeMLPin(), "Change ML Pin");
        mobileGeneralMethod.isVisible(settingsObjects.objChangeMLPin(), "Change ML Pin");
        mobileGeneralMethod.waitSleep(1000);
        handleMpin(propertyReader.getproperty("mPin"));
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(settingsObjects.objEnterNewMMLpinText(), "Page")) {
            mobileGeneralMethod.waitSleep(1000);
            handleMpin(propertyReader.getproperty("newMpin"));
            mobileGeneralMethod.waitSleep(1000);
            handleMpin(propertyReader.getproperty("newMpin"));
            if (mobileGeneralMethod.isVisible(settingsObjects.objMLPinChangedPopup(), "Success Popup")) {
                String sActualSuccessPopUp = mobileGeneralMethod.getText(settingsObjects.objMLPinChangedPopup());
                String sExpectedSuccessPopUp = "ML Pin Successfully Changed";
                mobileGeneralMethod.assertionValidation(sActualSuccessPopUp, sExpectedSuccessPopUp);
                LoggingUtils.info("SS_TC_02 To validate ML PIN validated");
                ExtentReporter.logPass("SS_TC_02", "'SS_TC_02' To validate ML PIN validated");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
    public void settingsBiometricsLogin_SS_TC_04() throws Exception {
        ExtentReporter.logInfo("","Settings Biometrics Login");
        login.loginWalletBranchTier();
        navigateToProfile();
        mobileGeneralMethod.tap(settingsObjects.objBiometricsLogin(),"Option");
        mobileGeneralMethod.tap(settingsObjects.objBiometricsSwitch(), "Biometrics Switch");
        login.enterOTP();
        if (mobileGeneralMethod.isVisible(settingsObjects.objActivateBiometricsLogin(),"Header")) {
            String sActualActiveMsg = mobileGeneralMethod.getText(settingsObjects.objActivateBiometricsLogin());
            String sExceptedActiveMsg = "Activate Biometrics Login";
            mobileGeneralMethod.assertionValidation(sActualActiveMsg, sExceptedActiveMsg);
            LoggingUtils.info("SS_TC_04, Settings Biometrics Login Validated");
            ExtentReporter.logPass("SS_TC_04", "'SS_TC_04' Settings Biometrics Login Validated");
            System.out.println("-----------------------------------------------------------");
        }


    }
    public void settingAccRecovery_SS_TC_05() throws Exception {
        ExtentReporter.logInfo("","Invalid ML Pin Validation");
        login.loginWalletBranchTier();
        navigateToProfile();
        mobileGeneralMethod.tap(settingsObjects.objAccountRecovery(), "Account Recovery");
        mobileGeneralMethod.isVisible(settingsObjects.objMlWalletSupportPage(), "Page");
        mobileGeneralMethod.tap(settingsObjects.objFullNameField(), "First Name Field");
        mobileGeneralMethod.type(settingsObjects.objFullNameField(), propertyReader.getproperty("firstName"), "First Name Field");
//        hideKeyboard();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(settingsObjects.objRegisteredEmail(), "Registered Email Field");
        mobileGeneralMethod.type(settingsObjects.objRegisteredEmail(), propertyReader.getproperty("eMailAddress"), "Registered Email Field");
//        hideKeyboard();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(settingsObjects.objMobileNumber(), "Mobile Number Field");
        mobileGeneralMethod.type(settingsObjects.objMobileNumber(), propertyReader.getproperty("Branch_Verified"), "Mobile Number Field");
//        hideKeyboard();
        mobileGeneralMethod.tap(settingsObjects.objNatureOfReqRadioBtn(),"Text");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
//        scrollToVertical("Next");
        mobileGeneralMethod.tap(settingsObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.isVisible(settingsObjects.objStolenPage(), "Page");
        mobileGeneralMethod.tap(settingsObjects.objYourAnswer(), "Lost/Stolen Mobile Number Field");
        mobileGeneralMethod.type(settingsObjects.objYourAnswer(), propertyReader.getproperty("Branch_Verified"), "Lost/Stolen Mobile Number Field");
//        hideKeyboard();
        mobileGeneralMethod.tap(settingsObjects.objNewMobNo(), "New Mobile Number Field");
        mobileGeneralMethod.type(settingsObjects.objNewMobNo(), propertyReader.getproperty("newMobileNumber"), "New Mobile Number Field");
//        hideKeyboard();
        mobileGeneralMethod.tap(settingsObjects.objFacebookMessangerName(), "Facebook Messenger Name Field");
        mobileGeneralMethod.type(settingsObjects.objFacebookMessangerName(), propertyReader.getproperty("messangerName"), "Facebook Messenger Name Field");
//        hideKeyboard();
//        scrollToVertical("Submit");
        mobileGeneralMethod.tap(settingsObjects.objSumbitBtn(), "Submit Button");
        mobileGeneralMethod.isVisible(settingsObjects.objReviewPage(), "Review Page");
        String actualText = "Please allow us some time to review the details of your request. A customer service representative will contact you for updates and/or to get additional information.";
        String reviewExpectedText = mobileGeneralMethod.getText(settingsObjects.objReviewPage());
        mobileGeneralMethod.assertionValidation(actualText, reviewExpectedText);
        LoggingUtils.info("'SS_TC_05', To verify account recovery validated");
        ExtentReporter.logPass("Account Recovery", "'SS_TC_05', To verify account recovery validated");
        System.out.println("-----------------------------------------------------------");
    }
    public void settingsBackBtnValidation_SS_TC_07() throws Exception {
        ExtentReporter.logInfo("","Settings Back Button Button Validation");
        login.loginWalletBranchTier();
        navigateToProfile();
        mobileGeneralMethod.tap(settingsObjects.objSettingsBackBtn(), "Settings Back Button");
        if (mobileGeneralMethod.isVisible(loginObject.objAvailableBalance(),"Text")) {
            LoggingUtils.info("SS_TC_07, Settings Back Button Button validated");
            ExtentReporter.logPass("SS_TC_07", "SS_TC_07, Settings Back Button Button validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsDeleteAccountPopUpUIValidation_SS_TC_10() throws Exception {
        ExtentReporter.logInfo("","Settings Delete Account PopUp UI Validation");
        login.loginWalletBranchTier();
        navigateToProfile();
        mobileGeneralMethod.tap(settingsObjects.objDeleteAccount(),"Option");
        if (mobileGeneralMethod.isVisible(settingsObjects.objDeleteConfirmationPopUp(),"Confirmation Popup")) {
            String sActualConfirmationPopupMsg = mobileGeneralMethod.getText(settingsObjects.objDeleteConfirmationPopUp());
            String sExpectedConfirmationPopupMsg = "Are you sure you would like to delete your account?";
            mobileGeneralMethod.assertionValidation(sActualConfirmationPopupMsg, sExpectedConfirmationPopupMsg);
            mobileGeneralMethod.isVisible(settingsObjects.objProceedBtn(),"Button");
            mobileGeneralMethod.isVisible(settingsObjects.objCancelBtn(),"Button");
            LoggingUtils.info("SS_TC_10, Settings, Settings Delete Account PopUp UI validated");
            ExtentReporter.logPass("SS_TC_10", "SS_TC_10, Settings Delete Account PopUp UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsChangeMLPinNavigation_SS_TC_12() throws Exception {
        ExtentReporter.logInfo("","Settings Change ML Pin Navigation");
        login.loginWalletBranchTier();
        navigateToProfile();
        mobileGeneralMethod.tap(settingsObjects.objChangeMLPin(),"option");
        Thread.sleep(5000);
        if (mobileGeneralMethod.isVisible(settingsObjects.objChangeMLPin(),"Page")) {
            mobileGeneralMethod.isVisible(settingsObjects.objEnterCurrentMLPin(),"Header");
            mobileGeneralMethod.isVisible(settingsObjects.objKeyword(), "Keyword to Enter MLPin");
            mobileGeneralMethod.isVisible(settingsObjects.objMLPinEditField(), "ML Pin Edit Field");
            LoggingUtils.info("SS_TC_12, Settings Change ML Pin Navigation validated");
            ExtentReporter.logPass("SS_TC_12", "SS_TC_12, Settings Change ML Pin Navigation validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsChangeMlPinBackBtnValidation_SS_TC_13() throws Exception {
        ExtentReporter.logInfo("","Settings Change ML Pin Back Button Validation");
        settingsChangeMLPinNavigation_SS_TC_12();
        mobileGeneralMethod.tap(settingsObjects.objChangeMLPinBackBtn(), "Back Button");
        if (mobileGeneralMethod.isVisible(settingsObjects.objSettings(),"Page")) {
            LoggingUtils.info("SS_TC_13, Settings, After clicking on  Change ML Pin Back Button App Navigated to Settings Page validated");
            ExtentReporter.logPass("SS_TC_13", "SS_TC_13, Settings, After clicking on  Change ML Pin Back Button App Navigated to Settings Page validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsPageUIValidation_SS_TC_06() throws Exception {
        ExtentReporter.logInfo("","Settings Page UI Validation");
        login.loginWalletBranchTier();
        navigateToProfile();
        if (mobileGeneralMethod.isVisible(settingsObjects.objSettings(),"Page")) {
            mobileGeneralMethod.isVisible(settingsObjects.objAccountDetails(),"Option");
            mobileGeneralMethod.isVisible(settingsObjects.objChangeMLPin(),"Option");
            mobileGeneralMethod.isVisible(settingsObjects.objBiometricsLogin(),"Option");
            mobileGeneralMethod.isVisible(settingsObjects.objAccountRecovery(),"Option");
            mobileGeneralMethod.isVisible(settingsObjects.objNotification(),"Option");
            mobileGeneralMethod.isVisible(settingsObjects.objDeleteAccount(),"Option");
            LoggingUtils.info("SS_TC_06, Settings Page UI validated");
            ExtentReporter.logPass("SS_TC_06", "SS_TC_06, Settings Page UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsAccountDetailsNavigation_SS_TC_14() throws Exception {
        ExtentReporter.logInfo("","Settings Account Details Navigation");
        login.loginWalletBranchTier();
        navigateToProfile();
        mobileGeneralMethod.tap(settingsObjects.objAccountDetails(),"Option");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(settingsObjects.objAccountDetails(),"Page")) {
            LoggingUtils.info("SS_TC_14, Settings Account Details Navigation validated");
            ExtentReporter.logPass("SS_TC_14", "SS_TC_14, Settings Account Details Navigation validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsAccountDetailsBackBtnValidation_SS_TC_15() throws Exception {
        ExtentReporter.logInfo("","Settings Account details Back Button Validation");
        settingsAccountDetailsNavigation_SS_TC_14();
        mobileGeneralMethod.tap(settingsObjects.objAccountDetailsBackBtn(), "Back Button");
        if (mobileGeneralMethod.isVisible(settingsObjects.objSettings(),"Page")) {
            LoggingUtils.info("SS_TC_15, Settings Account Details Back Button Navigation validated");
            ExtentReporter.logPass("SS_TC_15", "SS_TC_15, Settings Account Details Back Button Navigation validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingChangeMLPinUIValidation_SS_TC_16() throws Exception {
        ExtentReporter.logInfo("","Settings Change ML Pin UI Validation");
        login.loginWalletBranchTier();
        navigateToProfile();
        mobileGeneralMethod.tap(settingsObjects.objChangeMLPin(),"option");
        Thread.sleep(5000);
        if (mobileGeneralMethod.isVisible(settingsObjects.objChangeMLPin(),"Page")) {
            mobileGeneralMethod.isVisible(settingsObjects.objEnterCurrentMLPin(),"Header");
            mobileGeneralMethod.isVisible(settingsObjects.objKeyword(), "Keyword to Enter MLPin");
            mobileGeneralMethod.isVisible(settingsObjects.objMLPinEditField(), "ML Pin Edit Field");
            LoggingUtils.info("SS_TC_16, Settings Change ML Pin UI validated");
            ExtentReporter.logPass("SS_TC_16", "SS_TC_16, Settings Change ML Pin UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsAccountRecoveryUIValidation_SS_TC_17() throws Exception {
        ExtentReporter.logInfo("","Settings Account Recovery UI Validation");
        login.loginWalletBranchTier();
        navigateToProfile();
        mobileGeneralMethod.tap(settingsObjects.objAccountRecovery(),"Option");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(settingsObjects.objTroubleSigningIn(),"Page")) {
            mobileGeneralMethod.isVisible(settingsObjects.objMLWalletSupport(),"Header");
            mobileGeneralMethod.isVisible(settingsObjects.objFullNameField(), "First Name Field");
            mobileGeneralMethod.isVisible(settingsObjects.objRegisteredEmail(), "Registered Email Field");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(settingsObjects.objMobileNumber(), "Mobile Number Field");
            mobileGeneralMethod.verticalSwipe();
//            if (verifyElementDisplayed(settingsObjects.objNatureOfRequests())) {
//                List<WebElement> values = findElements(settingsObjects.objNatureOfRequests());
//                for (int i = 0; i < values.size(); i++) {
//                    String savedRecipientName = values.get(i).getText();
//                    LoggingUtils.info("Nature of Your Request : " + savedRecipientName + " is displayed");
//                    ExtentReporter.logInfo(" ", "Nature of Your Request : " + savedRecipientName + " is displayed");
//                }
//            }
            LoggingUtils.info("SS_TC_17, Settings Account Recovery UI validated");
            ExtentReporter.logPass("SS_TC_17", "SS_TC_17, Settings Account Recovery UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsDeleteAccountCancelBtnValidation_SS_TC_18() throws Exception {
        ExtentReporter.logInfo("","Settings Delete Account Cancel Button Validation");
        login.loginWalletBranchTier();
        navigateToProfile();
        mobileGeneralMethod.tap(settingsObjects.objDeleteAccount(),"Option");
        mobileGeneralMethod.isVisible(settingsObjects.objDeleteConfirmationPopUp(),"Delete Confirmation Popup");
        mobileGeneralMethod.tap(settingsObjects.objCancelBtn(),"Button");
        if (mobileGeneralMethod.isVisible(settingsObjects.objSettings(),"Page")) {
            LoggingUtils.info("SS_TC_18, Settings, After clicking on Cancel button on Delete Confirmation Popup App should navigate to Settings Page is validated");
            ExtentReporter.logPass("SS_TC_18", "SS_TC_18, Settings, After clicking on Cancel button on Delete Confirmation Popup App should navigate to Settings Page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsBiometricsLoginUIValidation_SS_TC_20() throws Exception {
        ExtentReporter.logInfo("","Settings Biometrics Login UI Validation");
        login.loginWalletBranchTier();
        navigateToProfile();
        mobileGeneralMethod.tap(settingsObjects.objBiometricsLogin(),"Option");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(settingsObjects.objBiometricsLogin(),"Page")) {
            mobileGeneralMethod.isVisible(settingsObjects.objBiometrics(),"Header");
            mobileGeneralMethod.isVisible(settingsObjects.objBiometricsSwitch(), "Biometrics Switch");
            mobileGeneralMethod.isVisible(settingsObjects.objActivateBiometricsLogin(),"Header");
            LoggingUtils.info("SS_TC_20, Settings, Settings Biometrics Login UI validated");
            ExtentReporter.logPass("SS_TC_20", "SS_TC_20, Settings Biometrics Login UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsAccountRecoveryNavigation_SS_TC_21() throws Exception {
        ExtentReporter.logInfo("","Settings Account Recovery Navigation");
        login.loginWalletBranchTier();
        navigateToProfile();
        mobileGeneralMethod.tap(settingsObjects.objAccountRecovery(),"Option");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(settingsObjects.objTroubleSigningIn(),"Page")) {
            LoggingUtils.info("SS_TC_21, Settings, After clicking on Account recovery, application navigated to Trouble Signing in page is validated");
            ExtentReporter.logPass("SS_TC_21", "SS_TC_21, After clicking on Account recovery, application navigated to Trouble Signing in page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsTroubleSigningInBackBtnValidation_SS_TC_22() throws Exception {
        ExtentReporter.logInfo("","Settings Trouble Signing In Bak Btn Validation");
        settingsAccountRecoveryNavigation_SS_TC_21();
        mobileGeneralMethod.tap(settingsObjects.objTroubleSigningInBackBtn(), "Trouble Signing In Page Back Button");
        if (mobileGeneralMethod.isVisible(settingsObjects.objSettings(),"Page")) {
            LoggingUtils.info("SS_TC_22, Settings Account Details Back Button Navigation validated");
            ExtentReporter.logPass("SS_TC_22", "SS_TC_22, Settings Account Details Back Button Navigation validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsBiometricsLoginNavigation_SS_TC_23() throws Exception {
        ExtentReporter.logInfo("","Settings Biometrics Login Navigation");
        login.loginWalletBranchTier();
        navigateToProfile();
        mobileGeneralMethod.tap(settingsObjects.objBiometricsLogin(), "Option");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(settingsObjects.objBiometricsLogin(), "Page")) {
            LoggingUtils.info("SS_TC_23, Settings, After clicking on Account recovery, application navigated to Biometrics Login page is validated");
            ExtentReporter.logPass("SS_TC_23", "SS_TC_23, After clicking on Account recovery, application navigated to Biometrics Login page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsBiometricsLoginBackBtnValidation_SS_TC_24() throws Exception {
        ExtentReporter.logInfo("","Settings Biometrics Login Back Button validation");
        settingsBiometricsLoginNavigation_SS_TC_23();
        mobileGeneralMethod.tap(settingsObjects.objBiometricsLoginBackBtn(), "Biometrics Login Page Back Button");
        if (mobileGeneralMethod.isVisible(settingsObjects.objSettings(),"Page")) {
            LoggingUtils.info("SS_TC_24, Settings Biometrics Login Back Button validated");
            ExtentReporter.logPass("SS_TC_24", "SS_TC_24, Settings Biometrics Login Back Button validated validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsDeleteAccountPageUIValidation_SS_TC_25() throws Exception {
        ExtentReporter.logInfo("","Settings Delete Account Page UI Validation");
        login.loginWalletBranchTier();
        navigateToProfile();
        mobileGeneralMethod.tap(settingsObjects.objDeleteAccount(),"Option");
        mobileGeneralMethod.isVisible(settingsObjects.objDeleteConfirmationPopUp(),"Confirmation Popup");
        mobileGeneralMethod.tap(settingsObjects.objProceedBtn(),"Button");
        if (mobileGeneralMethod.isVisible(settingsObjects.objDeleteAccount(),"Page")) {
            mobileGeneralMethod.isVisible(settingsObjects.objDeleteAccountBackBtn(), "Back Arrow Button");
            mobileGeneralMethod.isVisible(settingsObjects.objWarningHeader(),"Header");
            for (int i = 1; i < 10; i++) {
                if (i % 2 == 0) {
                    mobileGeneralMethod.isVisible(settingsObjects.objWarningMsg(i),"Warning Message");
                }
            }
            mobileGeneralMethod.isVisible(settingsObjects.objDeleteAccount(),"Button");
            mobileGeneralMethod.isVisible(settingsObjects.objIWantToStay(),"Button");
            LoggingUtils.info("SS_TC_25, Settings Delete Account Page UI validated");
            ExtentReporter.logPass("SS_TC_25", "SS_TC_25, Settings Delete Account Page UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsDeleteAccountIWantToStayButtonFunctionality_SS_TC_26() throws Exception {
        ExtentReporter.logInfo("","Settings Delete Account I Want To Stay Button Functionality");
        settingsDeleteAccountPageUIValidation_SS_TC_25();
        mobileGeneralMethod.tap(settingsObjects.objIWantToStay(),"Button");
        if (mobileGeneralMethod.isVisible(settingsObjects.objSettings(),"Page")) {
            LoggingUtils.info("SS_TC_26, Settings Delete Account, After clicking on I Want To Stay Button, App navigates to Settings Page");
            ExtentReporter.logPass("SS_TC_26", "SS_TC_26, Settings Delete Account, After clicking on I Want To Stay Button, App navigates to Settings Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsDeleteAccountPageBackButtonValidation_SS_TC_27() throws Exception {
        ExtentReporter.logInfo("","Settings Delete Account Page Back Button Validation");
        login.loginWalletBranchTier();
        navigateToProfile();
        mobileGeneralMethod.tap(settingsObjects.objDeleteAccount(),"Option");
        mobileGeneralMethod.isVisible(settingsObjects.objDeleteConfirmationPopUp(),"Confirmation Popup");
        mobileGeneralMethod.tap(settingsObjects.objProceedBtn(),"Button");
        mobileGeneralMethod.isVisible(settingsObjects.objDeleteAccount(),"Page");
        mobileGeneralMethod.tap(settingsObjects.objDeleteAccountBackBtn(), "Back Arrow Button");
        if (mobileGeneralMethod.isVisible(settingsObjects.objSettings(),"Page")) {
            LoggingUtils.info("SS_TC_27, Settings Delete Account, After clicking on Back-Arrow Button, App navigates to Settings Page");
            ExtentReporter.logPass("SS_TC_27", "SS_TC_27, Settings Delete Account, After clicking on Back-Arrow Button, App navigates to Settings Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsDeleteAccountButtonFunctionality_SS_TC_28() throws Exception {
        ExtentReporter.logInfo("","Settings Delete Account Button Functionality");
        settingsDeleteAccountPageUIValidation_SS_TC_25();
        mobileGeneralMethod.tap(settingsObjects.objDeleteAccountBtn(),"Button");
        if (mobileGeneralMethod.isVisible(settingsObjects.objDeleteConfirmationPopUp(),"Page")) {
            mobileGeneralMethod.isVisible(settingsObjects.objProceedBtn(),"Button");
            mobileGeneralMethod.isVisible(settingsObjects.objCancelBtn(),"Button");
            LoggingUtils.info("SS_TC_28, Settings Delete Account Button Functionality validated");
            ExtentReporter.logPass("SS_TC_28", "SS_TC_28, Settings Delete Account Button Functionality validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsDeleteAccountConfirmationPopupCancelBtnFunctionality_SS_TC_29() throws Exception {
        ExtentReporter.logInfo("","Settings Delete Account Confirmation Popup Cancel Button Functionality");
        settingsDeleteAccountButtonFunctionality_SS_TC_28();
        mobileGeneralMethod.tap(settingsObjects.objCancelBtn(),"Button");
        if (mobileGeneralMethod.isVisible(settingsObjects.objDeleteAccount(),"Page")) {
            LoggingUtils.info("SS_TC_29, Settings Delete Account Confirmation Popup, After clicking on Cancel button App stays in Delete Account Page");
            ExtentReporter.logPass("SS_TC_29", "SS_TC_29, Settings Delete Account Confirmation Popup, After clicking on Cancel button App stays in Delete Account Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsDeleteAccountConfirmationPopupProceedBtnFunctionality_SS_TC_30() throws Exception {
        ExtentReporter.logInfo("","Settings Delete Account Confirmation Popup Proceed Button Functionality");
        settingsDeleteAccountButtonFunctionality_SS_TC_28();
        mobileGeneralMethod.tap(settingsObjects.objProceedBtn(),"Button");
        if (mobileGeneralMethod.isVisible(settingsObjects.objDeleteAccountMLPin(),"Page")) {
            LoggingUtils.info("SS_TC_30, Settings Delete Account Confirmation Popup, After clicking on Proceed button App navigates to Delete Account ML pin Page");
            ExtentReporter.logPass("SS_TC_30", "SS_TC_30, Settings Delete Account Confirmation Popup, After clicking on Proceed button App navigates to Delete Account ML pin Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsDeleteAccountMLPinPageUIValidation_SS_TC_31() throws Exception {
        ExtentReporter.logInfo("","Settings Delete Account ML Pin Page UI Validation");
        settingsDeleteAccountButtonFunctionality_SS_TC_28();
        mobileGeneralMethod.tap(settingsObjects.objProceedBtn(),"Button");
        if (mobileGeneralMethod.isVisible(settingsObjects.objDeleteAccountMLPin(),"Page")) {
            mobileGeneralMethod.isVisible(settingsObjects.objEnterCurrentMLPinHeader(),"Header");
            mobileGeneralMethod.isVisible(settingsObjects.objMLInputField(), "ML Pin Input Field");
            LoggingUtils.info("SS_TC_31, Settings Delete Account ML Pin Page UI Validated");
            ExtentReporter.logPass("SS_TC_31", "SS_TC_31, Settings Delete Account ML Pin Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsDeleteAccountMLPinPageBackArrowBtnFunctionality_SS_TC_32() throws Exception {
        ExtentReporter.logInfo("","Settings Delete Account ML Pin Page Back Arrow Button Functionality");
        settingsDeleteAccountButtonFunctionality_SS_TC_28();
        mobileGeneralMethod.tap(settingsObjects.objProceedBtn(),"Button");
        mobileGeneralMethod.isVisible(settingsObjects.objDeleteAccountMLPin(),"Page");
        mobileGeneralMethod.tap(settingsObjects.objDeleteAccMLPinBackBtn(),"Button");
        if (mobileGeneralMethod.isVisible(settingsObjects.objDeleteAccount(),"Page")) {
            LoggingUtils.info("SS_TC_32, Settings Delete Account ML Pin Page Back Arrow Button Validated");
            ExtentReporter.logPass("SS_TC_32", "SS_TC_32, Settings Delete Account ML Pin Page Back Arrow Button Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsDeleteAccountInvalidMLPin_SS_TC_34() throws Exception {
        ExtentReporter.logInfo("","Settings Delete Account Invalid ML Pin");
        settingsDeleteAccountButtonFunctionality_SS_TC_28();
        mobileGeneralMethod.tap(settingsObjects.objProceedBtn(),"Button");
        mobileGeneralMethod.isVisible(settingsObjects.objDeleteAccountMLPin(),"Page");
        handleMpin("9999");
        if (mobileGeneralMethod.isVisible(settingsObjects.objInvalidMLPinMsg(),"Popup")) {
            String sActualInvalidMLPinMsg = mobileGeneralMethod.getText(settingsObjects.objInvalidMLPinMsg());
            String sExceptedMsg = "You have entered an invalid PIN. Please try again.";
            mobileGeneralMethod.assertionValidation(sActualInvalidMLPinMsg, sExceptedMsg);
            mobileGeneralMethod.isVisible(settingsObjects.objOKBtn(),"Button");
            LoggingUtils.info("SS_TC_34, Settings Delete Account Invalid ML Pin message Validated");
            ExtentReporter.logPass("SS_TC_34", "SS_TC_34, Settings Delete Account Invalid ML Pin message Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void settingsDeleteAccountInvalidMLPinPopupOkBtnFunctionality_SS_TC_35() throws Exception {
        ExtentReporter.logInfo("","Settings Delete Account invalid ML Pin Popup Ok Button Functionality");
        settingsDeleteAccountInvalidMLPin_SS_TC_34();
        mobileGeneralMethod.tap(settingsObjects.objOKBtn(),"Button");
        if (mobileGeneralMethod.isVisible(settingsObjects.objDeleteAccountMLPin(),"Page")) {
            LoggingUtils.info("SS_TC_35, Settings Delete Account invalid ML Pin Popup Ok Button Functionality Validated");
            ExtentReporter.logPass("SS_TC_35", "SS_TC_35, Settings Delete Account invalid ML Pin Popup Ok Button Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
}
