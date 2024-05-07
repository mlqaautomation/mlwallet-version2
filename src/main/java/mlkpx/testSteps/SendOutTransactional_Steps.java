package mlkpx.testSteps;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

import java.util.Collections;
import java.util.List;

public class SendOutTransactional_Steps extends Base_Steps{
    public void navigationFOrSendOutDomestic() throws Exception {
        click(sendOutPageObjects.sendOutLink(), "SendOut Page ");
    }

    public void DS_TC_01() throws Exception { //Test Case for Verify Navigation for SendOut Domestic
        navigationFOrSendOutDomestic();
        if (isVisible(sendOutPageObjects.sendOutTransaction(), getText(sendOutPageObjects.sendOutTransaction()))) {
            ExtentReporter.logPass("DS_TC_01", "Successfully Validated SendOut Domestic Page Navigation");
            LoggingUtils.info("Successfully Navigate for SendOut Domestic Page ");
        } else {
            ExtentReporter.logFail("DS_TC_01", "Failed to Validate SendOut Domestic Page Navigation");
            LoggingUtils.info("Failed to Validate SendOut Domestic Page Navigation ");
        }
    }

    public void DS_TC_02_1() throws Exception { // Test Case for Sendout Transaction Option
        navigationFOrSendOutDomestic();
        click(sendOutPageObjects.yesRadioButton(), "Yes Button ");
        waitSleep(3000);
        type(sendOutPageObjects.branchField(), "Branch Code Field", propertyReader.getproperty("validBranch_code"));
        waitSleep(3000);
//        LoggingUtils.info(sendOutPageObjects.branchName().getText());
//        assertEqual(getValue(sendOutPageObjects.branchName()), propertyReader.getproperty("BranchName"));
//        ExtentReporter.logPass("DS_TC_02", "Successfully Validated Sendout Transaction Option");
        type(wsKwartaPadalaPayOutPageObjects.operatorIDField(), "Operator ID Field", propertyReader.getproperty("operatorID"));
        type(wsKwartaPadalaPayOutPageObjects.reasonField(), "Reason Field", propertyReader.getproperty("Reason"));

        click(sendOutPageObjects.searchKYC(), "Search KYC button ");
        type(sendOutPageObjects.lastName(), "Lastname ", propertyReader.getproperty("Lastname"));
        type(sendOutPageObjects.firstName(), "Firstname ", propertyReader.getproperty("Firstname"));
        click(sendOutPageObjects.searchBtn(), "Search Button ");
        waitSleep(2000);
        click(sendOutPageObjects.viewButton(), "View Button ");
        waitSleep(5000);
        scrollToElement(sendOutPageObjects.selectKYC());
        scrollDown(100);
        click(sendOutPageObjects.selectKYC(), "Select KYC Button");
        waitSleep(5000);
        scrollDown(100);
        searchReceiver();
        scrollToElement(sendOutPageObjects.sourceOfFund());
        type(sendOutPageObjects.sourceOfFund(), "Source of Fund field ", propertyReader.getproperty("source_of_fund"));
        type(sendOutPageObjects.purpose(), "Purpose field ", propertyReader.getproperty("purpose"));
        type(sendOutPageObjects.relationToReceiver(), "Relation to Receiver field ", propertyReader.getproperty("relationshiptoreceiver"));
        type(sendOutPageObjects.messageToReceiver(), "Message to Receiver field ", propertyReader.getproperty("messagetoreceiver"));
        type(sendOutPageObjects.principalAmount(), "Principal Amount field ", propertyReader.getproperty("valid_principal_amount"));
        waitSleep(5000);
        click(sendOutPageObjects.submitSendOut(), "Submit SendOut Button");
        click(sendOutPageObjects.confirmSendOutButton(), "Confirm SendOut Button");
        waitSleep(3000);
        //todo get value of kptn locator and post it to yaml file
        String  kptnText = getText(sendOutPageObjects.kptnText());
        List<String> kptnValues = Collections.singletonList(kptnText);
        reader.writeRemoteKptnData(kptnValues);
        click(sendOutPageObjects.proceedToPrinting(), "Proceed to Printing");
        waitSleep(3000);
        if(isVisible(sendOutPageObjects.mainOperator(), getText(sendOutPageObjects.mainOperator()))){
            ExtentReporter.logPass("DS_TC_02_1", "Successfully Validated Sendout Transaction Option Valid Branch Code");
        }else{
            ExtentReporter.logFail("DS_TC_02_1", "Fail to Validated Sendout Transaction Option Valid Branch Code");
            Assert.fail("Fail to Validated Sendout Transaction Option Valid Branch Code");
        }
        click(sendOutPageObjects.cancelButtoninReceipt(), "Cancel Button Receipt");

    }

