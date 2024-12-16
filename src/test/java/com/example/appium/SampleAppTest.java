package com.example.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Paths;

import static java.lang.System.getenv;

public class SampleAppTest {
    private AppiumDriverLocalService server;
    private AppiumDriver driver;

    @BeforeClass
    private void setUp() {
        String platform = getenv ( "APPIUM_DRIVER" );
        platform = platform == null ? "IOS" : platform.toUpperCase ();
        String path = System.getProperty ( "user.dir" );

        if (platform.equals ( "ANDROID" )) {
            var options = new UiAutomator2Options ().setPlatformName ( "Android" )
                .setDeviceName ( "emulator-5554" )
                .setApp ( Paths.get ( path ).resolve ( "ApiDemos-debug.apk" ).toString () );
            options.setCapability ( "appium:appActivity", ".view.TextFields" );

            server = AppiumDriverLocalService.buildService ( new AppiumServiceBuilder ().withCapabilities ( options )
                .withIPAddress ( "127.0.0.1" )
                .withAppiumJS ( new File ( "/usr/local/lib/node_modules/appium/build/lib/main.js" ) )
                .withArgument ( GeneralServerFlag.BASEPATH, "/wd/hub/" ).usingPort ( 4723 ) );
            server.start ();
            driver = new AndroidDriver ( server, options );

            ((InteractsWithApps) driver).activateApp ( "io.appium.android.apis" );
        } else {
            var options = new XCUITestOptions ().setPlatformName ( "iOS" )
                .setPlatformVersion ( "18.2" )
                .setAutomationName ( "XCuiTest" )
                .setDeviceName ( "iPhone 16 Pro" )
                .setApp ( Paths.get ( path ).resolve ( "TestApp.app.zip" ).toString () );

            server = AppiumDriverLocalService.buildService ( new AppiumServiceBuilder ().withCapabilities ( options )
                .withIPAddress ( "127.0.0.1" )
                .withAppiumJS ( new File ( "/usr/local/lib/node_modules/appium/build/lib/main.js" ) )
                .withArgument ( GeneralServerFlag.BASEPATH, "/wd/hub/" ).usingPort ( 4723 ) );
            server.start ();
            driver = new IOSDriver ( server, options );
        }
    }

    @Test
    public void textFieldTest() {
        // Initialise PageView and set "text" to its textField
        PageView view = new PageView ( driver );
        view.setTextField ( "test" );
        //  Assert that textField equals to "text"
        Assert.assertEquals ( view.getTextField (), "test", "Text field was not set" );
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit ();
        }
        if (server != null) {
            server.stop ();
        }
    }
}
