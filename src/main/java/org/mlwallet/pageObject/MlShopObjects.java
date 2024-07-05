package org.mlwallet.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver.AppiumDriverManager;

public class MlShopObjects extends AppiumDriverManager {
        public WebElement objShopItemsTab(){
        return driver.findElement(By.xpath("//*[@text='Shop']"));
    }
        public WebElement objMLShopPage(){
        return driver.findElement(By.xpath("//*[@text='ML Shop']"));
    }
        public WebElement objItemMenu(){
        return driver.findElement(By.xpath("//*[@text='Rings']/parent::android.view.View"));
    }
        public WebElement objHighPrice(){
        return driver.findElement(By.xpath("//*[@text='High to Low']"));
    }
        public WebElement objLowPrice(){
        return driver.findElement(By.xpath("//*[@text='Low to High']"));
    }
        public WebElement objCheckBox(){
        return driver.findElement(By.xpath("(//*[@class='android.widget.CheckBox'])[1]"));
    }
        public WebElement objSelectItem (){
        return driver.findElement(By.xpath("(//*[@text='High to Low' or @text='Low to High']/following-sibling::android.view.View[1]/child::android.widget.TextView[1])"));
    }
        public WebElement objAddToCartBtn(){
        return driver.findElement(By.xpath("//*[@text='Add To Cart']"));
    }
        public WebElement objHamburgerMenu(){
        return driver.findElement(By.xpath("//*[@text='Enjoy up to 50% Discount on Selected Items']/following-sibling::android.view.View/child::android.widget.Image"));
    }
        public WebElement objCart(){
        return driver.findElement(By.xpath("//*[@content-desc='Cart']"));
    }
        public WebElement objCartIcon (){
        return driver.findElement(By.xpath("//android.view.View[3]/child::android.view.View/child::android.widget.Image"));
    }
        public WebElement objEditAddress(){
        return driver.findElement(By.xpath("//*[@text='   ']"));
    }
        public WebElement objCheckOutBtn(){
        return driver.findElement(By.xpath("//android.widget.Button[@text='Checkout']"));
    }
        public WebElement objSelectBranchPage(){
        return driver.findElement(By.xpath("//*[@resource-id='exampleModalLabel']"));
    }
        public WebElement objInputFieldOne(){
        return driver.findElement(By.xpath("//*[@resource-id='dropEditProvince']"));
    }
        public WebElement objBranchName(){
        return driver.findElement(By.xpath("//*[@text='Branch Name *']/following-sibling::android.view.View"));
    }
        // //*[@text='ML NRA']
        public WebElement objInputFieldTwo(){
        return driver.findElement(By.xpath("//*[@resource-id='btnChangeAddress']"));
    }
        public WebElement objSubBranchName(){
        return driver.findElement(By.xpath("//*[@text='BALER']"));
    }
        public WebElement objInputFieldThree(){
        return driver.findElement(By.xpath("//*[@resource-id='dropEditBranchname']"));
    }
        public WebElement objSubBranchNameTwo(){
        return driver.findElement(By.xpath("//*[@text='ML BALER 2, AURORA']"));
    }
        public WebElement objSaveBtn(){
        return driver.findElement(By.xpath("//*[@resource-id='submitEditDeliveryAddresButton']"));
    }
        public WebElement objAddressSuccessfulMsg(){
        return driver.findElement(By.xpath("//*[@text='Successfully Update Delivery Address.']"));
    }
        public WebElement objOkBtn(){
        return driver.findElement(By.xpath("//*[@text='Ok' or @text='OK']"));
    }
        public WebElement objYesBtn(){
        return driver.findElement(By.xpath("//*[@text='Yes']"));
    }
        public WebElement objPlaceOrderBtn(){
        return driver.findElement(By.xpath("//*[@text='Place Order']"));
    }
        public WebElement objOtpPage(){
        return driver.findElement(By.xpath("//*[@text='One Time Pin']"));
    }
        public WebElement objCheckOutConfirmationMsg (){
        return driver.findElement(By.xpath("//*[@resource-id='mainCheckout']"));
    }
        public WebElement objOtpTextField(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    }
        public WebElement objValidateBtn(){
        return driver.findElement(By.xpath("//*[@text='Validate']"));
    }

        public WebElement objInvalidOtpPopUp(){
        return driver.findElement(By.xpath("//*[@resource-id='swal2-title']"));
    }
        public WebElement objInvalidOtpPopUpMsg(){
        return driver.findElement(By.xpath("//*[@resource-id='swal2-html-container']"));
    }

