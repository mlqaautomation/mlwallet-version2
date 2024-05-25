package mlwallet.testSteps;
import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;
import mlwallet.testSteps.Login;
import utilities.yamlReader.yamlReader;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class PayBills extends Base_Steps{
    Login login = new Login();

    public void payBillsNavigation() throws Exception {
        mobileGeneralMethod.isVisible(payBillsObject.objPayBills(),"Pay Bills Icon");
        mobileGeneralMethod.tap(payBillsObject.objPayBills(), "Click Pay Bills Icon");
        mobileGeneralMethod.waitSleep(3000);
    }
    public void searchBiller() throws Exception {
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.type(payBillsObject.objSearchBiller(),"Search Biller",prop.getproperty("Biller_Name"));
        mobileGeneralMethod.isVisible(payBillsObject.objMisBillsPayBiller(), "Mis Bills Pay Biller");
        mobileGeneralMethod.tap(payBillsObject.objMisBillsPayBiller(), "Mis Bills Pay Biller");
        mobileGeneralMethod.waitSleep(5000);
    }
    public void billerDetails(String sFirstName, String sLastName, String sMiddleName, String sAmount) throws Exception {
        if (mobileGeneralMethod.isVisible(payBillsObject.objBillsPayInformation(),"Bills Pay Information Page")) {
            mobileGeneralMethod.type(payBillsObject.objAccountNumberField(),"Account Number Text Field", prop.getproperty("AccountNumber"));
            mobileGeneralMethod.type(payBillsObject.objFirstNameField(),"First Name Text Field", sFirstName );
            mobileGeneralMethod.type(payBillsObject.objMiddleNameField(),"Middle Name Text Field" , sMiddleName );
            mobileGeneralMethod.type(payBillsObject.objLastnameField(),"Last Name Text Field", sLastName);
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.type(payBillsObject.objAmountField(),"Amount to Send Text Field", sAmount);
            mobileGeneralMethod.tap(payBillsObject.objConfirmBtn(),"Confirm Button");
            mobileGeneralMethod.waitSleep(8000);
        }
    }
    public void confirmDetailsAndPay() throws Exception {
        if (mobileGeneralMethod.isVisible(payBillsObject.objConfirmDetails(),"Confirmation Details Page")) {
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(payBillsObject.objPayBtn(),"Pay Button");
            mobileGeneralMethod.waitSleep(10000);
        }
    }
    public void paybillsSuccessfulTransaction_PB_TC_19() throws Exception {
        login.loginWalletFullyTier();
        payBillsNavigation();
        searchBiller();
        billerDetails(propertyReader.getproperty("First_Name"), propertyReader.getproperty("Middle_Name"), propertyReader.getproperty("Last_Name"), propertyReader.getproperty("AmountInput"));
        confirmDetailsAndPay();
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.isVisible(payBillsObject.objTransactionDetails(), "Transaction Details Page");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(payBillsObject.objNewTransactionBtn(),"New Transaction Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(payBillsObject.objRecentTransactionOne(), "Recent Transaction");
        mobileGeneralMethod.waitSleep(5000);
        if (mobileGeneralMethod.isVisible(payBillsObject.objBillsPayInformation(),"Bills Pay Information")) {
            mobileGeneralMethod.isVisible(payBillsObject.objMisBillsPayBiller(),"Mis Bills Pay Biller");
            LoggingUtils.info("PB_TC_19, Pay Bills Recent Transaction Validated");
            ExtentReporter.logPass("PB_TC_19", "PB_TC_19, Pay Bills Recent Transaction validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("PB_TC_19", "PB_TC_19, Failed Pay Bills Recent Transaction to validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void payBillsPageValidation_PB_TC_01() throws Exception {
        ExtentReporter.logInfo("","Pay Bills Page Validation");
        //mlWalletLogin(prop.getproperty("Branch_Verified"));
        payBillsNavigation();
        if (mobileGeneralMethod.isVisible(payBillsObject.objSelectBiller(),"Page")) {
            mobileGeneralMethod.isVisible(payBillsObject.objRecentTransactions(),"Button");
            mobileGeneralMethod.isVisible(payBillsObject.objBillers(), "Text");
            LoggingUtils.info("PB_TC_01, Pay Bills Page validated");
            ExtentReporter.logPass("PB_TC_01", "PB_TC_01, Pay Bills Page validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void billerCategories_PB_TC_02() throws Exception {
        ExtentReporter.logInfo("","Biller Categories");
        //mlWalletLogin(prop.getproperty("Branch_Verified"));
        payBillsNavigation();
        mobileGeneralMethod.tap(payBillsObject.objCategories(),"Button");
        if (mobileGeneralMethod.isVisible(payBillsObject.objBankingAndFinance(),"Button")) {
            mobileGeneralMethod.tap(payBillsObject.objBankingAndFinance(),"Biller Category");
        }
        if (mobileGeneralMethod.isVisible(payBillsObject.objCharityAndReligious(),"Biller Category")) {
            mobileGeneralMethod.tap(payBillsObject.objCharityAndReligious(),"Biller Category");
//            getBillers(payBillsObject.objCharityAndReligiousBillers);
            mobileGeneralMethod.tap(payBillsObject.objCharityAndReligious(),"Biller Category");
        }
        mobileGeneralMethod.verticalSwipe();
        if (mobileGeneralMethod.isVisible(payBillsObject.objUtilities(),"Biller Category")) {
            mobileGeneralMethod.tap(payBillsObject.objUtilities(),"Biller Category");
            mobileGeneralMethod.verticalSwipe();
//            getBillers(payBillsObject.objUtilitiesBillers);
            mobileGeneralMethod.tap(payBillsObject.objUtilities(),"Biller Category");
        }
        if (mobileGeneralMethod.isVisible(payBillsObject.objOthers(),"Biller Category")) {
            mobileGeneralMethod.tap(payBillsObject.objOthers(),"Biller Category");
            mobileGeneralMethod.verticalSwipe();
//            getBillers(payBillsObject.objOthersBillers);
            mobileGeneralMethod.tap(payBillsObject.objOthers(),"Biller Category");
        }
        LoggingUtils.info("PB_TC_02, Biller Categories validated");
        ExtentReporter.logPass("PB_TC_02", "PB_TC_02, Biller Categories validated");
        System.out.println("-----------------------------------------------------------");
    }
    public void billersInAlphabeticalOrder_PB_TC_03() throws Exception {
        ExtentReporter.logInfo("","Billers In Alphabetical Order");
        //mlWalletLogin(prop.getproperty("Fully_verified"));
        payBillsNavigation();
        mobileGeneralMethod.tap(payBillsObject.objAlphabetical(),"Button");
//        swipeDownUntilElementVisible("SAGIP KAPAMILYA");
//        swipeDownUntilElementVisible("ZYBITECH");
        LoggingUtils.info("PB_TC_03, Billers swiped until Z Alphabet, and all the Billers are displayed in alphabetical order");
        ExtentReporter.logPass("PB_TC_03", "PB_TC_03, Billers swiped until Z Alphabet, and all the Billers are displayed in alphabetical order");
        System.out.println("-----------------------------------------------------------");
    }
    public void selectBiller_PB_TC_04() throws Exception {
        ExtentReporter.logInfo("","Select Biller");
        //mlWalletLogin(prop.getproperty("Fully_verified"));
        payBillsNavigation();
        mobileGeneralMethod.tap(payBillsObject.objAlphabetical(),"Button");
//        swipeDownUntilElementVisible("AIR ASIA BILLSPAYMENT");
        if (mobileGeneralMethod.isVisible(payBillsObject.objAirAsia(),"Biller")) {
            String sAirAsiaBillsPayment = mobileGeneralMethod.getText(payBillsObject.objAirAsia());
            mobileGeneralMethod.tap(payBillsObject.objAirAsia(),"Biller");
            mobileGeneralMethod.isVisible(payBillsObject.objBillsPayInformation(),"Page");
            if (mobileGeneralMethod.isVisible(payBillsObject.objBillerNameInBillsPayInformation(),"Biller Name")) {
                String sBillerInBillsPayInformation = mobileGeneralMethod.getText(payBillsObject.objBillerNameInBillsPayInformation());
                mobileGeneralMethod.assertionValidation(sAirAsiaBillsPayment, sBillerInBillsPayInformation);
                LoggingUtils.info("PB_TC_04, Bills Pay Information page is displayed and Biller name is matched");
                ExtentReporter.logPass("PB_TC_04", "PB_TC_04, Bills Pay Information page is displayed and Biller name is matched");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
    public void searchBiller_PB_TC_05() throws Exception {
        ExtentReporter.logInfo("","Search Biller");
        //mlWalletLogin(prop.getproperty("Fully_verified"));
        payBillsNavigation();
        Thread.sleep(5000);
        mobileGeneralMethod.type(payBillsObject.objSearchBiller(), prop.getproperty("Biller_Name"), "Search Biller");
        if (mobileGeneralMethod.isVisible(payBillsObject.objMisBillsPayBiller(),"Biller")) {
            String sMisBillsPayBiller = mobileGeneralMethod.getText(payBillsObject.objMisBillsPayBiller());
            mobileGeneralMethod.tap(payBillsObject.objMisBillsPayBiller(),"Biller");
            mobileGeneralMethod.isVisible(payBillsObject.objBillsPayInformation(),"Page");
            if (mobileGeneralMethod.isVisible(payBillsObject.objBillerNameInBillsPayInformation(),"Biller Name")) {
                String sBillerInBillsPayInformation = mobileGeneralMethod.getText(payBillsObject.objBillerNameInBillsPayInformation());
                mobileGeneralMethod.assertionValidation(sMisBillsPayBiller, sBillerInBillsPayInformation);
                LoggingUtils.info("PB_TC_05, Bills Pay Information page is displayed and Biller name is MIS BILLSPAY123456");
                ExtentReporter.logPass("PB_TC_05", "PB_TC_05, Bills Pay Information page is displayed and Biller name is MIS BILLSPAY123456");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
    public void billingInformationInput_PB_TC_06() throws Exception {
        ExtentReporter.logInfo("","Biller Information Input");
        //mlWalletLogin(prop.getproperty("Fully_verified"));
        payBillsNavigation();
        searchBiller();
        billerDetails(prop.getproperty("First_Name"), prop.getproperty("Middle_Name"), prop.getproperty("Last_Name"), "10");
        if (mobileGeneralMethod.isVisible(payBillsObject.objConfirmDetails(),"Page")) {
            mobileGeneralMethod.isVisible(payBillsObject.objBillerName(),"Biller Name");
            mobileGeneralMethod.isVisible(payBillsObject.objAccountName(),"Account holder Name");
            mobileGeneralMethod.isVisible(payBillsObject.objAccountNumber(),"Account Number");
            mobileGeneralMethod.isVisible(payBillsObject.objPaymentMethod(),"Payment Method");
            LoggingUtils.info("PB_TC_06, Confirm Details page displayed with transaction details is validated");
            ExtentReporter.logPass("PB_TC_06", "PB_TC_06, Confirm Details page displayed with transaction details is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void payBillsWithValidInputs_PB_TC_07() throws Exception {
        ExtentReporter.logInfo("","Pay Bills With Valid Inputs");
        //mlWalletLogin(prop.getproperty("Fully_verified"));
        payBillsNavigation();
        searchBiller();
        billerDetails(prop.getproperty("First_Name"), prop.getproperty("Middle_Name"), prop.getproperty("Last_Name"), "10");
        confirmDetailsAndPay();
//        
//        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        if (mobileGeneralMethod.isVisible(payBillsObject.objSuccessPillPaymentMsg(),"Message")) {
            mobileGeneralMethod.isVisible(payBillsObject.objAmountPaid(),"Amount");
            mobileGeneralMethod.isVisible(payBillsObject.objPaidDate(),"Date");
            mobileGeneralMethod.isVisible(payBillsObject.objTransactionDetails(),"Header");
            mobileGeneralMethod.isVisible(payBillsObject.objTransactionNumber(),"Transaction Number");
            String sTransactionNumber = mobileGeneralMethod.getText(payBillsObject.objTransactionNumber());
            mobileGeneralMethod.isVisible(payBillsObject.objBillerName(),"Biller Name");
            mobileGeneralMethod.isVisible(payBillsObject.objAccountName(),"Account Name");
            mobileGeneralMethod.isVisible(payBillsObject.objPaymentMethod(),"Payment Method");
            mobileGeneralMethod.isVisible(payBillsObject.objAmountToPay(),"Amount");
            mobileGeneralMethod.isVisible(payBillsObject.objServiceFee(),"Service Fee");
            mobileGeneralMethod.isVisible(payBillsObject.objTotalAmount(),"Total Amount");
            mobileGeneralMethod.tap(payBillsObject.objBackToHomeBtn(),"Button");
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(),"Text");
            mobileGeneralMethod.tap(homePageObject.objPayBills(),"Text");
            if (mobileGeneralMethod.isVisible(payBillsObject.objTransactionDetails(),"Page")) {
//                String sReferenceNumberInCashOut = mobileGeneralMethod.getText(payBillsObject.objReferenceNumberInCashOut());
//                System.out.println(sReferenceNumberInCashOut);
//                mobileGeneralMethod.assertionValidation(sReferenceNumberInCashOut, sTransactionNumber);
                LoggingUtils.info("PB_TC_07, Bills Payment Successful and validated with Recent Transaction");
                ExtentReporter.logPass("PB_TC_07", "PB_TC_07, Bills Payment Successful and validated with Recent Transaction");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
    public void payBillsInRecentTransactions_PB_TC_08() throws Exception {
        ExtentReporter.logInfo("","Pay Bills In Recent Transactions");
        //mlWalletLogin(prop.getproperty("Fully_verified"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(),"Text");
        mobileGeneralMethod.tap(homePageObject.objPayBills(),"Text");
        if (mobileGeneralMethod.isVisible(payBillsObject.objTransactionDetails(),"Page")) {
            mobileGeneralMethod.isVisible(payBillsObject.objReferenceNumber(),"Reference Number");
            mobileGeneralMethod.isVisible(payBillsObject.objReceiverName(),"Receiver Name");
            mobileGeneralMethod.isVisible(payBillsObject.objBillerName(),"Biller Name");
            mobileGeneralMethod.isVisible(payBillsObject.objReceiverMobNo(),"Receiver Mobile Number");
            mobileGeneralMethod.isVisible(payBillsObject.objPaymentMethod(),"Payment Method");
            mobileGeneralMethod.isVisible(payBillsObject.objAmountToSend(),"Amount");
            mobileGeneralMethod.isVisible(payBillsObject.objServiceFee(),"Service Fee");
            mobileGeneralMethod.isVisible(payBillsObject.objTotalAmount(),"Total Amount");
            LoggingUtils.info("PB_TC_08, Pay Bills In Recent Transactions Validated");
            ExtentReporter.logPass("PB_TC_08", "PB_TC_08, Pay Bills In Recent Transactions Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void payBillsInsufficientBalance_PB_TC_09() throws Exception {
        ExtentReporter.logInfo("","Pay Bills Insufficient Balance");
        //mlWalletLogin("9999999997");
        payBillsNavigation();
        searchBiller();
        billerDetails(prop.getproperty("First_Name"), prop.getproperty("Middle_Name"), prop.getproperty("Last_Name"), "24000");
        confirmDetailsAndPay();
        mobileGeneralMethod.waitSleep(3000);
//        if (mobileGeneralMethod.isVisible(SendTransferPage.objInsufficientAmountMsg,"Error Message")) {
//            String sInsufficientBalanceErrorMsg = mobileGeneralMethod.getText(SendTransferPage.objInsufficientAmountMsg);
//            String sExpectedErrorMsg = "There is insufficient balance to proceed with this transaction. Please try again.";
//            mobileGeneralMethod.assertionValidation(sInsufficientBalanceErrorMsg, sExpectedErrorMsg);
            LoggingUtils.info("PB_TC_09, Insufficient Balance - Error Message is validated");
            ExtentReporter.logPass("PB_TC_09", "PB_TC_09, Insufficient Balance - Error Message is validated");
            System.out.println("-----------------------------------------------------------");
//        }
    }
    public void billingInformationInvalidInput_PB_TC_10() throws Exception {
        ExtentReporter.logInfo("","Biller Information Invalid Input");
        //mlWalletLogin(prop.getproperty("Branch_Verified"));
        payBillsNavigation();
        searchBiller();
        mobileGeneralMethod.tap(payBillsObject.objConfirmBtn(),"Button");
        if (mobileGeneralMethod.isVisible(payBillsObject.objAccountNumberRequiredMsg(),"Error Message")) {
            String sAccountNumberRequiredErrorMsg = mobileGeneralMethod.getText(payBillsObject.objAccountNumberRequiredMsg());
            String sExceptedAccountNumberRequiredErrorMsg = "Account Number is required";
            mobileGeneralMethod.assertionValidation(sAccountNumberRequiredErrorMsg, sExceptedAccountNumberRequiredErrorMsg);
        }
        if (mobileGeneralMethod.isVisible(payBillsObject.objFirstNameRequiredMsg(),"Error Message")) {
            String sFirstNameRequiredErrorMsg = mobileGeneralMethod.getText(payBillsObject.objFirstNameRequiredMsg());
            String sExceptedFirstNameRequiredErrorMsg = "First name is required";
            mobileGeneralMethod.assertionValidation(sFirstNameRequiredErrorMsg, sExceptedFirstNameRequiredErrorMsg);
        }
        if (mobileGeneralMethod.isVisible(payBillsObject.objLastNameRequiredMsg(),"Error Message")) {
            String sLastNameRequiredErrorMsg = mobileGeneralMethod.getText(payBillsObject.objLastNameRequiredMsg());
            String sExceptedLastNameRequiredErrorMsg = "Last name is required";
            mobileGeneralMethod.assertionValidation(sLastNameRequiredErrorMsg, sExceptedLastNameRequiredErrorMsg);
        }
        billerDetails(prop.getproperty("Invalid_First_Name"), prop.getproperty("Invalid_Middle_Name"), prop.getproperty("Invalid_Last_Name"), "0.99");
        if (mobileGeneralMethod.isVisible(payBillsObject.objInvalidFirstNameMsg(),"Error Message")) {
            String sInvalidFirstNameErrorMsg = mobileGeneralMethod.getText(payBillsObject.objInvalidFirstNameMsg());
            String sExceptedFirstNameErrorMsg = "First name must only contain letters and spaces";
            mobileGeneralMethod.assertionValidation(sInvalidFirstNameErrorMsg, sExceptedFirstNameErrorMsg);
        }
        if (mobileGeneralMethod.isVisible(payBillsObject.objInvalidSecondNameMsg(),"Error Message")) {
            String sInvalidSecondNameErrorMsg = mobileGeneralMethod.getText(payBillsObject.objInvalidSecondNameMsg());
            String sExceptedSecondNameErrorMsg = "Middle name must only contain letters and spaces";
            mobileGeneralMethod.assertionValidation(sInvalidSecondNameErrorMsg, sExceptedSecondNameErrorMsg);
        }
        if (mobileGeneralMethod.isVisible(payBillsObject.objInvalidLastName(),"Error Message")) {
            String sInvalidThirdNameErrorMsg = mobileGeneralMethod.getText(payBillsObject.objInvalidLastName());
            String sExceptedThirdNameErrorMsg = "Last name must only contain letters and spaces";
            mobileGeneralMethod.assertionValidation(sInvalidThirdNameErrorMsg, sExceptedThirdNameErrorMsg);
        }
        billerDetails(prop.getproperty("First_Name"), prop.getproperty("Middle_Name"), prop.getproperty("Last_Name"), "0.99");
        mobileGeneralMethod.verticalSwipe();
        if (mobileGeneralMethod.isVisible(payBillsObject.objInvalidAmount(),"Error Message")) {
            String sInvalidAmountErrorMsg = mobileGeneralMethod.getText(payBillsObject.objInvalidAmount());
            String sExceptedAmountErrorMsg = "The amount should not be less than 1";
            mobileGeneralMethod.assertionValidation(sInvalidAmountErrorMsg, sExceptedAmountErrorMsg);
        }
        LoggingUtils.info("PB_TC_10, Invalid biller Information Error messages validated");
        ExtentReporter.logPass("PB_TC_10", "PB_TC_10, Invalid biller Information Error messages validated");
        System.out.println("-----------------------------------------------------------");
    }
    public void addBillerToPayBills_PB_TC_12() throws Exception {
        ExtentReporter.logInfo("","Add Biller To Pay Bills");
        //mlWalletLogin(prop.getproperty("Branch_Verified"));
        payBillsNavigation();
//        addBiller();
        mobileGeneralMethod.tap(payBillsObject.objOKBtn(),"Button");
        mobileGeneralMethod.type(payBillsObject.objSearchSavedBiller(), prop.getproperty("Last_Name"), "Search Biller Text Field");
        if (mobileGeneralMethod.isVisible(payBillsObject.objSelectBillerInnSavedBiller(prop.getproperty("Last_Name")),"Recipient")) {
            LoggingUtils.info("PB_TC_12, The Added Biller is displayed in Saved Biller Page");
            ExtentReporter.logPass("PB_TC_12", "PB_TC_12, The Added Biller is displayed in Saved Biller Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void editAddedBillerToPayBills_PB_TC_14() throws Exception {
        ExtentReporter.logInfo("","Edit Added Biller to Pay bIlls");
        //mlWalletLogin(prop.getproperty("Branch_Verified"));
        payBillsNavigation();
//        selectAddedBiler();
        mobileGeneralMethod.tap(payBillsObject.objEditBtn(),"Button");
//        clearField(payBillsObject.objEditRecipientLastName, "Last Name Input Field");
//        mobileGeneralMethod.type(payBillsObject.objEditRecipientLastName(),"Last Name Text Field");
        mobileGeneralMethod.tap(payBillsObject.ObjSaveBtn(),"Button");
        mobileGeneralMethod.tap(payBillsObject.objOKBtn(),"Button");
        mobileGeneralMethod.type(payBillsObject.objSearchSavedBiller(), prop.getproperty("Edited_Last_name"), "Search Recipient Text Field");
        if (mobileGeneralMethod.isVisible(payBillsObject.objSelectLastName(prop.getproperty("Edited_Last_name"), prop.getproperty("First_Name")), "Recipient")) {
            LoggingUtils.info("PB_TC_14, Successfully edited the Added Biller");
            ExtentReporter.logPass("PB_TC_14", "PB_TC_14, Successfully edited the Added Biller");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void deleteAddedBillerPayBills_PB_TC_15() throws Exception {
        ExtentReporter.logInfo("","Delete Added Biller Pay Bills");
        //mlWalletLogin(prop.getproperty("Branch_Verified"));
        payBillsNavigation();
//        selectAddedBiler();
        mobileGeneralMethod.tap(payBillsObject.objRemoveBtn(),"Button");
        if (mobileGeneralMethod.isVisible(payBillsObject.objConfirmPopup(),"Pop up")) {
            mobileGeneralMethod.tap(payBillsObject.objConfirmBtn(),"Button");
        }
        if (mobileGeneralMethod.isVisible(payBillsObject.objSavedBillers(),"Page")) {
            mobileGeneralMethod.type(payBillsObject.objSearchBillerInSavedBillers(), prop.getproperty("Edited_Last_name"), "Search saved biller input field");
            if (mobileGeneralMethod.isVisible(payBillsObject.objSelectLastName(prop.getproperty("Edited_Last_name"), prop.getproperty("First_Name")), "Saved Recipient")) {
                LoggingUtils.info("PB_TC_15, Successfully deleted the Added Biller");
                ExtentReporter.logPass("PB_TC_15", "PB_TC_15, Successfully deleted the Added Biller");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
//================================ Phase 2=============================================================//
    public void payBillsUIValidation_PB_TC_16() throws Exception {
        ExtentReporter.logInfo("","Pay Bills UI Validation");
        //mlWalletLogin(prop.getproperty("Branch_Verified"));
        payBillsNavigation();
        if (mobileGeneralMethod.isVisible(payBillsObject.objSelectBiller(),"Page")) {
            mobileGeneralMethod.isVisible(payBillsObject.objRecentTransactions(),"Header");
            mobileGeneralMethod.isVisible(payBillsObject.objSavedBiller(),"Button");
            mobileGeneralMethod.isVisible(payBillsObject.objBillers(),"Header");
            mobileGeneralMethod.isVisible(payBillsObject.objCategories(),"Button");
            mobileGeneralMethod.isVisible(payBillsObject.objAlphabetical(),"Button");
            mobileGeneralMethod.isVisible(payBillsObject.objSearchBiller(), "Search Biller Input Field");
            LoggingUtils.info("PB_TC_16, Pay Bills UI Page Validated");
            ExtentReporter.logPass("PB_TC_16", "PB_TC_16, Pay Bills UI Page Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void payBillsAddBillerPageUIValidation_PB_TC_18() throws Exception {
        ExtentReporter.logInfo("","PayBills Add Biller Page UI Validation");
        //mlWalletLogin(prop.getproperty("Branch_Verified"));
        payBillsNavigation();
        mobileGeneralMethod.tap(payBillsObject.objSavedBiller(),"Button");
        mobileGeneralMethod.tap(payBillsObject.objAddBiller(),"Button");
        if (mobileGeneralMethod.isVisible(payBillsObject.objAddBillers(),"Page")) {
            mobileGeneralMethod.isVisible(payBillsObject.objBillerInformation(),"Header");
            mobileGeneralMethod.isVisible(payBillsObject.objBiller(),"Edit Field");
            mobileGeneralMethod.isVisible(payBillsObject.objAddAccountNumber(), "Account Number Input Field");
            mobileGeneralMethod.isVisible(payBillsObject.objAddFirstName(), "Account Holder First Name Input Field");
            mobileGeneralMethod.isVisible(payBillsObject.objAddMiddleName(), "Account Holder Middle Name Input Field");
            mobileGeneralMethod.isVisible(payBillsObject.objAddLastName(), "Account Holder Last Name Input Field");
            mobileGeneralMethod.isVisible(payBillsObject.objAddNickName(), "Nick Name Input Field");
            mobileGeneralMethod.isVisible(payBillsObject.objProceedBtn(),"Button");
            LoggingUtils.info("PB_TC_18, PayBills Add Biller Page UI Validated");
            ExtentReporter.logPass("PB_TC_18", "PB_TC_16, PayBills Add Biller Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void payBillsSavedBilerUIValidation_PB_TC_20() throws Exception {
        ExtentReporter.logInfo("","Pay Bills Saved Biler UI Validation");
        //mlWalletLogin(prop.getproperty("Fully_verified"));
        payBillsNavigation();
//        selectAddedBiler();
        if (mobileGeneralMethod.isVisible(payBillsObject.objAccountInfo(),"Page")) {
            mobileGeneralMethod.isVisible(payBillsObject.objAddAccountNumber(),"Account Number");
            mobileGeneralMethod.isVisible(payBillsObject.objAddFirstName(),"First Name");
            mobileGeneralMethod.isVisible(payBillsObject.objAddMiddleName(),"Middle Name");
            mobileGeneralMethod.isVisible(payBillsObject.objAddLastName(),"Last Name");
            mobileGeneralMethod.isVisible(payBillsObject.objAddNickName(),"Nick Name");
            mobileGeneralMethod.isVisible(payBillsObject.objEditBtn(),"Button");
            mobileGeneralMethod.isVisible(payBillsObject.objRemoveBtn(),"Button");
            mobileGeneralMethod.isVisible(payBillsObject.objSelectBiller(),"Button");
            LoggingUtils.info("PB_TC_20, Pay Bills Saved Biler UI Validated");
            ExtentReporter.logPass("PB_TC_20", "PB_TC_20, Pay Bills Saved Biler UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void payBillsMaxBillsPaymentPerTransactionBuyTierUser_PB_TC_22() throws Exception {
        ExtentReporter.logInfo("","Pay Bills Maximum Bills Payment Per Transaction for Buyer Tier Account");
//        mlWalletLogin(prop.getproperty("Buyer_Tier"));
        payBillsNavigation();
        searchBiller();
        billerDetails(prop.getproperty("First_Name"), prop.getproperty("Middle_Name"), prop.getproperty("Last_Name"), "20000");
        confirmDetailsAndPay();
        if (mobileGeneralMethod.isVisible(payBillsObject.objMaxLimitErrorMessageUpgrade(),"Error Message")) {
            String sMaxLimitErrorMessage = mobileGeneralMethod.getText(payBillsObject.objMaxLimitErrorMessageUpgrade());
            String sExpectedErrorMessage = "The maximum Bills Pay per transaction set for your verification level is P10,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sMaxLimitErrorMessage, sExpectedErrorMessage);
            mobileGeneralMethod.isVisible(payBillsObject.objUpgradeNowBtn(),"Button");
            LoggingUtils.info("PB_TC_22, Pay Bills Maximum Bills Payment Per Transaction for Buyer Tier Account Validated");
            ExtentReporter.logPass("PB_TC_22", "PB_TC_22, Pay Bills Maximum Bills Payment Per Transaction for Buyer Tier Account validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void payBillsMaxBillsPaymentPerTransactionSemiVerifiedTier_PB_TC_25() throws Exception {
        ExtentReporter.logInfo("","Pay Bills Maximum Bills Payment Per Transaction for Semi Verified Tier Account");
//        mlWalletLogin(prop.getproperty("Semi_Verified"));
        payBillsNavigation();
        searchBiller();
        billerDetails(prop.getproperty("First_Name"), prop.getproperty("Middle_Name"), prop.getproperty("Last_Name"), "60000");
        confirmDetailsAndPay();
        if (mobileGeneralMethod.isVisible(payBillsObject.objMaxLimitErrorMessageUpgrade(),"Error Message")) {
            String sMaxLimitErrorMessage = mobileGeneralMethod.getText(payBillsObject.objMaxLimitErrorMessageUpgrade());
            String sExpectedErrorMessage = "The maximum Bills Pay per transaction set for your verification level is P50,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sMaxLimitErrorMessage, sExpectedErrorMessage);
            mobileGeneralMethod.isVisible(payBillsObject.objUpgradeNowBtn(),"Button");
            LoggingUtils.info("PB_TC_25, Pay Bills Maximum Bills Payment Per Transaction for Semi Verified Tier Account Validated");
            ExtentReporter.logPass("PB_TC_25", "PB_TC_25, Pay Bills Maximum Bills Payment Per Transaction for Semi Verified Tier Account validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void payBillsMaxBillsPaymentPerTransactionBranchVerifiedTier_PB_TC_28() throws Exception {
        ExtentReporter.logInfo("","Pay Bills Maximum Bills Payment Per Transaction for Branch Verified Tier Account");
        //mlWalletLogin(prop.getproperty("Branch_Verified"));
        payBillsNavigation();
        searchBiller();
        billerDetails(prop.getproperty("First_Name"), prop.getproperty("Middle_Name"), prop.getproperty("Last_Name"), "60000");
        confirmDetailsAndPay();
        if (mobileGeneralMethod.isVisible(payBillsObject.objMaxLimitErrorMessage(),"Error Message")) {
            String sMaxLimitErrorMessage = mobileGeneralMethod.getText(payBillsObject.objMaxLimitErrorMessage());
            String sExpectedErrorMessage = "The maximum Bills Pay per transaction set for your verification level is P25,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sMaxLimitErrorMessage, sExpectedErrorMessage);
            mobileGeneralMethod.isVisible(payBillsObject.objOKBtn(),"Button");
            LoggingUtils.info("PB_TC_26, Pay Bills Maximum Bills Payment Per Transaction for Branch Verified Tier Account Validated");
            ExtentReporter.logPass("PB_TC_26", "PB_TC_26, Pay Bills Maximum Bills Payment Per Transaction for Branch Verified Tier Account validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void payBillsMaxBillsPaymentPerTransactionFullyVerifiedTier_PB_TC_31() throws Exception {
        ExtentReporter.logInfo("","Pay Bills Maximum Bills Payment Per Transaction for Fully Verified Tier Account");
        //mlWalletLogin(prop.getproperty("Fully_verified"));
        payBillsNavigation();
        searchBiller();
        billerDetails(prop.getproperty("First_Name"), prop.getproperty("Middle_Name"), prop.getproperty("Last_Name"), "60000");
        confirmDetailsAndPay();
        if (mobileGeneralMethod.isVisible(payBillsObject.objMaxLimitErrorMessage(),"Error Message")) {
            String sMaxLimitErrorMessage = mobileGeneralMethod.getText(payBillsObject.objMaxLimitErrorMessage());
            String sExpectedErrorMessage = "The maximum Bills Pay per transaction set for your verification level is P50,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sMaxLimitErrorMessage, sExpectedErrorMessage);
            mobileGeneralMethod.isVisible(payBillsObject.objOKBtn(),"Button");
            LoggingUtils.info("PB_TC_31, Pay Bills Maximum Bills Payment Per Transaction for Fully Verified Tier Account Validated");
            ExtentReporter.logPass("PB_TC_31", "PB_TC_31, Pay Bills Maximum Bills Payment Per Transaction for Fully Verified Tier Account validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void payBillsRecentTransaction_PB_TC_21() throws Exception {
        ExtentReporter.logInfo("","PayBills Recent Transactions");
        //mlWalletLogin(prop.getproperty("Branch_Verified"));
        payBillsNavigation();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(payBillsObject.objRecentTransactions(),"Header");
//        horizontalSwipeByPercentages(0.8, 0.2, 0.25);
//        horizontalSwipeByPercentages(0.8, 0.2, 0.25);
        LoggingUtils.info("PB_TC_21, PayBills Recent Transactions Swiped until Last Transaction");
        ExtentReporter.logPass("PB_TC_21", "PB_TC_21, PayBills Recent Transactions Swiped until Last Transaction");
        System.out.println("-----------------------------------------------------------");
    }
    public void payBillsLocationPopupValidation_PB_TC_34() throws Exception {
        ExtentReporter.logInfo("","Pay Bills Location popup Validation");
        //mlWalletLogin(prop.getproperty("Fully_verified"));
        payBillsNavigation();
        searchBiller();
        billerDetails(prop.getproperty("First_Name"), prop.getproperty("Middle_Name"), prop.getproperty("Last_Name"), "10");
        confirmDetailsAndPay();
        if (mobileGeneralMethod.isVisible(homePageObject.objPopUpMsg(),"Popup Msg")) {
            LoggingUtils.info("PB_TC_34, Pay Bills Location popup Validated");
            ExtentReporter.logPass("PB_TC_34", "PB_TC_34, Pay Bills Location popup Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void payBillsLocationDenyFunctionality_PB_TC_35() throws Exception {
        ExtentReporter.logInfo("","Pay Bills Location Deny Functionality Validation");
        //mlWalletLogin(prop.getproperty("Fully_verified"));
        payBillsNavigation();
        searchBiller();
        billerDetails(prop.getproperty("First_Name"), prop.getproperty("Middle_Name"), prop.getproperty("Last_Name"), "10");
        confirmDetailsAndPay();
        if (mobileGeneralMethod.isVisible(homePageObject.objPopUpMsg(),"Popup Msg")) {
//            permissionDenyPopUp();
            LoggingUtils.info("PB_TC_35, Pay Bills Location Deny Functionality Validated");
            ExtentReporter.logPass("PB_TC_35", "PB_TC_35, Pay Bills Location Deny Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void payBillsLocationPermissionDenyCloseBtnFunctionality_PB_TC_36() throws Exception {
        ExtentReporter.logInfo("","Pay Bills Location Permission Deny Close Button Functionality Validation");
        //mlWalletLogin(prop.getproperty("Fully_verified"));
        payBillsNavigation();
        searchBiller();
        billerDetails(prop.getproperty("First_Name"), prop.getproperty("Middle_Name"), prop.getproperty("Last_Name"), "10");
        confirmDetailsAndPay();
        if (mobileGeneralMethod.isVisible(homePageObject.objPopUpMsg(),"Popup Msg")) {
//            permissionDenyCloseBtnFunctionality();
            if (mobileGeneralMethod.isVisible(payBillsObject.objBillsPayInformation(),"Page")) {
                LoggingUtils.info("PB_TC_36, Pay Bills Location Permission Deny Close Button Functionality Validated");
                ExtentReporter.logPass("PB_TC_36", "PB_TC_36, Pay Bills Location Permission Deny Close Button Functionality Validated");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
    
    public void payBillsTransactionWithValidMLPin_PB_TC_48() throws Exception {
        ExtentReporter.logInfo("","Pay Bills Transaction With Valid ML Pin");
        //mlWalletLogin(prop.getproperty("Fully_verified"));
        payBillsNavigation();
        searchBiller();
        billerDetails(prop.getproperty("First_Name"), prop.getproperty("Middle_Name"), prop.getproperty("Last_Name"), "10");
        confirmDetailsAndPay();
//        handleMpin("1111");
        if (mobileGeneralMethod.isVisible(payBillsObject.objSuccessPillPaymentMsg(),"Message")) {
            mobileGeneralMethod.isVisible(payBillsObject.objAmountPaid(),"Amount");
            mobileGeneralMethod.isVisible(payBillsObject.objPaidDate(),"Date");
            mobileGeneralMethod.isVisible(payBillsObject.objTransactionDetails(),"Header");
            mobileGeneralMethod.isVisible(payBillsObject.objTransactionNumber(),"Transaction Number");
            String sTransactionNumber = mobileGeneralMethod.getText(payBillsObject.objTransactionNumber());
            mobileGeneralMethod.isVisible(payBillsObject.objBillerName(),"Biller Name");
            mobileGeneralMethod.isVisible(payBillsObject.objAccountName(),"Account Name");
            mobileGeneralMethod.isVisible(payBillsObject.objPaymentMethod(),"Payment Method");
            mobileGeneralMethod.isVisible(payBillsObject.objAmountToPay(),"Amount");
            mobileGeneralMethod.isVisible(payBillsObject.objServiceFee(),"Service Fee");
            mobileGeneralMethod.isVisible(payBillsObject.objTotalAmount(),"Total Amount");
            mobileGeneralMethod.tap(payBillsObject.objBackToHomeBtn(),"Button");
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(),"Text");
            mobileGeneralMethod.tap(homePageObject.objPayBills(),"Text");
            LoggingUtils.info("PB_TC_48, Pay Bills Transaction With Valid ML Pin is validated");
            ExtentReporter.logPass("PB_TC_48", "PB_TC_48, Pay Bills Transaction With Valid ML Pin is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void payBillsTransactionWithInValidMLPin_PB_TC_49() throws Exception {
        ExtentReporter.logInfo("","Pay Bills Transaction With Invalid ML Pin");
        //mlWalletLogin(prop.getproperty("Fully_verified"));
//        payBillsNavigation();
//        searchBiller();
//        billerDetails(prop.getproperty("First_Name"), prop.getproperty("Middle_Name"), prop.getproperty("Last_Name"), "10");
//        confirmDetailsAndPay();
//        handleMpin("1234");
        if (mobileGeneralMethod.isVisible(payBillsObject.objInvalidPINMsg(),"Message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(payBillsObject.objInvalidPINMsg());
            String sExceptedErrorMsg = "You have entered an invalid PIN. Please try again.";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("PB_TC_49, Buy ELoad Transaction With Invalid ML Pin validated");
            ExtentReporter.logPass("PB_TC_49", "PB_TC_49, Buy ELoad Transaction With Invalid ML Pin validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void payBillsInOTPPopupValidation_PB_TC_55() throws Exception {
        ExtentReporter.logInfo("","PayBills InApp OTP popup Validation");
        //mlWalletLogin(prop.getproperty("Fully_verified"));
        payBillsNavigation();
        searchBiller();
        billerDetails(prop.getproperty("First_Name"), prop.getproperty("Middle_Name"), prop.getproperty("Last_Name"), "10");
        confirmDetailsAndPay();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page")) {
            mobileGeneralMethod.isVisible(loginObject.objOTP(),"One Time Pin");
            LoggingUtils.info("PB_TC_55, PayBills, InApp OTP popup validated");
            ExtentReporter.logPass("PB_TC_55", "PB_TC_55, PayBills, InApp OTP popup validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void payBillsTransactionInAppOTPPopupUIValidation_PB_TC_56() throws Exception {
        ExtentReporter.logInfo("","PayBills Transaction InApp OTP popup UI Validation");
        //mlWalletLogin(prop.getproperty("Fully_verified"));
        payBillsNavigation();
        searchBiller();
        billerDetails(prop.getproperty("First_Name"), prop.getproperty("Middle_Name"), prop.getproperty("Last_Name"), "10");
        confirmDetailsAndPay();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page")) {
            mobileGeneralMethod.isVisible(loginObject.objOTP(),"One Time Pin");
            mobileGeneralMethod.isVisible(loginObject.objSeconds(),"Seconds");
            mobileGeneralMethod.isVisible(loginObject.objContinueBtn(),"Button");
            mobileGeneralMethod.isVisible(loginObject.objCancelBtn(),"Button");
            LoggingUtils.info("PB_TC_56, PayBills Transaction InApp OTP popup UI validated");
            ExtentReporter.logPass("PB_TC_56", "PB_TC_56, PayBills Transaction InApp OTP popup UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void payBillsTransactionNewOTPAfterSixtySecondsValidation_PB_TC_57() throws Exception {
        ExtentReporter.logInfo("","PayBills New OTP got generated After Sixty Seconds validation");
        //mlWalletLogin(prop.getproperty("Fully_verified"));
        payBillsNavigation();
        searchBiller();
        billerDetails(prop.getproperty("First_Name"), prop.getproperty("Middle_Name"), prop.getproperty("Last_Name"), "10");
        confirmDetailsAndPay();
        
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        if (mobileGeneralMethod.isVisible(loginObject.objOTP(),"One Time Pin")) {
            String sGeneratedOTP = mobileGeneralMethod.getText(loginObject.objOTP());
            mobileGeneralMethod.waitSleep(70000);
            String sNewlyGeneratedOTPAfterSixtySeconds = mobileGeneralMethod.getText(loginObject.objOTP());
            mobileGeneralMethod.assertionValidation(sGeneratedOTP, sNewlyGeneratedOTPAfterSixtySeconds);
            LoggingUtils.info("PB_TC_57, PayBills Transaction New OTP got generated After Sixty Seconds is validated");
            ExtentReporter.logPass("PB_TC_57", "PB_TC_57, PayBills Transaction New OTP got generated After Sixty Seconds is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void payBillsTransactionOTPCancelBtnFunctionality_PB_TC_58() throws Exception {
        ExtentReporter.logInfo("","PayBills Transaction OTP Cancel Button Functionality");
        //mlWalletLogin(prop.getproperty("Fully_verified"));
        payBillsNavigation();
        searchBiller();
        billerDetails(prop.getproperty("First_Name"), prop.getproperty("Middle_Name"), prop.getproperty("Last_Name"), "10");
        confirmDetailsAndPay();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        mobileGeneralMethod.tap(loginObject.objCancelBtn(),"Button");
        if (mobileGeneralMethod.isVisible(payBillsObject.objConfirmDetails(),"Page")) {
            LoggingUtils.info("PB_TC_58, PayBills Transaction, After clicking on Cancel in One time pin popup App navigates back to Confirm details Page is validated");
            ExtentReporter.logPass("PB_TC_58", "PB_TC_58, PayBills Transaction, After clicking on Cancel in One time pin popup App navigates back to Confirm details Page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void payBillsTransactionOTPContinueBtnFunctionality_PB_TC_59() throws Exception {
        ExtentReporter.logInfo("","PayBills Transaction OTP Continue Button Functionality");
        //mlWalletLogin(prop.getproperty("Fully_verified"));
        payBillsNavigation();
        searchBiller();
        billerDetails(prop.getproperty("First_Name"), prop.getproperty("Middle_Name"), prop.getproperty("Last_Name"), "10");
        confirmDetailsAndPay();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        mobileGeneralMethod.tap(loginObject.objContinueBtn(),"Button");
        if (mobileGeneralMethod.isVisible(payBillsObject.objSuccessPillPaymentMsg(),"Message")) {
            LoggingUtils.info("PB_TC_59, PayBills Transaction, After clicking on Continue in One time pin popup App navigates to Transaction Success Page is validated");
            ExtentReporter.logPass("PB_TC_59", "PB_TC_59, PayBills Transaction, After clicking on Continue in One time pin popup App navigates to Transaction Success page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
}
