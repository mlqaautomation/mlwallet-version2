package mlwallet.testSteps;

import org.mlwallet.pageObject.HomePageObject;
import org.mlwallet.pageObject.KwartaPadalaObjects;
import org.mlwallet.pageObject.MLWallet_PageObjects;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;
import utilities.ReusableComponents.MobileGeneralMethod;
import utilities.yamlReader.yamlReader;
import utilities.PropertyReader.propertyReader;

public class Base_Steps {
    public static String osName=System.getProperty("os.name").toLowerCase();
    static MobileGeneralMethod mobileGeneralMethod = new MobileGeneralMethod();
    MLWallet_PageObjects mlWalletPageObjects = new MLWallet_PageObjects();
    KwartaPadalaObjects kwartaPadalaObjects = new KwartaPadalaObjects();
    HomePageObject homePageObject = new HomePageObject();

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
