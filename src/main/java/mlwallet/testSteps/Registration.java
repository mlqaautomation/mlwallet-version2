package mlwallet.testSteps;

import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Registration extends Base_Steps{
    public Registration(){
        super();
    }
    Login login = new Login();
    public void swipeAndConfirm() throws Exception {
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(registrationObjects.objConfirm(),"Button");
    }
    public void registrationPageNavigation() throws Exception {
        mobileGeneralMethod.tap(registrationObjects.objCreateOne(),"Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.type(registrationObjects.objMobileNumberField(), "Mobile Number Text Field", propertyReader.getproperty("Registration_MobileNumber"));
        mobileGeneralMethod.tap(registrationObjects.objConfirm(),"Button");
    }
    public void selectNationality() throws Exception {
        mobileGeneralMethod.tap(registrationObjects.objNationality(), "Nationality Field");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.type(registrationObjects.objNationalitySearchField(), "Nationality search field", propertyReader.getproperty("Nationality"));
        mobileGeneralMethod.tap(registrationObjects.objFilipino(),"Nationality");
    }
    public void registrationInputName() throws Exception {
        mobileGeneralMethod.isVisible(registrationObjects.objRegistrationPersonalInfo(),"Page");
        mobileGeneralMethod.isVisible(registrationObjects.objPersonalInfo(),"Header");
        mobileGeneralMethod.type(registrationObjects.objFirstName(), "First Name Input Field", propertyReader.getproperty("First_Name"));
        mobileGeneralMethod.type(registrationObjects.objMiddleName(), "Middle Name Input Field", propertyReader.getproperty("Middle_Name"));
        mobileGeneralMethod.type(registrationObjects.objLastName(), "Last Name Input Field", propertyReader.getproperty("Last_Name"));
    }
    public void emailAndPlaceOfBirth() throws Exception {
        mobileGeneralMethod.type(registrationObjects.objEmailAddress(), "Email Address Field", propertyReader.getproperty("Email"));
        mobileGeneralMethod.type(registrationObjects.objReEnterEmailAddress(), "Re-Enter Email Address Field", propertyReader.getproperty("Email"));
        mobileGeneralMethod.type(registrationObjects.objPlaceOfBirth(), "Place of Birth Field", propertyReader.getproperty("Valid_PlaceOfBirth"));
    }
    public void selectDate() throws Exception {
        mobileGeneralMethod.tap(registrationObjects.objBirthDate(), "Birth Date Input Field");
        mobileGeneralMethod.tap(registrationObjects.objDatePickerYear(),"Year Section");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipeDown();
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date date = new Date();
        String year = dateFormat.format(date);
        int selectYear = Integer.parseInt(year) - 18;
        mobileGeneralMethod.verticalSwipeByPercentages(0.4, 0.8, 0.5);
        mobileGeneralMethod.verticalSwipeByPercentages(0.4, 0.8, 0.5);
        mobileGeneralMethod.tap(registrationObjects.objYearSelector(Integer.toString(selectYear)), "Selected Year");
        mobileGeneralMethod.tap(registrationObjects.objOkBtn(),"Button");
    }
    public void civilAndGenderSelection() throws Exception {
        mobileGeneralMethod.tap(registrationObjects.objCivilStatus(), "Civil Status");
        mobileGeneralMethod.tap(registrationObjects.objSingleCivilStatus(),"Civil Status");
        mobileGeneralMethod.tap(registrationObjects.objGender(), "Gender Field");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(registrationObjects.objMaleGender(),"Gender");
    }
    public void registrationAddressPageNavigation() throws Exception {
        registrationPageNavigation();
        mobileGeneralMethod.waitSleep(1000);
        registrationInputName();
        mobileGeneralMethod.waitSleep(25000);
//        selectDate(); for verification
        emailAndPlaceOfBirth();
        mobileGeneralMethod.verticalSwipe();
        selectNationality();
        civilAndGenderSelection();
        mobileGeneralMethod.tap(registrationObjects.objConfirm(),"Button");
    }
    //Negative
    public void registrationInvalidMobileNumber_RG_TC_02() throws Exception {
        ExtentReporter.logInfo("RG_TC_02","Registration With Invalid Number");
        mobileGeneralMethod.tap(registrationObjects.objCreateOne(),"Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(registrationObjects.objMobileNumberField(), "Mobile Number Text Field", propertyReader.getproperty("Invalid_MobileNumber"));
        mobileGeneralMethod.tap(registrationObjects.objConfirm(),"Button");
        if (mobileGeneralMethod.isVisible(loginObject.objInvalidMobNumberTxt(),"Error Message")) {
            LoggingUtils.info("RG_TC_02, Mobile number is Invalid Error Message is Displayed");
            ExtentReporter.logPass("RG_TC_02", "Mobile number is Invalid Error Message is Displayed");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_02", "Failed to Validate Display Mobile number Invalid Error Message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationFirstNameInputFieldValidation_RG_TC_04() throws Exception {
        ExtentReporter.logInfo("RG_TC_04","Registration First Name Input Field Validation");
        registrationPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(registrationObjects.objRegistrationPersonalInfo(),"Page");
        mobileGeneralMethod.isVisible(registrationObjects.objPersonalInfo(),"Header");
        mobileGeneralMethod.type(registrationObjects.objFirstName(), "First Name Input Field", propertyReader.getproperty("Invalid_First_Name"));
        swipeAndConfirm();
        mobileGeneralMethod.verticalSwipeDown();
        if (mobileGeneralMethod.isVisible(registrationObjects.objFirstNameErrorMsg(),"Error Message")) {
            String sInvalidFirstNameErrorMsg = mobileGeneralMethod.getText(registrationObjects.objFirstNameErrorMsg());
            String sExceptedFirstNameErrorMsg = "First name must only contain letters and spaces";
            mobileGeneralMethod.assertionValidation(sInvalidFirstNameErrorMsg, sExceptedFirstNameErrorMsg);
            LoggingUtils.info("RG_TC_04, Registration First Name Input Field Error message Validated");
            ExtentReporter.logPass("RG_TC_04", "Registration First Name Input Field Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_04", "Failed to Validate Registration First Name Input Field Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationMiddleNameInputFieldValidation_RG_TC_05() throws Exception {
        ExtentReporter.logInfo("RG_TC_05","Registration Middle Name Input Field Validation");
        registrationPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(registrationObjects.objRegistrationPersonalInfo(),"Page");
        mobileGeneralMethod.isVisible(registrationObjects.objPersonalInfo(),"Header");
        mobileGeneralMethod.type(registrationObjects.objFirstName(), "First Name Input Field", propertyReader.getproperty("First_Name"));
        mobileGeneralMethod.type(registrationObjects.objMiddleName(), "Middle Name Input Field", propertyReader.getproperty("Invalid_Middle_Name"));
        swipeAndConfirm();
        mobileGeneralMethod.verticalSwipeDown();
        if (mobileGeneralMethod.isVisible(registrationObjects.objMiddleNameInvalidErrorMsg(),"Error Message")) {
            String sInvalidMiddleNameErrorMsg = mobileGeneralMethod.getText(registrationObjects.objMiddleNameInvalidErrorMsg());
            String sExceptedMiddleNameErrorMsg = "Middle name must only contain letters and spaces";
            mobileGeneralMethod.assertionValidation(sInvalidMiddleNameErrorMsg, sExceptedMiddleNameErrorMsg);
            LoggingUtils.info("RG_TC_05, Registration Middle Name Input Field Error message Validated");
            ExtentReporter.logPass("RG_TC_05", "Registration Middle Name Input Field Error message Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("RG_TC_05", "Failed to Validate Registration Middle Name Input Field Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationLastNameInputFieldValidation_RG_TC_06() throws Exception {
        ExtentReporter.logInfo("RG_TC_06","Registration Last Name Input Field Validation");
        registrationPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(registrationObjects.objRegistrationPersonalInfo(),"Page");
        mobileGeneralMethod.isVisible(registrationObjects.objPersonalInfo(),"Header");
        mobileGeneralMethod.type(registrationObjects.objFirstName(), "First Name Input Field", propertyReader.getproperty("First_Name"));
        mobileGeneralMethod.type(registrationObjects.objMiddleName(), "Middle Name Input Field", propertyReader.getproperty("Middle_Name"));
        mobileGeneralMethod.type(registrationObjects.objLastName(), "Last Name Input Field", propertyReader.getproperty("Invalid_Last_Name"));
        swipeAndConfirm();
        mobileGeneralMethod.verticalSwipeDown();
        if (mobileGeneralMethod.isVisible(registrationObjects.objLastNameErrorMsg(),"Error Message")) {
            String sInvalidLastNameErrorMsg = mobileGeneralMethod.getText(registrationObjects.objLastNameErrorMsg());
            String sExceptedLastNameErrorMsg = "Last name must only contain letters and spaces";
            mobileGeneralMethod.assertionValidation(sInvalidLastNameErrorMsg, sExceptedLastNameErrorMsg);
            LoggingUtils.info("RG_TC_06, Registration Last Name Input Field Error message Validated");
            ExtentReporter.logPass("RG_TC_06", "Registration Last Name Input Field Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_06", "Failed to Validate Registration Last Name Input Field Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationInvalidBirthDate_RG_TC_07() throws Exception {
        ExtentReporter.logInfo("RG_TC_07","Registration Invalid Birth Date");
        registrationPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        registrationInputName();
        mobileGeneralMethod.tap(registrationObjects.objBirthDate(), "Birth Date Input Field");
        mobileGeneralMethod.tap(registrationObjects.objOkBtn(),"Button");
        swipeAndConfirm();
        mobileGeneralMethod.verticalSwipeDown();
        if (mobileGeneralMethod.isVisible(registrationObjects.objBirthDateErrorMsg(),"Error Message")) {
            String sInvalidBirthDateNameErrorMsg = mobileGeneralMethod.getText(registrationObjects.objBirthDateErrorMsg());
            String sExceptedBirthDateNameErrorMsg = "You must be 18 years old and above to register";
            mobileGeneralMethod.assertionValidation(sInvalidBirthDateNameErrorMsg, sExceptedBirthDateNameErrorMsg);
            LoggingUtils.info("RG_TC_07, Registration Invalid Birth Date Error message Validated");
            ExtentReporter.logPass("RG_TC_07", "Registration Invalid Birth Date Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_07", "Failed to Validate Registration Invalid Birth Date Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationInvalidEmailAddress_RG_TC_08() throws Exception {
        ExtentReporter.logInfo("RG_TC_08","Registration Invalid Email Address");
        registrationPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        registrationInputName();
        mobileGeneralMethod.waitSleep(25000);
//        selectDate(); Need Verification
        mobileGeneralMethod.type(registrationObjects.objEmailAddress(), "Email Address Field", propertyReader.getproperty("Invalid_Email_Address"));
        swipeAndConfirm();
        mobileGeneralMethod.verticalSwipeDown();
        if (mobileGeneralMethod.isVisible(registrationObjects.objEmailAddressInvalidErrorMsg(),"Error Message")) {
            String sInvalidEmailAddressNameErrorMsg = mobileGeneralMethod.getText(registrationObjects.objEmailAddressInvalidErrorMsg());
            String sExceptedEmailAddressNameErrorMsg = "Email address is invalid";
            mobileGeneralMethod.assertionValidation(sInvalidEmailAddressNameErrorMsg, sExceptedEmailAddressNameErrorMsg);
            LoggingUtils.info("RG_TC_08, Registration Invalid Email Address Error message Validated");
            ExtentReporter.logPass("RG_TC_08", "Registration Invalid Email Address Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_08", "Failed to Validate Registration Invalid Email Address Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationInvalidReEnterEmailAddress_RG_TC_09() throws Exception {
        ExtentReporter.logInfo("RG_TC_09","Registration Invalid Re-Enter Email Address");
        registrationPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        registrationInputName();
        mobileGeneralMethod.waitSleep(25000);
//        selectDate(); Need Verification
        mobileGeneralMethod.type(registrationObjects.objEmailAddress(), "Email Address Field", propertyReader.getproperty("Email"));
        mobileGeneralMethod.type(registrationObjects.objReEnterEmailAddress(), "Re-Enter Email Address Field", propertyReader.getproperty("eMailAddress"));
        swipeAndConfirm();
        if (mobileGeneralMethod.isVisible(registrationObjects.objReEnterEmailAddressErrorMsg(),"Error Message")) {
            String sInvalidEmailAddressNameErrorMsg = mobileGeneralMethod.getText(registrationObjects.objReEnterEmailAddressErrorMsg());
            String sExceptedEmailAddressNameErrorMsg = "Email address did not match.";
            mobileGeneralMethod.assertionValidation(sInvalidEmailAddressNameErrorMsg, sExceptedEmailAddressNameErrorMsg);
            LoggingUtils.info("RG_TC_09, Registration Invalid Re-Enter Email Address Error message Validated");
            ExtentReporter.logPass("RG_TC_09", "Registration Invalid Re-Enter Email Address Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_09", "Failed to Validate Registration Invalid Re-Enter Email Address Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationInvalidPlaceOfBirthValidation_RG_TC_10() throws Exception {
       ExtentReporter.logInfo("RG_TC_10","Registration Invalid Place of Birth");
       registrationPageNavigation();
       mobileGeneralMethod.waitSleep(3000);
       registrationInputName();
        mobileGeneralMethod.waitSleep(25000);
//        selectDate(); Need Verification
       mobileGeneralMethod.type(registrationObjects.objEmailAddress(), "Email Address Field", propertyReader.getproperty("Email"));
       mobileGeneralMethod.type(registrationObjects.objReEnterEmailAddress(), "Re-Enter Email Address Field", propertyReader.getproperty("Email"));
       mobileGeneralMethod.type(registrationObjects.objPlaceOfBirth(), "Place of Birth Field", propertyReader.getproperty("Invalid_PlaceOfBirth"));
        swipeAndConfirm();
        if (mobileGeneralMethod.isVisible(registrationObjects.objPlaceOfBirthErrorMsg(),"Error Message")) {
            String sInvalidPlaceOfBirthErrorMsg = mobileGeneralMethod.getText(registrationObjects.objPlaceOfBirthErrorMsg());
            String sExceptedPlaceOfBirthErrorMsg = "Place of Birth must only contain letters and spaces";
            mobileGeneralMethod.assertionValidation(sInvalidPlaceOfBirthErrorMsg, sExceptedPlaceOfBirthErrorMsg);
            LoggingUtils.info("RG_TC_10, Registration Invalid Place of Birth Error message Validated");
            ExtentReporter.logPass("RG_TC_10", "Registration Invalid Place of Birth Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_10", "Failed to Validate Registration Invalid Place of Birth Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationEmptyNationalityFieldValidation_RG_TC_11() throws Exception {
        ExtentReporter.logInfo("RG_TC_11","Registration Empty Nationality Field Validation");
        registrationPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        registrationInputName();
        mobileGeneralMethod.waitSleep(25000);
//        selectDate(); Need Verification
        emailAndPlaceOfBirth();
        swipeAndConfirm();
        if (mobileGeneralMethod.isVisible(registrationObjects.objNationalityErrorMsg(),"Error Message")) {
            String sInvalidNationalityErrorMsg = mobileGeneralMethod.getText(registrationObjects.objNationalityErrorMsg());
            String sExceptedNationalityErrorMsg = "Nationality is required.";
            mobileGeneralMethod.assertionValidation(sInvalidNationalityErrorMsg, sExceptedNationalityErrorMsg);
            LoggingUtils.info("RG_TC_11, Registration Invalid Empty Nationality Field Error message Validated");
            ExtentReporter.logPass("RG_TC_11", "Registration Empty Nationality Field Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_11", "Failed to Validate Registration Empty Nationality Field Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationEmptyCivilStatusFieldValidation_RG_TC_12() throws Exception {
        ExtentReporter.logInfo("RG_TC_12","Registration Empty Civil status Field Validation");
        registrationPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        registrationInputName();
        mobileGeneralMethod.waitSleep(25000);
//        selectDate(); Need Verification
        emailAndPlaceOfBirth();
        selectNationality();
        swipeAndConfirm();
        if (mobileGeneralMethod.isVisible(registrationObjects.objCivilStatusErrorMsg(),"Error Message")) {
            String sInvalidCivilStatusErrorMsg = mobileGeneralMethod.getText(registrationObjects.objCivilStatusErrorMsg());
            String sExceptedCivilStatusErrorMsg = "Civil Status is required.";
            mobileGeneralMethod.assertionValidation(sInvalidCivilStatusErrorMsg, sExceptedCivilStatusErrorMsg);
            LoggingUtils.info("RG_TC_12, Registration Empty Civil status Field Error message Validated");
            ExtentReporter.logPass("RG_TC_12", "Registration Empty Civil status Field Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_12", "Failed to Validate Registration Empty Civil status Field Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationEmptyGenderFieldValidation_RG_TC_13() throws Exception {
        ExtentReporter.logInfo("RG_TC_13","Registration Empty Gender Field Validation");
        registrationPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        registrationInputName();
        mobileGeneralMethod.waitSleep(25000);
//        selectDate(); Need Verification
        emailAndPlaceOfBirth();
        selectNationality();
        swipeAndConfirm();
        mobileGeneralMethod.tap(registrationObjects.objCivilStatus(), "Civil Status");
        mobileGeneralMethod.tap(registrationObjects.objSingleCivilStatus(),"Single Status");
        swipeAndConfirm();
        mobileGeneralMethod.tap(registrationObjects.objConfirm(),"Button");
        if (mobileGeneralMethod.isVisible(registrationObjects.objGenderErrorMsg(),"Error Message")) {
            String sActualGenderErrorMsg = mobileGeneralMethod.getText(registrationObjects.objGenderErrorMsg());
            String sExceptedGenderErrorMsg = "Gender is required.";
            mobileGeneralMethod.assertionValidation(sActualGenderErrorMsg, sExceptedGenderErrorMsg);
            LoggingUtils.info("RG_TC_13, Registration Empty Gender Field Error message Validated");
            ExtentReporter.logPass("RG_TC_13", "Registration Empty Gender Field Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_13", "Failed to Validate Registration Empty Gender Field Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationEmptyProvinceFieldValidation_RG_TC_14() throws Exception {
        ExtentReporter.logInfo("RG_TC_14","Registration Empty Province Field Validation");
        registrationAddressPageNavigation();
        mobileGeneralMethod.isVisible(registrationObjects.objRegistrationAddress(),"Page");
        mobileGeneralMethod.tap(registrationObjects.objConfirm(),"Button");
        if (mobileGeneralMethod.isVisible(registrationObjects.ObjProvinceErrorMsg(),"Error Message")) {
            String sInvalidProvinceNameErrorMsg = mobileGeneralMethod.getText(registrationObjects.ObjProvinceErrorMsg());
            String sExceptedProvinceNameErrorMsg = "Province / State is required.";
            mobileGeneralMethod.assertionValidation(sInvalidProvinceNameErrorMsg, sExceptedProvinceNameErrorMsg);
            LoggingUtils.info("RG_TC_14, Registration Empty Province Field Error message Validated");
            ExtentReporter.logPass("RG_TC_14", "Registration Empty Province Field Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_14", "Failed to Validate Registration Empty Gender Field Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationEmptyCityFieldValidation_RG_TC_15() throws Exception {
        ExtentReporter.logInfo("RG_TC_15","Registration Empty City Field Validation");
        registrationAddressPageNavigation();
        mobileGeneralMethod.isVisible(registrationObjects.objRegistrationAddress(),"Page");
        mobileGeneralMethod.tap(registrationObjects.objProvince(), "Province Field");
        mobileGeneralMethod.type(registrationObjects.objProvinceSearchField(), "Province Search Field", propertyReader.getproperty("Province"));
        mobileGeneralMethod.tap(registrationObjects.objAuroraProvince(),"Province");
        mobileGeneralMethod.tap(registrationObjects.objConfirm(),"Button");
        if (mobileGeneralMethod.isVisible(registrationObjects.objCityErrorMsg(),"Error Message")) {
            String sInvalidCityNameErrorMsg = mobileGeneralMethod.getText(registrationObjects.objCityErrorMsg());
            String sExceptedCityNameErrorMsg = "City / Town is required.";
            mobileGeneralMethod.assertionValidation(sInvalidCityNameErrorMsg, sExceptedCityNameErrorMsg);
            LoggingUtils.info("RG_TC_15, Registration Empty City Field Error message Validated");
            ExtentReporter.logPass("RG_TC_15", "Registration Empty City Field Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_15", "Failed to Validate Registration Empty City Field Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationEmptyHouseNoFieldValidation_RG_TC_16() throws Exception {
        ExtentReporter.logInfo("RG_TC_16","Registration Empty House No Field Validation");
        registrationAddressPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(registrationObjects.objRegistrationAddress(),"Page");
        mobileGeneralMethod.tap(registrationObjects.objProvince(), "Province Field");
        mobileGeneralMethod.type(registrationObjects.objProvinceSearchField(), "Province Search Field", propertyReader.getproperty("Province"));
        mobileGeneralMethod.tap(registrationObjects.objAuroraProvince(), "Province");
        mobileGeneralMethod.tap(registrationObjects.objCity(), "City Field");
        mobileGeneralMethod.tap(registrationObjects.objMariaAurora(),"City");
        mobileGeneralMethod.tap(registrationObjects.objConfirm(),"Button");
        if (mobileGeneralMethod.isVisible(registrationObjects.objHouseNoErrorMsg(),"Error Message")) {
            String sInvalidHouseNoNameErrorMsg = mobileGeneralMethod.getText(registrationObjects.objHouseNoErrorMsg());
            String sExceptedHouseNoNameErrorMsg = "Unit, House No., St. is required.";
            mobileGeneralMethod.assertionValidation(sInvalidHouseNoNameErrorMsg, sExceptedHouseNoNameErrorMsg);
            LoggingUtils.info("RG_TC_16, Registration Empty House No Field Error message Validated");
            ExtentReporter.logPass("RG_TC_16", "Registration Empty House No Field Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_16", "Failed to Validate Registration Empty House No Field Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationEmptyFirstNameFieldValidation_RG_TC_18() throws Exception {
        ExtentReporter.logInfo("RG_TC_18","Registration Empty First Name Field Validation");
        registrationPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        swipeAndConfirm();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipeDown();
        if (mobileGeneralMethod.isVisible(registrationObjects.objFirstNameErrorMsg(),"Error Message")) {
            String sFirstNameErrorMsg = mobileGeneralMethod.getText(registrationObjects.objFirstNameErrorMsg());
            String sExpectedMsg = "First name must only contain letters and spaces";
            mobileGeneralMethod.assertionValidation(sFirstNameErrorMsg, sExpectedMsg);
            LoggingUtils.info("RG_TC_18, Registration Empty First Name Field Error message Validated");
            ExtentReporter.logPass("RG_TC_18", "Registration Empty First Name Field Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_18", "Failed to Validate Registration Empty First Name Field Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationEmptyMiddleNameFieldValidation_RG_TC_19() throws Exception {
        ExtentReporter.logInfo("RG_TC_19","Registration Empty Middle Name Input Validation");
        registrationPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(registrationObjects.objRegistrationPersonalInfo(),"Page");
        mobileGeneralMethod.isVisible(registrationObjects.objPersonalInfo(),"Header");
        mobileGeneralMethod.type(registrationObjects.objFirstName(), "First Name Input Field", propertyReader.getproperty("First_Name"));
        swipeAndConfirm();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipeDown();
        if (mobileGeneralMethod.isVisible(registrationObjects.objMiddleNameErrorMsg(),"Error Message")) {
            String sInvalidMiddleNameErrorMsg = mobileGeneralMethod.getText(registrationObjects.objMiddleNameErrorMsg());
            String sExceptedMiddleNameErrorMsg = "Middle name should be at least 2 characters long";
            mobileGeneralMethod.assertionValidation(sInvalidMiddleNameErrorMsg, sExceptedMiddleNameErrorMsg);
            LoggingUtils.info("RG_TC_19, Registration Empty Middle Name Field Error message Validated");
            ExtentReporter.logPass("RG_TC_19", "Registration Empty Middle Name Field Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_19", "Failed to Validate Registration Empty Middle Name Field Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationEmptyLastNameFieldValidation_RG_TC_20() throws Exception {
        ExtentReporter.logInfo("RG_TC_20","Registration Empty Last Name Field Validation");
        registrationPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(registrationObjects.objRegistrationPersonalInfo(),"Page");
        mobileGeneralMethod.isVisible(registrationObjects.objPersonalInfo(),"Header");
        mobileGeneralMethod.type(registrationObjects.objFirstName(), "First Name Input Field", propertyReader.getproperty("First_Name"));
        mobileGeneralMethod.type(registrationObjects.objMiddleName(), "Middle Name Input Field", propertyReader.getproperty("Middle_Name"));
        swipeAndConfirm();
        if (mobileGeneralMethod.isVisible(registrationObjects.objLastNameErrorMsg(),"Error Message")) {
            String sInvalidLastNameErrorMsg = mobileGeneralMethod.getText(registrationObjects.objLastNameErrorMsg());
            String sExceptedLastNameErrorMsg = "Last name must only contain letters and spaces";
            mobileGeneralMethod.assertionValidation(sInvalidLastNameErrorMsg, sExceptedLastNameErrorMsg);
            LoggingUtils.info("RG_TC_20, Registration Empty Last Name Field Error message Validated");
            ExtentReporter.logPass("RG_TC_20", "Registration Empty Last Name Field Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_20", "Failed to Validate Registration Empty Last Name Field Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationEmptyEmailAddress_RG_TC_22() throws Exception {
        ExtentReporter.logInfo("RG_TC_22","Registration Empty Email Address Field Validation");
        registrationPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        registrationInputName();
        mobileGeneralMethod.waitSleep(25000);
//        selectDate(); Need Verification
        swipeAndConfirm();
        if (mobileGeneralMethod.isVisible(registrationObjects.objEmailAddressErrorMsg(),"Error Message")) {
            String sInvalidEmailAddressNameErrorMsg = mobileGeneralMethod.getText(registrationObjects.objEmailAddressErrorMsg());
            String sExceptedEmailAddressNameErrorMsg = "Email address is required.";
            mobileGeneralMethod.assertionValidation(sInvalidEmailAddressNameErrorMsg, sExceptedEmailAddressNameErrorMsg);
            LoggingUtils.info("RG_TC_22, Registration Empty Email Address Field Error message Validated");
            ExtentReporter.logPass("RG_TC_22", "Registration Empty Email Address Field Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_22", "Failed to Validate Registration Empty Email Address Field Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationEmptyPlaceOfBirthValidation_RG_TC_23() throws Exception {
        ExtentReporter.logInfo("RG_TC_23","Registration Empty Place of Birth Field Validation");
        registrationPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        registrationInputName();
        mobileGeneralMethod.waitSleep(25000);
//        selectDate(); Need Verification
        mobileGeneralMethod.type(registrationObjects.objEmailAddress(), "Email Address Field", propertyReader.getproperty("Email"));
        mobileGeneralMethod.type(registrationObjects.objReEnterEmailAddress(), "Re-Enter Email Address Field", propertyReader.getproperty("Email"));
        swipeAndConfirm();
        if (mobileGeneralMethod.isVisible(registrationObjects.objPlaceOfBirthEmptyErrorMsg(),"Error Message")) {
            String sInvalidPlaceOfBirthNameErrorMsg = mobileGeneralMethod.getText(registrationObjects.objPlaceOfBirthEmptyErrorMsg());
            String sExceptedPlaceOfBirthNameErrorMsg = "Place of Birth is required.";
            mobileGeneralMethod.assertionValidation(sInvalidPlaceOfBirthNameErrorMsg, sExceptedPlaceOfBirthNameErrorMsg);
            LoggingUtils.info("RG_TC_23, Registration Empty Place of Birth Field Error message Validated");
            ExtentReporter.logPass("RG_TC_23", "Registration Empty Place of Birth Field Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_23", "Failed to Validate Registration Empty Place of Birth Field Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationInvalidHouseNoFieldValidation_RG_TC_24() throws Exception {
        ExtentReporter.logInfo("RG_TC_24","Registration Invalid House No Field Validation");
        registrationAddressPageNavigation();
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.isVisible(registrationObjects.objRegistrationAddress(),"Page");
        mobileGeneralMethod.tap(registrationObjects.objProvince(), "Province Field");
        mobileGeneralMethod.type(registrationObjects.objProvinceSearchField(), "Province Search Field", propertyReader.getproperty("Province"));
        mobileGeneralMethod.tap(registrationObjects.objAuroraProvince(),"Province");
        mobileGeneralMethod.tap(registrationObjects.objCity(), "City Field");
        mobileGeneralMethod.tap(registrationObjects.objMariaAurora(),"City");
        mobileGeneralMethod.type(registrationObjects.objHouseNo(), "House No Field", propertyReader.getproperty("Invalid_HouseNo"));
        mobileGeneralMethod.tap(registrationObjects.objConfirm(),"Button");
        if (mobileGeneralMethod.isVisible(registrationObjects.objHouseNoInvalidErrorMsg(),"Error Message")) {
            String sInvalidEmailAddressNameErrorMsg = mobileGeneralMethod.getText(registrationObjects.objHouseNoInvalidErrorMsg());
            String sExceptedEmailAddressNameErrorMsg = "Address must contain letters and numbers only";
            mobileGeneralMethod.assertionValidation(sInvalidEmailAddressNameErrorMsg, sExceptedEmailAddressNameErrorMsg);
            LoggingUtils.info("RG_TC_24, Registration Invalid House No Field Error message Validated");
            ExtentReporter.logPass("RG_TC_24", "Registration Invalid House No Field Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_24", "Failed to Validate Registration Invalid House No Field Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void registrationCreatingAccountWithExistingMLWalletAccount_RG_TC_25() throws Exception {
        ExtentReporter.logInfo("RG_TC_25","Registration Creating Account With Existing ML Wallet Account");
        mobileGeneralMethod.tap(registrationObjects.objCreateOne(),"Button");
        mobileGeneralMethod.type(registrationObjects.objMobileNumberField(), "Mobile Number Text Field", propertyReader.getproperty("Branch_Verified"));
        mobileGeneralMethod.tap(registrationObjects.objConfirm(),"Button");
        if (mobileGeneralMethod.isVisible(registrationObjects.objExistingAccErrorMsg(),"Error message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(registrationObjects.objExistingAccErrorMsg());
            String sExpectedErrorMsg = "As an existing M.Lhuillier Customer, you can directly log-in using this mobile number.";
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExpectedErrorMsg);
            mobileGeneralMethod.isVisible(registrationObjects.objGOBackToLoginScreenBtn(),"Button");
            LoggingUtils.info("RG_TC_25, Registration Creating Account With Existing ML Wallet Account Error message Validated");
            ExtentReporter.logPass("RG_TC_25", "Registration Creating Account With Existing ML Wallet Account Error message Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_25", "Failed to Validate Registration Creating Account With Existing ML Wallet Account Error message");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Positive
    public void registrationNumberPageUIValidation_RG_TC_27() throws Exception {
        ExtentReporter.logInfo("RG_TC_27","Registration Number Page UI Validation");
        mobileGeneralMethod.tap(registrationObjects.objCreateOne(),"Button");
        if (mobileGeneralMethod.isVisible(registrationObjects.objRegistration(),"page")) {
            mobileGeneralMethod.isVisible(registrationObjects.objMobileNumberField(), "Mobile Number Input Field");
            mobileGeneralMethod.isVisible(registrationObjects.objConfirm(),"Button");
            LoggingUtils.info("RG_TC_27, Registration Number Page UI Validated");
            ExtentReporter.logPass("RG_TC_27", "Registration Number Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_27", "Failed to Validate Registration Number Page UI");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Positive
    public void registrationPersonalInfoPageUIValidation_RG_TC_30() throws Exception {
        ExtentReporter.logInfo("RG_TC_30","Registration Personal info Page UI Validation");
        registrationPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(registrationObjects.objRegistrationPersonalInfo(),"Page")) {
            mobileGeneralMethod.isVisible(registrationObjects.objPersonalInfo(),"Header");
            mobileGeneralMethod.isVisible(registrationObjects.objFirstName(), "First Name Input Field");
            mobileGeneralMethod.isVisible(registrationObjects.objMiddleName(), "Middle Name Input Field");
            mobileGeneralMethod.isVisible(registrationObjects.objLastName(), "Last Name Input Field");
            mobileGeneralMethod.isVisible(registrationObjects.objBirthDate(), "Birth date Input Field");
            mobileGeneralMethod.isVisible(registrationObjects.objEmailAddress(), "Email Address Input Field");
            mobileGeneralMethod.isVisible(registrationObjects.objReEnterEmailAddress(), "Re-Email Address Input Field");
            mobileGeneralMethod.isVisible(registrationObjects.objPlaceOfBirth(), "Place of Birth Input Field");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(registrationObjects.objNationality(), "Choose Nationality Field");
            mobileGeneralMethod.isVisible(registrationObjects.objCivilStatus(), "Choose Civil Status Field");
            mobileGeneralMethod.isVisible(registrationObjects.objGender(), "Choose Gender Field");
            mobileGeneralMethod.isVisible(registrationObjects.objConfirm(),"Button");
            LoggingUtils.info("RG_TC_30, Registration Personal info Page UI Validated");
            ExtentReporter.logPass("RG_TC_30", "Registration Personal info Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_30", "Failed to Validate Registration Personal info Page UI");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Positive
    public void registrationNumberPageBackBtnValidation_RG_TC_31() throws Exception {
        ExtentReporter.logInfo("RG_TC_31","Registration Number Page Back Arrow Button Validation");
        mobileGeneralMethod.tap(registrationObjects.objCreateOne(),"Button");
        mobileGeneralMethod.tap(registrationObjects.objRegistrationBackBtn(), "Registration Page Back Arrow Btn");
        if (mobileGeneralMethod.isVisible(loginObject.objLoginBtn(),"Button")) {
            LoggingUtils.info("RG_TC_31, Registration Number Page Back Arrow Button Validated");
            ExtentReporter.logPass("RG_TC_31", "Registration Number Page Back Arrow Button Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_31", "Failed to Validate Registration Number Page Back Arrow Button");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Positive
    public void registrationPersonalInfoPageBackBtnValidation_RG_TC_33() throws Exception {
        ExtentReporter.logInfo("RG_TC_33","Registration Personal Info Page Back Btn Validation");
        registrationPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(registrationObjects.objRegistrationPersonalInfoBackBtn(), "OTP Page Back arrow Btn");
        if (mobileGeneralMethod.isVisible(registrationObjects.objConfirm(),"Page")) {
            LoggingUtils.info("RG_TC_33, Registration Personal Info Page Back Btn Validated");
            ExtentReporter.logPass("RG_TC_33", "Registration Personal Info Page Back Btn Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_33", "Failed to Validate Registration Personal Info Page Back Btn");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Positive
    public void registrationAddressPageUIValidation_RG_TC_34() throws Exception {
        ExtentReporter.logInfo("RG_TC_34","Registration Address Page UI Validation");
        registrationAddressPageNavigation();
        if (mobileGeneralMethod.isVisible(registrationObjects.objRegistrationAddress(),"Page")) {
            mobileGeneralMethod.isVisible(registrationObjects.objProvince(), "Select State Or Province Field");
            mobileGeneralMethod.isVisible(registrationObjects.objCity(), "Select City or Town");
            mobileGeneralMethod.isVisible(registrationObjects.objHouseNo(), "Unit, House No., St.");
            mobileGeneralMethod.isVisible(registrationObjects.objConfirm(),"Button");
            LoggingUtils.info("RG_TC_34, Registration Address Page UI Validated");
            ExtentReporter.logPass("RG_TC_34", "Registration Address Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_34", "Failed to Validate Registration Address Page UI");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Positive
    public void registrationAddressPageBackBtnValidation_RG_TC_35() throws Exception {
        ExtentReporter.logInfo("RG_TC_35","Registration Address Page Back btn Validation");
        registrationAddressPageNavigation();
        mobileGeneralMethod.isVisible(registrationObjects.objRegistrationAddress(),"Page");
        mobileGeneralMethod.tap(registrationObjects.objRegistrationAddressBackBtn(), "Registration Address Back Btn");
        if (mobileGeneralMethod.isVisible(registrationObjects.objRegistrationPersonalInfo(),"Page")) {
            LoggingUtils.info("RG_TC_35, Registration Address Page Back btn Validated");
            ExtentReporter.logPass("RG_TC_35", "Registration Address Page Back btn Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_35", "Failed to Validate Registration Address Page Back btn");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Positive
    public void registrationTermsAndConditionPageBackBtnValidation_RG_TC_37() throws Exception {
        ExtentReporter.logInfo("RG_TC_37","Registration Terms and Condition Page Back Btn Validation");
        registrationAddressPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(registrationObjects.objRegistrationAddress(),"Page");
        mobileGeneralMethod.tap(registrationObjects.objProvince(), "Province Field");
        mobileGeneralMethod.type(registrationObjects.objProvinceSearchField(), "Province Search Field", propertyReader.getproperty("Province"));
        mobileGeneralMethod.tap(registrationObjects.objAuroraProvince(),"Province");
        mobileGeneralMethod.tap(registrationObjects.objCity(), "City Field");
        mobileGeneralMethod.tap(registrationObjects.objMariaAurora(),"City");
        mobileGeneralMethod.type(registrationObjects.objHouseNo(), "House No Field", propertyReader.getproperty("HouseNo"));
        mobileGeneralMethod.tap(registrationObjects.objConfirm(),"Button");
        mobileGeneralMethod.isVisible(registrationObjects.objTermsAndCondition(),"Page");
        mobileGeneralMethod.tap(registrationObjects.objTermsAndConditionBackBtn(), "Terms And Condition back Btn");
        if (mobileGeneralMethod.isVisible(registrationObjects.objRegistrationAddress(),"Page")) {
            LoggingUtils.info("RG_TC_37, Registration Terms and Condition Page Back Btn Validated");
            ExtentReporter.logPass("RG_TC_37", "Registration Terms and Condition Page Back Btn Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("RG_TC_37", "Failed to Validate Registration Terms and Condition Page Back Btn");
            System.out.println("-----------------------------------------------------------");
        }
    }
}