    public void DS_TC_03() throws Exception {
        navigationFOrSendOutDomestic();
        searchKYC();
        waitSleep(2000);
        if (isChecked(sendOutPageObjects.smsCheckbox())) {
            LoggingUtils.info("Checkbox is checked!");
        } else {
            LoggingUtils.info("Checkbox is not checked!");
            ExtentReporter.logFail("DS_TC_03", "Failed to Validate Search Kyc in SendOut Domestic");
        }
        ExtentReporter.logPass("DS_TC_03", "Successfully Validated Search Kyc in SendOut Domestic");
    }
    public void DS_TC_04() throws Exception {
        navigationFOrSendOutDomestic();
        searchKYC();
        addReceiver();
        scrollToElement(sendOutPageObjects.sourceOfFund());
        type(sendOutPageObjects.sourceOfFund(), "Source of Fund field ", propertyReader.getproperty("source_of_fund"));
        type(sendOutPageObjects.purpose(), "Purpose field ", propertyReader.getproperty("purpose"));
        type(sendOutPageObjects.relationToReceiver(), "Relation to Receiver field ", propertyReader.getproperty("relationshiptoreceiver"));
        type(sendOutPageObjects.messageToReceiver(), "Message to Receiver field ", propertyReader.getproperty("messagetoreceiver"));
        type(sendOutPageObjects.principalAmount(), "Principal Amount field ", propertyReader.getproperty("valid_principal_amount"));
        waitSleep(5000);
        click(sendOutPageObjects.submitSendOut(), "Submit SendOut Button");
        click(sendOutPageObjects.confirmSendOutButton(), "Confirm SendOut Button");
        waitSleep(3000);
        //todo get value of kptn locator and post it to yaml file
        String kptnText = getText(sendOutPageObjects.kptnText());
        List<String> kptnValues = Collections.singletonList(kptnText);
        reader.writeKptnData(kptnValues);
        click(sendOutPageObjects.proceedToPrinting(), "Proceed to Printing");
        waitSleep(3000);
        if(isVisible(sendOutPageObjects.cancelButtoninReceipt(), getText(sendOutPageObjects.cancelButtoninReceipt()))){
            ExtentReporter.logPass("DS_TC_04", "Successfully Verify Add Receiver New");
        }else{
            ExtentReporter.logFail("DS_TC_04", "Fail to Verify Add Receiver New");
            Assert.fail("Fail to Verify Add Receiver New");
        }
        click(sendOutPageObjects.cancelButtoninReceipt(), "Cancel Button Receipt");
    }
    public void DS_TC_05() throws Exception {
        navigationFOrSendOutDomestic();
        searchKYC();
        click(sendOutPageObjects.searchReceivers(), "Search Receivers Button ");
        scrollDown(100);
        LoggingUtils.info(getText(sendOutPageObjects.name_Text(1)));
        String selectedReceiverName = getText(sendOutPageObjects.name_Text(1));
        click(sendOutPageObjects.selectButton(), "Select Button");
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
        if (containsName) {
            ExtentReporter.logPass("DS_TC_05", "Successfully Validate Search Receiver  ");
            LoggingUtils.info("Successfully Validate Search Receiver  ");
        } else {
            ExtentReporter.logFail("DS_TC_05", "Failed to Validate Search Receiver  ");
            LoggingUtils.error("Failed to Validate Search Receiver " + getValue(sendOutPageObjects.r_LastName()) + " Expected " + selectedReceiverName);
            Assert.fail("Failure due to Incorrect Details"); //assert the script to fail in testng
        }
    }

    public void DS_TC_06() throws Exception {
        navigationFOrSendOutDomestic();
        searchKYC();
        searchReceiver();
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
    }

