package mlkpx.testSteps;

import org.testng.Assert;
import utilities.ExtentReport.ExtentReporter;

import java.util.Collections;
import java.util.List;

public class WalletServicesTransactional_Steps extends Base_Steps{
    public void navigationWalletServices()throws Exception{
        click(wsCashInToOwnAccountPageObjects.walletServicesLink(), "Wallet Services Page ");
        if(isVisible(wsCashInToOwnAccountPageObjects.walletServicesText(), getText(wsCashInToOwnAccountPageObjects.walletServicesText()))){
            ExtentReporter.logPass("Wallet Services navigation", "Successfully Validated Wallet Services Page");
        }else{
            ExtentReporter.logFail("Wallet Services navigation", "Failed to Validate Wallet Services Page");
            Assert.fail("Failed to Validate Wallet Services Page");
        }
    }
    public void CIOA_TC_01()throws Exception {
        navigationWalletServices();
        String randomReferenceNum = reader.getRandomWriteCashIn_Kptn();
        type(wsCashInToOwnAccountPageObjects.referenceNumField(), "Reference Number Field", randomReferenceNum);
        click(wsCashInToOwnAccountPageObjects.searchButton(), "Search Button");
        waitSleep(3000);
        if (isVisible(wsCashInToOwnAccountPageObjects.cashInText(), getText(wsCashInToOwnAccountPageObjects.cashInText()))) {
            ExtentReporter.logPass("CIOA_TC_01", "Successfully Redirected to Cash In Transaction Information");
        } else {
            ExtentReporter.logFail("CIOA_TC_01", "Failed to Redirected to Cash In Transaction Information");
            Assert.fail("Failed to Redirected to Cash In Transaction Information");
        }
        String totalAmountText = getText(wsCashInToOwnAccountPageObjects.totalAmount());
        List<String> totalAmountValues = Collections.singletonList(totalAmountText);
        totalAmountText = totalAmountText.replaceAll("[^\\d.]", "").replace(",", ".");
        double totalAmount = Double.parseDouble(totalAmountText);
        reader.writeTotalAmountData(totalAmountValues);

        String tenderAmount = propertyReader.getproperty("tenderAmount");
        List<String> updatedTenderAmountValues = Collections.singletonList(tenderAmount);
        tenderAmount = tenderAmount.replaceAll("[^\\d.]", "").replace(",", ".");
        double tenderAmountValue = Double.parseDouble(tenderAmount);
//        double updatedTenderAmount = tenderAmountValue + Double.parseDouble(totalAmountText);
        double updatedTenderAmount = tenderAmountValue + totalAmount;

        String updatedTenderAmountText = String.valueOf(updatedTenderAmount);
        type(wsCashInToOwnAccountPageObjects.tenderAmountField(), "Tender Amount Field", updatedTenderAmountText);
        updatedTenderAmountValues = Collections.singletonList(updatedTenderAmountText);
        reader.writeTenderAmountData(updatedTenderAmountValues);
        click(wsCashInToOwnAccountPageObjects.cancelButton(), "Cancel Button");
        click(wsCashInToOwnAccountPageObjects.noStayOnThisPageButton(), "No, Stay On This Page Button");
        click(wsCashInToOwnAccountPageObjects.proceedButton(), "Proceed Button");
        click(wsCashInToOwnAccountPageObjects.cancelInProceedButton(), "Cancel Button");
        click(wsCashInToOwnAccountPageObjects.proceedButton(), "Proceed Button");
        click(wsCashInToOwnAccountPageObjects.confirmCashInButton(), "Confirm Cash In Button");
        waitSleep(2000);
        if (isVisible(wsCashInToOwnAccountPageObjects.cashInSuccessfulText(), getText(wsCashInToOwnAccountPageObjects.cashInSuccessfulText()))) {
            ExtentReporter.logPass("Cash In Successful", "Successfully Cash In");
        } else {
            ExtentReporter.logFail("Cash In Successful", "Failed to Cash In");
            Assert.fail("Failed to Cash In");
        }
        click(wsCashInToOwnAccountPageObjects.proceedToPrintingButton(), "Proceed To Printing Button");
        waitSleep(3000);
        click(wsCashInToOwnAccountPageObjects.cancelReceiptButton(), "Cancel Button");

    }

