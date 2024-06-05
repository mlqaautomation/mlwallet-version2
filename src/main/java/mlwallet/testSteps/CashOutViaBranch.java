package mlwallet.testSteps;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

import java.time.Duration;
public class CashOutViaBranch extends Base_Steps{
    public CashOutViaBranch(){
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
    public void enterAmountMLBranch(String nAmount) throws Exception {
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objToAnyMLBranch(),"Button")) {
            mobileGeneralMethod.tap(cashOutViaBranchObjects.objToAnyMLBranch(),"Button");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page");
            mobileGeneralMethod.type(cashOutViaBranchObjects.objAmountField(),"Amount to Send", nAmount);
            mobileGeneralMethod.tap(cashOutViaBranchObjects.objNextBtn(),"Button");
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.tap(cashOutViaBranchObjects.objContinueBtn(),"Button");
            Thread.sleep(1000);
        }
    }
    //----------Happy Path
    public void cashOutViaBranchSuccessfulTransaction_WM_TC_05() throws Exception {
        ExtentReporter.logInfo("WM_TC_05","Cash Out Withdraw Branch");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch(propertyReader.getproperty("AmountInput"));
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page" )) {
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCreatedDate(),"Date");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objReferenceNumber(),"Reference Number");
            String nReference = mobileGeneralMethod.getText(cashOutViaBranchObjects.objReferenceNumber());
            System.out.println(nReference);
            String sReferenceNumber = nReference.substring(5, 16);
            System.out.println(sReferenceNumber);
            mobileGeneralMethod.tap(cashOutViaBranchObjects.objBackToHomeBtn(),"Button");
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(),"Text");
            mobileGeneralMethod.tap(homePageObject.objCashOutButton(),"Text");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objTransactionDetails(),"Page");
            String sReferenceNumberInCashOut = mobileGeneralMethod.getText(cashOutViaBranchObjects.objReferenceNumberInCashOut());
            System.out.println(sReferenceNumberInCashOut);
            mobileGeneralMethod.assertionValidation(sReferenceNumberInCashOut, sReferenceNumber);
            LoggingUtils.info("WM_TC_05, Successfully Withdraw Money to ML Branch");
            ExtentReporter.logPass("WM_TC_05", "Successfully Withdraw Money to ML Branch");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("CIBR_TC_16", "Failed Withdraw Money to ML Branch to  Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Negative
    public void cashOutMaxLimit_WM_TC_06() throws Exception {
        ExtentReporter.logInfo("WM_TC_06","Cash Out Withdraw Branch");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch(propertyReader.getproperty("AmountInvalidBranchCashOut"));
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objMaxLimitTxt(),"Text Message")) {
            String sMaxLimitTxt = mobileGeneralMethod.getText(cashOutViaBranchObjects.objMaxLimitTxt());
            String ExpectedTxt = "The maximum Branch Cash-out per transaction set for your verification level is P40,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sMaxLimitTxt, ExpectedTxt);
            LoggingUtils.info("WM_TC_06, The supplied amount us less than the required minimum transaction limit. Error Message is Validated");
            ExtentReporter.logPass("WM_TC_06", "The supplied amount us less than the required minimum transaction limit. Error Message is Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_06", "Failed The supplied amount us less than the required minimum transaction limit. Error Message to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Negative
    public void cashOutInsufficientBalance_WM_TC_07() throws Exception {
        ExtentReporter.logInfo("WM_TC_07","Cash Out Insufficient Balance");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch(propertyReader.getproperty("AmountInsuffCashOut"));
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objInsufficientBalance(),"Text Message")) {
            String sInsufficientBalancePopupTxt = mobileGeneralMethod.getText(cashOutViaBranchObjects.objInsufficientBalance());
            String ExpectedTxt = "There is insufficient balance on your account to proceed with this transaction. Please try again.";
            mobileGeneralMethod.assertionValidation(sInsufficientBalancePopupTxt, ExpectedTxt);
            LoggingUtils.info("WM_TC_07, Insufficient Balance pop up validated");
            ExtentReporter.logPass("WM_TC_07", "Insufficient Balance pop up validated");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_07", "Failed Insufficient Balance pop up to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Negative
    public void cashOutBranchMaximumTransactionSemiVerifiedTier_WM_TC_08() throws Exception { //
        ExtentReporter.logInfo("WM_TC_08","CashOut Branch Maximum Transaction Semi Verified Tier");
        login.loginWalletSemiTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch(propertyReader.getproperty("AmountInvalidSemiCashOut"));
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objMaxLimitTxt(),"Text Message")) {
            String sInsufficientBalancePopupTxt = mobileGeneralMethod.getText(cashOutViaBranchObjects.objMaxLimitTxt());
            String ExpectedTxt = "The maximum Branch Cash-out per transaction set for your verification level is P5,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sInsufficientBalancePopupTxt, ExpectedTxt);
            LoggingUtils.info("WM_TC_08, The Maximum Branch Cash-out per transaction Msg for Semi-verified tier Account is Validated");
            ExtentReporter.logPass("WM_TC_08", "The Maximum Branch Cash-out per transaction Msg for Semi-verified tier Account is Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_08", "Failed Maximum Branch Cash-out per transaction Msg for Semi-verified tier Account to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Negative
    public void cashOutBuyerTierLevelAcc_WM_TC_09() throws Exception {
        ExtentReporter.logInfo("WM_TC_09","Cash Out Withdraw Branch");
        login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch(propertyReader.getproperty("AmountInput"));
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objMaxLimitUpgrade(),"Text Message")) {
            String sErrorMessage = mobileGeneralMethod.getText(cashOutViaBranchObjects.objMaxLimitUpgrade());
            String ExpectedTxt = "Branch Cash-out is not allowed for customers at this verification level. Please upgrade your account to use this service.";
            mobileGeneralMethod.assertionValidation(sErrorMessage, ExpectedTxt);
            LoggingUtils.info("WM_TC_09, Branch Cash-out is not allowed for customers at this verification level. Error Message is Validated");
            ExtentReporter.logPass("WM_TC_09", "Branch Cash-out is not allowed for customers at this verification level. Error Message is Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_09", "Failed Branch Cash-out is not allowed for customers at this verification level. Error Message to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //=================================== Cash Out Phase2==================================================//
    //---------Positive
    public void cashOutUIValidation_WM_TC_16() throws Exception {
        ExtentReporter.logInfo("WM_TC_16","Cash Out Page UI Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutWithdraw(),"Page")) {
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutOptions(),"Header");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objToAnyBank(),"Option");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objToAnyMLBranch(),"Option");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutOngoingTransaction(),"Header");
            LoggingUtils.info("WM_TC_16, Cash Out Page UI Validation");
            ExtentReporter.logPass("WM_TC_16", "Cash Out Page UI Validation");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_16", "Failed Cash Out Page UI to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Negative
    public void cashOutWithdrawBackBtnValidation_WM_TC_17() throws Exception {
        ExtentReporter.logInfo("WM_TC_17","Cash Out Page back arrow Button Validation");
        cashOutUIValidation_WM_TC_16();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.cashOutBackArrowBtn(), "Cash Out Page Back Arrow Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(loginObject.objAvailableBalance(),"Text")) {
            LoggingUtils.info("WM_TC_17, Cash Out Page back arrow Button Validation");
            ExtentReporter.logPass("WM_TC_17", "Cash Out Page back arrow Button Validation");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_17", "Failed Cash Out Page back arrow Button to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Positive
    public void cashOutToBranchUIValidation_WM_TC_18() throws Exception {
        ExtentReporter.logInfo("WM_TC_18","Cash Out To Branch UI Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objToAnyMLBranch(),"Button");
        mobileGeneralMethod.waitSleep(6000);
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutPage(),"Page")) {
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.ObjCashOutToBranch(),"Header");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objUserName(),"User Name");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objUserMobileNumber(),"User Mobile Number");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objMLWalletBalance(),"Balance");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutInstructions(), "Instructions Icon");
            LoggingUtils.info("WM_TC_18, Cash Out to Branch Page Validation");
            ExtentReporter.logPass("WM_TC_18", "Cash Out to Branch Page Validation");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_18", "Failed Cash Out to Branch Page to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Negative
    public void cashOutToBranchBackBtnValidation_WM_TC_19() throws Exception {
        ExtentReporter.logInfo("WM_TC_19","Cash Out To Branch Page back arrow Button Validation");
        cashOutToBranchUIValidation_WM_TC_18();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOutToBranchBackBtn(), "Cash Out Page Back Arrow Button");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutWithdraw(),"Page")) {
            LoggingUtils.info("WM_TC_19, Cash Out To Branch Page back arrow Button Validation");
            ExtentReporter.logPass("WM_TC_19", "Cash Out To Branch Page back arrow Button Validation");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_19", "Failed Cash Out To Branch Page back arrow Button to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Positive
    public void cashOutMlBranchQRPageUIValidation_WM_TC_22() throws Exception {
        ExtentReporter.logInfo("WM_TC_22","CashOut ML Branch QR Code Page UI Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch(propertyReader.getproperty("AmountInput"));
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page")) {
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCreatedDate(),"Date");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objReferenceNumber(),"Reference Number");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objPHP(),"Amount");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objBackToHomeBtn(),"Button");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objNewTransaction(),"Button");
            LoggingUtils.info("WM_TC_22, CashOut ML Branch QR Code Page UI Validation");
            ExtentReporter.logPass("WM_TC_22", "CashOut ML Branch QR Code Page UI Validation");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_22", "Failed CashOut ML Branch QR Code Page UI to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Negative
    public void cashOutCancelIconValidation_WM_TC_23() throws Exception {
        ExtentReporter.logInfo("WM_TC_23","Cash Out Cancel Icon Validation");
        cashOutMlBranchQRPageUIValidation_WM_TC_22();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCancelIcon(), "Cancel Icon");
        if (mobileGeneralMethod.isVisible(loginObject.objAvailableBalance(),"Text")) {
            LoggingUtils.info("WM_TC_23, Cash Out Cancel Icon Validated");
            ExtentReporter.logPass("WM_TC_23", "Cash Out Cancel Icon Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_23", "Failed Cash Out Cancel Icon to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Positive
    public void cashOutMLBranchSemiVerifiedTier_WM_TC_31() throws Exception {
        ExtentReporter.logInfo("WM_TC_31","Cash In Branch Semi-Verified Tier");
        login.loginWalletSemiTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch(propertyReader.getproperty("AmountInput"));
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCreatedDate(),"Date");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objReferenceNumber(),"Reference Number");
        String nReference = mobileGeneralMethod.getText(cashOutViaBranchObjects.objReferenceNumber());
        System.out.println(nReference);
        String sReferenceNumber = nReference.substring(5, 16);
        System.out.println(sReferenceNumber);
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objBackToHomeBtn(),"Button");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(),"Text");
        mobileGeneralMethod.tap(homePageObject.objCashOutButton(),"Text");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objTransactionDetails(),"Page")) {
            String sReferenceNumberInCashOut = mobileGeneralMethod.getText(cashOutViaBranchObjects.objReferenceNumberInCashOut());
            System.out.println(sReferenceNumberInCashOut);
            mobileGeneralMethod.assertionValidation(sReferenceNumberInCashOut, sReferenceNumber);
            LoggingUtils.info("Reference Number is matching with recent Transaction");
            LoggingUtils.info("WM_TC_31, Successfully Withdraw Money to ML Branch for Semi-verified Tier Account");
            ExtentReporter.logPass("WM_TC_31", "Successfully Withdraw Money to ML Branch for Semi-verified Tier Account");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_23", "Failed Withdraw Money to ML Branch for Semi-verified Tier Account to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Positive
    public void cashOutMLBranchFullyVerifiedTier_WM_TC_32() throws Exception {
        ExtentReporter.logInfo("WM_TC_32","Cash In Branch Fully-Verified Tier");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch(propertyReader.getproperty("AmountInput"));
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCreatedDate(),"Date");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objReferenceNumber(),"Reference Number");
        String nReference = mobileGeneralMethod.getText(cashOutViaBranchObjects.objReferenceNumber());
        System.out.println(nReference);
        String sReferenceNumber = nReference.substring(5, 16);
        System.out.println(sReferenceNumber);
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objBackToHomeBtn(),"Button");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(),"Text");
        mobileGeneralMethod.tap(homePageObject.objCashOutButton(),"Text");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objTransactionDetails(),"Page")) {
            String sReferenceNumberInCashOut = mobileGeneralMethod.getText(cashOutViaBranchObjects.objReferenceNumberInCashOut());
            System.out.println(sReferenceNumberInCashOut);
            mobileGeneralMethod.assertionValidation(sReferenceNumberInCashOut, sReferenceNumber);
            LoggingUtils.info("Reference Number is matching with recent Transaction");
            LoggingUtils.info("WM_TC_32, Successfully Withdraw Money to ML Branch for Fully-Verified Tier Account");
            ExtentReporter.logPass("WM_TC_32", "Successfully Withdraw Money to ML Branch for Fully-Verified Tier Account");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_32", "Failed Withdraw Money to ML Branch for Fully-Verified Tier Account to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Negative
    public void cashOutMLBranchMaxLimitFullyVerifiedTier_WM_TC_42() throws Exception {
        ExtentReporter.logInfo("WM_TC_42","CashOut ML Branch Maximum Limit For Fully-verified Tier");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch(propertyReader.getproperty("AmountInvalidFullyCashOut"));
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objBankMaxLimitTxt(),"Error Message")) {
            String sErrorMsg = mobileGeneralMethod.getText(cashOutViaBranchObjects.objBankMaxLimitTxt());
            String sExpectedErrorMsg = "The maximum Branch Cash-out per transaction set for your verification level is P40,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sErrorMsg, sExpectedErrorMsg);
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objGotItBtn(),"Button");
            LoggingUtils.info("WM_TC_42, The Maximum Branch Cash-out per transaction Msg for Fully-verified tier Account is Validated");
            ExtentReporter.logPass("WM_TC_42", "The Maximum Bank Cash-out per transaction Msg for Fully-verified tier Account is Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_32", "Failed The Maximum Bank Cash-out per transaction Msg for Fully-verified tier Account to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Positive
    public void cashOutMLBranchBackToHomeBtnValidation_WM_TC_54() throws Exception {
        ExtentReporter.logInfo("WM_TC_54","CashOut ML Branch Back To Home Button Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch(propertyReader.getproperty("AmountInput"));
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCreatedDate(),"Date");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objReferenceNumber(),"Reference Number");
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objBackToHomeBtn(),"Button");
        if (mobileGeneralMethod.isVisible(loginObject.objAvailableBalance(),"Text")) {
            LoggingUtils.info("WM_TC_54, CashOut ML Branch, After Clicking On Back To Home Button Application Navigated to Home page Validated");
            ExtentReporter.logPass("WM_TC_54", "CashOut ML Branch, After Clicking On Back To Home Button Application Navigated to Home page Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_32", "Failed CashOut ML Branch, After Clicking On Back To Home Button Application Navigated Home page to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Positive
    public void cashOutMLBranchNewTransactionBtnValidation_WM_TC_55() throws Exception {
        ExtentReporter.logInfo("WM_TC_55","CashOut ML Branch New Transaction Button Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch(propertyReader.getproperty("AmountInput"));
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCreatedDate(),"Date");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objReferenceNumber(),"Reference Number");
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objNewTransaction(),"Button");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutWithdraw(),"Page")) {
            LoggingUtils.info("WM_TC_55, CashOut ML Branch, After Clicking On New Transaction Button Application Navigated to CashOut/WithDraw Page Validated");
            ExtentReporter.logPass("WM_TC_55", "CashOut ML Branch, After Clicking On New Transaction Button Application Navigated to CashOut/WithDraw Page Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_55", "Failed CashOut ML Branch, After Clicking On New Transaction Button Application Navigated to CashOut/WithDraw Page to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Positive
    public void cashOutMLBranchOTPPageUiValidation_WM_TC_60() throws Exception {
        ExtentReporter.logInfo("WM_TC_60","CashOut/WithDraw ML Branch OTP Page UI Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch(propertyReader.getproperty("AmountInput"));
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page")) {
            mobileGeneralMethod.isVisible(loginObject.objOTP(),"One Time Pin");
            mobileGeneralMethod.isVisible(loginObject.objContinueBtn(),"Button");
            mobileGeneralMethod.isVisible(loginObject.objCancelBtn(),"Button");
            LoggingUtils.info("WM_TC_60, CashOut/WithDraw ML Branch OTP Page UI Validated");
            ExtentReporter.logPass("WM_TC_60", "CashOut/WithDraw ML Branch OTP Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_60", "Failed CashOut/WithDraw ML Branch OTP Page UI to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Positive
    public void cashOutMLBranchTransactionDetailsUIValidation_WM_TC_61() throws Exception {
        ExtentReporter.logInfo("WM_TC_61","CashOut/WithDraw ML Branch Transaction Details UI Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch(propertyReader.getproperty("AmountInput"));
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCreatedDate(),"Date");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objReferenceNumber(),"Reference Number");
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objBackToHomeBtn(),"Button");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(),"Text");
        mobileGeneralMethod.tap(homePageObject.objCashOutButton(),"Text");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objTransactionDetails(),"Page")) {
            mobileGeneralMethod.isVisible(historyObject.objReferenceNumberInTransactionDetails(),"Reference Number");
            mobileGeneralMethod.isVisible(historyObject.objDate(),"Date");
            mobileGeneralMethod.isVisible(historyObject.objReceiverName(),"Receiver Name");
            mobileGeneralMethod.isVisible(historyObject.objReceiverMobileNo(),"Receiver's Mobile Number");
            mobileGeneralMethod.isVisible(historyObject.objPaymentMethod(),"Payment Method");
            mobileGeneralMethod.isVisible(historyObject.objTransactionType(),"Payment Method");
            mobileGeneralMethod.isVisible(historyObject.objAmount(),"Amount");
            mobileGeneralMethod.isVisible(historyObject.objServiceFee(),"Service Fee");
            mobileGeneralMethod.isVisible(historyObject.objTotalCashOut(),"Total Cash Out");
            LoggingUtils.info("WM_TC_61, CashOut/WithDraw ML Branch Transaction Details UI Validated");
            ExtentReporter.logPass("WM_TC_61", "CashOut/WithDraw ML Branch Transaction Details UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_61", "Failed CashOut/WithDraw ML Branch Transaction Details UI to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void enterAmountBank(String sAmount) throws Exception {
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objAmountField(), "Bank Cash Out Amount Field")) {
            mobileGeneralMethod.type(cashOutViaBranchObjects.objAmountField(), sAmount, "Amount to Send");
            mobileGeneralMethod.tap(cashOutViaBranchObjects.objNextBtn(),"Button");
            mobileGeneralMethod.waitSleep(1000);
            String sDragonPopUpMsg = mobileGeneralMethod.getText(cashOutViaBranchObjects.objDragonPayPopUpMsg());
            String sExpectedMsg = "Dragon Pay charges a fee of 35.00 pesos for this transaction. Do you wish to continue with your transaction?";
            mobileGeneralMethod.assertionValidation(sDragonPopUpMsg, sExpectedMsg);
            mobileGeneralMethod.tap(cashOutViaBranchObjects.objContinueBtn(),"Button");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(cashOutViaBranchObjects.objNextBtn(),"Button");
        }
    }
    public void enterBankDetails(String sAccountNumber) throws Exception {
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objBankInformation(),"Page")) {
            mobileGeneralMethod.type(cashOutViaBranchObjects.objAccountNumberField(), sAccountNumber, "Account Number Field");
            mobileGeneralMethod.type(cashOutViaBranchObjects.objFirstname(), propertyReader.getproperty("First_Name"), "Account Holder First Name");
            mobileGeneralMethod.type(cashOutViaBranchObjects.objMiddleName(), propertyReader.getproperty("Middle_Name"), "Account Holder Middle Name");
            mobileGeneralMethod.tap(cashOutViaBranchObjects.objCheckBox(), "Check Box");
            mobileGeneralMethod.type(cashOutViaBranchObjects.objLastName(), propertyReader.getproperty("Last_Name"), "Account Holder Last Name");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.type(cashOutViaBranchObjects.objEmailAddress(), propertyReader.getproperty("Email"), "Account Holder Email Address");
            mobileGeneralMethod.tap(cashOutViaBranchObjects.objConfirmBtn(),"Button");
        }
    }
    public void cashOutSelectBank(String sBank) throws Exception {
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button")) {
            mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
            if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objToAnyBank(),"Button")) {
                mobileGeneralMethod.tap(cashOutViaBranchObjects.objToAnyBank(),"Button");
                mobileGeneralMethod.type(cashOutViaBranchObjects.objSearchBank(), sBank, "Search Bank Text Field");
                mobileGeneralMethod.tap(cashOutViaBranchObjects.BogusBank(),"Bank");
            }
        }
    }
    //---------Negative
    public void cashOutBranchTransactionWithInValidMLPin_WM_TC_100() throws Exception {
        ExtentReporter.logInfo("WM_TC_100","CashOut Bank Transaction With Invalid ML Pin");
        login.loginWalletBranchTier();
        cashOutSelectBank(propertyReader.getproperty("Valid_BankName"));
        enterBankDetails(propertyReader.getproperty("AccountNumber"));
        Thread.sleep(3000);
        enterAmountBank(propertyReader.getproperty("AmountInput"));
        handleMpin("1234");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objInvalidPINMsg(),"Message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(cashOutViaBranchObjects.objInvalidPINMsg());
            String sExceptedErrorMsg = "You have entered an invalid PIN. Please try again.";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("WM_TC_100, CashOut Bank Transaction With Invalid ML Pin validated");
            ExtentReporter.logPass("WM_TC_100", "CashOut Bank Transaction With Invalid ML Pin validated");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_100", "Failed CashOut Bank Transaction With Invalid ML Pin to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Positive
    public void cashOutBranchTransactionWithValidMLPin_WM_TC_106() throws Exception {
        ExtentReporter.logInfo("Positive","CashOut Branch Transaction With valid ML Pin");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch(propertyReader.getproperty("AmountInput"));
        handleMpin("1111");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCreatedDate(),"Date");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objReferenceNumber(),"Reference Number");
        String nReference = mobileGeneralMethod.getText(cashOutViaBranchObjects.objReferenceNumber());
        System.out.println(nReference);
        String sReferenceNumber = nReference.substring(5, 16);
        System.out.println(sReferenceNumber);
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objBackToHomeBtn(),"Button");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(),"Text");
        mobileGeneralMethod.tap(homePageObject.objCashOutButton(),"Text");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objTransactionDetails(),"Page")) {
            String sReferenceNumberInCashOut = mobileGeneralMethod.getText(cashOutViaBranchObjects.objReferenceNumberInCashOut());
            System.out.println(sReferenceNumberInCashOut);
            mobileGeneralMethod.assertionValidation(sReferenceNumberInCashOut, sReferenceNumber);
            LoggingUtils.info("Reference Number is matching with recent Transaction");
            LoggingUtils.info("WM_TC_106, CashOut Branch Transaction With valid ML Pin validated");
            ExtentReporter.logPass("WM_TC_106", "CashOut Branch Transaction With valid ML Pin validated");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_106", "Failed CashOut Branch Transaction With valid ML Pin to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Positive
    public void cashOutBranchTransactionNewOTPAfterSixtySecondsValidation_WM_TC_115() throws Exception {
        ExtentReporter.logInfo("WM_TC_115","CashOut Branch Transaction New OTP got generated After Sixty Seconds validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch(propertyReader.getproperty("AmountInput"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        if (mobileGeneralMethod.isVisible(loginObject.objOTP(),"One Time Pin")) {
            String sGeneratedOTP = mobileGeneralMethod.getText(loginObject.objOTP());
            int sFirstOTP = Integer.parseInt(sGeneratedOTP);
            mobileGeneralMethod.waitSleep(70000);
            String sNewlyGeneratedOTPAfterSixtySeconds = mobileGeneralMethod.getText(loginObject.objOTP());
            int sSecondOTP = Integer.parseInt(sNewlyGeneratedOTPAfterSixtySeconds);
            mobileGeneralMethod.assertionNotEqualValidation(sFirstOTP, sSecondOTP);
            LoggingUtils.info("WM_TC_115, CashOut Branch Transaction New OTP got generated After Sixty Seconds is validated");
            ExtentReporter.logPass("WM_TC_115", "CashOut Branch Transaction New OTP got generated After Sixty Seconds is validated");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_115", "Failed CashOut Branch Transaction New OTP got generated After Sixty Seconds to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Negative
    public void cashOutBranchTransactionOTPCancelBtnFunctionality_WM_TC_116() throws Exception {
        ExtentReporter.logInfo("WM_TC_116","CashOut Branch Transaction OTP Cancel Button Functionality");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch(propertyReader.getproperty("AmountInput"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        mobileGeneralMethod.tap(loginObject.objCancelBtn(),"Button");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page")) {
            LoggingUtils.info("WM_TC_116, CashOut Branch Transaction, After clicking on Cancel in One time pin popup App navigates back to Cash Out To Branch Page is validated");
            ExtentReporter.logPass("WM_TC_116", "CashOut Branch Transaction, After clicking on Cancel in One time pin popup App navigates back to Cash Out To Branch Page is validated");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_116", "Failed CashOut Branch Transaction, After clicking on Cancel in One time pin popup App navigates back to Cash Out To Branch Page to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //---------Positive
    public void cashOutBranchTransactionOTPContinueBtnFunctionality_WM_TC_117() throws Exception {
        ExtentReporter.logInfo("WM_TC_117","CashOut Branch Transaction OTP Continue Button Functionality");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch(propertyReader.getproperty("AmountInput"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        mobileGeneralMethod.tap(loginObject.objContinueBtn(),"Button");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page")) {
            LoggingUtils.info("WM_TC_117, CashOut Branch Transaction, After clicking on Continue in One time pin popup App navigates to Transaction Success Page is validated");
            ExtentReporter.logPass("WM_TC_117", "CashOut Branch Transaction, After clicking on Continue in One time pin popup App navigates to Transaction Success page is validated");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("WM_TC_117", "Failed CashOut Branch Transaction, After clicking on Continue in One time pin popup App navigates to Transaction Success page to Validate");
            System.out.println("-----------------------------------------------------------");
        }
    }
}