    public void DS_TC_08() throws Exception {
        navigationFOrSendOutDomestic();
        searchKYC();
        searchReceiver();
        waitSleep(5000);
        type(sendOutPageObjects.sourceOfFund(), "Source of Fund field ", propertyReader.getproperty("source_of_fund"));
        type(sendOutPageObjects.purpose(), "Purpose field ", propertyReader.getproperty("purpose"));
        type(sendOutPageObjects.relationToReceiver(), "Relation to Receiver field ", propertyReader.getproperty("relationshiptoreceiver"));
        type(sendOutPageObjects.messageToReceiver(), "Message to Receiver field ", propertyReader.getproperty("messagetoreceiver"));
        type(sendOutPageObjects.principalAmount(), "Principal Amount field ", propertyReader.getproperty("valid_principal_amount"));
        click(sendOutPageObjects.submitSendOut(), "Submit SendOut Button");
        click(sendOutPageObjects.confirmSendOutButton(), "Confirm SendOut Button");
        waitSleep(3000);
        //todo get value of kptn locator and post it to yaml file
        String kptnText = getText(sendOutPageObjects.kptnText());
        List<String> kptnValues = Collections.singletonList(kptnText);
        reader.writeKptnData(kptnValues);
        click(sendOutPageObjects.proceedToPrinting(), "Proceed to Printing");
        waitSleep(2000);
        click(sendOutPageObjects.cancelButtoninReceipt(), "Cancel Button Receipt");
        if (isVisible(sendOutPageObjects.sendOutTransaction(), getText(sendOutPageObjects.sendOutTransaction()))) {
            ExtentReporter.logPass("DS_TC_08", "Successfully Validate Submit SendOut Transaction");
        } else {
            ExtentReporter.logFail("DS_TC_08", "Failed to Validate Submit SendOut Transaction");
            Assert.fail("Validate Submit SendOut Transaction");
        }
    }

    public void SOC_TC_01()throws Exception{
        click(sendOutPageObjects.sendOutLink(), "SendOut Page ");
        click(sendOutCancellationPageObjects.sendOutCancellationLink(), "SendOut Cancellation Page ");
        click(sendOutCancellationPageObjects.cancelDropdown(), "Cancel Dropdown");
        waitSleep(1000);
        if(isVisible(sendOutCancellationPageObjects.cancelSendOutText(), getText(sendOutCancellationPageObjects.cancelSendOutText()))){
            LoggingUtils.info("Successfully Navigate for SendOut Cancellation Page ");
        }
        String randomKPTN = reader.getSendOutKPTN(); // Call the getSendOutKPTN function
        type(sendOutCancellationPageObjects.kptnField(), "KPTN Field", randomKPTN); // Use the random KPTN value
//        String randomKPTN = YAMLUtils.getRandomKPTN("testData.yaml"); // Call the getRandomKPTN function
//        type(sendOutCancellationPageObjects.kptnField(), "KPTN Field", randomKPTN); // Use the random KPTN value
//        type(sendOutCancellationPageObjects.kptnField(), "KPTN Field", propertyReader.getproperty("kptnvalidcode"));
        click(sendOutCancellationPageObjects.searchButton(),"Search button");
        waitSleep(2000);
        click(sendOutCancellationPageObjects.irNumberField(),"IR Number Field");
        type(sendOutCancellationPageObjects.irNumberField(),"IR Number Field", propertyReader.getproperty("iRNumber"));
        click(sendOutCancellationPageObjects.initiatedByOption(),"Initiated By Option");
        click(sendOutCancellationPageObjects.customerOption(),"Customer Option");
        type(sendOutCancellationPageObjects.reasonField(),"Reason Field", propertyReader.getproperty("reasonfield"));
        click(sendOutCancellationPageObjects.keepTransactionButton(), "Keep Transaction Button");
        click(sendOutCancellationPageObjects.noStayOnThisPage(),"No, Stay On This Page");
        click(sendOutCancellationPageObjects.keepTransactionButton(), "Keep Transaction Button");
        click(sendOutCancellationPageObjects.yesKeepTransactionButton(),"Yes, Keep Transaction Button");
        waitSleep(3000);
        type(sendOutCancellationPageObjects.kptnField(), "KPTN Field", randomKPTN); // Use the random KPTN value
//        type(sendOutCancellationPageObjects.kptnField(), "KPTN Field", propertyReader.getproperty("kptnvalidcode"));
        click(sendOutCancellationPageObjects.searchButton(),"Search button");
        waitSleep(2000);
        click(sendOutCancellationPageObjects.irNumberField(),"IR Number Field");
        type(sendOutCancellationPageObjects.irNumberField(),"IR Number Field", propertyReader.getproperty("iRNumber"));
        click(sendOutCancellationPageObjects.initiatedByOption(),"Initiated By Option");
        click(sendOutCancellationPageObjects.customerOption(),"Customer Option");
        type(sendOutCancellationPageObjects.reasonField(),"Reason Field", propertyReader.getproperty("reasonfield"));
        click(sendOutCancellationPageObjects.cancelButton(), "Cancel Button");
        click(sendOutCancellationPageObjects.noKeepTransaction(),"No, Keep Transaction");
        click(sendOutCancellationPageObjects.cancelButton(), "Cancel Button");
        click(sendOutCancellationPageObjects.yesCancelSendout(),"Yes Cancel Sendout");

        if(isVisible(sendOutCancellationPageObjects.cancelSendOutText(), getText(sendOutCancellationPageObjects.cancelSendOutText()))){
            LoggingUtils.info("Successfully Cancel the Transaction");
        }else {
            ExtentReporter.logFail("SOC_TC_01", "Failed to Cancel the Transaction");
            Assert.fail("Failed to Cancel the Transaction");
        }
    }