    public void CIOA_TC_03()throws Exception{
        navigationWalletServices();
        String randomReferenceNum = reader.getRandomWriteCashIn_Kptn();
        type(wsCashInToOwnAccountPageObjects.referenceNumField(), "Reference Number Field", randomReferenceNum);
        click(wsCashInToOwnAccountPageObjects.searchButton(), "Search Button");
        waitSleep(3000);
        if(isVisible(wsCashInToOwnAccountPageObjects.cashInText(), getText(wsCashInToOwnAccountPageObjects.cashInText()))){
            ExtentReporter.logPass("CIOA_TC_01", "Successfully Redirected to Cash In Transaction Information");
        }else{
            ExtentReporter.logFail("CIOA_TC_01", "Failed to Redirected to Cash In Transaction Information");
            Assert.fail("Failed to Redirected to Cash In Transaction Information");
        }
        String totalAmountText = getText(wsCashInToOwnAccountPageObjects.totalAmount());
        List<String> totalAmountValues = Collections.singletonList(totalAmountText);
        totalAmountText = totalAmountText.replaceAll("[^\\d.]", "").replace(",", ".");
        double totalAmount = Double.parseDouble(totalAmountText);
        reader.writeTotalAmountData(totalAmountValues);

        String tenderAmount = propertyReader.getproperty("tenderAmount");
        List<String> updatedTenderAmountValues = Collections.singletonList(tenderAmount);
        tenderAmount = tenderAmount.replaceAll("[^\\d.]", "").replace(",", ".");
        double tenderAmountValue = Double.parseDouble(tenderAmount);
//        double updatedTenderAmount = tenderAmountValue + Double.parseDouble(totalAmountText);
        double updatedTenderAmount = tenderAmountValue + totalAmount;

        String updatedTenderAmountText = String.valueOf(updatedTenderAmount);
        type(wsCashInToOwnAccountPageObjects.tenderAmountField(), "Tender Amount Field", updatedTenderAmountText);
        updatedTenderAmountValues = Collections.singletonList(updatedTenderAmountText);
        reader.writeTenderAmountData(updatedTenderAmountValues);
        click(wsCashInToOwnAccountPageObjects.cancelButton(), "Cancel Button");
        click(wsCashInToOwnAccountPageObjects.noStayOnThisPageButton(), "No, Stay On This Page Button");
        click(wsCashInToOwnAccountPageObjects.proceedButton(), "Proceed Button");
        click(wsCashInToOwnAccountPageObjects.cancelInProceedButton(), "Cancel Button");
        click(wsCashInToOwnAccountPageObjects.proceedButton(), "Proceed Button");
        click(wsCashInToOwnAccountPageObjects.confirmCashInButton(), "Confirm Cash In Button");
        waitSleep(2000);
        click(wsCashInToOwnAccountPageObjects.proceedToPrintingButton(), "Proceed To Printing Button");
        if(isVisible(wsCashInToOwnAccountPageObjects.detailsReceipt(), getText(wsCashInToOwnAccountPageObjects.detailsReceipt()))){
            ExtentReporter.logPass("Cash In Successful", "Successfully Cash In Verify Receipt");
        }else{
            ExtentReporter.logFail("Cash In Successful", "Failed to Cash In Verify Receipt");
            Assert.fail("Failed to Cash In");
        }
        click(wsCashInToOwnAccountPageObjects.cancelReceiptButton(), "Cancel Button");

    }

