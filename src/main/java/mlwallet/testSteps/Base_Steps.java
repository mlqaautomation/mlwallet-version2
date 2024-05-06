package mlwallet.testSteps;

import org.mlwallet.pageObject.Login_PageObjects;
import utilities.ReusableComponents.MobileGeneralMethod;
import utilities.yamlReader.yamlReader;
import utilities.Logger.LoggingUtils;
public class Base_Steps {
    MobileGeneralMethod mobileGeneralMethod = new MobileGeneralMethod();
    Login_PageObjects loginPageObjects = new Login_PageObjects();
    yamlReader yamlReader = new yamlReader();
}
