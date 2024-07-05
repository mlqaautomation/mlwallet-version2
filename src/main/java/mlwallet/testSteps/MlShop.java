package mlwallet.testSteps;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

import java.util.List;

public class MlShop extends Base_Steps {
    Login login = new Login();

    public void shopItemsNavigation() throws Exception {
        mobileGeneralMethod.tap(mlShopObjects.objShopItemsTab(), "Shop Items Icon");
        Thread.sleep(10000);
        mobileGeneralMethod.tap(mlShopObjects.objMLShopPage(), "ML Shop Page");
        mobileGeneralMethod.tap(mlShopObjects.objloginOkayButton(), "Login Success Button");
    }

    public void selectItemAndAddToCart() throws Exception {
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objSelectItem(), "Item");
        //click(MLWalletShopItemsPage.objSelectItem, getTextVal(MLWalletShopItemsPage.objSelectItem, "Item"));
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objAddToCartBtn(), "Add to cart Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objConfirmAddCarButton(), "Confirm Button");
    }

    public void navigationToCart() throws Exception {
        mobileGeneralMethod.tap(mlShopObjects.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(mlShopObjects.objCart(), "Cart");
    }

    public void editAddressAndPlaceTheOrder() throws Exception {
        mobileGeneralMethod.tap(mlShopObjects.objCheckBox(), "Check Box");
        mobileGeneralMethod.tap(mlShopObjects.objCheckOutBtn(), "Checkout Button");
        mobileGeneralMethod.tap(mlShopObjects.objSelectBranchPage(), "Page");
        mobileGeneralMethod.tap(mlShopObjects.objSaveBtn(), "Save Button");
        mobileGeneralMethod.isVisible(mlShopObjects.objAddressSuccessfulMsg(), "Message");
        mobileGeneralMethod.tap(mlShopObjects.objOkBtn(), "OK Button");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(mlShopObjects.objSelectPaymentMethod(), "Header");
        mobileGeneralMethod.tap(mlShopObjects.objMLWallet(), "Option");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objPlaceOrderBtn(), "Place Order Button");
    }


    public void mlWallet_ShopItems_Successful_Purchase() throws Exception {
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        editAddressAndPlaceTheOrder();
//        mobileGeneralMethod.isVisible(mlShopObjects.objOtpPage(), "Pop up");
//        Thread.sleep(2000);
//        mobileGeneralMethod.tap(mlShopObjects.objOtpTextField(), "Otp Text Field");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        mobileGeneralMethod.waitSleep(10000);
//        handleOtp(prop.getproperty("otp"));
//        mobileGeneralMethod.tap(mlShopObjects.objValidateBtn(), "Validate Button");
        // code for successful purchase message validation
    }

    public void mlWallet_ShopItems_with_Insufficient_Balance() throws Exception {
        login.loginWalletBuyerTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        editAddressAndPlaceTheOrder();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        mobileGeneralMethod.waitSleep(10000);
//        mobileGeneralMethod.isVisible(mlShopObjects.objOtpPage(), "Pop up");
//        Thread.sleep(2000);
//        mobileGeneralMethod.tap(mlShopObjects.objOtpTextField(), "Otp Text Field");
//        handleOtp(prop.getproperty("OTP"));
//        mobileGeneralMethod.tap(mlShopObjects.objValidateBtn(), "Validate Button");
        String oOpsMsg = mobileGeneralMethod.getText(mlShopObjects.objInvalidOtpPopUp());
        String supplyFieldsMsg = mobileGeneralMethod.getText(mlShopObjects.objInvalidOtpPopUpMsg());
        LoggingUtils.info(oOpsMsg + " " + supplyFieldsMsg + " Pop Up Message is displayed");
        ExtentReporter.logInfo("", oOpsMsg + " " + supplyFieldsMsg + " Pop Up Message is displayed");
        LoggingUtils.info("MLS_TC_02, Oops... Insufficient Balance. - Error message is validated ");
        ExtentReporter.logPass("MLS_TC_02", "MLS_TC_02, Oops... Insufficient Balance. - Error message is validated");
        System.out.println("-----------------------------------------------------------");
    }

    public void mlWallet_ShopItems_with_Incorrect_Otp() throws Exception {
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        editAddressAndPlaceTheOrder();
//        mobileGeneralMethod.isVisible(mlShopObjects.objOtpPage(), "Pop up");
//        Thread.sleep(2000);
//        mobileGeneralMethod.tap(mlShopObjects.objOtpTextField(), "Otp Text Field");
//        handleOtp(prop.getproperty("incorrectOtp"));
//        click(MLWalletShopItemsPage.objValidateBtn, "Validate Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        mobileGeneralMethod.waitSleep(10000);
        // Code to be written to validate incorrect otp msg
    }

    public void shopItemsWithoutInputOtp_MLS_TC_04() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        editAddressAndPlaceTheOrder();
        mobileGeneralMethod.isVisible(mlShopObjects.objOtpPage(), "Pop up");
        Thread.sleep(2000);
        mobileGeneralMethod.tap(mlShopObjects.objValidateBtn(), "Validate Button");
        String oOpsMsg = mobileGeneralMethod.getText(mlShopObjects.objInvalidOtpPopUp());
        String supplyFieldsMsg = mobileGeneralMethod.getText(mlShopObjects.objInvalidOtpPopUpMsg());
        LoggingUtils.info(oOpsMsg + " " + supplyFieldsMsg + " Pop Up Message is displayed");
        ExtentReporter.logInfo("", oOpsMsg + " " + supplyFieldsMsg + " Pop Up Message is displayed");
        LoggingUtils.info("MLS_TC_04, Oops... Please supply all fields. - Error message is validated");
        ExtentReporter.logPass("MLS_TC_04", "MLS_TC_04, Oops... Please supply all fields. - Error message is validated");
        System.out.println("-----------------------------------------------------------");
    }

    public void shopItemsHamburgerMenuNavigation_MLS_TC_12() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.tap(mlShopObjects.objHamburgerMenu(), "Hamburger Menu");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objSearch(), "Button")) {
            mobileGeneralMethod.isVisible(mlShopObjects.objProfile(), "Button");
            mobileGeneralMethod.isVisible(mlShopObjects.objCart(), "Button");
            mobileGeneralMethod.isVisible(mlShopObjects.objShop(), "Button");
            mobileGeneralMethod.isVisible(mlShopObjects.objAbout(), "Button");
            mobileGeneralMethod.isVisible(mlShopObjects.objContact(), "Button");
            LoggingUtils.info("MLS_TC_12, Shop Items Hamburger Menu Navigation validated");
            ExtentReporter.logPass("MLS_TC_12", "MLS_TC_12, Shop Items Hamburger Menu Navigation validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

//    public void shopItemsRespectivePageNavigationAfterSelectingAnCategory_MLS_TC_15() throws Exception {
//        login.loginWalletBranchTier();
//        shopItemsNavigation();
//        mobileGeneralMethod.verticalSwipeDown();
//        mobileGeneralMethod.verticalSwipe();
//        mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
//        if (mobileGeneralMethod.isDisplayed(mlShopObjects.objItems())) {
//            List<WebElement> values = findElements(mlShopObjects.objItems());
//            assert values != null;
//            for (WebElement value : values) {
//                String displayedItem = value.getText();
//                LoggingUtils.info("Item : " + displayedItem + " is displayed");
//                ExtentReporter.logPass(" ", "Item : " + displayedItem + " is displayed");
//            }
//        }
//        mobileGeneralMethod.isVisible(mlShopObjects.objGenderDropdown(), "Dropdown");
//        mobileGeneralMethod.isVisible(mlShopObjects.objColorDropdown(), "Dropdown");
//        mobileGeneralMethod.isVisible(mlShopObjects.objKaratDropdown(), "Dropdown");
//        mobileGeneralMethod.isVisible(mlShopObjects.objPriceDropdown(), "Dropdown");
//        LoggingUtils.info("MLS_TC_15, Shop Items Respective Page Navigation After Selecting An Category validated");
//        ExtentReporter.logPass("MLS_TC_15", "MLS_TC_15, Shop Items Respective Page Navigation After Selecting An Category validated");
//        System.out.println("-----------------------------------------------------------");
//    }

    public void shopItemsSelectedItemScreenUIValidation_MLS_TC_18() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.tap(mlShopObjects.objSelectItem(), "Item");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(mlShopObjects.objProductImage(), "Selected Product Image")) {
            mobileGeneralMethod.isVisible(mlShopObjects.objProductPrice(), "Product Price");
            mobileGeneralMethod.isVisible(mlShopObjects.objShippingTo(), "Shipping To");
            mobileGeneralMethod.isVisible(mlShopObjects.objShippingFee(), "Shipping Fee");
            mobileGeneralMethod.isVisible(mlShopObjects.objAddToCartBtn(), "Button");
            mobileGeneralMethod.isVisible(mlShopObjects.objViewShop(), "Button");
            LoggingUtils.info("MLS_TC_18, Shop Items Selected Item Screen UI validated");
            ExtentReporter.logPass("MLS_TC_18", "MLS_TC_18, Shop Items Selected Item Screen UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsCartPageUIValidation_MLS_TC_19() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        if (mobileGeneralMethod.isVisible(mlShopObjects.objCartPageHeader(), "Header")) {
            mobileGeneralMethod.isVisible(mlShopObjects.objCheckBox(), "Item Check Box");
            mobileGeneralMethod.isVisible(mlShopObjects.objProductNameInCartPage(), "Product Name in Cart Page");
            mobileGeneralMethod.isVisible(mlShopObjects.objPriceInCartPage(), "Price");
            mobileGeneralMethod.isVisible(mlShopObjects.objDeleteIcon(), "Delete Icon");
            mobileGeneralMethod.isVisible(mlShopObjects.objCheckOutBtn(), "Button");
            LoggingUtils.info("MLS_TC_19, Shop Items Cart Page UI validated");
            ExtentReporter.logPass("MLS_TC_19", "MLS_TC_19, Shop Items Cart Page UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsShippingDetailsPageUIValidation_MLS_TC_20() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        mobileGeneralMethod.tap(mlShopObjects.objCheckBox(), "Check Box");
        mobileGeneralMethod.tap(mlShopObjects.objCheckOutBtn(), "Checkout Button");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objShippingDetails(),  "Page")) {
            mobileGeneralMethod.isVisible(mlShopObjects.objAddAddress(), "Button");
            mobileGeneralMethod.isVisible(mlShopObjects.objEditAddress(), "Edit address Icon");
            mobileGeneralMethod.isVisible(mlShopObjects.objHeader(), "Header");
            mobileGeneralMethod.isVisible(mlShopObjects.objProductNameInShippingDetails(), "Product Name in Shipping Details");
            mobileGeneralMethod.isVisible(mlShopObjects.objProductQuantity(), "Product Quantity");
            mobileGeneralMethod.isVisible(mlShopObjects.objItemSubTotal(), "Item SubTotal");
            mobileGeneralMethod.isVisible(mlShopObjects.objTotalOrder(), "Total Order");
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.isVisible(mlShopObjects.objServiceFee(), "Service Fee");
            mobileGeneralMethod.isVisible(mlShopObjects.objShippingFeeInShippingDetails(), "Shipping Fee in Shipping Details");
            mobileGeneralMethod.isVisible(mlShopObjects.objSelectPaymentMethod(), "Header");
            mobileGeneralMethod.isVisible(mlShopObjects.objMLWallet(), "Payment Method");
            mobileGeneralMethod.isVisible(mlShopObjects.objOnlineBanking(), "Payment Method");
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.isVisible(mlShopObjects.objMerchandiseSubTotal(), "Merchandise Subtotal");
            mobileGeneralMethod.isVisible(mlShopObjects.objServiceTotal(), "Service Total");
            mobileGeneralMethod.isVisible(mlShopObjects.objShippingTotal(), "Shipping Total");
            mobileGeneralMethod.isVisible(mlShopObjects.objPaymentTotal(), "Total Payment");
            mobileGeneralMethod.isVisible(mlShopObjects.objPlaceOrderBtn(), "Button");
            LoggingUtils.info("MLS_TC_20, Shop Items Shipping Details Page UI validated");
            ExtentReporter.logPass("MLS_TC_20", "MLS_TC_20, Shop Items Shipping Details Page UI validated");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void shopItemsSelectBranchAddressPageUIValidation_MLS_TC_21() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        mobileGeneralMethod.tap(mlShopObjects.objCheckBox(), "Check Box");
        mobileGeneralMethod.tap(mlShopObjects.objCheckOutBtn(), "Checkout Button");
      mobileGeneralMethod.tap(mlShopObjects.objEditAddress(), "Edit address Icon");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objInputFieldOne(), "Select Branch Address Field 1")) {
            mobileGeneralMethod.isVisible(mlShopObjects.objInputFieldTwo(), "Select Branch Address Field 2");
            mobileGeneralMethod.isVisible(mlShopObjects.objInputFieldThree(), "Select Branch Address Field 3");
            mobileGeneralMethod.isVisible(mlShopObjects.objSaveBtn(), "Button");
            mobileGeneralMethod.isVisible(mlShopObjects.objCancel(), "Button");
            LoggingUtils.info("MLS_TC_21, Shop Items Select Branch Address Page UI validated");
            ExtentReporter.logPass("MLS_TC_21", "MLS_TC_21, Shop Items Select Branch Address Page UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void shopItemsSaveBtnFunctionalityOnSelectBranchScreen_MLS_TC_22() throws Exception {
        shopItemsSelectBranchAddressPageUIValidation_MLS_TC_21();
        mobileGeneralMethod.tap(mlShopObjects.objSaveBtn(), "Button");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objAddressUpdateMsg(), "Message")) {
            mobileGeneralMethod.isVisible(mlShopObjects.objOkBtn(), "Button");
            LoggingUtils.info("MLS_TC_22, Shop Items Select Branch Address Page UI validated");
            ExtentReporter.logPass("MLS_TC_22", "MLS_TC_22, Shop Items Select Branch Address Page UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsCancelBtnFunctionalityOnSelectBranchScreen_MLS_TC_23() throws Exception {
      login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        mobileGeneralMethod.tap(mlShopObjects.objCheckBox(), "Check Box");
        mobileGeneralMethod.tap(mlShopObjects.objCheckOutBtn(), "Checkout Button");
       mobileGeneralMethod.tap(mlShopObjects.objEditAddress(), "Edit address Icon");
        String sSelectAddressOne = mobileGeneralMethod.getText(mlShopObjects.objInputFieldOne());
        String sSelectAddressTwo = mobileGeneralMethod.getText(mlShopObjects.objInputFieldTwo());
        String sSelectAddressThree = mobileGeneralMethod.getText(mlShopObjects.objInputFieldThree());
        mobileGeneralMethod.tap(mlShopObjects.objCancel(), "Button");
        mobileGeneralMethod.tap(mlShopObjects.objEditAddress(), "Edit address Icon");
        String sActualSelectAddressOne = mobileGeneralMethod.getText(mlShopObjects.objInputFieldOne());
        String sActualSelectAddressTwo = mobileGeneralMethod.getText(mlShopObjects.objInputFieldTwo());
        String sActualSelectAddressThree = mobileGeneralMethod.getText(mlShopObjects.objInputFieldThree());
        mobileGeneralMethod.assertionValidation(sActualSelectAddressOne, sSelectAddressOne);
        mobileGeneralMethod.assertionValidation(sActualSelectAddressTwo, sSelectAddressTwo);
        mobileGeneralMethod.assertionValidation(sActualSelectAddressThree, sSelectAddressThree);
        LoggingUtils.info("MLS_TC_23, Shop Items Cancel Button Functionality On Select Branch Screen validated");
        ExtentReporter.logPass("MLS_TC_23", "MLS_TC_23, Shop Items Cancel Button Functionality On Select Branch Screen validated");
        System.out.println("-----------------------------------------------------------");
    }


    public void shopItemsPlaceOrderBtnFunctionalityOnShippingDetailsScreen_MLS_TC_24() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        editAddressAndPlaceTheOrder();
        if (mobileGeneralMethod.isVisible(mlShopObjects.objOtpPage(), "Pop up")) {
            LoggingUtils.info("MLS_TC_24, Shop Items Place Order Button Functionality On Shipping Details Screen validated");
            ExtentReporter.logPass("MLS_TC_24", "MLS_TC_24, Shop Items Place Order Button Functionality On Shipping Details Screen validated");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void shopItemsOneTimePinPageUIValidation_MLS_TC_25() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        editAddressAndPlaceTheOrder();
        if (mobileGeneralMethod.isVisible(mlShopObjects.objOtpPage(), "Pop up")) {
            mobileGeneralMethod.isVisible(mlShopObjects.objOTPMsg(), "Message");
            mobileGeneralMethod.isVisible(mlShopObjects.objValidateBtn(), "Button");
            mobileGeneralMethod.isVisible(mlShopObjects.objCancel(), "Buttn");
            LoggingUtils.info("MLS_TC_25, Shop Items One Time Pin Page UI validated");
            ExtentReporter.logPass("MLS_TC_25", "MLS_TC_25, Shop Items One Time Pin Page UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsCancelBtnFunctionalityOnOTPScreen_MLS_TC_26() throws Exception {
        shopItemsOneTimePinPageUIValidation_MLS_TC_25();
        mobileGeneralMethod.tap(mlShopObjects.objCancel(), "Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(mlShopObjects.objPlaceOrderBtn(), "Button")) {
            LoggingUtils.info("MLS_TC_26, Shop Items Cancel Button Functionality on OTP Screen validated");
            ExtentReporter.logPass("MLS_TC_26", "MLS_TC_26, Shop Items Cancel Button Functionality on OTP Screen validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsPlacingAnOrderWithOutSelectingPaymentMethod_MLS_TC_33() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        mobileGeneralMethod.tap(mlShopObjects.objCheckBox(), "Check Box");
        mobileGeneralMethod.tap(mlShopObjects.objCheckOutBtn(), "Checkout Button");
        mobileGeneralMethod.tap(mlShopObjects.objEditAddress(), "Edit Address Tab");
        mobileGeneralMethod.isVisible(mlShopObjects.objSelectBranchPage(), "Page");
        mobileGeneralMethod.tap(mlShopObjects.objSaveBtn(), "Save Button");
        mobileGeneralMethod.isVisible(mlShopObjects.objAddressSuccessfulMsg(), "Message");
        mobileGeneralMethod.tap(mlShopObjects.objOkBtn(), "OK Button");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objPlaceOrderBtn(), "Place Order Button");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objErrorPopup(), "Error Popup")) {
            String sActualErrorPopup = mobileGeneralMethod.getText(mlShopObjects.objErrorPopup());
            String sExpectedErrorPopup = "Please select payment method.";
            mobileGeneralMethod.assertionValidation(sActualErrorPopup, sExpectedErrorPopup);
            mobileGeneralMethod.isVisible(mlShopObjects.objOkBtn(), "Button");
            LoggingUtils.info("MLS_TC_33, Please select payment method. Error message validated");
            ExtentReporter.logPass("MLS_TC_33", "MLS_TC_33, Please select payment method. Error message validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsOkBtnFunctionalityOnErrorPopup_MLS_TC_34() throws Exception {
        shopItemsPlacingAnOrderWithOutSelectingPaymentMethod_MLS_TC_33();
        mobileGeneralMethod.tap(mlShopObjects.objOkBtn(), "Button");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objErrorPopup(), "Error popup")) {
            LoggingUtils.info("MLS_TC_34, Error popup disappeared after clicking on Ok Button is validated");
            ExtentReporter.logPass("MLS_TC_34", "MLS_TC_34, Error popup disappeared after clicking on Ok Button is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsCartPageNavigation_MLS_TC_42() throws Exception {
      login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        if (mobileGeneralMethod.isVisible(mlShopObjects.objCartPageHeader(), "Header")) {
            mobileGeneralMethod.isVisible(mlShopObjects.objCheckBox(), "Item Check Box");
            mobileGeneralMethod.isVisible(mlShopObjects.objProductNameInCartPage(), "Product Name in Cart Page");
            mobileGeneralMethod.isVisible(mlShopObjects.objPriceInCartPage(), "Price");
            mobileGeneralMethod.isVisible(mlShopObjects.objDeleteIcon(), "Delete Icon");
            mobileGeneralMethod.isVisible(mlShopObjects.objCheckOutBtn(), "Button");
            LoggingUtils.info("MLS_TC_42, Shop Items Cart Page Navigation validated");
            ExtentReporter.logPass("MLS_TC_42", "MLS_TC_42, Shop Items Cart Page Navigation validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsCancelBtnFunctionalityOnRemoveItemPopup_MLS_TC_43() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
       mobileGeneralMethod.tap(mlShopObjects.objDeleteIcon(), "Delete Icon");
        mobileGeneralMethod.tap(mlShopObjects.objCancel(), "Button");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objCheckOutBtn(), "Cart Page")) {
            LoggingUtils.info("MLS_TC_43, Shop Items Cancel Button Functionality On Remove Item Popup validated");
            ExtentReporter.logPass("MLS_TC_43", "MLS_TC_43, Shop Items Cancel Button Functionality On Remove Item Popup validated");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void shopItemsOkBtnFunctionalityOnRemoveItemPopup_MLS_TC_44() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        mobileGeneralMethod.tap(mlShopObjects.objDeleteIcon(), "Delete Icon");
        mobileGeneralMethod.tap(mlShopObjects.objYesBtn(), "Button");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objProductNameInCartPage(), "Cart Page")) {
            LoggingUtils.info("MLS_TC_44, Shop Items Ok Button Functionality On Remove Item Popup validated");
            ExtentReporter.logPass("MLS_TC_44", "MLS_TC_44, Shop Items Ok Button Functionality On Remove Item Popup validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsNavigationToProfileOption_MLS_TC_46() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.tap(mlShopObjects.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(mlShopObjects.objProfile(), "Option");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objMyAccount(), "Page")) {
            LoggingUtils.info("MLS_TC_46, Shop Items Navigation To Profile Option validated");
            ExtentReporter.logPass("MLS_TC_46", "MLS_TC_46, Shop Items Navigation To Profile Option validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsProfileScreenNavigation_MLS_TC_47() throws Exception {
        shopItemsNavigationToProfileOption_MLS_TC_46();
        mobileGeneralMethod.tap(mlShopObjects.objMyAccountDropdown(), "Dropdown");
        mobileGeneralMethod.tap(mlShopObjects.objProfile(), "Dropdown Element");
        mobileGeneralMethod.tap(mlShopObjects.objMyAccountPageCrossBtn(), "Cross Button");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objMyProfileHeader(), "Header")) {
            LoggingUtils.info("MLS_TC_47, Shop items Profile Screen Navigation validated");
            ExtentReporter.logPass("MLS_TC_47", "MLS_TC_47, Shop items Profile Screen Navigation validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsMyAccountPopupCrossBtnFunctionality_MLS_TC_48() throws Exception {
        shopItemsNavigationToProfileOption_MLS_TC_46();
        mobileGeneralMethod.isVisible(mlShopObjects.objMyAccountDropdown(), "Dropdown");
        mobileGeneralMethod.tap(mlShopObjects.objProfile(), "Dropdown Element");
        mobileGeneralMethod.tap(mlShopObjects.objMyAccountPageCrossBtn(), "Cross Button");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objMyProfileHeader(), "Header")) {
            LoggingUtils.info("MLS_TC_48, Shop items My Account Popup Cross Btn Functionality validated");
            ExtentReporter.logPass("MLS_TC_48", "MLS_TC_48, Shop items My Account Popup Cross Btn Functionality validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsMyPurchasePageNavigation_MLS_TC_49() throws Exception {
        shopItemsNavigationToProfileOption_MLS_TC_46();
        mobileGeneralMethod.tap(mlShopObjects.objMyPurchase(), "Option");
        mobileGeneralMethod.tap(mlShopObjects.objMyAccountPageCrossBtn(), "Cross Button");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objOrderDetails(), "Button")) {
            LoggingUtils.info("MLS_TC_49, Shop items My Purchase Page Navigation validated");
            ExtentReporter.logPass("MLS_TC_49", "MLS_TC_49, Shop items My Purchase Page Navigation validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsSubTotalVerificationWithOutSelectingTheItemsInCart_MLS_TC_59() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        if (mobileGeneralMethod.isVisible(mlShopObjects.objSubtotalAmount(), "SubTotal Items")) {
            String sActualSubtotalItems = mobileGeneralMethod.getText(mlShopObjects.objSubtotalAmount());
            String sExceptedSubtotalItems = "P 0.00";
            mobileGeneralMethod.assertionValidation(sActualSubtotalItems, sExceptedSubtotalItems);
            LoggingUtils.info("MLS_TC_59, Shop Items Total subTotal Verification without selecting the items in the Cart validated");
            ExtentReporter.logPass("MLS_TC_59", "MLS_TC_59, Shop Items Total subTotal Verification without selecting the items in the Cart validated");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void shopItemsSubTotalVerificationWithSelectingTheItemsInCart_MLS_TC_60() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        mobileGeneralMethod.tap(mlShopObjects.objCheckBox(), "Check Box");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(mlShopObjects.objSubtotalAmount(), "SubTotal Items")) {
            String sSelectItemPrice = mobileGeneralMethod.getText(mlShopObjects.objSelectedItemPrice());
            String sActualSubtotalItems = mobileGeneralMethod.getText(mlShopObjects.objSubtotalAmount());
            mobileGeneralMethod.assertionValidation(sActualSubtotalItems, sSelectItemPrice);
            LoggingUtils.info("MLS_TC_60, Shop Items Total subTotal Verification with selecting the items in the Cart validated");
            ExtentReporter.logPass("MLS_TC_60", "MLS_TC_60, Shop Items Total subTotal Verification with selecting the items in the Cart validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsAboutLinkFunctionality_MLS_TC_83() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.tap(mlShopObjects.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(mlShopObjects.objAbout(), "Button");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objJewelry(), "Page")) {
            LoggingUtils.info("MLS_TC_83, After Clicking on About link from Hamburger menu, Application navigates to Jewelry Page is validated");
            ExtentReporter.logPass("MLS_TC_83", "MLS_TC_83, After Clicking on About link from Hamburger menu, Application navigates to Jewelry Page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsContactLinkFunctionality_MLS_TC_84() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.tap(mlShopObjects.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(mlShopObjects.objContact(), "Button");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objContactUs(), "Page")) {
            LoggingUtils.info("MLS_TC_84, After Clicking on contact link from Hamburger menu, Application navigates to Contact Us Page is validated");
            ExtentReporter.logPass("MLS_TC_84", "MLS_TC_84, After Clicking on contact link from Hamburger menu, Application navigates to Contact Us Page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

//    public void shopItemsGreatDealsForFineWatchesValidation_MLS_TC_85() throws Exception {
//       login.loginWalletBranchTier();
//        shopItemsNavigation();
//        swipeDownUntilElementVisible("Great Deals for Fine Watches");
//        if (mobileGeneralMethod.isVisible(mlShopObjects.objGreatDealsForFineWatches(), "Header")) {
//            mobileGeneralMethod.verticalSwipeDown();
//            mobileGeneralMethod.verticalSwipe();
//            mobileGeneralMethod.waitSleep(3000);
//            mobileGeneralMethod.isVisible(mlShopObjects.objRolex(), "Watch Products");
//            mobileGeneralMethod.verticalSwipeDown();
//            mobileGeneralMethod.verticalSwipe();
//            mobileGeneralMethod.waitSleep(3000);
//            mobileGeneralMethod.isVisible(mlShopObjects.objHamilton(), "Watch Products");
//            mobileGeneralMethod.verticalSwipeDown();
//            mobileGeneralMethod.verticalSwipe();
//            mobileGeneralMethod.waitSleep(3000);
//            mobileGeneralMethod.isVisible(mlShopObjects.objOmega(), "Watch Product");
//            mobileGeneralMethod.verticalSwipeDown();
//            mobileGeneralMethod.verticalSwipe();
//            mobileGeneralMethod.waitSleep(3000);
//            mobileGeneralMethod.isVisible(mlShopObjects.objTagHeuer(), "Watch Product");
//            LoggingUtils.info("MLS_TC_85, Shop Items Great Deals for Fine Watches validated");
//            ExtentReporter.logPass("MLS_TC_85", "MLS_TC_85, Shop Items Great Deals for Fine Watches validated");
//            System.out.println("-----------------------------------------------------------");
//        }
//    }

    public void shopItemsProductDetailsValidation_MLS_TC_86() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.tap(mlShopObjects.objSelectItem(), "Item");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(mlShopObjects.objProductImage(), "Product Image")) {
            mobileGeneralMethod.isVisible(mlShopObjects.objProductName(), "Product Name");
            mobileGeneralMethod.isVisible(mlShopObjects.objDiscountPercentage(), "Discount Percentage");
            mobileGeneralMethod.isVisible(mlShopObjects.objOriginalPrice(), "Original Price");
            mobileGeneralMethod.isVisible(mlShopObjects.objDiscountPrice(), "Discount Price");
            LoggingUtils.info("MLS_TC_86, Shop Items Product Details validated");
            ExtentReporter.logPass("MLS_TC_86", "MLS_TC_86, Shop Items Product Details validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsCategoriesValidation_MLS_TC_88() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objCategoriesHamburgerMenu(), "Categories Hamburger Menu");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objCategoriesHamburgerMenu(), "Menu")) {
            mobileGeneralMethod.isVisible(mlShopObjects.objAmparitoCollections(), "Category Header");
            mobileGeneralMethod.isVisible(mlShopObjects.objFineJewelry(), "Category Header");
            LoggingUtils.info("MLS_TC_88, Shop Items Categories validated");
            ExtentReporter.logPass("MLS_TC_88", "MLS_TC_88, Shop Items Categories validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsAmparitoCollectionsProductTypesValidation_MLS_TC_89() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objCategoriesHamburgerMenu(), "Categories Hamburger Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objCategoriesHamburgerMenu(), "Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objAmparitoCollections(), "Category Header");
        for (int i = 1; i <= 9; i++) {
            mobileGeneralMethod.isVisible(mlShopObjects.objAmparitoCollectionsProductTypes(i), "Product Type");
        }
        LoggingUtils.info("MLS_TC_89, Shop Items Amparito Collections Product Types validated");
        ExtentReporter.logPass("MLS_TC_89", "MLS_TC_89, Shop Items Amparito Collections Product Types validated");
        System.out.println("-----------------------------------------------------------");
    }

    public void shopItemsAmparitoCollectionsRingProductTypeSubTypesValidation_MLS_TC_90() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objCategoriesHamburgerMenu(), "Categories Hamburger Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objCategoriesHamburgerMenu(), "Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objAmparitoCollections(), "Category Header");
        mobileGeneralMethod.tap(mlShopObjects.objRings(), "Product Type");
        for (int i = 1; i <= 6; i++) {
            mobileGeneralMethod.isVisible(mlShopObjects.objRingsSubTypes(i), "Ring SubType");
        }
        LoggingUtils.info("MLS_TC_90, Shop Items Amparito Collections Ring Product Type SubTypes validated");
        ExtentReporter.logPass("MLS_TC_90", "MLS_TC_90, Shop Items Amparito Collections Ring Product Type SubTypes validated");
        System.out.println("-----------------------------------------------------------");
    }

    public void shopItemsAmparitoCollectionsNecklaceProductTypeSubTypesValidation_MLS_TC_91() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objCategoriesHamburgerMenu(), "Categories Hamburger Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objCategoriesHamburgerMenu(), "Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objAmparitoCollections(), "Category Header");
        mobileGeneralMethod.tap(mlShopObjects.objNecklacePendants(), "Product Type");
        for (int i = 1; i <= 15; i++) {
            mobileGeneralMethod.isVisible(mlShopObjects.objNecklaceSubTypes(i), "Necklace SubType");
        }
        LoggingUtils.info("MLS_TC_91, Shop Items Amparito Collections Necklace Product Type SubTypes validated");
        ExtentReporter.logPass("MLS_TC_91", "MLS_TC_91, Shop Items Amparito Collections Necklace Product Type SubTypes validated");
        System.out.println("-----------------------------------------------------------");
    }


    public void shopItemsAmparitoCollectionsBraceletAndBangleProductTypeSubTypesValidation_MLS_TC_92() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlShopObjects.objCategoriesHamburgerMenu(), "Categories Hamburger Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objCategoriesHamburgerMenu(), "Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objAmparitoCollections(), "Category Header");
        mobileGeneralMethod.tap(mlShopObjects.objBraceletAndBangle(), "Product Type");
        for (int i = 1; i <= 6; i++) {
            mobileGeneralMethod.isVisible(mlShopObjects.objBraceletAndBangleSubTypes(i), "Bracelet And Bangle SubType");
        }
        LoggingUtils.info("MLS_TC_92, Shop Items Amparito Collections Bracelet And Bangle Product Type SubTypes validated");
        ExtentReporter.logPass("MLS_TC_92", "MLS_TC_92, Shop Items Amparito Collections Bracelet And Bangle Product Type SubTypes validated");
        System.out.println("-----------------------------------------------------------");
    }


    public void shopItemsAmparitoCollectionsEarringsProductTypeSubTypesValidation_MLS_TC_93() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlShopObjects.objCategoriesHamburgerMenu(), "Categories Hamburger Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objCategoriesHamburgerMenu(), "Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objAmparitoCollections(), "Category Header");
        mobileGeneralMethod.tap(mlShopObjects.objEarrings(), "Product Type");
        for (int i = 1; i <= 7; i++) {
            mobileGeneralMethod.isVisible(mlShopObjects.objEarringsSubTypes(i), "Earrings SubType");
        }
        LoggingUtils.info("MLS_TC_93, Shop Items Amparito Collections Earrings Product Type SubTypes validated");
        ExtentReporter.logPass("MLS_TC_93", "MLS_TC_93, Shop Items Amparito Collections Earrings Product Type SubTypes validated");
        System.out.println("-----------------------------------------------------------");
    }


    public void shopItemsAmparitoCollectionsPendantProductTypeSubTypesValidation_MLS_TC_94() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlShopObjects.objCategoriesHamburgerMenu(), "Categories Hamburger Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objCategoriesHamburgerMenu(), "Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objAmparitoCollections(), "Category Header");
        mobileGeneralMethod.tap(mlShopObjects.objPendant(), "Product Type");
        for (int i = 1; i <= 6; i++) {
            mobileGeneralMethod.isVisible(mlShopObjects.objPendantSubTypes(i), "Pendant SubType");
        }
        LoggingUtils.info("MLS_TC_94, Shop Items Amparito Collections Pendant Product Type SubTypes validated");
        ExtentReporter.logPass("MLS_TC_94", "MLS_TC_94, Shop Items Amparito Collections Pendant Product Type SubTypes validated");
        System.out.println("-----------------------------------------------------------");
    }


    public void shopItemsAmparitoCollectionsTernoAndSetProductTypeSubTypesValidation_MLS_TC_95() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objCategoriesHamburgerMenu(), "Categories Hamburger Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objCategoriesHamburgerMenu(), "Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objAmparitoCollections(), "Category Header");
        if ( mobileGeneralMethod.isVisible(mlShopObjects.objTernoAndSet(), "Product Type")) {
            mobileGeneralMethod.tap(mlShopObjects.objTernoAndSet(),"Product Type");
            mobileGeneralMethod.isVisible(mlShopObjects.objTernoAndSetSubTypes(), "Terno and Set SubType");
            LoggingUtils.info("MLS_TC_95, Shop Items Amparito Collections Terno and Set Product Type SubTypes validated");
            ExtentReporter.logPass("MLS_TC_95", "MLS_TC_95, Shop Items Amparito Collections Terno and Set Product Type SubTypes validated");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void shopItemsAmparitoCollectionsWeddingRingProductTypeSubTypesValidation_MLS_TC_96() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objCategoriesHamburgerMenu(), "Categories Hamburger Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objCategoriesHamburgerMenu(), "Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objAmparitoCollections(), "Category Header");
        if ( mobileGeneralMethod.isVisible(mlShopObjects.objWeddingRing(), "Product Type")) {
            mobileGeneralMethod.tap(mlShopObjects.objWeddingRing(),"Product Type");
            mobileGeneralMethod.isVisible(mlShopObjects.objWeddingRingSubTypes(), "Wedding Ring SubType");
            LoggingUtils.info("MLS_TC_96, Shop Items Amparito Collections Wedding Ring Product Type SubTypes validated");
            ExtentReporter.logPass("MLS_TC_96", "MLS_TC_96, Shop Items Amparito Collections Wedding Ring Product Type SubTypes validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsAmparitoCollectionsPinBrouchAndScalpingProductTypeSubTypesValidation_MLS_TC_97() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlShopObjects.objCategoriesHamburgerMenu(), "Categories Hamburger Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objCategoriesHamburgerMenu(), "Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objAmparitoCollections(), "Category Header");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objPinBrouchAndScalpings(), "Product Type")) {
            mobileGeneralMethod.tap(mlShopObjects.objPinBrouchAndScalpings(),"Product Type");
            mobileGeneralMethod.isVisible(mlShopObjects.objPinBrouchAndScalpingsSubTypes(), "Pin, Brouch & Scalpings SubType");
            LoggingUtils.info("MLS_TC_97, Shop Items Amparito Collections Pin, Brouch & Scalpings Product Type SubTypes validated");
            ExtentReporter.logPass("MLS_TC_97", "MLS_TC_97, Shop Items Amparito Collections Pin, Brouch & Scalpings Product Type SubTypes validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsAmparitoCollectionsWatchesProductTypeSubTypesValidation_MLS_TC_98() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objCategoriesHamburgerMenu(), "Categories Hamburger Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objCategoriesHamburgerMenu(), "Menu");
        mobileGeneralMethod.isVisible(mlShopObjects.objAmparitoCollections(), "Category Header");
        mobileGeneralMethod.tap(mlShopObjects.objWatches(), "Product Type");
        for (int i = 1; i <= 8; i++) {
            mobileGeneralMethod.isVisible(mlShopObjects.objWatchesSubTypes(i), "Bracelet And Bangle SubType");
        }
        LoggingUtils.info("MLS_TC_98, Shop Items Amparito Collections Watches Product Type SubTypes validated");
        ExtentReporter.logPass("MLS_TC_98", "MLS_TC_98, Shop Items Amparito Collections Watches Product Type SubTypes validated");
        System.out.println("-----------------------------------------------------------");
    }

    public void shopItemsGenderFilterValidation_MLS_TC_99() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objGender(), "Filter");
        for (int i = 1; i <= 5; i++) {
            mobileGeneralMethod.isVisible(mlShopObjects.objFilterCheckBox(i), "CheckBox");
        }
        LoggingUtils.info("MLS_TC_99, Shop Items Gender Filter validated");
        ExtentReporter.logPass("MLS_TC_99", "MLS_TC_99, Shop Items Gender Filter validated");
        System.out.println("-----------------------------------------------------------");
    }


    public void shopItemsColorFilterValidation_MLS_TC_100() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objColor(), "Filter");
        for (int i = 1; i <= 6; i++) {
            mobileGeneralMethod.isVisible(mlShopObjects.objFilterCheckBox(i), "CheckBox");
        }
        LoggingUtils.info("MLS_TC_100, Shop Items Color Filter validated");
        ExtentReporter.logPass("MLS_TC_100", "MLS_TC_100, Shop Items Color Filter validated");
        System.out.println("-----------------------------------------------------------");
    }

    public void shopItemsKaratFilterValidation_MLS_TC_101() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlShopObjects.objKarat(), "Filter");
        for (int i = 1; i <= 6; i++) {
            mobileGeneralMethod.isVisible(mlShopObjects.objFilterCheckBox(i), "CheckBox");
        }
        LoggingUtils.info("MLS_TC_101, Shop Items Karat Filter validated");
        ExtentReporter.logPass("MLS_TC_101", "MLS_TC_101, Shop Items Karat Filter validated");
        System.out.println("-----------------------------------------------------------");
    }

    public void shopItemsPriceFilterValidation_MLS_TC_102() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlShopObjects.objPrice(), "Filter");
        for (int i = 1; i <= 3; i++) {
            mobileGeneralMethod.isVisible(mlShopObjects.objFilterCheckBox(i), "CheckBox");
        }
        LoggingUtils.info("MLS_TC_102, Shop Items Price Filter validated");
        ExtentReporter.logPass("MLS_TC_102", "MLS_TC_102, Shop Items Price Filter validated");
        System.out.println("-----------------------------------------------------------");
    }

    public void shopItemsProductDetailsPageValidation_MLS_TC_103() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlShopObjects.objSelectItem(), "Item");
        mobileGeneralMethod.waitSleep(10000);
        if (mobileGeneralMethod.isVisible(mlShopObjects.objMainProductImage(), "Product Image in Product Details Page")) {
            mobileGeneralMethod.isVisible(mlShopObjects.objOptionalProductImage(), "Optional Product Image");
            mobileGeneralMethod.isVisible(mlShopObjects.objProductNameInProductDetails(), " : Product Name in Product details");
            mobileGeneralMethod.isVisible(mlShopObjects.objColorInProductDetails(), "Color in Product details");
            mobileGeneralMethod.isVisible(mlShopObjects.objKaratInProductDetails(), "Karat in Product details");
            mobileGeneralMethod.isVisible(mlShopObjects.objGenderInProductDetails(), "Gender in Product details");
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.isVisible(mlShopObjects.objPriceInProductDetails(), "Header in Product details");
            mobileGeneralMethod.isVisible(mlShopObjects.objActualPriceInProductDetails(), "Actual Price in Product details");
            mobileGeneralMethod.isVisible(mlShopObjects.objDiscountPriceInProductDetails(), "Discount Price in Product details");
            mobileGeneralMethod.isVisible(mlShopObjects.objShippingTo(), "Shipping To");
            mobileGeneralMethod.isVisible(mlShopObjects.objShippingFee(), "Shipping Fee");
            LoggingUtils.info("MLS_TC_103, Shop Items Product details Page validated");
            ExtentReporter.logPass("MLS_TC_103", "MLS_TC_103, Shop Items Product details Page validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsSellerDetailsInProductDetailsPageValidation_MLS_TC_104() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objSelectItem(), "Item");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(mlShopObjects.objShopName(), "Shop Name")) {
            mobileGeneralMethod.isVisible(mlShopObjects.objShopMobileNumber(), "Shop Mobile Number");
            mobileGeneralMethod.isVisible(mlShopObjects.objShopEmailID(), "Shop Email ID");
            mobileGeneralMethod.isVisible(mlShopObjects.objTotalProducts(), "Total Products");
            mobileGeneralMethod.isVisible(mlShopObjects.objSoldProducts(), "Sold Products");
            mobileGeneralMethod.isVisible(mlShopObjects.objViewShop(), "Button");
            LoggingUtils.info("MLS_TC_104, Shop Items Seller Details In Product Details Page validated");
            ExtentReporter.logPass("MLS_TC_104", "MLS_TC_104, Shop Items Seller Details In Product Details Page validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsYouMayAlsoBeInterestedInItemsDetailsValidation_MLS_TC_105() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlShopObjects.objSelectItem(), "Item");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(mlShopObjects.objProductImageInInterestedIn(), "Product Image In Interested In")) {
            mobileGeneralMethod.isVisible(mlShopObjects.objProductNameInInterestedIn(), "Product Name In Interested In");
            mobileGeneralMethod.isVisible(mlShopObjects.objActualPriceInInterestedIn(), "Actual Price In Interested In");
            mobileGeneralMethod.isVisible(mlShopObjects.objDiscountPriceInInterestedIn(), "Discount Price In Interested In");
            mobileGeneralMethod.isVisible(mlShopObjects.objDiscountPercentageInInterestedIn(), "Discount percentage In Interested In");
            LoggingUtils.info("MLS_TC_105, Shop Items You May Also Be Interested In Items Details validated");
            ExtentReporter.logPass("MLS_TC_105", "MLS_TC_105, Shop Items You May Also Be Interested In Items Details validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsYouMayAlsoBeInterestedInItemPageUIValidation_MLS_TC_106() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlShopObjects.objSelectItem(), "Item");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objProductImageInInterestedIn(), "First Item under You May Also Be Interested In Item Tab");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objMainProductImage(), "Product Image in Product Details Page")) {
            mobileGeneralMethod.isVisible(mlShopObjects.objOptionalProductImage(), "Optional Product Image");
            mobileGeneralMethod.isVisible(mlShopObjects.objProductNameInProductDetails(), " : Product Name in Product details");
            mobileGeneralMethod.isVisible(mlShopObjects.objColorInProductDetails(), "Color in Product details");
            mobileGeneralMethod.isVisible(mlShopObjects.objKaratInProductDetails(), "Karat in Product details");
            mobileGeneralMethod.isVisible(mlShopObjects.objGenderInProductDetails(), "Gender in Product details");
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.isVisible(mlShopObjects.objPriceInProductDetails(), "Header in Product details");
            mobileGeneralMethod.isVisible(mlShopObjects.objActualPriceInProductDetails(), "Actual Price in Product details");
            mobileGeneralMethod.isVisible(mlShopObjects.objDiscountPriceInProductDetails(), "Discount Price in Product details");
            mobileGeneralMethod.isVisible(mlShopObjects.objShippingTo(), "Shipping To");
            mobileGeneralMethod.isVisible(mlShopObjects.objShippingFee(), "Shipping Fee");
            LoggingUtils.info("MLS_TC_106, Shop Items You May Also Be Interested In Item page UI validated");
            ExtentReporter.logPass("MLS_TC_106", "MLS_TC_106, Shop Items You May Also Be Interested In Item page UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void shopItemsProductDetailsPageViewShopButtonFunctionalityValidation_MLS_TC_107() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objItemMenu(), "Rings Item");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objSelectItem(), "Item");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objViewShop(), "Button");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objShopName(), "Shop Name")) {
            mobileGeneralMethod.isVisible(mlShopObjects.objShopMobileNumber(), "Shop Mobile Number");
            mobileGeneralMethod.isVisible(mlShopObjects.objShopEmailID(), "Shop Email ID");
            mobileGeneralMethod.isVisible(mlShopObjects.objShopAddress1(), "Shop Address 1");
            mobileGeneralMethod.isVisible(mlShopObjects.objShopAddress2(), "Shop Address 2");
            LoggingUtils.info("MLS_TC_107, Shop Items Product Details Page View Shop Button Functionality validated");
            ExtentReporter.logPass("MLS_TC_107", "MLS_TC_107, Shop Items Product Details Page View Shop Button Functionality validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsPageUIValidation_MLS_TC_11() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(mlShopObjects.objShopItemsTab(), "Shop Items Icon");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(mlShopObjects.objMLShopPage(), "Page")) {
            mobileGeneralMethod.isVisible(mlShopObjects.objMLShopPageBanner(), "Banner");
            mobileGeneralMethod.isVisible(mlShopObjects.objMLShopLOgo(), "ML Shop Logo");
            mobileGeneralMethod.isVisible(mlShopObjects.objMLShopProductsHeader(), "Header");
            mobileGeneralMethod.isVisible(mlShopObjects.objProductImageInMLShopPage(), "Product Image in ML Shop Page");
            mobileGeneralMethod.isVisible(mlShopObjects.objHamburgerMenu(), "Hamburger Menu");
            LoggingUtils.info("MLS_TC_11, Shop Items page UI validated");
            ExtentReporter.logPass("MLS_TC_11", "MLS_TC_11, Shop Items page UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsSuccessfulLoginPopupValidation_MLS_TC_17() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(mlShopObjects.objShopItemsTab(), "Shop Items Icon");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objSuccessfulLoginTxt(), "Popup")) {
            LoggingUtils.info("MLS_TC_17, Shop Items Successful Login popup validated");
            ExtentReporter.logPass("MLS_TC_17", "MLS_TC_17, Shop Items Successful Login popup validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsPayUsingMLWalletOptionSelectionValidation_MLS_TC_35() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        mobileGeneralMethod.tap(mlShopObjects.objCheckBox(), "Check Box");
        mobileGeneralMethod.tap(mlShopObjects.objCheckOutBtn(), "Checkout Button");
        mobileGeneralMethod.tap(mlShopObjects.objEditAddress(), "Edit Address Tab");
        mobileGeneralMethod.isVisible(mlShopObjects.objSelectBranchPage(), "Page");
        mobileGeneralMethod.tap(mlShopObjects.objSaveBtn(), "Save Button");
        mobileGeneralMethod.isVisible(mlShopObjects.objAddressSuccessfulMsg(), "Message");
        mobileGeneralMethod.tap(mlShopObjects.objOkBtn(), "OK Button");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(mlShopObjects.objSelectPaymentMethod(), "Header");
        mobileGeneralMethod.tap(mlShopObjects.objMLWallet(), "Pay using ML Wallet Option");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objPlaceOrderBtn(), "Place Order Button");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objOtpPage(), "Page")) {
            LoggingUtils.info("MLS_TC_35, Shop Items Pay using ML Wallet option selected and App Navigates to OTP Page is validated");
            ExtentReporter.logPass("MLS_TC_35", "MLS_TC_35, Shop Items Pay using ML Wallet option selected and App Navigates to OTP Page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsPayUsingOnlineBankingOptionSelectionValidation_MLS_TC_36() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        mobileGeneralMethod.tap(mlShopObjects.objCheckBox(), "Check Box");
        mobileGeneralMethod.tap(mlShopObjects.objCheckOutBtn(), "Checkout Button");
        mobileGeneralMethod.tap(mlShopObjects.objEditAddress(), "Edit Address Tab");
        mobileGeneralMethod.isVisible(mlShopObjects.objSelectBranchPage(), "Page");
        mobileGeneralMethod.tap(mlShopObjects.objSaveBtn(), "Save Button");
        mobileGeneralMethod.isVisible(mlShopObjects.objAddressSuccessfulMsg(), "Message");
        mobileGeneralMethod.tap(mlShopObjects.objOkBtn(), "OK Button");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(mlShopObjects.objSelectPaymentMethod(), "Header");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objPayUsingOnlineBanking(), "Pay using Online Banking Option");
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlShopObjects.objPlaceOrderBtn(), "Place Order Button");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objCheckOutConfirmationMsg(), "Confirmation CheckOut Popup")) {
            LoggingUtils.info("MLS_TC_36, Shop Items Pay using Online Banking option selected and App Navigates to OTP Page is validated");
            ExtentReporter.logPass("MLS_TC_36", "MLS_TC_36, Shop Items Pay using Online Banking option selected and App Navigates to OTP Page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void shopItemsSubTotalAmountValidationBeforeSelectingItems_MLS_TC_59() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        if (mobileGeneralMethod.isVisible(mlShopObjects.objSubtotalAmount(), "SubTotal Amount")) {
            String sSubTotalAmount = mobileGeneralMethod.getText(mlShopObjects.objSubtotalAmount());
            String sExceptedSubTotalAmount = "P 0.00";
            mobileGeneralMethod.assertionValidation(sSubTotalAmount, sExceptedSubTotalAmount);
            LoggingUtils.info("MLS_TC_59, Shop Items SubTotal amount should be P 0.00 before Selecting Items is validated");
            ExtentReporter.logPass("MLS_TC_59", "MLS_TC_59, Shop Items SubTotal amount should be P 0.00 before Selecting Items is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void shopItemsSubTotalAmountValidationAfterSelectingItems_MLS_TC_59() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        navigationToCart();
        mobileGeneralMethod.tap(mlShopObjects.objCheckBox(), "Check Box");
    }

    public void shopItemsAddedItemInCartDeletedPopupValidationCancelButton_MLS_TC_129() throws Exception {
       login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(5000);
        navigationToCart();
        mobileGeneralMethod.tap(mlShopObjects.objCheckBox(), "Check Box");
        mobileGeneralMethod.tap(mlShopObjects.objDeleteIcon(), "objDeleteIcon");
        mobileGeneralMethod.tap(mlShopObjects.objDeleteCancelButton(), "objDeleteCancelButton");
        if (mobileGeneralMethod.isNotDisplayed(mlShopObjects.objProductNameInCartPage())) {
            LoggingUtils.info("MLS_TC_129, Cancel button in Confirmation modal validated");
            ExtentReporter.logPass("MLS_TC_129", "MLS_TC_129, Cancel button in Confirmation modal validated");
        } else {
            ExtentReporter.logFail("MLS_TC_129", "Delete Confirmation  modal should be displayed failed to validate");
        }
    }


    public void shopItemsClickYesButtonToRemoveItemsFromTheCart_MLS_TC_108() throws Exception {
        login.loginWalletBranchTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(mlShopObjects.objShoppingCartIcon(), "Shopping Cart Icon");
        mobileGeneralMethod.tap(mlShopObjects.objDeleteIcon(), "Button");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objDeleteConfirmation(), "Popup Confirmation")) {
            mobileGeneralMethod.tap(mlShopObjects.objDeleteYesButton(), "Button");
            if (mobileGeneralMethod.isNotDisplayed(mlShopObjects.objProductNameInCartPage())) {
                LoggingUtils.info("MLS_TC_108, Shop Items Click the 'Yes' button to remove Items from The Cart Validated");
                ExtentReporter.logPass("MLS_TC_108", "MLS_TC_108, Shop Items Click the 'Yes' button to remove Items from The Cart Validated");
                System.out.println("-----------------------------------------------------------");
            }

        }
    }

    public void shopItemsAddedItemInCartDeletedPopupValidationExitButton_MLS_TC_131() throws Exception {
       login.loginWalletBuyerTier();
        shopItemsNavigation();
        selectItemAndAddToCart();
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(5000);
        navigationToCart();
        mobileGeneralMethod.tap(mlShopObjects.objCheckBox(), "Check Box");
        mobileGeneralMethod.tap(mlShopObjects.objDeleteIcon(), "objDeleteIcon");
        mobileGeneralMethod.tap(mlShopObjects.objDeleteExitButton(), "objDeleteExitButton");
        if (mobileGeneralMethod.isVisible(mlShopObjects.objProductNameInCartPage(), "Item")) {
            LoggingUtils.info("MLS_TC_131, Exit button in Confirmation modal validated");
            ExtentReporter.logPass("MLS_TC_131", "MLS_TC_131, Exit button in Confirmation modal validated");
        } else {
            ExtentReporter.logFail("MLS_TC_131", "Exit Confirmation  modal should be displayed failed to validate");
        }
    }

}