    public void CIOA_TC_11()throws Exception{
        navigationWalletServices();
        click(sendOutPageObjects.yesRadioButton(), "Yes Button ");
        waitSleep(3000);
        type(sendOutPageObjects.branchField(), "Branch Code Field", propertyReader.getproperty("validBranch_code"));
        waitSleep(3000);
//        LoggingUtils.info(sendOutPageObjects.branchName().getText());
//        assertEqual(getValue(sendOutPageObjects.branchName()), propertyReader.getproperty("BranchName"));
//        ExtentReporter.logPass("DS_TC_02", "Successfully Validated Sendout Transaction Option");
        type(wsKwartaPadalaPayOutPageObjects.operatorIDField(), "Operator ID Field", propertyReader.getproperty("operatorID"));
        type(wsKwartaPadalaPayOutPageObjects.reasonField(), "Reason Field", propertyReader.getproperty("Reason"));

        String randomReferenceNum = reader.getRandomWriteCashIn_Kptn();
        type(wsCashInToOwnAccountPageObjects.referenceNumField(), "Reference Number Field", randomReferenceNum);
        click(wsCashInToOwnAccountPageObjects.searchButton(), "Search Button");
        waitSleep(3000);
        if(isVisible(wsCashInToOwnAccountPageObjects.cashInText(), getText(wsCashInToOwnAccountPageObjects.cashInText()))){
            ExtentReporter.logPass("CIOA_TC_01", "Successfully Redirected to Cash In Transaction Information");
        }else{
            ExtentReporter.logFail("CIOA_TC_01", "Failed to Redirected to Cash In Transaction Information");
            Assert.fail("Failed to Redirected to Cash In Transaction Information");
        }
        String totalAmountText = getText(wsCashInToOwnAccountPageObjects.totalAmount());
        List<String> totalAmountValues = Collections.singletonList(totalAmountText);
        totalAmountText = totalAmountText.replaceAll("[^\\d.]", "").replace(",", ".");
        double totalAmount = Double.parseDouble(totalAmountText);
        reader.writeTotalAmountData(totalAmountValues);

        String tenderAmount = propertyReader.getproperty("tenderAmount");
        List<String> updatedTenderAmountValues = Collections.singletonList(tenderAmount);
        tenderAmount = tenderAmount.replaceAll("[^\\d.]", "").replace(",", ".");
        double tenderAmountValue = Double.parseDouble(tenderAmount);
//        double updatedTenderAmount = tenderAmountValue + Double.parseDouble(totalAmountText);
        double updatedTenderAmount = tenderAmountValue + totalAmount;

        String updatedTenderAmountText = String.valueOf(updatedTenderAmount);
        type(wsCashInToOwnAccountPageObjects.tenderAmountField(), "Tender Amount Field", updatedTenderAmountText);
        updatedTenderAmountValues = Collections.singletonList(updatedTenderAmountText);
        reader.writeTenderAmountData(updatedTenderAmountValues);
        click(wsCashInToOwnAccountPageObjects.cancelButton(), "Cancel Button");
        click(wsCashInToOwnAccountPageObjects.noStayOnThisPageButton(), "No, Stay On This Page Button");
        click(wsCashInToOwnAccountPageObjects.proceedButton(), "Proceed Button");
        click(wsCashInToOwnAccountPageObjects.cancelInProceedButton(), "Cancel Button");
        click(wsCashInToOwnAccountPageObjects.proceedButton(), "Proceed Button");
        click(wsCashInToOwnAccountPageObjects.confirmCashInButton(), "Confirm Cash In Button");
        waitSleep(2000);
        click(wsCashInToOwnAccountPageObjects.proceedToPrintingButton(), "Proceed To Printing Button");
        if(isVisible(wsCashInToOwnAccountPageObjects.detailsReceipt(), getText(wsCashInToOwnAccountPageObjects.detailsReceipt()))){
            ExtentReporter.logPass("Cash In Successful", "Successfully Cash In Remote");
        }else{
            ExtentReporter.logFail("Cash In Successful", "Failed to Cash In Remote");
            Assert.fail("Failed to Cash In Remote");
        }
        click(wsCashInToOwnAccountPageObjects.cancelReceiptButton(), "Cancel Button");
    }



