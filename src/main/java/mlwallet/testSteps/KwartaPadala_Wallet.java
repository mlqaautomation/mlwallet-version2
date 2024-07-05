package mlwallet.testSteps;
import utilities.Driver.AppiumDriverManager;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;
import mlwallet.testSteps.Login;
import utilities.yamlReader.yamlReader;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class KwartaPadala_Wallet extends Base_Steps {

    Login login = new Login();
    public void enterAmountAndSendToMLWallet() throws Exception {
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objToMLWalletUser(), "MLWallet User")) {
            mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "Amount", propertyReader.getproperty("AmountInput"));
            mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.tap(kwartaPadalaObjects.objMLWalletBalance(), "MLWallet Balance Button");
            mobileGeneralMethod.waitSleep(8000);
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objConfirmDetails(), "Confirm Details Page");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(kwartaPadalaObjects.objSendPHPBtn(), "Send PHP Button");
        }
    }
    public void internetConnectionError() throws Exception {
        if (mobileGeneralMethod.isVisible(homePageObject.objInternetConnectionPopUp(), "Pop Up Message")) {
            mobileGeneralMethod.isVisible(homePageObject.objInternetConnectionMsg(), " Error Message");
            mobileGeneralMethod.isVisible(homePageObject.objOkBtn(), "Button");
            mobileGeneralMethod.setWifiConnectionToONOFF("ON");

        }
    }
    public void permissionDenyCloseBtnFunctionality() throws Exception {
        permissionDenyPopUp();
        mobileGeneralMethod.tap(homePageObject.objCloseBtn(), "Button");
    }
    public void locationPopUpAllowFunctionality() throws Exception {
        locationPopUpValidation();
        mobileGeneralMethod.tap(homePageObject.obPopupAllowBtn(), "Button");
    }
    public void permissionDenyOpenSettingsBtnFunctionality() throws Exception {
        permissionDenyPopUp();
        mobileGeneralMethod.tap(homePageObject.objOpenSettingBtn(), "Button");
    }
    public void permissionDenyPopUp() throws Exception {
        locationPopUpValidation();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objBackToHomeBtn(), "Button");
        if (mobileGeneralMethod.isVisible(homePageObject.objPermissionDeniedPopUp(), "PopUp")) {
            mobileGeneralMethod.isVisible(homePageObject.objOpenSettingBtn(), "Button");
            mobileGeneralMethod.isVisible(homePageObject.objCloseBtn(), "Button");
        }
    }
    public void enableLocation_PopUp() throws Exception {
        String loc = mobileGeneralMethod.getText(loginObject.objLocationPopup());
        if (loc.contains("Allow")) {
            LoggingUtils.info(loc + " Pop Up is Displayed");
            ExtentReporter.logPass("pop up", loc + " Pop Up is Displayed");
            mobileGeneralMethod.tap(kwartaPadalaObjects.objLocationPermission(), "Allow Button");
        } else {
            LoggingUtils.info(" Location Pop Up is not Displayed");
            ExtentReporter.logPass("pop up", "Location Pop Up is not Displayed");
        }
    }
    public void enterAmountAndSendToMLWallet(String nAmount) throws Exception {
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objToMLWalletUser(),"Page")) {
            mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "Amount Text Field", nAmount);
            mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Button");
            mobileGeneralMethod.waitSleep(1000);
           mobileGeneralMethod.tap(kwartaPadalaObjects.objMLWalletBalance(), "Button");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objConfirmDetails(), "Page");
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.tap(kwartaPadalaObjects.objSendPHPBtn(), "Button");
        }
    }
    public void locationPopUpValidation() throws Exception {
        if (mobileGeneralMethod.isVisible(homePageObject.objPopUpMsg(), "PopUp Msg")) {
            mobileGeneralMethod.isVisible(homePageObject.obPopupAllowBtn(), "Button");
            mobileGeneralMethod.isVisible(homePageObject.objLocationPopUpAllowOnceBtn(), "Button");
            mobileGeneralMethod.isVisible(homePageObject.objPopUpDenyBtn(), "Button");
        }
    }
    public void kwartaPadalaViaMLWalletSuccessfulTransaction_STW_TC_02() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        enterAmountAndSendToMLWallet();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        mobileGeneralMethod.waitSleep(20000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWallet(), "Send Money MLWallet Message");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWalletPHP(), "Amount");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWalletDate(), "Date");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMLWalletReferenceNumber(), "Reference Number");
        String sReferenceNumber = mobileGeneralMethod.getText(kwartaPadalaObjects.objMLWalletReferenceNumber());
        System.out.println(sReferenceNumber);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objBackToHomeBtn(), "Back To Home Button");
        Thread.sleep(3000);
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(), "Recent Transactions");
        mobileGeneralMethod.isVisible(homePageObject.objWalletToWallet(), "Wallet To Wallet");
        mobileGeneralMethod.tap(homePageObject.objWalletToWallet(), "Wallet To Wallet");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReferenceNumberInTransactionDetails(), "Page")) {
            String sReferenceNumberInWalletToWallet = mobileGeneralMethod.getText(kwartaPadalaObjects.objReferenceNumberInTransactionDetails());
            System.out.println(sReferenceNumberInWalletToWallet);
            mobileGeneralMethod.assertionValidation(sReferenceNumberInWalletToWallet, sReferenceNumber);
            LoggingUtils.info("STW_TC_02(), Successfully Amount sent from Wallet to Wallet to Recently added favorite and Transaction Details is validated");
            ExtentReporter.logPass("STW_TC_02", "STW_TC_02(), Successfully Amount sent from Wallet to Wallet to Recently added favorite and Transaction Details is validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_02", "STW_TC_02(), Failed Amount sent from Wallet to Wallet to Recently added favorite and Transaction Details is validated");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyAddToFavorites_STW_TC_12() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        enterAmountAndSendToMLWallet();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        mobileGeneralMethod.waitSleep(20000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWallet(), "Send Money MLWallet Message");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWalletPHP(), "Amount");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWalletDate(), "Date");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMLWalletReferenceNumber(), "Reference Number");
        String sReferenceNumber = mobileGeneralMethod.getText(kwartaPadalaObjects.objMLWalletReferenceNumber());
        System.out.println(sReferenceNumber);
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSaveToMyFavorite(), "Button");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objAddedToFavoritesMsg(), "Message")) {
            mobileGeneralMethod.tap(kwartaPadalaObjects.objOkBtn(), "Button");
        }
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Page")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objFavoriteReceiver(), "Added Favorites");
            LoggingUtils.info("STW_TC_12(), Successfully Added to Favorites  Contacts");
            ExtentReporter.logPass("STW_TC_12", "STW_TC_12(),  Successfully Added to Favorites  Contacts");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_12", "STW_TC_12(), Failed To Add Favorites  Contacts");
            System.out.println("-----------------------------------------------------------");

        }
    }

