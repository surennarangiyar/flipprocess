package com.bus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\eclipse-workspace\\RedBus\\c driver\\chromedriver.exe");
	WebDriver r = new ChromeDriver();
	String p = ("http://demo.automationtesting.in/Alerts.html");
	r.get(p);
	WebElement l =r.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	l.click();
	WebElement g = r.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	g.click();
Alert h =	r.switchTo().alert();
    h.accept();
	}

}
