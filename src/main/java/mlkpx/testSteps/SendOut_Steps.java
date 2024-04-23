package mlkpx.testSteps;


import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SendOut_Steps extends Base_Steps{

    public void navigationFOrSendOutDomestic()throws Exception{
        click(sendOutPageObjects.sendOutLink(), "SendOut Page ");
    }

    public void DS_TC_01()throws Exception{ //Test Case for Verify Navigation for SendOut Domestic
        navigationFOrSendOutDomestic();
        if(isVisible(sendOutPageObjects.sendOutTransaction(), getText(sendOutPageObjects.sendOutTransaction()))){
            ExtentReporter.logPass("DS_TC_01", "Successfully Validated SendOut Domestic Page Navigation");
            LoggingUtils.info("Successfully Navigate for SendOut Domestic Page ");
        }else{
            ExtentReporter.logFail("DS_TC_01", "Failed to Validate SendOut Domestic Page Navigation");
            LoggingUtils.info("Failed to Validate SendOut Domestic Page Navigation ");
        }
    }
    public void DS_TC_02()throws Exception { // Test Case for Sendout Transaction Option
        navigationFOrSendOutDomestic();
        click(sendOutPageObjects.yesRadioButton(), "Yes Button ");
        waitSleep(3000);
        type(sendOutPageObjects.branchField(), "Branch Code Field", propertyReader.getproperty("invalidBranch_code"));
        waitSleep(2000); //hard wait for 2 seconds
        isVisible(sendOutPageObjects.branchNotFoundText(), "Branch not found text");
        clearField(sendOutPageObjects.branchField());
        type(sendOutPageObjects.branchField(), "Branch Code Field", propertyReader.getproperty("validBranch_code"));
        waitSleep(3000);
        LoggingUtils.info(sendOutPageObjects.branchName().getText());
        assertEqual(getValue(sendOutPageObjects.branchName()), propertyReader.getproperty("BranchName"));
        ExtentReporter.logPass("DS_TC_02", "Successfully Validated Sendout Transaction Option");
    }

    public void DS_TC_03()throws Exception {
        navigationFOrSendOutDomestic();
        searchKYC();
        waitSleep(2000);
        if(isChecked(sendOutPageObjects.smsCheckbox())){
            LoggingUtils.info("Checkbox is checked!");
        }else{
            LoggingUtils.info("Checkbox is not checked!");
            ExtentReporter.logFail("DS_TC_03", "Failed to Validate Search Kyc in SendOut Domestic");
        }
        ExtentReporter.logPass("DS_TC_03", "Successfully Validated Search Kyc in SendOut Domestic");
    }

    public void DS_TC_04()throws Exception{
        navigationFOrSendOutDomestic();
        searchKYC();
        addReceiver();
        if(isVisible(sendOutPageObjects.provinceDanger(), getText(sendOutPageObjects.provinceDanger()))){
            ExtentReporter.logPass("DS_TC_04", "Successfully Add New Receiver in Sendout");
            LoggingUtils.info("Successfully Add New Receiver in Sendout");
        }else{
            ExtentReporter.logFail("DS_TC_04", "Fail to Add New Receiver in Sendout");
            LoggingUtils.error("Fail to Add New Receiver in Sendout");
        }
    }

    public void DS_TC_05()throws Exception{
        navigationFOrSendOutDomestic();
        searchKYC();
        click(sendOutPageObjects.searchReceivers(), "Search Receivers Button ");
        scrollDown(100);
        LoggingUtils.info(getText(sendOutPageObjects.name_Text(1)));
        String selectedReceiverName = getText(sendOutPageObjects.name_Text(1));
        click(sendOutPageObjects.selectButton(),"Select Button");
        scrollToElement(sendOutPageObjects.no_ContactNo());
        click(sendOutPageObjects.no_ContactNo(), "Check no Contact Number ");
        waitSleep(3000);
        String value = getValue(sendOutPageObjects.r_LastName());
        String[] receiverNames = selectedReceiverName.split(",");
        boolean containsName = false;
        for (String name : receiverNames) {
            if (value.contains(name.trim())) { //loops the lastname text until comma
                containsName = true;
                break;
            }
        }
        if(containsName){
            ExtentReporter.logPass("DS_TC_05", "Successfully Validate Search Receiver  ");
            LoggingUtils.info("Successfully Validate Search Receiver  " );
        }else{
            ExtentReporter.logFail("DS_TC_05", "Failed to Validate Search Receiver  ");
            LoggingUtils.error("Failed to Validate Search Receiver " + getValue(sendOutPageObjects.r_LastName()) + " Expected " + selectedReceiverName);
            Assert.fail("Failure due to Incorrect Details"); //assert the script to fail in testng
        }
    }

    public void DS_TC_06_07()throws Exception{
        navigationFOrSendOutDomestic();
        searchKYC();
        searchReceiver();
//        scrollToElement(sendOutPageObjects.no_ContactNo());
//        click(sendOutPageObjects.no_ContactNo(), "Check no Contact Number ");
        scrollUp(driver);
        click(sendOutPageObjects.sourceOfFund(), "Source of Fund field ");
        type(sendOutPageObjects.sourceOfFund(), "Source of Fund field ", propertyReader.getproperty("source_of_fund"));
        type(sendOutPageObjects.purpose(), "Purpose field ", propertyReader.getproperty("purpose"));
        type(sendOutPageObjects.relationToReceiver(), "Relation to Receiver field ", propertyReader.getproperty("relationshiptoreceiver"));
        type(sendOutPageObjects.messageToReceiver(), "Message to Receiver field ", propertyReader.getproperty("messagetoreceiver"));
        assertEqual(getValue(sendOutPageObjects.sourceOfFund()), propertyReader.getproperty("source_of_fund"));
        assertEqual(getValue(sendOutPageObjects.purpose()), propertyReader.getproperty("purpose"));
        assertEqual(getValue(sendOutPageObjects.relationToReceiver()), propertyReader.getproperty("relationshiptoreceiver"));
        assertEqual(getValue(sendOutPageObjects.messageToReceiver()), propertyReader.getproperty("messagetoreceiver"));
        scrollToElement(sendOutPageObjects.principalAmount());
        type(sendOutPageObjects.principalAmount(), "Principal Amount field ", propertyReader.getproperty("principal_amount_empty"));
        click(sendOutPageObjects.chargeText(), "Charge Text");
        if(isVisible(sendOutPageObjects.emptyValueText(), getText((sendOutPageObjects.emptyValueText())))) {
            ExtentReporter.logPass("Empty Value", "Valid Amount is required");
        }
        type(sendOutPageObjects.principalAmount(), "Principal Amount field ", propertyReader.getproperty("principal_amount0"));
        if(isVisible(sendOutPageObjects.display0Text(), getText((sendOutPageObjects.display0Text())))){
            ExtentReporter.logPass("Input Amount (Zero)", "Min allowed amount is PHP 1.00");
        }
        clearField(sendOutPageObjects.principalAmount());
        type(sendOutPageObjects.principalAmount(), "Principal Amount field ", propertyReader.getproperty("negative_principal_amount"));
        if(isVisible(sendOutPageObjects.negativeDisplayText(), getText((sendOutPageObjects.negativeDisplayText())))){
            ExtentReporter.logPass("Input Amount (Negative Value)", "Value must be greater than or equal to 0");
        }
        clearField(sendOutPageObjects.principalAmount());

        type(sendOutPageObjects.principalAmount(), "Valid Principal Amount field ", propertyReader.getproperty("firstAmount"));
        waitSleep(3000);
        assertEqual(getText(sendOutPageObjects.chargeAmount()), propertyReader.getproperty("minCharge"));
        clearField(sendOutPageObjects.principalAmount());

        type(sendOutPageObjects.principalAmount(), "Valid Principal Amount field ", propertyReader.getproperty("lastAmount"));
        waitSleep(3000);
        assertEqual(getText(sendOutPageObjects.chargeAmount()), propertyReader.getproperty("maxCharge"));
        waitSleep(3000);

        if(isTotalCorrect()){
            ExtentReporter.logPass("Total Computation", "is Correct");
        }else{
            ExtentReporter.logFail("Total Computation", "is not Correct");
            Assert.fail("Total Computation is not correct");
        }
    }
    public boolean isTotalCorrect() throws Exception {
        double principalAmt = parseTotalValue(getValue(sendOutPageObjects.principalAmount()));
        double chargeAmt = parseTotalValue(getText(sendOutPageObjects.chargeAmount()));
        double otherChargeAmt = parseTotalValue(getText(sendOutPageObjects.otherChargeAmount()));
        double totalAmt = parseTotalValue(getText(sendOutPageObjects.totalAmount()));
        double expectedTotal = principalAmt + chargeAmt + otherChargeAmt;
        assertEqual(totalAmt, expectedTotal);
        LoggingUtils.info("Expected total: " + expectedTotal + ", actual: " + totalAmt);
        return Math.abs(expectedTotal - totalAmt) < 0.0001;
    }


    public void DS_TC_09()throws Exception {
        DS_TC_06_07();
        click(sendOutPageObjects.cancelButton(), "Cancel SendOut Button");
        click(sendOutPageObjects.noStayOnThisPage(), "No Stay On This Page");
        waitSleep(3000);
        if(isVisible(sendOutPageObjects.messageToReceiver(), getText(sendOutPageObjects.messageToReceiver()))){
            ExtentReporter.logPass("DS_TC_09", "Successfully Stay on the sendout page and inputted data will not be cleared");
        }else{
            ExtentReporter.logFail("DS_TC_09", "Failed to Stay on the sendout page and inputted data will not be cleared");
            Assert.fail("Failed Stay on the sendout page and inputted data will not be cleared");
        }
        click(sendOutPageObjects.cancelButton(), "Cancel SendOut Button");
        click(sendOutPageObjects.yesCancelTransaction(), "Yes Cancel Transaction");
    }

    public void DS_TC_08()throws Exception {
        navigationFOrSendOutDomestic();
        searchKYC();
        searchReceiver();
        waitSleep(5000);
        type(sendOutPageObjects.sourceOfFund(), "Source of Fund field ", propertyReader.getproperty("source_of_fund"));
        type(sendOutPageObjects.purpose(), "Purpose field ", propertyReader.getproperty("purpose"));
        type(sendOutPageObjects.relationToReceiver(), "Relation to Receiver field ", propertyReader.getproperty("relationshiptoreceiver"));
        type(sendOutPageObjects.messageToReceiver(), "Message to Receiver field ", propertyReader.getproperty("messagetoreceiver"));
        type(sendOutPageObjects.principalAmount(), "Principal Amount field ", propertyReader.getproperty("valid_principal_amount"));
        click(sendOutPageObjects.submitSendOut(),"Submit SendOut Button");
        click(sendOutPageObjects.confirmSendOutButton(), "Confirm SendOut Button");
        waitSleep(3000);
        //todo get value of kptn locator and post it to yaml file
        String kptnText = getText(sendOutPageObjects.kptnText());
        List<String> kptnValues = Collections.singletonList(kptnText);
        reader.writeKptnData(kptnValues);
        click(sendOutPageObjects.proceedToPrinting(), "Proceed to Printing");
        waitSleep(2000);
        click(sendOutPageObjects.cancelButtoninReceipt(), "Cancel Button Receipt");
        if(isVisible(sendOutPageObjects.sendOutTransaction(), getText(sendOutPageObjects.sendOutTransaction()))){
            ExtentReporter.logPass("DS_TC_01", "Successfully Validated SendOut Domestic Page Navigation");
            LoggingUtils.info("Successfully Navigate for SendOut Domestic Page ");
        }else{
            ExtentReporter.logFail("DS_TC_01", "Failed to Validate SendOut Domestic Page Navigation");
            LoggingUtils.info("Failed to Validate SendOut Domestic Page Navigation ");
        }
    }
    public void DS_TC_11()throws Exception {
        navigationFOrSendOutDomestic();
        click(sendOutPageObjects.RemoteTransaction(), "Remote Transaction");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sendOutPageObjects.BranchCode()));
        //todo
        type(sendOutPageObjects.BranchCode(), "Search Branch Code", "12R33A180912");
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(12));

        waits.until(ExpectedConditions.elementToBeClickable(sendOutPageObjects.OperatorID()));
        type(sendOutPageObjects.OperatorID(), "Search Operator ID", "2023639709");
        type(sendOutPageObjects.ReasonRemote(), "Reason", "Testing");

        searchKYC();
        scrollDown(100);
        waitSleep(3000);
        scrollDown(100);
        searchReceiver();
        waitSleep(5000);
        type(sendOutPageObjects.sourceOfFund(), "Source of Fund field ", propertyReader.getproperty("source_of_fund"));
        type(sendOutPageObjects.purpose(), "Purpose field ", propertyReader.getproperty("purpose"));
        type(sendOutPageObjects.relationToReceiver(), "Relation to Receiver field ", propertyReader.getproperty("relationshiptoreceiver"));
        type(sendOutPageObjects.messageToReceiver(), "Message to Receiver field ", propertyReader.getproperty("messagetoreceiver"));
        type(sendOutPageObjects.principalAmount(), "Principal Amount field ", propertyReader.getproperty("valid_principal_amount"));
        click(sendOutPageObjects.submitSendOut(),"Submit SendOut Button");
        click(sendOutPageObjects.confirmSendOutButton(), "Confirm SendOut Button");
        waitSleep(3000);
        //todo get value of kptn locator and post it to yaml file
        String kptnTexts = getText(sendOutPageObjects.kptnText());
        List<String> kptnValuess = Collections.singletonList(kptnTexts);
        reader.writeRemoteKptnData(kptnValuess);
        click(sendOutPageObjects.proceedToPrinting(), "Proceed to Printing");
        waitSleep(2000);
        click(sendOutPageObjects.cancelButtoninReceipt(), "Cancel Button Receipt");
    }

    public void DS_TC_10()throws Exception {
        DS_TC_06_07();
        click(sendOutPageObjects.submitSendOut(), "Submit SendOut Button");
        click(sendOutPageObjects.cancelButtoninConfirmation(), "Cancel Button");
        waitSleep(3000);
        if (sendOutPageObjects.messageToReceiver().isEnabled()) {
            ExtentReporter.logPass("DS_TC_10", "Successfully redirected to the SendOut Domestic Page");
            LoggingUtils.info("Successfully redirected to the SendOut Domestic Page");
        }else{
            ExtentReporter.logFail("DS_TC_10", "Failed to redirect to the SendOut Domestic Page");
            Assert.fail("Failed to redirect to the SendOut Domestic Page");
        }
    }
    public void searchKYC(){
        click(sendOutPageObjects.searchKYC(), "Search KYC button ");
        String[] randomName = reader.getRandomName();
        type(sendOutPageObjects.lastName(), "Lastname ", randomName[1]);
        type(sendOutPageObjects.firstName(), "Firstname ", randomName[0]);
        click(sendOutPageObjects.searchBtn(), "Search Button ");
        waitSleep(2000);
        click(sendOutPageObjects.viewButton(), "View Button ");
        waitSleep(5000);
        scrollToElement(sendOutPageObjects.selectKYC());
        scrollDown(100);
        click(sendOutPageObjects.selectKYC(), "Select KYC Button");
    }

    public void addReceiver(){
        click(sendOutPageObjects.searchReceivers(), "Search Receivers Button ");
        click(sendOutPageObjects.addNewReceivers(), "Add new Receiver ");
        type(sendOutPageObjects.r_LastName(),"R_Lastname ", propertyReader.getproperty("Receivers_LName"));
        type(sendOutPageObjects.r_FirstName(),"R_Firstname ", propertyReader.getproperty("Receivers_FName"));
        type(sendOutPageObjects.r_MiddleName(),"R_Firstname ", propertyReader.getproperty("Receivers_MName"));
        scrollDown(100);
        waitSleep(3000);
        click(sendOutPageObjects.r_ProvinceState(), "Receiver Province/State");
        click(sendOutPageObjects.r_ProvinceStateSelect(), "Receiver Selected Province/State");
        click(sendOutPageObjects.r_CityMunicipality(), "Receiver City Municipality");
        click(sendOutPageObjects.r_CityMunicipalitySelected(), "Receiver Selected City Municipality");
        type(sendOutPageObjects.r_HouseNoStreetBarangaySitio(),"Receiver House No. Street/Barangay/Sitio ", propertyReader.getproperty("HouseNoStreetBarangaySitio"));
        click(sendOutPageObjects.r_birthdate_Field(), "Receiver Birthdate field ");
        type(sendOutPageObjects.r_birthdate_Field(), "Receiver Birthdate field ", propertyReader.getproperty("r_birthDate"));
        sendOutPageObjects.r_birthdate_Field().sendKeys(Keys.ARROW_LEFT);
        type(sendOutPageObjects.r_birthdate_Field(), "Receiver Birthdate field ", propertyReader.getproperty("r_month"));
        sendOutPageObjects.r_birthdate_Field().sendKeys(Keys.ARROW_LEFT);
        sendOutPageObjects.r_birthdate_Field().sendKeys(Keys.ARROW_LEFT);
        type(sendOutPageObjects.r_birthdate_Field(), "Receiver Birthdate field ", propertyReader.getproperty("r_day"));
        click(sendOutPageObjects.r_sex_Field(), "Receiver Sex Field ");
        click(sendOutPageObjects.r_selected_Sex_Field(), "Receiver Selected Sex Field ");
        click(sendOutPageObjects.no_ContactNo(), "Receiver No Contact No. ");
        scrollUp(driver);
        waitSleep(3000);
    }
    public void searchReceiver(){
        click(sendOutPageObjects.searchReceivers(), "Search Receivers Button ");
        scrollToElement(sendOutPageObjects.selectButton());
        click(sendOutPageObjects.selectButton(),"Select Button");
        scrollToElement(sendOutPageObjects.no_ContactNo());
        click(sendOutPageObjects.no_ContactNo(), "Contact No Checkbox");
    }
}