//        public void sendToMLWalletInvalidMobNumber_STW_TC_03() throws Exception {
//        login.loginWalletFullyTier();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(),  "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number",propertyReader.getproperty());
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
//        mobileGeneralMethod.waitSleep(10000);
//        if( mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMobileNumberErrorMsg(),  "Error Message")){
//            String sFirstNameErrorMsg =  mobileGeneralMethod.getText(kwartaPadalaObjects.objMobileNumberErrorMsg());
//            String sExpectedMsg = "Mobile number is invalid";
//            mobileGeneralMethod.assertionValidation(sFirstNameErrorMsg, sExpectedMsg);
//            LoggingUtils.info("STW_TC_03(), Successfully Verified Invalid Mobile Number");
//            ExtentReporter.logPass("STW_TC_03", "STW_TC_03(),  Successfully Verified Invalid Mobile Number");
//            System.out.println("-----------------------------------------------------------");
//        }
//        else{
//            ExtentReporter.logFail("STW_TC_03", "STW_TC_03(), Failed To Verified Invalid Mobile Number");
//            System.out.println("-----------------------------------------------------------");
//
//        }
//    }
//    public void sendToMLWalletUnRegisteredNumber_STW_TC_04() throws Exception {
//        login.loginWalletFullyTier();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(),  "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number",propertyReader.getproperty());
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
//        mobileGeneralMethod.waitSleep(10000);
//        if( mobileGeneralMethod.isVisible(kwartaPadalaObjects.objUnRegisteredMobNumber(),  "Error Message")){
//            String sFirstNameErrorMsg =  mobileGeneralMethod.getText(kwartaPadalaObjects.objUnRegisteredMobNumber());
//            String sExpectedMsg = "Customer not found.";
//            mobileGeneralMethod.assertionValidation(sFirstNameErrorMsg, sExpectedMsg);
//            LoggingUtils.info("STW_TC_04(), Receiver not Found - Error Message is validated");
//            ExtentReporter.logPass("STW_TC_04", "STW_TC_04(),  Receiver not Found - Error Message is validated");
//            System.out.println("-----------------------------------------------------------");
//        }
//        else{
//            ExtentReporter.logFail("STW_TC_04", "STW_TC_04(), Failed to Validate Error Message - Receiver not Found ");
//            System.out.println("-----------------------------------------------------------");
//
//        }
//    }
    public void sendToMLWalletInvalidAmount_STW_TC_05(String Amount) throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "Amount Text Field",Amount );
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objInvalidAmountMsg(), "Error Message")) {
            String sInvalidAmountErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objInvalidAmountMsg());
            String sExpectedErrorMsg = "The amount should not be less than 1";
            mobileGeneralMethod.assertionValidation(sInvalidAmountErrorMsg, sExpectedErrorMsg);
            LoggingUtils.info("STW_TC_05, The amount should not be less than 1 - Error Message is validated");
            ExtentReporter.logPass("STW_TC_05", "STW_TC_05, The amount should not be less than 1 - Error Message is validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_05", "STW_TC_05(), Failed to Validate Error Message - The amount should not be less than 1");
            System.out.println("-----------------------------------------------------------");

        }
    }
