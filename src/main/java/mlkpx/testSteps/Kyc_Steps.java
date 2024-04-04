package mlkpx.testSteps;

import org.mlkpx.pageObject.Kyc_PageObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import utilities.Driver.DriverManager;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;
import org.openqa.selenium.WebElement;
public class Kyc_Steps extends Base_Steps {



    public void navigateKycPage()throws Exception{
        try{
            click(kycPageObjects.kyc_link(), "Kyc Page");
            if(isVisible(kycPageObjects.kycPage_h2(), getText(kycPageObjects.kycPage_h2()))){
                LoggingUtils.info("KYC page will display");
            }
        }catch (Exception e){
            LoggingUtils.info("KYC page will not display "+ e);
        }
    }

    public void searchRegisteredKYC_Valid()throws Exception{
        try{

            type(kycPageObjects.lastName_field(), "Last name field", propertyReader.getproperty("Last_name"));
            type(kycPageObjects.firstName_field(), "First name field", propertyReader.getproperty("First_name"));
            click(kycPageObjects.searchBtn(), "Search button");
            if(!kycPageObjects.buttonList().isEmpty()){
                ExtentReporter.logPass("Successfully Search KYC");
            }
        }catch (Exception e){
            ExtentReporter.logFail(""+e);
        }
    }

    public void searchRegisteredKYC_Invalid(){
        try{
            type(kycPageObjects.lastName_field(), "Last name field", "");
            type(kycPageObjects.firstName_field(), "First name field", "");
            click(kycPageObjects.searchBtn(), "Search button");
        }catch (Exception e){
            ExtentReporter.logFail(""+e);
        }
    }
//    public void searchRegisteredKYC_InvalidInputNumbers(){
//        try{
//            type(kycPageObjects.lastName_field(), "Last name field", "3234");
//            type(kycPageObjects.firstName_field(), "First name field", "12312");
//            click(kycPageObjects.searchBtn(), "Search button");
//        }catch (Exception e){
//            ExtentReporter.logFail(""+e);
//        }
//    }
//    public void searchRegisteredKYC_InvalidInputSpecialCharacters(){
//        try{
//            type(kycPageObjects.lastName_field(), "Last name field", "@_#@#@*(#&@$^$");
//            type(kycPageObjects.firstName_field(), "First name field", "$@@!()$)(@$");
//            click(kycPageObjects.searchBtn(), "Search button");
//        }catch (Exception e){
//            ExtentReporter.logFail(""+e);
//        }
//    }
//    public void searchRegisteredKYC_InvalidInputMoreThan60Characters(){
//        try{
//            type(kycPageObjects.lastName_field(), "Last name field", "sdfdssssssssssssssssssssssssssssssssssssssssssssssssssssssfDSfsssssssssssssssgggggggggggggggASSSSSSSSSSSS");
//            type(kycPageObjects.firstName_field(), "First name field", "sfsdfdsfffffffffffffffffffffffffffSDDDDDDDFFfdsffffffffffffffffffffffffffffffffasfffffffffaaaaaaaaasfccc");
//            click(kycPageObjects.searchBtn(), "Search button");
//        }catch (Exception e){
//            ExtentReporter.logFail(""+e);
//        }
//    }



    public void validInputsInAddKYCNameSectionPositiveTesting() throws Exception {
        try {
            type(kycPageObjects.lastName_field(), "Last name field", propertyReader.getproperty("L_name"));
            type(kycPageObjects.firstName_field(), "First name field", propertyReader.getproperty("F_Name"));
            click(kycPageObjects.searchBtn(), "Search button");
            click(kycPageObjects.birthdate_field(), "Birthdate field");
            type(kycPageObjects.birthdate_field(), "Birthdate field", propertyReader.getproperty("birthDate"));
            kycPageObjects.birthdate_field().sendKeys(Keys.ARROW_LEFT);
            type(kycPageObjects.birthdate_field(), "Birthdate field", propertyReader.getproperty("month"));
            kycPageObjects.birthdate_field().sendKeys(Keys.ARROW_LEFT);
            kycPageObjects.birthdate_field().sendKeys(Keys.ARROW_LEFT);
            type(kycPageObjects.birthdate_field(), "Birthdate field", propertyReader.getproperty("day"));
            click(kycPageObjects.searchInOtherSystemButton(), "Search in other system");
            waitSleep(10);
            if(!kycPageObjects.buttonList().isEmpty()){
                ExtentReporter.logPass("Loading to be directed to the Add KYC Page.");
            }
        } catch (Exception e) {
            ExtentReporter.logFail("" + e);
        }
    }