        public WebElement objCanceBtn(){
        return driver.findElement(By.xpath("//*[@resource-id='btnConfirmCancelCheckout']"));
    }
        public WebElement objBackArrowBtn(){
        return driver.findElement(By.xpath("//*[@text='']"));
    }
        public WebElement objAvailableBalance(){
        return driver.findElement(By.xpath("//*[@text='Available Balance']"));
    }
        public WebElement objSelectPaymentMethod (){
        return driver.findElement(By.xpath("//*[@text='Select Payment Method']"));
    }
        public WebElement objMLWallet (){
        return driver.findElement(By.xpath("//android.widget.Button[@text='ML WALLET']"));
    }
        public WebElement objPayUsingMlWallet (){
        return driver.findElement(By.xpath("((//*[@class='android.webkit.WebView'])[2]/child::android.view.View/child::android.view.View)[2]"));
    }
        //*[@text='ML Wallet']/parent::android.view.View/parent::android.view.View
        public WebElement objPayUsingOnlineBanking (){
        return driver.findElement(By.xpath("//*[@text='Online Banking']/parent::android.view.View/parent::android.view.View"));
    }


        public WebElement objSearch(){
        return driver.findElement(By.xpath("//*[@text=' Search']"));
    }
        public WebElement objProfile(){
        return driver.findElement(By.xpath("//*[@content-desc='Profile']"));
    }
        public WebElement objShop (){
        return driver.findElement(By.xpath("//*[@content-desc='Shop']"));
    }
        public WebElement objAbout (){
        return driver.findElement(By.xpath("//*[@content-desc='About']"));
    }
        public WebElement objContact (){
        return driver.findElement(By.xpath("//*[@content-desc='Contact']"));
    }
        public WebElement objItems (){
        return driver.findElement(By.xpath("//*[@id='imahehome']/child::android.view.View/child::android.view.View/child::android.view.View/following-sibling::android.view.View"));
    }
        public WebElement objGenderDropdown (){
        return driver.findElement(By.xpath("//*[@resource-id='drpGender']"));
    }
        public WebElement objColorDropdown (){
        return driver.findElement(By.xpath("//*[@resource-id='drpColor']"));
    }
        public WebElement objKaratDropdown (){
        return driver.findElement(By.xpath("//*[@resource-id='drpKarat']"));
    }
        public WebElement objPriceDropdown (){
        return driver.findElement(By.xpath("//*[@resource-id='drpKarat']"));
    }

        public WebElement objProductImage (){
        return driver.findElement(By.xpath("//*[@resource-id='crewimage']"));
    }
        public WebElement objShippingTo (){
        return driver.findElement(By.xpath("//*[@resource-id='ship']"));
    }
        public WebElement objShippingFee (){
        return driver.findElement(By.xpath("//*[@resource-id='shippingfee']"));
    }
        public WebElement objViewShop (){
        return driver.findElement(By.xpath("//*[contains(@text,'View Shop')]"));
    }

        public WebElement objCartPageHeader (){
        return driver.findElement(By.xpath("(//*[@class='android.widget.Image'])[1]/following-sibling::android.view.View"));
    }
        public WebElement objDeleteIcon (){
        return driver.findElement(By.xpath("//*[@class='android.widget.CheckBox'][1]/parent::android.view.View/following-sibling::android.widget.Button"));
    }
        public WebElement objProductNameInCartPage (){
        return driver.findElement(By.xpath("//*[@class='android.widget.CheckBox'][1]/parent::android.view.View/parent::android.view.View[1]"));
    }
        public WebElement objPriceInCartPage (){
        return driver.findElement(By.xpath("(//*[@class='android.widget.CheckBox']/following-sibling::android.widget.TextView)[2]"));
    }

        public WebElement objShippingDetails (){
        return driver.findElement(By.xpath("//*[@resource-id='font-sd']"));
    }
        public WebElement objAddAddress (){
        return driver.findElement(By.xpath("//*[@resource-id='btnChangeAddress']"));
    }
        public WebElement objProductNameInShippingDetails (){
        return driver.findElement(By.xpath("((//*/*[@class='android.view.View'])[21]/*[@text and @class='android.view.View'])[1]"));
    }
        public WebElement objProductQuantity (){
        return driver.findElement(By.xpath("((//*/*[@class='android.view.View'])[21]/*[@text and @class='android.view.View'])[2]"));
    }
        public WebElement objItemSubTotal (){
        return driver.findElement(By.xpath("((//*/*[@class='android.view.View'])[21]/*[@text and @class='android.view.View'])[3]"));
    }
        public WebElement objHeader (){
        return driver.findElement(By.xpath("//*[@resource-id='captionproductorder']"));
    }
        public WebElement objTotalOrder (){
        return driver.findElement(By.xpath("//*[@resource-id='product-totalorder2_0']"));
    }
        public WebElement objServiceFee (){
        return driver.findElement(By.xpath("//*[@resource-id='product-servicefee2_0']"));
    }
        public WebElement objShippingFeeInShippingDetails (){
        return driver.findElement(By.xpath("//*[@resource-id='product-shippingfee2_0']"));
    }