//    public void sendToMLWalletInsufficientAmount_STW_TC_06() throws Exception {
//        login.loginWalletFullyTier();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(),  "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number",propertyReader.getproperty("MobileNo"));
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
//        enterAmountAndSendToMLWallet("35000");
//       mobileGeneralMethod.waitSleep(35000);
//        if( mobileGeneralMethod.isVisible(kwartaPadalaObjects.objInsufficientAmountMsg(),  "Error Message")){
//            String sInvalidAmountErrorMsg =  mobileGeneralMethod.getText(kwartaPadalaObjects.objInsufficientAmountMsg());
//            String sExpectedErrorMsg = "There is insufficient balance to proceed with this transaction. Please try again.";
//            mobileGeneralMethod.assertionValidation(sInvalidAmountErrorMsg, sExpectedErrorMsg);
//            LoggingUtils.info("STW_TC_06(),Insufficient Balance - Error Message is validated");
//            ExtentReporter.logPass("STW_TC_06", "STW_TC_06(),Insufficient Balance - Error Message is validated");
//            System.out.println("-----------------------------------------------------------");
//        }
//        else{
//            ExtentReporter.logFail("STW_TC_06", "STW_TC_06(), Failed to Validate Error Message - Insufficient Balance");
//            System.out.println("-----------------------------------------------------------");
//
//        }
//    }

    public void sendMoneyMLWalletMaximumAmount_STW_TC_07() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(),  "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        enterAmountAndSendToMLWallet("100000");
        mobileGeneralMethod.waitSleep(35000);
        if( mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMaxLimitErrorMsg(),  "Error Message")){
            String sMaximumLimitErrorMsg =  mobileGeneralMethod.getText(kwartaPadalaObjects.objMaxLimitErrorMsg());
            String sExpectedErrorMsg = "The maximum Send Money per transaction set for your verification level is P50,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExpectedErrorMsg);
            LoggingUtils.info("STW_TC_07, The maximum send money per transaction - Error Message is validated");
            ExtentReporter.logPass("STW_TC_07", "STW_TC_07, The maximum send money per transaction - Error Message is validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("STW_TC_07", "STW_TC_07(), Failed to Validate Error Message - The maximum send money per transaction");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyDeleteFromFavorites_STW_TC_09() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objViewAllBtn(), "Text");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objEllipsisBtn(), "Ellipsis Button");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objDeleteBtn(), "Button");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objConfirmBtn(), "Button");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objFavRemovedMsg(), "Pop up Message")) {
            String sRemovedSuccessfulMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objFavRemovedMsg());
            String sExpectedMsg = "Successfully Removed";
            mobileGeneralMethod.assertionValidation(sRemovedSuccessfulMsg, sExpectedMsg);
            LoggingUtils.info("STW_TC_09, Successfully removed Favorite Contact from favorites list is validated");
            ExtentReporter.logPass("STW_TC_09", "STW_TC_09, Successfully removed Favorite Contact from favorites list is validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_09", "STW_TC_09(), Failed to removed Favorite Contact from favorites list ");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyMLWalletUIValidation_STW_TC_10() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Page")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objViewAllBtn(), "Button");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objRecentFavorites(), "Header");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiver(), "Header");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMobileNumberField(), "Mobile number input text field");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objNextBtn(), "Button");
            LoggingUtils.info("STW_TC_10, Send Money ML Wallet Page UI validated");
            ExtentReporter.logPass("STW_TC_10", "STW_TC_10, Send Money ML Wallet Page UI validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_10", "STW_TC_10, Failed to validate Send Money ML Wallet UI Page ");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyFavoritesUIValidation_STW_TC_11() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Page");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objViewAllBtn(), "Button")) {
            mobileGeneralMethod.tap(kwartaPadalaObjects.objViewAllBtn(), "Button");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.ObjFavorites(), "Page");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSearchFavoriteField(), "Search Favorites Field");
            LoggingUtils.info("STW_TC_11, Send Money ML Wallet Page UI validated");
            ExtentReporter.logPass("STW_TC_11", "STW_TC_11, Send Money ML Wallet Page UI validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_11", "STW_TC_11, Failed to validate Send Money ML Wallet UI Page ");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyMLWalletCancelTransaction_STW_TC_13(String Amount) throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
       mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
            mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
            mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
            mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objToMLWalletUser(), "Page")) {
            mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "Amount Text Field",Amount );
            mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
            mobileGeneralMethod.tap(kwartaPadalaObjects.objMLWalletBalance(), "MLWallet Balance Button");
            mobileGeneralMethod.waitSleep(8000);
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objConfirmDetails(), "Confirm Details Page");
            mobileGeneralMethod.tap(kwartaPadalaObjects.objCancelTransaction(), "Cancel Button");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
            LoggingUtils.info("STW_TC_13, Cancelled the current Transaction");
            ExtentReporter.logPass("STW_TC_13", "STW_TC_13, Cancelled the current Transaction");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_13", "STW_TC_13, Failed to validate cancellation of current Transaction ");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyMLWalletSearchUnFavoriteUser_STW_TC_14() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(kwartaPadalaObjects.objViewAllBtn(), "Text");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.ObjFavorites(), "Favorites Header")) {
            mobileGeneralMethod.type(kwartaPadalaObjects.objSearchFavoriteField(), "Search Field", "ABCD");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objNoRecentTransactionTxt(), "Added Favorite");
            String Actual = mobileGeneralMethod.getText(kwartaPadalaObjects.objNoRecentTransactionTxt());
            String Expected = "No Recent Transaction";
            mobileGeneralMethod.assertionValidation(Actual, Expected);
            LoggingUtils.info("STW_TC_14, Send Money ML Wallet Search UnFavorite User Validated");
            ExtentReporter.logPass("STW_TC_14", "STW_TC_14, Send Money ML Wallet Search UnFavorite User Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_14", "STW_TC_14(), Failed to Validate Send Money ML Wallet Search UnFavorite User ");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyMLWalletSearchFavoriteUser_STW_TC_15() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(kwartaPadalaObjects.objViewAllBtn(), "Text");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.ObjFavorites(), "Favorites Header")) {
            mobileGeneralMethod.type(kwartaPadalaObjects.objSearchFavoriteField(),"Search Field", propertyReader.getproperty("Last_Name"));
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objAddedFavorite(), "Added Favorite");
            LoggingUtils.info("STW_TC_15, Send Money ML Wallet Search Favorite User Validated");
            ExtentReporter.logPass("STW_TC_15", "STW_TC_15, Send Money ML Wallet Search Favorite User Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_15", "STW_TC_15(), Failed to Validate Send Money ML Wallet Search UnFavorite User ");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyMLWalletSuccessPageUIValidation_STW_TC_16() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        enterAmountAndSendToMLWallet();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        mobileGeneralMethod.waitSleep(20000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWallet(), "Message")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWalletPHP(), "Amount");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWalletDate(), "Date");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMLWalletReferenceNumber(), "Reference Number");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiverName(), "Receiver Name");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiverMobileNo(), "Receiver's Mobile Number");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPaymentMethod(), "Payment Method");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objAmount(), "Amount");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTotalAmount(), "Total Amount");
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSaveToMyFavorite(), "Button");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objBackToHomeBtn(), "Button");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objNewTransaction(), "Button");
            LoggingUtils.info("STW_TC_16,Send Money ML Wallet Success Page UI Validated");
            ExtentReporter.logPass("STW_TC_16", "STW_TC_16,Send Money ML Wallet Success Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_16", "STW_TC_16(), Failed to Validate Send Money ML Wallet Success Page UI Validated ");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyMLWalletOTPPageUIValidation_STW_TC_17() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(mlWalletPageObjects.continue2_btn(), "Button")) {
            LoggingUtils.info("STW_TC_17, One Time Pin page UI Validated");
            ExtentReporter.logPass("STW_TC_17", "STW_TC_17, One Time Pin page UI Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_17", "STW_TC_16(), Failed to Validate One Time Pin page UI ");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyMLWalletConfirmDetailsPageUIValidation_STW_TC_18(String nAmount) throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objToMLWalletUser(), "MLWallet User");
        mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "Amount",nAmount);
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(kwartaPadalaObjects.objMLWalletBalance(), "MLWallet Balance Button");
        mobileGeneralMethod.waitSleep(8000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objConfirmDetails(), "Button")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiverName(), "Page");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiverMobileNo(), "Receiver Name");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPaymentMethod(), "Receiver's Mobile Number");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objAmount(), "Amount");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTotalAmount(), "Total Amount");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objCancelTransaction(), "Button");
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendPHPBtn(), "Button");
            LoggingUtils.info("STW_TC_18, Send Money ML Wallet Confirm Details Page UI Validated");
            ExtentReporter.logPass("STW_TC_18", "STW_TC_18, Send Money ML Wallet Confirm Details Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_18", "STW_TC_18(), Failed to Validate Send Money ML Wallet Confirm Details Page UI ");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMlWalletEnterAmountPageUIValidation_STW_TC_19() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objToMLWalletUser(), "MLWallet User")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objAmountToSend(), "Header");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objAmountTxtField(), "Amount Text Field");
            mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
            LoggingUtils.info("STW_TC_19, Send Money To Ml Wallet Enter Amount Page UI Validated");
            ExtentReporter.logPass("STW_TC_19", "STW_TC_19, Send Money To Ml Wallet Enter Amount Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_19", "STW_TC_19(), Failed to Validate Send Money To Ml Wallet Enter Amount Page");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLWalletPageUIValidation_STW_TC_20() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Page")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objRecentFavorites(), "Header");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objViewAllBtn(), "Button");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiver(), "Header");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMobileNumberField(), "Mobile Number Text Field");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objNextBtn(), "Button");
            LoggingUtils.info("STW_TC_20, Send Money To ML Wallet Page UI Validated");
            ExtentReporter.logPass("STW_TC_20", "STW_TC_20, Send Money To ML Wallet Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_20", "STW_TC_20(), Failed to Validate Send Money To ML Wallet Page");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyMlWalletTransactionDetailsUIValidation_STW_TC_21() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        enterAmountAndSendToMLWallet();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        mobileGeneralMethod.waitSleep(20000);
      if(mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWallet(), "Send Money MLWallet Message")) {
          mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWalletPHP(), "Amount");
          mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWalletDate(), "Date");
          mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMLWalletReferenceNumber(), "Reference Number");
          String sReferenceNumber = mobileGeneralMethod.getText(kwartaPadalaObjects.objMLWalletReferenceNumber());
          System.out.println(sReferenceNumber);
          mobileGeneralMethod.verticalSwipe();
          mobileGeneralMethod.tap(kwartaPadalaObjects.objBackToHomeBtn(), "Back To Home Button");
          Thread.sleep(3000);
          mobileGeneralMethod.verticalSwipeDown();
          mobileGeneralMethod.verticalSwipe();
          mobileGeneralMethod.waitSleep(3000);
          mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(), "Recent Transactions");
          mobileGeneralMethod.isVisible(homePageObject.objWalletToWallet(), "Wallet To Wallet");
          mobileGeneralMethod.tap(homePageObject.objWalletToWallet(), "Wallet To Wallet");
          if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTransactionDetails(), "Page")) {
              mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReferenceNumberInTransactionDetails(), "Reference Number");
              mobileGeneralMethod.isVisible(kwartaPadalaObjects.objDate(), "Date");
              mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiverName(), "Receiver Name");
              mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiverMobileNo(), "Receiver's Mobile Number");
              mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPaymentMethod(), "Payment Method");
              mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSenderName(), "Sender Name");
              mobileGeneralMethod.isVisible(kwartaPadalaObjects.objAmount(), "Amount");
              mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee");
              mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTotalAmount(), "Total Amount");
              LoggingUtils.info("STW_TC_21, Transaction Details of Wallet To Wallet Page UI Validation Validated");
              ExtentReporter.logPass("STW_TC_21", "STW_TC_21, Transaction Details of Wallet To Wallet Page UI Validation Validated");
              System.out.println("-----------------------------------------------------------");
          }
      }else {
            ExtentReporter.logFail("STW_TC_21", "STW_TC_21(), Failed to Validate Transaction Details of Wallet To Wallet Page");
            System.out.println("-----------------------------------------------------------");

        }
    }