    public void addedKYC() throws Exception {
        try {

            type(kycPageObjects.placeOfBirth(), "Place of birth", propertyReader.getproperty("birthplace"));
            click(kycPageObjects.nationalityButton(), "Nationality");

            click(kycPageObjects.filipinoNationality(), "Filipino Nationality");
            click(kycPageObjects.civilStatus(), "Civil Status");
            click(kycPageObjects.civilStatusSingle(), "Single Civil Status");
            click(kycPageObjects.genderButton(), "Gender");
            click(kycPageObjects.genderMale(), "Selected Gender");
            click(kycPageObjects.countryBirth(), "Country Birth");
            click(kycPageObjects.selectCountryBirth(), "Selected Country Birth");

            type(kycPageObjects.inputMobileNumber(), "Mobile Number", propertyReader.getproperty("mobilenumber"));
            type(kycPageObjects.inputEmail(), "Email", propertyReader.getproperty("email"));
            scrollDown(30);

            click(kycPageObjects.provinceState(), "Province or State");
            click(kycPageObjects.selectProvinceState(), "Select Province or State");
            click(kycPageObjects.municipality(), "Click Municipality");
            click(kycPageObjects.selectMunicipality(), "Select Municipality");
            click(kycPageObjects.sameWithCurrentAddress(), "Same with Current Address");

            type(kycPageObjects.companyName(), "Company/Employer Name", propertyReader.getproperty("companyname"));
            click(kycPageObjects.productServices(),"Product/Services Offered");
            click(kycPageObjects.selectProductServices(), "Selected Product/Services Offered");
            type(kycPageObjects.workAddress(), "Work Address", propertyReader.getproperty("workaddress"));
            click(kycPageObjects.posistionAtWork(),"Posistion at Work");
            click(kycPageObjects.selectedPosistionAtWork(), "Selected Product/Services Offered");
            click(kycPageObjects.natureOfWork(),"Nature of Work");
            click(kycPageObjects.selectedNatureOfWork(), "Selected Nature of Work");

            click(kycPageObjects.idType(),"ID Type");
            click(kycPageObjects.idTypeSelected(), "Selected ID Type");
            type(kycPageObjects.idNumber(), "ID Number", propertyReader.getproperty("IdNo"));
            click(kycPageObjects.expiryDate(), "Expiry Date field");
            type(kycPageObjects.expiryDate(), "Expiry Date field", propertyReader.getproperty("expiryDate"));
            kycPageObjects.expiryDate().sendKeys(Keys.ARROW_LEFT);
            type(kycPageObjects.expiryDate(), "Expiry Date field", propertyReader.getproperty("expiryMonth"));
            kycPageObjects.expiryDate().sendKeys(Keys.ARROW_LEFT);
            kycPageObjects.expiryDate().sendKeys(Keys.ARROW_LEFT);
            type(kycPageObjects.expiryDate(), "Expiry Date field", propertyReader.getproperty("expiryDay"));
            scrollDown(50);

            click(kycPageObjects.frontIDCamButton(), "Camera");
            waitSleep(2);
            click(kycPageObjects.captureButtonID1(), "Capture Photo");

            click(kycPageObjects.captureButtonID1(), "Capture Photo");
            waitSleep(2);
            click(kycPageObjects.setPhotoButton(), "Set Photo");
            click(kycPageObjects.setPhotoButton(), "Set Photo");

           click(kycPageObjects.customersPhoto(), "Customers Photo");
           click(kycPageObjects.customersPhotoButton(), "Customers Photo Capture Button");
           click(kycPageObjects.setPhotoCustomers(), "Set Customers Photo");

        } catch (Exception e) {
            ExtentReporter.logFail("" + e);
        }
    }

}