    public void RFC_TC_01()throws Exception{
        click(sendOutPageObjects.sendOutLink(), "SendOut Page ");
        click(requestForChangePageObjects.rfcLink(),"Request for Change Link");
        click(requestForChangePageObjects.domesticRFClink(), "Domestic RFC Link");
//        click(requestForChangePageObjects.idTypeDropDown(),"ID Type DropDown");
//        click(requestForChangePageObjects.idTypeSelected(),"Selected ID Type ");
        click(requestForChangePageObjects.kptnField(),"RFC KPTN Field");
//        String randomKPTN = reader.getRandomKPTN(); // Call the getRandomKPTN function
//        type(requestForChangePageObjects.kptnField(), "KPTN Field", randomKPTN); // Use the random KPTN value
        type(requestForChangePageObjects.kptnField(), "RFC KPTN Field ", propertyReader.getproperty("rfcKPTN"));
        click(requestForChangePageObjects.searchButton(), "RFC Search Button");
        if(isVisible(requestForChangePageObjects.rfcText(), getText(requestForChangePageObjects.rfcText()))){
            ExtentReporter.logPass("RFC_TC_01", "Successfully Navigate for RFC Page");
        }else{
            ExtentReporter.logFail("RFC_TC_01", "Fail to verify navigation");
            Assert.fail("Fail to verify navigation");
        }
        click(requestForChangePageObjects.senderProvinceChange(),"Sender Province Field");
        click(requestForChangePageObjects.senderNewProvince(),"Sender New Province");
        click(requestForChangePageObjects.senderCityChange(),"Sender City Field");
        click(requestForChangePageObjects.senderNewCity(),"Sender New City");
        clearField(requestForChangePageObjects.senderHouseField());
        type(requestForChangePageObjects.senderHouseField(),"Sender House Field", propertyReader.getproperty("senderhouse"));
        scrollDown(100);
        clearField(requestForChangePageObjects.receiverLastNameField());
        type(requestForChangePageObjects.receiverLastNameField(),"Receiver Lastname Field", propertyReader.getproperty("receiverlastname"));
        clearField(requestForChangePageObjects.receiverFirstNameField());
        type(requestForChangePageObjects.receiverFirstNameField(),"Receiver Firstname Field", propertyReader.getproperty("receiverfirstname"));
        clearField(requestForChangePageObjects.receiverMiddleNameField());
        type(requestForChangePageObjects.receiverMiddleNameField(),"Receiver Middlename Field", propertyReader.getproperty("receivermiddlename"));
        click(requestForChangePageObjects.receiverProvinceField(),"Receiver Province Field");
        click(requestForChangePageObjects.receiverNewProvince(),"Receiver New Province");
        click(requestForChangePageObjects.receiverCityField(),"Receiver City Field");
        click(requestForChangePageObjects.receiverNewCity(),"Receiver New City");
        clearField(requestForChangePageObjects.receiverHouseField());
        type(requestForChangePageObjects.receiverHouseField(),"Receiver House No", propertyReader.getproperty("receiverhouseno"));
        click(requestForChangePageObjects.receiverNoContactNo(),"Receiver Check No Contact Number");
        scrollUp(driver);
        type(requestForChangePageObjects.irNo(),"IR Number", propertyReader.getproperty("irnumber"));
        click(requestForChangePageObjects.initiatedBy(), "Initiated By");
        click(requestForChangePageObjects.initiatedByCustomer(),"Initiated By Customer");
        type(requestForChangePageObjects.reason(),"Reason for Change", propertyReader.getproperty("reasonforchange"));
        click(requestForChangePageObjects.rfcSubmitButton(),"RFC Submit Button");
        click(requestForChangePageObjects.noKeepTransactionButton(),"No Keep Transaction");
        click(requestForChangePageObjects.rfcSubmitButton(),"RFC Submit Button");
        waitSleep(3000);
        click(requestForChangePageObjects.yesChangeDetailsButton(),"Yes Change Details");
        waitSleep(3000);
        if(isVisible(requestForChangePageObjects.detailsChangeText(), getText(requestForChangePageObjects.detailsChangeText()))){
            ExtentReporter.logPass("RFC_TC_01", "Successfully Change Details");
        }else{
            ExtentReporter.logFail("RFC_TC_01", "Fail to Change Details");
            Assert.fail("Fail to Change Details");
        }
        click(requestForChangePageObjects.rfcProceedToPrinting(),"Proceed to Printing");
        click(sendOutPageObjects.cancelButtoninReceipt(),"Cancel button");
    }