//        public void sendMoneyMLWalletBuyerTierAccountUser_STW_TC_22() throws Exception {
//        login.loginWalletBuyerTier();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
//        mobileGeneralMethod.waitSleep(3000);
//        enterAmountAndSendToMLWallet();
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objErrorMsg(), "Error Message")) {
//            String Expected = mobileGeneralMethod.getText(kwartaPadalaObjects.objErrorMsg());
//            String Actual = "Send Money is not allowed for customers at this verification level. Please upgrade your account to use this service.";
//            mobileGeneralMethod.assertionValidation(Expected, Actual);
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objUpgradeNowBtn(), "Button");
//            LoggingUtils.info("STW_TC_22, Send Money is not allowed for customers at this Buyer tier - Error Message is validated");
//            ExtentReporter.logPass("STW_TC_22", "STW_TC_22, Send Money is not allowed for customers at this Buyer tier - Error Message is validated");
//            System.out.println("-----------------------------------------------------------");
//        } else {
//            ExtentReporter.logFail("STW_TC_22", "STW_TC_22(), Failed to Validate  Error Message - Send Money is not allowed for customers at this Buyer tier");
//            System.out.println("-----------------------------------------------------------");
//
//        }
//    }
//    public void sendMoneyMLWalletSemiVerifiedAccountUser_STW_TC_23() throws Exception {
//        login.loginWalletSemiVerifiedTier();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(),  "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number",propertyReader.getproperty("MobileNo"));
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
//        mobileGeneralMethod.waitSleep(3000);
//        enterAmountAndSendToMLWallet();
//        mobileGeneralMethod.waitSleep(10000);
//        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
//        mobileGeneralMethod.waitSleep(20000);
//        if( mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTransactionDetails(), "Page")){
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMLWalletReferenceNumber(), "Transaction Number");
//            LoggingUtils.info("STW_TC_23, Send Money ML Wallet Semi-Verified Account User Transaction validated");
//            ExtentReporter.logPass("STW_TC_23", "STW_TC_23, Send Money ML Wallet Semi-Verified Account User Transaction validated");
//            System.out.println("-----------------------------------------------------------");
//        } else {
//            ExtentReporter.logFail("STW_TC_23", "STW_TC_23(), Failed to Validate Send Money ML Wallet Semi-Verified Account User Transaction");
//            System.out.println("-----------------------------------------------------------");
//
//        }
//    }
    public void sendMoneyMLWalletBranchVerifiedAccountUser_STW_TC_24() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        enterAmountAndSendToMLWallet();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        mobileGeneralMethod.waitSleep(20000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTransactionDetails(), "Page")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMLWalletReferenceNumber(), "Transaction Number");
            LoggingUtils.info("STW_TC_24, Send Money ML Wallet Branch-Verified Account User Transaction validated");
            ExtentReporter.logPass("STW_TC_24", "STW_TC_24, Send Money ML Wallet Branch-Verified Account User Transaction validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_24", "STW_TC_24(), Failed to Validate Send Money ML Wallet Branch-Verified Account User Transaction");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyMLWalletFullyVerifiedAccountUser_STW_TC_25() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        enterAmountAndSendToMLWallet();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        mobileGeneralMethod.waitSleep(20000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTransactionDetails(), "Page")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMLWalletReferenceNumber(), "Transaction Number");
            LoggingUtils.info("STW_TC_25, Send Money ML Wallet Fully-Verified Account User Transaction validated");
            ExtentReporter.logPass("STW_TC_25", "STW_TC_25, Send Money ML Wallet Fully-Verified Account User Transaction validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_25", "STW_TC_25(), Failed to Validate Send Money ML Wallet Fully-Verified Account User Transaction");
            System.out.println("-----------------------------------------------------------");

        }
    }

