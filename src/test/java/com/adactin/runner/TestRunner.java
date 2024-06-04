package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@CucumberOptions(features =".//src//test//java//com//adactin//feature//Adactin.feature", 
glue = "com.adactin.stepdefinition",
plugin = {"json:Reports/Cucumber/Jsonreport.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class TestRunner {
	
	public static WebDriver driver;
	
@BeforeClass
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}

@AfterClass
	public static void broswerClose() {
		driver.close();
	}
}
