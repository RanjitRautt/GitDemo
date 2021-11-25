package jbkselinium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex2 {
	public static void main(String[] args)
	{     System.setProperty("webdriver.chromedriver", "chromeDriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("file:///D:/selinium%20setup/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		
		d.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("kiran@gmail.com");
		d.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
		d.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		d.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
		d.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		

		d.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[1]/div/input")).sendKeys("ranjit");
		d.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[2]/div/input")).sendKeys("7895641235");
		d.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[3]/div/input")).sendKeys("ranjit12@gmail.com");
		d.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[4]/div/input")).sendKeys("javapython");
		d.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/input")).click();
		//WebElement we=d.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		
		// Select s= new Select(we);
		 Select s1= new Select(d.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select")));
		 s1.selectByValue("HP");//STATE HP(takla) SELECT KELA
		 d.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[7]/div/input")).sendKeys("1234567");
		 d.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/button")).submit();
		 d.switchTo().alert().accept();
		 
		 
		 
		 
		
		
		
	}
}
  




