package mlkpx.testSteps;

import org.openqa.selenium.Keys;
import utilities.Logger.LoggingUtils;

public class SendOut_Steps extends Base_Steps{

    public void navigateSendOutPage()throws Exception{
        try{
            click(sendOutPageObjects.sendOutLink(), "SendOut Page ");
            if(isVisible(sendOutPageObjects.sendOutTransaction(), getText(sendOutPageObjects.sendOutTransaction()))){
                LoggingUtils.info("Navigated to SendOut Page ");
            }
        }catch (Exception e){
            LoggingUtils.info("Failed to Navigate SendOut Page "+ e);
        }
    }

//    public void DS_TC_01()throws Exception{
//        try{
//            click(sendOutPageObjects.domesticSendOut(), "Domestic SendOut ");
//            if(isVisible(sendOutPageObjects.sendOutDomesticText(), getText(sendOutPageObjects.sendOutDomesticText()))){
//                LoggingUtils.info("SendOut Domestic Page will display ");
//            }
//        }catch (Exception e){
//            LoggingUtils.info("Failed to display Domestic Page "+ e);
//        }
//    }
    public void DS_TC_02()throws Exception{
        try{
            click(sendOutPageObjects.yesRadioButton(), "Yes Button ");
            if(isVisible(sendOutPageObjects.branchInformationText(), getText(sendOutPageObjects.branchInformationText()))){
                LoggingUtils.info("SendOut Domestic Page will display ");
            }
            click(sendOutPageObjects.branchField(), "Branch field ");
            type(sendOutPageObjects.branchField(), "Branch field ", propertyReader.getproperty("Branch_code"));
            click(sendOutPageObjects.branchInformationText(), "Branch Information Text ");
            if(isVisible(sendOutPageObjects.branchNotFoundText(), getText(sendOutPageObjects.branchNotFoundText()))){
                LoggingUtils.info("Branch not found");
            }
            type(sendOutPageObjects.inputReasonField(), "Branch field", propertyReader.getproperty("Reason"));
//            click(sendOutPageObjects.searchKYC(),"KYC button ");
//            type(sendOutPageObjects.lastName(),"Lastname ", propertyReader.getproperty("Lastname"));
//            type(sendOutPageObjects.firstName(),"Firstname ", propertyReader.getproperty("Firstname"));
//            click(sendOutPageObjects.searchBtn(),"Search Button ");
//            click(sendOutPageObjects.viewButton(), "View Button ");
//            scrollDown(100);
//            waitSleep(3000);
//            scrollDown(100);
////            click(sendOutPageObjects.vpoRemarks(), "VPO Remarks ");
//            scrollDown(100);
//            click(sendOutPageObjects.selectKYC(), "Select KYC ");
//            waitSleep(2);
//            type(sendOutPageObjects.contactNumber(), "Contact Number ", propertyReader.getproperty("Contact_number"));
//            scrollDown(30);
        }catch (Exception e){
            LoggingUtils.info("SendOut Domestic Page will display "+ e);
        }
    }
    public void DS_TC_03()throws Exception {

        click(sendOutPageObjects.searchKYC(), "KYC button ");
        type(sendOutPageObjects.lastName(), "Lastname ", propertyReader.getproperty("Lastname"));
        type(sendOutPageObjects.firstName(), "Firstname ", propertyReader.getproperty("Firstname"));
        click(sendOutPageObjects.searchBtn(), "Search Button ");
        click(sendOutPageObjects.viewButton(), "View Button ");
        scrollDown(100);
        waitSleep(3000);
        scrollDown(100);
        //            click(sendOutPageObjects.vpoRemarks(), "VPO Remarks ");
        scrollDown(100);
        click(sendOutPageObjects.selectKYC(), "Select KYC ");
        waitSleep(2);
        type(sendOutPageObjects.contactNumber(), "Contact Number ", propertyReader.getproperty("Contact_number"));
        scrollDown(30);
    }

    public void DS_TC_04()throws Exception{
        try{
            click(sendOutPageObjects.searchReceivers(), "Search Receivers Button ");
            click(sendOutPageObjects.addNewReceivers(), "Add new Receiver ");
            type(sendOutPageObjects.r_LastName(),"R_Lastname ", propertyReader.getproperty("Receivers_LName"));
            type(sendOutPageObjects.r_FirstName(),"R_Firstname ", propertyReader.getproperty("Receivers_FName"));
            type(sendOutPageObjects.r_MiddleName(),"R_Firstname ", propertyReader.getproperty("Receivers_MName"));
            scrollDown(100);
            waitSleep(3);
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
            waitSleep(3);
        }catch (Exception e){
            LoggingUtils.info("SendOut Domestic Page will display "+ e);
        }
    }
    public void DS_TC_05()throws Exception{

    }
    public void DS_TC_06()throws Exception{
        click(sendOutPageObjects.sourceOfFund(), "Receiver Birthdate field ");
        type(sendOutPageObjects.sourceOfFund(), "Receiver Birthdate field ", propertyReader.getproperty("source_of_fund"));
        click(sendOutPageObjects.purpose(), "Receiver Birthdate field ");
        type(sendOutPageObjects.purpose(), "Receiver Birthdate field ", propertyReader.getproperty("purpose"));
        click(sendOutPageObjects.relationToReceiver(), "Receiver Birthdate field ");
        type(sendOutPageObjects.relationToReceiver(), "Receiver Birthdate field ", propertyReader.getproperty("relationshiptoreceiver"));
        click(sendOutPageObjects.messageToReceiver(), "Receiver Birthdate field ");
        type(sendOutPageObjects.messageToReceiver(), "Receiver Birthdate field ", propertyReader.getproperty("messagetoreceiver"));
        type(sendOutPageObjects.principalAmount(), "Receiver Birthdate field ", propertyReader.getproperty("principal_amount"));
        click(sendOutPageObjects.totalAmount(), "Total Amount");
        waitSleep(20);
        click(sendOutPageObjects.submitSendOut(), "Submit SendOut Button");
    }

}
