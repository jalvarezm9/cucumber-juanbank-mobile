package com.cedaniel200.eribank.pageobject.driver;

public class Platform {

    private static final String IOS = "iOS";

    public static boolean isIOS() {
        String plataforma = System.getProperty("appium.platformName");
        return  IOS.equalsIgnoreCase(plataforma);
    }

}