        public WebElement objOnlineBanking (){
        return driver.findElement(By.xpath("//*[@text='Online Banking']"));
    }
        public WebElement objMerchandiseSubTotal (){
        return driver.findElement(By.xpath("//*[@text='Merchandise Subtotal :']/following-sibling::android.view.View"));
    }
        public WebElement objServiceTotal (){
        return driver.findElement(By.xpath("//*[@text='Service Total :']/following-sibling::android.view.View"));
    }
        public WebElement objShippingTotal (){
        return driver.findElement(By.xpath("//*[@text='Shipping Total :']/following-sibling::android.view.View"));
    }
        public WebElement objPaymentTotal (){
        return driver.findElement(By.xpath("//*[@resource-id='product-final-total']"));
    }
        public WebElement objCancel (){
        return driver.findElement(By.xpath("//*[@text='Cancel']"));
    }
        public WebElement objAddressUpdateMsg (){
        return driver.findElement(By.xpath("//*[@resource-id='swal2-html-container']"));
    }

        public WebElement objOTPMsg (){
        return driver.findElement(By.xpath("//*[@text='Enter the 6-digit OTP sent to your mobile number']"));
    }
        public WebElement objErrorPopup (){
        return driver.findElement(By.xpath("//*[@resource-id='swal2-html-container']"));
    }
        public WebElement objMyAccount (){
        return driver.findElement(By.xpath("//*[@text='MY ACCOUNT']"));
    }
        public WebElement objMyAccountDropdown (){
        return driver.findElement(By.xpath("//*[@text='My Account']"));
    }
        public WebElement objMyAccountPageCrossBtn (){
        return driver.findElement(By.xpath("//*[@resource-id='close-sidebar']/child::android.widget.TextView"));
    }
        public WebElement objMyProfileHeader (){
        return driver.findElement(By.xpath("(//*[@text='My Profile'])[2]"));
    }
        public WebElement objMyPurchase (){
        return driver.findElement(By.xpath("//*[@text='Purchase History']"));
    }
        public WebElement objOrderDetails (){
        return driver.findElement(By.xpath("//*[@resource-id='orderDetails']"));
    }
        public WebElement objSubtotalAmount (){
        return driver.findElement(By.xpath("//*[@resource-id='cart-subtotal']"));
    }
        public WebElement objSelectedItemPrice (){
        return driver.findElement(By.xpath("((//*[@class='android.widget.CheckBox'])[1]/following-sibling::android.widget.TextView)[2]"));
    }
        public WebElement objJewelry (){
        return driver.findElement(By.xpath("//*[@text='Jewelry']"));
    }
        public WebElement objContactUs (){
        return driver.findElement(By.xpath("//*[@text='Contact Us']"));
    }
        public WebElement objGreatDealsForFineWatches (){
        return driver.findElement(By.xpath("//*[@text='Great Deals for Fine Watches']"));
    }
        public WebElement objRolex (){
        return driver.findElement(By.xpath("//*[@text='Rolex']"));
    }
        public WebElement objHamilton (){
        return driver.findElement(By.xpath("//*[@text='Hamilton']"));
    }
        public WebElement objOmega (){
        return driver.findElement(By.xpath("//*[@text='Omega']"));
    }
        public WebElement objTagHeuer (){
        return driver.findElement(By.xpath("//*[@text='Tag Heuer']"));
    }
        public WebElement objDiscountPercentage (){
        return driver.findElement(By.xpath("(//*[@text='product image'])[1]/parent::android.view.View/parent::android.view.View/parent::android.view.View/child::android.widget.TextView"));
    }

        public WebElement objOriginalPrice (){
        return driver.findElement(By.xpath("((//*[@text='product image'])[1]/parent::android.view.View/following-sibling::android.view.View)[2]/child::android.view.View"));
    }
        public WebElement objDiscountPrice (){
        return driver.findElement(By.xpath("(//*[@text='product image'])[1]/parent::android.view.View/following-sibling::android.widget.TextView"));
    }