    public void CO_TC_01()throws Exception{
        navigationWalletServices();
        String randomReferenceNum = reader.getRandomCashOutReferenceNum();
        type(wsCashOutPageObjects.referenceNumField(), "Reference Number Field", randomReferenceNum);
        click(wsCashOutPageObjects.searchButton(),"Search Button");
        if(isVisible(wsCashOutPageObjects.informationText(), getText(wsCashOutPageObjects.informationText()))){
            ExtentReporter.logPass("CO_TC_01", "Successfully Review the Transactions");
        }else{
            ExtentReporter.logFail("CO_TC_01", "Failed to Review the Transactions");
            Assert.fail("Failed to Review the Transactions");
        }
        click(wsCashOutPageObjects.cancelButton(),"Cancel Button");
        click(wsCashOutPageObjects.noStayOnThisPageButton(),"No Stay On this Posistion");
        click(wsCashOutPageObjects.proceedButton(),"Proceed Button");
        click(wsCashOutPageObjects.cancelButtonInProceed(), "Cancel Button");
        click(wsCashOutPageObjects.proceedButton(),"Proceed Button");
        click(wsCashOutPageObjects.confirmCashOut(),"Confirm Cash Out");
        waitSleep(4000);
        if(isVisible(wsCashOutPageObjects.cashOutSuccessfulText(), getText(wsCashOutPageObjects.cashOutSuccessfulText()))){
            ExtentReporter.logPass("CO_TC_01", "Transaction successfully process.");
        }else{
            ExtentReporter.logFail("CO_TC_01", "Failed to process Transactions");
            Assert.fail("Failed to process Transactions");
        }
        click(wsCashOutPageObjects.proceedButtonToReceipt(),"Proceed To Printing");
        click(wsCashOutPageObjects.cancelButtonInReceipt(),"Cancel Button Receipt");
    }


    public void CO_TC_03()throws Exception{
        navigationWalletServices();
        String randomReferenceNum = reader.getRandomCashOutReferenceNum();
        type(wsCashOutPageObjects.referenceNumField(), "Reference Number Field", randomReferenceNum);
        click(wsCashOutPageObjects.searchButton(),"Search Button");
        if(isVisible(wsCashOutPageObjects.informationText(), getText(wsCashOutPageObjects.informationText()))){
            ExtentReporter.logPass("CO_TC_01", "Successfully Review the Transactions");
        }else{
            ExtentReporter.logFail("CO_TC_01", "Failed to Review the Transactions");
            Assert.fail("Failed to Review the Transactions");
        }
        click(wsCashOutPageObjects.cancelButton(),"Cancel Button");
        click(wsCashOutPageObjects.noStayOnThisPageButton(),"No Stay On this Posistion");
        click(wsCashOutPageObjects.proceedButton(),"Proceed Button");
        click(wsCashOutPageObjects.cancelButtonInProceed(), "Cancel Button");
        click(wsCashOutPageObjects.proceedButton(),"Proceed Button");
        click(wsCashOutPageObjects.confirmCashOut(),"Confirm Cash Out");
        waitSleep(4000);
        if(isVisible(wsCashOutPageObjects.cashOutSuccessfulText(), getText(wsCashOutPageObjects.cashOutSuccessfulText()))){
            ExtentReporter.logPass("CO_TC_01", "Transaction successfully process.");
        }else{
            ExtentReporter.logFail("CO_TC_01", "Failed to process Transactions");
            Assert.fail("Failed to process Transactions");
        }
        click(wsCashOutPageObjects.proceedButtonToReceipt(),"Proceed To Printing");
        if(isVisible(wsCashOutPageObjects.transactionReceipt(), getText(wsCashOutPageObjects.transactionReceipt()))){
            ExtentReporter.logPass("CO_TC_03", "Successfully Verify Transaction Receipt");
        }else{
            ExtentReporter.logFail("CO_TC_03", "Failed to Verify Transaction Receipt");
            Assert.fail("Failed to Verify Transaction Receipt");
        }
        click(wsCashOutPageObjects.cancelButtonInReceipt(),"Cancel Button Receipt");
    }

