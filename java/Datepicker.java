package com.org.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Datepicker {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://webdriverselenium//chromedriver_win32 (3)/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//label[@for='onward_cal']")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[5]")).click();
		driver.findElement(By.xpath("//label[@for='return_cal']")).click();
		driver.findElement(By.xpath("//*[@id='rb-calendar_return_cal']/table/tbody/tr[6]/td[7]")).click();
		
	}

}