        public WebElement objCategoriesHamburgerMenu (){
        return driver.findElement(By.xpath("//*[contains(@text,'C A T E G O R Y')]"));
    }
        public WebElement objAmparitoCollections (){
        return driver.findElement(By.xpath("//*[@text='Amparito Collections']"));
    }
        public WebElement objFineJewelry (){
        return driver.findElement(By.xpath("//*[@text='Fine Jewelry']"));
    }
        public WebElement objAmparitoCollectionsProductTypes(int i) {
            return driver.findElement(By.xpath("(//*[@text='Amparito Collections']/parent::android.view.View/following-sibling::android.view.View/child::android.widget.TextView)["+i+"]"));
    }
        public WebElement objRings (){
        return driver.findElement(By.xpath("//*[@text='Rings']"));
    }

        public WebElement objNecklacePendants(){
        return driver.findElement(By.xpath("//*[@text='Necklaces & Pendants']"));
    }

        public WebElement objBraceletAndBangle (){
        return driver.findElement(By.xpath("//*[@text='Bracelets & Bangles']"));
    }
        public WebElement objRing (){
        return driver.findElement(By.xpath("//*[contains(@text,'Ring')]"));
    }
        public WebElement objRingsSubTypes(int i){
            return driver.findElement(By.xpath("(//*[@resource-id='amparitoCollRing1']/child::android.widget.Button)["+i+"]"));
    }

        public WebElement objNecklace (){
        return driver.findElement(By.xpath("//*[contains(@text,'Necklace')]"));
    }
        public WebElement objNecklaceSubTypes(int i){
            return driver.findElement(By.xpath("(//*[@text='Necklace']/following-sibling::android.view.View/child::android.widget.Button)["+i+"]"));
    }


        public WebElement objBraceletAndBangleSubTypes(int i){
            return driver.findElement(By.xpath("(//*[@text='Bracelet & Bangle']/following-sibling::android.view.View/child::android.widget.Button)["+i+"]"));
    }
        public WebElement objEarrings (){
        return driver.findElement(By.xpath("//*[contains(@text,'Earrings')]"));
    }
        public WebElement objEarringsSubTypes(int i){
            return driver.findElement(By.xpath("(//*[contains(@text,'Earrings')]/following-sibling::android.view.View/child::android.widget.Button)["+i+"]"));
    }

        public WebElement objPendant (){
        return driver.findElement(By.xpath("//*[contains(@text,'Pendant')]"));
    }
        public WebElement objPendantSubTypes(int i){
            return driver.findElement(By.xpath("(//*[@text='Pendant']/following-sibling::android.view.View/child::android.widget.Button)["+i+"]"));
    }

        public WebElement objTernoAndSet (){
        return driver.findElement(By.xpath("//*[contains(@text,'Terno & Set')]"));
    }
        public WebElement objTernoAndSetSubTypes (){
        return driver.findElement(By.xpath("//*[@text='Terno & Set']/following-sibling::android.view.View/child::android.widget.Button"));
    }
        public WebElement objWeddingRing (){
        return driver.findElement(By.xpath("//*[@text='Wedding Ring']"));
    }
        public WebElement objWeddingRingSubTypes (){
        return driver.findElement(By.xpath("//*[@text='Wedding Ring']/following-sibling::android.view.View/child::android.widget.Button"));
    }

        public WebElement objPinBrouchAndScalpings (){
        return driver.findElement(By.xpath("//*[contains(@text,'Brooch')]"));
    }
        public WebElement objPinBrouchAndScalpingsSubTypes (){
        return driver.findElement(By.xpath("//*[@text='Pin, Brouch & Scaplings']/following-sibling::android.view.View/child::android.widget.Button"));
    }

        public WebElement objWatches (){
        return driver.findElement(By.xpath("//*[@text='Watches']"));
    }
        public WebElement objWatchesSubTypes(int i){
            return driver.findElement(By.xpath("(//*[@text='Watches']/following-sibling::android.view.View/child::android.widget.Button)["+i+"]"));
    }


        public WebElement objGender (){
        return driver.findElement(By.xpath("//*[@resource-id='drpGender']"));
    }
        public WebElement objFilterCheckBox(int i) {
            return driver.findElement(By.xpath("(//*[@resource-id='android:id/text1'])["+i+"]"));
    }

