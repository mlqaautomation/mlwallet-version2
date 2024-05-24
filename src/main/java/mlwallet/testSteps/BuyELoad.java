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
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Select Smart Telco");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "10 Smart Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Continue Promo Pop Up");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(), "Buy Load Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(10000);
       mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(20000);
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

    public void eLoad_generic(String sTier, String mobileNo, String status, int telcoOption) throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad");
        mobileGeneralMethod.waitSleep(1000);
        if (status.equals("true")) {
           mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
            mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Telco");
        }
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(), mobileNo, "Mobile Number Field");
//      hideKeyboard();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
    }
    public void buyELoadTransactionDetails_BE_TC_01(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("BE_TC_01","Transaction Details Validation after Buying eLoad");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objRegularLoadTab(), "Regular Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj5SmartRegularLoad(), "Regular Load");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(), "Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
       mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(30000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objTransactionDetailsPage(),"Page")) {
           mobileGeneralMethod.isVisible(buyEloadObject.objMobileNumberInTransactionDetails(),"Mobile Number");
           mobileGeneralMethod.isVisible(buyEloadObject.objBuyELoadTime(), "Date and Time");
           mobileGeneralMethod.isVisible(buyEloadObject.objTypeOfPromoUsed(), "Promo");
           mobileGeneralMethod.isVisible(buyEloadObject.objAmountToSend(), "Amount to Send");
           mobileGeneralMethod.isVisible(buyEloadObject.objServiceFee(), "Service Fee");
           mobileGeneralMethod.isVisible(buyEloadObject.objTotalAmount(), "Total Amount");
            LoggingUtils.info("BE_TC_01, Transaction Details Validated after Buying eLoad");
            ExtentReporter.logPass("BE_TC_01", " Transaction Details Validated after Buying eLoad");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadInvalidMobileNumber_BE_TC_02() throws Exception {
        ExtentReporter.logInfo("","Buying eLoad using invalid mobile number");
        eLoad_generic(prop.getproperty("Fully_Verified"), prop.getproperty("inValidMobNumber"), "true", 3);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objErrorMsg(), "Pop Up Message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(buyEloadObject.objErrorMsg());
            String sExceptedErrorMsg = "Network and Mobile number does not match";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("BE_TC_02, Buy ELoad Using Invalid Mobile Number, Network and Mobile number does not match Error Message Validated");
            ExtentReporter.logPass("BE_TC_02", "BE_TC_02, Buy ELoad Using Invalid Mobile Number, Network and Mobile number does not match Error Message Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadWithoutInputMobNumber_BE_TC_03() throws Exception {
        ExtentReporter.logInfo("","Buying eLoad without mobile number input");
        eLoad_generic(prop.getproperty("Fully_Verified"), "", "true", 3);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objErrorMsg(), "Pop Up Message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(buyEloadObject.objErrorMsg());
            String sExceptedErrorMsg = "Mobile number is required";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("BE_TC_03, Buy ELoad without mobile number input, Mobile number is required Error Message is validated");
            ExtentReporter.logPass("BE_TC_03", "BE_TC_03, Buy ELoad without mobile number input, Mobile number is required Error Message is validated");
        }
    }
    public void buyELoadWithoutTelecommunicationSelected_BE_TC_04() throws Exception {
        ExtentReporter.logInfo("","Buying eLoad without telecommunication selected");
        eLoad_generic(prop.getproperty("Fully_Verified"), prop.getproperty("Smart"), "false", 4);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objErrorMsg(), "Pop Up Message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(buyEloadObject.objErrorMsg());
            String sExceptedErrorMsg = "Network and Mobile number does not match";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("BE_TC_04, Buying eLoad without selecting telecommunication, Network and Mobile number does not match Error Msg Validated");
            ExtentReporter.logPass("BE_TC_04", "BE_TC_04, Buying eLoad without selecting telecommunication, Network and Mobile number does not match Error Msg Validated");
        }
    }
    public void buyELoadInsufficientBalance_BE_TC_05(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buying eLoad with insufficient balance");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        //swipeDownUntilElementVisible("Smart Regular Load 3000");
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "Load");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(), "Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objInsufficientBalPopup(), "Pop up")) {
            String sActualInsufficientBalMsg = mobileGeneralMethod.getText(buyEloadObject.objInsufficientBalPopup());
            String sExceptedMsg = "There is insufficient balance to proceed with this transaction. Please try again.";
            mobileGeneralMethod.assertionValidation(sActualInsufficientBalMsg, sExceptedMsg);
           mobileGeneralMethod.isVisible(buyEloadObject.objOkBtn(), "Button");
            LoggingUtils.info("BE_TC_05, Insufficient Balance Error Message Validated");
            ExtentReporter.logPass("BE_TC_05", "BE_TC_05, Insufficient Balance Error Message Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadMaxLimitPerTransaction_BE_TC_09(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Maximum Limit per Transaction");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        //swipeDownUntilElementVisible("Smart Regular Load 3000");
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "Load");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(), "Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
         mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objMaxLimitPopupMsg(), "Error Popup Msg")) {
            String sActualPopupMsg = mobileGeneralMethod.getText(buyEloadObject.objMaxLimitPopupMsg());
            String sExceptedPopupMsg = "The maximum E-load per transaction set for your verification level is P2,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sActualPopupMsg, sExceptedPopupMsg);
            LoggingUtils.info("BE_TC_09, Buy ELoad Maximum Limit per Transaction Validated");
            ExtentReporter.logPass("BE_TC_09", "BE_TC_09, Buy ELoad Maximum Limit per Transaction Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadTransactionPageUIValidation_BE_TC_10(String sTier) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Transaction Page UI Validation");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "Page")) {
           mobileGeneralMethod.isVisible(buyEloadObject.objSelectTelco(),"Header");
           mobileGeneralMethod.isVisible(buyEloadObject.objPhoneToLoad(),"Header");
           mobileGeneralMethod.isVisible(buyEloadObject.objMobileNoField(), "Mobile Number Input Field");
           mobileGeneralMethod.isVisible(buyEloadObject.objSelectFromContacts(), "Button");
           mobileGeneralMethod.isVisible(buyEloadObject.objNextBtn(),"Button");
            LoggingUtils.info("BE_TC_10, Buy ELoad Transaction Page UI Validated");
            ExtentReporter.logPass("BE_TC_10", "BE_TC_10, Buy ELoad Transaction Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadNextButtonFunctionalityOnELoadTransactionPage_BE_TC_11(String sTier, String mobileNo, int telcoOption) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Next Button Functionality On ELoad Transaction Page");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad");
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(), mobileNo, "Mobile Number Field");
//        hideKeyboard();
        mobileGeneralMethod.tap(buyEloadObject.telcoOptions(telcoOption), "Telco");
        mobileGeneralMethod.tap(buyEloadObject.telcoOptions(telcoOption), "Telco");
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");

        if (mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page")) {
            LoggingUtils.info("BE_TC_11, Buy ELoad Next Button Functionality On ELoad Transaction Page Validated");
            ExtentReporter.logPass("BE_TC_11", "BE_TC_11, Buy ELoad Next Button Functionality On ELoad Transaction Page Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadLoadSelectionPageBackBtnValidation_BE_TC_12() throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Load Selection Back Arrow Button Validation");
        buyELoadNextButtonFunctionalityOnELoadTransactionPage_BE_TC_11(prop.getproperty("Fully_Verified"), prop.getproperty("Smart"), 3);
        mobileGeneralMethod.tap(buyEloadObject.objLoadSelectionBackArrowBtn(), "Load Selection Back Arrow Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "Page")) {
            LoggingUtils.info("BE_TC_12, After clicking on Back Arrow Btn on Load Selection Page, Application Navigates to eLoad Transaction Page is Validated");
            ExtentReporter.logPass("BE_TC_12", "BE_TC_12,  After clicking on Back Arrow Btn on Load Selection Page, Application Navigates to eLoad Transaction Page is Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadLoadSelectionPageUIValidation_BE_TC_13(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Load Selection Page UI Validation");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);

        if (mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Page")) {
           mobileGeneralMethod.isVisible(buyEloadObject.objMobileNumberInLoadSelection(), "Number");
           mobileGeneralMethod.isVisible(buyEloadObject.objChange(), "button");
           mobileGeneralMethod.isVisible(buyEloadObject.objWalletBalanceInLoadSeletion(), "Balance");
           mobileGeneralMethod.isVisible(buyEloadObject.objPromoLoadTab(), "Tab");
           mobileGeneralMethod.isVisible(buyEloadObject.objRegularLoadTab(), "Tab");
//            List<WebElement> values = findElements(buyEloadObject.objPromoLoads());
//            for (int i = 0; i < values.size(); i++) {
//                String sPromoLoads = values.get(i).getText();
//                LoggingUtils.info("Promo Load : " + sPromoLoads + " is displayed");
//                ExtentReporter.logInfo(" ", "Promo Load : " + sPromoLoads + " is displayed");
//            }
            LoggingUtils.info("BE_TC_13, Buy ELoad Load Selection Page UI Validated");
            ExtentReporter.logPass("BE_TC_13", "BE_TC_13,  Buy ELoad Load Selection Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadLoadSelectionChangeBtnFunctionality_BE_TC_14(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Load Selection Change Button Functionality Validation");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.tap(buyEloadObject.objChange(), "Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "Page")) {
            LoggingUtils.info("BE_TC_14, After clicking on Change Btn in Load Selection Page, Application navigates to eLoad Transaction page is Validated");
            ExtentReporter.logPass("BE_TC_14", "BE_TC_14, After clicking on Change Btn in Load Selection Page, Application navigates to eLoad Transaction page is Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadTransactionDetailsPageUIValidation_BE_TC_15(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Transaction Details Page UI Validation");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(),"Confirm Button");
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
            ExtentReporter.logPass("BE_TC_15", "BE_TC_15, Buy ELoad Transaction Details Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadSelectFromContactsBtnFunctionality_BE_TC_16(String sTier) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Select From Contacts Functionality");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(),"Buy eLoad");
        mobileGeneralMethod.tap(buyEloadObject.objSelectFromContacts(),"Button");
        mobileGeneralMethod.tap(buyEloadObject.objAllowBtn(),"Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objContacts(), "Page")) {
            LoggingUtils.info("BE_TC_16, Buy ELoad, After clicking on Select From Contacts Application Navigates to Contacts Page");
            ExtentReporter.logPass("BE_TC_16", "BE_TC_16, Buy ELoad, After clicking on Select From Contacts Application Navigates to Contacts Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadContactsPageUIValidation_BE_TC_17(String sTier) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Contacts Page UI Validation");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(),"Buy eLoad");
        mobileGeneralMethod.tap(buyEloadObject.objSelectFromContacts(),"Button");
        mobileGeneralMethod.tap(buyEloadObject.objAllowBtn(),"Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objContacts(), "Page")) {
            for (int i = 1; i <= 7; i++) {
                for (int j = 1; j <= 2; j++) {
                    if (j == 1) {
                        String sContactName = mobileGeneralMethod.getText(buyEloadObject.objContactsAndNumber(i, j));
                        LoggingUtils.info("Contact Name : " + sContactName + " is displayed");
                        ExtentReporter.logInfo(" ", "Contact Name : " + sContactName + " is displayed");
                    }
                    if (j == 2) {
                        String sContactNumber = mobileGeneralMethod.getText(buyEloadObject.objContactsAndNumber(i, j));
                        LoggingUtils.info("Contact Number : " + sContactNumber + " is displayed");
                        ExtentReporter.logInfo(" ", "Contact Number : " + sContactNumber + " is displayed");
                    }
                }
            }
            LoggingUtils.info("BE_TC_17, Buy ELoad Contacts Page UI Validated");
            ExtentReporter.logPass("BE_TC_17", "BE_TC_17, Buy ELoad Contacts Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadContactsPageBackBtnValidation_BE_TC_18(String sTier) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Contacts Page Back Arrow Button Validation");
        buyELoadSelectFromContactsBtnFunctionality_BE_TC_16(sTier);
        mobileGeneralMethod.tap(buyEloadObject.objContactsPageBackBtn(), "Contacts Page back arrow Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "Page")) {
            LoggingUtils.info("BE_TC_18, Buy ELoad Contacts Page Back Arrow Button Validated");
            ExtentReporter.logPass("BE_TC_18", "BE_TC_18, Buy ELoad Contacts Page Back Arrow Button Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadSearchFieldValidation_BE_TC_19(String sTier) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Search Field Validation");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad");
        mobileGeneralMethod.tap(buyEloadObject.objSelectFromContacts(), "Button");
        mobileGeneralMethod.tap(buyEloadObject.objAllowBtn(), "Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objContacts(), "Page");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objSearch(), "Contact Search")) {
            mobileGeneralMethod.type(buyEloadObject.objSearch(), prop.getproperty("contactName"), "Contact Search");
            mobileGeneralMethod.isVisible(buyEloadObject.objSearchedContactName(),"Contact name");
            mobileGeneralMethod.isVisible(buyEloadObject.objSearchedContactNumber(),"Contact Number");
            LoggingUtils.info("BE_TC_19, Buy ELoad Search Field Validated");
            ExtentReporter.logPass("BE_TC_19", "BE_TC_19, Buy ELoad Search Field Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadAddContactToFavorites_BE_TC_20(String sTier) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Add Contact To Favorites");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad");
        mobileGeneralMethod.tap(buyEloadObject.objSelectFromContacts(),"Button");
        mobileGeneralMethod.tap(buyEloadObject.objAllowBtn(),"Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objContacts(),"Page");
        mobileGeneralMethod.type(buyEloadObject.objSearch(), prop.getproperty("contactName"), "Contact Search");
        mobileGeneralMethod.isVisible(buyEloadObject.objSearchedContactName(),"Contact name");
        String sContactName = mobileGeneralMethod.getText(buyEloadObject.objSearchedContactName());
        mobileGeneralMethod.isVisible(buyEloadObject.objSearchedContactNumber(),"Contact Number");
        String sContactNumber = mobileGeneralMethod.getText(buyEloadObject.objSearchedContactNumber());
//        hideKeyboard();
        mobileGeneralMethod.tap(buyEloadObject.objAddToFavoriteIcon(), "Add To Favorite Icon");
//        verticalSwipeByPercentages(0.5, 0.9, 0.5);
        mobileGeneralMethod.tap(buyEloadObject.objFavorites(),"Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objSearchedContactName(), "Contact name")) {
            String sContactNameInFavorites = mobileGeneralMethod.getText(buyEloadObject.objSearchedContactName());
            mobileGeneralMethod.assertionValidation(sContactName, sContactNameInFavorites);
            String sContactNumberInFavorites = mobileGeneralMethod.getText(buyEloadObject.objSearchedContactNumber());
            mobileGeneralMethod.assertionValidation(sContactNumber, sContactNumberInFavorites);
            LoggingUtils.info("BE_TC_20, Buy ELoad Add Contact To Favorites Validated");
            ExtentReporter.logPass("BE_TC_20", "BE_TC_20, Buy ELoad Add Contact To Favorites Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadAddedContactToFavoritesValidation_BE_TC_21(String sTier) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Added Contacts To Favorites validation");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad");
        mobileGeneralMethod.tap(buyEloadObject.objSelectFromContacts(),"Button");
        mobileGeneralMethod.tap(buyEloadObject.objAllowBtn(),"Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objContacts(),"Page");
        mobileGeneralMethod.type(buyEloadObject.objSearch(), prop.getproperty("contactNumber"), "Contact Search");
        mobileGeneralMethod.isVisible(buyEloadObject.objSearchedContactName(),"Contact name");
        mobileGeneralMethod.isVisible(buyEloadObject.objSearchedContactNumber(),"Contact Number");
//        hideKeyboard();
        mobileGeneralMethod.tap(buyEloadObject.objAddToFavoriteIcon(), "Add To Favorite Icon");
//        verticalSwipeByPercentages(0.5, 0.9, 0.5);
//        clearField(buyEloadObject.objSearch(), "Search field");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objFavorites(),"Button")) {
            mobileGeneralMethod.tap(buyEloadObject.objFavorites(),"Button");
            mobileGeneralMethod.waitSleep(3000);
            for (int i = 1; i <= 2; i++) {
                for (int j = 1; j <= 2; j++) {
                    if (j == 1) {
                        String sContactName = mobileGeneralMethod.getText(buyEloadObject.objContactsAndNumber(i, j));
                        LoggingUtils.info("Contact Name : " + sContactName + " is displayed");
                        ExtentReporter.logInfo(" ", "Contact Name : " + sContactName + " is displayed");
                    }
                    if (j == 2) {
                        String sContactNumber = mobileGeneralMethod.getText(buyEloadObject.objContactsAndNumber(i, j));
                        LoggingUtils.info("Contact Number : " + sContactNumber + " is displayed");
                        ExtentReporter.logInfo(" ", "Contact Number : " + sContactNumber + " is displayed");
                    }
                }
            }
            LoggingUtils.info("BE_TC_21, Buy ELoad Added Contacts To Favorites Validated");
            ExtentReporter.logPass("BE_TC_21", "BE_TC_21, Buy ELoad Added Contacts To Favorites Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadSearchAddedFavoriteContact_BE_TC_22(String sTier) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Search Added Favorite Contact");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad");
        mobileGeneralMethod.tap(buyEloadObject.objSelectFromContacts(),"Button");
        mobileGeneralMethod.tap(buyEloadObject.objAllowBtn(),"Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objContacts(),"Page");
        mobileGeneralMethod.type(buyEloadObject.objSearch(), prop.getproperty("favoriteContact"), "Contact Search");
        mobileGeneralMethod.isVisible(buyEloadObject.objSearchedContactName(),"Contact name");
        mobileGeneralMethod.isVisible(buyEloadObject.objSearchedContactNumber(),"Contact Number");
//        hideKeyboard();
        mobileGeneralMethod.tap(buyEloadObject.objAddToFavoriteIcon(),"Add To Favorite Icon");
//        verticalSwipeByPercentages(0.5, 0.9, 0.5);
//        clearField(buyEloadObject.objSearch, "Search field");
        mobileGeneralMethod.tap(buyEloadObject.objFavorites(),"Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objSearch(), "Contact Search")) {
            mobileGeneralMethod.type(buyEloadObject.objSearch(), prop.getproperty("favoriteContactNumber"), "Contact Search");
           mobileGeneralMethod.isVisible(buyEloadObject.objSearchedContactName(),"Contact name");
           mobileGeneralMethod.isVisible(buyEloadObject.objSearchedContactNumber(),"Contact Number");
            LoggingUtils.info("BE_TC_22, Buy ELoad Search Added Favorite Contact Validated");
            ExtentReporter.logPass("BE_TC_22", "BE_TC_22, Buy ELoad Search Added Favorite Contact Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadSearchUnFavoriteContact_BE_TC_23(String sTier) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Search UnFavorite Contact");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad");
        mobileGeneralMethod.tap(buyEloadObject.objSelectFromContacts(),"Button");
        mobileGeneralMethod.tap(buyEloadObject.objAllowBtn(),"Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objContacts(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objFavorites(),"Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objSearch(), "Contact Search")) {
            mobileGeneralMethod.type(buyEloadObject.objSearch(), prop.getproperty("unFavoriteNumber"), "Contact Search");
           mobileGeneralMethod.isVisible(buyEloadObject.objNoFavoritesFoundMsg(),"Message");
            LoggingUtils.info("BE_TC_23, Buy ELoad Search UnFavorite Contact Validated");
            ExtentReporter.logPass("BE_TC_23", "BE_TC_23, Buy ELoad Search UnFavorite Contact Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadPromoConfirmationPopupValidation_BE_TC_24(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Promo Confirmation Popup Validation");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);

        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "Promo");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objPromoConfirmationPopup(),"Popup Msg")) {
           mobileGeneralMethod.isVisible(buyEloadObject.objConfirmBtn(),"Button");
           mobileGeneralMethod.isVisible(buyEloadObject.objCancelBtn(),"Button");
            LoggingUtils.info("BE_TC_24, Buy ELoad Promo Confirmation Popup Validated");
            ExtentReporter.logPass("BE_TC_24", "BE_TC_24, Buy ELoad Promo Confirmation Popup Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadOTPPageUIValidation_BE_TC_25(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad OTP page UI Validation");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page")) {
//			mobileGeneralMethod.isVisible(loginObject.objOtpTextField, "OTP text Field");
//			mobileGeneralMethod.isVisible(MLWalletCashOutPage.objResendCode, getTextVal(MLWalletCashOutPage.objResendCode, "Seconds"));
            LoggingUtils.info("BE_TC_25, Buy ELoad One Time Pin page UI Validated");
            ExtentReporter.logPass("BE_TC_25", "BE_TC_25, Buy ELoad One Time Pin page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void buyELoadSuccessfulTransaction_BE_TC_26(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Successful Transaction UI Validation");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
       mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objTransactionDetailsPage(),"Page")) {
            mobileGeneralMethod.isVisible(buyEloadObject.objMobileNumberInTransactionDetails(),"Mobile Number");
            mobileGeneralMethod.isVisible(buyEloadObject.objBuyELoadTime(),"Date and Time");
            mobileGeneralMethod.isVisible(buyEloadObject.objTypeOfPromoUsed(),"Promo");
            mobileGeneralMethod.isVisible(buyEloadObject.objAmountToSend(),"Amount to Send");
            mobileGeneralMethod.isVisible(buyEloadObject.objServiceFee(),"Service Fee");
            mobileGeneralMethod.isVisible(buyEloadObject.objTotalAmount(),"Total Amount");
            LoggingUtils.info("BE_TC_26, Buy ELoad Successful Transaction UI validated");
            ExtentReporter.logPass("BE_TC_26", "BE_TC_26, Buy ELoad Successful Transaction UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadRecentTransactionUIValidation_BE_TC_27() throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Recent Transaction UI Validation");
        buyELoadSuccessfulTransaction_BE_TC_26(prop.getproperty("Fully_Verified"), 2);
        mobileGeneralMethod.tap(buyEloadObject.objBackToHomeBtn(),"Button");
        mobileGeneralMethod.verticalSwipeDown();
        if (mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(),"Header")) {
            mobileGeneralMethod.isVisible(homePageObject.objBuyELoadTransaction(),"Transaction");
            mobileGeneralMethod.isVisible(homePageObject.objPosted(),"Status");
            LoggingUtils.info("BE_TC_27, Buy ELoad Recent Transaction UI validated");
            ExtentReporter.logPass("BE_TC_27", "BE_TC_27, Buy ELoad Recent Transaction UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void buyELoadTransactionDetailsUIValidation_BE_TC_28() throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Transaction Details UI Validation");
        buyELoadRecentTransactionUIValidation_BE_TC_27();
        mobileGeneralMethod.tap(homePageObject.objBuyELoadTransaction(),"Transaction");
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
            ExtentReporter.logPass("BE_TC_28", "BE_TC_28, Buy ELoad Transaction Details UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadLocationPopupValidation_BE_TC_51(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Location Popup Validation");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        if (mobileGeneralMethod.isVisible(homePageObject.objPopUpMsg(),"Popup Msg")) {
            LoggingUtils.info("BE_TC_51, Buy ELoad Location Popup Validated");
            ExtentReporter.logPass("BE_TC_51", "BE_TC_51, Buy ELoad Location Popup Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadLocationDenyFunctionality_BE_TC_52(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Location Deny Functionality");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        if (mobileGeneralMethod.isVisible(homePageObject.objPopUpMsg(),"Popup Msg")) {
//            permissionDenyPopUp();
            LoggingUtils.info("BE_TC_52, Buy ELoad Location Deny Functionality Validated");
            ExtentReporter.logPass("BE_TC_52", "BE_TC_52, Buy ELoad Location Deny Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadLocationPermissionDenyCloseBtnFunctionality_BE_TC_53(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Location Permission Deny Close Button Functionality");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        if (mobileGeneralMethod.isVisible(homePageObject.objPopUpMsg(),"Popup Msg")) {
//            permissionDenyCloseBtnFunctionality();
            if (mobileGeneralMethod.isVisible(loginObject.objAvailableBalance(),"Page")) {
                LoggingUtils.info("BE_TC_53, Buy ELoad Location Permission Deny Close Button Functionality Validated");
                ExtentReporter.logPass("BE_TC_53", "BE_TC_53, Buy ELoad Location Permission Deny Close Button Functionality Validated");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }


    public void buyELoadLocationPermissionDenyOpenSettingsBtnFunctionality_BE_TC_54(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Location Permission Deny open Settings Button Functionality Validation");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        if (mobileGeneralMethod.isVisible(homePageObject.objPopUpMsg(),"Popup Msg")) {
//            permissionDenyOpenSettingsBtnFunctionality();
            if (mobileGeneralMethod.isVisible(buyEloadObject.objAppInfo(),"Page")) {
                LoggingUtils.info("BE_TC_54, Buy ELoad Location Permission Deny Open Settings Button Functionality Validated");
                ExtentReporter.logPass("BE_TC_54", "BE_TC_54, Buy ELoad Location Permission Deny Open Settings Button Functionality Validated");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }


    public void buyELoadLocationPopUpAllowFunctionality_BE_TC_55(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Location popup Allow Button Functionality Validation");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        if (mobileGeneralMethod.isVisible(homePageObject.objPopUpMsg(),"Popup Msg")) {
            mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(),"Page");
            LoggingUtils.info("BE_TC_55, Buy ELoad Location popup Allow Button Functionality Validated");
            ExtentReporter.logPass("BE_TC_55", "BE_TC_55, Buy ELoad Location popup Allow Button Functionality Validated");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void buyELoadContactsPermissionPopup_BE_TC_56(String sTier) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Contacts Permission Popup");
//        mlWalletLogin(sTier);
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad");
        mobileGeneralMethod.tap(buyEloadObject.objSelectFromContacts(),"Button");
        if (mobileGeneralMethod.isVisible(homePageObject.objPopUpMsg(),"Popup Msg")) {
            mobileGeneralMethod.isVisible(homePageObject.objContactPopUpAllowBtn(),"Button");
            mobileGeneralMethod.isVisible(homePageObject.objPopUpDenyBtn(),"Button");
            LoggingUtils.info("BE_TC_56, Buy ELoad Contacts Permission Popup Validated");
            ExtentReporter.logPass("BE_TC_56", "BE_TC_56, Buy ELoad Location popup Allow Button Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadContactPermissionPopupAllowBtnFunctionality_BE_TC_57() throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Contacts Permission Popup Allow Button Functionality");
        buyELoadContactsPermissionPopup_BE_TC_56(prop.getproperty("Fully_Verified"));
        mobileGeneralMethod.tap(homePageObject.objContactPopUpAllowBtn(),"Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objContacts(),"Page")) {
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 2; j++) {
                    if (j == 1) {
                        String sContactName = mobileGeneralMethod.getText(buyEloadObject.objContactsAndNumber(i, j));
                        LoggingUtils.info("Contact Name : " + sContactName + " is displayed");
                        ExtentReporter.logPass(" ", "Contact Name : " + sContactName + " is displayed");
                    }
                    if (j == 2) {
                        String sContactNumber = mobileGeneralMethod.getText(buyEloadObject.objContactsAndNumber(i, j));
                        LoggingUtils.info("Contact Number : " + sContactNumber + " is displayed");
                        ExtentReporter.logPass(" ", "Contact Number : " + sContactNumber + " is displayed");
                    }
                }
            }
            LoggingUtils.info("BE_TC_57, Buy ELoad Contacts Permission Popup Allow Button Functionality Validated");
            ExtentReporter.logPass("BE_TC_57", "BE_TC_57, Buy ELoad Contacts Permission Popup Allow Button Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void buyELoadContactPermissionPopupDenyBtnFunctionality_BE_TC_58() throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Contacts Permission Popup Deny Button Functionality");
        buyELoadContactsPermissionPopup_BE_TC_56(prop.getproperty("Fully_Verified"));
        mobileGeneralMethod.tap(homePageObject.objPopUpDenyBtn(),"Button");
        mobileGeneralMethod.tap(buyEloadObject.objContactsPageBackBtn(), "Contact Page Back Arrow Button");
        mobileGeneralMethod.tap(buyEloadObject.objSelectFromContacts(),"Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objContactPopupMsg(),"Popup")) {
            mobileGeneralMethod.isVisible(buyEloadObject.objAllowAccess(),"Button");
            mobileGeneralMethod.isVisible(buyEloadObject.objAskMeLater(),"Button");
            LoggingUtils.info("BE_TC_58, Buy ELoad Contacts Permission Popup Deny Button Functionality Validated");
            ExtentReporter.logPass("BE_TC_58", "BE_TC_58, Buy ELoad Contacts Permission Popup Deny Button Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadContactPermissionTwoDenyBtnFunctionality_BE_TC_59() throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Contact PermissionTwo Deny Button Functionality");
        buyELoadContactPermissionPopupDenyBtnFunctionality_BE_TC_58();
        mobileGeneralMethod.tap(buyEloadObject.objAllowAccess(),"Button");
        mobileGeneralMethod.tap(homePageObject.objContactPopupDenyBtn(),"Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objNoContactsFoundMsg(),"Message")) {
            LoggingUtils.info("BE_TC_59, Buy ELoad Contact PermissionTwo Deny Button Functionality validated");
            ExtentReporter.logPass("BE_TC_59", "BE_TC_59, Buy ELoad Contact PermissionTwo Deny Button Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadContactPermissionTwoAllowBtnFunctionality_BE_TC_60() throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Contact PermissionTwo Allow Button Functionality");
        buyELoadContactPermissionPopupDenyBtnFunctionality_BE_TC_58();
        mobileGeneralMethod.tap(buyEloadObject.objAllowAccess(),"Button");
        mobileGeneralMethod.tap(homePageObject.objContactPopUpAllowBtn(),"Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objContacts(),"Page")) {
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 2; j++) {
                    if (j == 1) {
                        String sContactName = mobileGeneralMethod.getText(buyEloadObject.objContactsAndNumber(i, j));
                        LoggingUtils.info("Contact Name : " + sContactName + " is displayed");
                        ExtentReporter.logPass(" ", "Contact Name : " + sContactName + " is displayed");
                    }
                    if (j == 2) {
                        String sContactNumber = mobileGeneralMethod.getText(buyEloadObject.objContactsAndNumber(i, j));
                        LoggingUtils.info("Contact Number : " + sContactNumber + " is displayed");
                        ExtentReporter.logPass(" ", "Contact Number : " + sContactNumber + " is displayed");
                    }
                }
            }
            LoggingUtils.info("BE_TC_60, Buy ELoad Contact PermissionTwo Allow Button Functionality Validated");
            ExtentReporter.logPass("BE_TC_60", "BE_TC_60, Buy ELoad Contact PermissionTwo Allow Button Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void buyELoadInternetInterruptionWhileEnteringOTP_BE_TC_61(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Internet Interruption While Entering OTP Validation");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(),"Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(1000);
//        setWifiConnectionToONOFF("OFF");
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        if (mobileGeneralMethod.isVisible(homePageObject.objInternetConnectionPopUp(),"PopUp")) {
//            internetConnectionError();
            LoggingUtils.info("BE_TC_61, Buy ELoad Internet Interruption While Entering OTP Validated");
            ExtentReporter.logPass("BE_TC_61", "BE_TC_61, Buy ELoad Internet Interruption While Entering OTP Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadLocationPermissionAskMeLaterButtonFunctionality_BE_TC_62() throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Location Permission Ask Me Later Button Functionality");
        buyELoadContactPermissionPopupDenyBtnFunctionality_BE_TC_58();
        mobileGeneralMethod.tap(buyEloadObject.objAskMeLater(),"Button");
        if (mobileGeneralMethod.isVisible(homePageObject.objPopUpMsg(),"Popup Msg")) {
            mobileGeneralMethod.isVisible(homePageObject.objContactPopUpAllowBtn(),"Button");
            mobileGeneralMethod.isVisible(homePageObject.objContactPopupDenyBtn(),"Button");
            LoggingUtils.info("BE_TC_62, Buy ELoad Location Permission Ask Me Later Button Functionality Validated");
            ExtentReporter.logPass("BE_TC_62", "BE_TC_62, Buy ELoad Location Permission Ask Me Later Button Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadLocationPermissionTwoDenyBtnFunctionality_BE_TC_63() throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Location PermissionTwo Deny Button Functionality");
        buyELoadLocationPermissionAskMeLaterButtonFunctionality_BE_TC_62();
        mobileGeneralMethod.tap(homePageObject.objContactPopupDenyBtn(),"Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objNoContactsFoundMsg(),"Message")) {
            LoggingUtils.info("BE_TC_63, Buy ELoad Location PermissionTwo Deny Button Functionality validated");
            ExtentReporter.logPass("BE_TC_63", "BE_TC_63, Buy ELoad Location PermissionTwo Deny Button Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadLocationPermissionTwoAllowBtnFunctionality_BE_TC_64() throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Location PermissionTwo Allow Button Functionality");
        buyELoadLocationPermissionAskMeLaterButtonFunctionality_BE_TC_62();
        mobileGeneralMethod.tap(homePageObject.objContactPopUpAllowBtn(),"Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objContacts(),"Page")) {
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 2; j++) {
                    if (j == 1) {
                        String sContactName = mobileGeneralMethod.getText(buyEloadObject.objContactsAndNumber(i, j));
                        LoggingUtils.info("Contact Name : " + sContactName + " is displayed");
                        ExtentReporter.logPass(" ", "Contact Name : " + sContactName + " is displayed");
                    }
                    if (j == 2) {
                        String sContactNumber = mobileGeneralMethod.getText(buyEloadObject.objContactsAndNumber(i, j));
                        LoggingUtils.info("Contact Number : " + sContactNumber + " is displayed");
                        ExtentReporter.logPass(" ", "Contact Number : " + sContactNumber + " is displayed");
                    }
                }
            }
            LoggingUtils.info("BE_TC_64, Buy ELoad Location PermissionTwo Allow Button Functionality Validated");
            ExtentReporter.logPass("BE_TC_64", "BE_TC_64, Buy ELoad Location PermissionTwo Allow Button Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadContactPopupNotDisplayedAfterClickingODenyButtonValidation_BE_TC_65() throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Contact Popup Not displayed After Clicking On Deny Button Validation");
        buyELoadLocationPermissionAskMeLaterButtonFunctionality_BE_TC_62();
        mobileGeneralMethod.tap(homePageObject.objContactPopupDenyBtn(),"Button");
        mobileGeneralMethod.tap(buyEloadObject.objContactsPageBackBtn(), "Contacts Page Back Btn");
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectFromContacts(),"Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objContactPopupMsg(), "Contacts Popup")) {
            LoggingUtils.info("BE_TC_65, Buy ELoad Contact Popup Not displayed After Clicking On Deny Button is Validated");
            ExtentReporter.logPass("BE_TC_65", "BE_TC_65, Buy ELoad Contact Popup Not displayed After Clicking On Deny Button is Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadNewTransactionBtnFunctionality_BE_TC_66() throws Exception {
        ExtentReporter.logInfo("","Buy ELoad New Transaction Button Functionality");
        buyELoadTransactionDetails_BE_TC_01(prop.getproperty("Fully_Verified"), 3);
        mobileGeneralMethod.tap(buyEloadObject.objNewTransaction(),"Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(),"Page")) {
            LoggingUtils.info("BE_TC_66, Buy ELoad New Transaction Button Functionality Validated");
            ExtentReporter.logPass("BE_TC_66", "BE_TC_66, Buy ELoad New Transaction Button Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadTransactionValidationAfterMinimizingApp_BE_TC_069(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Transaction Validation After Minimizing App");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(),"Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
//        DriverManager.getAppiumDriver().runAppInBackground(Duration.ofSeconds(5));
        LoggingUtils.info("Application relaunched after 5 Seconds");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objTransactionDetailsPage(),"Page")) {
            LoggingUtils.info("BE_TC_069, Buy ELoad Transaction Validation After Minimizing App Validated");
            ExtentReporter.logPass("BE_TC_069", "BE_TC_069, Buy ELoad Transaction Validation After Minimizing App Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void buyELoadTransactionWithValidMLPin_BE_TC_78(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Transaction With Valid MLPin");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(),"Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
//        handleMpin("1111");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objTransactionDetailsPage(),"Page")) {
            mobileGeneralMethod.isVisible(buyEloadObject.objMobileNumberInTransactionDetails(),"Mobile Number");
            mobileGeneralMethod.isVisible(buyEloadObject.objBuyELoadTime(),"Date and Time");
            mobileGeneralMethod.isVisible(buyEloadObject.objTypeOfPromoUsed(),"Promo");
            mobileGeneralMethod.isVisible(buyEloadObject.objAmountToSend(),"Amount to Send");
            mobileGeneralMethod.isVisible(buyEloadObject.objServiceFee(),"Service Fee");
            mobileGeneralMethod.isVisible(buyEloadObject.objTotalAmount(),"Total Amount");
            LoggingUtils.info("BE_TC_78, Buy ELoad Transaction With Valid MLPin is Validated");
            ExtentReporter.logPass("BE_TC_78", "BE_TC_78, Buy ELoad Transaction With Valid MLPin is Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void buyELoadTransactionWithInValidMLPin_BE_TC_79(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Transaction With InValid MLPin");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(),"Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
//        handleMpin("1234");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objInvalidPINMsg(),"Message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(buyEloadObject.objInvalidPINMsg());
            String sExceptedErrorMsg = "You have entered an invalid PIN. Please try again.";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("BE_TC_79, Buy ELoad Transaction With Invalid ML Pin validated");
            ExtentReporter.logPass("BE_TC_79", "BE_TC_79, Buy ELoad Transaction With Invalid ML Pin validated");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void buyELoadInOTPPopupValidation_BE_TC_089(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Transaction IN App OTP Popup Validation");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(),"Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page")) {
            mobileGeneralMethod.isVisible(loginObject.objOTP(),"One Time Pin");
            LoggingUtils.info("BE_TC_089, Buy ELoad, InApp OTP popup validated");
            ExtentReporter.logPass("BE_TC_089", "BE_TC_089, Buy ELoad, InApp OTP popup validated");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void buyELoadTransactionInAppOTPPopupUIValidation_BE_TC_090(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Transaction InApp OTP popup UI Validation");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(),"Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page")) {
            mobileGeneralMethod.isVisible(loginObject.objOTP(),"One Time Pin");
            mobileGeneralMethod.isVisible(loginObject.objSeconds(),"Seconds");
            mobileGeneralMethod.isVisible(loginObject.objContinueBtn(),"Button");
            mobileGeneralMethod.isVisible(loginObject.objCancelBtn(),"Button");
            LoggingUtils.info("BE_TC_090, Buy ELoad Transaction InApp OTP popup UI validated");
            ExtentReporter.logPass("BE_TC_090", "BE_TC_090, Buy ELoad Transaction InApp OTP popup UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void buyELoadTransactionNewOTPAfterSixtySecondsValidation_BE_TC_091(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad New OTP got generated After Sixty Seconds validation");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(),"Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        if (mobileGeneralMethod.isVisible(loginObject.objOTP(),"One Time Pin")) {
            String sGeneratedOTP = mobileGeneralMethod.getText(loginObject.objOTP());
            mobileGeneralMethod.waitSleep(70000);
            String sNewlyGeneratedOTPAfterSixtySeconds = mobileGeneralMethod.getText(loginObject.objOTP());
//            mobileGeneralMethod.assertNotEquals(sGeneratedOTP, sNewlyGeneratedOTPAfterSixtySeconds);
            LoggingUtils.info("BE_TC_091, Buy ELoad Transaction New OTP got generated After Sixty Seconds is validated");
            ExtentReporter.logPass("BE_TC_091", "BE_TC_091, Buy ELoad Transaction New OTP got generated After Sixty Seconds is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadTransactionOTPCancelBtnFunctionality_BE_TC_092(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Transaction OTP Cancel Button Functionality");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(),"Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        mobileGeneralMethod.tap(loginObject.objCancelBtn(),"Button");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page")) {
            LoggingUtils.info("BE_TC_092, Buy ELoad Transaction, After clicking on Cancel in One time pin popup App navigates back to Buy ELoad Page is validated");
            ExtentReporter.logPass("BE_TC_092", "BE_TC_092, Buy ELoad Transaction, After clicking on Cancel in One time pin popup App navigates back to Buy ELoad Page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void buyELoadTransactionOTPContinueBtnFunctionality_BE_TC_093(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Transaction OTP Continue Button Functionality");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(),"Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        mobileGeneralMethod.tap(loginObject.objContinueBtn(),"Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objTransactionDetailsPage(),"Page")) {
            LoggingUtils.info("BE_TC_093, Buy ELoad Transaction, After clicking on Continue in One time pin popup App navigates to Transaction Success Page is validated");
            ExtentReporter.logPass("BE_TC_093", "BE_TC_093, Buy ELoad Transaction, After clicking on Continue in One time pin popup App navigates to Transaction Success page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadMaximumTransactionForBranchVerifiedTier_BE_TC_42(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad maximum transaction for Branch verified Tier");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj2000PromoLoad(),"Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        mobileGeneralMethod.tap(loginObject.objContinueBtn(),"Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objTransactionDetailsPage(),"Page")) {
            LoggingUtils.info("BE_TC_42, Buy ELoad maximum transaction for Branch verified Tier validated");
            ExtentReporter.logPass("BE_TC_42", "BE_TC_42, Buy ELoad maximum transaction for Branch verified Tier validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadMaximumTransactionForSemiVerifiedTier_BE_TC_30(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad maximum transaction for Semi verified Tier");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj2000PromoLoad(),"Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(),"Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        mobileGeneralMethod.tap(loginObject.objContinueBtn(),"Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objTransactionDetailsPage(),"Page")) {
            LoggingUtils.info("BE_TC_30, Buy ELoad maximum transaction for Semi verified Tier validated");
            ExtentReporter.logPass("BE_TC_30", "BE_TC_42, Buy ELoad maximum transaction for Semi verified Tier validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadMaximumLimitForSemiVerifiedTier_BE_TC_33(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad maximum Limit reached Error msg validation for Semi verified Tier");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(buyEloadObject.obj3000PromoLoad(),"Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(),"Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objMaxLimitErrorMsg(),"Error Message")) {
            String sErrorMsg = mobileGeneralMethod.getText(buyEloadObject.objMaxLimitErrorMsg());
            String sExpectedErrorMsg = "The maximum E-load per transaction set for your verification level is P2,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sErrorMsg, sExpectedErrorMsg);
            LoggingUtils.info("BE_TC_33, Buy ELoad maximum Limit reached Error msg validated for Semi verified Tier");
            ExtentReporter.logPass("BE_TC_33", "BE_TC_33, Buy ELoad maximum Limit reached Error msg validated for Semi verified Tier");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadMaximumLimitForFullyVerifiedTier_BE_TC_39(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad maximum Limit reached Error msg validation for Fully verified Tier");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(buyEloadObject.obj3000PromoLoad(),"Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(),"Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objMaxLimitErrorMsg(),"Error Message")) {
            String sErrorMsg = mobileGeneralMethod.getText(buyEloadObject.objMaxLimitErrorMsg());
            String sExpectedErrorMsg = "The maximum E-load per transaction set for your verification level is P2,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sErrorMsg, sExpectedErrorMsg);
            LoggingUtils.info("BE_TC_39, Buy ELoad maximum Limit reached Error msg validated for Fully verified Tier");
            ExtentReporter.logPass("BE_TC_39", "BE_TC_39, Buy ELoad maximum Limit reached Error msg validated for Fully verified Tier");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadMaximumTransactionForFullyVerifiedTier_BE_TC_36(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad maximum transaction for Fully verified Tier");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj2000PromoLoad(),"Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        mobileGeneralMethod.tap(loginObject.objContinueBtn(),"Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objTransactionDetailsPage(),"Page")) {
            LoggingUtils.info("BE_TC_36, Buy ELoad maximum transaction for Fully verified Tier validated");
            ExtentReporter.logPass("BE_TC_36", "BE_TC_36, Buy ELoad maximum transaction for Fully verified Tier validated");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void buyELoadMaximumLimitForBuyerTierVerifiedTier_BE_TC_45(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad maximum Limit reached Error msg validation for Buyer Tier verified Tier");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(buyEloadObject.obj3000PromoLoad(),"Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(),"Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objMaxLimitErrorMsg(),"Error Message")) {
            String sErrorMsg = mobileGeneralMethod.getText(buyEloadObject.objMaxLimitErrorMsg());
            String sExpectedErrorMsg = "The maximum E-load per transaction set for your verification level is P2,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sErrorMsg, sExpectedErrorMsg);
            LoggingUtils.info("BE_TC_45, Buy ELoad maximum Limit reached Error msg validated for Buyer Tier verified Tier");
            ExtentReporter.logPass("BE_TC_45", "BE_TC_45, Buy ELoad maximum Limit reached Error msg validated for Buyer Tier verified Tier");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadMaximumTransactionForBuyerTierVerifiedTier_BE_TC_48(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad maximum transaction for Buyer Tier verified Tier");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj2000PromoLoad(),"Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(),"Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        mobileGeneralMethod.tap(loginObject.objContinueBtn(),"Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objTransactionDetailsPage(),"Page")) {
            LoggingUtils.info("BE_TC_48, Buy ELoad maximum transaction for Buyer Tier verified Tier validated");
            ExtentReporter.logPass("BE_TC_48", "BE_TC_48, Buy ELoad maximum transaction for Buyer Tier verified Tier validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadSecondTimeLoadSelectionPopupValidation_BE_TC_29(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad Second time Load selection popup validation");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj2000PromoLoad(),"Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.tap(buyEloadObject.objBuyLoadBackArrowBtn(), "Buy Load Back Arrow Button");
        mobileGeneralMethod.tap(buyEloadObject.obj2000PromoLoad(),"Promo");
        if (mobileGeneralMethod.isVisible(buyEloadObject.objSecondTimeConfirmationPopup(),"Popup")) {
            mobileGeneralMethod.isVisible(buyEloadObject.obj2000PromoLoad(),"Promo Load");
            LoggingUtils.info("BE_TC_29, Buy ELoad Second time Load selection popup validated");
            ExtentReporter.logPass("BE_TC_29", "BE_TC_29, Buy ELoad Second time Load selection popup validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void buyELoadMLPinPageNavigation_BE_TC_87(String sTier, int promotab) throws Exception {
        ExtentReporter.logInfo("","Buy ELoad ML pin page navigation");
        eLoad_generic(sTier, prop.getproperty("Smart"), "true", promotab);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(),"Load Selection Page");
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.obj2000PromoLoad(),"Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(),"Pop Up");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(),"Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(),"Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objMLPinEditField(), "ML Pin Page")) {
            LoggingUtils.info("BE_TC_87, Buy ELoad ML pin page navigation validated");
            ExtentReporter.logPass("BE_TC_87", "BE_TC_87, Buy ELoad ML pin page navigation validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    
}
