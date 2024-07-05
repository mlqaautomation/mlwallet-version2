package mlwallet.testSteps;

import org.apache.commons.math3.stat.inference.OneWayAnova;
import org.mlwallet.pageObject.*;
import org.openqa.selenium.By;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;
import utilities.ReusableComponents.MobileGeneralMethod;
import utilities.yamlReader.yamlReader;
import utilities.PropertyReader.propertyReader;

public class Base_Steps {
    public static String osName=System.getProperty("os.name").toLowerCase();
    MobileGeneralMethod mobileGeneralMethod = new MobileGeneralMethod();
    MLWallet_PageObjects mlWalletPageObjects = new MLWallet_PageObjects();
    ShopSafeObjects shopSafeObjects = new ShopSafeObjects();
    KwartaPadalaObjects kwartaPadalaObjects = new KwartaPadalaObjects();
    TopUpGamesObjects topUpGamesObjects = new TopUpGamesObjects();
    GCashObjects gCashObjects = new GCashObjects();
    HomePageObject homePageObject = new HomePageObject();
    LoginObject loginObject = new LoginObject();
    LogoutObject logoutObject = new LogoutObject();
    TroubleSignInObjects troubleSignInObjects = new TroubleSignInObjects();
    TierUpgradeObjects tierUpgradeObjects = new TierUpgradeObjects();
    SettingsObjects settingsObjects = new SettingsObjects();
    PayBillsObject payBillsObject = new PayBillsObject();
    HistoryObject historyObject = new HistoryObject();
    BuyEloadObject buyEloadObject = new BuyEloadObject();
    CashOutViaBranchObjects cashOutViaBranchObjects = new CashOutViaBranchObjects();
    CashInViaBranchObjects cashInViaBranchObjects = new CashInViaBranchObjects();
    RegistrationObjects registrationObjects = new RegistrationObjects();
    yamlReader yamlReader = new yamlReader();
    final String filepath = "src\\test\\java\\resources\\testData.properties";
    propertyReader propertyReader = new propertyReader(filepath);
    public final yamlReader reader = new yamlReader();
}
