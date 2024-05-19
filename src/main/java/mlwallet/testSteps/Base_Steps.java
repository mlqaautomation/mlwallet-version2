package mlwallet.testSteps;

import org.apache.commons.math3.stat.inference.OneWayAnova;
import org.mlwallet.pageObject.*;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;
import utilities.ReusableComponents.MobileGeneralMethod;
import utilities.yamlReader.yamlReader;
import utilities.PropertyReader.propertyReader;

public class Base_Steps {
    public static String osName=System.getProperty("os.name").toLowerCase();
    MobileGeneralMethod mobileGeneralMethod = new MobileGeneralMethod();
    MLWallet_PageObjects mlWalletPageObjects = new MLWallet_PageObjects();
    KwartaPadalaObjects kwartaPadalaObjects = new KwartaPadalaObjects();
    GCashObjects gCashObjects = new GCashObjects();
    HomePageObject homePageObject = new HomePageObject();
    LoginObject loginObject = new LoginObject();
    HistoryObject historyObject = new HistoryObject();
    BuyEloadObject buyEloadObject = new BuyEloadObject();
    public static propertyReader prop;
    yamlReader yamlReader = new yamlReader();
    final String filepath = "src\\test\\java\\resources\\testData.properties";
    propertyReader propertyReader = new propertyReader(filepath);

    public final yamlReader reader = new yamlReader();
    public void propertyFileReader(){
        if(osName.contains("linux")){
            prop = new propertyReader("./properties/testdata.properties");
        }else{
            prop = new propertyReader(".\\properties\\testdata.properties");
        }
    }

}