        public WebElement objColor (){
        return driver.findElement(By.xpath("//*[@resource-id='drpColor']"));
    }
        public WebElement objKarat (){
        return driver.findElement(By.xpath("//*[@resource-id='drpKarat']"));
    }
        public WebElement objPrice (){
        return driver.findElement(By.xpath("//*[@resource-id='drpPrice']"));
    }
        public WebElement objMainProductImage (){
        return driver.findElement(By.xpath("//*[@resource-id='crewimage']"));
    }
        public WebElement objOptionalProductImage (){
        return driver.findElement(By.xpath("//*[@text='Card image cap']"));
    }
        public WebElement objProductNameInProductDetails (){
        return driver.findElement(By.xpath("//*[@resource-id='mlproduct-description']"));
    }
        public WebElement objColorInProductDetails (){
        return driver.findElement(By.xpath("//*[@resource-id='mlproduct-color']"));
    }
        public WebElement objKaratInProductDetails (){
        return driver.findElement(By.xpath("//*[@resource-id='mlproduct-karat']"));
    }
        public WebElement objGenderInProductDetails (){
        return driver.findElement(By.xpath("//*[@resource-id='mlproduct-gender']"));
    }
        public WebElement objPriceInProductDetails (){
        return driver.findElement(By.xpath("//*[@text='Price']"));
    }
        public WebElement objActualPriceInProductDetails (){
        return driver.findElement(By.xpath("//*[@resource-id='compareAtPriceDisplay']/child::android.view.View"));
    }
        public WebElement objDiscountPriceInProductDetails (){
        return driver.findElement(By.xpath("//*[@resource-id='productPriceDisplay']"));
    }
        public WebElement objShopName (){
        return driver.findElement(By.xpath("//*[@resource-id='ml-shopname']"));
    }
        public WebElement objShopMobileNumber (){
        return driver.findElement(By.xpath("(//*[@resource-id='ml-shopname']/following-sibling::android.view.View)[1]"));
    }
        public WebElement objShopEmailID (){
        return driver.findElement(By.xpath("(//*[@resource-id='ml-shopname']/following-sibling::android.view.View)[2]"));
    }
        public WebElement objShopAddress1 (){
        return driver.findElement(By.xpath("(//*[@resource-id='ml-shopname']/following-sibling::android.view.View)[3]"));
    }
        public WebElement objShopAddress2 (){
        return driver.findElement(By.xpath("(//*[@resource-id='ml-shopname']/following-sibling::android.view.View)[4]"));
    }
        public WebElement objTotalProducts (){
        return driver.findElement(By.xpath("(//*[contains(@text,'Products')])[1]"));
    }
        public WebElement objSoldProducts (){
        return driver.findElement(By.xpath("(//*[contains(@text,'Products')])[2]"));
    }

        public WebElement objProductImageInInterestedIn (){
            return driver.findElement(By.xpath("(//*[@text='product image'])[1]"));
    }
        public WebElement objProductNameInInterestedIn (){
        return driver.findElement(By.xpath("((//*[@text='product image'])[1]/following-sibling::android.view.View)[1]"));
    }
        public WebElement objActualPriceInInterestedIn (){
        return driver.findElement(By.xpath("((//*[@text='product image'])[1]/following-sibling::android.view.View)[2]/child::android.view.View"));
    }
        public WebElement objDiscountPriceInInterestedIn (){
        return driver.findElement(By.xpath("(//*[@text='product image'])[1]/following-sibling::android.widget.TextView"));
    }
        public WebElement objDiscountPercentageInInterestedIn (){
        return driver.findElement(By.xpath("(//*[@text='product image'])[1]/preceding-sibling::android.widget.TextView"));
    }

        public WebElement objMLShopLOgo (){
        return driver.findElement(By.xpath("//*[@resource-id='nav-logo']"));
    }
        public WebElement objProductImageInMLShopPage (){
        return driver.findElement(By.xpath("//*[@text='Product image']"));
    }
        public WebElement objMLShopProductsHeader (){
        return driver.findElement(By.xpath("//*[@resource-id='best-sellers-section-main-label']"));
    }
        public WebElement objMLShopPageBanner (){
        return driver.findElement(By.xpath("//*[@resource-id='banner-text']"));
    }