//    public void sendMoneyMLWalletSemiVerifiedAccountMaxLimit_STW_TC_26() throws Exception {
//        login.loginWalletSemi_Verified();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
//        enterAmountAndSendToMLWallet("60000");
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objErrorMsg(), "Error Message")) {
//            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objErrorMsg());
//            String sExpectedErrorMsg = "The maximum Send Money per transaction set for your verification level is P50,000.00. Please try again.";
//            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExpectedErrorMsg);
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objUpgradeNowBtn(),"Button");
//            LoggingUtils.info("STB_TC_26, Send Money To ML Wallet Semi-Verified Account Maximum Limit - Error Message is validated");
//            ExtentReporter.logPass("STB_TC_26", "STB_TC_26, Send Money To ML Wallet Semi-Verified Account Maximum Limit - Error Message is validated");
//            System.out.println("-----------------------------------------------------------");
//        } else {
//            ExtentReporter.logFail("STB_TC_26", "STB_TC_26(), Failed to Validate Error Message -  Send Money To ML Wallet Semi-Verified Account Maximum Limit");
//            System.out.println("-----------------------------------------------------------");
//
//        }
//    }
    public void sendMoneyMLWalletBranchVerifiedAccountMaxLimit_STW_TC_29() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        enterAmountAndSendToMLWallet("60000");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMaxLimitErrorMsg(), "Error Message")) {
            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objMaxLimitErrorMsg());
            String sExpectedErrorMsg = "The maximum Send Money per transaction set for your verification level is P50,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExpectedErrorMsg);
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objGotItBtn(),"Button");
            LoggingUtils.info("STW_TC_29, Send Money To ML Wallet Branch-Verified Account Maximum Limit - Error Message is validated");
            ExtentReporter.logPass("STW_TC_29", "STW_TC_29, Send Money To ML Wallet Branch-Verified Account Maximum Limit - Error Message is validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_29", "STW_TC_29(), Failed to Validate Error Message -  Send Money To ML Wallet Branch-Verified Account Maximum Limit");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyMLWalletFullyVerifiedAccountMaxLimit_STW_TC_32() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        enterAmountAndSendToMLWallet("60000");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMaxLimitErrorMsg(), "Error Message")) {
            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objMaxLimitErrorMsg());
            String sExpectedErrorMsg = "The maximum Send Money per transaction set for your verification level is P50,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExpectedErrorMsg);
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objGotItBtn(),"Button");
            LoggingUtils.info("STW_TC_32, Send Money To ML Wallet Fully-Verified Account Maximum Limit - Error Message is validated");
            ExtentReporter.logPass("STW_TC_32", "STW_TC_32, Send Money To ML Wallet Fully-Verified Account Maximum Limit - Error Message is validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_32", "STW_TC_32(), Failed to Validate Error Message -  Send Money To ML Wallet Fully-Verified Account Maximum Limit");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLWalletSuccessMsgValidation_STW_TC_35() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        enterAmountAndSendToMLWallet("10");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        mobileGeneralMethod.waitSleep(20000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTransactionDetails(), "Page");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMLWalletReferenceNumber(), "Reference Number");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(), "Recent Transactions");
        mobileGeneralMethod.isVisible(homePageObject.objWalletToWallet(), "Wallet To Wallet");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objWalletToWalletStatus(), "Status")) {
            String Expected = mobileGeneralMethod.getText(kwartaPadalaObjects.objWalletToWalletStatus());
            String Actual = "Success";
            mobileGeneralMethod.assertionValidation(Expected, Actual);
            LoggingUtils.info("STW_TC_35, Send Money To ML Wallet Success Message validated");
            ExtentReporter.logPass("STW_TC_35", "STW_TC_35, Send Money To ML Wallet Success Message validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_35", "STW_TC_35(), Failed To Validate Send Money To ML Wallet Success Message");
            System.out.println("-----------------------------------------------------------");

        }
    }

