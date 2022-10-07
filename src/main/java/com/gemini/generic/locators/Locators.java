package com.gemini.generic.locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class Locators {


    public static By btn_menu = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]/android.widget.ImageView");
    public static By list_login = AppiumBy.accessibilityId("menu item log in");
    public static By list_logout = AppiumBy.accessibilityId("menu item log out");
    public static By list_catalog = AppiumBy.accessibilityId("menu item catalog");
    public static By list_webview = AppiumBy.accessibilityId("menu item webview");


    //    Login Page
    public static By input_username = AppiumBy.accessibilityId("Username input field");
    public static By input_password =AppiumBy.accessibilityId("Password input field");
    public static By btn_login = AppiumBy.accessibilityId("Login button");

    // Logout Page
    public static By btn_logoutConfirm = AppiumBy.id("android:id/button1");
    public static By btn_logoutConfirmMsg = AppiumBy.id("android:id/alertTitle");
    public static By btn_logoutClose = AppiumBy.id("android:id/button1");
    public static By label_productTitle = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView");
}