        public WebElement objSuccessfulLoginTxt (){
        return driver.findElement(By.xpath("//*[@text='Successfully Login']"));
    }
        public WebElement objloginOkayButton (){
        return driver.findElement(By.xpath("//*[@text='Okay']"));
    }
        public WebElement objDeleteYesButton (){
        return driver.findElement(By.xpath("//*[@text='Yes']"));
    }
        public WebElement objDeleteCancelButton (){
        return driver.findElement(By.xpath("//*[@text='Cancel']"));
    }
        public WebElement objDeleteConfirmation (){
        return driver.findElement(By.xpath("//*[@text='Are you sure to remove this item?']"));
    }
        public WebElement objDeleteExitButton (){
        return driver.findElement(By.xpath("//*[@text='Are you sure to remove this item?']/parent::android.view.View/preceding-sibling::android.view.View/child::android.widget.Button"));
    }
        public WebElement objConfirmAddCarButton (){
        return driver.findElement(By.xpath("//*[@text='Confirm']"));
    }
        public WebElement objSuccessAddtoCartMsg (){
        return driver.findElement(By.xpath("//*[@resource-id='swal2-html-container']"));
    }
        public WebElement objExitHamburgerMenu (){
        return driver.findElement(By.xpath("//*[@content-desc='Profile']/parent::android.view.View/preceding-sibling::android.view.View"));
    }

        public WebElement objShoppingCartIcon(){
        return driver.findElement(By.xpath("//android.view.View/child::android.view.View"));
    }


        //--- Product Details---
        public WebElement objProductName (){
        return driver.findElement(By.xpath("//*[@class='android.view.View'][1]/child::android.widget.TextView[1]"));
    }
        public WebElement objProductPrice (){
        return driver.findElement(By.xpath("//*[@class='android.view.View'][1]/child::android.widget.TextView[29]"));
    }
        public WebElement objProductMaterial (){
        return driver.findElement(By.xpath("//*[@class='android.view.View'][1]/child::android.widget.TextView[4]"));
    }
        public WebElement objProductMaterialColor (){
        return driver.findElement(By.xpath("//*[@class='android.view.View'][1]/child::android.widget.TextView[7]"));
    }
        public WebElement objProductSize (){
        return driver.findElement(By.xpath("//*[@class='android.view.View'][1]/child::android.widget.TextView[10]"));
    }
        public WebElement objProductStone (){
        return driver.findElement(By.xpath("//*[@class='android.view.View'][1]/child::android.widget.TextView[13]"));
    }
        public WebElement objProductItemWeight (){
        return driver.findElement(By.xpath("//*[@class='android.view.View'][1]/child::android.widget.TextView[16]"));
    }
        public WebElement objProductStoneColor (){
        return driver.findElement(By.xpath("//*[@class='android.view.View'][1]/child::android.widget.TextView[19]"));
    }
        public WebElement objProductGender (){
        return driver.findElement(By.xpath("//*[@class='android.view.View'][1]/child::android.widget.TextView[22]"));
    }
        public WebElement objProductStockNo (){
        return driver.findElement(By.xpath("//*[@class='android.view.View'][1]/child::android.widget.TextView[25]"));
    }

        // --- SELECT PICK UP BRANCH SECTION ---
        public WebElement objSelectBranchLabel(){
        return driver.findElement(By.xpath("//*[@text='Select Pick Up Branch']"));
    }
        public WebElement objProvinceStateDropDown(){
        return driver.findElement(By.xpath("//*[@text='Select Pick Up Branch']/following-sibling::android.widget.TextView[1]/following-sibling::android.view.View[1]"));
    }
        public WebElement objCityTownDropDown(){
        return driver.findElement(By.xpath("//*[@text='Select Pick Up Branch']/following-sibling::android.widget.TextView[2]/following-sibling::android.view.View[1]"));
    }
        public WebElement objBranchNameDropDown(){
        return driver.findElement(By.xpath("//*[@text='Select Pick Up Branch']/following-sibling::android.widget.TextView[3]/following-sibling::android.view.View[1]"));
    }
        public WebElement objSelectedBranchName(){
        return driver.findElement(By.xpath("//*[@class='android.widget.ListView']/child::android.widget.CheckedTextView[2]"));
    }
        public WebElement objBranchAddress(){
        return driver.findElement(By.xpath("//*[@text='Select Pick Up Branch']/following-sibling::android.widget.TextView[3]/following-sibling::android.view.View[1]/following-sibling::android.widget.TextView"));
    }
        // --- SELECT PICK UP BRANCH SECTION ---


