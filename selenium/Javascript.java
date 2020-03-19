package com.org.browsers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (3)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("return document.getElementById('email').setAttribute('value','ezhil')");
		Object ret=js.executeScript(" return document.getElementById('email').getAttribute('value')");
		System.out.println(ret);
		js.executeScript("document.getElementById('pass').setAttribute('value','123aa')");
		js.executeScript("document.getElementById('loginbutton').click()");
	}
}
