package mlwallet.testSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;
import mlwallet.testSteps.Login;
import utilities.yamlReader.yamlReader;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class BuyELoad extends Base_Steps{
    Login login = new Login();
    public BuyELoad(){
        super();
    }

    //-----------------------------Happy Path-----------------------------------------------
    public void buyELoadSuccessfulTransaction_BE_TC_26() throws Exception {
        ExtentReporter.logInfo("BE_TC_26", "Buy ELoad Successful Transaction UI validated");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "10 Smart Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Continue Promo Pop Up");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(), "Buy Load Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objTransactionDetailsPage(), "Transaction Details Page")) {
           mobileGeneralMethod.isVisible(buyEloadObject.objMobileNumberInTransactionDetails(), "Mobile Number");
           mobileGeneralMethod.isVisible(buyEloadObject.objBuyELoadTime(), "Date and Time");
           mobileGeneralMethod.isVisible(buyEloadObject.objTypeOfPromoUsed(), "Promo");
           mobileGeneralMethod.isVisible(buyEloadObject.objAmountToSend(), "Amount to Send");
           mobileGeneralMethod.isVisible(buyEloadObject.objServiceFee(), "Service Fee");
           mobileGeneralMethod.isVisible(buyEloadObject.objTotalAmount(), "Total Amount");
            LoggingUtils.info("BE_TC_26(), Buy ELoad Successful Transaction UI validated");
            ExtentReporter.logPass("BE_TC_26", "Buy ELoad Successful Transaction UI validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_26", "Buy ELoad Failed Transaction UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------------------Postive Testing------------------------------------------
    public void eLoad_generic() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
    }
    //----------------Postive
    public void buyELoadTransactionDetails_BE_TC_01() throws Exception {
        ExtentReporter.logInfo("BE_TC_01","Transaction Details Validation after Buying eLoad");
        eLoad_generic();
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "10 Smart Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Continue Promo Pop Up");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(), "Buy Load Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objTransactionDetailsPage(),"Page")) {
           mobileGeneralMethod.isVisible(buyEloadObject.objMobileNumberInTransactionDetails(),"Mobile Number");
           mobileGeneralMethod.isVisible(buyEloadObject.objBuyELoadTime(), "Date and Time");
           mobileGeneralMethod.isVisible(buyEloadObject.objTypeOfPromoUsed(), "Promo");
           mobileGeneralMethod.isVisible(buyEloadObject.objAmountToSend(), "Amount to Send");
           mobileGeneralMethod.isVisible(buyEloadObject.objServiceFee(), "Service Fee");
           mobileGeneralMethod.isVisible(buyEloadObject.objTotalAmount(), "Total Amount");
            LoggingUtils.info("BE_TC_01, Transaction Details Validated after Buying eLoad");
            ExtentReporter.logPass("BE_TC_01", "Transaction Details Validated after Buying eLoad");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_01", "Buy ELoad Failed to Validate after Buying eLoad Transaction Details");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------------------Negative
    public void buyELoadInvalidMobileNumber_BE_TC_02() throws Exception {
        ExtentReporter.logInfo("BE_TC_02","Buying eLoad using invalid mobile number");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("InvalidNumber"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objErrorMsg(), "Pop Up Message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(buyEloadObject.objErrorMsg());
            String sExceptedErrorMsg = "Network and Mobile number does not match";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("BE_TC_02, Buy ELoad Using Invalid Mobile Number, Network and Mobile number does not match Error Message Validated");
            ExtentReporter.logPass("BE_TC_02", "Buy ELoad Using Invalid Mobile Number, Network and Mobile number does not match Error Message Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_02", "Buy ELoad Using Invalid Mobile Number Failed , Network and Mobile number does not match Error Message not Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------------------Negative
    public void buyELoadWithoutInputMobNumber_BE_TC_03() throws Exception {
        ExtentReporter.logInfo("BE_TC_03","Buying eLoad without mobile number input");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objErrorMsg(), "Pop Up Message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(buyEloadObject.objErrorMsg());
            String sExceptedErrorMsg = "Mobile number is required.";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("BE_TC_03, Buy ELoad without mobile number input, Mobile number is required Error Message is validated");
            ExtentReporter.logPass("BE_TC_03", "Buy ELoad without mobile number input, Mobile number is required Error Message is validated");
        }
        else{
            ExtentReporter.logFail("BE_TC_02", "Buy ELoad without mobile number input Failed, Mobile number is required Error Message is  not validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------------------Negative
    public void buyELoadWithCharacterMobileNo_BE_TC_04() throws Exception {
        ExtentReporter.logInfo("BE_TC_04","Buying eLoad without telecommunication selected");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("StringMobileNo"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objErrorMsg(), "Pop Up Message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(buyEloadObject.objErrorMsg());
            String sExceptedErrorMsg = "Mobile number is invalid";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("BE_TC_04, Buying eLoad without selecting telecommunication, Network and Mobile number does not match Error Msg Validated");
            ExtentReporter.logPass("BE_TC_04", "Buying eLoad with Character Mobile No, Mobile number is invalid Validated");
        }
        else{
            ExtentReporter.logFail("BE_TC_04", "Buy ELoad with Character Mobile No Failed, Mobile number is invalid is not validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------------------Negative Cant test
    public void buyELoadInsufficientBalance_BE_TC_05() throws Exception {
        ExtentReporter.logInfo("BE_TC_05","Buying eLoad with insufficient balance");
        eLoad_generic();
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "10 Smart Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Continue Promo Pop Up");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objInsufficientBalPopup(), "Pop up")) {
            String sActualInsufficientBalMsg = mobileGeneralMethod.getText(buyEloadObject.objInsufficientBalPopup());
            String sExceptedMsg = "There is insufficient balance to proceed with this transaction. Please try again.";
            mobileGeneralMethod.assertionValidation(sActualInsufficientBalMsg, sExceptedMsg);
            mobileGeneralMethod.isVisible(buyEloadObject.objOkBtn(), "Button");
            LoggingUtils.info("BE_TC_05, Insufficient Balance Error Message Validated");
            ExtentReporter.logPass("BE_TC_05", "Passed Insufficient Balance Error Message Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_05", "Failed Insufficient Balance Error Message Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //------------------Negative Cant Test
    public void buyELoadMaxLimitPerTransaction_BE_TC_06() throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Maximum Limit per Transaction");
        eLoad_generic();
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "10 Smart Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Continue Promo Pop Up");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objMaxLimitPopupMsg(), "Error Popup Msg")) {
            String sActualPopupMsg = mobileGeneralMethod.getText(buyEloadObject.objMaxLimitPopupMsg());
            String sExceptedPopupMsg = "The maximum E-load per transaction set for your verification level is P2,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sActualPopupMsg, sExceptedPopupMsg);
            LoggingUtils.info("BE_TC_09, Buy ELoad Maximum Limit per Transaction Validated");
            ExtentReporter.logPass("BE_TC_09", "BE_TC_09, Buy ELoad Maximum Limit per Transaction Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_09", "Failed Insufficient Balance Error Message Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Positive
    public void buyELoadTransactionPageUIValidation_BE_TC_10() throws Exception {
        ExtentReporter.logInfo("BE_TC_10","Buy ELoad Transaction Page UI Validation");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad");
        mobileGeneralMethod.waitSleep(8000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "Eload transaction Page")) {
           mobileGeneralMethod.isVisible(buyEloadObject.objSelectTelco(),"Telco");
           mobileGeneralMethod.isVisible(buyEloadObject.objPhoneToLoad(),"Phone To Load Header");
           mobileGeneralMethod.isVisible(buyEloadObject.objMobileNoField(), "Mobile Number Input Field");
           mobileGeneralMethod.isVisible(buyEloadObject.objSelectFromContacts(), "Select From Contacts Button");
           mobileGeneralMethod.isVisible(buyEloadObject.objNextBtn(),"Next Button");
            LoggingUtils.info("BE_TC_10, Buy ELoad Transaction Page UI Validated");
            ExtentReporter.logPass("BE_TC_10", "Passsed Buy ELoad Transaction Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_10", "Failed Buy ELoad Transaction Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Positive
    public void buyELoadNextButtonFunctionalityOnELoadTransactionPage_BE_TC_11() throws Exception {
        ExtentReporter.logInfo("BE_TC_11","Buy ELoad Next Button Functionality On ELoad Transaction Page");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page")) {
            LoggingUtils.info("BE_TC_11, Buy ELoad Next Button Functionality On ELoad Transaction Page Validated");
            ExtentReporter.logPass("BE_TC_11", "Buy ELoad Next Button Functionality On ELoad Transaction Page Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_11", "Failed Buy ELoad Next Button Functionality On ELoad Transaction Page to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Negative
    public void buyELoadLoadSelectionPageBackBtnValidation_BE_TC_12() throws Exception {
        ExtentReporter.logInfo("BE_TC_12","Buy ELoad Load Selection Back Arrow Button Validation");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objLoadSelectionBackArrowBtn(), "Load Selection Back Arrow Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "Page")) {
            LoggingUtils.info("BE_TC_12, After clicking on Back Arrow Btn on Load Selection Page, Application Navigates to eLoad Transaction Page is Validated");
            ExtentReporter.logPass("BE_TC_12", "After clicking on Back Arrow Btn on Load Selection Page, Application Navigates to eLoad Transaction Page is Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_12", "Failed After clicking on Back Arrow Btn on Load Selection Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Positive
    public void buyELoadLoadSelectionPageUIValidation_BE_TC_13() throws Exception {
        ExtentReporter.logInfo("BE_TC_13","Buy ELoad Load Selection Page UI Validation");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Page")) {
           mobileGeneralMethod.isVisible(buyEloadObject.objMobileNumberInLoadSelection(), "Number");
           mobileGeneralMethod.isVisible(buyEloadObject.objChange(), "button");
           mobileGeneralMethod.isVisible(buyEloadObject.objWalletBalanceInLoadSeletion(), "Balance");
           mobileGeneralMethod.isVisible(buyEloadObject.objPromoLoadTab(), "Tab");
           mobileGeneralMethod.isVisible(buyEloadObject.objRegularLoadTab(), "Tab");
            LoggingUtils.info("BE_TC_13, Buy ELoad Load Selection Page UI Validated");
            ExtentReporter.logPass("BE_TC_13", "Buy ELoad Load Selection Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_13", "Failed Buy ELoad Load Selection Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Negative
    public void buyELoadLoadSelectionChangeBtnFunctionality_BE_TC_14() throws Exception {
        ExtentReporter.logInfo("BE_TC_14","Buy ELoad Load Selection Change Button Functionality Validation");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objChange(), "Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "Page")) {
            LoggingUtils.info("BE_TC_14, After clicking on Change Btn in Load Selection Page, Application navigates to eLoad Transaction page is Validated");
            ExtentReporter.logPass("BE_TC_14", "After clicking on Change Btn in Load Selection Page, Application navigates to eLoad Transaction page is Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_14", "Failed clicking on Change Btn in Load Selection Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Positive
    public void buyELoadTransactionDetailsPageUIValidation_BE_TC_15() throws Exception {
        ExtentReporter.logInfo("BE_TC_15","Buy ELoad Transaction Details Page UI Validation");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "10 Smart Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Continue Promo Pop Up");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page")) {
           mobileGeneralMethod.isVisible(buyEloadObject.objLoadWithAmount(),"Load With Amount");
           mobileGeneralMethod.isVisible(buyEloadObject.objTransactionDetailsPage(),"Header");
           mobileGeneralMethod.isVisible(buyEloadObject.objMobileNumber(),"Mobile Number");
           mobileGeneralMethod.isVisible(buyEloadObject.objTypeOfPromoUsed(),"Promo");
           mobileGeneralMethod.isVisible(buyEloadObject.objAmountToSend(), "Amount to Send");
           mobileGeneralMethod.isVisible(buyEloadObject.objServiceFee(),"Service Fee");
           mobileGeneralMethod.isVisible(buyEloadObject.objTotalAmount(), "Total Amount");
           mobileGeneralMethod.isVisible(buyEloadObject.objConfirmBtn(), "Button");
            LoggingUtils.info("BE_TC_15, Buy ELoad Transaction Details Page UI Validated");
            ExtentReporter.logPass("BE_TC_15", "Buy ELoad Transaction Details Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_15", "Failed Buy ELoad Transaction Details Page UI to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Positive
    public void buyELoadSelectFromContactsBtnFunctionality_BE_TC_16() throws Exception {
        ExtentReporter.logInfo("BE_TC_16","Buy ELoad Select From Contacts Functionality");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(),"Buy eLoad");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectFromContacts(),"Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objContacts(), "Page")) {
            LoggingUtils.info("BE_TC_16, Buy ELoad, After clicking on Select From Contacts Application Navigates to Contacts Page");
            ExtentReporter.logPass("BE_TC_16", "Buy ELoad, After clicking on Select From Contacts Application Navigates to Contacts Page");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_16", "Failed After clicking on Select From Contacts Application Navigates to Contacts Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Positive
    public void buyELoadContactsPageUIValidation_BE_TC_17() throws Exception {
        ExtentReporter.logInfo("BE_TC_17","Buy ELoad Contacts Page UI Validation");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(),"Buy eLoad");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectFromContacts(),"Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objContacts(), "Page")) {
            mobileGeneralMethod.isVisible(buyEloadObject.objContactsBtn(), "Page");
            mobileGeneralMethod.isVisible(buyEloadObject.objSearch(), "Page");
            mobileGeneralMethod.isVisible(buyEloadObject.objFavorites(), "Page");
            LoggingUtils.info("BE_TC_17, Buy ELoad Contacts Page UI Validated");
            ExtentReporter.logPass("BE_TC_17", "Buy ELoad Contacts Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_17", "Failed Buy ELoad Contacts Page UI to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Negative
    public void buyELoadContactsPageBackBtnValidation_BE_TC_18() throws Exception {
        ExtentReporter.logInfo("BE_TC_18","Buy ELoad Contacts Page Back Arrow Button Validation");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(),"Buy eLoad");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectFromContacts(),"Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(buyEloadObject.objContacts(), "Page");
        mobileGeneralMethod.tap(buyEloadObject.objContactsPageBackBtn(), "Contacts Page back arrow Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "Page")) {
            LoggingUtils.info("BE_TC_18, Buy ELoad Contacts Page Back Arrow Button Validated");
            ExtentReporter.logPass("BE_TC_18", "Buy ELoad Contacts Page Back Arrow Button Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_18", "Failed Buy ELoad Contacts Page Back Arrow Button Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Positive
    public void buyELoadSearchFieldValidation_BE_TC_19() throws Exception {
        ExtentReporter.logInfo("BE_TC_19","Buy ELoad Search Field Validation");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(),"Buy eLoad");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectFromContacts(),"Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(buyEloadObject.objContacts(), "Page");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objSearch(), "Contact Search")) {
            mobileGeneralMethod.type(buyEloadObject.objSearch(), "Contact Search", propertyReader.getproperty("NameDataTest"));
            mobileGeneralMethod.waitSleep(1000);
            mobileGeneralMethod.isVisible(buyEloadObject.objSearchedContactName(),"Contact name");
            mobileGeneralMethod.isVisible(buyEloadObject.objSearchedContactNumber(),"Contact Number");
            LoggingUtils.info("BE_TC_19, Buy ELoad Search Field Validated");
            ExtentReporter.logPass("BE_TC_19", "Buy ELoad Search Field Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_19", "Failed Buy ELoad Search Field to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Positive
    public void buyELoadAddContactToFavorites_BE_TC_20() throws Exception {
        ExtentReporter.logInfo("BE_TC_20","Buy ELoad Add Contact To Favorites");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectFromContacts(),"Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(buyEloadObject.objContacts(),"Page");
        mobileGeneralMethod.type(buyEloadObject.objSearch(), "Contact Search", propertyReader.getproperty("NameFavDataTest"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.isVisible(buyEloadObject.objSearchedContactName(),"Contact name");
        String sContactName = mobileGeneralMethod.getText(buyEloadObject.objSearchedContactName());
        mobileGeneralMethod.isVisible(buyEloadObject.objSearchedContactNumber(),"Contact Number");
        String sContactNumber = mobileGeneralMethod.getText(buyEloadObject.objSearchedContactNumber());
        mobileGeneralMethod.tap(buyEloadObject.objAddToFavoriteIcon(), "Add To Favorite Icon");
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.tap(buyEloadObject.objContactsPageBackBtn(), "Back Icon");
        mobileGeneralMethod.tap(buyEloadObject.objSelectFromContacts(),"Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objFavorites(),"Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objSearchedContactName(), "Contact name")) {
            String sContactNameInFavorites = mobileGeneralMethod.getText(buyEloadObject.objSearchedContactName());
            mobileGeneralMethod.assertionValidation(sContactName.toUpperCase(), sContactNameInFavorites);
            String sContactNumberInFavorites = mobileGeneralMethod.getText(buyEloadObject.objSearchedContactNumber());
            mobileGeneralMethod.assertionValidation(sContactNumber, sContactNumberInFavorites);
            LoggingUtils.info("BE_TC_20, Buy ELoad Add Contact To Favorites Validated");
            ExtentReporter.logPass("BE_TC_20", "Buy ELoad Add Contact To Favorites Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_20", "Failed Buy ELoad Add Contact To Favorites to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Positive dependent TC 20
    public void buyELoadSearchUnFavoriteContact_BE_TC_23() throws Exception {
        ExtentReporter.logInfo("BE_TC_23","Buy ELoad Search UnFavorite Contact");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectFromContacts(),"Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(buyEloadObject.objContacts(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objFavorites(),"Button");
        mobileGeneralMethod.waitSleep(2000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objSearch(), "Contact Search")) {
            mobileGeneralMethod.type(buyEloadObject.objSearch(),"Contact Search", propertyReader.getproperty("NameFavDataTest"));
            mobileGeneralMethod.tap(buyEloadObject.objAddToFavoriteIcon(), "UnFavorite Icon");
            mobileGeneralMethod.waitSleep(2000);
            mobileGeneralMethod.tap(buyEloadObject.objContactsPageBackBtn(), "Back Icon");
            mobileGeneralMethod.tap(buyEloadObject.objSelectFromContacts(),"Button");
            mobileGeneralMethod.waitSleep(2000);
            mobileGeneralMethod.tap(buyEloadObject.objFavorites(),"Button");
            mobileGeneralMethod.isVisible(buyEloadObject.objNoFavoritesFoundMsg(),"Message");
            LoggingUtils.info("BE_TC_23, Buy ELoad Search UnFavorite Contact Validated");
            ExtentReporter.logPass("BE_TC_23", "Buy ELoad Search UnFavorite Contact Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_23", "Failed ELoad Search UnFavorite Contact to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Positive
    public void buyELoadPromoConfirmationPopupValidation_BE_TC_24() throws Exception {
        ExtentReporter.logInfo("BE_TC_24","Buy ELoad Promo Confirmation Popup Validation");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "10 Smart Promo");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Popup Msg")) {
           mobileGeneralMethod.waitSleep(3000);
           mobileGeneralMethod.isVisible(buyEloadObject.objConfirmBtn(),"Button");
           mobileGeneralMethod.isVisible(buyEloadObject.objCancelBtn(),"Button");
            LoggingUtils.info("BE_TC_24, Buy ELoad Promo Confirmation Popup Validated");
            ExtentReporter.logPass("BE_TC_24", "Buy ELoad Promo Confirmation Popup Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_24", "Failed Buy ELoad Promo Confirmation Popup to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Positive
    public void buyELoadInAppOTPPageUIValidation_BE_TC_25() throws Exception {
        ExtentReporter.logInfo("BE_TC_25","Buy ELoad OTP page UI Validation");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "10 Smart Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Continue Promo Pop Up");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(), "Buy Load Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(8000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page")) {
            mobileGeneralMethod.isVisible(loginObject.objOTP(),"One Time Pin");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.continue2_btn(),"Continue Button");
            mobileGeneralMethod.isVisible(loginObject.objCancelBtn(),"Cancel Button");
            LoggingUtils.info("BE_TC_25, Buy ELoad One Time Pin page UI Validated");
            ExtentReporter.logPass("BE_TC_25", "Buy ELoad One Time Pin page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_25", "Failed Buy ELoad One Time Pin page UI to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Positive
    public void buyELoadRecentTransactionUIValidation_BE_TC_27() throws Exception {
        ExtentReporter.logInfo("BE_TC_27","Buy ELoad Recent Transaction UI Validation");
        buyELoadSuccessfulTransaction_BE_TC_26();
        if (mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(),"Header")) {
            mobileGeneralMethod.isVisible(homePageObject.objBuyELoadTransaction(),"Transaction");
            mobileGeneralMethod.isVisible(homePageObject.objPosted(),"Status");
            LoggingUtils.info("BE_TC_27, Buy ELoad Recent Transaction UI validated");
            ExtentReporter.logPass("BE_TC_27", "Buy ELoad Recent Transaction UI validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_27", "Failed Buy ELoad Recent Transaction UI to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Positive
    public void buyELoadTransactionDetailsUIValidation_BE_TC_28() throws Exception {
        ExtentReporter.logInfo("BE_TC_28","Buy ELoad Transaction Details UI Validation");
        buyELoadRecentTransactionUIValidation_BE_TC_27();
        mobileGeneralMethod.tap(homePageObject.objBuyELoadTransaction(),"Transaction");
        mobileGeneralMethod.waitSleep(2000);
        if (mobileGeneralMethod.isVisible(historyObject.objTransactionDetails(),"Page")) {
            mobileGeneralMethod.isVisible(historyObject.objReferenceNumberInTransactionDetails(),"Reference Number");
            mobileGeneralMethod.isVisible(historyObject.objDate(),"Date");
            mobileGeneralMethod.isVisible(historyObject.objReceiverMobileNo(),"Receiver's Mobile Number");
            mobileGeneralMethod.isVisible(historyObject.objLoadType(),"Load Type");
            mobileGeneralMethod.isVisible(historyObject.objPaymentMethod(),"Payment Method");
            mobileGeneralMethod.isVisible(historyObject.objAmount(),"Amount");
            mobileGeneralMethod.isVisible(historyObject.objServiceFee(),"Service Fee");
            mobileGeneralMethod.isVisible(historyObject.objTotalAmount(),"Total Amount");
            LoggingUtils.info("BE_TC_28, Buy ELoad Transaction Details UI validated");
            ExtentReporter.logPass("BE_TC_28", "Buy ELoad Transaction Details UI validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_28", "Failed  Buy ELoad Transaction Details UI to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Positive
    public void buyELoadNewTransactionBtnFunctionality_BE_TC_66() throws Exception {
        ExtentReporter.logInfo("BE_TC_66","Buy ELoad New Transaction Button Functionality");
        buyELoadSuccessfulTransaction_BE_TC_26();
        mobileGeneralMethod.tap(buyEloadObject.objNewTransaction(),"Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(),"Page")) {
            LoggingUtils.info("BE_TC_66, Buy ELoad New Transaction Button Functionality Validated");
            ExtentReporter.logPass("BE_TC_66", "Buy ELoad New Transaction Button Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_66", "Failed  Buy ELoad Transaction Details UI to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void handleMpin(String mPin) throws Exception {
        for (int i = 0; i < mPin.length(); i++) {
            char ch = mPin.charAt(i);
            String ch1 = String.valueOf(ch);
            mobileGeneralMethod.tap(mlWalletPageObjects.objEnterMpinVal(ch1), "MPIN");
        }
        LoggingUtils.info("Entered MLPin " + mPin + " Successfully");
        ExtentReporter.logPass("Enter MLPin", "Entered MLPin " + mPin + " Successfully");
    }
    //-----------------Positive Cant Test
    public void buyELoadTransactionWithValidMLPin_BE_TC_78() throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Transaction With Valid MLPin");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "10 Smart Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Continue Promo Pop Up");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(), "Buy Load Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(8000);
        handleMpin("1111");
        mobileGeneralMethod.waitSleep(8000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objTransactionDetailsPage(),"Page")) {
            mobileGeneralMethod.isVisible(buyEloadObject.objMobileNumberInTransactionDetails(),"Mobile Number");
            mobileGeneralMethod.isVisible(buyEloadObject.objBuyELoadTime(),"Date and Time");
            mobileGeneralMethod.isVisible(buyEloadObject.objTypeOfPromoUsed(),"Promo");
            mobileGeneralMethod.isVisible(buyEloadObject.objAmountToSend(),"Amount to Send");
            mobileGeneralMethod.isVisible(buyEloadObject.objServiceFee(),"Service Fee");
            mobileGeneralMethod.isVisible(buyEloadObject.objTotalAmount(),"Total Amount");
            LoggingUtils.info("BE_TC_78, Buy ELoad Transaction With Valid MLPin is Validated");
            ExtentReporter.logPass("BE_TC_78", "Buy ELoad Transaction With Valid MLPin is Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_78", "Failed Buy ELoad Transaction With Valid MLPin to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Negative Cant Test
    public void buyELoadTransactionWithInValidMLPin_BE_TC_79() throws Exception {
        ExtentReporter.logInfo("BE_TC_79","Buy ELoad Transaction With InValid MLPin");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "10 Smart Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Continue Promo Pop Up");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(), "Buy Load Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(8000);
        handleMpin("1234");
        mobileGeneralMethod.waitSleep(8000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objInvalidPINMsg(),"Message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(buyEloadObject.objInvalidPINMsg());
            String sExceptedErrorMsg = "You have entered an invalid PIN. Please try again.";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("BE_TC_79, Buy ELoad Transaction With Invalid ML Pin validated");
            ExtentReporter.logPass("BE_TC_79", "Buy ELoad Transaction With Invalid ML Pin validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_79", "Failed Buy ELoad Transaction With Invalid ML Pin to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Positive
    public void buyELoadTransactionNewOTPAfterSixtySecondsValidation_BE_TC_091() throws Exception {
        ExtentReporter.logInfo("BE_TC_091","Buy ELoad New OTP got generated After Sixty Seconds validation");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "10 Smart Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Continue Promo Pop Up");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(), "Buy Load Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(8000);
        if (mobileGeneralMethod.isVisible(loginObject.objOTP(),"One Time Pin")) {
            String sGeneratedOTP = mobileGeneralMethod.getText(loginObject.objOTP());
            mobileGeneralMethod.waitSleep(70000);
            int otpfirstAsInteger = Integer.parseInt(sGeneratedOTP);
            mobileGeneralMethod.isVisible(loginObject.objOTP(),"New One Time Pin");
            String sNewlyGeneratedOTPAfterSixtySeconds = mobileGeneralMethod.getText(loginObject.objOTP());
            int otpSecondAsInteger = Integer.parseInt(sNewlyGeneratedOTPAfterSixtySeconds);
            mobileGeneralMethod.assertionNotEqualValidation(otpfirstAsInteger, otpSecondAsInteger);
            LoggingUtils.info("BE_TC_091, Buy ELoad Transaction New OTP got generated After Sixty Seconds is validated");
            ExtentReporter.logPass("BE_TC_091", "Buy ELoad Transaction New OTP got generated After Sixty Seconds is validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_091", "Failed Buy ELoad Transaction New OTP got generated After Sixty Seconds to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Negative
    public void buyELoadTransactionOTPCancelBtnFunctionality_BE_TC_092() throws Exception {
        ExtentReporter.logInfo("BE_TC_092","Buy ELoad Transaction OTP Cancel Button Functionality");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "10 Smart Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Continue Promo Pop Up");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(), "Buy Load Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(loginObject.objCancelBtn(),"Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page")) {
            LoggingUtils.info("BE_TC_092, Buy ELoad Transaction, After clicking on Cancel in One time pin popup App navigates back to Buy ELoad Page is validated");
            ExtentReporter.logPass("BE_TC_092", "Buy ELoad Transaction, After clicking on Cancel in One time pin popup App navigates back to Buy ELoad Page is validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_091", "Failed After clicking on Cancel in One time pin popup App navigates back to Buy ELoad Page to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Positive
    public void buyELoadTransactionForBranchVerifiedTier_BE_TC_42() throws Exception {
        ExtentReporter.logInfo("BE_TC_42","Buy ELoad maximum transaction for Branch verified Tier");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "10 Smart Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Continue Promo Pop Up");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(), "Buy Load Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objTransactionDetailsPage(), "Transaction Details Page")) {
            mobileGeneralMethod.isVisible(buyEloadObject.objMobileNumberInTransactionDetails(), "Mobile Number");
            mobileGeneralMethod.isVisible(buyEloadObject.objBuyELoadTime(), "Date and Time");
            mobileGeneralMethod.isVisible(buyEloadObject.objTypeOfPromoUsed(), "Promo");
            mobileGeneralMethod.isVisible(buyEloadObject.objAmountToSend(), "Amount to Send");
            mobileGeneralMethod.isVisible(buyEloadObject.objServiceFee(), "Service Fee");
            mobileGeneralMethod.isVisible(buyEloadObject.objTotalAmount(), "Total Amount");
            LoggingUtils.info("BE_TC_42, Buy ELoad maximum transaction for Branch verified Tier validated");
            ExtentReporter.logPass("BE_TC_42", "Buy ELoad maximum transaction for Branch verified Tier validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_42", "Failed Buy ELoad maximum transaction for Branch verified Tier to validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Positive
    public void buyELoadTransactionForSemiVerifiedTier_BE_TC_30() throws Exception {
        ExtentReporter.logInfo("BE_TC_30","Buy ELoad maximum transaction for Semi verified Tier");
        login.loginWalletSemiTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "10 Smart Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Continue Promo Pop Up");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(), "Buy Load Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objTransactionDetailsPage(), "Transaction Details Page")) {
            mobileGeneralMethod.isVisible(buyEloadObject.objMobileNumberInTransactionDetails(), "Mobile Number");
            mobileGeneralMethod.isVisible(buyEloadObject.objBuyELoadTime(), "Date and Time");
            mobileGeneralMethod.isVisible(buyEloadObject.objTypeOfPromoUsed(), "Promo");
            mobileGeneralMethod.isVisible(buyEloadObject.objAmountToSend(), "Amount to Send");
            mobileGeneralMethod.isVisible(buyEloadObject.objServiceFee(), "Service Fee");
            mobileGeneralMethod.isVisible(buyEloadObject.objTotalAmount(), "Total Amount");
            LoggingUtils.info("BE_TC_30, Buy ELoad maximum transaction for Semi verified Tier validated");
            ExtentReporter.logPass("BE_TC_30", "Buy ELoad maximum transaction for Semi verified Tier validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_30", "Failed Buy ELoad maximum transaction for Semi verified Tier to validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----------------Positive
    public void buyELoadBuyerTierVerifiedTier_BE_TC_45() throws Exception {
        ExtentReporter.logInfo("BE_TC_45","Buy ELoad maximum transaction for Buyer verified Tier");
        login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad tab");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "10 Smart Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Continue Promo Pop Up");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(), "Buy Load Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objTransactionDetailsPage(), "Transaction Details Page")) {
            mobileGeneralMethod.isVisible(buyEloadObject.objMobileNumberInTransactionDetails(), "Mobile Number");
            mobileGeneralMethod.isVisible(buyEloadObject.objBuyELoadTime(), "Date and Time");
            mobileGeneralMethod.isVisible(buyEloadObject.objTypeOfPromoUsed(), "Promo");
            mobileGeneralMethod.isVisible(buyEloadObject.objAmountToSend(), "Amount to Send");
            mobileGeneralMethod.isVisible(buyEloadObject.objServiceFee(), "Service Fee");
            mobileGeneralMethod.isVisible(buyEloadObject.objTotalAmount(), "Total Amount");
            LoggingUtils.info("BE_TC_45, Buy ELoad maximum transaction for Semi verified Tier");
            ExtentReporter.logPass("BE_TC_45", "Buy ELoad maximum transaction for Buyer verified Tier validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_45", "Failed Buy ELoad maximum transaction for Buyer verified Tier to validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
}