    public void CO_TC_08()throws Exception{
        navigationWalletServices();
        click(sendOutPageObjects.yesRadioButton(), "Yes Button ");
        waitSleep(3000);
        type(sendOutPageObjects.branchField(), "Branch Code Field", propertyReader.getproperty("validBranch_code"));
        waitSleep(3000);
//        LoggingUtils.info(sendOutPageObjects.branchName().getText());
//        assertEqual(getValue(sendOutPageObjects.branchName()), propertyReader.getproperty("BranchName"));
//        ExtentReporter.logPass("DS_TC_02", "Successfully Validated Sendout Transaction Option");
        type(wsKwartaPadalaPayOutPageObjects.operatorIDField(), "Operator ID Field", propertyReader.getproperty("operatorID"));
        type(wsKwartaPadalaPayOutPageObjects.reasonField(), "Reason Field", propertyReader.getproperty("Reason"));

        String randomReferenceNum = reader.getRandomWriteCashIn_Kptn();
        type(wsCashInToOwnAccountPageObjects.referenceNumField(), "Reference Number Field", randomReferenceNum);
        click(wsCashInToOwnAccountPageObjects.searchButton(), "Search Button");
        waitSleep(3000);
        if(isVisible(wsCashInToOwnAccountPageObjects.cashInText(), getText(wsCashInToOwnAccountPageObjects.cashInText()))){
            ExtentReporter.logPass("CIOA_TC_01", "Successfully Redirected to Cash In Transaction Information");
        }else{
            ExtentReporter.logFail("CIOA_TC_01", "Failed to Redirected to Cash In Transaction Information");
            Assert.fail("Failed to Redirected to Cash In Transaction Information");
        }
        String totalAmountText = getText(wsCashInToOwnAccountPageObjects.totalAmount());
        List<String> totalAmountValues = Collections.singletonList(totalAmountText);
        totalAmountText = totalAmountText.replaceAll("[^\\d.]", "").replace(",", ".");
        double totalAmount = Double.parseDouble(totalAmountText);
        reader.writeTotalAmountData(totalAmountValues);

        String tenderAmount = propertyReader.getproperty("tenderAmount");
        List<String> updatedTenderAmountValues = Collections.singletonList(tenderAmount);
        tenderAmount = tenderAmount.replaceAll("[^\\d.]", "").replace(",", ".");
        double tenderAmountValue = Double.parseDouble(tenderAmount);
//        double updatedTenderAmount = tenderAmountValue + Double.parseDouble(totalAmountText);
        double updatedTenderAmount = tenderAmountValue + totalAmount;

        String updatedTenderAmountText = String.valueOf(updatedTenderAmount);
        type(wsCashInToOwnAccountPageObjects.tenderAmountField(), "Tender Amount Field", updatedTenderAmountText);
        updatedTenderAmountValues = Collections.singletonList(updatedTenderAmountText);
        reader.writeTenderAmountData(updatedTenderAmountValues);
        click(wsCashInToOwnAccountPageObjects.cancelButton(), "Cancel Button");
        click(wsCashInToOwnAccountPageObjects.noStayOnThisPageButton(), "No, Stay On This Page Button");
        click(wsCashInToOwnAccountPageObjects.proceedButton(), "Proceed Button");
        click(wsCashInToOwnAccountPageObjects.cancelInProceedButton(), "Cancel Button");
        click(wsCashInToOwnAccountPageObjects.proceedButton(), "Proceed Button");
        click(wsCashInToOwnAccountPageObjects.confirmCashInButton(), "Confirm Cash In Button");
        waitSleep(2000);
        click(wsCashInToOwnAccountPageObjects.proceedToPrintingButton(), "Proceed To Printing Button");
        if(isVisible(wsCashInToOwnAccountPageObjects.detailsReceipt(), getText(wsCashInToOwnAccountPageObjects.detailsReceipt()))){
            ExtentReporter.logPass("Cash In Successful", "Successfully Cash In Remote");
        }else{
            ExtentReporter.logFail("Cash In Successful", "Failed to Cash In Remote");
            Assert.fail("Failed to Cash In Remote");
        }
        click(wsCashInToOwnAccountPageObjects.cancelReceiptButton(), "Cancel Button");
    }
}