    public void RTS_TC_01()throws Exception{
        click(sendOutPageObjects.sendOutLink(), "SendOut Page ");
        click(returnToSenderPageObjects.rtsNavlink(),"Return to Sender Nav Link");
        String randomKPTN = reader.getSendOutKPTN(); // Call the getSendOutKPTN function
        type(sendOutCancellationPageObjects.kptnField(), "KPTN Field", randomKPTN); // Use the random KPTN value
//        type(returnToSenderPageObjects.rtsKPTNField(), "RTS KPTN Field ", propertyReader.getproperty("rtsKPTN"));
        click(returnToSenderPageObjects.searchButton(), "RTS Search Button");
        if(isVisible(returnToSenderPageObjects.returnToSenderText(), getText(returnToSenderPageObjects.returnToSenderText()))){
            ExtentReporter.logPass("RTS_TC_01", "Successfully Navigate for RTC Page");
        }else{
            ExtentReporter.logFail("RTS_TC_01", "Fail to verify navigation");
            Assert.fail("Fail to verify navigation");
        }
        type(returnToSenderPageObjects.irNo(),"IR Number", propertyReader.getproperty("irnumber"));
        type(returnToSenderPageObjects.reason(),"Return to Sender", propertyReader.getproperty("reasonforchange"));
        click(returnToSenderPageObjects.returnToSenderButton(),"RTS Submit Button");
        click(returnToSenderPageObjects.noKeepTransactionButton(),"No Keep Transaction");
        click(returnToSenderPageObjects.returnToSenderButton(),"RTS Submit Button");
        click(returnToSenderPageObjects.yesReturnToSenderButton(),"Yes Return to Sender");
        if(isVisible(returnToSenderPageObjects.returnToSenderSuccess(), getText(returnToSenderPageObjects.returnToSenderSuccess()))){
            ExtentReporter.logPass("RTS_TC_01", "Successfully Return To Sender");
        }else{
            ExtentReporter.logFail("RTS_TC_01", "Fail to Return To Sender");
            Assert.fail("Fail to Return To Sender");
        }
        click(returnToSenderPageObjects.rtsProceedToPrinting(),"Proceed to Printing");
        click(sendOutPageObjects.cancelButtoninReceipt(),"Cancel button");
    }
    public void SOR_TC_01()throws Exception{
        click(sendOutPageObjects.sendOutLink(), "SendOut Page ");
        click(soReprintingPageObjects.soReprintingLink(), "SendOut Page ");
        if(isVisible(soReprintingPageObjects.soReprintText(), getText(soReprintingPageObjects.soReprintText()))){
            LoggingUtils.info("Successfully Navigate for SendOut Reprint Page ");
        }
//        String randomKPTN = reader.getRandomKPTN(); // Call the getRandomKPTN function
//        type(orReprintingPageObjects.kptnButtonInReprint(), "KPTN Field", randomKPTN); // Use the random KPTN value
        type(soReprintingPageObjects.kptnButtonInReprint(), "KPTN SOReprint field ", propertyReader.getproperty("kptnValidCodeforORSO"));
        type(soReprintingPageObjects.reasonSOReprint(), "Reason SOReprint field ", propertyReader.getproperty("reason_ORandSOReprint"));
        click(soReprintingPageObjects.reprintButton(), "Reprint Button");
        if(isVisible(soReprintingPageObjects.printSendoutReceiptText(), getText(soReprintingPageObjects.printSendoutReceiptText()))){
            ExtentReporter.logPass("SOR_TC_01", "Successfully Validate SO Reprinting");
        }else{
            ExtentReporter.logFail("SOR_TC_01", "Fail to Validate SO Reprinting");
            Assert.fail("Fail to Validate SO Reprinting");
        }
    }
    public void OR_TC_01()throws Exception{
        click(sendOutPageObjects.sendOutLink(), "SendOut Page ");
        click(orReprintingPageObjects.orReprintingLink(), "OR Reprinting Page ");
        if(isVisible(orReprintingPageObjects.orReprintText(), getText(orReprintingPageObjects.orReprintText()))){
            LoggingUtils.info("Successfully Navigate for SendOut Reprint Page ");
        }
//        String randomKPTN = reader.getRandomKPTN(); // Call the getRandomKPTN function
//        type(orReprintingPageObjects.kptnButtonInReprint(), "KPTN Field", randomKPTN); // Use the random KPTN value
        type(orReprintingPageObjects.kptnButtonInReprint(), "KPTN ORReprint field ", propertyReader.getproperty("kptnValidCodeforORSO"));
        type(orReprintingPageObjects.reasonORReprint(), "Reason ORReprint field ", propertyReader.getproperty("reason_ORandSOReprint"));
        click(orReprintingPageObjects.reprintButton(), "Reprint Button");
        if(isVisible(orReprintingPageObjects.printSendoutORReceiptText(), getText(orReprintingPageObjects.printSendoutORReceiptText()))){
            ExtentReporter.logPass("OR_TC_01", "Successfully Validate OR Reprinting");
        }else{
            ExtentReporter.logFail("OR_TC_01", "Fail to Validate OR Reprinting");
            Assert.fail("Fail to Validate OR Reprinting");
        }
    }



