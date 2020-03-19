package com.org.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://webdriverselenium//chromedriver_win32 (3)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		driver.switchTo().frame(0);
		WebElement findElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement findElement2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);
		//act.clickAndHold(findElement).dragAndDrop(findElement,findElement2 ).release(findElement).perform();
	     act.dragAndDrop(findElement, findElement2).build().perform();
	     
	}
}
