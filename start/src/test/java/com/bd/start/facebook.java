package com.bd.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class facebook extends BaseDriver {
	
	static String facebook="https://www.facebook.com/";
	
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		
		driver.get(facebook);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 1)
	public void facebookStart() throws InterruptedException {
		
		
		//sign up
		 driver.findElement(By.linkText("Create New Account")).click();;
		 Thread.sleep(4000);
		
		 
		 WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		 firstName.sendKeys("Mirajul");
		 
		 WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		 lastName.sendKeys("Islam");
		 Thread.sleep(1000);
		 
		 WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		 email.sendKeys("mirajulislam880@gmail.com");
		 Thread.sleep(3000);
		 
		 WebElement emailConfirm = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		 emailConfirm.sendKeys("mirajulislam880@gmail.com");
		 Thread.sleep(3000);
		 
		 WebElement passWord = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		 passWord.sendKeys("123456");
		 Thread.sleep(3000);
		 
		 WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		 Select daySelect = new Select(day);
		 daySelect.selectByValue("8");
		 
		 Thread.sleep(1000);
		 
		 WebElement selectMonth = driver.findElement(By.xpath("//select[@id='month']"));
		 Select monthSelect = new Select(selectMonth);
		 monthSelect.selectByIndex(7);
		 
		 
		 Thread.sleep(1000);
		 
		 
		 WebElement selectyear = driver.findElement(By.xpath("//select[@id='year']"));
		 Select yearSelect = new Select(selectyear);
		 yearSelect.selectByValue("1998");
		 Thread.sleep(3000);
		 
		 
		 driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		 
		 driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		 Thread.sleep(3000);
		 
		 
		 driver.navigate().back();
		 driver.navigate().refresh();
		 
		 Thread.sleep(5000);
		 
		 
	}
	}


