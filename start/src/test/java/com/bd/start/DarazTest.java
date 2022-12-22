package com.bd.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DarazTest extends BaseDriver {
	
	static String daraz = "https://www.daraz.com.bd/";
	
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		
		driver.get(daraz);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	
	@Test(priority = 1)
	public void darazTest() throws InterruptedException {
		//hover
		Actions action = new Actions(driver);
		
		SoftAssert softAssert = new SoftAssert();
		
		WebElement electronic = driver.findElement(By.xpath("//span[contains(text(),'Electronic Devices')]"));
		action.moveToElement(electronic).perform();
		Thread.sleep(1000);
		
		
		WebElement latest = driver.findElement(By.xpath("//span[contains(text(),'Latest Mobile Accessories')]"));
		action.moveToElement(latest).perform();
		Thread.sleep(1000);
		
		WebElement cable = driver.findElement(By.xpath("//span[contains(text(),'Cable & Converter')]"));
		cable.click();
		Thread.sleep(1000);
		
		
		
		WebElement categories = driver.findElement(By.xpath("//span[contains(text(),'Categories')]"));
		action.moveToElement(categories).perform();
		Thread.sleep(1000);
		
		WebElement mensFashion = driver.findElement(By.linkText("Men's Fashion"));
		action.moveToElement(mensFashion).perform();
		Thread.sleep(1000);
		
		WebElement clothing = driver.findElement(By.linkText("Clothing"));
		action.moveToElement(clothing).perform();
		Thread.sleep(1000);
		
		WebElement tShirt = driver.findElement(By.xpath("//span[contains(text(),'T-Shirts')]"));
		tShirt.click();
		Thread.sleep(1000);
		
		WebElement fabClick = driver.findElement(By.xpath("//span[contains(text(),'Fabrilife')]"));
		fabClick.click();
		
		WebElement lebasClick = driver.findElement(By.xpath("//span[contains(text(),'LEEBAS')]"));
		lebasClick.click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		WebElement blackShirt = driver.findElement(By.xpath("//a[contains(text(),'Premium Black T-shirt - Black')]"));
		
		String shirt = blackShirt.getText();
		
		if (shirt.contains("Premium Black T-shirt - Black")) {
			
			System.out.println("Passed "+shirt);
			
		}else {
			System.out.println("Failed ");
		}
		
		WebElement bShirt = driver.findElement(By.xpath("//a[contains(text(),\"Men's Premium Blank T-shirt - Maroon - T Shirt For\")]"));
		
		String blackShirtText = bShirt.getText();
		
		softAssert.assertEquals(blackShirtText, "Men's Premium Blank T-shirt - Maroon - T Shirt For Man");
		
		
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		//search
		
		WebElement searchField = driver.findElement(By.xpath("//input[@id='q']"));
		searchField.sendKeys("iphone 12");
		
		driver.findElement(By.xpath("//button[contains(text(),'SEARCH')]")).click();
		
		
		//iphn14
		WebElement iphn14 = driver.findElement(By.xpath("//a[contains(text(),'iPhone 14 pro max 256 GB (HK) Active')]"));
		
		String  iphn14Text = iphn14.getText();
		iphn14.click();
		
		//add item
		driver.findElement(By.xpath("//i[@class='next-icon next-icon-add next-icon-medium']")).click();
		driver.findElement(By.xpath("//i[@class='next-icon next-icon-add next-icon-medium']")).click();
		Thread.sleep(2000);
		
		//decreseItem
		driver.findElement(By.xpath("//i[@class='next-icon next-icon-minus next-icon-medium']")).click();
		Thread.sleep(1000);
		
		
		//buy now
		driver.findElement(By.xpath("//span[contains(text(),'Buy Now')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//i[@class='next-icon next-icon-close next-icon-small']")).click();
		Thread.sleep(1000);
		
		//home
		driver.findElement(By.xpath("//a[@data-spm='dhome']")).click();
		
		
		
		
		
		if (iphn14Text.contains("iPhone 14 pro max 256 GB (HK) Active")) {
			System.out.println("Passed ");
		}else {
			System.out.println("Failed. Not Matching");
		}
		
		
		
//		WebElement dropDown = driver.findElement(By.xpath(""));
		
		
		
		softAssert.assertAll();
		
	}

}
