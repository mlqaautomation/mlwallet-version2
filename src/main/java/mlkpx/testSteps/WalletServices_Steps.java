package mlkpx.testSteps;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

import java.time.Duration;

public class WalletServices_Steps extends Base_Steps {

    // WALLET SERVICES / CASH IN TO ANOTHER ACCOUNT

    public void navigateWalletServicesPage() throws Exception {
        try {
            click(walletServicesPageObjects.Wallet_link(), "Cash In to Another Account");
            if (isVisible(walletServicesPageObjects.WalletPage_h2(), getText(walletServicesPageObjects.WalletPage_h2()))) {
                LoggingUtils.info("Navigated to Wallet Services Page");
            }
        } catch (Exception e) {
            LoggingUtils.info("Failed to Navigate Wallet Services Page " + e);
        }
    }
    public void ValidateSuccessCashInToAnotherAccount() throws Exception {

        click(walletServicesPageObjects.CashInAnotherAccount(), "Cash In to Another Account");
        if (isVisible(walletServicesPageObjects.WalletPage(), getText(walletServicesPageObjects.WalletPage()))) {
//            type(walletServicesPageObjects.WalletCardNum(), "ML Card Number", "");
            click(walletServicesPageObjects.SearchKYC(), "Search KYC Button");
        }
        waitSleep(2);
        type(walletServicesPageObjects.SearchLName(), "Last name field", "AMOC");
        type(walletServicesPageObjects.SearchFName(), "First name field", "ROSELYN");
        type(walletServicesPageObjects.SearchMName(), "Middle name field", "");
        click(walletServicesPageObjects.SearchKYCAc(), "Search Button");
        waitSleep(2);
        click(walletServicesPageObjects.ViewKYCCustomer(), "View KYC");
        waitSleep(2);
        if (isVisible(walletServicesPageObjects.KYCPage(), getText(walletServicesPageObjects.KYCPage()))) {
            LoggingUtils.info("Navigated to View KYC");
            scrollDown(100);
            waitSleep(3000);
            scrollDown(100);
        }
        click(walletServicesPageObjects.SelectKYC(), "Select KYC");
        if (walletServicesPageObjects.CashInInfos().isEnabled()) {
            LoggingUtils.info("Navigated to View Cash In to Another Account Information's");
            click(walletServicesPageObjects.ReceiversMobileNum(), "Receiver's ML Money Mobile No.");
            type(walletServicesPageObjects.ReceiversMobileNum(), "Receiver's ML Money Mobile No.", "078845625");
            type(walletServicesPageObjects.PrincipalAmount(), "Principal Amount", "1000");
            click(walletServicesPageObjects.SubmitSendMoney(), "Select Claim Amount");
            waitSleep(2000);
        }
        if (walletServicesPageObjects.SendMoneyInfo().isEnabled()) {
            type(walletServicesPageObjects.TenderAmount(), "Tender Amount", "1003");
            click(walletServicesPageObjects.ProceedSendMoney(), "Proceed");
        }
        if (walletServicesPageObjects.SendMoneyConfirmation().isEnabled()) {
            click(walletServicesPageObjects.ConfirmSendMoney(), "Confirm Send Money");
            assertEqual(getText(walletServicesPageObjects.SuccessfulSendMoney()), "Send Money Successful");
            click(walletServicesPageObjects.ProceedToPrint(), "Proceed to Printing");
//            click(walletServicesPageObjects.PrintReceipt(), "Print Receipt");
//            click(payoutPageObjects.PrintButton(), "Print");
//            LoggingUtils.info("Successful in printing Money Sendout Receipt");
            click(walletServicesPageObjects.CancelToPrint(), "Cancel to Printing");
            LoggingUtils.info("Redirect to Wallet Services" +
                    "Cash In to Another Account");
        }

    }
    public void ValidateRemoteSuccessCashInToAnotherAccount() throws Exception {

        click(walletServicesPageObjects.CashInAnotherAccount(), "Cash In to Another Account");

        if (isVisible(walletServicesPageObjects.WalletPage(), getText(walletServicesPageObjects.WalletPage()))) {
            click(walletServicesPageObjects.RemoteTransaction(), "Remote Transaction");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(walletServicesPageObjects.BranchCode()));

            type(walletServicesPageObjects.BranchCode(), "Search Branch Code", "12R33A180912");
            WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(12));

