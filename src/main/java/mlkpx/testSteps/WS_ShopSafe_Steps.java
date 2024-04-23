package mlkpx.testSteps;

import org.testng.Assert;
import utilities.ExtentReport.ExtentReporter;

public class WS_ShopSafe_Steps extends Base_Steps{
    public void To_Validate_Shop_Safe_Page_WS_SS_01()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        if(isVisible(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header")){
            isVisible(wsShopSafePageObjects.referenceNoText(),"Reference No. Label");
            isVisible(wsShopSafePageObjects.referenceNoTxtbox(),"Reference No. Textbox Label");
            isVisible(wsShopSafePageObjects.searchBtn(), "Search Button");
            isVisible(wsShopSafePageObjects.scanQRCodeBtn(),"Scan QR Button");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validated Shop Safe Page");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Shop Safe Page");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Valid_Reference_Number_WS_SS_02()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            isVisible(wsShopSafePageObjects.TransactInfoText(),"");
            isVisible(wsShopSafePageObjects.OriginText(),"");
            isVisible(wsShopSafePageObjects.DestinationText(),"");
            isVisible(wsShopSafePageObjects.SellerText(),"");
            isVisible(wsShopSafePageObjects.BuyerText(),"");
            isVisible(wsShopSafePageObjects.ItemDetailsText(),"");
            scrollToElement(wsShopSafePageObjects.PhotosText());
            isVisible(wsShopSafePageObjects.PhotosText(),"");
            scrollToElement(wsShopSafePageObjects.SellerPhotosText());
            isVisible(wsShopSafePageObjects.SellerPhotosText(),"");
            scrollToElement(wsShopSafePageObjects.BuyerPhotosText());
            isVisible(wsShopSafePageObjects.BuyerPhotosText(),"");
            scrollToElement(wsShopSafePageObjects.TransactionDetailsText());
            isVisible(wsShopSafePageObjects.TransactionDetailsText(),"");
            isVisible(wsShopSafePageObjects.BuyerDetailsText(),"");
            isVisible(wsShopSafePageObjects.SellerDetailsText(),"");
            isVisible(wsShopSafePageObjects.AmountInformationText(),"");
            scrollToElement(wsShopSafePageObjects.TotalAmountText());
            isVisible(wsShopSafePageObjects.TotalAmountText(),"");
            scrollToElement(wsShopSafePageObjects.ParcelStatusText());
            isVisible(wsShopSafePageObjects.ParcelStatusText(),"");
            scrollToElement(wsShopSafePageObjects.TrackingNoTextbox());
            isVisible(wsShopSafePageObjects.TrackingNoTextbox(),"");
            scrollToElement(wsShopSafePageObjects.RemarksTxtbox());
            isVisible(wsShopSafePageObjects.RemarksTxtbox(),"");
            scrollToElement(wsShopSafePageObjects.BackBtn());
            isVisible(wsShopSafePageObjects.BackBtn(),"");
            scrollToElement(wsShopSafePageObjects.UpdateStatusBtn());
            isVisible(wsShopSafePageObjects.UpdateStatusBtn(),"");
            scrollToElement(wsShopSafePageObjects.PrintReceiptTxtBtn());
            isVisible(wsShopSafePageObjects.PrintReceiptTxtBtn(),"");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validate Valid Reference Number");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Valid Reference Number");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Transaction_Information_WS_SS_03()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            isVisible(wsShopSafePageObjects.OriginBranchVal(),"");
            isVisible(wsShopSafePageObjects.OperatorOriginVal(),"");
            isVisible(wsShopSafePageObjects.DateTimeOriginVal(),"");
            isVisible(wsShopSafePageObjects.DestinationBranchVal(),"");
            isVisible(wsShopSafePageObjects.OperatorDestinationVal(),"");
            isVisible(wsShopSafePageObjects.DateTimeDestinationVal(),"");
            isVisible(wsShopSafePageObjects.SellerNameVal(),"");
            isVisible(wsShopSafePageObjects.SellerContactNoVal(),"");
            isVisible(wsShopSafePageObjects.BuyerNameVal(),"");
            isVisible(wsShopSafePageObjects.BuyerContactNoVal(),"");
            isVisible(wsShopSafePageObjects.ItemNameVal(),"");
            isVisible(wsShopSafePageObjects.ItemDescriptionVal(),"");
            isVisible(wsShopSafePageObjects.BrandVal(),"");
            isVisible(wsShopSafePageObjects.ModelNoVal(),"");
            isVisible(wsShopSafePageObjects.CategoryVal(),"");
            isVisible(wsShopSafePageObjects.WeightVal(),"");
            isVisible(wsShopSafePageObjects.NoItemsVal(),"");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validate Transaction Information");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Transaction Information");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Transaction_Information_WS_SS_04()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){

            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validate Transaction Information");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Transaction Information");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

}
