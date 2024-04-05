package mlkpx.testSteps;

import utilities.Logger.LoggingUtils;

public class SOReprinting_Steps extends Base_Steps{
    public void DS_TC_01()throws Exception{

            click(sendOutPageObjects.sendOutLink(), "SendOut Page ");
            if(isVisible(sendOutPageObjects.sendOutTransaction(), getText(sendOutPageObjects.sendOutTransaction()))){
                LoggingUtils.info("Successfully Navigate for SendOut Domestic Page ");
            }

    }

    public void SOR_TC_01()throws Exception{

        click(soReprintingPageObjects.soReprintingLink(), "SendOut Page ");
        if(isVisible(soReprintingPageObjects.soReprintText(), getText(soReprintingPageObjects.soReprintText()))){
            LoggingUtils.info("Successfully Navigate for SendOut Reprint Page ");
        }

        type(soReprintingPageObjects.kptnButtonInReprint(), "KPTN SOReprint field ", propertyReader.getproperty("kptn_SOReprint"));
        type(soReprintingPageObjects.reasonSOReprint(), "Reason SOReprint field ", propertyReader.getproperty("reason_SOReprint"));
        click(soReprintingPageObjects.reprintButton(), "Reprint Button");
    }
}