    public boolean isTotalCorrect () throws Exception {
        double principalAmt = parseTotalValue(getValue(sendOutPageObjects.principalAmount()));
        double chargeAmt = parseTotalValue(getText(sendOutPageObjects.chargeAmount()));
        double otherChargeAmt = parseTotalValue(getText(sendOutPageObjects.otherChargeAmount()));
        double totalAmt = parseTotalValue(getText(sendOutPageObjects.totalAmount()));
        double expectedTotal = principalAmt + chargeAmt + otherChargeAmt;
        assertEqual(totalAmt, expectedTotal);
        LoggingUtils.info("Expected total: " + expectedTotal + ", actual: " + totalAmt);
        return Math.abs(expectedTotal - totalAmt) < 0.0001;
    }

    public void searchKYC () {
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

    public void addReceiver () {
        click(sendOutPageObjects.searchReceivers(), "Search Receivers Button ");
        click(sendOutPageObjects.addNewReceivers(), "Add new Receiver ");
        type(sendOutPageObjects.r_LastName(), "R_Lastname ", propertyReader.getproperty("Receivers_LName"));
        type(sendOutPageObjects.r_FirstName(), "R_Firstname ", propertyReader.getproperty("Receivers_FName"));
        type(sendOutPageObjects.r_MiddleName(), "R_Firstname ", propertyReader.getproperty("Receivers_MName"));
        scrollDown(100);
        waitSleep(3000);
        click(sendOutPageObjects.r_ProvinceState(), "Receiver Province/State");
        click(sendOutPageObjects.r_ProvinceStateSelect(), "Receiver Selected Province/State");
        click(sendOutPageObjects.r_CityMunicipality(), "Receiver City Municipality");
        click(sendOutPageObjects.r_CityMunicipalitySelected(), "Receiver Selected City Municipality");
        type(sendOutPageObjects.r_HouseNoStreetBarangaySitio(), "Receiver House No. Street/Barangay/Sitio ", propertyReader.getproperty("HouseNoStreetBarangaySitio"));
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
    public void searchReceiver () {
        click(sendOutPageObjects.searchReceivers(), "Search Receivers Button ");
        scrollToElement(sendOutPageObjects.selectButton());
        click(sendOutPageObjects.selectButton(), "Select Button");
        scrollToElement(sendOutPageObjects.no_ContactNo());
        click(sendOutPageObjects.no_ContactNo(), "Contact No Checkbox");
    }





}
