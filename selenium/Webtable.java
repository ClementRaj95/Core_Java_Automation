package com.org.browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriverselenium\\chromedriver_win32 (3)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		driver.findElement(By.xpath("//a[@data-cli_action='accept']")).click();
		List<WebElement> findElements = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < findElements.size(); i++) {
			System.out.println(findElements.get(i).getText());
			
		}
			
			}
		}
	