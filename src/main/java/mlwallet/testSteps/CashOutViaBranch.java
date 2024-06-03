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

    public void cashOutMaxLimit_WM_TC_06() throws Exception {
        ExtentReporter.logInfo("","Cash Out Withdraw Branch");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("100000");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objMaxLimitTxt(),"Text Message")) {
            String sMaxLimitTxt = mobileGeneralMethod.getText(cashOutViaBranchObjects.objMaxLimitTxt());
            String ExpectedTxt = "The maximum Branch Cash-out per transaction set for your verification level is P40,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sMaxLimitTxt, ExpectedTxt);
            LoggingUtils.info("WM_TC_06, The supplied amount us less than the required minimum transaction limit. Error Message is Validated");
            ExtentReporter.logPass("WM_TC_06", "WM_TC_06, The supplied amount us less than the required minimum transaction limit. Error Message is Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutInsufficientBalance_WM_TC_07() throws Exception {
        ExtentReporter.logInfo("","Cash Out Insufficient Balance");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("35000");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objInsufficientBalance(),"Text Message")) {
            String sInsufficientBalancePopupTxt = mobileGeneralMethod.getText(cashOutViaBranchObjects.objInsufficientBalance());
            String ExpectedTxt = "There is insufficient balance to proceed with this transaction. Please try again.";
            mobileGeneralMethod.assertionValidation(sInsufficientBalancePopupTxt, ExpectedTxt);
            LoggingUtils.info("WM_TC_07, Insufficient Balance pop up validated");
            ExtentReporter.logPass("WM_TC_07", "WM_TC_07, Insufficient Balance pop up validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutBranchMaximumTransactionBranchVerifiedTier_WM_TC_08() throws Exception { //
        ExtentReporter.logInfo("","CashOut Branch Maximum Transaction Branch Verified Tier");
        login.loginWalletSemiTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("50001");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objMaxLimitTxt(),"Text Message")) {
            String sInsufficientBalancePopupTxt = mobileGeneralMethod.getText(cashOutViaBranchObjects.objMaxLimitTxt());
            String ExpectedTxt = "The maximum Branch Cash-out per transaction set for your verification level is P40,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sInsufficientBalancePopupTxt, ExpectedTxt);
            LoggingUtils.info("WM_TC_08, The Maximum Branch Cash-out per transaction Msg for Branch-verified tier Account is Validated");
            ExtentReporter.logPass("WM_TC_08", "WM_TC_08, The Maximum Branch Cash-out per transaction Msg for Branch-verified tier Account is Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutBuyerTierLevelAcc_WM_TC_09() throws Exception {
        ExtentReporter.logInfo("","Cash Out Withdraw Branch");
        login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("100");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objMaxLimitUpgrade(),"Text Message")) {
            String sErrorMessage = mobileGeneralMethod.getText(cashOutViaBranchObjects.objMaxLimitUpgrade());
            String ExpectedTxt = "Branch Cash-out is not allowed for customers at this verification level. Please upgrade your account to use this service.";
            mobileGeneralMethod.assertionValidation(sErrorMessage, ExpectedTxt);
            LoggingUtils.info("WM_TC_09, Branch Cash-out is not allowed for customers at this verification level. Error Message is Validated");
            ExtentReporter.logPass("WM_TC_09", "WM_TC_08, Branch Cash-out is not allowed for customers at this verification level. Error Message is Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //=================================== Cash Out Phase2==================================================//
    public void cashOutUIValidation_WM_TC_16() throws Exception {
        ExtentReporter.logInfo("","Cash Out Page UI Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutWithdraw(),"Page")) {
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutOptions(),"Header");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objToAnyBank(),"Option");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objToAnyMLBranch(),"Option");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutOngoingTransaction(),"Header");
            LoggingUtils.info("WM_TC_16, Cash Out Page UI Validation");
            ExtentReporter.logPass("WM_TC_16", "WM_TC_16, Cash Out Page UI Validation");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutWithdrawBackBtnValidation_WM_TC_17() throws Exception {
        ExtentReporter.logInfo("","Cash Out Page back arrow Button Validation");
        cashOutUIValidation_WM_TC_16();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.cashOutBackArrowBtn(), "Cash Out Page Back Arrow Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(loginObject.objAvailableBalance(),"Text")) {
            LoggingUtils.info("WM_TC_17, Cash Out Page back arrow Button Validation");
            ExtentReporter.logPass("WM_TC_17", "WM_TC_17, Cash Out Page back arrow Button Validation");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutToBranchUIValidation_WM_TC_18() throws Exception {
        ExtentReporter.logInfo("","Cash Out To Branch UI Validation");
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
            ExtentReporter.logPass("WM_TC_18", "WM_TC_18, Cash Out to Branch Page Validation");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutToBranchBackBtnValidation_WM_TC_19() throws Exception {
        ExtentReporter.logInfo("","Cash Out To Branch Page back arrow Button Validation");
        cashOutToBranchUIValidation_WM_TC_18();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOutToBranchBackBtn(), "Cash Out Page Back Arrow Button");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutWithdraw(),"Page")) {
            LoggingUtils.info("WM_TC_19, Cash Out To Branch Page back arrow Button Validation");
            ExtentReporter.logPass("WM_TC_19", "WM_TC_19, Cash Out To Branch Page back arrow Button Validation");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutMlBranchQRPageUIValidation_WM_TC_22() throws Exception {
        ExtentReporter.logInfo("","CashOut ML Branch QR Code Page UI Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("10");
        login.enterOTP();
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page")) {
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCreatedDate(),"Date");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objReferenceNumber(),"Reference Number");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objPHP(),"Amount");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objBackToHomeBtn(),"Button");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objNewTransaction(),"Button");
            LoggingUtils.info("WM_TC_22, CashOut ML Branch QR Code Page UI Validation");
            ExtentReporter.logPass("WM_TC_22", "WM_TC_22, CashOut ML Branch QR Code Page UI Validation");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void cashOutCancelIconValidation_WM_TC_23() throws Exception {
        ExtentReporter.logInfo("","Cash Out Cancel Icon Validation");
        cashOutMlBranchQRPageUIValidation_WM_TC_22();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCancelIcon(), "Cancel Icon");
        if (mobileGeneralMethod.isVisible(loginObject.objAvailableBalance(),"Text")) {
            LoggingUtils.info("WM_TC_23, Cash Out Cancel Icon Validated");
            ExtentReporter.logPass("WM_TC_23", "WM_TC_23, Cash Out Cancel Icon Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutMLBranchSemiVerifiedTier_WM_TC_31() throws Exception {
        ExtentReporter.logInfo("","Cash In Branch Semi-Verified Tier");
        login.loginWalletSemiTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("10");
        login.enterOTP();
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page")) {
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
                ExtentReporter.logPass("WM_TC_31", "WM_TC_31, Successfully Withdraw Money to ML Branch for Semi-verified Tier Account");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
    public void cashOutMLBranchFullyVerifiedTier_WM_TC_32() throws Exception {
        ExtentReporter.logInfo("","Cash In Branch Fully-Verified Tier");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("10");
        login.enterOTP();
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page")) {
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
                ExtentReporter.logPass("WM_TC_32", "WM_TC_32, Successfully Withdraw Money to ML Branch for Fully-Verified Tier Account");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
    public void cashOutMLBranchMaxLimitSemiVerifiedTier_WM_TC_39() throws Exception {
        ExtentReporter.logInfo("","CashOut ML Branch Maximum Limit For Semi-verified Tier");
        login.loginWalletSemiTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("20000");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objMaxLimitUpgrade(),"Error Message")) {
            String sErrorMsg = mobileGeneralMethod.getText(cashOutViaBranchObjects.objMaxLimitUpgrade());
            String sExpectedErrorMsg = "The maximum Branch Cash-out per transaction set for your verification level is P5,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sErrorMsg, sExpectedErrorMsg);
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objUpgradeNowBtn(),"Button");
            LoggingUtils.info("WM_TC_39, The Maximum Branch Cash-out per transaction Msg for Semi-verified tier Account is Validated");
            ExtentReporter.logPass("WM_TC_39", "WM_TC_39, The Maximum Bank Cash-out per transaction Msg for Semi-verified tier Account is Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutMLBranchMaxLimitFullyVerifiedTier_WM_TC_42() throws Exception {
        ExtentReporter.logInfo("","CashOut ML Branch Maximum Limit For Fully-verified Tier");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("60000");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objBankMaxLimitTxt(),"Error Message")) {
            String sErrorMsg = mobileGeneralMethod.getText(cashOutViaBranchObjects.objBankMaxLimitTxt());
            String sExpectedErrorMsg = "The maximum Branch Cash-out per transaction set for your verification level is P40,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sErrorMsg, sExpectedErrorMsg);
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objOkBtn(),"Button");
            LoggingUtils.info("WM_TC_42, The Maximum Branch Cash-out per transaction Msg for Fully-verified tier Account is Validated");
            ExtentReporter.logPass("WM_TC_42", "WM_TC_42, The Maximum Bank Cash-out per transaction Msg for Fully-verified tier Account is Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutMLBranchBackToHomeBtnValidation_WM_TC_54() throws Exception {
        ExtentReporter.logInfo("","CashOut ML Branch Back To Home Button Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("10");
        login.enterOTP();
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCreatedDate(),"Date");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objReferenceNumber(),"Reference Number");
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objBackToHomeBtn(),"Button");
        if (mobileGeneralMethod.isVisible(loginObject.objAvailableBalance(),"Text")) {
            LoggingUtils.info("WM_TC_54, CashOut ML Branch, After Clicking On Back To Home Button Application Navigated to Home page Validated");
            ExtentReporter.logPass("WM_TC_54", "WM_TC_54, CashOut ML Branch, After Clicking On Back To Home Button Application Navigated to Home page Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutMLBranchNewTransactionBtnValidation_WM_TC_55() throws Exception {
        ExtentReporter.logInfo("","CashOut ML Branch New Transaction Button Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("10");
        login.enterOTP();
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCreatedDate(),"Date");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objReferenceNumber(),"Reference Number");
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objNewTransaction(),"Button");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutWithdraw(),"Page")) {
            LoggingUtils.info("WM_TC_55, CashOut ML Branch, After Clicking On New Transaction Button Application Navigated to CashOut/WithDraw Page Validated");
            ExtentReporter.logPass("WM_TC_55", "WM_TC_55, CashOut ML Branch, After Clicking On New Transaction Button Application Navigated to CashOut/WithDraw Page Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutMLBranchOTPPageUiValidation_WM_TC_60() throws Exception {
        ExtentReporter.logInfo("","CashOut/WithDraw ML Branch OTP Page UI Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("10");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page")) {
			mobileGeneralMethod.isVisible(loginObject.objOtpTextField(1), "OTP text Field");
            mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objResendCode(),"Seconds");
            LoggingUtils.info("WM_TC_60, CashOut/WithDraw ML Branch OTP Page UI Validated");
            ExtentReporter.logPass("WM_TC_60", "WM_TC_20, CashOut/WithDraw ML Branch OTP Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutMLBranchTransactionDetailsUIValidation_WM_TC_61() throws Exception {
        ExtentReporter.logInfo("","CashOut/WithDraw ML Branch Transaction Details UI Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("10");
        login.enterOTP();
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page")) {
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
                ExtentReporter.logPass("WM_TC_61", "WM_TC_61, CashOut/WithDraw ML Branch Transaction Details UI Validated");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
    public void cashOutBranchAmountFieldValidation_WM_TC_98(String sAmount) throws Exception {
        ExtentReporter.logInfo("","CashOut Branch, Amount Field with more than 2 decimals Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objToAnyMLBranch(),"Button");
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objToAnyMLBranch(),"Button");
        mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page");
        mobileGeneralMethod.type(cashOutViaBranchObjects.objAmountField(), sAmount, "Amount to Send");
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objNextBtn(),"Button");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objInvalidAmountMsg(),"Pop Message")) {
            String sMinimumTransactionPopupMsg = mobileGeneralMethod.getText(cashOutViaBranchObjects.objInvalidAmountMsg());
            String sExpectedPopupMsg = "The amount must be limited to 2 decimal places";
            mobileGeneralMethod.assertionValidation(sMinimumTransactionPopupMsg, sExpectedPopupMsg);
            LoggingUtils.info("WM_TC_98, CashOut Branch, Amount Field with more than 2 decimals Error Msg validated");
            ExtentReporter.logPass("WM_TC_98", "WM_TC_98, CashOut Branch, Amount Field with more than 2 decimals Error Msg validated");
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
    public void cashOutBranchTransactionWithInValidMLPin_WM_TC_100(String sAmount) throws Exception {
        ExtentReporter.logInfo("","CashOut Bank Transaction With Invalid ML Pin");
        login.loginWalletBranchTier();
        cashOutSelectBank(propertyReader.getproperty("Valid_BankName"));
        enterBankDetails(propertyReader.getproperty("AccountNumber"));
        Thread.sleep(3000);
        enterAmountBank(sAmount);
        handleMpin("1234");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objInvalidPINMsg(),"Message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(cashOutViaBranchObjects.objInvalidPINMsg());
            String sExceptedErrorMsg = "You have entered an invalid PIN. Please try again.";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("WM_TC_100, CashOut Bank Transaction With Invalid ML Pin validated");
            ExtentReporter.logPass("WM_TC_100", "WM_TC_100, CashOut Bank Transaction With Invalid ML Pin validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutBranchTransactionWithValidMLPin_WM_TC_106() throws Exception {
        ExtentReporter.logInfo("","CashOut Branch Transaction With Invalid ML Pin");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("10");
        handleMpin("1111");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page")) {
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
                ExtentReporter.logPass("WM_TC_106", "WM_TC_106, CashOut Branch Transaction With valid ML Pin validated");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
    public void cashOutBranchTransactionWithInValidMLPin_WM_TC_107() throws Exception {
        ExtentReporter.logInfo("","CashOut Branch Transaction With Invalid ML Pin");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("10");
        handleMpin("1234");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objInvalidPINMsg(),"Message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(cashOutViaBranchObjects.objInvalidPINMsg());
            String sExceptedErrorMsg = "You have entered an invalid PIN. Please try again.";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("WM_TC_107, CashOut Bank Transaction With Invalid ML Pin validated");
            ExtentReporter.logPass("WM_TC_107", "WM_TC_107, CashOut Bank Transaction With Invalid ML Pin validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutBranchInAppOTPPopupValidation_WM_TC_113() throws Exception {
        ExtentReporter.logInfo("","CashOut Branch InApp OTP Popup validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("10");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page")) {
            mobileGeneralMethod.isVisible(loginObject.objOTP(),"One Time Pin");
            LoggingUtils.info("WM_TC_113, CashOut Branch InApp OTP Popup validated");
            ExtentReporter.logPass("WM_TC_113", "WM_TC_113, CashOut Branch InApp OTP Popup validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutBranchTransactionInAppOTPPopupUIValidation_WM_TC_114() throws Exception {
        ExtentReporter.logInfo("","CashOut Branch Transaction InApp OTP Popup UI validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("10");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page")) {
            mobileGeneralMethod.isVisible(loginObject.objOTP(),"One Time Pin");
            mobileGeneralMethod.isVisible(loginObject.objSeconds(),"Seconds");
            mobileGeneralMethod.isVisible(loginObject.objContinueBtn(),"Button");
            mobileGeneralMethod.isVisible(loginObject.objCancelBtn(),"Button");
            LoggingUtils.info("WM_TC_114, CashOut Branch Transaction InApp OTP Popup UI validated");
            ExtentReporter.logPass("WM_TC_114", "WM_TC_114, CashOut Branch Transaction InApp OTP Popup UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutBranchTransactionNewOTPAfterSixtySecondsValidation_WM_TC_115() throws Exception {
        ExtentReporter.logInfo("","CashOut Branch Transaction New OTP got generated After Sixty Seconds validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("10");
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
            ExtentReporter.logPass("WM_TC_115", "WM_TC_115, CashOut Branch Transaction New OTP got generated After Sixty Seconds is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutBranchTransactionOTPCancelBtnFunctionality_WM_TC_116() throws Exception {
        ExtentReporter.logInfo("","CashOut Branch Transaction OTP Cancel Button Functionality");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("10");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        mobileGeneralMethod.tap(loginObject.objCancelBtn(),"Button");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page")) {
            LoggingUtils.info("WM_TC_116, CashOut Branch Transaction, After clicking on Cancel in One time pin popup App navigates back to Cash Out To Branch Page is validated");
            ExtentReporter.logPass("WM_TC_116", "WM_TC_116, CashOut Branch Transaction, After clicking on Cancel in One time pin popup App navigates back to Cash Out To Branch Page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void cashOutBranchTransactionOTPContinueBtnFunctionality_WM_TC_117() throws Exception {
        ExtentReporter.logInfo("","CashOut Branch Transaction OTP Continue Button Functionality");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(cashOutViaBranchObjects.objCashOut(), "CashOut / Withdraw Button");
        enterAmountMLBranch("10");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Page");
        mobileGeneralMethod.tap(loginObject.objContinueBtn(),"Button");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutToBranch(),"Page")) {
            LoggingUtils.info("WM_TC_117, CashOut Branch Transaction, After clicking on Continue in One time pin popup App navigates to Transaction Success Page is validated");
            ExtentReporter.logPass("WM_TC_117", "WM_TC_117, CashOut Branch Transaction, After clicking on Continue in One time pin popup App navigates to Transaction Success page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
}
