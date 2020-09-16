package com.cedaniel200.eribank.pageobject.driver;

public class AppiumDriver {

    private static final String ANDROID = "Android";

    public static boolean isAndroid() {
        String plataforma = System.getProperty("appium.platformName");
        System.out.println("###"+plataforma+"$$$");
        return  ANDROID.equalsIgnoreCase(plataforma);
    }

}
