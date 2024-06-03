package mlwallet.testSteps;

import org.openqa.selenium.NoSuchElementException;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

import java.time.Duration;

public class CashInViaBranch extends Base_Steps{
    public CashInViaBranch(){
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
    public void cashInViaBranchNavigation() throws Exception {
        mobileGeneralMethod.tap(cashInViaBranchObjects.objCashInMenu(), "Cash In");
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objBranchName(), "Cash In Options Page");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objBranchName(), "ML Branch");
    }
    public void cancelPreviousTransactionAndContinue() throws Exception {
        mobileGeneralMethod.waitSleep(3000);
        try {
            if (mobileGeneralMethod.isDisplayed(cashInViaBranchObjects.objCancelTransactionBtn())) {
                mobileGeneralMethod.tap(cashInViaBranchObjects.objCancelTransactionBtn(), "Cancel Transaction button");
                mobileGeneralMethod.tap(cashInViaBranchObjects.objCancelBtn1(), "Cancel Button");
                mobileGeneralMethod.waitSleep(5000);
                mobileGeneralMethod.tap(cashInViaBranchObjects.objBackToHomeBtn(), "Back To Home Button");
                mobileGeneralMethod.waitSleep(3000);
                mobileGeneralMethod.tap(cashInViaBranchObjects.objCashInMenu(), "Cash In");
                mobileGeneralMethod.isVisible(cashInViaBranchObjects.objBranchName(), "Cash In Options Page");
                mobileGeneralMethod.tap(cashInViaBranchObjects.objBranchName(), "ML Branch");
                cashInViaBranchEnterAmount(propertyReader.getproperty("AmountInput"));
                mobileGeneralMethod.waitSleep(3000);
                if(mobileGeneralMethod.isVisible(cashInViaBranchObjects.objContinueButton(),"Continue Button")){
                    mobileGeneralMethod.tap(cashInViaBranchObjects.objContinueButton(),"Continue Button");
                }
            }
        }
        catch (NoSuchElementException e){
            cashInViaBranchEnterAmount(propertyReader.getproperty("AmountInput"));
            mobileGeneralMethod.waitSleep(3000);
            if(mobileGeneralMethod.isVisible(cashInViaBranchObjects.objContinueButton(),"Continue Button")){
                mobileGeneralMethod.tap(cashInViaBranchObjects.objContinueButton(),"Continue Button");
            }
        }
    }
    public void cancelPreviousTransactionAndMaxAmountContinue() throws Exception {
        mobileGeneralMethod.waitSleep(3000);
        try {
            if (mobileGeneralMethod.isDisplayed(cashInViaBranchObjects.objCancelTransactionBtn())) {
                mobileGeneralMethod.tap(cashInViaBranchObjects.objCancelTransactionBtn(), "Cancel Transaction button");
                mobileGeneralMethod.tap(cashInViaBranchObjects.objCancelBtn1(), "Cancel Button");
                mobileGeneralMethod.waitSleep(5000);
                mobileGeneralMethod.tap(cashInViaBranchObjects.objBackToHomeBtn(), "Back To Home Button");
                mobileGeneralMethod.waitSleep(3000);
                mobileGeneralMethod.tap(cashInViaBranchObjects.objCashInMenu(), "Cash In");
                mobileGeneralMethod.isVisible(cashInViaBranchObjects.objBranchName(), "Cash In Options Page");
                mobileGeneralMethod.tap(cashInViaBranchObjects.objBranchName(), "ML Branch");
                cashInViaBranchEnterAmount(propertyReader.getproperty("AmountInvalidCashIn"));
                mobileGeneralMethod.waitSleep(3000);
                if(mobileGeneralMethod.isVisible(cashInViaBranchObjects.objContinueButton(),"Continue Button")){
                    mobileGeneralMethod.tap(cashInViaBranchObjects.objContinueButton(),"Continue Button");
                }
            }
        }
        catch (NoSuchElementException e){
            cashInViaBranchEnterAmount(propertyReader.getproperty("AmountInvalidCashIn"));
            mobileGeneralMethod.waitSleep(3000);
            if(mobileGeneralMethod.isVisible(cashInViaBranchObjects.objContinueButton(),"Continue Button")){
                mobileGeneralMethod.tap(cashInViaBranchObjects.objContinueButton(),"Continue Button");
            }
        }
    }
    public void cancelPreviousTransactionAndInvalidContinue() throws Exception {
        mobileGeneralMethod.waitSleep(3000);
        try {
            if (mobileGeneralMethod.isDisplayed(cashInViaBranchObjects.objCancelTransactionBtn())) {
                mobileGeneralMethod.tap(cashInViaBranchObjects.objCancelTransactionBtn(), "Cancel Transaction button");
                mobileGeneralMethod.tap(cashInViaBranchObjects.objCancelBtn1(), "Cancel Button");
                mobileGeneralMethod.waitSleep(5000);
                mobileGeneralMethod.tap(cashInViaBranchObjects.objBackToHomeBtn(), "Back To Home Button");
                mobileGeneralMethod.waitSleep(3000);
                mobileGeneralMethod.tap(cashInViaBranchObjects.objCashInMenu(), "Cash In");
                mobileGeneralMethod.isVisible(cashInViaBranchObjects.objBranchName(), "Cash In Options Page");
                mobileGeneralMethod.tap(cashInViaBranchObjects.objBranchName(), "ML Branch");
                mobileGeneralMethod.waitSleep(3000);
                cashInViaBranchEnterAmount(propertyReader.getproperty("InvalidAmountInput"));
                mobileGeneralMethod.waitSleep(3000);
            }
        }
        catch (NoSuchElementException e){
            mobileGeneralMethod.waitSleep(3000);
            cashInViaBranchEnterAmount(propertyReader.getproperty("InvalidAmountInput"));
            mobileGeneralMethod.waitSleep(3000);
        }
    }
    public void cancelPreviousTransactionAndEmptyContinue() throws Exception {
        mobileGeneralMethod.waitSleep(3000);
        try {
            if (mobileGeneralMethod.isDisplayed(cashInViaBranchObjects.objCancelTransactionBtn())) {
                mobileGeneralMethod.tap(cashInViaBranchObjects.objCancelTransactionBtn(), "Cancel Transaction button");
                mobileGeneralMethod.tap(cashInViaBranchObjects.objCancelBtn1(), "Cancel Button");
                mobileGeneralMethod.waitSleep(5000);
                mobileGeneralMethod.tap(cashInViaBranchObjects.objBackToHomeBtn(), "Back To Home Button");
                mobileGeneralMethod.waitSleep(3000);
                mobileGeneralMethod.tap(cashInViaBranchObjects.objCashInMenu(), "Cash In");
                mobileGeneralMethod.isVisible(cashInViaBranchObjects.objBranchName(), "Cash In Options Page");
                mobileGeneralMethod.tap(cashInViaBranchObjects.objBranchName(), "ML Branch");
                mobileGeneralMethod.waitSleep(3000);
                mobileGeneralMethod.tap(cashInViaBranchObjects.objNextButton(), "Next Button");
                mobileGeneralMethod.waitSleep(3000);
            }
        }
        catch (NoSuchElementException e){
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.tap(cashInViaBranchObjects.objNextButton(), "Next Button");
            mobileGeneralMethod.waitSleep(3000);
        }
    }
    public void cashInViaBranchEnterAmount(String sAmount) throws Exception {
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(cashInViaBranchObjects.objAmountTextField(),"Amount Text Field", sAmount);
        mobileGeneralMethod.tap(cashInViaBranchObjects.objBranchCashIn(), "Branch Cash In");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objNextButton(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
    }
    public void maxTransactionLimitValidation() throws Exception {
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndMaxAmountContinue();
    }
    //----------------Happy Path
    public void cashInViaBranchSuccessfulTransaction_CIBR_TC_16() throws Exception {
        ExtentReporter.logInfo("CIBR_TC_16","Cash In Via Branch Buyer Tier User");
        login.loginWalletFullyTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInToBranch(),"Header")) {
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objPHP(),"PHP");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCreatedDate(),"Date");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objStatus(),"Status");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objTransactionNo(),"Transaction Number");
            mobileGeneralMethod.tap(cashInViaBranchObjects.objCrossBtn(), "Cash In Branch Cross Button");
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInTransaction(),"Transaction");
            LoggingUtils.info("CIBR_TC_16, Cash In Via Branch Transaction successful for is Validated");
            ExtentReporter.logPass("CIBR_TC_16","Cash In Via Branch Transaction successful is Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("CIBR_TC_16", "Failed Cash In Via Branch Transaction to  Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------------Positive
    public void cashInviaBranch_ValidAmount_Scenario_CIBR_TC_01() throws Exception {
        ExtentReporter.logInfo("CIBR_TC_01","ML_Wallet_Cash_In_Via_Barnch_ValidAmount_Scenario");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInToBranch(),"Header")) {
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objPHP(),"PHP");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCreatedDate(),"Date");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objStatus(),"Status");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objTransactionNo(),"Transaction Number");
            mobileGeneralMethod.tap(cashInViaBranchObjects.objCrossBtn(), "Cash In Branch Cross Button");
            LoggingUtils.info("'CIBR_TC_01', To validate valid Amount in Cash In ML Branch ");
            ExtentReporter.logPass("'CIBR_TC_01", "To validate valid Amount in Cash In ML Branch");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("CIBR_TC_01", "Failed To validate valid Amount in Cash In ML Branch");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------------Negative
    public void cashInViaBranchCancelTransactionScenario_CIBR_TC_02() throws Exception {
        ExtentReporter.logInfo("CIBR_TC_02","ML Wallet Cash In Via Branch Cancel Transaction Scenario");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        mobileGeneralMethod.tap(cashInViaBranchObjects.objCancelTransactionBtn(),"Button");
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCancelTransactionPopup(),"PopUp");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objCancelTransactionBtn(),"Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(cashInViaBranchObjects.objBackToHomeBtn(),"Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInTransaction(),"Transaction")) {
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCancelled(),"Status");
            LoggingUtils.info("'CIBR_TC_02',To validate Cancel Transaction in Cash In ML Branch");
            ExtentReporter.logPass("'CIBR_TC_02", "To validate Cancel Transaction in Cash In ML Branch");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("CIBR_TC_02", "Failed To validate valid Amount in Cash In ML Branch");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------------Negative
    public void cashInviaBranch_Invalid_Amount_CIBR_TC_03() throws Exception {
        ExtentReporter.logInfo("CIBR_TC_03","ML Wallet Cash In via Branch Invalid Amount");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndInvalidContinue();
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objInvalidAmountMsg(),"Error Message")) {
            String sInvalidAmountErrorMsg = mobileGeneralMethod.getText(cashInViaBranchObjects.objInvalidAmountMsg());
            String sExpectedErrorMsg = "The amount should not be less than 1";
            mobileGeneralMethod.assertionValidation(sInvalidAmountErrorMsg, sExpectedErrorMsg);
            LoggingUtils.info("'CIBR_TC_03', 'To validate Invalid Amount");
            ExtentReporter.logPass("CIBR_TC_03", "To validate Invalid Amount");
        }
        else{
            ExtentReporter.logFail("CIBR_TC_03", "Failed To validate Invalid Amount");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------------Negative
    public void cashInViaBranch_Maximum_Limit_Amount_CIBR_TC_04() throws Exception {
        ExtentReporter.logInfo("CIBR_TC_04","ML Wallet Cash In via Branch Maximum Limit Amount");
        login.loginWalletBranchTier();
        maxTransactionLimitValidation();
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objBankMaxLimitTxt(),"Error Message")) {
            String sErrorMsg = mobileGeneralMethod.getText(cashInViaBranchObjects.objBankMaxLimitTxt());
            String sExpectedErrorMsg = "The maximum Branch Cash-in per transaction set for your verification level is P50,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sErrorMsg, sExpectedErrorMsg);

            LoggingUtils.info("'CIBR_TC_04', ML Wallet Cash In via Branch Maximum Limit Amount Validated");
            ExtentReporter.logPass("CIBR_TC_04", "ML Wallet Cash In via Branch Maximum Limit Amount Validated");
        }
        else{
            ExtentReporter.logFail("CIBR_TC_04", "Failed To validate ML Wallet Cash In via Branch Maximum Limit Amount");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------------Negative
    public void cashInViaBRanchInvalidAmount_CIBR_TC_05() throws Exception {
        ExtentReporter.logInfo("CIBR_TC_05","ML Wallet Cash In via Branch Empty Amount Field Validation");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndEmptyContinue();
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objInvalidAmountMsg(),"Error Message")) {
            String sInvalidAmountErrorMsg = mobileGeneralMethod.getText(cashInViaBranchObjects.objInvalidAmountMsg());
            String sExpectedErrorMsg = "Amount is required";
            mobileGeneralMethod.assertionValidation(sInvalidAmountErrorMsg, sExpectedErrorMsg);
            LoggingUtils.info("CIBR_TC_05, Amount is required - Error Message is validated");
            ExtentReporter.logPass("CIBR_TC_05", "Amount is required - Error Message is validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("CIBR_TC_05", "Failed To validate Amount is required - Error Message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------------Positive
    public void cashInViaBranchUIValidation_CIBR_TC_06() throws Exception {
        ExtentReporter.logInfo("CIBR_TC_06","Cash In Via Branch UI Validation");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInMenu(),"Page")) {
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objBranchCashIn(),"Header");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objUserName(),"User Name");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objUserNumber(),"User Number");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objAmountTextField(), "Amount Input Field");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objNextButton(), "Next Button");
            LoggingUtils.info("CIBR_TC_06, Cash In Via Branch UI validated");
            ExtentReporter.logPass("CIBR_TC_06", "Cash In Via Branch UI validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("CIBR_TC_06", "Failed To validate Cash In Via Branch UI");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------------Negative
    public void cashInViaBranchBackBtnValidation_CIBR_TC_07() throws Exception {
        ExtentReporter.logInfo("CIBR_TC_07","Cash In Via Branch Back Btn Validation");
        cashInViaBranchUIValidation_CIBR_TC_06();
        mobileGeneralMethod.tap(cashInViaBranchObjects.objCashInBranchBackBtn(), "Cash In Branch Back Button");
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInMenu(),"Page")) {
            LoggingUtils.info("CIBR_TC_07, Cash In Via Branch Back Btn validated");
            ExtentReporter.logPass("CIBR_TC_07", "Cash In Via Branch Back Btn validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("CIBR_TC_07", "Failed To validate Cash In Via Branch Back Btn");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------------Positive
    public void cashInViaBranchNavigationToHomePageFromQRPage_CIBR_TC_08() throws Exception {
        ExtentReporter.logInfo("CIBR_TC_08","Cash In Via Branch, Navigation to Home Page After clicking on cross button on QR Code Page");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInToBranch(),"Header");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objCrossBtn(), "Cash In Branch Cross Button");
        if (mobileGeneralMethod.isVisible(loginObject.objAvailableBalance(),"Header")) {
            LoggingUtils.info("CIBR_TC_08, Cash In Via Branch, Navigation to Home Page After clicking on cross button on QR Code Page validated");
            ExtentReporter.logPass("CIBR_TC_08", "Cash In Via Branch, Navigation to Home Page After clicking on cross button on QR Code Page validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("CIBR_TC_08", "Failed To validate Navigation to Home Page After clicking on cross button on QR Code Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------------Positive
    public void cashInViaBranchQRCodePageUIValidation_CIBR_TC_09() throws Exception {
        ExtentReporter.logInfo("CIBR_TC_09","Cash In Via Branch QR Code UI Validation");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInToBranch(),"Header")) {
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objQRCode(), "QR Code");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objPHP(),"PHP");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCreatedDate(),"Date");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objStatus(),"Status");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objTransactionNo(),"Transaction Number");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCrossBtn(), "Cash In Branch Cross Button");
            LoggingUtils.info("CIBR_TC_09, Cash In Via Branch QR Code UI validated");
            ExtentReporter.logPass("CIBR_TC_09", "Cash In Via Branch QR Code UI validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("CIBR_TC_09", "Failed To validate Cash In Via Branch QR Code UI");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------------Positive
    public void cashInViaBranchPendingTransaction_CIBR_TC_11() throws Exception {
        ExtentReporter.logInfo("CIBR_TC_11","Cash In Via Branch, If pending transaction Exists, Application directly navigates to previous transaction QR Code");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInToBranch(), "Header")) {
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objPHP(), "PHP");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCreatedDate(),"Date");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objStatus(),"Status");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objTransactionNo(),"Transaction Number");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCrossBtn(), "Cash In Branch Cross Button");
            LoggingUtils.info("CIBR_TC_11, Cash In Via Branch, If pending transaction Exists, Application directly navigates to previous transaction QR Code validated");
            ExtentReporter.logPass("CIBR_TC_11", "Cash In Via Branch, If pending transaction Exists, Application directly navigates to previous transaction QR Code validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("CIBR_TC_11", "Failed To validate Cash In Via Branch, If pending transaction Exists, Application directly navigates to previous transaction QR Code");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------------Positive
    public void cashInViaBranchCancelBtnValidationOnCashInConfirmPopUp_CIBR_TC_12() throws Exception {
        ExtentReporter.logInfo("CIBR_TC_12","Cash In Via Branch Cancel Button validation on CashIn Confirm Popup");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        mobileGeneralMethod.tap(cashInViaBranchObjects.objCancelTransactionBtn(),"Button");
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCancelTransactionPopup(),"PopUp");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objCancelTransactionBtn(),"Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInToBranch(),"Header")) {
            LoggingUtils.info("CIBR_TC_12, Cash In Via Branch, On clicking Cancel Button on CashIn Confirm Popup Application Navigates to CashIn Page with Cancelled Status");
            ExtentReporter.logPass("CIBR_TC_12", "Cash In Via Branch, On clicking Cancel Button on CashIn Confirm Popup Application Navigates to CashIn Page with Cancelled Status");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("CIBR_TC_12", "Failed To validate Cash In Via Branch, On clicking Cancel Button on CashIn Confirm Popup Application Navigates to CashIn Page with Cancelled Status");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void cashInViaBranchTappingOutsideTheCashInConfirmationPopUp_CIBR_TC_13(String sAmount) throws Exception {
        ExtentReporter.logInfo("CIBR_TC_13","Cash In Via Branch, On tapping Outside the CashIn Confirmation Popup");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        cashInViaBranchEnterAmount(sAmount);
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInConfirmationPopup(),"Popup");
        LoggingUtils.info("Clicked OutSide the Dragon Pay Popup");
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInConfirmationPopup(),"Popup")) {
            LoggingUtils.info("CIBR_TC_13, Cash In Via Branch, On tapping Outside the CashIn Confirmation Popup, Popup doesn't closed");
            ExtentReporter.logPass("CIBR_TC_13", "Cash In Via Branch, On tapping Outside the CashIn Confirmation Popup, Popup doesn't closed");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("CIBR_TC_12", "Failed To validate Cash In Via Branch, On clicking Cancel Button on CashIn Confirm Popup Application Navigates to CashIn Page with Cancelled Status");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashInViaBranchGoBackBtnValidationOnCashInConfirmPopUp_CIBR_TC_14() throws Exception {
        ExtentReporter.logInfo("","Cash In Via Branch Go Back Button validation on CashIn Confirm Popup");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        cashInViaBranchEnterAmount("100");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objContinueButton(),"button");
        login.enterOTP();
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInToBranch(),"Header");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objCancelTransactionBtn(),"Button");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objGoBackBtn(),"Button");
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInToBranch(),"Header")) {
            LoggingUtils.info("CIBR_TC_14, Cash In Via Branch, On clicking Go Back Button on CashIn Confirm Popup Application Navigates to CashIn Page with pending Status");
            ExtentReporter.logPass("CIBR_TC_14", "Cash In Via Branch, On clicking Go Back Button on CashIn Confirm Popup Application Navigates to CashIn Page with pending Status");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("CIBR_TC_14", "Failed To validate Cash In Via Branch, On clicking Go Back Button on CashIn Confirm Popup Application Navigates to CashIn Page with pending");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashInViaBankTappingOutsideTheCancelTransactionConfirmationPopup_CIBR_TC_15() throws Exception {
        ExtentReporter.logInfo("","Cash In Via Branch, On tapping Outside the Cancel Transaction Confirmation Popup");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInToBranch(), "Header");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objCancelTransactionBtn(),"Button");
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCancelTransactionPopup(),"PopUp");
        LoggingUtils.info("Clicked OutSide the Dragon Pay Popup");
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCancelTransactionPopup(),"PopUp")) {
            LoggingUtils.info("CIBR_TC_15, Cash In Via Branch, On tapping Outside the Cancel Transaction Confirmation Popup, Popup doesn't closed");
            ExtentReporter.logPass("CIBR_TC_15", "CIBR_TC_15, Cash In Via Branch, On tapping Outside the Cancel Transaction Confirmation Popup, Popup doesn't closed");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void cashInViaBranchSemiVerifiedTierUser_CIBR_TC_17() throws Exception {
        ExtentReporter.logInfo("","Cash In Via Branch Semi verified Tier User");
        login.loginWalletSemiTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        cashInViaBranchEnterAmount("100");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objWarningPopup(),"Pop Up");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objContinueButton(), "Continue Button");
        login.enterOTP();
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInToBranch(),"Header")) {
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objPHP(),"PHP");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCreatedDate(),"Date");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objStatus(),"Status");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objTransactionNo(),"Transaction Number");
            mobileGeneralMethod.tap(cashInViaBranchObjects.objCrossBtn(), "Cash In Branch Cross Button");
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInTransaction(),"Transaction")) {
                mobileGeneralMethod.isVisible(cashInViaBranchObjects.objPending(),"Status");
                LoggingUtils.info("CIBR_TC_17, Cash In Via Branch Semi verified Tier User Validated");
                ExtentReporter.logPass("CIBR_TC_17", "CIBR_TC_17, Cash In Via Branch Semi verified Tier User Validated");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
    public void cashInViaBranchFullyVerifiedTierUser_CIBR_TC_18() throws Exception {
        ExtentReporter.logInfo("","Cash In Via Branch Fully verified Tier User");
        login.loginWalletFullyTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        cashInViaBranchEnterAmount("100");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objWarningPopup(),"Pop Up");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objContinueButton(), "Continue Button");
        login.enterOTP();
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInToBranch(),"Header")) {
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objPHP(),"PHP");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCreatedDate(),"Date");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objStatus(),"Status");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objTransactionNo(),"Transaction Number");
            mobileGeneralMethod.tap(cashInViaBranchObjects.objCrossBtn(), "Cash In Branch Cross Button");
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInTransaction(),"Transaction")) {
                mobileGeneralMethod.isVisible(cashInViaBranchObjects.objPending(),"Status");
                LoggingUtils.info("CIBR_TC_18, Cash In Via Branch Fully verified Tier User Validated");
                ExtentReporter.logPass("CIBR_TC_18", "CIBR_TC_18, Cash In Via Branch Fully verified Tier User Validated");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
    public void cashInViaBranchMaxTransactionBuyerTierUser_CIBR_TC_19() throws Exception {
        ExtentReporter.logInfo("","Cash In Via Branch Max Transaction Buyer Tier User");
        login.loginWalletBuyerTier();
        cashInViaBranchNavigation();
        maxTransactionLimitValidation();
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objBankMaxLimitToUpgrade(),"Error Message")) {
            String sErrorMsg = mobileGeneralMethod.getText(cashInViaBranchObjects.objBankMaxLimitToUpgrade());
            String sExpectedErrorMsg = "The maximum Branch Cash-in per transaction set for your verification level is P20,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sErrorMsg, sExpectedErrorMsg);
            LoggingUtils.info("CIBR_TC_19, Cash In Via Branch Max Transaction Buyer Tier User,Branch CashIn Not Allowed-Error message Validated");
            ExtentReporter.logPass("CIBR_TC_19", "CIBR_TC_19, Cash In Via Branch Max Transaction Buyer Tier User,Branch CashIn Not Allowed-Error message Validated");
        }
    }
    public void cashInViaBranchMaxTransactionSemiVerifiedTierUser_CIBR_TC_20() throws Exception {
        ExtentReporter.logInfo("","Cash In Via Branch Max Transaction Limit Semi-verified Tier User");
        maxTransactionLimitValidation();
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objBankMaxLimitToUpgrade(),"Error Message")) {
            String sErrorMsg = mobileGeneralMethod.getText(cashInViaBranchObjects.objBankMaxLimitToUpgrade());
            String sExpectedErrorMsg = "The maximum Branch Cash-in per transaction set for your verification level is P50,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sErrorMsg, sExpectedErrorMsg);
            LoggingUtils.info("CIBR_TC_20, Cash In Via Branch Max Transaction Limit Semi-verified Tier User Validated");
            ExtentReporter.logPass("CIBR_TC_20", "CIBR_TC_20, Cash In Via Branch Max Transaction Limit Semi-verified Tier User Validated");
        }
    }
    public void cashInViaBranchMaxTransactionFullyVerifiedTierUser_CIBR_TC_21() throws Exception {
        ExtentReporter.logInfo("","Cash In Via Branch Max Transaction Limit Fully-verified Tier User");
        maxTransactionLimitValidation();
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objBankMaxLimitTxt(),"Error Message")) {
            String sErrorMsg = mobileGeneralMethod.getText(cashInViaBranchObjects.objBankMaxLimitTxt());
            String sExpectedErrorMsg = "The maximum Branch Cash-in per transaction set for your verification level is P50,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sErrorMsg, sExpectedErrorMsg);
            LoggingUtils.info("CIBR_TC_21, Cash In Via Branch Max Transaction Limit Fully-verified Tier User Validated");
            ExtentReporter.logPass("CIBR_TC_21", "CIBR_TC_21, Cash In Via Branch Max Transaction Limit Fully-verified Tier User Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashInViaBranchTransactionDetailsUIValidation_CIBR_TC_22() throws Exception {
        ExtentReporter.logInfo("","Cash In Via Branch Transaction Details UI Validation");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        cashInViaBranchEnterAmount("100");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objWarningPopup(),"Pop Up");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objContinueButton(), "Continue Button");
        login.enterOTP();
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInToBranch(),"Header");
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objPHP(),"PHP");
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCreatedDate(),"Date");
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objStatus(),"Status");
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objTransactionNo(),"Transaction Number");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objCrossBtn(), "Cash In Branch Cross Button");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(cashInViaBranchObjects.objCashInTransaction(),"Transaction");
        if (mobileGeneralMethod.isVisible(historyObject.objTransactionDetails(),"Page")) {
            mobileGeneralMethod.isVisible(historyObject.objReferenceNumberInTransactionDetails(),"Reference Number");
            mobileGeneralMethod.isVisible(historyObject.objDate(),"Date");
            mobileGeneralMethod.isVisible(historyObject.objReceiverMobileNo(),"Receiver's Mobile Number");
            mobileGeneralMethod.isVisible(historyObject.objPaymentMethod(),"Payment Method");
            mobileGeneralMethod.isVisible(historyObject.objTransactionType(),"Payment Method");
            mobileGeneralMethod.isVisible(historyObject.objAmount(),"Amount");
            mobileGeneralMethod.isVisible(historyObject.objServiceFee(),"Service Fee");
            mobileGeneralMethod.isVisible(historyObject.objTotalCashIn(),"Total Cash In");
            LoggingUtils.info("CIBR_TC_22,Cash In Via Branch Transaction Details UI Validated");
            ExtentReporter.logPass("CIBR_TC_22", "'CIBR_TC_22',Cash In Via Branch Transaction Details UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashInViaBranchTransactionPendingStatusValidation_CIBR_TC_23() throws Exception {
        ExtentReporter.logInfo("","Cash In Via Branch Transaction Pending status Validation");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        cashInViaBranchEnterAmount("100");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objWarningPopup(), "Pop Up");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objContinueButton(), "Continue Button");
        login.enterOTP();
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInToBranch(),"Header");
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objPHP(),"PHP");
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCreatedDate(),"Date");
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objStatus(),"Status");
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objTransactionNo(),"Transaction Number");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objCrossBtn(), "Cash In Branch Cross Button");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInTransaction(),"Transaction")) {
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objPending(),"Status");
            LoggingUtils.info("CIBR_TC_23,Cash In Via Branch Transaction Pending status Validated");
            ExtentReporter.logPass("CIBR_TC_23", "'CIBR_TC_23',Cash In Via Branch Transaction Pending status Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashInViaBranchTransactionCancelledStatusValidation_CIBR_TC_26() throws Exception {
        ExtentReporter.logInfo("","Cash In Via Branch Transaction Cancelled Status Validation");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cashInViaBranchEnterAmount(propertyReader.getproperty("Amount"));
        mobileGeneralMethod.tap(loginObject.objContinueBtn(), "Continue Button");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objCancelTransactionBtn(), "Cancel Transaction Button");
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCancelTransactionPopup(),  "PopUp");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objCancelTransactionBtn(),  "Cancel Transaction Button");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objBackToHomeBtn(), "Button");
        mobileGeneralMethod.verticalSwipeDown();
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInTransaction(),"Transaction")) {
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCancelled(),"Status");
            LoggingUtils.info("'CIBR_TC_26',Cash In Via Branch Transaction Cancelled Status Validated");
            ExtentReporter.logPass("'CIBR_TC_26", "'CIBR_TC_26', Cash In Via Branch Transaction Cancelled Status Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashInViaBranchAmountFieldValidation_CIBR_TC_42() throws Exception {
        ExtentReporter.logInfo("","Cash In Via Branch, Amount Field with more than 2 decimals Validation");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        cashInViaBranchEnterAmount("100.123");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objInvalidAmountMsg(),"Pop Message")) {
            String sMinimumTransactionPopupMsg = mobileGeneralMethod.getText(cashInViaBranchObjects.objInvalidAmountMsg());
            String sExpectedPopupMsg = "The amount must be limited to 2 decimal places";
            mobileGeneralMethod.assertionValidation(sMinimumTransactionPopupMsg, sExpectedPopupMsg);
            LoggingUtils.info("CIBR_TC_42, Cash In Via Branch, Amount Field with more than 2 decimals Error Msg validated");
            ExtentReporter.logPass("CIBR_TC_42", "CIBR_TC_42, Cash In Via Branch, Amount Field with more than 2 decimals Error Msg validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashInViaBranchTransactionWithValidMLPin_CIBR_TC_43() throws Exception {
        ExtentReporter.logInfo("","Cash In Via Branch Transaction With Valid ML Pin");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        cashInViaBranchEnterAmount("100");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objWarningPopup(),"Pop Up");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objContinueButton(), "Continue Button");
        handleMpin("1111");
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInToBranch(),"Header")) {
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objPHP(),"PHP");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCreatedDate(),"Date");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objStatus(),"Status");
            mobileGeneralMethod.isVisible(cashInViaBranchObjects.objTransactionNo(),"Transaction Number");
            mobileGeneralMethod.tap(cashInViaBranchObjects.objCrossBtn(), "Cash In Branch Cross Button");
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInTransaction(),"Transaction")) {
                mobileGeneralMethod.isVisible(cashInViaBranchObjects.objPending(),"Status");
                LoggingUtils.info("'CIBR_TC_43', Cash In Via Branch Transaction With Valid ML Pin validated");
                ExtentReporter.logPass("'CIBR_TC_43", "'CIBR_TC_43', Cash In Via Branch Transaction With Valid ML Pin validated");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
    public void cashInViaBranchTransactionWithInValidMLPin_CIBR_TC_44() throws Exception {
        ExtentReporter.logInfo("","Cash In Via Branch Transaction With InValid ML Pin");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        cashInViaBranchEnterAmount("100");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objWarningPopup(),"Pop Up");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objContinueButton(), "Continue Button");
        handleMpin("1234");
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objInvalidPINMsg(),"Message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(cashInViaBranchObjects.objInvalidPINMsg());
            String sExceptedErrorMsg = "You have entered an invalid PIN. Please try again.";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("CIBR_TC_44, Cash In Via Branch Transaction With Invalid ML Pin validated");
            ExtentReporter.logPass("CIBR_TC_44", "CIBR_TC_44, Cash In Via Branch Transaction With Invalid ML Pin validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashInViaBranchOTPPopupValidation_CIBR_TC_50() throws Exception {
        ExtentReporter.logInfo("","Cash In Via Branch OTP Popup validation");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        cashInViaBranchEnterAmount("100");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objWarningPopup(),"Pop Up");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objContinueButton(), "Continue Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page")) {
            mobileGeneralMethod.isVisible(loginObject.objOTP(),"One Time Pin");
            LoggingUtils.info("CIBR_TC_50, Cash In Via Branch, InApp OTP popup validated");
            ExtentReporter.logPass("CIBR_TC_50", "CIBR_TC_50, Cash In Via Branch, InApp OTP popup validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashInViaBranchTransactionInAppOTPPopupUIValidation_CIBR_TC_51() throws Exception {
        ExtentReporter.logInfo("","Cash In Via Branch Transaction InApp OTP Popup validation");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        cashInViaBranchEnterAmount("100");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objWarningPopup(),"Pop Up");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objContinueButton(), "Continue Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page")) {
            mobileGeneralMethod.isVisible(loginObject.objOTP(),"One Time Pin");
            mobileGeneralMethod.isVisible(loginObject.objContinueBtn(), "Button");
            mobileGeneralMethod.isVisible(loginObject.objCancelBtn(), "Button");
            LoggingUtils.info("CIBR_TC_51, Cash In Via Branch Transaction InApp OTP Popup validated");
            ExtentReporter.logPass("CIBR_TC_51", "CIBR_TC_51, Cash In Via Branch Transaction InApp OTP Popup validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashInViaBranchTransactionNewOTPAfterSixtySecondsValidation_CIBR_TC_52() throws Exception {
        ExtentReporter.logInfo("","Cash In Via Branch Transaction New OTP got generated After Sixty Seconds validation");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        cashInViaBranchEnterAmount("100");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objWarningPopup(),"Pop Up");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objContinueButton(), "Continue Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        if (mobileGeneralMethod.isVisible(loginObject.objOTP(),"One Time Pin")) {
            String sGeneratedOTP = mobileGeneralMethod.getText(loginObject.objOTP());
            int sFirstOTP = Integer.parseInt(sGeneratedOTP);
            mobileGeneralMethod.waitSleep(70000);
            String sNewlyGeneratedOTPAfterSixtySeconds = mobileGeneralMethod.getText(loginObject.objOTP());
            int sSecondOTP = Integer.parseInt(sNewlyGeneratedOTPAfterSixtySeconds);
            mobileGeneralMethod.assertionNotEqualValidation(sFirstOTP, sSecondOTP);
            LoggingUtils.info("CIBR_TC_52, Cash In Via Branch Transaction New OTP got generated After Sixty Seconds is validated");
            ExtentReporter.logPass("CIBR_TC_52", "CIBR_TC_52, Cash In Via Branch Transaction New OTP got generated After Sixty Seconds is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashInViaBranchTransactionOTPCancelBtnFunctionality_CIBR_TC_53() throws Exception {
        ExtentReporter.logInfo("","Cash In Via Branch Transaction OTP Cancel Button Functionality");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        cashInViaBranchEnterAmount("100");
        mobileGeneralMethod.tap(loginObject.objCancelBtn(), "Cancel Button");
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objBranchCashIn(),"Page")) {
            LoggingUtils.info("CIBR_TC_53, Cash In Via Branch Transaction, After clicking on Cancel in One time pin popup App navigates back to Branch cash In Page is validated");
            ExtentReporter.logPass("CIBR_TC_53", "CIBR_TC_53, Cash In Via Branch Transaction, After clicking on Cancel in One time pin popup App navigates back to Branch cash In Page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashInViaBranchOTPContinueBtnFunctionality_CIBR_TC_54() throws Exception {
        ExtentReporter.logInfo("","Cash In Via Branch Transaction OTP Continue Button Functionality");
        login.loginWalletBranchTier();
        cashInViaBranchNavigation();
        cancelPreviousTransactionAndContinue();
        cashInViaBranchEnterAmount("100");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(cashInViaBranchObjects.objWarningPopup(),"Pop Up");
        mobileGeneralMethod.tap(cashInViaBranchObjects.objContinueButton(), "Continue Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        mobileGeneralMethod.tap(loginObject.objContinueBtn(),"Button");
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objCashInToBranch(),"Page")) {
            LoggingUtils.info("CIBR_TC_54, Cash In Via Branch Transaction, After clicking on Continue in One time pin popup App navigates to Cash In To Branch Page is validated");
            ExtentReporter.logPass("CIBR_TC_54", "CIBR_TC_54, Cash In Via Branch Transaction, After clicking on Continue in One time pin popup App navigates to Cash In To Branch page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
}
