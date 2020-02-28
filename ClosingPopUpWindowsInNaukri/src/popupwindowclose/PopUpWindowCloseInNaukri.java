package popupwindowclose;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.javac.code.Type.ForAll;

public class PopUpWindowCloseInNaukri {
        public void windowhandle(WebDriver d,String s)
        {
        	Set<String>ids= d.getWindowHandles();
 	       
 		   for( String id : ids)
 	       {
 	    	 d.switchTo().window(id);
 	    	 String title=d.getTitle();
 	    	if(title.equals(s))
 	    	{
 	    		d.close();
 	    	}
 	       }

        }
	public static void main(String[] args) {
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://Naukri.com");
	      PopUpWindowCloseInNaukri obj=new PopUpWindowCloseInNaukri();
	      String s1="Croma";
	      String s2="Tech Mahindra";
	      obj.windowhandle(driver,s1);
	      obj.windowhandle(driver, s2);
	     	}

}
