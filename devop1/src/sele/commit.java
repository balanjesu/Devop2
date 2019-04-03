package sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class commit {

	public static void main(String[] args) {
		int a=100;
		int b=100;
		int c=a+b;

		System.out.println(c);
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		 WebDriver driver = new FirefoxDriver();       
		 WebDriver driver1=new ChromeDriver();

		 driver.get("https://www.tutorialspoint.com/devops_tutorials.htm");
		 driver1.get("https://www.tutorialspoint.com/devops_tutorials.htm");

}}