//        public void sendMoneyToMLWalletMaxTransactionReceivingLimitSemiVerifiedTier_STW_TC_36(String sAmount) throws Exception {
//        login.loginWalletSemiVerified_MaxTransactionSender();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(),  "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number",propertyReader.getproperty("MobileNo"));
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
//        mobileGeneralMethod.waitSleep(3000);
//        enterAmountAndSendToMLWallet(sAmount);
//        mobileGeneralMethod.waitSleep(10000);
//        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
//        mobileGeneralMethod.waitSleep(20000);
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWallet(), "Send Money MLWallet Message");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWalletPHP(), "Amount");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWalletDate(), "Date");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMLWalletReferenceNumber(), "Reference Number");
//        mobileGeneralMethod.verticalSwipe();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objBackToHomeBtn(), "Back To Home Button");
//        Thread.sleep(3000);
//        mlWalletLogout();
//        mobileGeneralMethod.tap(loginObject.objChangeNumber(), "Change Phone Number");
//        mlWalletLogin(prop.getproperty("SemiVerified_MaxTransactionReceiver"));
//        mobileGeneralMethod.verticalSwipeDown();
//        mobileGeneralMethod.verticalSwipe();
//        mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(),  "Recent Transactions");
//        mobileGeneralMethod.tap(historyObject.objReceiveMoneyTab(), "Tab");
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTransactionDetails(), "Page")) {
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReferenceNumberInTransactionDetails(),  "Reference Number");
//            String sReferenceNumberReceiver = mobileGeneralMethod.getText(kwartaPadalaObjects.objReferenceNumberInTransactionDetails());
//            mobileGeneralMethod.assertionValidation(sReferenceNumberReceiver, sReferenceNumberReceiver);
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiverName(),  "Receiver Name");
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiverMobileNo(),  "Receiver's Mobile Number");
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPaymentMethod(),  "Payment Method");
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSenderName(),  "Sender Name");
//            mobileGeneralMethod.isVisible(historyObject.objAmountReceived(),  "Total Amount");
//            String sReceivedAmount = mobileGeneralMethod.getText(historyObject.objAmountReceived());
//            String sActualReceivedAmount = sReceivedAmount.substring(4);
//            mobileGeneralMethod.assertionValidation(sActualReceivedAmount, "50,000.00");
//            LoggingUtils.info("STW_TC_36, Send Money To ML Wallet Maximum Transaction Receiving Limit for Semi-Verified Tier User Validated");
//            ExtentReporter.logPass("STW_TC_36", "STW_TC_36, Send Money To ML Wallet Maximum Transaction Receiving Limit for Semi-Verified Tier User Validated");
//            System.out.println("-----------------------------------------------------------");
//        }
//        else{
//            ExtentReporter.logFail("STW_TC_36", "STW_TC_36(), Failed To Validate Send Money To ML Wallet Maximum Transaction Receiving Limit for Semi-Verified Tier User");
//            System.out.println("-----------------------------------------------------------");
//
//        }
//    }
//public void sendMoneyToMLWalletMaxTransactionReceivingLimitBranchVerifiedTier_STW_TC_38(String sAmount) throws Exception {
//    login.loginWalletBranchVerified_MaxTransactionSender();
//    mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//    mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//    mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
//    mobileGeneralMethod.waitSleep(3000);
//    mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
//    mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
//    mobileGeneralMethod.waitSleep(3000);
//    enterAmountAndSendToMLWallet(sAmount);
//    mobileGeneralMethod.waitSleep(10000);
//    mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
//    mobileGeneralMethod.waitSleep(20000);
//    mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWallet(), "Send Money MLWallet Message");
//    mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWalletPHP(), "Amount");
//    mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWalletDate(), "Date");
//    mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMLWalletReferenceNumber(), "Reference Number");
//    mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMLWalletReferenceNumber(), "Reference Number");
//    String sReferenceNumber = mobileGeneralMethod.getText(kwartaPadalaObjects.objMLWalletReferenceNumber());
//    System.out.println(sReferenceNumber);
//    mobileGeneralMethod.verticalSwipe();
//    mobileGeneralMethod.tap(kwartaPadalaObjects.objBackToHomeBtn(), "Back To Home Button");
//    Thread.sleep(3000);
//    mlWalletLogout();
//    mobileGeneralMethod.tap(homePageObject.objChangeNumber(), "Change Phone Number");
//    mlWalletLogin(prop.getproperty("SemiVerified_MaxTransactionReceiver"));
//    mobileGeneralMethod.verticalSwipeDown();
//    mobileGeneralMethod.verticalSwipe();
//    mobileGeneralMethod.waitSleep(3000);
//    mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(), "Recent Transactions");
//    mobileGeneralMethod.tap(historyObject.objReceiveMoneyTab(), "Tab");
//    if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTransactionDetails(), "Page")) {
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReferenceNumberInTransactionDetails(), "Reference Number");
//        String sReferenceNumberReceiver = mobileGeneralMethod.getText(kwartaPadalaObjects.objReferenceNumberInTransactionDetails());
//        mobileGeneralMethod.assertionValidation(sReferenceNumberReceiver, sReferenceNumber);
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiverName(), "Receiver Name");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiverMobileNo(), "Receiver's Mobile Number");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPaymentMethod(), "Payment Method");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSenderName(), "Sender Name");
//        mobileGeneralMethod.isVisible(historyObject.objAmountReceived(), "Total Amount");
//        String sReceivedAmount = mobileGeneralMethod.getText(historyObject.objAmountReceived());
//        String sActualReceivedAmount = sReceivedAmount.substring(4);
//        mobileGeneralMethod.assertionValidation(sActualReceivedAmount, "50,000.00");
//        LoggingUtils.info("STW_TC_38, Send Money To ML Wallet Maximum Transaction Receiving Limit for Branch-Verified Tier User Validated");
//        ExtentReporter.logPass("STW_TC_38", "STW_TC_38, Send Money To ML Wallet Maximum Transaction Receiving Limit for Branch-Verified Tier User Validated");
//        System.out.println("-----------------------------------------------------------");
//    } else {
//        ExtentReporter.logFail("STW_TC_38", "STW_TC_38(), Failed To Validate Send Money To ML Wallet Maximum Transaction Receiving Limit for Branch-Verified Tier User");
//        System.out.println("-----------------------------------------------------------");
//
//    }
//}
//public void sendMoneyToMLWalletMaxTransactionReceivingLimitFullyVerifiedTier_STW_TC_40(String sAmount) throws Exception {
//    login.loginWalletFullyTier();
//    mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//    mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//    mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
//    mobileGeneralMethod.waitSleep(3000);
//    mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
//    mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
//    mobileGeneralMethod.waitSleep(3000);
//    enterAmountAndSendToMLWallet(sAmount);
//    mobileGeneralMethod.waitSleep(10000);
//    mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
//    mobileGeneralMethod.waitSleep(20000);
//    mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWallet(), "Send Money MLWallet Message");
//    mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWalletPHP(), "Amount");
//    mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWalletDate(), "Date");
//    mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMLWalletReferenceNumber(), "Reference Number");
//    mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMLWalletReferenceNumber(), "Reference Number");
//    String sReferenceNumber = mobileGeneralMethod.getText(kwartaPadalaObjects.objMLWalletReferenceNumber());
//    System.out.println(sReferenceNumber);
//    mobileGeneralMethod.verticalSwipe();
//    mobileGeneralMethod.tap(kwartaPadalaObjects.objBackToHomeBtn(), "Back To Home Button");
//    Thread.sleep(3000);
//    mlWalletLogout();
//    mobileGeneralMethod.tap(homePageObject.objChangeNumber(), "Change Phone Number");
//    mlWalletLogin(prop.getproperty("SemiVerified_MaxTransactionReceiver"));
//    mobileGeneralMethod.verticalSwipeDown();
//    mobileGeneralMethod.verticalSwipe();
//    mobileGeneralMethod.waitSleep(3000);
//    mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(), "Recent Transactions");
//    mobileGeneralMethod.tap(historyObject.objReceiveMoneyTab(), "Tab");
//    if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTransactionDetails(), "Page")) {
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReferenceNumberInTransactionDetails(), "Reference Number");
//        String sReferenceNumberReceiver = mobileGeneralMethod.getText(kwartaPadalaObjects.objReferenceNumberInTransactionDetails());
//        mobileGeneralMethod.assertionValidation(sReferenceNumberReceiver, sReferenceNumber);
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiverName(), "Receiver Name");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiverMobileNo(), "Receiver's Mobile Number");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPaymentMethod(), "Payment Method");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSenderName(), "Sender Name");
//        mobileGeneralMethod.isVisible(historyObject.objAmountReceived(), "Total Amount");
//        String sReceivedAmount = mobileGeneralMethod.getText(historyObject.objAmountReceived());
//        String sActualReceivedAmount = sReceivedAmount.substring(4);
//        mobileGeneralMethod.assertionValidation(sActualReceivedAmount, "50,000.00");
//        LoggingUtils.info("STW_TC_40, Send Money To ML Wallet Maximum Transaction Receiving Limit for Fully-Verified Tier User Validated");
//        ExtentReporter.logPass("STW_TC_40", "STW_TC_40, Send Money To ML Wallet Maximum Transaction Receiving Limit for Fully-Verified Tier User Validated");
//        System.out.println("-----------------------------------------------------------");
//    } else {
//        ExtentReporter.logFail("STW_TC_40", "STW_TC_40(), Failed To Validate Send Money To ML Wallet Maximum Transaction Receiving Limit for Fully-Verified Tier User");
//        System.out.println("-----------------------------------------------------------");
//
//    }
//}
//    public void sendMoneyToMLWalletLocationPopupValidation_STW_TC_42() throws Exception {
//        login.loginWalletFullyTier();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
//        mobileGeneralMethod.waitSleep(3000);
//        enterAmountAndSendToMLWallet("10");
//        mobileGeneralMethod.waitSleep(10000);
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPopupMsg(), "Popup Msg")) {
//            locationPopUpValidation();
//            LoggingUtils.info("STW_TC_42, Send Money To ML Wallet Location popup Validated");
//            ExtentReporter.logPass("STW_TC_42", "STW_TC_42, Send Money To ML Wallet Location popup Validated");
//            System.out.println("-----------------------------------------------------------");
//        } else {
//            ExtentReporter.logFail("STW_TC_42", "STW_TC_42(), Failed To Validate  Send Money To ML Wallet Location popup");
//            System.out.println("-----------------------------------------------------------");
//
//        }
//
//    }
//    public void sendMoneyToMLWalletLocationDenyFunctionality_STW_TC_43() throws Exception {
//        login.loginWalletFullyTier();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
//        mobileGeneralMethod.waitSleep(3000);
//        enterAmountAndSendToMLWallet("10");
//        mobileGeneralMethod.waitSleep(10000);
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPopupMsg(), "Popup Msg")) {
//            permissionDenyPopUp();
//            LoggingUtils.info("STW_TC_43, Send Money To ML Wallet Location Deny Functionality Validated");
//            ExtentReporter.logPass("STW_TC_43", "STW_TC_43, Send Money To ML Wallet Location Deny Functionality Validated");
//            System.out.println("-----------------------------------------------------------");
//        } else {
//            ExtentReporter.logFail("STW_TC_43", "STW_TC_43(), Failed To Validate Send Money To ML Wallet Location Deny Functionality");
//            System.out.println("-----------------------------------------------------------");
//
//        }
//
//    }
//    public void sendMoneyToMLWalletLocationPermissionDenyCloseBtnFunctionality_STW_TC_44() throws Exception {
//        login.loginWalletFullyTier();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
//        mobileGeneralMethod.waitSleep(3000);
//        enterAmountAndSendToMLWallet();
//        mobileGeneralMethod.waitSleep(10000);
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPopupMsg(), "Popup Msg")) {
//            permissionDenyCloseBtnFunctionality();
//            if(mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMLWalletBalance(), "Page")){
//                LoggingUtils.info("STW_TC_44, Send Money To ML Wallet Location Permission Deny Close Button Functionality Validated");
//                ExtentReporter.logPass("STW_TC_44", "STW_TC_44, Send Money To ML Wallet Location Permission Deny Close Button Functionality Validated");
//                System.out.println("-----------------------------------------------------------");
//            } else {
//                ExtentReporter.logFail("STW_TC_44", "STW_TC_44(), Failed To Validate Send Money To ML Wallet Location Permission Deny Close Button Functionality");
//                System.out.println("-----------------------------------------------------------");
//
//            }
//
//        }
//
//    }
//    public void sendMoneyToMLWalletLocationPermissionDenyOpenSettingsBtnFunctionality_STW_TC_45() throws Exception {
//        login.loginWalletFullyTier();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
//        mobileGeneralMethod.waitSleep(3000);
//        enterAmountAndSendToMLWallet();
//        mobileGeneralMethod.waitSleep(10000);
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPopupMsg(), "Popup Msg")) {
//            permissionDenyOpenSettingsBtnFunctionality();
//            if(mobileGeneralMethod.isVisible(kwartaPadalaObjects.objAppInfo(), "Page")){
//                LoggingUtils.info("STW_TC_45, Send Money To ML Wallet Location Permission Deny Open Settings Button Functionality Validated");
//                ExtentReporter.logPass("STW_TC_45", "STW_TC_45, Send Money To ML Wallet Location Permission Deny Open Settings Button Functionality Validated");
//                System.out.println("-----------------------------------------------------------");
//            } else {
//                ExtentReporter.logFail("STW_TC_45", "STW_TC_45(), Failed To Validate Send Money To ML Wallet Location Permission Deny Open Settings Button Functionality");
//                System.out.println("-----------------------------------------------------------");
//
//            }
//
//        }
//    }
//    public void sendMoneyToMLWalletLocationPopUpAllowFunctionality_STW_TC_46() throws Exception {
//        login.loginWalletFullyTier();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
//        mobileGeneralMethod.waitSleep(3000);
//        enterAmountAndSendToMLWallet();
//        mobileGeneralMethod.waitSleep(10000);
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPopupMsg(), "Popup Msg")) {
//            locationPopUpAllowFunctionality();
//            if(mobileGeneralMethod.isDisplayed(loginObject.objOneTimePin())){
//                mobileGeneralMethod.isVisible(loginObject.objOneTimePin(), "Page");
//            }else if(mobileGeneralMethod.isDisplayed(loginObject.objMLPin())){
//                mobileGeneralMethod.isVisible(loginObject.objMLPin(), "Page");
//            }
//            LoggingUtils.info("STW_TC_46, Send Money To ML Wallet Location popup Allow Button Functionality Validated");
//            ExtentReporter.logPass("STW_TC_46", "STW_TC_46, Send Money To ML Wallet Location popup Allow Button Functionality Validated");
//            System.out.println("-----------------------------------------------------------");
//        } else {
//            ExtentReporter.logFail("STW_TC_46", "STW_TC_46(), Failed To Validate Send Money To ML Wallet Location popup Allow Button Functionality Validated");
//            System.out.println("-----------------------------------------------------------");
//
//        }
//
//    }
    public void sendMoneyToMLWalletInternetInterruptionWhileEnteringOTP_STW_TC_47() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        enterAmountAndSendToMLWallet();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.setWifiConnectionToONOFF("OFF");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        if (mobileGeneralMethod.isVisible(homePageObject.objInternetConnectionPopUp(), "Popup Msg")) {
            internetConnectionError();
            LoggingUtils.info("STW_TC_47, Send Money To ML Wallet Internet Interruption While Entering OTP Validated");
            ExtentReporter.logPass("STW_TC_47", "STW_TC_47, Send Money To ML Wallet Internet Interruption While Entering OTP Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_47", "STW_TC_47(), Failed To Validate Send Money To ML Wallet Internet Interruption While Entering OTP");
            System.out.println("-----------------------------------------------------------");

        }

    }
    public void sendMoneyToMLWalletTransactionValidationAfterMinimizingApp_STW_TC_50() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        enterAmountAndSendToMLWallet();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        AppiumDriverManager.getAndroidDriver().runAppInBackground(Duration.ofSeconds(5));
