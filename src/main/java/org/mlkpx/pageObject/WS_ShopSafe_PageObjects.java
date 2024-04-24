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
    public WebElement referenceNoTxtbox(){return getDriver().findElement(By.xpath("[name=\"referenceNumber\"]"));}
    public WebElement searchBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"Search\"])"));}
    public WebElement scanQRCodeBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"Scan QR Code\"])[1]"));}
    //Negative
    public WebElement errorMessage(){return getDriver().findElement(By.xpath("(//*[text()=\"Reference Number is required.\"])"));}

//----------------ShopSafe Next Page
    public WebElement shopsafeTextNextheader(){return getDriver().findElement(By.xpath("(//*[text()=\"Shop Safe\"])[3]"));}
    public WebElement KPTNReferenceVal(){return getDriver().findElement(By.xpath("//*[@class=\"sc-hCPjZK JWnuU\"]/child::*"));}
    public WebElement TransactInfoText(){return getDriver().findElement(By.xpath("(//*[text()=\"Transaction Information\"])"));}
    //----------------Origin Details
    public WebElement OriginText(){return getDriver().findElement(By.xpath("(//*[text()=\"Origin\"])"));}
    public WebElement OriginBranchVal(){return getDriver().findElement(By.xpath("(//*[@class=\"sc-cVzyXs BZQgh\"])[2]"));}
    public WebElement OperatorOriginVal(){return getDriver().findElement(By.xpath("(//*[@class=\"sc-cVzyXs BZQgh\"])[3]"));}
    public WebElement DateTimeOriginVal(){return getDriver().findElement(By.xpath("(//*[@class=\"sc-cVzyXs BZQgh\"])[4]"));}

    //----------------Destination Details
    public WebElement DestinationText(){return getDriver().findElement(By.xpath("(//*[text()=\"Destination\"])"));}
    public WebElement DestinationBranchVal(){return getDriver().findElement(By.xpath("(//*[@class=\"sc-cVzyXs BZQgh\"])[5]"));}
    public WebElement OperatorDestinationVal(){return getDriver().findElement(By.xpath("(//*[@class=\"sc-cVzyXs BZQgh\"])[6]"));}
    public WebElement DateTimeDestinationVal(){return getDriver().findElement(By.xpath("(//*[@class=\"sc-cVzyXs BZQgh\"])[7]"));}
    //----------------Seller Details
    public WebElement SellerText(){return getDriver().findElement(By.xpath("(//*[text()=\"Seller\"])"));}
    public WebElement SellerNameVal(){return getDriver().findElement(By.xpath("(//*[@class=\"sc-cVzyXs BZQgh\"])[8]"));}
    public WebElement SellerContactNoVal(){return getDriver().findElement(By.xpath("(//*[@class=\"sc-cVzyXs BZQgh\"])[9]"));}
    //----------------Buyer Details
    public WebElement BuyerText(){return getDriver().findElement(By.xpath("(//*[text()=\"Buyer\"])"));}
    public WebElement BuyerNameVal(){return getDriver().findElement(By.xpath("(//*[@class=\"sc-cVzyXs BZQgh\"])[10]"));}
    public WebElement BuyerContactNoVal(){return getDriver().findElement(By.xpath("(//*[@class=\"sc-cVzyXs BZQgh\"])[11]"));}
    //---------------- Items Details
    public WebElement ItemDetailsText(){return getDriver().findElement(By.xpath("(//*[text()=\"Item Details\"])"));}
    public WebElement ItemNameVal(){return getDriver().findElement(By.xpath("(//*[@class=\"sc-cVzyXs BZQgh\"])[12]"));}
    public WebElement ItemDescriptionVal(){return getDriver().findElement(By.xpath("(//*[@class=\"sc-cVzyXs BZQgh\"])[13]"));}
    public WebElement BrandVal(){return getDriver().findElement(By.xpath("(//*[@class=\"sc-cVzyXs BZQgh\"])[14]"));}
    public WebElement ModelNoVal(){return getDriver().findElement(By.xpath("(//*[@class=\"sc-cVzyXs BZQgh\"])[15]"));}
    public WebElement CategoryVal(){return getDriver().findElement(By.xpath("(//*[@class=\"sc-cVzyXs BZQgh\"])[16]"));}
    public WebElement WeightVal(){return getDriver().findElement(By.xpath("(//*[@class=\"sc-cVzyXs BZQgh\"])[17]"));}
    public WebElement NoItemsVal(){return getDriver().findElement(By.xpath("(//*[@class=\"sc-cVzyXs BZQgh\"])[18]"));}
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
    //----------------Parcel Status
    public WebElement ParcelStatusText(){return getDriver().findElement(By.xpath("(//*[text()=\"Parcel Status\"])"));}
    public WebElement StatusText(){return getDriver().findElement(By.xpath("(//*[@name=\"parcelStatus\"])"));}
    public WebElement TrackingNoTextbox(){return getDriver().findElement(By.xpath("(//*[@name=\"trackingNumber\"])"));}
    public WebElement RemarksTxtbox(){return getDriver().findElement(By.xpath("(//*[@name=\"remarks\"])"));}
    public WebElement BackBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"Back\"])"));}
    public WebElement UpdateStatusBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"Update Status\"])"));}
    public WebElement PrintReceiptTxtBtn(){return getDriver().findElement(By.xpath("(//*[text()=\"Please click here to print a receipt.\"])"));}
}
