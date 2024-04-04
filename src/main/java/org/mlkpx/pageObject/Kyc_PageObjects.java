package org.mlkpx.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utilities.Driver.DriverManager.getDriver;

public class Kyc_PageObjects {
    public WebElement kyc_link(){
        return getDriver().findElement(By.cssSelector("[href='/kyc']"));
    }
    public WebElement kycPage_h2(){
        return getDriver().findElement(By.xpath("//h2"));
    }
    public WebElement lastName_field(){
        return getDriver().findElement(By.name("lastName"));
    }
    public WebElement firstName_field(){
        return getDriver().findElement(By.name("firstName"));
    }
    public WebElement middleName_field(){
        return getDriver().findElement(By.name("middleName"));
    }
    public WebElement suffix_field(){
        return getDriver().findElement(By.name("suffix"));
    }
    public WebElement searchBtn(){
        return getDriver().findElement(By.cssSelector("[type='submit']"));
    }

    public List<WebElement> buttonList(){
        return getDriver().findElements(By.cssSelector("[type='button']"));
    }
    public WebElement lastName_required(){return getDriver().findElement(By.xpath("//*[contains(text(), 'Last name is required.')]"));}
    public WebElement firstName_required(){return getDriver().findElement(By.xpath("//*[contains(text(), 'First name is required.')]"));}
    public WebElement birthdate_field(){return getDriver().findElement(By.cssSelector("[placeholder='Birth Date']"));}

    public WebElement searchInOtherSystemButton() {
        return getDriver().findElement(By.cssSelector("[class='btn btn-primary']"));
    }
    public WebElement addKYCText(){return getDriver().findElement(By.xpath("//*[text()=\"Add KYC\"]"));}
    public WebElement loading(){return getDriver().findElement(By.xpath("//div[@class=\"lds-ripple\"]"));}
    public WebElement kycNotFoundText(){return getDriver().findElement(By.cssSelector("[class=\"container alert alert-warning fade show\"]"));}
    public WebElement placeOfBirth(){return getDriver().findElement(By.cssSelector("[name=\"placeOfBirth\"]"));}
    public WebElement nationalityButton(){return getDriver().findElement(By.cssSelector("[name=\"nationality\"]"));}
    public WebElement filipinoNationality(){return getDriver().findElement(By.cssSelector("[value=\"FILIPINO\"]"));}
    public WebElement civilStatus(){return getDriver().findElement(By.cssSelector("[name=\"civilStatus\"]"));}
    public WebElement civilStatusSingle(){return getDriver().findElement(By.cssSelector("[value=\"single\"]"));}
    public WebElement genderButton(){return getDriver().findElement(By.cssSelector("[name=\"gender\"]"));}
    public WebElement genderMale(){return getDriver().findElement(By.cssSelector("[value='male']"));}
    public WebElement countryBirth(){return getDriver().findElement(By.cssSelector("[name=\"countryOfBirth\"]"));}
    public WebElement selectCountryBirth(){return getDriver().findElement(By.cssSelector("[value='PHILIPPINES']"));}
    public WebElement contactInfoText(){return getDriver().findElement(By.xpath("//*[text()='Contact Information']"));}
    public WebElement wholePageClicktoScroll(){return getDriver().findElement(By.cssSelector("[class='themed-container container-fluid']"));}
    public WebElement hasNoMobileNumber(){return getDriver().findElement(By.cssSelector("[name=\"hasNoMobileNumber\"]"));}
    public WebElement inputMobileNumber(){return getDriver().findElement(By.cssSelector("[name=\"cellphoneNumber\"]"));}
    public WebElement inputEmail(){return getDriver().findElement(By.cssSelector("[name=\"email\"]"));}
    public WebElement countryText(){return getDriver().findElement(By.xpath("//*[text()='Country']"));}
    public WebElement currentAddress(){return getDriver().findElement(By.cssSelector("[class='text-muted subheading my-3']"));}
    public WebElement provinceState(){return getDriver().findElement(By.cssSelector("[name=\"currentAddress.addressL1Id\"]"));}
    public WebElement selectProvinceState(){return getDriver().findElement(By.xpath("//*[@value='25' and text()='CEBU']"));}
    public WebElement municipality(){return getDriver().findElement(By.cssSelector("[name=\"currentAddress.addressL2Id\"]"));}
    public WebElement selectMunicipality(){return getDriver().findElement(By.cssSelector("[value='851']"));}
    public WebElement houseNoStreetSitioBarangay(){return getDriver().findElement(By.cssSelector("[name=\"currentAddress.otherAddress\"]"));}
    public WebElement sameWithCurrentAddress(){return getDriver().findElement(By.cssSelector("[name=\"isSameCurrentAddress\"]"));}
    public WebElement permanentHouseNoStreetSitioBrangay(){return getDriver().findElement(By.cssSelector("[name=\"permanentAddress.otherAddress\"]"));}
    public WebElement permanentProvinceState(){return getDriver().findElement(By.cssSelector("[name=\"permanentAddress.addressL1Id\"]"));}
//    public WebElement (){return getDriver().findElement(By.cssSelector("[name=\"currentAddress.addressL1Id\"]"));}

