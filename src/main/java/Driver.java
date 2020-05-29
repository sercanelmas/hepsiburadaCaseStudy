
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static P_Definitions.Definitions.*;
import static P_Definitions.Definitions.driverSettings;


public class Driver {
    @Before
    public void setUp() {
        driverSettings();
    }


    @Test
    public void hbHomePage() {
        navigateTo("http://automationpractice.com/");
    }


    @After
    public void endReport() {
        extent.flush();
        driver.quit();
    }
}
