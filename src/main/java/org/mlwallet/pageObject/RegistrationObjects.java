package org.mlwallet.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver.AppiumDriverManager;

public class RegistrationObjects extends AppiumDriverManager {
    public WebElement objCreateOne(){
        return driver.findElement(By.xpath("//*[@text=' Create one']"));
    }
    public WebElement objRegistration(){
        return driver.findElement(By.xpath("//*[@text='Registration Number']"));
    }
    public WebElement objRegistrationBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Registration Number']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    public WebElement objOTPPageBackBtn(){
        return driver.findElement(By.xpath("//*[@text='One Time Pin']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    public WebElement objMobileNumberField(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    }
    public WebElement objConfirm(){
        return driver.findElement(By.xpath("//*[@text='Confirm']"));
    }
    public WebElement objRegistrationPersonalInfo(){
        return driver.findElement(By.xpath("//*[@text='Registration Personal Info']"));
    }
    public WebElement objRegistrationPersonalInfoBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Registration Personal Info']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    public WebElement objPersonalInfo(){
        return driver.findElement(By.xpath("//*[@resource-id='LQWMWP']"));
    }
    public WebElement objFirstName(){
        return driver.findElement(By.xpath("//*[@resource-id='5PFQ86']"));
    }
    public WebElement objFirstNameErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='First name must only contain letters and spaces']"));
    }
    public WebElement objMiddleName(){
        return driver.findElement(By.xpath("//*[@resource-id='NFEGGM']"));
    }
    public WebElement objMiddleNameErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Middle name should be at least 2 characters long']"));
    }
    public WebElement objMiddleNameInvalidErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Middle name must only contain letters and spaces']"));
    }
    public WebElement objLastName(){
        return driver.findElement(By.xpath("//*[@resource-id='Q1TDKI']"));
    }
    public WebElement objLastNameErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Last name must only contain letters and spaces']"));
    }
    public WebElement objBirthDate(){
        return driver.findElement(By.xpath("//*[@resource-id='0L347S']"));
    }
    public WebElement objBirthDateErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='You must be 18 years old and above to register']"));
    }
    public WebElement objYearSelector(String year){
        return driver.findElement(By.xpath("//*[@text='"+year+"']"));
    }
    public WebElement objOkBtn(){
        return driver.findElement(By.xpath("//*[@text='OK']"));
    }
    public WebElement objDatePickerYear(){
        return driver.findElement(By.xpath("//*[@resource-id='android:id/date_picker_header_year']"));
    }
    public WebElement objEmailAddress(){
        return driver.findElement(By.xpath("//*[@resource-id='YDP4RE']"));
    }
    public WebElement objEmailAddressErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Email address is required.']"));
    }
    public WebElement objEmailAddressInvalidErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Email address is invalid']"));
    }
    public WebElement objReEnterEmailAddress(){
        return driver.findElement(By.xpath("//*[@resource-id='0VBCUG']"));
    }
    public WebElement objReEnterEmailAddressErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Email address did not match.']"));
    }
    public WebElement objPlaceOfBirth(){
        return driver.findElement(By.xpath("//*[@resource-id='SYFG77']"));
    }
    public WebElement objPlaceOfBirthErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Place of Birth must only contain letters and spaces']"));
    }
    public WebElement objPlaceOfBirthEmptyErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Place of Birth is required.']"));
    }
    public WebElement objNationality(){
        return driver.findElement(By.xpath("//*[@resource-id='9SWVJ6']"));
    }
    public WebElement objNationalityErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Nationality is required.']"));
    }
    public WebElement objNationalitySearchField(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    }
    public WebElement objFilipino(){
        return driver.findElement(By.xpath("//*[@text='FILIPINO']"));
    }
    public WebElement  objCivilStatus(){
        return driver.findElement(By.xpath("(//*[@resource-id='9SWVJ6'])[3]"));
    }
    public WebElement objCivilStatusErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Civil Status is required.']"));
    }
    public WebElement objSingleCivilStatus(){
        return driver.findElement(By.xpath("//*[@text='Single']"));
    }
    public WebElement objGender(){
        return driver.findElement(By.xpath("(//*[@resource-id='9SWVJ6'])[6]"));
    }
    public WebElement objGenderErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Gender is required.']"));
    }
    public WebElement objMaleGender(){
        return driver.findElement(By.xpath("//*[@text='Male']"));
    }
    public WebElement objRegistrationAddress(){
        return driver.findElement(By.xpath("//*[@text='Registration Address']"));
    }
    public WebElement objRegistrationAddressBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Registration Address']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    public WebElement objProvince(){
        return driver.findElement(By.xpath("(//*[@resource-id='D5ZBS3'])[1]"));
    }
    public WebElement ObjProvinceErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Province / State is required.']"));
    }
    public WebElement objProvinceSearchField(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    }
    public WebElement objAuroraProvince(){
        return driver.findElement(By.xpath("//*[@text='AURORA']"));
    }
    public WebElement objCity(){
        return driver.findElement(By.xpath("(//*[@resource-id='0Y7K8H'])[1]"));
    }
    public WebElement objCityErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='City / Town is required.']"));
    }
    public WebElement objMariaAurora(){
        return driver.findElement(By.xpath("//*[@text='MARIA AURORA']"));
    }
    public WebElement objHouseNo(){
        return driver.findElement(By.xpath("(//*[@resource-id='SRVX6B'])[1]"));
    }
    public WebElement objHouseNoErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Unit, House No., St. is required.']"));
    }
    public WebElement objHouseNoInvalidErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='Address must contain letters and numbers only']"));
    }
    public WebElement objExistingAccErrorMsg(){
        return driver.findElement(By.xpath("//*[@text='As an existing M.Lhuillier Customer, you can directly log-in using this mobile number.']"));
    }
    public WebElement objGOBackToLoginScreenBtn(){
        return driver.findElement(By.xpath("//*[@resource-id='modal-confirm-button']/child::android.widget.TextView"));
    }
    public WebElement objTermsAndCondition(){
        return driver.findElement(By.xpath("//*[@text='Terms and Conditions']"));
    }
    public WebElement objTermsAndConditionBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Terms and Conditions']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
}
