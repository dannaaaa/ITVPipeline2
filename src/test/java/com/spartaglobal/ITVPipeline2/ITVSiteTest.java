package com.spartaglobal.ITVPipeline2;

import static org.junit.Assert.assertTrue;

import com.spartaglobal.ITVPipeline2.SeleniumConfig.SeleniumConfig;
import com.spartaglobal.ITVPipeline2.SeleniumConfig.SeleniumConfig;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ITVSiteTest {

    private static ITVSite itvSite;

    @BeforeClass
    public static void setup(){
        //Enter your own driver path and remember to change it before running tests
        SeleniumConfig chromeDriverConfig = new SeleniumConfig("chrome", "C:\\Users\\danaa\\Downloads\\chromedriver_win32\\\\chromedriver.exe");
        //C:\Users\danaa\Downloads\chromedriver_win32\\chromedriver.exe
        itvSite = new ITVSite(chromeDriverConfig.getDriver());

        itvSite.itvHomepage();
        itvSite.itvSignin();
        itvSite.itvSignin().inputUsername("test@test.com");
        itvSite.itvSignin().inputPassword("itvtest");
        itvSite.itvSignin().clickSubmitButton();
        itvSite.itvSignin().getUsernameAndPasswordErrorText();

    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
