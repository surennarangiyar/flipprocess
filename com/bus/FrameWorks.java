package com.bus;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWorks {
   public static void main(String[]args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\eclipse-workspace\\RedBus\\c driver\\chromedriver.exe");
	WebDriver l = new ChromeDriver();
	String p = ("http://demo.automationtesting.in/Frames.html");
	       l.get(p);
	       l.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	   WebElement j = l.findElement(By.xpath("//div[@id='Multiple']/iframe"));
	   l.switchTo().frame(j);
	 WebElement t = l.findElement(By.xpath("//div[@class='row']/iframe"));
	       l.switchTo().frame(t);
	    WebElement d =   l.findElement(By.xpath("//input[@type='text']"));
	      d.sendKeys("suren1234");
	  TakesScreenshot g = (TakesScreenshot)l;
	File o =  g.getScreenshotAs(OutputType.FILE);
	File k = new File("C:\\Users\\navee\\eclipse-workspace\\RedBus\\c driver\\ss\\fip.png");
	FileUtils.copyFile(o, k);
	       
	}
}
