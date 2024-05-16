package org.mlkpx.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.Driver.DriverManager.getDriver;

public class WS_ShopSafe_PageObjects {
//------------------ShopSafe Page
    //Positive
    public WebElement walletServicesLink() {return getDriver().findElement(By.xpath("//*[@href=\"/wallet-services/cash-in\"]"));}
    public WebElement shopsafeText(){return getDriver().findElement(By.xpath("(//*[text()=\"Shop Safe\"])[2]"));}
    public WebElement shopsafeTextheader(){return getDriver().findElement(By.xpath("(//*[text()=\"Shop Safe\"])[3]"));}
    public WebElement referenceNoText(){return getDriver().findElement(By.xpath("(//*[text()=\"Reference No.\"])"));}
    public WebElement referenceNoTxtbox(){return getDriver().findElement(By.cssSelector("[name=\"referenceNumber\"]"));}
    public WebElement searchBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"Search\"])"));}
    public WebElement scanQRCodeBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"Scan QR Code\"])[1]"));}

//----------------ShopSafe Next Page
    public WebElement shopsafeTextNextheader(){return getDriver().findElement(By.xpath("(//*[text()=\"Shop Safe\"])[3]"));}
    public WebElement KPTNReferenceVal(){return getDriver().findElement(By.xpath("//*[@class=\"sc-hCPjZK JWnuU\"]/child::*"));}
    public WebElement TransactInfoText(){return getDriver().findElement(By.xpath("(//*[text()=\"Transaction Information\"])"));}
    //----------------Origin Details
    public WebElement OriginText(){return getDriver().findElement(By.xpath("(//*[text()=\"Origin\"])"));}
    public WebElement OriginBranchVal(){return getDriver().findElement(By.xpath("(//*[contains(text(),'Origin Branch')])[1]/parent::div/following-sibling::div/child::p"));}
    public WebElement OperatorOriginVal(){return getDriver().findElement(By.xpath("(//*[contains(text(),'Operator')])[1]/parent::div/following-sibling::div/child::p"));}
    public WebElement DateTimeOriginVal(){return getDriver().findElement(By.xpath("(//*[contains(text(),'Date & Time')])[1]/parent::div/following-sibling::div/child::p"));}

    //----------------Destination Details
    public WebElement DestinationText(){return getDriver().findElement(By.xpath("(//*[text()=\"Destination\"])"));}
    public WebElement DestinationBranchVal(){return getDriver().findElement(By.xpath("(//*[contains(text(),'Destination Branch')])[1]/parent::div/following-sibling::div/child::p"));}
    public WebElement OperatorDestinationVal(){return getDriver().findElement(By.xpath("(//*[contains(text(),'Operator')])[2]/parent::div/following-sibling::div/child::p"));}
    public WebElement DateTimeDestinationVal(){return getDriver().findElement(By.xpath("(//*[contains(text(),'Date & Time')])[2]/parent::div/following-sibling::div/child::p"));}
    //----------------Seller Details
    public WebElement SellerText(){return getDriver().findElement(By.xpath("(//*[text()=\"Seller\"])"));}
    public WebElement SellerNameVal(){return getDriver().findElement(By.xpath("(//*[contains(text(),'Name')])[1]/parent::div/following-sibling::div/child::p"));}
    public WebElement SellerContactNoVal(){return getDriver().findElement(By.xpath("(//*[contains(text(),'Contact No.')])[1]/parent::div/following-sibling::div/child::p"));}
    //----------------Buyer Details
    public WebElement BuyerText(){return getDriver().findElement(By.xpath("(//*[text()=\"Buyer\"])"));}
    public WebElement BuyerNameVal(){return getDriver().findElement(By.xpath("(//*[contains(text(),'Name')])[2]/parent::div/following-sibling::div/child::p"));}
    public WebElement BuyerContactNoVal(){return getDriver().findElement(By.xpath("(//*[contains(text(),'Contact No.')])[2]/parent::div/following-sibling::div/child::p"));}
    //---------------- Items Details
    public WebElement ItemDetailsText(){return getDriver().findElement(By.xpath("(//*[text()=\"Item Details\"])"));}
    public WebElement ItemNameVal(){return getDriver().findElement(By.xpath("(//*[contains(text(),'Item Name')])[1]/parent::div/following-sibling::div/child::p"));}
    public WebElement ItemDescriptionVal(){return getDriver().findElement(By.xpath("(//*[contains(text(),'Item Description')])[1]/parent::div/following-sibling::div/child::p"));}
    public WebElement BrandVal(){return getDriver().findElement(By.xpath("(//*[contains(text(),'Brand')])[1]/parent::div/following-sibling::div/child::p"));}
    public WebElement ModelNoVal(){return getDriver().findElement(By.xpath("(//*[contains(text(),'Model No.')])[1]/parent::div/following-sibling::div/child::p"));}
    public WebElement CategoryVal(){return getDriver().findElement(By.xpath("(//*[contains(text(),'Category')])[1]/parent::div/following-sibling::div/child::p"));}
    public WebElement WeightVal(){return getDriver().findElement(By.xpath("(//*[contains(text(),'Weight')])[1]/parent::div/following-sibling::div/child::p"));}
    public WebElement NoItemsVal(){return getDriver().findElement(By.xpath("(//*[contains(text(),'No. of Items')])[1]/parent::div/following-sibling::div/child::p"));}
    //----------------Item Photos
    public WebElement PhotosText(){return getDriver().findElement(By.xpath("(//*[text()=\"Photos\"])"));}
    public WebElement ItemPhotosVal(){return getDriver().findElement(By.xpath("(//*[@class=\"mt-4 col-md-6\"]/child::*)[2]"));}
    //----------------Seller Photos
    public WebElement SellerPhotosText(){return getDriver().findElement(By.xpath("(//*[text()=\"Seller Photos\"])"));}
    public WebElement CustomerPhotoSellerVal(){return getDriver().findElement(By.xpath("(//*[@class=\"mt-4 col-md-6\"]/child::*)[4]"));}
    public WebElement IdFrontSellerVal(){return getDriver().findElement(By.xpath("(//*[@class=\"mt-4 col-md-6\"]/child::*)[6]"));}
    public WebElement IdBackSellerVal(){return getDriver().findElement(By.xpath("(//*[@class=\"mt-4 col-md-6\"]/child::*)[8]"));}
    //----------------Buyer Photos
    public WebElement BuyerPhotosText(){return getDriver().findElement(By.xpath("(//*[text()=\"Buyer Photos\"])"));}
    public WebElement CustomerPhotoBuyerVal(){return getDriver().findElement(By.xpath("(//*[@class=\"mt-4 col-md-6\"]/child::*)[10]"));}
    public WebElement IdFrontBuyerVal(){return getDriver().findElement(By.xpath("(//*[@class=\"mt-4 col-md-6\"]/child::*)[12]"));}
    public WebElement IdBackBuyerVal(){return getDriver().findElement(By.xpath("(//*[@class=\"mt-4 col-md-6\"]/child::*)[14]"));}
    //----------------Transaction Details
    public WebElement TransactionDetailsText(){return getDriver().findElement(By.xpath("(//*[text()=\"Transaction Details\"])"));}
    //----------------Buyer Details
    public WebElement BuyerDetailsText(){return getDriver().findElement(By.xpath("(//*[text()=\"Buyer Details\"])"));}
    public WebElement IdTypeBuyerVal(){return getDriver().findElement(By.xpath("(//*[@class=\"col-md-6\"])[19]"));}
    public WebElement IdNoBuyerVal(){return getDriver().findElement(By.xpath("(//*[@class=\"col-md-6\"])[20]"));}
    public WebElement ExpiryDateBuyerVal(){return getDriver().findElement(By.xpath("(//*[@class=\"col-md-6\"])[21]"));}
    public WebElement VerficationLevelBuyerVal(){return getDriver().findElement(By.xpath("(//*[@class=\"col-md-6\"])[22]"));}
    //----------------Seller Details
    public WebElement SellerDetailsText(){return getDriver().findElement(By.xpath("(//*[text()=\"Seller Details\"])"));}
    public WebElement IdTypeSellerVal(){return getDriver().findElement(By.xpath("(//*[@class=\"col-md-6\"])[23]"));}
    public WebElement IdNoSellerVal(){return getDriver().findElement(By.xpath("(//*[@class=\"col-md-6\"])[24]"));}
    public WebElement ExpiryDateSellerVal(){return getDriver().findElement(By.xpath("(//*[@class=\"col-md-6\"])[25]"));}
    public WebElement VerficationLevelSellerVal(){return getDriver().findElement(By.xpath("(//*[@class=\"col-md-6\"])[26]"));}
    //----------------Amount Information
    public WebElement AmountInformationText(){return getDriver().findElement(By.xpath("(//*[text()=\"Amount Information\"])"));}
    public WebElement ItemPriceVal(){return getDriver().findElement(By.xpath("(//*[@class=\"text-right text-monospace col-md-6\"])[1]"));}
    public WebElement ShippingFeeVal(){return getDriver().findElement(By.xpath("(//*[@class=\"text-right text-monospace col-md-6\"])[2]"));}
    public WebElement ReturnShippingAndDepositVal(){return getDriver().findElement(By.xpath("(//*[@class=\"text-right text-monospace col-md-6\"])[3]"));}
    public WebElement InsuranceFeeVal(){return getDriver().findElement(By.xpath("(//*[@class=\"text-right text-monospace col-md-6\"])[4]"));}
    public WebElement ServiceFeeVal(){return getDriver().findElement(By.xpath("(//*[@class=\"text-right text-monospace col-md-6\"])[5]"));}
    //----------------Total Amount
    public WebElement TotalAmountText(){return getDriver().findElement(By.xpath("(//*[text()=\"Total Amount\"])"));}
    public WebElement TotalAmountVal(){return getDriver().findElement(By.xpath("(//*[@class=\"text-right text-monospace col-md-6\"])[6]"));}
    //----------------Parcel Status Transit And
    public WebElement ParcelStatusText(){return getDriver().findElement(By.xpath("(//*[text()=\"Parcel Status\"])"));}
    public WebElement StatusText(){return getDriver().findElement(By.xpath("(//*[@name=\"parcelStatus\"])"));}
    public WebElement TrackingNoTextbox(){return getDriver().findElement(By.xpath("(//*[@name=\"trackingNumber\"])"));}
    public WebElement RemarksTxtbox(){return getDriver().findElement(By.xpath("(//*[@name=\"remarks\"])"));}
    public WebElement BackBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"Back\"])"));}
    public WebElement UpdateStatusBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"Update Status\"])"));}
    public WebElement PrintReceiptTxtBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"Please click here to print a receipt.\"])"));}
    //-------------Complete Transaction
    public WebElement CompleteBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"Complete\"])"));}
    public WebElement ReturnParcelBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"Return Parcel\"])"));}
    //-----------Update Status
    public WebElement UpdateStatus(){return getDriver().findElement(By.xpath("(//*[text()=\"Update Status\"])"));}
    public WebElement UpdateInfoText(){return getDriver().findElement(By.xpath("(//*[text()=\"Are you sure you want to update the transaction?\"])"));}
    public WebElement YesBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"Yes\"])"));}
    public WebElement NoBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"No\"])"));}
    public WebElement KPTN(){return getDriver().findElement(By.cssSelector("[data-testid='sendoutKPTN']"));}
    public WebElement UpdateSuccessfulLabel(){return getDriver().findElement(By.xpath("(//*[text()=\"Update Successful\"])"));}

    //-------------Negative Test
    public WebElement CancelShopSafeUpdateText(){return getDriver().findElement(By.xpath("(//*[text()=\"Cancel Shop Safe Update\"])"));}
    public WebElement CancelShopSafeUpdateNoteText(){return getDriver().findElement(By.xpath("(//*[text()=\"Any changes made to this transaction will not be saved.\"])"));}
    public WebElement YesDoNotUpdateBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"Yes, do not update\"])"));}
    public WebElement NoStayOnThisPageBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"No, stay on this page\"])"));}
    public WebElement NotFoundText(){return getDriver().findElement(By.xpath("(//*[text()=\"Not Found\"])"));}
    public WebElement ReferenceNoNotFound(){return getDriver().findElement(By.xpath("(//*[text()=\"Reference Number not found. \"])+-"));}
    public WebElement OkBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"OK\"])"));}
    public WebElement warningText(){return getDriver().findElement(By.xpath("(//*[text()=\"Warning\"])"));}
    public WebElement emptyErrorMessage(){return getDriver().findElement(By.xpath("(//*[text()=\"Reference Number is required.\"])"));}
    public WebElement invaliderrorMessage(){return getDriver().findElement(By.xpath("(//*[text()=\"Transaction reference number not found. (version: 9098428)\"])"));}
}