//        DriverManager.getAppiumDriver().runAppInBackground(Duration.ofSeconds(5));
        LoggingUtils.info("Application relaunched after 5 Seconds");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWallet(), "Popup Msg")) {
            LoggingUtils.info("STW_TC_50, Send Money To ML Wallet Transaction Validation After Minimizing App Validated");
            ExtentReporter.logPass("STW_TC_50", "STW_TC_50, Send Money To ML Wallet Transaction Validation After Minimizing App Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_50", "STW_TC_50(), Failed To Validate Send Money To ML Wallet Transaction Validation After Minimizing App");
            System.out.println("-----------------------------------------------------------");

        }

    }
//    public void sendMoneyToMLWalletTransactionWithValidMLPin_STW_TC_56() throws Exception {
//        login.loginWalletFullyTier();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
//        mobileGeneralMethod.waitSleep(3000);
//        enterAmountAndSendToMLWallet();
//        mobileGeneralMethod.waitSleep(10000);
//        enableLocation_PopUp();
//        handleMpin("1111");
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWallet(), "Message")) {
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWalletPHP(), "Amount");
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWalletDate(), "Date");
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMLWalletReferenceNumber(), "Reference Number");
//            String sReferenceNumber = mobileGeneralMethod.getText(kwartaPadalaObjects.objMLWalletReferenceNumber());
//            System.out.println(sReferenceNumber);
//            Thread.sleep(3000);
//            mobileGeneralMethod.verticalSwipeDown();
//            mobileGeneralMethod.verticalSwipe();
//            mobileGeneralMethod.waitSleep(3000);
//            mobileGeneralMethod.tap(kwartaPadalaObjects.objBackToHomeBtn(), "Button");
//            Thread.sleep(3000);
//            mobileGeneralMethod.verticalSwipeDown();
//            mobileGeneralMethod.verticalSwipe();
//            mobileGeneralMethod.waitSleep(3000);
//            mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(), "Text");
//            mobileGeneralMethod.isVisible(homePageObject.objWalletToWallet(), "Text");
//            mobileGeneralMethod.tap(homePageObject.objWalletToWallet(), "Text");
//            if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReferenceNumberInTransactionDetails(), "Page")) {
//                LoggingUtils.info("STW_TC_56, Send Money to any ML Wallet Transaction With Valid ML Pin validated");
//                ExtentReporter.logPass("STW_TC_56", "STW_TC_56, Send Money to any ML Wallet Transaction With Valid ML Pin validated");
//                System.out.println("-----------------------------------------------------------");
//            } else {
//                ExtentReporter.logFail("STW_TC_56", "STW_TC_56(), Failed To Validate Send Money to any ML Wallet Transaction With Valid ML Pin");
//                System.out.println("-----------------------------------------------------------");
//
//            }
//        }
//
//    }

