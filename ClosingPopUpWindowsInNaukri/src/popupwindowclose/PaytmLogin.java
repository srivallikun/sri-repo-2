package popupwindowclose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PaytmLogin {

	public static void main(String[] args)throws Exception {
		WebDriver d=new FirefoxDriver();
		d.get("http://paytm.com");
		WebElement login=d.findElement(By.xpath(".//*[text()='Log In/Sign Up']"));
		login.click();
		Thread.sleep(
				10000);
		d.findElement(By.className("_3i6R")).click();

	}

}
