package jbkselinium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chromedriver", "chromeDriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("file:///D:/selinium%20setup/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		
		d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
		d.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
		d.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	}}
	


