package mlkpx.testSteps;


import org.openqa.selenium.Keys;
import org.testng.Assert;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

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
        waitSleep(4000);
        type(sendOutPageObjects.branchField(), "Branch Code Field", propertyReader.getproperty("invalidBranch_code"));
        waitSleep(2000); //hard wait for 2 seconds
        isVisible(sendOutPageObjects.branchNotFoundText(), "Branch not found text");
        clearField(sendOutPageObjects.branchField());
        type(sendOutPageObjects.branchField(), "Branch Code Field", propertyReader.getproperty("validBranch_code"));
        waitSleep(4000);
        LoggingUtils.info(sendOutPageObjects.branchName().getText());
        assertEqual(getValue(sendOutPageObjects.branchName()), propertyReader.getproperty("BranchName"));
        ExtentReporter.logPass("DS_TC_02", "Successfully Validated Sendout Transaction Option");
    }

    public void DS_TC_03()throws Exception {
        navigationFOrSendOutDomestic();
        searchKYC();
        click(sendOutPageObjects.selectKYC(), "Select KYC ");
        waitSleep(2000);
        type(sendOutPageObjects.contactNumber(), "Contact Number ", propertyReader.getproperty("Contact_number"));
        assertEqual(getText(sendOutPageObjects.senderLastName()), propertyReader.getproperty("Lastname"));
        assertEqual(getText(sendOutPageObjects.senderFirstName()), propertyReader.getproperty("Firstname"));
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
        scrollToSpecificScrollPosition(500);
        scrollToElement(sendOutPageObjects.selectButton());
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
        type(sendOutPageObjects.sourceOfFund(), "Source of Fund field ", propertyReader.getproperty("source_of_fund"));
        type(sendOutPageObjects.purpose(), "Purpose field ", propertyReader.getproperty("purpose"));
        type(sendOutPageObjects.relationToReceiver(), "Relation to Receiver field ", propertyReader.getproperty("relationshiptoreceiver"));
        type(sendOutPageObjects.messageToReceiver(), "Message to Receiver field ", propertyReader.getproperty("messagetoreceiver"));
        assertEqual(getValue(sendOutPageObjects.sourceOfFund()), propertyReader.getproperty("source_of_fund"));
        assertEqual(getValue(sendOutPageObjects.purpose()), propertyReader.getproperty("purpose"));
        assertEqual(getValue(sendOutPageObjects.relationToReceiver()), propertyReader.getproperty("relationshiptoreceiver"));
        assertEqual(getValue(sendOutPageObjects.messageToReceiver()), propertyReader.getproperty("messagetoreceiver"));


        scrollToElement(sendOutPageObjects.principalAmount());
        click(sendOutPageObjects.principalAmount(), "Principal Amount field ");
        type(sendOutPageObjects.principalAmount(), "Principal Amount field ", propertyReader.getproperty("principal_amount"));
        click(sendOutPageObjects.totalAmount(), "Total Amount");
        waitSleep(50);
//        if(isVisible(sendOutPageObjects.totalAmount(), getText(sendOutPageObjects.totalAmount()))){
//            LoggingUtils.info("Total Amount");
        if(isVisible(sendOutPageObjects.totalAmount(), getText(sendOutPageObjects.totalAmount()))){
            ExtentReporter.logPass("DS_TC_06_07", "Successfully Validate Other information input section");
            LoggingUtils.info("Successfully Validate Other information input section");
        }else{
            ExtentReporter.logFail("DS_TC_06_07", "Failed to Validate Other information input section");
            LoggingUtils.error("Failed to Validate Other information input section");
        }
//        }
        click(sendOutPageObjects.submitSendOut(), "Submit SendOut Button");
        waitSleep(50);
        scrollDown(100);
    }

    public void DS_TC_09()throws Exception {
        click(sendOutPageObjects.cancelButton(), "Cancel SendOut Button");
        click(sendOutPageObjects.noStayOnThisPage(), "No Stay On This Page");
        waitSleep(5000);
        if(isVisible(sendOutPageObjects.messageToReceiver(), getText(sendOutPageObjects.messageToReceiver()))){
            ExtentReporter.logPass("DS_TC_09", "Successfully Stay on the sendout page and inputted data will not be cleared");
            LoggingUtils.info("Successfully Stay on the sendout page and inputted data will not be cleared");
        }else{
            ExtentReporter.logFail("DS_TC_09", "Failed to Stay on the sendout page and inputted data will not be cleared");
            LoggingUtils.error("Failed Stay on the sendout page and inputted data will not be cleared");
        }
    }

    public void DS_TC_08()throws Exception {
        waitSleep(5000);
        click(sendOutPageObjects.confirmSendOutButton(), "Submit SendOut Button");
        waitSleep(5000);
//        if(isVisible(sendOutPageObjects.printSendoutReceipt(), getText(sendOutPageObjects.printSendoutReceipt()))){
//            ExtentReporter.logPass("DS_TC_08", "Successfully SendOut");
//            LoggingUtils.info("Successfully SendOut");
//        }else{
//            ExtentReporter.logFail("DS_TC_08", "Failed to SendOut");
//            LoggingUtils.error("Failed to SendOut");
//        }
        click(sendOutPageObjects.proceedToPrinting(), "Proceed to Printing");
        waitSleep(5000);
        click(sendOutPageObjects.cancelButtoninReceipt(), "Cancel Button Receipt");
    }

    public void DS_TC_09_1()throws Exception {
        scrollDown(100);
        click(sendOutPageObjects.cancelButton(), "Cancel SendOut Button");
        click(sendOutPageObjects.yesCancelTransaction(), "Yes Cancel Transaction");
        waitSleep(5000);
//        if(isVisible(sendOutPageObjects.sendoutDomesticText(), getText(sendOutPageObjects.sendoutDomesticText()))){
//            ExtentReporter.logPass("DS_TC_09_1", "Back to the sendout page and inputted data will be cleared");
//            LoggingUtils.info("Back to the sendout page and inputted data will be cleared");
//        }else{
//            ExtentReporter.logFail("DS_TC_09_1", "Failed to Stays on the sendout page");
//            LoggingUtils.error("Failed to Stays on the sendout page");
//        }
    }
    public void DS_TC_10()throws Exception {
        scrollDown(100);

        click(sendOutPageObjects.cancelButtoninConfirmation(), "Cancel Button");
        waitSleep(5000);
        if (sendOutPageObjects.messageToReceiver().isEnabled()) {
            ExtentReporter.logPass("DS_TC_10", "Successfully redirected to the SendOut Domestic Page");
            LoggingUtils.info("Successfully redirected to the SendOut Domestic Page");
        }else{
            ExtentReporter.logFail("DS_TC_10", "Failed to redirect to the SendOut Domestic Page");
            LoggingUtils.error("Failed to redirect to the SendOut Domestic Page");
        }
    }
    public void searchKYC(){
        click(sendOutPageObjects.searchKYC(), "Search KYC button ");
        type(sendOutPageObjects.lastName(), "Lastname ", propertyReader.getproperty("Lastname"));
        type(sendOutPageObjects.firstName(), "Firstname ", propertyReader.getproperty("Firstname"));
        click(sendOutPageObjects.searchBtn(), "Search Button ");
        waitSleep(2000);
        click(sendOutPageObjects.viewButton(), "View Button ");
        waitSleep(3000);
        scrollToElement(sendOutPageObjects.selectKYC());
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
    }
}





