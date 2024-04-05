package mlkpx.testSteps;

import org.mlkpx.pageObject.*;
import utilities.ReusableComponents.GeneralMethod;
import utilities.PropertyReader.propertyReader;

public abstract class Base_Steps extends GeneralMethod {
    Payout_PageObjects payoutPageObjects = new Payout_PageObjects();
    Kyc_PageObjects kycPageObjects = new Kyc_PageObjects();
    Home_PageObjects homePageObjects = new Home_PageObjects();
    Login_PageObjects loginPageObjects = new Login_PageObjects();
    Google_PageObjects googlePageObjects = new Google_PageObjects();
    SendOut_PageObjects sendOutPageObjects = new SendOut_PageObjects();
    SendOutCancellation_PageObjects sendOutCancellationPageObjects = new SendOutCancellation_PageObjects();
    SOReprinting_PageObjects soReprintingPageObjects = new SOReprinting_PageObjects();
    final String filepath = "src\\test\\java\\resources\\testData.properties";
    propertyReader propertyReader = new propertyReader(filepath);

}
