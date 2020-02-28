package popupwindowclose;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOnCroma {
  public void windowactions(WebDriver d,String s )
  {
	  Set <String> ids=d.getWindowHandles();
	  for(String id:ids)
	  {
		  d.switchTo().window(id);
		  String str=d.getTitle();
		  if(str.equals(s))
		  {  // d.manage().window().maximize();
		 WebElement ad=d.findElement(By.xpath(".//*[@alt='Croma']"));
		  ad.click();
		//Actions act=new Actions(d);
		//act.moveToElement(ad).perform();
			// act.contextClick(ad).perform();
		  }
	  }
	  
  }
	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.get("http:\\Naukri.com");
		String s1="Croma"
				+ ""
				+ "";
		 ClickOnCroma obj=new  ClickOnCroma();
		obj.windowactions(d,s1);

	}

}