//    public void sendMoneyToMLWalletTransactionWithInValidMLPin_STW_TC_57() throws Exception {
//        login.loginWalletFullyTier();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
//        mobileGeneralMethod.waitSleep(3000);
//        enterAmountAndSendToMLWallet();
//        enableLocation_PopUp();
//
//        handleMpin("1234");
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objInvalidPINMsg(), "Message")) {
//            String sActualErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objInvalidPINMsg());
//            String sExceptedErrorMsg = "You have entered an invalid PIN. Please try again.";
//            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
//            LoggingUtils.info("STW_TC_57, Send Money to any ML Wallet Transaction With Invalid ML Pin validated");
//            ExtentReporter.logPass("STW_TC_57", "STW_TC_57, Send Money to any ML Wallet Transaction With Invalid ML Pin validated");
//            System.out.println("-----------------------------------------------------------");
//        } else {
//            ExtentReporter.logFail("STW_TC_57", "STW_TC_57(), Failed To Validate Send Money to any ML Wallet Transaction With Invalid ML Pin");
//            System.out.println("-----------------------------------------------------------");
//
//        }
//
//    }

    public void sendMoneyToMLWalletInOTPPopupValidation_STW_TC_63() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        enterAmountAndSendToMLWallet();
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(), "Page")) {
            mobileGeneralMethod.isVisible(loginObject.objOTP(), "One Time Pin");
            LoggingUtils.info("STW_TC_63, Send Money To ML Wallet, InApp OTP popup validated");
            ExtentReporter.logPass("STW_TC_63", "STW_TC_63, Send Money To ML Wallet, InApp OTP popup validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_63", "STW_TC_63(), Failed To Validate Send Money To ML Wallet, InApp OTP popup");
            System.out.println("-----------------------------------------------------------");

        }

    }

    public void sendMoneyToMLWalletTransactionInAppOTPPopupUIValidation_STW_TC_64() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        enterAmountAndSendToMLWallet();
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(), "Page")) {
            mobileGeneralMethod.isVisible(loginObject.objOTP(), "One Time Pin");
            mobileGeneralMethod.isVisible(loginObject.objSeconds(), "Seconds");
            mobileGeneralMethod.isVisible(loginObject.objContinueBtn(), "Button");
            mobileGeneralMethod.isVisible(loginObject.objCancelBtn(), "Button");
            LoggingUtils.info("STW_TC_64, Send Money To ML Wallet Transaction InApp OTP popup UI validated");
            ExtentReporter.logPass("STW_TC_64", "STW_TC_64, Send Money To ML Wallet Transaction InApp OTP popup UI validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_64", "STW_TC_64(), Failed To Validate Send Money To ML Wallet Transaction InApp OTP popup UI");
            System.out.println("-----------------------------------------------------------");

        }

    }

        public void sendMoneyToMLWalletTransactionNewOTPAfterSixtySecondsValidation_STW_TC_65() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        enterAmountAndSendToMLWallet();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(), "Page");
        if (mobileGeneralMethod.isVisible(loginObject.objOTP(), "One Time Pin")) {
            String sGeneratedOTP = mobileGeneralMethod.getText(loginObject.objOTP());
            mobileGeneralMethod.waitSleep(1000);
            String sNewlyGeneratedOTPAfterSixtySeconds = mobileGeneralMethod.getText(loginObject.objOTP());
            mobileGeneralMethod.assertionValidation(sGeneratedOTP, sNewlyGeneratedOTPAfterSixtySeconds);
            LoggingUtils.info("STW_TC_65, Send Money To ML Wallet Transaction New OTP got generated After Sixty Seconds is validated");
            ExtentReporter.logPass("STW_TC_65", "STW_TC_65, Send Money To ML Wallet Transaction New OTP got generated After Sixty Seconds is validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_65", "STW_TC_65(), Failed To Validate Send Money To ML Wallet Transaction New OTP got generated After Sixty Seconds");
            System.out.println("-----------------------------------------------------------");

        }

    }
    public void sendMoneyToMLWalletTransactionOTPCancelBtnFunctionality_STW_TC_66() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        enterAmountAndSendToMLWallet();
        mobileGeneralMethod.waitSleep(1000);
        if ( mobileGeneralMethod.isVisible(loginObject.objOneTimePin(), "Page")) {
            mobileGeneralMethod.isVisible(loginObject.objCancelBtn(), "Button");
            LoggingUtils.info("STW_TC_66, Send Money To ML Wallet Transaction, After clicking on Cancel in One time pin popup App navigates back to Confirm details Page is validated");
            ExtentReporter.logPass("STW_TC_66", "STW_TC_66, Send Money To ML Wallet Transaction, After clicking on Cancel in One time pin popup App navigates back to Confirm details Page is validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_66", "STW_TC_66(), Failed To Validate Send Money To ML Wallet Transaction, After clicking on Cancel in One time pin popup App navigates back to Confirm details Page");
            System.out.println("-----------------------------------------------------------");

        }

    }
    public void sendMoneyToMLWalletOTPContinueBtnFunctionality_STW_TC_67() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        enterAmountAndSendToMLWallet();
        mobileGeneralMethod.waitSleep(1000);
        if ( mobileGeneralMethod.isVisible(loginObject.objOneTimePin(), "Page")) {
            mobileGeneralMethod.isVisible(loginObject.objContinueBtn(), "Button");
            LoggingUtils.info("STW_TC_67, Send Money To ML Wallet Transaction, After clicking on Continue in One time pin popup App navigates to Transaction Success Page is validated");
            ExtentReporter.logPass("STW_TC_67", "STW_TC_67, Send Money To ML Wallet Transaction, After clicking on Continue in One time pin popup App navigates to Transaction Success Page is validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STW_TC_67", "STW_TC_67(), Failed To Validate Send Money To ML Wallet Transaction, After clicking on Continue in One time pin popup App navigates to Transaction Success Page");
            System.out.println("-----------------------------------------------------------");

        }
    }
}