        // --- SELECT PAYMENT METHOD SECTION ---
        public WebElement objPaymentMLWallet(){
        return driver.findElement(By.xpath("//*[@text='ML WALLET']"));
    }
        public WebElement objPaymentEWallet(){
        return driver.findElement(By.xpath("//*[@text='E-WALLET']"));
    }
        public WebElement objPaymentVisa(){
        return driver.findElement(By.xpath("//*[@text='VISA/MASTERCARD']"));
    }
        public WebElement objDirectOnlineBank(){
        return driver.findElement(By.xpath("//*[@text='DIRECT ONLINE BANKING']"));
    }
        // --- SELECT PAYMENT METHOD SECTION ---
        public WebElement objProceedBtn(){
        return driver.findElement(By.xpath("//*[@text='Proceed']"));
    }
        public WebElement objCloseBtn(){
        return driver.findElement(By.xpath("//*[@text='Close']"));
    }
        public WebElement objPLaceOrderConfirmationMsg(){
        return driver.findElement(By.xpath("//*[contains(@text,'You are about')]"));
    }
        public WebElement objSuccesFullyCheckOutMsg(){
        return driver.findElement(By.xpath("//*[@text='Successfully checkout items. Thank you!']"));
    }
        public WebElement objSuccessFullyCheckOutOkayBtn(){
        return driver.findElement(By.xpath("//*[@text='Okay']"));
    }
        public WebElement objEWalletOptions(String option){
            return driver.findElement(By.xpath("//*[@text='"+option+"']"));
    }

        public WebElement objPaymongoPortalPage(){
        return driver.findElement(By.xpath("//*[@text='PayMongo Logo']"));
    }
        public WebElement objPaymongoPaymentAmount(){
        return driver.findElement(By.xpath("//*[@text='Payment amount']/following-sibling::android.widget.TextView"));
    }
        public WebElement objFilter (){
        return driver.findElement(By.xpath("//*[@text='Filter']"));
    }
        public WebElement objExitFilterIcon (){
        return driver.findElement(By.xpath("//*[@text='C A T E G O R Y']/preceding-sibling::android.view.View"));
    }
        public WebElement objAllCheckBox (){
        return driver.findElement(By.xpath("//android.widget.CheckBox"));
    }
        public WebElement objSelectMaterialOptions(String option){
            return driver.findElement(By.xpath("//*[@text='"+option+"']"));
    }