    public WebElement companyName(){return getDriver().findElement(By.cssSelector("[name=\"companyName\"]"));}
    public WebElement productServices(){return getDriver().findElement(By.cssSelector("[name=\"productOffered\"]"));}
    public WebElement selectProductServices(){return getDriver().findElement(By.cssSelector("[value='INFORMATION TECHNOLOGY']"));}
    public WebElement workAddress(){return getDriver().findElement(By.cssSelector("[name=\"workAddress\"]"));}
    public WebElement posistionAtWork(){return getDriver().findElement(By.cssSelector("[name=\"workPosition\"]"));}
    public WebElement selectedPosistionAtWork(){return getDriver().findElement(By.cssSelector("[value='STAFF/CLERK/WORKER (OFFICE)']"));}
    public WebElement natureOfWork(){return getDriver().findElement(By.cssSelector("[name=\"natureOfWork\"]"));}
    public WebElement selectedNatureOfWork(){return getDriver().findElement(By.cssSelector("[value='IT PROFESSIONAL/PROGRAMMER']"));}
    public WebElement idType(){return getDriver().findElement(By.cssSelector("[name=\"id.validIdCardId\"]"));}
    public WebElement idTypeSelected(){return getDriver().findElement(By.xpath("//*[@value=\"3\" and text()=\"DRIVER'S LICENSE\"]"));}
    public WebElement idNumber(){return getDriver().findElement(By.cssSelector("[name=\"id.idNumber\"]"));}
    public WebElement expiryDate(){return getDriver().findElement(By.cssSelector("[name=\"id.expirationDate\"]"));}
//    public WebElement expiryDateSelected(){return getDriver().findElement(By.cssSelector("[max=\"9999-12-30\"]"));}


    public WebElement id1Text(){return getDriver().findElement(By.xpath("//*[text()='ID1']"));}
    public WebElement closeButton(){return getDriver().findElement(By.cssSelector("//button[@class='close']"));}
    public WebElement frontIDCamButton(){return getDriver().findElement(By.cssSelector("[type=\"button\"][name=\"id1File\"]"));}
    public WebElement captureButtonID1(){return getDriver().findElement(By.xpath("//*[text()= \"Capture Photo\"]"));}
    public WebElement setPhotoButton(){return getDriver().findElement(By.cssSelector("[class=\"sc-SrznA cVrTcU btn btn-primary\"]"));}
    public WebElement customersPhoto(){return getDriver().findElement(By.cssSelector("[name=\"customerPhoto\"]"));}
    public WebElement customersPhotoButton(){return getDriver().findElement(By.xpath("//*[@class=\"btn-sm btn btn-secondary\" and text()=\"Capture Photo\"]"));}
    public WebElement setPhotoCustomers(){return getDriver().findElement(By.xpath("//*[@class=\"sc-lnPyaJ gExulw btn btn-primary\"]"));}







}