            waits.until(ExpectedConditions.elementToBeClickable(walletServicesPageObjects.OperatorID()));
            type(walletServicesPageObjects.OperatorID(), "Search Operator ID", "2023639709");
            type(walletServicesPageObjects.ReasonRemote(), "Reason", "Testing");
//            type(walletServicesPageObjects.WalletCardNum(), "ML Card Number", "");
            click(walletServicesPageObjects.SearchKYC(), "Search KYC Button");
        }
        waitSleep(2);
        type(walletServicesPageObjects.SearchLName(), "Last name field", "AMOC");
        type(walletServicesPageObjects.SearchFName(), "First name field", "ROSELYN");
        type(walletServicesPageObjects.SearchMName(), "Middle name field", "");
        click(walletServicesPageObjects.SearchKYCAc(), "Search Button");
        waitSleep(2);
        click(walletServicesPageObjects.ViewKYCCustomer(), "View KYC");
        waitSleep(2);
        if (isVisible(walletServicesPageObjects.KYCPage(), getText(walletServicesPageObjects.KYCPage()))) {
            LoggingUtils.info("Navigated to View KYC");
            scrollDown(100);
            waitSleep(3000);
            scrollDown(100);
        }
        click(walletServicesPageObjects.SelectKYC(), "Select KYC");
        if (walletServicesPageObjects.CashInInfos().isEnabled()) {
            LoggingUtils.info("Navigated to View Cash In to Another Account Information's");
            click(walletServicesPageObjects.ReceiversMobileNum(), "Receiver's ML Money Mobile No.");
            type(walletServicesPageObjects.ReceiversMobileNum(), "Receiver's ML Money Mobile No.", "078845625");
            type(walletServicesPageObjects.PrincipalAmount(), "Principal Amount", "1000");
            click(walletServicesPageObjects.SubmitSendMoney(), "Select Claim Amount");
            waitSleep(2000);
        }
        if (walletServicesPageObjects.SendMoneyInfo().isEnabled()) {
            type(walletServicesPageObjects.TenderAmount(), "Tender Amount", "1003");
            click(walletServicesPageObjects.ProceedSendMoney(), "Proceed");
        }
        if (walletServicesPageObjects.SendMoneyConfirmation().isEnabled()) {
            click(walletServicesPageObjects.ConfirmSendMoney(), "Confirm Send Money");
            assertEqual(getText(walletServicesPageObjects.SuccessfulSendMoney()), "Send Money Successful");
            click(walletServicesPageObjects.ProceedToPrint(), "Proceed to Printing");
//            click(walletServicesPageObjects.PrintReceipt(), "Print Receipt");
//            click(payoutPageObjects.PrintButton(), "Print");
//            LoggingUtils.info("Successful in printing Money Sendout Receipt");
            click(walletServicesPageObjects.CancelToPrint(), "Cancel to Printing");
            LoggingUtils.info("Redirect to Wallet Services" +
                    "Cash In to Another Account");
        }
    }
    public void ValidateCashInToAnotherAccWithNoMobileProvided() throws Exception {

        click(walletServicesPageObjects.CashInAnotherAccount(), "Cash In to Another Account");
        if (isVisible(walletServicesPageObjects.WalletPage(), getText(walletServicesPageObjects.WalletPage()))) {
//            type(walletServicesPageObjects.WalletCardNum(), "ML Card Number", "");
            click(walletServicesPageObjects.SearchKYC(), "Search KYC Button");
        }
        waitSleep(2);
        type(walletServicesPageObjects.SearchLName(), "Last name field", "AMOC");
        type(walletServicesPageObjects.SearchFName(), "First name field", "ROSELYN");
        type(walletServicesPageObjects.SearchMName(), "Middle name field", "");
        click(walletServicesPageObjects.SearchKYCAc(), "Search Button");
        waitSleep(2);
        click(walletServicesPageObjects.ViewKYCCustomer(), "View KYC");
        waitSleep(2);
        if (isVisible(walletServicesPageObjects.KYCPage(), getText(walletServicesPageObjects.KYCPage()))) {
            LoggingUtils.info("Navigated to View KYC");
            scrollDown(100);
            waitSleep(3000);
            scrollDown(100);
        }
        click(walletServicesPageObjects.SelectKYC(), "Select KYC");
        if (walletServicesPageObjects.CashInInfos().isEnabled()) {
            LoggingUtils.info("Navigated to View Cash In to Another Account Information's");
            click(walletServicesPageObjects.ReceiversMobileNum(), "Receiver's ML Money Mobile No.");
            type(walletServicesPageObjects.ReceiversMobileNum(), "Receiver's ML Money Mobile No.", "");
            click(walletServicesPageObjects.WalletCardNum(), "Select Claim Amount");
            assertEqual(getText(walletServicesPageObjects.MobileRequired()), "Mobile number is required.");
        }


    }
    public void ValidateCashInToAnotherAccWithInvalidMobileProvided() throws Exception {

        click(walletServicesPageObjects.CashInAnotherAccount(), "Cash In to Another Account");
        if (isVisible(walletServicesPageObjects.WalletPage(), getText(walletServicesPageObjects.WalletPage()))) {
//            type(walletServicesPageObjects.WalletCardNum(), "ML Card Number", "");
            click(walletServicesPageObjects.SearchKYC(), "Search KYC Button");
        }
        waitSleep(2);
        type(walletServicesPageObjects.SearchLName(), "Last name field", "AMOC");
        type(walletServicesPageObjects.SearchFName(), "First name field", "ROSELYN");
        type(walletServicesPageObjects.SearchMName(), "Middle name field", "");
        click(walletServicesPageObjects.SearchKYCAc(), "Search Button");
        waitSleep(2);
        click(walletServicesPageObjects.ViewKYCCustomer(), "View KYC");
        waitSleep(2);
        if (isVisible(walletServicesPageObjects.KYCPage(), getText(walletServicesPageObjects.KYCPage()))) {
            LoggingUtils.info("Navigated to View KYC");
            scrollDown(100);
            waitSleep(3000);
            scrollDown(100);
        }
        click(walletServicesPageObjects.SelectKYC(), "Select KYC");
        if (walletServicesPageObjects.CashInInfos().isEnabled()) {
            LoggingUtils.info("Navigated to View Cash In to Another Account Information's");
            click(walletServicesPageObjects.ReceiversMobileNum(), "Receiver's ML Money Mobile No.");
            type(walletServicesPageObjects.ReceiversMobileNum(), "Receiver's ML Money Mobile No.", "53456");
            click(walletServicesPageObjects.WalletCardNum(), "Select Claim Amount");
            assertEqual(getText(walletServicesPageObjects.InvalidMobileRequired()), "Invalid Mobile No.");
        }
    }
    public void ValidateCashInToAnotherAccWithNoPrincipal() throws Exception {

        click(walletServicesPageObjects.CashInAnotherAccount(), "Cash In to Another Account");
        if (isVisible(walletServicesPageObjects.WalletPage(), getText(walletServicesPageObjects.WalletPage()))) {
//            type(walletServicesPageObjects.WalletCardNum(), "ML Card Number", "");
            click(walletServicesPageObjects.SearchKYC(), "Search KYC Button");
        }
        waitSleep(2);
        type(walletServicesPageObjects.SearchLName(), "Last name field", "AMOC");
        type(walletServicesPageObjects.SearchFName(), "First name field", "ROSELYN");
        type(walletServicesPageObjects.SearchMName(), "Middle name field", "");
        click(walletServicesPageObjects.SearchKYCAc(), "Search Button");
        waitSleep(2);
        click(walletServicesPageObjects.ViewKYCCustomer(), "View KYC");
        waitSleep(2);
        if (isVisible(walletServicesPageObjects.KYCPage(), getText(walletServicesPageObjects.KYCPage()))) {
            LoggingUtils.info("Navigated to View KYC");
            scrollDown(100);
            waitSleep(3000);
            scrollDown(100);
        }
        click(walletServicesPageObjects.SelectKYC(), "Select KYC");
        if (walletServicesPageObjects.CashInInfos().isEnabled()) {
            LoggingUtils.info("Navigated to View Cash In to Another Account Information's");
            click(walletServicesPageObjects.ReceiversMobileNum(), "Receiver's ML Money Mobile No.");
            type(walletServicesPageObjects.ReceiversMobileNum(), "Receiver's ML Money Mobile No.", "078845625");
            type(walletServicesPageObjects.PrincipalAmount(), "Principal Amount", "");
            click(walletServicesPageObjects.WalletCardNum(), "Select Claim Amount");
            assertEqual(getText(walletServicesPageObjects.AmountNumber()), "Amount should be a number");
        }
    }
    public void ValidateCashInToAnotherAccWithInputtedZero() throws Exception {

        click(walletServicesPageObjects.CashInAnotherAccount(), "Cash In to Another Account");
        if (isVisible(walletServicesPageObjects.WalletPage(), getText(walletServicesPageObjects.WalletPage()))) {
//            type(walletServicesPageObjects.WalletCardNum(), "ML Card Number", "");
            click(walletServicesPageObjects.SearchKYC(), "Search KYC Button");
        }
        waitSleep(2);
        type(walletServicesPageObjects.SearchLName(), "Last name field", "AMOC");
        type(walletServicesPageObjects.SearchFName(), "First name field", "ROSELYN");
        type(walletServicesPageObjects.SearchMName(), "Middle name field", "");
        click(walletServicesPageObjects.SearchKYCAc(), "Search Button");
        waitSleep(2);
        click(walletServicesPageObjects.ViewKYCCustomer(), "View KYC");
        waitSleep(2);
        if (isVisible(walletServicesPageObjects.KYCPage(), getText(walletServicesPageObjects.KYCPage()))) {
            LoggingUtils.info("Navigated to View KYC");
            scrollDown(100);
            waitSleep(3000);
            scrollDown(100);
        }
        click(walletServicesPageObjects.SelectKYC(), "Select KYC");
        if (walletServicesPageObjects.CashInInfos().isEnabled()) {
            LoggingUtils.info("Navigated to View Cash In to Another Account Information's");
            click(walletServicesPageObjects.ReceiversMobileNum(), "Receiver's ML Money Mobile No.");
            type(walletServicesPageObjects.ReceiversMobileNum(), "Receiver's ML Money Mobile No.", "078845625");
            type(walletServicesPageObjects.PrincipalAmount(), "Principal Amount", "0");
            click(walletServicesPageObjects.SubmitSendMoney(), "Select Claim Amount");
            assertEqual(getText(walletServicesPageObjects.Minnumber()), "Minimum amount is 1");
        }

    }
    public void ValidateCashInToAnotherAccWithInputtedLessTotal() throws Exception {

        click(walletServicesPageObjects.CashInAnotherAccount(), "Cash In to Another Account");
        if (isVisible(walletServicesPageObjects.WalletPage(), getText(walletServicesPageObjects.WalletPage()))) {
//            type(walletServicesPageObjects.WalletCardNum(), "ML Card Number", "");
            click(walletServicesPageObjects.SearchKYC(), "Search KYC Button");
        }
        waitSleep(2);
        type(walletServicesPageObjects.SearchLName(), "Last name field", "AMOC");
        type(walletServicesPageObjects.SearchFName(), "First name field", "ROSELYN");
        type(walletServicesPageObjects.SearchMName(), "Middle name field", "");
        click(walletServicesPageObjects.SearchKYCAc(), "Search Button");
        waitSleep(2);
        click(walletServicesPageObjects.ViewKYCCustomer(), "View KYC");
        waitSleep(2);
        if (isVisible(walletServicesPageObjects.KYCPage(), getText(walletServicesPageObjects.KYCPage()))) {
            LoggingUtils.info("Navigated to View KYC");
            scrollDown(100);
            waitSleep(3000);
            scrollDown(100);
        }
        click(walletServicesPageObjects.SelectKYC(), "Select KYC");
        if (walletServicesPageObjects.CashInInfos().isEnabled()) {
            LoggingUtils.info("Navigated to View Cash In to Another Account Information's");
            click(walletServicesPageObjects.ReceiversMobileNum(), "Receiver's ML Money Mobile No.");
            type(walletServicesPageObjects.ReceiversMobileNum(), "Receiver's ML Money Mobile No.", "078845625");
            type(walletServicesPageObjects.PrincipalAmount(), "Principal Amount", "1000");
            click(walletServicesPageObjects.SubmitSendMoney(), "Select Claim Amount");
            waitSleep(2000);
        }
        if (walletServicesPageObjects.SendMoneyInfo().isEnabled()) {
            typeEnter(walletServicesPageObjects.TenderAmount(), "Tender Amount", "434");
            assertEqual(getText(walletServicesPageObjects.LessTenderAmount()), "Tender amount cannot be less than total amount");

        }


    }
    public void ValidateCashInToAnotherAccWithInputtedFiftyThousandsAbove() throws Exception {

        click(walletServicesPageObjects.CashInAnotherAccount(), "Cash In to Another Account");
        if (isVisible(walletServicesPageObjects.WalletPage(), getText(walletServicesPageObjects.WalletPage()))) {
//            type(walletServicesPageObjects.WalletCardNum(), "ML Card Number", "");
            click(walletServicesPageObjects.SearchKYC(), "Search KYC Button");
        }
        waitSleep(2);
        type(walletServicesPageObjects.SearchLName(), "Last name field", "AMOC");
        type(walletServicesPageObjects.SearchFName(), "First name field", "ROSELYN");
        type(walletServicesPageObjects.SearchMName(), "Middle name field", "");
        click(walletServicesPageObjects.SearchKYCAc(), "Search Button");
        waitSleep(2);
        click(walletServicesPageObjects.ViewKYCCustomer(), "View KYC");
        waitSleep(2);
        if (isVisible(walletServicesPageObjects.KYCPage(), getText(walletServicesPageObjects.KYCPage()))) {
            LoggingUtils.info("Navigated to View KYC");
            scrollDown(100);
            waitSleep(3000);
            scrollDown(100);
        }
        click(walletServicesPageObjects.SelectKYC(), "Select KYC");
        if (walletServicesPageObjects.CashInInfos().isEnabled()) {
            LoggingUtils.info("Navigated to View Cash In to Another Account Information's");
            click(walletServicesPageObjects.ReceiversMobileNum(), "Receiver's ML Money Mobile No.");
            type(walletServicesPageObjects.ReceiversMobileNum(), "Receiver's ML Money Mobile No.", "078845625");
            type(walletServicesPageObjects.PrincipalAmount(), "Principal Amount", "50001");
            click(walletServicesPageObjects.SubmitSendMoney(), "Select Claim Amount");
            waitSleep(2000);
        }
        if (walletServicesPageObjects.SendMoneyInfo().isEnabled()) {
            type(walletServicesPageObjects.TenderAmount(), "Tender Amount", "50001");
            click(walletServicesPageObjects.ProceedSendMoney(), "Proceed");

        }
        if (walletServicesPageObjects.SendMoneyConfirmation().isEnabled()) {
            click(walletServicesPageObjects.ConfirmSendMoney(), "Confirm Send Money");
            assertEqual(getText(walletServicesPageObjects.TransactionNotAllowed()), "Transaction not allowed");

        }
    }
    public void ValidateCashInToAnotherAccCustomerCannotFound() throws Exception {

        click(walletServicesPageObjects.CashInAnotherAccount(), "Cash In to Another Account");
        if (isVisible(walletServicesPageObjects.WalletPage(), getText(walletServicesPageObjects.WalletPage()))) {
//            type(walletServicesPageObjects.WalletCardNum(), "ML Card Number", "");
            click(walletServicesPageObjects.SearchKYC(), "Search KYC Button");
        }
        waitSleep(2);
        type(walletServicesPageObjects.SearchLName(), "Last name field", "AMOC");
        type(walletServicesPageObjects.SearchFName(), "First name field", "ROSELYN");
        type(walletServicesPageObjects.SearchMName(), "Middle name field", "");
        click(walletServicesPageObjects.SearchKYCAc(), "Search Button");
        waitSleep(2);
        click(walletServicesPageObjects.ViewKYCCustomer(), "View KYC");
        waitSleep(2);
        if (isVisible(walletServicesPageObjects.KYCPage(), getText(walletServicesPageObjects.KYCPage()))) {
            LoggingUtils.info("Navigated to View KYC");
            scrollDown(100);
            waitSleep(3000);
            scrollDown(100);
        }
        click(walletServicesPageObjects.SelectKYC(), "Select KYC");
        if (walletServicesPageObjects.CashInInfos().isEnabled()) {
            LoggingUtils.info("Navigated to View Cash In to Another Account Information's");
            click(walletServicesPageObjects.ReceiversMobileNum(), "Receiver's ML Money Mobile No.");
            type(walletServicesPageObjects.ReceiversMobileNum(), "Receiver's ML Money Mobile No.", "078749625");
            type(walletServicesPageObjects.PrincipalAmount(), "Principal Amount", "1000");
            click(walletServicesPageObjects.SubmitSendMoney(), "Select Claim Amount");
            waitSleep(2000);
            assertEqual(getText(walletServicesPageObjects.CustomerCannotFound()), "Customer not found");
        }


    }


    // WALLET SERVICES / RECEIPT REPRINTING / Cash In To Own Account
    public void validateSuccessfulCashInOwnReprinting()throws Exception{
        click(walletServicesPageObjects.ReceiptReprinting(), "Wallet Services Receipt Reprinting");
        click(walletServicesPageObjects.CashInOwnReprinting(), "Cash In to Own Account Receipt");
        if(isVisible(walletServicesPageObjects.CashInOwnPage(), getText(walletServicesPageObjects.CashInOwnPage()))){
            LoggingUtils.info("Navigated the Cash In to Own Account Receipt page");
        }
        type(walletServicesPageObjects.RefKTPN(), "Reference Number","ACIWICTZLCH");
        click(walletServicesPageObjects.Reprint(), "Search Button");
        if(isVisible(walletServicesPageObjects.ReprintCashInOwnReceipt(), getText(walletServicesPageObjects.ReprintCashInOwnReceipt()))){
            LoggingUtils.info("Navigated the Cash In to Own Account Receipt page");
            click(walletServicesPageObjects.PrintReceipt(), "Print Receipt");
//            click(payoutPageObjects.PrintButton(), "Print");
            LoggingUtils.info("Successful in printing Cash In to Own Account receipt");

        }
    }
    public void validateCashInOwnInvalidRefNumReprinting()throws Exception{
        click(walletServicesPageObjects.ReceiptReprinting(), "Wallet Services Receipt Reprinting");
        click(walletServicesPageObjects.CashInOwnReprinting(), "Cash In to Own Account Receipt");
        if(isVisible(walletServicesPageObjects.CashInOwnPage(), getText(walletServicesPageObjects.CashInOwnPage()))){
            LoggingUtils.info("Navigated the Cash In to Own Account Receipt page");
        }
        type(walletServicesPageObjects.RefKTPN(), "Reference Number","ACKWTZLLH");
        click(walletServicesPageObjects.Reprint(), "Search Button");
        assertEqual(getText(walletServicesPageObjects.InvalidRefReprinting()), "Warning");
        LoggingUtils.info("Warning" + "Transaction reference number not found.");

    }
    public void validateCashInOwnCompleteInvalidRefNumReprinting()throws Exception{
        click(walletServicesPageObjects.ReceiptReprinting(), "Wallet Services Receipt Reprinting");
        click(walletServicesPageObjects.CashInOwnReprinting(), "Cash In to Own Account Receipt");
        if(isVisible(walletServicesPageObjects.CashInOwnPage(), getText(walletServicesPageObjects.CashInOwnPage()))){
            LoggingUtils.info("Navigated the Cash In to Own Account Receipt page");
        }
        type(walletServicesPageObjects.RefKTPN(), "Reference Number","ACALDSSQYXH");
        click(walletServicesPageObjects.Reprint(), "Search Button");
        assertEqual(getText(walletServicesPageObjects.CompleteInvalidRefReprinting()), "Wrong transaction type");
        LoggingUtils.info("Wrong transaction type" + "Reference number does not match transaction type.");

    }
    public void validateCashInOwnEmptyRefNumReprinting()throws Exception{
        click(walletServicesPageObjects.ReceiptReprinting(), "Wallet Services Receipt Reprinting");
        click(walletServicesPageObjects.CashInOwnReprinting(), "Cash In to Own Account Receipt");
        if(isVisible(walletServicesPageObjects.CashInOwnPage(), getText(walletServicesPageObjects.CashInOwnPage()))){
            LoggingUtils.info("Navigated the Cash In to Own Account Receipt page");
        }
        type(walletServicesPageObjects.RefKTPN(), "Reference Number","");
        click(walletServicesPageObjects.Reprint(), "Search Button");
        assertEqual(getText(walletServicesPageObjects.EmptyRefReprinting()), "KPTN is required");

    }


    // WALLET SERVICES / RECEIPT REPRINTING / Cash In To Another Account
    public void validateSuccessfulCashInAnotherAccReprinting()throws Exception{
        click(walletServicesPageObjects.ReceiptReprinting(), "Wallet Services Receipt Reprinting");
        click(walletServicesPageObjects.BranchCashInReprinting(), "Cash In to Own Account Receipt");
        if(isVisible(walletServicesPageObjects.BranchCashInPage(), getText(walletServicesPageObjects.BranchCashInPage()))){
            LoggingUtils.info("Navigated the Cash In to Another Account Receipt page");
        }
        type(walletServicesPageObjects.RefKTPN(), "Reference Number","ACALDSSQYXH");
        click(walletServicesPageObjects.Reprint(), "Search Button");
        if(isVisible(walletServicesPageObjects.ReprintBranchCashInReceipt(), getText(walletServicesPageObjects.ReprintBranchCashInReceipt()))){
            LoggingUtils.info("Navigated the Cash In to Another Account Receipt page");
            click(walletServicesPageObjects.PrintReceipt(), "Print Receipt");
//            click(payoutPageObjects.PrintButton(), "Print");
            LoggingUtils.info("Successful in printing Cash In to Another Account Receipt");

        }
    }
    public void validateCashInAnotherAccInvalidRefNumReprinting()throws Exception{
        click(walletServicesPageObjects.ReceiptReprinting(), "Wallet Services Receipt Reprinting");
        click(walletServicesPageObjects.BranchCashInReprinting(), "Cash In to Own Account Receipt");
        if(isVisible(walletServicesPageObjects.BranchCashInPage(), getText(walletServicesPageObjects.BranchCashInPage()))){
            LoggingUtils.info("Navigated the Cash In to Another Account Receipt page");
        }
        type(walletServicesPageObjects.RefKTPN(), "Reference Number","ACALDQYXH");
        click(walletServicesPageObjects.Reprint(), "Search Button");
        assertEqual(getText(walletServicesPageObjects.InvalidRefReprinting()), "Warning");
        LoggingUtils.info("Warning" + "Transaction reference number not found.");

    }
    public void validateCashInAnotherAccCompleteInvalidRefNumReprinting()throws Exception{
        click(walletServicesPageObjects.ReceiptReprinting(), "Wallet Services Receipt Reprinting");
        click(walletServicesPageObjects.BranchCashInReprinting(), "Cash In to Own Account Receipt");
        if(isVisible(walletServicesPageObjects.BranchCashInPage(), getText(walletServicesPageObjects.BranchCashInPage()))){
            LoggingUtils.info("Navigated the Cash In to Another Account Receipt page");
        }
        type(walletServicesPageObjects.RefKTPN(), "Reference Number","ACIWICTZLCH");
        click(walletServicesPageObjects.Reprint(), "Search Button");
        assertEqual(getText(walletServicesPageObjects.CompleteInvalidRefReprinting()), "Wrong transaction type");
        LoggingUtils.info("Wrong transaction type" + "Reference number does not match transaction type.");

    }
    public void validateCashInAnotherAccEmptyRefNumReprinting()throws Exception{
        click(walletServicesPageObjects.ReceiptReprinting(), "Wallet Services Receipt Reprinting");
        click(walletServicesPageObjects.BranchCashInReprinting(), "Cash In to Own Account Receipt");
        if(isVisible(walletServicesPageObjects.BranchCashInPage(), getText(walletServicesPageObjects.BranchCashInPage()))){
            LoggingUtils.info("Navigated the Cash In to Another Account Receipt page");
        }
        type(walletServicesPageObjects.RefKTPN(), "Reference Number","");
        click(walletServicesPageObjects.Reprint(), "Search Button");
        assertEqual(getText(walletServicesPageObjects.EmptyRefReprinting()), "KPTN is required");

    }

    // WALLET SERVICES / RECEIPT REPRINTING / Cash Out
    public void validateSuccessfulCashOutReprinting()throws Exception{
        click(walletServicesPageObjects.ReceiptReprinting(), "Wallet Services Receipt Reprinting");
        click(walletServicesPageObjects.CashOutReprinting(), "Cash Out Receipt");
        if(isVisible(walletServicesPageObjects.CashOutPage(), getText(walletServicesPageObjects.CashOutPage()))){
            LoggingUtils.info("Navigated the Cash Out Receipt page");
        }
        type(walletServicesPageObjects.RefKTPN(), "Reference Number","ACONEOMWVSL");
        click(walletServicesPageObjects.Reprint(), "Search Button");
        if(isVisible(walletServicesPageObjects.ReprintCashOutReceipt(), getText(walletServicesPageObjects.ReprintCashOutReceipt()))){
            LoggingUtils.info("Navigated the Cash Out Receipt page");
            click(walletServicesPageObjects.PrintReceipt(), "Print Receipt");
//            click(payoutPageObjects.PrintButton(), "Print");
            LoggingUtils.info("Successful in printing Cash Out Receipt");

        }
    }
    public void validateCashOutInvalidRefNumReprinting()throws Exception{
        click(walletServicesPageObjects.ReceiptReprinting(), "Wallet Services Receipt Reprinting");
        click(walletServicesPageObjects.CashOutReprinting(), "Cash Out Receipt");
        if(isVisible(walletServicesPageObjects.CashOutPage(), getText(walletServicesPageObjects.CashOutPage()))){
            LoggingUtils.info("Navigated the Cash Out Receipt page");
        }
        type(walletServicesPageObjects.RefKTPN(), "Reference Number","ACASQYXH");
        click(walletServicesPageObjects.Reprint(), "Search Button");
        assertEqual(getText(walletServicesPageObjects.InvalidRefReprinting()), "Warning");
        LoggingUtils.info("Warning" + "Transaction reference number not found.");

    }
    public void validateCashOutCompleteInvalidRefNumReprinting()throws Exception{
        click(walletServicesPageObjects.ReceiptReprinting(), "Wallet Services Receipt Reprinting");
        click(walletServicesPageObjects.CashOutReprinting(), "Cash Out Receipt");
        if(isVisible(walletServicesPageObjects.CashOutPage(), getText(walletServicesPageObjects.CashOutPage()))){
            LoggingUtils.info("Navigated the Cash Out Receipt Receipt page");
        }
        type(walletServicesPageObjects.RefKTPN(), "Reference Number","ACALDSSQYXH");
        click(walletServicesPageObjects.Reprint(), "Search Button");
        assertEqual(getText(walletServicesPageObjects.CompleteInvalidRefReprinting()), "Wrong transaction type");
        LoggingUtils.info("Wrong transaction type" + "Reference number does not match transaction type.");

    }
    public void validateCashOutEmptyRefNumReprinting()throws Exception{
        click(walletServicesPageObjects.ReceiptReprinting(), "Wallet Services Receipt Reprinting");
        click(walletServicesPageObjects.CashOutReprinting(), "Cash Out Receipt");
        if(isVisible(walletServicesPageObjects.CashOutPage(), getText(walletServicesPageObjects.CashOutPage()))){
            LoggingUtils.info("Navigated the Cash Out Receipt page");
        }
        type(walletServicesPageObjects.RefKTPN(), "Reference Number","");
        click(walletServicesPageObjects.Reprint(), "Search Button");
        assertEqual(getText(walletServicesPageObjects.EmptyRefReprinting()), "KPTN is required");

    }

    // WALLET SERVICES / RECEIPT REPRINTING / Kwarta Padala Payout
    public void validateSuccessfulKPPayoutReprinting()throws Exception{
        click(walletServicesPageObjects.ReceiptReprinting(), "Wallet Services Receipt Reprinting");
        click(walletServicesPageObjects.KPPayoutReprinting(), "Kwarta Padala Payout Receipt");
        if(isVisible(walletServicesPageObjects.KPPayoutPage(), getText(walletServicesPageObjects.KPPayoutPage()))){
            LoggingUtils.info("Navigated the Kwarta Padala Payout Receipt page");
        }
        type(walletServicesPageObjects.RefKTPN(), "Reference Number","AKPCKWDKPXZ");
        click(walletServicesPageObjects.Reprint(), "Search Button");
        if(isVisible(walletServicesPageObjects.ReprintKPPayoutReceipt(), getText(walletServicesPageObjects.ReprintKPPayoutReceipt()))){
            LoggingUtils.info("Navigated the Kwarta Padala Payout Receipt page");
            click(walletServicesPageObjects.PrintReceipt(), "Print Receipt");
//            click(payoutPageObjects.PrintButton(), "Print");
            LoggingUtils.info("Successful in printing Kwarta Padala Payout Receipt");

        }
    }
    public void validateKPPayoutInvalidRefNumReprinting()throws Exception{
        click(walletServicesPageObjects.ReceiptReprinting(), "Wallet Services Receipt Reprinting");
        click(walletServicesPageObjects.KPPayoutReprinting(), "Kwarta Padala Payout Receipt");
        if(isVisible(walletServicesPageObjects.KPPayoutPage(), getText(walletServicesPageObjects.KPPayoutPage()))){
            LoggingUtils.info("Navigated the Kwarta Padala Payout Receipt page");
        }
        type(walletServicesPageObjects.RefKTPN(), "Reference Number","ACALSQYXH");
        click(walletServicesPageObjects.Reprint(), "Search Button");
        assertEqual(getText(walletServicesPageObjects.InvalidRefReprinting()), "Warning");
        LoggingUtils.info("Warning" +
                "Transaction reference number not found. (version: c4f7d23)");

    }
    public void validateKPPayoutCompleteInvalidRefNumReprinting()throws Exception{
        click(walletServicesPageObjects.ReceiptReprinting(), "Wallet Services Receipt Reprinting");
        click(walletServicesPageObjects.KPPayoutReprinting(), "Kwarta Padala Payout Receipt");
        if(isVisible(walletServicesPageObjects.KPPayoutPage(), getText(walletServicesPageObjects.KPPayoutPage()))){
            LoggingUtils.info("Navigated the Kwarta Padala Payout Receipt page");
        }
        type(walletServicesPageObjects.RefKTPN(), "Reference Number","ACONEOMWVSL");
        click(walletServicesPageObjects.Reprint(), "Search Button");
        assertEqual(getText(walletServicesPageObjects.CompleteInvalidRefReprinting()), "Wrong transaction type");
        LoggingUtils.info("Wrong transaction type" + "Reference number does not match transaction type.");

    }
    public void validateKPPayoutEmptyRefNumReprinting()throws Exception{
        click(walletServicesPageObjects.ReceiptReprinting(), "Wallet Services Receipt Reprinting");
        click(walletServicesPageObjects.KPPayoutReprinting(), "Kwarta Padala Payout Receipt");
        if(isVisible(walletServicesPageObjects.KPPayoutPage(), getText(walletServicesPageObjects.KPPayoutPage()))){
            LoggingUtils.info("Navigated the Kwarta Padala Payout Receipt page");
        }
        type(walletServicesPageObjects.RefKTPN(), "Reference Number","");
        click(walletServicesPageObjects.Reprint(), "Search Button");
        assertEqual(getText(walletServicesPageObjects.EmptyRefReprinting()), "KPTN is required");

    }

}