        public WebElement objItemDescription (){
        return driver.findElement(By.xpath("//*[@text='Sort by: Price']/following-sibling::android.widget.Spinner/following-sibling::android.view.View/child::android.view.View[2]"));
    }
        public WebElement objNoProductFound(){
        return driver.findElement(By.xpath("//*[@text='No Products Found!']"));
    }
        public WebElement objItemName (){
        return driver.findElement(By.xpath("//*[@text='Sort by: Price']/following-sibling::android.widget.Spinner/following-sibling::android.view.View/child::android.view.View[1]"));
    }
        public WebElement objMin(){
        return driver.findElement(By.xpath("//*[@text='Min']/following-sibling::android.widget.EditText[1]"));
    }
        public WebElement objMax(){
        return driver.findElement(By.xpath("//*[@text='Max']/following-sibling::android.widget.EditText[1]"));
    }
        public WebElement objsortByPrice(){
        return driver.findElement(By.xpath("//*[@text='High to Low' or @text='Low to High']"));
    }
        public WebElement objGreatSalesText(){
        return driver.findElement(By.xpath("//android.widget.TextView[@text='HALLOWEEN SALE']"));
    }
        public WebElement objJewelryText(){
        return driver.findElement(By.xpath("//android.widget.TextView[@text='Jewelry']"));
    }
        public WebElement objContactUsText(){
        return driver.findElement(By.xpath("//android.widget.TextView[@text='Contact Us']"));
    }
        public WebElement objShopCartText(){
        return driver.findElement(By.xpath("//android.widget.TextView[@text='Shopping Cart']"));
    }
        public WebElement objProfileText(){
        return driver.findElement(By.xpath("//android.widget.TextView[@text='Full Name']"));
    }
        public WebElement objPurchaseText(){
        return driver.findElement(By.xpath("//android.widget.TextView[@text='ML Shop Jewelry Store']"));
    }
        public WebElement objLogout (){
        return driver.findElement(By.xpath("//android.widget.TextView[@text='Logout']"));
    }
        public WebElement objLogoutText(){
        return driver.findElement(By.xpath("//android.widget.TextView[@text='GREAT SUMMER SALE']"));
    }
        public WebElement objSuccessfullyAddedToCart (){
        return driver.findElement(By.xpath("//*[@text= 'Item has been successfully added to your cart.']"));
    }
        public WebElement objItemAlreadyAddedInCart (){
        return driver.findElement(By.xpath("//*[@text= 'This item is already in your cart.']"));
    }
        public WebElement objCartItemCount (){
        return driver.findElement(By.xpath("//android.widget.Image/following-sibling::android.widget.TextView']"));
    }
        public WebElement objWatchProducts (){
        return driver.findElement(By.xpath("(//android.view.View[@content-desc='watchproducts'])[1]"));
    }
        public WebElement objProductDetailsModelName (){
        return driver.findElement(By.xpath("//*[@text='Model Name']/following-sibling::android.widget.TextView[2]"));
    }
        public WebElement objProductDetailsMaterial (){
        return driver.findElement(By.xpath("//*[@text='Material']/following-sibling::android.widget.TextView[2]"));
    }
        public WebElement objProductDetailsColor (){
        return driver.findElement(By.xpath("//*[@text='Color']/following-sibling::android.widget.TextView[2]"));
    }
        public WebElement objProductDetailsSize (){
        return driver.findElement(By.xpath("//*[@text='Size']/following-sibling::android.widget.TextView[2]"));
    }
        public WebElement objProductDetailsBrand (){
        return driver.findElement(By.xpath("//*[@text='Brand']/following-sibling::android.widget.TextView[2]"));
    }
        public WebElement objProductDetailsMovement (){
        return driver.findElement(By.xpath("//*[@text='Movement']/following-sibling::android.widget.TextView[2]"));
    }
        public WebElement objProductDetailsGender (){
        return driver.findElement(By.xpath("//*[@text='Gender']/following-sibling::android.widget.TextView[2]"));
    }
        public WebElement objProductDetailsStockNumber (){
        return driver.findElement(By.xpath("//*[@text='Stock no.']/following-sibling::android.widget.TextView[2]"));
    }
        public WebElement objProductDetailsNote (){
        return driver.findElement(By.xpath("//*[@text='Notes']/following-sibling::android.widget.TextView[2]"));
    }
        public WebElement objItemInTheCartName (){
        return driver.findElement(By.xpath("//android.widget.ListView//android.widget.TextView[1]"));
    }
        public WebElement objShoppngCartCheckBox (){
        return driver.findElement(By.xpath("//android.widget.CheckBox"));
    }
        public WebElement objHightoLow(){
        return driver.findElement(By.xpath("//android.widget.CheckedTextView[1]"));
    }
        public WebElement objLowtoHigh(){
        return driver.findElement(By.xpath("//android.widget.CheckedTextView[2]"));
    }
        public WebElement objContinuePaymongo(){
        return driver.findElement(By.xpath("//*[@text='Continue']"));
    }
        public WebElement objAgreePolicyPaymongo(){
        return driver.findElement(By.xpath("//*[@resource-id='privacy-policy']"));
    }
        public WebElement objCompletePaymentPaymongo(){
        return driver.findElement(By.xpath("//*[@text='Complete payment']"));
    }
        public WebElement objAuthorizeTestPaymentPaymongo(){
        return driver.findElement(By.xpath("//*[@text='Authorize Test Payment']"));
    }
        public WebElement objSuccessfulGrabPayPayment(){
        return driver.findElement(By.xpath("//*[@text='GrabPay payment received!']"));
    }
        public WebElement objSuccessfulGcashPayment(){
        return driver.findElement(By.xpath("//*[@text='GCash payment received!']"));
    }
        public WebElement objSuccessfulMayaPayment(){
        return driver.findElement(By.xpath("//*[@text='Maya payment received!']"));
    }
        public WebElement objSuccessfulCreditPayment(){
        return driver.findElement(By.xpath("//*[@text='Credit or debit card payment received!']"));
    }
        public WebElement objcardnumberCreditPayment(){
        return driver.findElement(By.xpath("//*[@resource-id='cardNumber']"));
    }
        public WebElement objExpMonthCreditPayment(){
        return driver.findElement(By.xpath("//*[@resource-id='expMonth']"));
    }
        public WebElement objExpYearCreditPayment(){
        return driver.findElement(By.xpath("//*[@resource-id='expYear']"));
    }
        public WebElement
                objCvcCreditPayment(){
        return driver.findElement(By.xpath("//*[@resource-id='cvc']"));
    }
        public WebElement
                objPaymentGrabPay(){
        return driver.findElement(By.xpath("//*[@text='GRAB PAY']"));
    }
        public WebElement
                objPaymentGcash(){
        return driver.findElement(By.xpath("//*[@text='GCASH']"));
    }
        public WebElement
                objPaymentPayMaya(){
        return driver.findElement(By.xpath("//*[@text='PAYMAYA']"));
    }
        public WebElement objGrabPay (){
        return driver.findElement(By.xpath("//*[@text='GRAB PAY']"));
    }
        public WebElement objPayMaya (){
        return driver.findElement(By.xpath("//*[@text='PAYMAYA']"));
    }

    }

