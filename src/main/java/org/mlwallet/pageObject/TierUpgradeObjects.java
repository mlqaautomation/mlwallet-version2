package org.mlwallet.pageObject;

import org.openqa.selenium.By;
import utilities.Driver.AppiumDriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver.AppiumDriverManager;

public class TierUpgradeObjects extends AppiumDriverManager {
    public WebElement objVerificationTierPerksLabel(){
        return driver.findElement(By.xpath("//*[@text='Verification Tier Perks']"));
    }
    //  Verification Tier perk page back button
    public WebElement objVerificationTierPerksBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Verification Tier Perks']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    //  Semi verified Tab
    public WebElement objSemiVerifiedTab(){
        return driver.findElement(By.xpath("//*[@text='Semi Verified']"));
    }
    //  Upgrade Tier Level Button
    public WebElement objUpgradeTierLevel(){
        return driver.findElement(By.xpath("//*[@text='Upgrade Tier Level']"));
    }
    //  Fully verified Tab
    public WebElement objFullyVerifiedTab(){
        return driver.findElement(By.xpath("//*[@text='Fully Verified']"));
    }
    //  Branch verified Tab
    public WebElement objBranchVerifiedTab(){
        return driver.findElement(By.xpath("//*[@text='Branch Verified']"));
    }
    //  Account Details
    public WebElement objAccountDetails(){
        return driver.findElement(By.xpath("//*[@text='Account Details']"));
    }
    //  Account Details page back button
    public WebElement objAccountDetailsBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Account Details']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    //  Search field
    public WebElement objSearchFieldInput(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    }
    //  Matching elements for Product/Services
    public WebElement objMatchingElementsProductServices(int i){
        return driver.findElement(By.xpath("((//*[@class='android.widget.ScrollView']/child::android.view.ViewGroup/child::android.view.ViewGroup)["+i+"]/child::android.view.ViewGroup)[1]/child::android.view.ViewGroup/child::android.widget.TextView"));
    }
    //  Matching Elements
    public WebElement objMatchingElements(){
        return driver.findElement(By.xpath("//*[@class='android.widget.ScrollView']/child::android.view.ViewGroup/child::android.view.ViewGroup"));
    }
    //  Product/Services Offered selection button
    public WebElement objProductServiceSelectionBtn(){
        return driver.findElement(By.xpath("//*[@text='Product/Services Offered']/preceding-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
    //  Position at Work selection button
    public WebElement objPositionAtWokSelectionBtn(){
        return driver.findElement(By.xpath("//*[@text='Position at Work']/preceding-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
    //  Nature of Work selection button
    public WebElement objNatureOfWorkSelectionBtn(){
        return driver.findElement(By.xpath("(//*[@text='Nature of Work']/preceding-sibling::android.view.ViewGroup/child::android.widget.TextView)[2]"));
    }
    //  Confirm details btn
    public WebElement objConfirmDetails(){
        return driver.findElement(By.xpath("//*[@text='Confirm Details']"));
    }
    //  Tier Upgrade btn
    public WebElement objTierUpgrade(){
        return driver.findElement(By.xpath("//*[@text='Tier Upgrade']"));
    }
    //  Place of Birth
    public WebElement objPlaceOfBirth(){
        return driver.findElement(By.xpath("//*[@text='Place of Birth']/following-sibling::android.widget.EditText"));
    }
    //  Nationality
    public WebElement objNationality(){
        return driver.findElement(By.xpath("//*[@text='Nationality']/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView"));
    }
    //  Civil Status
    public WebElement objCivilStatus(){
        return driver.findElement(By.xpath("//*[@text='Civil Status']/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView"));
    }
    //  Civil = Married
    public WebElement objMarried(){
        return driver.findElement(By.xpath("//*[@text='Married']"));
    }
    //
//  Gender at Birth
    public WebElement objGenderAtBirth(){
        return driver.findElement(By.xpath("//*[@text='Gender at Birth']/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView"));
    }
    //  Gender = Male
    public WebElement objGenderMale(){
        return driver.findElement(By.xpath("//*[@text='Male']"));
    }
    //  Gender = Female
    public WebElement objGenderFemale(){
        return driver.findElement(By.xpath("//*[@text='Female']"));
    }
    //----------Source of Income-------------------
    public WebElement objSourceOfIncome(){
        return driver.findElement(By.xpath("//*[@text='Source of Income']/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objSourceOfIncomePage(){
        return driver.findElement(By.xpath("//*[@text='Source of Income']"));
    }
    public WebElement getObjSourceOfIncome(String source) {
        return driver.findElement(By.xpath("//*[@text='" + source + "']/self::android.widget.TextView"));
    }
    //  Company/Employer Name
    public WebElement objCompanyOrEmployerName(){
        return driver.findElement(By.xpath("//*[@text='Company/Employer Name']/following-sibling::android.widget.EditText"));
    }
    //  Work Address
    public WebElement objWorkAddress(){
        return driver.findElement(By.xpath("//*[@text='Work Address']/following-sibling::android.widget.EditText"));
    }
    //  Account Details
    public WebElement objPersonalInformation(){
        return driver.findElement(By.xpath("//*[@text='Personal Information']"));
    }
    //-----------------Product/Service Offered-----------------
    public WebElement objProductServiceOffered(){
        return driver.findElement(By.xpath("//*[@text='Product/Services Offered']/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objProductServicePage(){
        return driver.findElement(By.xpath("//*[@text='Product/Services Offered']"));
    }
    public WebElement getObjProductServiceOffered(String service){
        return driver.findElement(By.xpath("//*[@text='" + service + "']/self::android.widget.TextView"));
    }
    // -------------- Position At work-------------
    public WebElement objPositionAtWork(){
        return driver.findElement(By.xpath("//*[@text='Position at Work']/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objPositionAtWorkPage(){
        return driver.findElement(By.xpath("//*[@text='Position at Work']"));
    }
    public WebElement getObjPositionAtWork(String position){
        return driver.findElement(By.xpath("//*[@text='" + position + "']/self::android.widget.TextView"));
    }
    // ------------- Nature of work ------------------
    public WebElement ObjNatureOfWork(){
        return driver.findElement(By.xpath("(//*[@text='Nature of Work'])[2]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement ObjNatureOfWorkPage(){
        return driver.findElement(By.xpath("//*[@text='Nature of Work']"));
    }
    public WebElement getObjNatureOfWork(String nature){
        return driver.findElement(By.xpath("//*[@text='" + nature + "']/self::android.widget.TextView"));
    }
    //  Select any valid ID
    public WebElement objSelectAnyValidID(){
        return driver.findElement(By.xpath("//*[@text='Select Any Valid ID']"));
    }
    //  Select ID
    public WebElement objSelectID(){
        return driver.findElement(By.xpath("//*[@text='Select ID']"));
    }
    //  Select ID Selection Btn
    public WebElement objSelectIDSelectionBtn(){
        return driver.findElement(By.xpath("//*[@text='Select ID']/preceding-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
    //  Tier upgrade Back btn
    public WebElement objTierUpgradeBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Tier Upgrade']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    //  Upload ID Photos
    public WebElement objUploadIDPhotos(){
        return driver.findElement(By.xpath("//*[@text='Upload ID Photos']"));
    }
    //  Select ID
    public WebElement objSelectIDField(){
        return driver.findElement(By.xpath("//*[@text='Select ID']/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView"));
    }
    //  Card Number Input Field
    public WebElement objCardInputField(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    }
    //  Scan Front of ID
    public WebElement objScanFrontOfID(){
        return driver.findElement(By.xpath("//*[@text='Scan Front of ID']"));
    }
    //  Scan Front of ID Back Arrow Button
    public WebElement objScanFrontOfIDBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Scan Front of ID']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    //  Scan Back of ID
    public WebElement objScanBackOfID(){
        return driver.findElement(By.xpath("//*[@text='Scan Back of ID']"));
    }
    //  Scan Front of ID Back Arrow Button
    public WebElement objScanBackOfIDBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Scan Back of ID']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup"));
    }
    //  Take a Face Identity Photo
    public WebElement objTakeAFaceIdentityPhoto(){
        return driver.findElement(By.xpath("//*[@text='Take a Face Identity Photo']"));
    }
    //  Phil Health
    public WebElement objPhilHealth(){
        return driver.findElement(By.xpath("//*[@text='PHILHEALTH']"));
    }
    //  Scan Front of ID Info
    public WebElement objScanFrontOfIDInfo(){
        return driver.findElement(By.xpath("(//*[@resource-id='com.mlhuillier.mlwallet:id/texture_view']/parent::android.widget.FrameLayout/following-sibling::android.widget.TextView)[2]"));
    }
    //  Capture Screen
    public WebElement objCaptureScreen(){
        return driver.findElement(By.xpath("(//*[@resource-id='com.mlhuillier.mlwallet:id/texture_view']/parent::android.widget.FrameLayout/following-sibling::android.view.ViewGroup)[1]"));
    }
    //  Capture button
    public WebElement objCaptureButton(){
        return driver.findElement(By.xpath("(//*[@resource-id='com.mlhuillier.mlwallet:id/texture_view']/parent::android.widget.FrameLayout/following-sibling::android.view.ViewGroup)[2]"));
    }
    //  Tier Upgrade Take a Face Identity Photo Info
    public WebElement objTakeAFaceIdentityPhotoInfo(){
        return driver.findElement(By.xpath("//*[@resource-id='com.mlhuillier.mlwallet:id/texture_view']/parent::android.widget.FrameLayout/following-sibling::android.widget.TextView"));
    }
    //  Err message
    public WebElement objSourceOfIncomeFieldMessage(){
        return driver.findElement(By.xpath("//*[@text='Source of Income']/preceding-sibling::android.view.ViewGroup/following-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objCompanyEmployerFieldMessage(){
        return driver.findElement(By.xpath("//*[@text='Company/Employer Name'][1]/parent::android.view.ViewGroup/following-sibling::android.widget.TextView"));
    }
    public WebElement objProductServiceFieldMessage(){
        return driver.findElement(By.xpath("//*[@text='Product/Services Offered']/following-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objWorkAddressFieldMessage(){
        return driver.findElement(By.xpath("//*[@text='Work Address'][1]/parent::android.view.ViewGroup/following-sibling::android.widget.TextView"));
    }
    public WebElement objPositionAtWorkFieldMessage(){
        return driver.findElement(By.xpath("//*[@text='Position at Work']/following-sibling::android.view.ViewGroup/child::android.view.ViewGroup"));
    }
    public WebElement objNatureOfWorkFieldMessage(){
        return driver.findElement(By.xpath("//*[@text='Choose Nature of Work']/ancestor::android.view.ViewGroup[2]/following-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objReceivingPensionFieldMessage(){
        return driver.findElement(By.xpath("//*[@text='Receiving Pension From']/following-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objYearRetiredFieldMessage(){
        return driver.findElement(By.xpath("//*[@text='Year Retired'][1]/parent::android.view.ViewGroup/following-sibling::android.widget.TextView"));
    }
    public WebElement objPositionUponRetirementMessage(){
        return driver.findElement(By.xpath("//*[@text='Position Upon Retirement']/following-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objSchoolFieldMessage(){
        return driver.findElement(By.xpath("//*[@text='School/University']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView"));
    }
    public WebElement objSchoolAddressFieldMessage(){
        return driver.findElement(By.xpath("//*[@text='School Address']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView"));
    }
    public WebElement objRemarksFieldMessage(){
        return driver.findElement(By.xpath("//*[@text='Remarks']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView"));
    }
    public WebElement objGrantFieldMessage(){
        return driver.findElement(By.xpath("//*[@text='Grant/Program Type']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView"));
    }
    public WebElement objOccupationFieldMessage(){
        return driver.findElement(By.xpath("//*[@text='Occupation']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView"));
    }
    public WebElement objSourceOfFundsFieldMessage(){
        return driver.findElement(By.xpath("//*[@text='Source of Funds']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView"));
    }
    // Search Field
    public WebElement objSearchField(){
        return driver.findElement(By.xpath("//*[@class='android.view.ViewGroup']/child::android.widget.EditText"));
    }
    // Pension Fields
    public WebElement objReceivingPensionField(){
        return driver.findElement(By.xpath("//*[@text='Receiving Pension From']/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objYearRetiredField(){
        return driver.findElement(By.xpath("//*[@text='Year Retired'][2]"));
    }
    public WebElement objPositionField(){
        return driver.findElement(By.xpath("//*[@text='Position Upon Retirement']/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView"));
    }
    // Financial Fields
    public WebElement objRemarksField(){
        return driver.findElement(By.xpath("//*[@text='Remarks'][1]/following-sibling::android.widget.EditText"));
    }
    // Student Fields
    public WebElement objUniversityField(){
        return driver.findElement(By.xpath("//*[@text='School/University']/following-sibling::android.widget.EditText"));
    }
    public WebElement objSchoolAddressField(){
        return driver.findElement(By.xpath("//*[@text='School Address']/following-sibling::android.widget.EditText"));
    }
    //
// Govt Fields
    public WebElement objProgramTypeField(){
        return driver.findElement(By.xpath("//*[@text='Grant/Program Type']/following-sibling::android.widget.EditText"));
    }
    // Other Source Income Fields
    public WebElement objOccupationField(){
        return driver.findElement(By.xpath("//*[@text='Occupation']/following-sibling::android.widget.EditText"));
    }
    public WebElement objSourceOfFundsField(){
        return driver.findElement(By.xpath("//*[@text='Source of Funds']/following-sibling::android.widget.EditText"));
    }
    // is required error message locators
    public WebElement getObjIsRequired(String type){
        return driver.findElement(By.xpath("//*[@text='" + type + "']"));
    }
}
