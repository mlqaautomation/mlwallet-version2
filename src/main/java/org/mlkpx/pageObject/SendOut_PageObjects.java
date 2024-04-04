package org.mlkpx.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.Driver.DriverManager.getDriver;

public class SendOut_PageObjects {

    public WebElement sendOutLink(){
        return getDriver().findElement(By.xpath("//*[text()='Sendout']"));
    }
    public WebElement sendOutTransaction(){ return getDriver().findElement(By.xpath("//*[@class='dropdown-toggle nav-link' and text()='Sendout Transactions']\n"));}

    public WebElement sendOutDomesticText(){
        return getDriver().findElement(By.cssSelector("[class=\"sc-fThUAz GNSHw text-capitalize\"]"));
    }
    public WebElement domesticSendOut(){ return getDriver().findElement(By.xpath("//*[@class='nav-link' and @href='/sendout/domestic']"));}
    public WebElement yesRadioButton(){ return getDriver().findElement(By.xpath("//*[text()=\"Yes\"]"));}
    public WebElement branchInformationText(){ return getDriver().findElement(By.xpath("//*[text()=\"Branch Information\"]"));}
    public WebElement branchField(){
        return getDriver().findElement(By.cssSelector("[name=\"branchCode\"]"));
    }
    public WebElement branchNotFoundText(){ return getDriver().findElement(By.xpath("//*[text()=\"Branch not found\"]"));}
    public WebElement inputReasonField(){
        return getDriver().findElement(By.cssSelector("[name=\"remoteBranch.remoteReason\"]"));
    }
    public WebElement searchKYC(){
        return getDriver().findElement(By.xpath("//*[text()='Search KYC']"));
    }
    public WebElement lastName(){
        return getDriver().findElement(By.xpath("//*[@name='lastName']"));
    }
    public WebElement firstName(){
        return getDriver().findElement(By.xpath("//*[@name='firstName']\n"));
    }
    public WebElement searchBtn(){
        return getDriver().findElement(By.cssSelector("[type='submit']"));
    }
    public WebElement viewButton(){
        return getDriver().findElement(By.xpath("//*[text()='View']\n"));
    }
    public WebElement birthDate(){
        return getDriver().findElement(By.xpath("//*[@name='birthDate']\n"));
    }
    public WebElement selectKYC(){
        return getDriver().findElement(By.xpath("//*[text()='Select KYC']"));
    }
    public WebElement contactNumber(){
        return getDriver().findElement(By.cssSelector("[name=\"senderOtherInformation.contactNumber\"]"));
    }
    public WebElement searchReceivers(){return getDriver().findElement(By.xpath("//*[text()='Search Receivers']\n"));}
    public WebElement receiversText(){return getDriver().findElement(By.xpath("Receiver Information\n"));}
    public WebElement addNewReceivers(){
        return getDriver().findElement(By.xpath("//*[text()='Add New Receiver']"));
    }

    public WebElement vpoRemarks(){ return getDriver().findElement(By.xpath("//*[text()='VPO Remarks']"));}

    public WebElement r_LastName(){
        return getDriver().findElement(By.cssSelector("[placeholder=\"Last Name\"]"));
    }
    public WebElement r_FirstName(){
        return getDriver().findElement(By.cssSelector("[name=\"beneficiary.firstName\"]"));
    }
    public WebElement r_MiddleName(){
        return getDriver().findElement(By.cssSelector("[name=\"beneficiary.middleName\"]"));
    }
    public WebElement r_CityMunicipality(){
        return getDriver().findElement(By.cssSelector("[name=\"beneficiary.address.addressL2Id\"]"));
    }
    public WebElement r_CityMunicipalitySelected(){
        return getDriver().findElement(By.cssSelector("[value=\"804\"]"));
    }
    public WebElement r_ProvinceState(){

        return getDriver().findElement(By.cssSelector("[name=\"beneficiary.address.addressL1Id\"]"));
    }
    public WebElement r_ProvinceStateSelect(){
        return getDriver().findElement(By.cssSelector("[value=\"4\"]"));
    }
    public WebElement r_HouseNoStreetBarangaySitio(){
        return getDriver().findElement(By.cssSelector("[name=\"beneficiary.address.otherAddress\"]"));
    }

    public WebElement r_birthdate_Field(){
        return getDriver().findElement(By.cssSelector("[placeholder='Birth Date']"));
    }
    public WebElement r_sex_Field(){
        return getDriver().findElement(By.cssSelector("[name=\"beneficiary.gender\"]"));
    }

    public WebElement r_selected_Sex_Field(){
        return getDriver().findElement(By.cssSelector("[value=\"male\"]"));
    }

    public WebElement no_ContactNo(){
        return getDriver().findElement(By.cssSelector("[name=\"beneficiary.hasNoContactNumber\"]"));
    }
    public WebElement r_ProvinceStateText(){ return getDriver().findElement(By.xpath("//label[contains(text(), 'Province/State')]"));}

    public WebElement sourceOfFund(){
        return getDriver().findElement(By.cssSelector("[placeholder=\"Source of Fund\"]"));
    }
    public WebElement purpose(){
        return getDriver().findElement(By.cssSelector("[placeholder=\"Purpose\"]"));
    }
    public WebElement relationToReceiver(){
        return getDriver().findElement(By.cssSelector("[name=\"senderOtherInformation.relationshipWithReceiver\"]"));
    }
    public WebElement messageToReceiver(){
        return getDriver().findElement(By.cssSelector("[name=\"senderOtherInformation.messageToReceiver\"]"));
    }
    public WebElement principalAmount(){
        return getDriver().findElement(By.cssSelector("[id=\"moneyInput\"]"));
    }
    public WebElement submitSendOut(){
        return getDriver().findElement(By.xpath("//*[text()=\"Submit Sendout\"]"));
    }

    public WebElement totalAmount(){ return getDriver().findElement(By.xpath("//*[label=\"Total Amount\"]"));}


}
