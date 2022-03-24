package com.bus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RedBusTable {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\eclipse-workspace\\RedBus\\c driver\\chromedriver.exe");
		WebDriver p = new ChromeDriver();
		String l = ("https://www.redbus.in/bus-tickets");
		p.get(l);
	WebElement q =	p.findElement(By.xpath("//select[@class='D152_sourceDrop']"));
	Select s = new Select(q);
	s.selectByIndex(7);
	List<WebElement> a = s.getOptions();
	for(WebElement x :a) {
		System.out.println(x.getText());
	}
		
	WebElement m =	p.findElement(By.tagName("table"));
	List<WebElement> n =m.findElements(By.tagName("tr"));
	for(int i=0; i< n.size();i++)
	{
	WebElement k = n.get(i);
	List<WebElement> g = k.findElements(By.tagName("td"));
	for(int j=0; j< g.size(); j++) {
		WebElement d = g.get(j);
		String e =d.getText();
		System.out.println(e);
    	}
	}
		}

}
